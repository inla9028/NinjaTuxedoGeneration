/*
 * SP_Business_Logic.java
 *
 * Created on June 30, 2000, 7:17 AM
 */

package no.netcom.sp.ejb;

import no.netcom.interfaceDset.SubscriptionTypesIDS;
import no.netcom.ninja.core.NinjaDTOValidationException;
import no.netcom.ninja.core.ban.Ban;
import no.netcom.ninja.core.ban.BanAccess;
import no.netcom.ninja.core.ban.BanFactory;
import no.netcom.ninja.core.ban.exception.BanException;
import no.netcom.ninja.core.ban.exception.BanNotFoundException;
import no.netcom.ninja.core.dealer.Dealer;
import no.netcom.ninja.core.dealer.exception.DealerException;
import no.netcom.ninja.core.dealer.exception.IllegalDealerException;
import no.netcom.ninja.core.dealer.exception.IllegalSalesAgentException;
import no.netcom.ninja.core.equipment.SIMCard;
import no.netcom.ninja.core.equipment.exception.IllegalEquipmentException;
import no.netcom.ninja.core.equipment.exception.EquipmentSystemException;
import no.netcom.ninja.core.equipment.dto.EquipmentDTO;
import no.netcom.ninja.core.equipment.dto.SIMCardDTO;
import no.netcom.ninja.core.equipment.dto.SIMCardListDTO;
import no.netcom.ninja.core.exception.NinjaException;
import no.netcom.ninja.core.inventory.CTN;
import no.netcom.ninja.core.inventory.CTNFactory;
import no.netcom.ninja.core.inventory.Msisdn;
import no.netcom.ninja.core.inventory.exception.IllegalCTNException;
import no.netcom.ninja.core.inventory.exception.IllegalCTNSyntaxException;
import no.netcom.ninja.core.memo.Memo;
import no.netcom.ninja.core.memo.MemoList;
import no.netcom.ninja.core.memo.exception.MemoException;
import no.netcom.ninja.core.nameaddress.dto.PrivateNameDTO;
import no.netcom.ninja.core.nameaddress.dto.RegularAddressDTO;
import no.netcom.ninja.core.nameaddress.dto.SubscriptionCustomerDTO;
import no.netcom.ninja.core.network.ServiceProviderNetwork;
import no.netcom.ninja.core.network.numberportability.dto.*;
import no.netcom.ninja.core.network.numberportability.NinjaTimePorter;
import no.netcom.ninja.core.referencetables.NinjaConfigurationReferenceTable;
import no.netcom.ninja.core.referencetables.ServiceProvidersReferenceTable;
import no.netcom.ninja.core.service.Campaign;
import no.netcom.ninja.core.service.FeatureParameter;
import no.netcom.ninja.core.service.Soc;
import no.netcom.ninja.core.service.dto.*;
import no.netcom.ninja.core.subscription.EquipmentManager;
import no.netcom.ninja.core.subscription.Subscription;
import no.netcom.ninja.core.subscription.SubscriptionFactory;
import no.netcom.ninja.core.subscription.dto.*;
import no.netcom.ninja.core.subscription.exception.SubscriptionException;
import no.netcom.ninja.core.system.ExecutionTimes;
//GLL: all of this SQL is a bit naughty, to say the least:
import no.netcom.ninja.core.system.sql.KontantDataSource;
import no.netcom.ninja.core.system.sql.NinjaDataSource;
import no.netcom.ninja.core.system.sql.SQLConnection;
import no.netcom.ninja.core.system.sql.SQLResultSet;
import no.netcom.ninja.core.system.sql.exception.DataSourceException;
import no.netcom.ninja.core.system.sql.exception.NamingException;
import no.netcom.ninja.core.system.sql.exception.NinjaSQLException;
//... and so is this Tuxedo:
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.exception.TuxedoException;
import no.netcom.ninja.core.util.*;
import no.netcom.ninja.core.util.businessrules.NinjaBusinessRules;
import no.netcom.ninja.core.util.businessrules.exception.ChannelException;
import no.netcom.ninja.core.util.businessrules.referencetables.SPServicesMappingReferenceTable;
import no.netcom.ninja.core.util.ninjafokussuplementary.ServiceProvidersHelper;
import no.netcom.ninja.core.util.referencetables.ReferenceTables;
import no.netcom.ninja.core.util.referencetables.exception.NinjaReferenceTableException;
import no.netcom.sp.dataset.*;
import no.netcom.tuxwrap.exception.ClientException;
import no.netcom.tuxwrap.exception.ExceptionHelper;
import org.apache.log4j.Logger;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.*;

/**
 * @author Ninja Team - Ninja.Support@netcom-gsm.no
 * @version 9.0.2
 */
public class SP_Business_Logic {

    private final static Logger log = Logger.getLogger(SP_Business_Logic.class);

    private final static String CTN_LEAD_DIGITS = "047";

    //ToDo: get rid of as many of these as you can. All if possible. Move to methods, parameters, or other objects.
    //ToDo: almost all of them come from the
    private User user = null;
    private String sUser = null;
    private Integer nManId = null;
    private Integer nActBanId = null;
    private Integer nMaxSubs = null;
    private String sDlrCode = null;
    private String sNlCode = null;
    private String sSPshort = "";
    private String sLanguage = null;
    private String sAccSubType = null;
    private String sOperatorCode = null;
    private String sLast_Business_Name = null;
    private String sFirst_Name = null;
    private String sAdr_Country = null;
    private String sAdr_Zip = null;
    private String sAdr_Street_Name = null;
    private String sAdr_City = null;
    private String sAdr_House_Letter = null;
    private String sAdr_House_No = null;
    private String sAdr_Door_No = null;
    private String sAdr_Story = null;
    private String sAdr_Email = null;
    private String sPhyHLRCode = null;
    private Subscription sub = null;
    private Ban ban = null;
    //private Integer minNoOfActivationBans = null;

    private static final String MMS_FEATURE_CODE = "S-MMS2";

    //..Variable used to determine that the process is a PP Change for You prepaid to You Postpaid..
    //  special case to handle the YOU Prepaids that were taken over by NetCom.
    private boolean youPPChange = false;

    /**
     * Creates new IF_SP_Business_Logic
     */
    public SP_Business_Logic(String sUser) throws ClientException {

        try {
            //ToDo: BUG? Why does it do two different versions of this?
            this.user = new User(sUser);
            this.sUser = this.user.getNinjaUser();
        } catch (NinjaException e) {
            //ToDo: BUG? Why does it suppress the error? At add context to the log entry and search in the log!!
            log.error(e, e);
        }

        initializeFromServiceProviderReferenceTable();

        try {
            this.user.setDealer(this.sDlrCode);
            this.user.setSalesAgent("A");
        } catch (IllegalDealerException e) {
            ExceptionHelper.throwClientException(ExceptionHelper.SYSTYPE, ExceptionHelper.SYS000008, "Could not get information for service provider: '" + this.sUser + "'");
        } catch (IllegalSalesAgentException e) {
            ExceptionHelper.throwClientException(ExceptionHelper.SYSTYPE, ExceptionHelper.SYS000008, "Could not get information for service provider: '" + this.sUser + "'");
        }

        if (log.isDebugEnabled()) {
            log.debug("SP Details from DB = " + this.toString());
        }

    }


    //GLL 10/01/2007: was public, now private. Also renamed (was initializeServiceProvider()).
    //ToDo: remove method altogether and just get each data item from the ref table object when you need it (ie make it a local variable)
    //ToDo: HOWEVER this does have the advantage that it checks nulls - so change this to a "check SP ref data" method??
    private void initializeFromServiceProviderReferenceTable() throws ClientException {
        if (log.isDebugEnabled()) {
            log.debug("initializeFromServiceProviderReferenceTable()...");
        }

        //GLL 10/01/2007: refactored - removed the instance variable (turned it into the following local variable):
        ServiceProvidersReferenceTable.ServiceProvider spDetails = ServiceProvidersReferenceTable.getServiceProvider(this.sUser);

        //..Retrieve the Details okay so we'll apply them..
        this.nManId = spDetails.getRootBan();
        if (this.nManId == null) {
            ExceptionHelper.throwClientException(ExceptionHelper.SYSTYPE, ExceptionHelper.SYS000008, "Could not get information for service provider: '" + this.sUser + "'");
        }
        this.nActBanId = spDetails.getCurrentActiveBan();
        if (this.nActBanId == null) {
            ExceptionHelper.throwClientException(ExceptionHelper.SYSTYPE, ExceptionHelper.SYS000008, "Could not get information for service provider: '" + this.sUser + "'");
        }
        this.nMaxSubs = spDetails.getMaxSubscriptions();
        this.sDlrCode = spDetails.getDealerCode();
        if (this.sDlrCode == null) {
            ExceptionHelper.throwClientException(ExceptionHelper.SYSTYPE, ExceptionHelper.SYS000008, "Could not get information for service provider: '" + this.sUser + "'");
        }

        this.sNlCode = spDetails.getNlCode();
        if (this.sNlCode == null) {
            ExceptionHelper.throwClientException(ExceptionHelper.SYSTYPE, ExceptionHelper.SYS000008, "Could not get information for service provider: '" + this.sUser + "'");
        }

        this.sSPshort = spDetails.getShortName();
        if (this.sSPshort == null) {
            ExceptionHelper.throwClientException(ExceptionHelper.SYSTYPE, ExceptionHelper.SYS000008, "Could not get information for service provider: '" + this.sUser + "'");
        }

        this.sLanguage = spDetails.getLanguageCode();
        if (this.sLanguage == null) {
            this.sLanguage = "NO";
        }

        this.sAccSubType = spDetails.getBanSubType();
        if (this.sAccSubType == null) {
            ExceptionHelper.throwClientException(ExceptionHelper.SYSTYPE, ExceptionHelper.SYS000008, "Could not get information for service provider: '" + this.sUser + "'");
        }

        this.sOperatorCode = spDetails.getOperatorCode();
        if (this.sOperatorCode == null) {
            ExceptionHelper.throwClientException(ExceptionHelper.SYSTYPE, ExceptionHelper.SYS000008, "Could not get information for service provider: '" + this.sUser + "'");
        }

        this.sLast_Business_Name = spDetails.getLastBusinessName();
        this.sFirst_Name = spDetails.getFirstName();
        this.sAdr_Country = spDetails.getAdrCountry();
        this.sAdr_Zip = spDetails.getAdrZip();
        this.sAdr_Street_Name = spDetails.getAdrStreetName();
        this.sAdr_City = spDetails.getAdrCity();
        this.sAdr_House_Letter = spDetails.getAdrHouseLetter();
        this.sAdr_House_No = spDetails.getAdrHouseNo();
        this.sAdr_Door_No = spDetails.getAdrDoorNo();
        this.sAdr_Story = spDetails.getAdrStory();
        this.sAdr_Email = spDetails.getAdrEmail();
        this.sPhyHLRCode = spDetails.getPhysicalHlrCd();
        //this.minNoOfActivationBans = spDetails.getMinNoOfActivationBans();

    } // initializeFromServiceProviderReferenceTable


    //GLL (29/05/2007): extracted method
    private Integer getActivationBanAndSetInstanceVariableToIt(User spUser, String spDealerCode)
            throws NinjaReferenceTableException, ChannelException, NinjaSQLException, UserException, BanException,
                   TuxedoException, FokusDatesException, IllegalDealerException, IllegalSalesAgentException {

        ServiceProvidersHelper spHelper = new ServiceProvidersHelper(spUser.getNinjaUser());

        Integer nBan = spHelper.getActivationBan();

        Ban ban = (Ban) BanFactory.getExistingBan(nBan, spUser);

        //ToDo (GLL 29/05/2007): is this necessary? Is there a getExistingBan() that can do all of this in one go?
        //                       (Actually I'm not sure it's necessary there OR here. Try looking at the new User constructors too.)
        ban.getUser().setDealer(spDealerCode);
        ban.getUser().setSalesAgent("A");

        //Was in the "create new ban section" - surely unneccessary
        //this.ban.synchronize(); // Ban update stamp could change meanwhile ...

        this.ban = ban;

        return nBan;
    }


    //ToDo (GLL 18/01/2007): Gradually replace all code that gets existing ban/sub with a call to this.
    //ToDo (GLL 18/01/2007): you can get the ban from the sub so (when full refactoring done) just return sub?
    private void getBanAndSubscriptionAndSetInstanceVariablesToThem(String msisdn, User spUser, String spDealerCode) throws ClientException {

        //ToDo: either move the checks that the a) the input IDS is not null and b) it contains a ctn to here, or to wrapper method.

        this.ban = null;
        this.sub = null;

        try {
            Ban ban = (Ban) BanFactory.getExistingBan(msisdn, spUser);

            //ToDo (GLL 18/01/2007): is this necessary? Is there a getExistingBan() that can do all of this in one go?
            //                       (Actually I'm not sure it's necessary there OR here. Try looking at the new User constructors too.)
            ban.getUser().setDealer(spDealerCode);
            ban.getUser().setSalesAgent("A");

            Subscription sub = ban.getSubscription(msisdn, false);

            //..Is this Sub for this service Provider??
            //verifyDealerForSubscription(sub);
            verifySubscriptionForSP(sub, this.sLast_Business_Name, spDealerCode, this.sAccSubType);

            //Everything ok? Then set instance variables for ban and sub:
            this.ban = ban;
            this.sub = sub;

        } catch (NinjaException e) {
            ExceptionHelper.throwClientException(e);
        }

    } //end getBanAndSubscriptionAndSetInstanceVariablesToThem()


    /**
     * Add a new subscription.
     *
     * @param in_dset The input dataset.
     * @return A DataSet containing information about the newly added subscription.
     * @throws ClientException All exceptions are mapped to a ClientException
     * @see SP_input_IDS
     */
    public SP_output_IDS addNewSubscription(SP_input_IDS in_dset) throws ClientException {

        if (log.isDebugEnabled()) { log.debug("Entering SP_Business_Logic.addNewSubscription - " + in_dset); }

        long nStartTime = System.currentTimeMillis();

        checkSpInputIdsNotNull(in_dset);

        this.ban = null;
        this.sub = null;

        //..simple validation of the input datset
        String sSubCtn = (String) in_dset.getValue(SP_input_IDS.SUB_NO, null);
        if (sSubCtn == null) {
            ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field SUB_NO - is empty or non-existent");
        }
        //..Simple validity check to save time..
        try {
            if (CTN.validateNumberSyntax(sSubCtn) != CTN.NUMBER_IS_OK) {
                ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field SUB_NO - " + sSubCtn);
            }
        } catch (IllegalCTNSyntaxException e) {
            ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field SUB_NO - " + sSubCtn + " : Caused by :" + e.getMessage());
        }

        //GLL (21/02/2007): extracted method - deal with You special case, if appropiate:
        SP_output_IDS youSpOutputIds = addNewYouSubscription(in_dset, sSubCtn);
        if (youSpOutputIds != null) { return youSpOutputIds; }


        //ToDo (GLL): releaseSimForReuse validate if SP owns the SIM too. Should we do that (or put it in the validateSimNumber())??
        //ToDo (GLL): note that there's multi-sim stuff further down
        String sSimNr = (String) in_dset.getValue(SP_input_IDS.SIM_NO, null);
        validateSimNumber(sSimNr);


        String sPP = (String) in_dset.getValue(SP_input_IDS.PRICE_PLAN, null);
        if (sPP == null) {
            ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field PRICE_PLAN - Empty");
        }

        //..Create the Subscription Customer object as a Role Indicator.
        String roleName = this.sFirst_Name + " - " + this.sLast_Business_Name;
        SubscriptionCustomerDTO subscriberCust = null;
        try {
            subscriberCust = new SubscriptionCustomerDTO(roleName);
        } catch (NinjaDTOValidationException e) {
            ExceptionHelper.throwClientException(e);
        }


        String channelCode = null;
        try {
            channelCode = this.user.getChannel().getChannelCode();
        } catch (ChannelException e) {
            log.error("No SP Channel Code", e);
            ExceptionHelper.throwClientException(ExceptionHelper.SYSTYPE, ExceptionHelper.SYS000008, "Could not get information for service provider: '" + this.sUser + "'");
        }

        //GLL (21/02/2007): extracted method - called from 2 places!!
        SubscriptionTypeDTO subscriptionTypeDTO = getPriceplanBelongingToSP(channelCode, sPP);

        //..Create a SocsDTO to pass in...
        SocsDTO socsDTO = null;
        try {
            socsDTO = NinjaBusinessRules.getAvailableSocs(channelCode, subscriptionTypeDTO.getSubscriptionTypeId(), this.sDlrCode, "A", null, null);
        } catch (NinjaException e) {
            ExceptionHelper.throwClientException(ExceptionHelper.PEETYPE, ExceptionHelper.PEE000000, "Error Encountered with Configuration DataBase.");
        }

        if (log.isDebugEnabled()) { log.debug("SocsIDS Prior to setting Defaults - " + socsDTO); }

        //Set up the services (socs) specified in the user input, by modifying the SocsDTO:
        setupRegularServices(in_dset, socsDTO);

        if (log.isDebugEnabled()) { log.debug("After setupRegularServices - " + socsDTO.toString()); }

        // mwe : 27-12-2004 : MultiSim Project : Create simcard list using simcard number
        //ToDo (GLL 22/02/2007): there's primary sim validation higher up. Why are we not validating these like we do the primary??
        SIMCardListDTO simCardList = SIMCardListDTO.instansiateSIMCardListWithPrimaryNumber(sSimNr);
        int nNoofSims = in_dset.getCount(SP_input_IDS.ADDITIONAL_SIM_NOS);
        for (int i = 0; i < nNoofSims; i++) {
            String tmpSimNo = (String) in_dset.getValue(SP_input_IDS.ADDITIONAL_SIM_NOS, i, null);
            if (log.isDebugEnabled()) { log.debug("Additonal sim [" + i + "] = '" + tmpSimNo + "'"); }
            simCardList.addNewSimCard(tmpSimNo, false);
        }


        //.. create CreateSubscriptionDTO & ActivateSubscriptionDTO..
        CreateSubscriptionDTO createSubscriptionDTO = null;
        ActivateSubscriptionDTO activateSubscriptionDTO = null;

        try {
            createSubscriptionDTO = new CreateSubscriptionDTO(Campaign.CODE_NONE,
                    false,
                    Msisdn.PRODUCT_TYPE,
                    sSubCtn,
                    "A",
                    this.sDlrCode,
                    "A",
                    "N",
                    null, // handset
                    simCardList,
                    socsDTO,
                    subscriberCust,
                    null, null);

            activateSubscriptionDTO = new ActivateSubscriptionDTO(Campaign.CODE_NONE,
                    false,
                    socsDTO);

        } catch (NinjaDTOValidationException e) {
            ExceptionHelper.throwClientException(e);
        }


        SP_output_IDS spOut = null;
        //..check if this is a porting request.
        String sPortInd = (String) in_dset.getValue(SP_input_IDS.NP_PORT_IND, null);
        //boolean bNumberPorting = (sPortInd != null && sPortInd.equals("Y"));
        if ("Y".equals(sPortInd)) {
            //GLL 22/02/2007: extracted method:
            spOut = createPortIn(in_dset, createSubscriptionDTO, activateSubscriptionDTO);
            this.writeLogInfo("addNewSubscription", nStartTime, System.currentTimeMillis(), in_dset, spOut);
            return spOut;
        } //end of Number Portability (port in) section


        //  else {
            //Create regular subscription
            Integer nBan = null;
            if (createSubscriptionDTO != null) {
                try {
                    // try to get available activation ban. We will not try to use current activation ban from the table. //ToDo (GLL): but that's exactly what it is doing isn't it?
                    nBan = this.getActivationBanAndSetInstanceVariableToIt(this.user, this.sDlrCode);
                    //GLL 10/01/20007: refactoring - replaced "new" with factory method call:
                    //this.sub = new Subscription(ban, createSubscriptionDTO);
                    this.sub = SubscriptionFactory.createNewReservedSubscription(ban, createSubscriptionDTO);
                    //..attempt activation of the newly created subscription
                    try {
                        this.ban.synchronize();
                        /*  This was a bodge for testing. Requires a change in ServiceManagerSubscription too:
                        if (!this.ban.isInTreeNextCycle()){
                            this.ban.getUser().setValidation(false);
                        } */
                        this.sub.activate(activateSubscriptionDTO);

                    } catch (NinjaException ne) {
                        log.error("SP_Business_Logic exception activating subscription.", ne);
                        releaseReservedSubscription(); //method extracted 22/02/2007
                        ExceptionHelper.throwClientException(ne);
                    }

                    //..now we check if the subscription is Active. If not then we release the reserved subscription.
                    this.sub.synchronize();
                    String sActStat = this.sub.getStatus();
                    if (sActStat == null || !sActStat.equals("A")) {
                        log.debug("SP_Business_Logic Sub Status = " + sActStat + " - releasing Sub.");
                        releaseReservedSubscription(); //method extracted 22/02/2007
                        ExceptionHelper.throwClientException(ExceptionHelper.PEETYPE, ExceptionHelper.PEE000014, "Phone - " + sSubCtn);
                    }
                } catch (NinjaException e) {
                    ExceptionHelper.throwClientException(e);
                } finally {
                    //Must release the ban for reuse. Message now handled by the release method though:
                    try {
                        if (nBan != null) {
                            ServiceProvidersHelper.releaseBanForUse(nBan);
                        }
                    } catch (NinjaException en) {
                        log.error("Failed to release activation ban " + this.ban.getNumber() + " for use due to " + en);
                    }
                }
            }

            //..If we are down here, then either there's an active sub or a future activation sub..
            //ToDo (GLL 22/02/2007): That's not true is it? You could have just released a reserved sub...
            //                       (plus the future thing is a reference to port ins)
            spOut = populateSPOutputIDSFromSubDetails(this.sub);

        //} //end regular (ie not port in)

        //Write the execution times no matter what route (eg NP) we took to get here:
        this.writeLogInfo("addNewSubscription", nStartTime, System.currentTimeMillis(), in_dset, spOut);

        return spOut;

    }


    //Extracted from all public methods that take an SP_input_IDS argument (22/02/2007) for 10.0.3:
    private void checkSpInputIdsNotNull(SP_input_IDS in_dset) throws ClientException {

        if (in_dset == null) { //IPE000034
            //ExceptionHelper.throwClientException(ExceptionHelper.MPETYPE, ExceptionHelper.MPE000006, "SP_input_IDS is null");
            ExceptionHelper.throwClientException(ExceptionHelper.MPETYPE, ExceptionHelper.IPE000034, "SP_input_IDS is null");
        }

    } //end checkSpInputIdsNotNull()


    //ToDo (GLL 22/02/2007): Move this to the SIMCard class!?!?!
    //Method extracted from addNewSubscription() by GLL on 22/02/2007 for 10.0.3
    private void validateSimNumber(String sSimNr) throws ClientException {
        if (sSimNr == null) {
            ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field SIM_NO - is empty or non-existent");
        }
        if (sSimNr.length() != 20) {
            ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field SIM_NO - " + sSimNr);
        }
        if (!sSimNr.startsWith("0894708")) {
            ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field SIM_NO - " + sSimNr);
        }
    } //End validateSimNumber()


    /**
     * Used when the reserve has succeeded, but the activation has failed.
     *
     * @throws ClientException
     */
    //Method extracted from addNewSubscription() by GLL on 22/02/2007 for 10.0.3
    private void releaseReservedSubscription() throws ClientException {
        try {
            this.ban.synchronize(); //GLL: necessary?
            this.ban.getUser().setDealer(this.sDlrCode);
            this.ban.getUser().setSalesAgent("A");
            this.sub.release();
        } catch (NinjaException rne) {
            ExceptionHelper.throwClientException(rne);
        }
    } //end releaseReservedSubscription()


    //Method extracted from addNewSubscription() by GLL on 22/02/2007 for 10.0.3
    private SP_output_IDS createPortIn(SP_input_IDS in_dset,
                                       CreateSubscriptionDTO createSubscriptionDTO,
                                       ActivateSubscriptionDTO activateSubscriptionDTO) throws ClientException {
        //Note: createSubscriptionDTO and activateSubscriptionDTO are never used in this method per se - they are just
        //      passed to the ImportSubscriptionDTO constructor, and then that object is passed to serviceProviderNetwork.importSubscription().

        String sSubCtn = (String) in_dset.getValue(SP_input_IDS.SUB_NO, null);
        String sSimNr = (String) in_dset.getValue(SP_input_IDS.SIM_NO, null);

        ServiceProviderNetwork serviceProviderNetwork = new ServiceProviderNetwork(this.user, this.sOperatorCode);

        String sNPdonor = (String) in_dset.getValue(SP_input_IDS.NP_DONOR, null);

        String sNPrangeholder = sNPdonor;
        String sNPrecipientCode = this.sOperatorCode;
        String sNPrefNo = (String) in_dset.getValue(SP_input_IDS.NP_REF_NO, null);

        Date port_date_time = null;
        try {
            port_date_time = TypeConverter.stringToDate((String) in_dset.getValue(SP_input_IDS.NP_PORT_DATE_TIME, null), TypeConverter.DATE_FORMAT_COMPLEX);
        } catch (FokusDatesException e) {
            ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field NP_PORT_DATE_TIME - contains an illegal date/time string");
        }

        int noOfAdditionalNOS = 0;
        List additionalNumbers = new ArrayList();
        noOfAdditionalNOS = in_dset.getCount(SP_input_IDS.NP_ADDITIONAL_NOS);

        for (int i = 0; i < noOfAdditionalNOS; i++) {
            additionalNumbers.add(in_dset.getValue(SP_input_IDS.NP_ADDITIONAL_NOS, i, null));
        }

        // try to get available activation ban. We will not try to use current activation ban from the table. //ToDo (GLL): but that's exactly what it is doing isn't it?
        Integer nBan = null;
        try {
            nBan = this.getActivationBanAndSetInstanceVariableToIt(this.user, this.sDlrCode);

            ImportSubscriptionDTO importSubscriptionDTO;
            NumberImportDTO importDetails = new NumberImportDTO(this.user.getChannel().getChannelCode(), sNPdonor, sNPrangeholder, null, null, port_date_time, sSubCtn, sNPrefNo, additionalNumbers, sSimNr);
            importDetails.setRecipient(sNPrecipientCode);
            importSubscriptionDTO = new ImportSubscriptionDTO(importDetails,
                    this.ban,
                    this.ban.getNumber(),
                    null,
                    createSubscriptionDTO,
                    activateSubscriptionDTO);
            importSubscriptionDTO.setUserText("Change by Ninja for SP Porting Request ref - " + sNPrefNo);

            this.sub = serviceProviderNetwork.importSubscription(importSubscriptionDTO);
        } catch (NinjaException e) {
            ExceptionHelper.throwClientException(e);
        } finally {
            //Must release the ban for reuse. Message now handled by the release method though:
            try {
                if (nBan != null) {
                    ServiceProvidersHelper.releaseBanForUse(nBan);
                }
            } catch (NinjaException en) { //ToDo (GLL - 29/05/2007): this suppresses the exception (but logs so look there!!)
                log.error("Failed to release activation ban " + this.ban.getNumber() + " for use due to " + en);
            }
        }

        SP_output_IDS spOut = new SP_output_IDS();
        //..if we have a MOVE np then don't return new subscription because it hasn't been moved yet..
        if (this.sub == null) {
            spOut.setValue("RESULT", "Request Stored Succesfully for future Processing");
            spOut.setValue(SP_output_IDS.SUB_STATUS, "P");
            spOut.setValue(SP_output_IDS.SUB_CTN, sSubCtn);
        } else {
            //..If we are down here, then either there's an active sub or a future activation sub..
            spOut = populateSPOutputIDSFromSubDetails(this.sub);
        }

        return spOut;
    } //end createPortIn()

    private SubscriptionTypeDTO getPriceplanBelongingToSP(String channelCode, String sPP) throws ClientException {

        List subscriptionTypeDTOs = null;

        try {
            subscriptionTypeDTOs = NinjaBusinessRules.getNewActivationSubscriptionTypeDTOs(channelCode,
                    Ban.AGREEMENT_TYPE_SERVICE_PROVIDER,
                    Ban.BAN_TREE_IND_YES, //ToDo (GLL 21/02/2007): should be set to a method on the SP reference data class!!
                    Ban.ACCOUNT_TYPE_SP,
                    this.sAccSubType,
                    null,
                    this.sLanguage,
                    this.sDlrCode,
                    null);
        } catch (NinjaException e) {
            ExceptionHelper.throwClientException(e);
        }

        //..We Should Only Get 1 Row. ToDo (GLL 21/02/2007): Is that true? There normally a prepaid and a postpaid.
        int iSubTypes = subscriptionTypeDTOs.size();
        if (iSubTypes < 1) {
            ExceptionHelper.throwClientException(ExceptionHelper.PEETYPE, ExceptionHelper.PEE000000, "Error Encountered with Configuration DataBase.");
        }
        boolean ppOkay = false;
        SubscriptionTypeDTO subscriptionTypeDTO = null;
        for (int i = 0; i < iSubTypes; i++) {
            //..The Returned Price Plan should match the given Price Plan.
            subscriptionTypeDTO = (SubscriptionTypeDTO) subscriptionTypeDTOs.get(i);
            String sNinjaPricePlan = subscriptionTypeDTO.getPricePlanCode();
            if (sNinjaPricePlan.equals(sPP)) {
                ppOkay = true;
                break;
            }
        }
        if (!ppOkay) {
            ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field PRICE_PLAN - " + sPP + " - Invalid for SP.");
        }
        return subscriptionTypeDTO;

    } //end getPriceplanBelongingToSP()
    

    private SP_output_IDS addNewYouSubscription(SP_input_IDS in_dset, String sSubCtn) throws ClientException {
        //////////////////////////////////////// SPECIAL CASE FOR YOU ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////
        //.. They'll be sending Pre-Paid Price Plan Changes as a new Activation

        //ToDo (GLL): Can we remove the YOU stuff now?

        if (!this.sUser.equals("YouTPlus")) { return null; }

        if (log.isDebugEnabled()) { log.debug("YOU is back - Entering SP_Business_Logic.addNewSubscription - " + in_dset); }

        if (isYouPPConversion(in_dset)) { return null; }

        //ToDo (GLL 18/01/2007): resultant value only ever used in verification that EXISTING sub is ok for this SP so can remove this set.
        setYouPPChange(true);

        SP_input_IDS youSpInputIds = new SP_input_IDS();
        youSpInputIds.setValue(SP_input_IDS.SUB_NO, sSubCtn);
        youSpInputIds.setValue(SP_input_IDS.NEW_PRICE_PLAN, in_dset.getValue(SP_input_IDS.PRICE_PLAN, null));

        SP_output_IDS spOutIDS = changePricePlan(youSpInputIds);

        int nNoofServs = in_dset.getCount(SP_input_IDS.SERVICE);
        if (nNoofServs > 0) {
            SP_input_IDS youAddServs = new SP_input_IDS();
            youAddServs.setValue(SP_input_IDS.SUB_NO, sSubCtn);
            for (int i = 0; i < nNoofServs; i++) {
                youAddServs.setValue(SP_input_IDS.SERVICE, i, in_dset.getValue(SP_input_IDS.SERVICE, i, null));
                youAddServs.setValue(SP_input_IDS.SERVICE_PARAM, i, in_dset.getValue(SP_input_IDS.SERVICE_PARAM, i, null));
                youAddServs.setValue(SP_input_IDS.SUB_SERVICE_ACTION, i, in_dset.getValue(SP_input_IDS.SUB_SERVICE_ACTION, i, null));
            }
            spOutIDS = modifySubProfile(youAddServs);
        }

        return spOutIDS;

    } //end addNewYouSubscription()

    private boolean isYouPPConversion(SP_input_IDS in_dset) {
        boolean isYouPP = false;
        String sCtn = (String) in_dset.getValue(SP_input_IDS.SUB_NO, null);
        try {
            this.getBanAndSubscriptionAndSetInstanceVariablesToThem(sCtn, this.user, this.sDlrCode);

            if (this.sub.getServiceManager().getPricePlan().getCode().equals("PVPC")
                    || this.sub.getServiceManager().getPricePlan().getCode().equals("PVPK")) {
                isYouPP = true;
                if (log.isDebugEnabled()) {
                    log.debug("isYouPPConversion - " + in_dset);
                }
            }
        } catch (NinjaException ne) {
            isYouPP = false;
        } catch (ClientException ce) {
            isYouPP = false;
        }
        return isYouPP;
    }

    //..processing for services (socs) - for new sub or resume from cancelled
    //ToDo (GLL): replace the parameter with the variables required to do the getAvailable socs ourselves??
    private void setupRegularServices(SP_input_IDS in_dset, SocsDTO socsDTO) throws ClientException {
        //..loop through any additional services
        int nServs = in_dset.getCount(SP_input_IDS.SERVICE);
        String sAdtServ = "";
        Hashtable hAdtParm = null;
        for (int i = 0; i < nServs; i++) {
            sAdtServ = (String) in_dset.getValue(SP_input_IDS.SERVICE, i, null);
            if (sAdtServ == null) {
                ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034,
                        "Field SERVICE - index - " + i + " - is empty or non-existent");
            }

            // get soc type and group from SP_SERVICES_MAPPING reference table
            SPServicesMappingReferenceTable.ServiceMapping serviceMappingRec = SPServicesMappingReferenceTable.getServiceTypeAndGroup(sAdtServ);
            if (serviceMappingRec == null) {
                ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034,
                        "Field SERVICE - index - " + i + " [" + sAdtServ + "] Cannot be mapped to Service Type & Group.");
            }
            String sRequestedSocType = serviceMappingRec.getSocType();
            String sRequestedSocGroup = serviceMappingRec.getSocGroup();
            if (log.isDebugEnabled()) {
                log.debug("Will attempt to get SocsDTO for Type [" + sRequestedSocType + "] Group [" + sRequestedSocGroup + "]");
            }

            //Now let's use the type and group to get the actual soc (in a SocDTO):
            SocDTO socDTO = socsDTO.getSocDTO(sRequestedSocType, sRequestedSocGroup);
            if (socDTO == null) {
                ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034,
                        "Field SERVICE - index - " + i + " [" + sAdtServ + "] Cannot be mapped to Real Service Code.");
            }
            if (log.isDebugEnabled()) {
                log.debug("Available socDTO [" + i + "]- " + socDTO.toString());
            }
            String availableSocCode = socDTO.getCode();

            // Special handling for DATA soc because it has 2 parameters with same parameter code
            //ToDo (GLL):  Wouldn't this be better fixed with an additional (optional) "ninja_feature_code" column in the
            //ToDo (cont): table? (It would only be required where the combination of sp_service_code and ninja_parameter_code
            //ToDo (cont): are not unique. Then this section could be removed and the "sFeatureCode = socDTO.getFeatureCode(sNinjaParamCode);"
            //ToDo (cont): in the "else" (which covers the general case) could be put in an if statement.
            if ("DATA".equals(sAdtServ)) {
                hAdtParm = (Hashtable) in_dset.getValue(SP_input_IDS.SERVICE_PARAM, i, null);
                if (hAdtParm != null) {
                    //ToDo (GLL):  Mandatory checks (and other validation) are done in the FeatureParameter class - I think these checks
                    //ToDo (cont): should be removed, especially as they effectively remove the use of default values!!!
                    if (!hAdtParm.containsKey("ASYN") || !hAdtParm.containsKey("ISDN")) {
                        ExceptionHelper.throwClientException(ExceptionHelper.MPETYPE, ExceptionHelper.MPE000006,
                                "Field SERVICE_PARAM - index - " + i + " - Must contain entries for 'ASYN' & 'ISDN'");
                    }
                    String sTMP = (String) hAdtParm.get("ASYN");
                    if (sTMP == null || !sTMP.startsWith(CTN_LEAD_DIGITS) || sTMP.length() != 11) {
                        ExceptionHelper.throwClientException(ExceptionHelper.MPETYPE, ExceptionHelper.MPE000006,
                                "Field SERVICE_PARAM - index - " + i + " - Value for ISDN is invalid");
                    } else {
                        //..Set Value for B-DA26 - MSISDN
                        if (!socsDTO.setParameterValue(availableSocCode, "B-DA26", "MSISDN", sTMP)) {
                            ExceptionHelper.throwClientException(ExceptionHelper.PEETYPE, ExceptionHelper.PEE000045,
                                    "Unable to set the Service Feature for SERVICE - index - " + i + " - B-DA26");
                        }
                    }
                    sTMP = (String) hAdtParm.get("ISDN");
                    if (sTMP == null || !sTMP.startsWith(CTN_LEAD_DIGITS) || sTMP.length() != 11) {
                        ExceptionHelper.throwClientException(ExceptionHelper.MPETYPE, ExceptionHelper.MPE000006,
                                "Field SERVICE_PARAM - index - " + i + " - Value for ASYN is invalid");
                    } else {
                        //..Set Value for ISDN96 - MSISDN
                        if (!socsDTO.setParameterValue(availableSocCode, "ISDN96", "MSISDN", sTMP)) {
                            ExceptionHelper.throwClientException(ExceptionHelper.PEETYPE, ExceptionHelper.PEE000045,
                                    "Unable to set the Service Feature for SERVICE - index - " + i + " - ISDN96");
                        }
                    }
                }
            } else {
                hAdtParm = (Hashtable) in_dset.getValue(SP_input_IDS.SERVICE_PARAM, i, null);
                String sFeatureCode = null;
                String sNinjaParamCode = null;

                if (hAdtParm != null) {
                    Enumeration servParmKeys = hAdtParm.keys();
                    while (servParmKeys.hasMoreElements()) {
                        String sServParmKey = (String) servParmKeys.nextElement();
                        if (isParamMandatory(sServParmKey, sAdtServ)) { //ToDo (GLL): WTF???

                        }
                        // get Ninja parameter code according to the parameter code, sent by SP.
                        sNinjaParamCode = getNinjaParameterCode(sServParmKey, sAdtServ);
                        if (sNinjaParamCode == null) {
                            ExceptionHelper.throwClientException(ExceptionHelper.PEETYPE, ExceptionHelper.PEE000045,
                                    "Unable to Get Mappings for the Service Feature for " + sAdtServ + " - index - " + i + " - "
                                            + sServParmKey + '.');
                        }

                        //Get the Ninja feature code
                        // (GLL: Assumes that, for a given soc/parameter code, we will only get one feature code. Should
                        // be true for all except regular data services.)
                        sFeatureCode = socDTO.getFeatureCode(sNinjaParamCode);
                        if (log.isDebugEnabled()) {
                            log.debug("Feature Code = [" + sFeatureCode + "]");
                        }

                        String sServParmValue = (String) hAdtParm.get(sServParmKey);

                        //ToDo (GLL):  Mandatory checks (and other validation) are done in the FeatureParameter class - I think these checks
                        //ToDo (cont): should be removed, especially as they effectively remove the use of default values!!!
                        if (isParamMandatory(sServParmKey, sAdtServ) && sServParmValue == null) {
                            ExceptionHelper.throwClientException(ExceptionHelper.MPETYPE, ExceptionHelper.MPE000006,
                                    "Field SERVICE_PARAM - index - " + i + " - Value for " + sServParmKey + " is invalid");
                        }
                        if (FeatureParameter.PARAMETER_CODE_MSISDN.equals(sNinjaParamCode)) {
                            if (!sServParmValue.startsWith(CTN_LEAD_DIGITS) || sServParmValue.length() != 11) {
                                ExceptionHelper.throwClientException(ExceptionHelper.MPETYPE, ExceptionHelper.MPE000006,
                                        "Field SERVICE_PARAM - index - " + i + " - Value for " + sServParmKey + " is invalid");

                            }
                        }
                        if (!socsDTO.setParameterValue(availableSocCode, sFeatureCode, sNinjaParamCode, sServParmValue))
                        {
                            ExceptionHelper.throwClientException(ExceptionHelper.PEETYPE, ExceptionHelper.PEE000045,
                                    "Unable to set the Service Feature for " + sAdtServ + " - index - " + i + " - "
                                            + sServParmKey + " - " + sServParmValue);
                        }

                    }
                } //ToDo (GLL):  Mandatory checks (and other validation) are done in the FeatureParameter class - I think these checks
                  //ToDo (cont): should be removed, especially as they effectively remove the use of default values!!!
                  else if (hAdtParm == null && hasMandatoryParam(sAdtServ)) {
                    ExceptionHelper.throwClientException(ExceptionHelper.MPETYPE, ExceptionHelper.MPE000006,
                            "Field SERVICE - index - " + i + " - " + sAdtServ + " must contain SERVICE_PARAM");
                }
            }

            //..If we are here, then its okay to add the soc..
            try {
                socDTO.setOperation(SocDTO.OPERATION_ADDITION);
            } catch (NinjaDTOValidationException e) {
                ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000016, "Field SERVICE - " + sAdtServ);
            }
        }
    }


    public SP_output_IDS reactivateSubscription(SP_input_IDS in_dset) throws ClientException {
        long nStartTime = System.currentTimeMillis();

        checkSpInputIdsNotNull(in_dset);

        SP_output_IDS spOut = null;
        //Restore a suspended subscription.
        try {
            String sCtn = (String) in_dset.getValue(SP_input_IDS.SUB_NO, null);
            if (sCtn == null) {
                ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field SUB_NO - is empty or non-existent");
            }

            this.getBanAndSubscriptionAndSetInstanceVariablesToThem(sCtn, this.user, this.sDlrCode);

            //..create the inparameters dto to the restore method
            RestoreSubscriptionDTO restoreDTO = new RestoreSubscriptionDTO(FokusDates.getLogicalDate(),
                    null,
                    "Restoration from Service Provider.");

            this.sub.restore(restoreDTO);
            //..refresh the sub..
            this.sub = this.ban.getSubscription(sCtn, false);
            //..Check the status
            if (!this.sub.getStatus().equals("A")) {
                ExceptionHelper.throwClientException(ExceptionHelper.PEETYPE, ExceptionHelper.PEE_ERROR_CHANGING_SUB_STATUS, "Unable to Re-Activate Subscription.");
            }

            spOut = populateSPOutputIDSFromSubDetails(this.sub);
        } catch (NinjaException e) {
            ExceptionHelper.throwClientException(e);
        }

        this.writeLogInfo("reactivateSubscription", nStartTime, System.currentTimeMillis(), in_dset, spOut);

        return spOut;
    }

    public SP_output_IDS cancelSubscription(SP_input_IDS in_dset) throws ClientException {

        long nStartTime = System.currentTimeMillis();

        checkSpInputIdsNotNull(in_dset);

        String sCtn = (String) in_dset.getValue(SP_input_IDS.SUB_NO, null);
        if (sCtn == null) {
            ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field SUB_NO - is empty or non-existent");
        }

        //GLL 18/01/2007: replaced inline code with this call:
        getBanAndSubscriptionAndSetInstanceVariablesToThem(sCtn, this.user, this.sDlrCode);

        Date cancelDate = null;
        SP_output_IDS spOut = null;

        try {
            if (this.sub.getStatus().equals("C")) {
                ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Subscription is already cancelled!");
            }
            cancelDate = FokusDates.getLogicalDate();
        } catch (NinjaException e) {
            ExceptionHelper.throwClientException(e);
        }


        //GLL 18/01/2007: Replaced inline code with this call.
        //Cancel for port out. Returns null if not cancel for port out (ie just ordinary cancel)
        spOut = this.cancelForPortOut(in_dset, cancelDate, sCtn);
        if (spOut != null) {
            this.writeLogInfo("cancelSubscription <" + sCtn + ">", nStartTime, System.currentTimeMillis(), in_dset, spOut);
            return spOut;
        }
        //end "cancel for port out"


        //This is the actual "cancel now" stuff (as opposed to cancel for port out):
        String reasonCode = "KS70";
        String memoText = "Cancellation from Service Provider.";
        boolean waiveFees = false; // Because is not set in the IDS
        String waiveReasonCode = null; // Because is not set in the IDS

        try {

            //Do the actual cancellation:
            this.sub.cancel(reasonCode, cancelDate, memoText, waiveFees, waiveReasonCode);

            //Refresh the Sub, and check that it was cancelled:
            this.sub.synchronize();
            if (!this.sub.getStatus().equals("C")) {
                ExceptionHelper.throwClientException(ExceptionHelper.PEETYPE, ExceptionHelper.PEE_ERROR_CHANGING_SUB_STATUS, "Unable to Cancel Subscription.");
            }

            spOut = populateSPOutputIDSFromSubDetails(this.sub);

        } catch (NinjaException e) {
            ExceptionHelper.throwClientException(e);
        }

        this.writeLogInfo("cancelSubscription <" + sCtn + ">", nStartTime, System.currentTimeMillis(), in_dset, spOut);

        return spOut;

    } //end cancelSubscription()

    //GLL 18/01/2007: extracted method from cancelSubscription() to handle the cancel for port out case.
    //This fowards to external methods which set a FUTURE cancellation.
    private SP_output_IDS cancelForPortOut(SP_input_IDS in_dset, Date activityDate, String sCtn) throws ClientException {


        //Is this a Porting Out? (GLL: That is, is the SP telling us it's a porting out...)
        String sPortInd = (String) in_dset.getValue(SP_input_IDS.NP_PORT_IND, null);
        boolean bNumberPorting = (sPortInd != null && sPortInd.equals("Y"));
        if (!bNumberPorting) { return null; } //Not number port cancellation => return null
        //End of "is cancel for port out"


        //sReasonCode = "POSO";
        //..get the date and add 1 day.
        String sTmpPortDateTime = (String) in_dset.getValue(SP_input_IDS.NP_PORT_DATE_TIME, null);
        if (sTmpPortDateTime == null) {
            in_dset.setValue(SP_input_IDS.NP_PORT_DATE_TIME, TypeConverter.dateToString(activityDate, TypeConverter.DATE_FORMAT_COMPLEX));
        } else {
            try {
                Date dOrgPortDT = TypeConverter.stringToDate(sTmpPortDateTime, TypeConverter.DATE_FORMAT_COMPLEX);
                Date dTmpPortDateInc = TypeConverter.add(dOrgPortDT, TypeConverter.DURATION_UNIT_DAY, 1);
                //GLL: This is a shocking way of doing it (resetting a value in the input dset):
                in_dset.setValue(SP_input_IDS.NP_PORT_DATE_TIME, TypeConverter.dateToString(dTmpPortDateInc, TypeConverter.DATE_FORMAT_COMPLEX));
            } catch (Exception pe) {
                ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field NP_PORT_DATE_TIME - contains an illegal date/time string");
            }
        }


        SP_output_IDS spOut = null; //Return value
        try {

            // Do we need to validate donor, original donor, ref number...?

            // Pick up the porting recipient
            String sPortRecipient = (String) in_dset.getValue(SP_input_IDS.NP_RECIPIENT_CODE, null);
            if (sPortRecipient == null) {
                ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field NP_RECIPIENT_CODE - is empty or non-existent");
            }

            // Is the Port Recipient THIS operator?
            if (sPortRecipient.equals(this.sOperatorCode)) {
                ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field NP_RECIPIENT_CODE - - is illegal for this Service Provider - SP Operator = " + this.sOperatorCode + " - Port out to = " + sPortRecipient);
            }

            // Add all 'cancellation due to porting' requests
            ServiceProviderNetwork serviceProviderNetwork = new ServiceProviderNetwork(this.user, this.sOperatorCode);
            String sNPdonor = this.sOperatorCode;
            String sNPoriginalDonor = this.sOperatorCode;
            String sNPrangeHolder = sNPdonor; //Ok with MWH 18.11.2003 20:00
            String sNPrecipientCode = (String) in_dset.getValue(SP_input_IDS.NP_RECIPIENT_CODE, null);
            String sNPrefNo = (String) in_dset.getValue(SP_input_IDS.NP_REF_NO, null);
            if (sNPrefNo == null) {
                ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field NP_REF_NO - is empty or non-existent");
            }
            if (sNPrecipientCode == null) {
                ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field NP_RECIPIENT_CODE - is empty or non-existent");
            }
            //ToDo (GLL 18/01/2007): haven't we just done this?
            // Is the Port Recipient THIS operator?
            if (sNPrecipientCode.equals(this.sOperatorCode)) {
                ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field NP_RECIPIENT_CODE - - is illegal for this Service Provider - SP Operator = " + this.sOperatorCode + " - Port out to = " + sPortRecipient);
            }

            Date port_date_time = null;
            //NP_PORT_DATE_TIME was reset (for port in) earlier:
            port_date_time = TypeConverter.stringToDate((String) in_dset.getValue(SP_input_IDS.NP_PORT_DATE_TIME, null), TypeConverter.DATE_FORMAT_COMPLEX);


            int noOfAdditionalNOS = 0;
            List additionalNumbers = new ArrayList();
            noOfAdditionalNOS = in_dset.getCount(SP_input_IDS.NP_ADDITIONAL_NOS);

            for (int i = 0; i < noOfAdditionalNOS; i++) {
                additionalNumbers.add((String) in_dset.getValue(SP_input_IDS.NP_ADDITIONAL_NOS, i, null));
            }

            //                String userText = "Port Out from Service Provider - To - " + sNPrecipientCode + " - NP Ref = " + sNPrefNo;

            ExportSubscriptionDTO exportSubscriptionDTO = null;

            NumberExportDTO exportDetails = new NumberExportDTO(sNPdonor, sNPrangeHolder, sNPoriginalDonor, sNPrecipientCode, sNPrefNo, port_date_time, sCtn, additionalNumbers);

            String sReasonCode = "POSO";
            String sUserText = "Cancellation from Service Provider.";
            //exportDetails, Ban (one of too ways...)
            exportSubscriptionDTO = new ExportSubscriptionDTO(exportDetails, this.ban, this.ban.getNumber());
            exportSubscriptionDTO.setUserText(sUserText);
            exportSubscriptionDTO.setReasonCode(sReasonCode);

            serviceProviderNetwork.exportSubscription(exportSubscriptionDTO);

            // Ensure that the subscription cancellation isn't performed now
            spOut = populateSPOutputIDSFromSubDetails(this.sub);
        } catch (NinjaException e) {
            ExceptionHelper.throwClientException(e);
        }

        //this.writeLogInfo("cancelSubscription <" + sCtn + ">", nStartTime, System.currentTimeMillis(), in_dset, spOut);
        return spOut;

    } //end cancelForPortOut()


    public SP_output_IDS replaceSim(SP_input_IDS in_dset) throws ClientException {
        long nStartTime = System.currentTimeMillis();

        checkSpInputIdsNotNull(in_dset);

        SP_output_IDS spOut = null;
        try {
            // Validate input parameters
            String subNo = (String) in_dset.getValue(SP_input_IDS.SUB_NO, null);
            String newSim = (String) in_dset.getValue(SP_input_IDS.NEW_SIM, null);
            String currentSim = (String) in_dset.getValue(SP_input_IDS.SIM_NO, null);

            if (subNo == null) {
                ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field SUB_NO - is empty or non-existent");
            }
            if (newSim == null) {
                ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field NEW_SIM - is empty or non-existent");
            }

            this.getBanAndSubscriptionAndSetInstanceVariablesToThem(subNo, this.user, this.sDlrCode);

            //ToDo(GLL 18/01/2007): well this is new. It will be GSM or it won't be on an SP. (Future functionality??)
            // Subscription must be a GSM subscription
            if (!this.sub.getCtn().getProductType().equalsIgnoreCase("GSM")) {
                ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Subscriber number is not a GSM number");
            }
            // Replace SIM card
            if (currentSim == null) {
                currentSim = this.sub.getEquipmentManager().getPrimarySIMCard().getNumber();
            }

            if (log.isDebugEnabled()) {
                log.debug("Replace sim " + currentSim + " with sim " + newSim);
            }

            // First check that replaceing SIM Card is available
            if (!SIMCard.isAvailable(newSim)) {
                ExceptionHelper.throwClientException(ExceptionHelper.PEETYPE, ExceptionHelper.PEE_ERROR_ADDING_EQUIPMENT,
                        "SIM Card '" + newSim + "' is not available as a replacement!");
            }

            // Attempt to replace this SIM Card within the list
            this.sub.replaceSIM(currentSim, newSim);
            this.sub.save();
            this.sub.synchronize();
            spOut = populateSPOutputIDSFromSubDetails(this.sub);
        } catch (NinjaException e) {
            ExceptionHelper.throwClientException(e);
        }

        this.writeLogInfo("replaceSim", nStartTime, System.currentTimeMillis(), in_dset, spOut);

        return spOut;
    }

    /**
     * Change the Subscription Price Plan
     */
    public SP_output_IDS changePricePlan(SP_input_IDS in_dset) throws ClientException {
        if (log.isDebugEnabled()) {
            log.debug("changePricePlan - " + in_dset);
        }
        long nStartTime = System.currentTimeMillis();
        SP_output_IDS spOut = null;

        checkSpInputIdsNotNull(in_dset);

        String sSubNo = (String) in_dset.getValue(SP_input_IDS.SUB_NO, null);
        if (sSubNo == null) {
            ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field SUB_NO - is empty or non-existent");
        }
        if (!sSubNo.startsWith(CTN_LEAD_DIGITS) || sSubNo.length() != 11) {
            ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field SUB_NO - " + sSubNo);
        }
        //..Has a To Price Plan been Specified
        String sNewPP = (String) in_dset.getValue(SP_input_IDS.NEW_PRICE_PLAN, null);
        String sExistPP = "";

        //ToDo (GLL 18/01/2007): replace inline code with this call: getBanAndSubscriptionAndSetInstanceVariablesToThem(sCtn, this.user, this.sDlrCode); ??????????????
        //ToDo (cont): Not wuite that simple -  This is used internally to so all of this "do you we already have it" stuff may well be valid.
        try {
            // Instansiate Ban using subscriber number
            if (this.ban == null) {
                this.ban = (Ban) BanFactory.getExistingBan(sSubNo, this.user);
            } else {
                this.ban.synchronize();
            }

            this.ban.getUser().setDealer(this.sDlrCode);
            this.ban.getUser().setSalesAgent("A");
            // Instanciate subscription
            if (this.sub == null) {
                this.sub = this.ban.getSubscription(sSubNo, false);
            } else {
                if (this.sub.getCtn().equals(sSubNo)) {
                    this.sub.synchronize();
                } else {
                    this.sub = this.ban.getSubscription(sSubNo, false);
                }
            }
            //..Is this Sub for this service Provider??
            verifyDealerForSubscription(this.sub);


            sExistPP = this.sub.getServiceManager().getPricePlan().getCode();
            //..Get The Available PPs to Change to
            //String sExistAgreeType = "SP";
            String sNewAgreeType = "SP";
            //String sExistAcctType = this.ban.getBasicBanDetails().getAccountType();
            String sNewAcctType = "S";
            //String sExistAcctSubT = this.ban.getBasicBanDetails().getAccountSubType();
            String sNewAcctSubT = this.sAccSubType;
            String sExistCampaign = this.sub.getServiceManager().getServicePlan().getCampaignCode();
            String sExistPricePlan = sExistPP;
            Integer nCommit = new Integer(0);
            Integer nRemainCommit = new Integer(0);
            String sLanguageCode = this.sLanguage;
            String sDealerCode = this.sDlrCode;
            String channelCode = this.user.getChannel().getChannelCode();
            int nSubTypeIndex = -1;
            List subscriptionTypeDTOList = NinjaBusinessRules.getSubscriptionTypeDTOsForChange(channelCode,
                    sNewAgreeType,
                    Ban.BAN_TREE_IND_YES,
                    sNewAcctType,
                    sNewAcctSubT,
                    sExistCampaign,
                    sExistPricePlan,
                    nCommit,
                    nRemainCommit,
                    sLanguageCode,
                    sDealerCode,
                    null);

            //..We Should Only Get 1 Row.
            int iSubTypes = subscriptionTypeDTOList.size();
            if (iSubTypes == 0) {
                ExceptionHelper.throwClientException(ExceptionHelper.PEETYPE, ExceptionHelper.PEE000000, "Error Encountered with Configuration DataBase.");
            }
            //..If Price Plan is specified then check that we have it..
            int nFound = 0;
            if (sNewPP != null) {
                for (int i = 0; i < iSubTypes; i++) {
                    SubscriptionTypeDTO subscriptionTypeDTO = (SubscriptionTypeDTO) subscriptionTypeDTOList.get(i);
                    String sTmpPP = subscriptionTypeDTO.getPricePlanCode();
                    if (sTmpPP.equals(sNewPP)) {
                        nSubTypeIndex = i;
                        nFound++;
                    }
                }
                //..Now check that we only have 1 PP choice to move to.
                if (nFound > 1) {
                    ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE_ILLEGAL_CHANGERATING, "Unable to determine the new Price Plan. Multiple Alternatives Exist.");
                } else if (nFound == 0) {
                    ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE_ILLEGAL_CHANGERATING, "Unable to determine the new Price Plan. No Rules Exist for this Combination.");
                }
            } else {
                //..Otherwise we must only have 1 price plan to move to.
                if (iSubTypes > 1) {
                    ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE_ILLEGAL_CHANGERATING, "Unable to determine the new Price Plan. Multiple Alternatives Exist.");
                }
                for (int i = 0; i < iSubTypes; i++) {
                    SubscriptionTypeDTO subscriptionTypeDTO = (SubscriptionTypeDTO) subscriptionTypeDTOList.get(i);
                    sNewPP = subscriptionTypeDTO.getPricePlanCode();
                }
                nSubTypeIndex = 0;
                if (sNewPP == null || sNewPP.equals(sExistPP)) {
                    ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE_ILLEGAL_CHANGERATING, "Unable to determine the new Price Plan.");
                }
            }
            //..Now get the Socs IDS for This Type
            SubscriptionTypesIDS subscriptionTypesSocs = new SubscriptionTypesIDS();
            SubscriptionTypeDTO subscriptionTypeDTO = (SubscriptionTypeDTO) subscriptionTypeDTOList.get(nSubTypeIndex);
            subscriptionTypesSocs.setValue(SubscriptionTypesIDS.SUBSCRIPTION_TYPE_ID, subscriptionTypeDTO.getSubscriptionTypeId());
            subscriptionTypesSocs.setValue(SubscriptionTypesIDS.LANGUAGE_CODE, this.sLanguage);

            //..Create a SocsIDS to pass in...
            SocsDTO availableSocsDTO = NinjaBusinessRules.getAvailableSocs(channelCode,
                    subscriptionTypeDTO.getSubscriptionTypeId(),
                    this.sDlrCode,
                    "A",
                    null,
                    null);
            //..Procees The socIDS to set any mandatory info..
            List availableSocDTOList = availableSocsDTO.getSocs();
            for (int i = 0; i < availableSocDTOList.size(); i++) {
                SocDTO socDTO = (SocDTO) availableSocDTOList.get(i);
                String sNinjaModeActivate = socDTO.getNinjaModeActivate();
                if (sNinjaModeActivate == null) {
                    continue;
                }
                if (sNinjaModeActivate.equals("M")) {
                    socDTO.setAddMode(SocDTO.ADD_MODE_AUTOMATICALLY);
                }

            }
            ChangeRatingDTO changeRatingDTO = new ChangeRatingDTO(availableSocsDTO, "VS01");
            changeRatingDTO.setCampaign("000000000");
            changeRatingDTO.setDealerCode(this.sDlrCode);
            changeRatingDTO.setClean(true);
            changeRatingDTO.setSalesAgentCode("A");
            changeRatingDTO.setMemo("Changed by " + this.user.getNinjaUser() + "- Via Ninja.");
            //..If from PP is YOU PrePaid then move to the current activation ban
            if (this.user.getNinjaUser().equals("YouTPlus") && (this.sub.getServiceManager().getPricePlan().getCode().equals("PVPC") ||
                    this.sub.getServiceManager().getPricePlan().getCode().equals("PVPK"))) {
                //..need to do a bit of buggerings around if they have voicemail..
                // mwe : 17-08-2004 : Removed next line as bypass validation no longer allowed
                // changeRatingDTO.setBypassValidation(true);
                MoveSubscriptionDTO moveSubscriptionDTO = new MoveSubscriptionDTO();
                moveSubscriptionDTO.setChangeRatingDTO(changeRatingDTO);
                moveSubscriptionDTO.setKeepOldName("N");

                PrivateNameDTO privateNameDTO = new PrivateNameDTO(this.sFirst_Name, this.sLast_Business_Name, false);

                RegularAddressDTO addressDTO = new RegularAddressDTO(this.sAdr_Country, this.sAdr_Zip, this.sAdr_City, false);
                addressDTO.setHouseNumber(this.sAdr_House_No);
                addressDTO.setHouseLetter(this.sAdr_House_Letter);
                addressDTO.setStreetName(this.sAdr_Street_Name);
                addressDTO.setEmail(this.sAdr_Email);
                addressDTO.setDoorNumber(this.sAdr_Door_No);
                addressDTO.setFloorNumber(this.sAdr_Story);
                //                subNameAddress.setValue(NameAddressIDS.LINK_TYPE, TuxTypeConv.stringToByte("U"));
                //                subNameAddress.setValue(NameAddressIDS.ADR_TYPE, TuxTypeConv.stringToByte("R"));

                SubscriptionCustomerDTO customerDTO = null;
                customerDTO = new SubscriptionCustomerDTO(privateNameDTO,
                        addressDTO,
                        TypeConverter.stringToDate("19600101", TypeConverter.DATE_FORMAT_SIMPLE),
                        false);


                moveSubscriptionDTO.setCustomerDTO(customerDTO);
                moveSubscriptionDTO.setDealerCode(this.sDlrCode);
                moveSubscriptionDTO.setSalesAgentCode("A");
                //                moveSubscriptionIDS.setValue(MoveSubscriptionIDS.SUB_RECEIVE_INFO, TuxTypeConv.stringToByte("N"));
                moveSubscriptionDTO.setActivationReason("PSS1");
                moveSubscriptionDTO.setUserText("YOU - Move From Pre-Paid to Post Paid - via Ninja");
                moveSubscriptionDTO.setOriginalAgreementCode("SP");
                moveSubscriptionDTO.setNewAgreementCode("SP");
                //..On-Line hardcodes to EO...  maybe need to use this instead..
                //moveSubscriptionIDS.setValue(MoveSubscriptionIDS.ACT_REASON, "EO");

                if (log.isDebugEnabled()) { log.debug("You PP Conversion - " + moveSubscriptionDTO); }

                // try to get available activation ban. We will not try to use current activation ban from the table.
                Integer nBan = null;
                try {
                    //ToDo (GLL): would be nice to replace this with the extacted method - but it's not 100% straightforward
                    //ToDo (cont): as that sets the instance variable and returns the ban number.
                    //ToDO (cont): Probably best to extract these 3 lines into a new method and get the existing one to call that.
                    ServiceProvidersHelper spHelper = new ServiceProvidersHelper(this.user.getNinjaUser());
                    nBan = spHelper.getActivationBan();
                    BanAccess newBan = BanFactory.getExistingBan(nBan, this.user);

                    newBan.moveSubscription(this.sub, moveSubscriptionDTO);
                    
                } catch (NinjaException ne) {
                    throw ne;
                } finally {
                    if (nBan != null) {
                        ServiceProvidersHelper.releaseBanForUse(nBan);
                    }
                }

            } else {//..Regular rating change
                this.sub.changeRating(changeRatingDTO, null);
                this.sub.save();
            }
            spOut = populateSPOutputIDSFromSubDetails(this.sub);
        } catch (NinjaException ne) {
            ExceptionHelper.throwClientException(ne);
        }

        this.writeLogInfo("changePricePlan", nStartTime, System.currentTimeMillis(), in_dset, spOut);

        return spOut;
    }

    /**
     * TODO: the functionality works except replacement of additional numbers. Old numbers are kept on the feature ...
     * Change an Existing Subscribers Main Msisdn.
     */
   /*
    public SP_output_IDS changeMsisdn(SP_input_IDS in_dset) throws ClientException {
        if (log.isDebugEnabled()) {
            log.debug("changeMsisdn - " + in_dset);
        }
        long nStartTime = System.currentTimeMillis();
        SP_output_IDS spOut = null;
        CTN ctn = null;
        CTN newCtn = null;
        Dealer spDealer = null;

        checkSpInputIdsNotNull(in_dset);

        String sCtn = (String) in_dset.getValue(SP_input_IDS.SUB_NO, null);
        if (sCtn == null) {
            ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034,
                    "SUB_NO has a null value!");
        }

        String sNewCtn = (String) in_dset.getValue(SP_input_IDS.NEW_SUB_NO, null);
        if (sNewCtn == null) {
            ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034,
                    "NEW_SUB_NO has a null value!");
        }

        try {
            // Instanciate subscription where SIM is to be replaced
            this.getBanAndSubscriptionAndSetInstanceVariablesToThem(sCtn, this.user, this.sDlrCode);
            String activityReasonCode = Memo.ACTIVITY_REASON_CODE_CUSTOMER_REQUEST;

            this.sub.changeCTN(newCtn, activityReasonCode, spDealer, this.ban.getUser().getSalesAgent(), null, ActivityCharge.CODE_REGULAR_NUMBERS, null);
            Subscription newSub = this.ban.getSubscription(sNewCtn);
            spOut = populateSPOutputIDSFromSubDetails(newSub);
        } catch (NinjaException ne) {
            ExceptionHelper.throwClientException(ne);
        }

        this.writeLogInfo("changeMsisdn", nStartTime, System.currentTimeMillis());
        return spOut;
    }
    */

    /**
     * Cancel a Porting (ie port in) Request.
     */
    public boolean cancelPortingRequest(SP_input_IDS in_dset) throws ClientException {

        boolean bSuccessInd = false;
        // We need a valid subscription number & an NRDB number from the input IDS
        checkSpInputIdsNotNull(in_dset);

        if (log.isDebugEnabled()) { log.debug("SP cancelPortingRequest() - " + in_dset); }

        String sCtn = (String) in_dset.getValue(SP_input_IDS.SUB_NO, null);
        if (sCtn == null) {
            ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034,
                    "SUB_NO has a null value!");
        }
        String sNRDB = (String) in_dset.getValue(SP_input_IDS.NP_REF_NO, null);
        if (sNRDB == null) {
            ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034,
                    "Field NP_REF_NO has a null value!");
        }

        //ToDo (GLL): extract this db stuff (first locally then to another class - probably TimePortDBHelper.
        //ToDo (cont) Not trivial however - this chunk of code "returns" both iCountClob and bSuccessInd.
        //..First Need to Look in the Porting Table..
        String sSqlClob = getNPrequestsSqlClob(this.sUser, sNRDB, sCtn);
        SQLResultSet dbResultClob = null;
        SQLConnection connClob = null;

        try {
            connClob = NinjaDataSource.getSQLConnection();
            dbResultClob = connClob.executeQuery(sSqlClob, true);
        } catch (Exception e) {
            log.error("Retrieving from NINJA_TIME_PORT - ", e);
        } finally {
            try {
                connClob.close();
            } catch (SQLException e) {
                log.warn("Error Closing DB Connection", e);
            }
        }
        //..get the Data From the DataSet returned
        int iCountClob = 0;
        if (dbResultClob != null) {
            iCountClob = dbResultClob.getRowCount();
        }

        if (log.isDebugEnabled()) {
            log.debug("Recs in DB = " + iCountClob);
        }

        if (iCountClob > 0) {
            String sDesc = "Cancellation of Porting Request from - " + this.sUser;
            String sNewStatus = "CANCEL_PO";
            for (int i = 0; i < iCountClob; i++) {
                long npRefID = dbResultClob.getLong("NINJA_REF_ID", i);
                if (log.isDebugEnabled()) {
                    log.debug("Cancelling dbResult index - " + iCountClob + " - Ref ID = " + npRefID);
                }
                try {
                    cancelTimePortRecClob(npRefID, sNewStatus, 9, sDesc);
                    bSuccessInd = true;
                } catch (NinjaException e) {
                    ExceptionHelper.throwClientException(ExceptionHelper.PEETYPE, ExceptionHelper.PEE000009, "Failed to Cancel Port Request with npRefID " + npRefID + " - " + e);
                }
            }
        } //end DB stuff
        else {
            //..Check if There's a Reserved Subscription
            // Instansiate ban / subscription

            //ToDo (GLL 18/01/2007): replace inline code with this call: getBanAndSubscriptionAndSetInstanceVariablesToThem(sCtn, this.user, this.sDlrCode);
            try {
                this.getBanAndSubscriptionAndSetInstanceVariablesToThem(sCtn, this.user, this.sDlrCode);

                //..Do We have a Reserved Sub?
                if (this.sub.getStatus().equals(Subscription.STATUS_RESERVED)) {
                    //..We'll Release It
                    try {
                        this.sub.release();
                        bSuccessInd = true;
                    } catch (NinjaException e) {
                        ExceptionHelper.throwClientException(ExceptionHelper.PEETYPE, ExceptionHelper.PEE000009, "Failed to Cancel Port Request (release subscriber) for number " + this.sub.getNumber() + " - " + e.getMessage());
                    }
                } else if (this.sub.getStatus().equals(Subscription.STATUS_ACTIVE)) {
                    //Cancel the Preactivated subscriber, Since we activated before actual port time.
                    try {
                        this.sub.cancel("POSO", FokusDates.getLogicalDate(), "Cancellation of Porting Request from Service Provider.", true, null);
                        //..Refresh the Sub....
                        this.sub.synchronize();

                        if (this.sub.getStatus().equals("C")) {
                            bSuccessInd = true;
                        }
                    } catch (NinjaException e) {
                        //..We Ignore This just log a warning..
                        log.warn("cancelPortingRequest - " + sCtn + " - ", e);
                        ExceptionHelper.throwClientException(ExceptionHelper.PEETYPE, ExceptionHelper.PEE000009, "Failed to Cancel Port Request (cancel preactivated subscriber) for number " + this.sub.getNumber() + " - " + e.getMessage());
                    }
                }
            } catch (NinjaException e) {
                log.warn("cancelPortingRequest - " + sCtn + " - ", e);
            }
        }
        return bSuccessInd;
    }

    /**
     * SQL for Changing the Status in the NINJA_TIME_PORT table
     *
     * @param ref
     * @param status
     * @param numAttempts
     * @param description
     */
    private void cancelTimePortRecClob(long ref, String status, int numAttempts, String description)
            throws NinjaSQLException, DataSourceException {
        description = TypeConverter.replaceAll(description, "'", "''");

        String sqlUpdate = "update NINJA_TIME_PORT " +
                "set " +
                "STATUS = '" + status + "', " +
                "PROC_ATTEMPTS = " + numAttempts + ", " +
                "DESCRIPTION = '" + description + "', " +
                "DATE_TIME_MODIFIED = sysdate " +
                "where " +
                "NINJA_REF_ID = " + ref;

        SQLConnection conn = null;
        try {
            conn = NinjaDataSource.getSQLConnection();
            conn.executeUpdate(sqlUpdate);
            conn.commit();
        } catch (SQLException e) {
            throw new NinjaSQLException(e);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                log.warn("Unable to close connection", e);
            }
        }
    }


    /**
     * Get The NP Requests for the Call
     *
     * @param sUser    - The WLS login i.e. Ventelo
     * @param sNRDBref - The NRDB Ref ID that the SP sent when creating the Request
     * @param sCtn     - The Ctn invloved in the Porting Request
     * @return
     */
    private String getNPrequestsSqlClob(String sUser, String sNRDBref, String sCtn) {
        String sSql = "SELECT ninja_ref_id FROM ninja_time_port " +
                "WHERE user_id = '" + sUser + "' AND " +
                "nrdb_ref_id = '" + sNRDBref + "' AND " +
                "ctn = '" + sCtn + "' AND " +
                "proc_attempts = 0";
        return sSql;
    }


    /**
     * Retrieve the Status of a Ctn.
     */
    public String getNumberStatus(String sCTN) throws ClientException {
        long nStartTime = System.currentTimeMillis();
        String retVal = null;
        try {
            CTN ctn = CTNFactory.retrieveExisting(this.user, sCTN);
            if (!ctn.isInInventory()) {
                throw new IllegalCTNException("Ctn - " + sCTN + " - Does not Exist.");
            }
            retVal = ctn.getStatus();
            this.writeLogInfo("getNumberStatus", nStartTime, System.currentTimeMillis());
        } catch (NinjaException ne) {
            ExceptionHelper.throwClientException(ne);
        }
        return retVal;
    }

    /**
     * Overide Aging of a Ctn that has status 'AG'
     */
    public String overideCtnAging(String sCTN) throws ClientException {
        long nStartTime = System.currentTimeMillis();
        CTN ctn = null;
        try {
            //..Check that this Belongs to the SP's number locations
            ctn = CTNFactory.retrieveExisting(this.user, sCTN);
            Dealer spDealer = new Dealer(this.sDlrCode);
            if (!spDealer.getDealerReference().hasNumberLocation(ctn.getNumberLocation())) {
                ExceptionHelper.throwClientException(ExceptionHelper.PEETYPE, ExceptionHelper.PEE000035, "Ctn - " + sCTN +
                        " - Does not belong to Dealer - " + this.sDlrCode);
            }

        } catch (NinjaException e) {
            ExceptionHelper.throwClientException(ExceptionHelper.PEETYPE, ExceptionHelper.PEE_SYSTEM_ERROR_OCCURRED, "Retrieving CTN Details: Caused by : " + e.getClass() + " : " + e.getMessage());
        }

        try {
            ctn.releaseFromAgeing();
        } catch (NinjaException ne) {
            //..Don't bother with this exception since we'll simply return the current phone status
        }
        this.writeLogInfo("overideCtnAging", nStartTime, System.currentTimeMillis());
        return ctn.getStatus();
    }


    /**
     * Add Special Call Forwarding (of the specified type) to the subscription
     *
     * Call Forward Types:
     *    1 = Unconditional
     *    2 = General
     *    3 = When Busy
     *    4 = When No Reply
     *    5 = When Not Reachable
     *
     * @param subscriberNo    - The number of the subscriber to add call forwarding to.
     * @param callForwardType - Type of call forwarding to add. See above for valid values.
     * @param fwdNumber       - The telephone number to forward to.
     * 
     * @throws ClientException - for all processing related errors.
     */
    public void addCallForwarding(String subscriberNo, int callForwardType, String fwdNumber) throws ClientException {

        getBanAndSubscriptionAndSetInstanceVariablesToThem(subscriberNo, this.user, this.sDlrCode);

        try {
            this.sub.addCallForwarding(callForwardType, fwdNumber);
        }
        catch (TuxedoException e) { //(NinjaException ne)
            ExceptionHelper.throwClientException(e);
        }
    } //end addCallForwarding()


    /**
     * Remove Special Call Forwarding (of the specified type) from the subscription
     *
     * Call Forward Types:
     *    1 = Unconditional
     *    2 = General
     *
     * @param subscriberNo    - The number of the subscriber to add call forwarding to.
     * @param callForwardType - Type of call forwarding to add. See above for valid values.
     *
     * @throws ClientException - for all processing related errors.
     */
    public void removeCallForwarding(String subscriberNo, int callForwardType) throws ClientException {

        getBanAndSubscriptionAndSetInstanceVariablesToThem(subscriberNo, this.user, this.sDlrCode);

        try {
            this.sub.removeCallForwarding(callForwardType);
        }
        catch (TuxedoException e) { //(NinjaException ne)
            ExceptionHelper.throwClientException(e);
        }
    } //end addCallForwarding()


    /**
     * Add, Modify and Delete services (socs)
     */
    public SP_output_IDS modifySubProfile(SP_input_IDS in_dset) throws ClientException {

        long nStartTime = System.currentTimeMillis();

        checkSpInputIdsNotNull(in_dset);

        //ToDo (GLL): Can we change these error messages? They are virtually unreadable.

        //..Check if we have any changes to make, and that we have valid service/action pairs (ie neither null):
        //ToDo (GLL): This whole section is unnecessary as we would find all of this out (and more!!) as we process each one below:
        int serviceCount = in_dset.getCount(SP_input_IDS.SERVICE);
        boolean bChanges = false;
        for (int i = 0; i < serviceCount; i++) {
            String sService = (String) in_dset.getValue(SP_input_IDS.SERVICE, i, null);
            if (sService == null) {
                ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field SERVICE - is empty or non-existent - index - " + i);
            }
            String sAction = (String) in_dset.getValue(SP_input_IDS.SUB_SERVICE_ACTION, i, null);
            if (sAction == null) {
                ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field SUB_SERVICE_ACTION - is empty or non-existent - index - " + i);
            }
            if (sAction.equals("A") || sAction.equals("D") || sAction.equals("M")) {
                bChanges = true; //We've found a change but we don't break as we want to check that all service/action pairs are non-null
            }
        }
        if (!bChanges) {
            ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "No Valid Changes Specified.");
        } //End of "any changes specified?" section


        SP_output_IDS spOut = null; //Needs to be declared here for scope reasons.
        try {
            String sSubNo = (String) in_dset.getValue(SP_input_IDS.SUB_NO, null);

            getBanAndSubscriptionAndSetInstanceVariablesToThem(sSubNo, this.user, this.sDlrCode);


            //ToDo (GLL):  Why isn't this handled in other methods, eg setUpRegularServices (which is used by
            //ToDo (cont): addNewSubscription() and resumeCancelledSubscription())??
            SocDTO socDTO = null;
            ArrayList socsToProcess = new ArrayList();
            //..Get the SocsIDS for the Subscription
            SocsDTO existingSocsDTO = this.sub.getSocsDTO();
            SocsDTO availableSocsDTO = this.sub.getAvailableSocsDTO();

            //Let's loop through the Add / Modify / Delete socs requests:
            for (int serviceIndex = 0; serviceIndex < serviceCount; serviceIndex++) {

                //Get EXISTING soc (if it DOES exist on the sub) that matches service code given to us by the SP:
                String sServiceCode = null;
                String existingSocCode = null; //Used during delete and modify (and validate in add??)
                String sRequestedSocType = null; //Reused during add
                String sRequestedSocGroup = null; //Reused during add
                {
                    //..Get the Service Code
                    sServiceCode = (String) in_dset.getValue(SP_input_IDS.SERVICE, serviceIndex, null);//..won't be null because we already tested this

                    // get soc type and group from SP_SERVICES_MAPPING reference table
                    SPServicesMappingReferenceTable.ServiceMapping serviceMappingRec = SPServicesMappingReferenceTable.getServiceTypeAndGroup(sServiceCode);
                    if (serviceMappingRec == null) {
                        ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034,
                                "Field SERVICE - index - " + serviceIndex + " [" + sServiceCode + "] Cannot be mapped to Service Type & Group.");
                        continue; //Go to next service add/modify/delete in the IDS ToDo (GLL): but we've just thrown an exception...
                    }
                    sRequestedSocType = serviceMappingRec.getSocType();
                    sRequestedSocGroup = serviceMappingRec.getSocGroup();
                    socDTO = existingSocsDTO.getSocDTO(sRequestedSocType, sRequestedSocGroup);
                    existingSocCode = null;
                    if (socDTO != null) { //null is perfectly valid if we're adding!!
                        existingSocCode = socDTO.getCode();
                    }
                } //End "Get EXISTING soc that matches service code given to us by the SP" section


                String sActionCode = (String) in_dset.getValue(SP_input_IDS.SUB_SERVICE_ACTION, serviceIndex, null);

                if (sActionCode.equals("D")) {
                    if (socDTO == null) {
                         //Soc not on the subscription:
                        ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field SERVICE - is not available for Deletion - index - " + serviceIndex + " - SERVICE - " + sServiceCode);
                    }

                    //..are we allowed to delete the service??
                    if (socDTO.getDeleteMode() == null || !SocDTO.DELETE_MODE_END_USER_OPTIONAL.equals(socDTO.getDeleteMode())) {
                        ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field SERVICE - is not available for Deletion - index - " + serviceIndex + " - SERVICE - " + sServiceCode);
                    }

                    socDTO.setOperation(SocDTO.OPERATION_DELETION);
                    socsToProcess.add(socDTO);
                } //End "D"elete service section

                else if (sActionCode.equals("M")) {
                    if (socDTO == null) {
                         //Soc not on the subscription:
                        ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field SERVICE - is not available for Modification - index - " + serviceIndex + " - SERVICE - " + sServiceCode);
                    }

                    //..are we allowed to modify the service??
                    if (socDTO.getModifyMode() == null || !SocDTO.MODIFY_MODE_END_USER_OPTIONAL.equals(socDTO.getModifyMode())) {
                        //GLL: Unlike the 'D'elete and 'A' cases we are not throwing an exception here (ie when they try
                        // to modify an unmodifiable soc).
                        continue;
                    }

                    //GLL (18/05/2007): extracted method. ToDo: it still contains hardcoding!!
                    setParametersOnSocDTOForSocModification(sServiceCode, in_dset, serviceIndex, socDTO, existingSocsDTO);

                    socDTO.setOperation(SocDTO.OPERATION_MODIFICATION);
                    socsToProcess.add(socDTO);
                } //End "M"odify service section

                else if (sActionCode.equals("A")) {
                    //ToDo (GLL)? We're effectively discarding the socDTO value for an existing soc. Should we complain if
                    //ToDo (cont): it's non-null, or should we rely on illegal soc combination processings in the core to do that for us?
                    //..is the Soc available to add
                    socDTO = availableSocsDTO.getSocDTO(sRequestedSocType, sRequestedSocGroup);
                    if (socDTO == null) {
                        ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field SERVICE - is not available for Addition - index - " + serviceIndex + " - SERVICE - " + sServiceCode);
                    }

                    //..are we allowed to add the service??
                    if (socDTO.getAddMode() == null || !SocDTO.ADD_MODE_END_USER_OPTIONAL.equals(socDTO.getAddMode())) {
                        ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field SERVICE - is not available for Addition - index - " + serviceIndex + " - SERVICE - " + sServiceCode);
                    }

                    //GLL (18/05/2007): extracted method. ToDo: it still contains hardcoding!!
                    setParametersOnSocDTOForSocAddition(sServiceCode, in_dset, serviceIndex, socDTO, availableSocsDTO);

                    socDTO.setOperation(SocDTO.OPERATION_ADDITION);
                    socsToProcess.add(socDTO);
                } //End "A"dd service section

                else { //ie Not "A"dd, "D"elete or "M"odify
                    //Throw exception - invalid (or blank) action code???
                }

            }//End loop through service requests in IDS. We know have our ArrayList of SocDTOs to process

            //GLL: As of writing, we're not always throwing exceptions for invalid input (eg when they try to modify an
            //     unmodifiable soc we just go to the next request), so we need to do this check:
            if (socsToProcess.size() == 0) {
                ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "No Valid Changes Specified.");
            }

            /*
            if (log.isDebugEnabled()) {
                for (int i = 0; i < socsToProcess.size(); i++) {
                    log.debug("SocDTO to Process - " + ((SocDTO) socsToProcess.get(i)).toString());
                }
            }
            */

            //..Perform The Processing..
            this.sub.processServices(new SocsDTO(socsToProcess));
            this.sub.save();

            spOut = populateSPOutputIDSFromSubDetails(this.sub);

        } catch (NinjaException ne) {
            ExceptionHelper.throwClientException(ne);
        }

        this.writeLogInfo("modifySubProfile", nStartTime, System.currentTimeMillis(), in_dset, spOut);

        return spOut;
    }

    //GLL (18/05/2007): Method extracted from modifySubProfile()
    //Sets parameters on the SocDTO passed in, ie for a single soc, for a soc modifcation.
    //ToDo: Get rid of the hardcoding:
    private void setParametersOnSocDTOForSocAddition(String sServiceCode, SP_input_IDS in_dset, int serviceIndex, SocDTO socDTO,
                                                     SocsDTO socsDTO) throws ClientException {

        String socCode = socDTO.getCode();

        Hashtable hAdtParms = (Hashtable) in_dset.getValue(SP_input_IDS.SERVICE_PARAM, serviceIndex, null);

        //GLL: more hardcoding and therefore potential problems/inconsistencies in the interpretation of the database.
        //     specifically, we now have DATAA, DATAVMA, DATAVMI, DATAHSVS and DATA in the sp_services_mapping table
        //     so should this logic apply to some of those too? (Don't think so actually.)
        if (sServiceCode.equals("DATA")) {
            // .. handle DATA separately because it has 2 same parameter code on 2 features
            //(GLL: because our data model - ie  sp_services_mapping/sp_features_mapping - misses out the feature level,
            //      which doesn't work in this case. For the DATA service both ISDN and ASYN map to the MSISDN parameter.
            //      This forces us to HARDCODE the FEATURE code below. But if that's reliable we could add it to the
            //      sp_features_mapping table, and if not we have a problem here too!!
            //ToDo (gll): As just described - can't this be handled by just adding the ninja_feature_code to the sp_features_mapping table??

            if (hAdtParms != null) { //ToDo (GLL): so we don't do this (including the mandatory checks) if there are no params specified... (WTF?)
                //ToDo (GLL): Isn't this just a mandatory parameters check? (Is handled by the core, or it's a bug if not.) In fact
                //     they're ALSO specified as such in the sp_features_mapping table!!:
                if (!hAdtParms.containsKey("ASYN") || !hAdtParms.containsKey("ISDN")) {
                    ExceptionHelper.throwClientException(ExceptionHelper.MPETYPE, ExceptionHelper.MPE000006, "Field SERVICE_PARAM - index - " + serviceIndex + " - Must contain entries for 'ASYN' & 'ISDN'");
                }

                String sParamValue = (String) hAdtParms.get("ASYN");
                //ToDo (GLL): this validation should clearly be in the database (but consider ISDN / ASYN in error message)
                if (sParamValue == null || !sParamValue.startsWith(CTN_LEAD_DIGITS) || sParamValue.length() != 11) {
                    ExceptionHelper.throwClientException(ExceptionHelper.MPETYPE, ExceptionHelper.MPE000006, "Field SERVICE_PARAM - index - " + serviceIndex + " - Value for ISDN is invalid");
                }
                //..Set Value for B-DA26 - MSISDN. ToDo (GLL): Why isn't this add done with socsDTO.setParameterValue() as below? (Validation diff?)
                String sFeatureCode = "B-DA26";
                String sNinjaParamCode = "MSISDN";
                FeatureDTO featureDTO = socDTO.getFeatureDTO(sFeatureCode);
                FeatureParameterDTO featureParameterDTO = featureDTO.getFeatureParameterDTO(sNinjaParamCode);
                featureParameterDTO.setValue(sParamValue);

                sParamValue = (String) hAdtParms.get("ISDN");
                //ToDo (GLL): this validation should clearly be in the database (but consider ISDN / ASYN in error message)
                if (sParamValue == null || !sParamValue.startsWith(CTN_LEAD_DIGITS) || sParamValue.length() != 11) {
                    ExceptionHelper.throwClientException(ExceptionHelper.MPETYPE, ExceptionHelper.MPE000006, "Field SERVICE_PARAM - index - " + serviceIndex + " - Value for ASYN is invalid");
                }
                //..Set Value for ISDN96 - MSISDN. ToDo (GLL): Why isn't this add done with socsDTO.setParameterValue() as below? (Validation diff?)
                sFeatureCode = "ISDN96";
                sNinjaParamCode = "MSISDN";
                featureDTO = socDTO.getFeatureDTO(sFeatureCode); //Hardcoded feature code
                featureParameterDTO = featureDTO.getFeatureParameterDTO(sNinjaParamCode);
                featureParameterDTO.setValue(sParamValue);
            }
        } //end of section for "DATA service code

        else { //ie NOT data, ie anything else - standard processing:
            //ToDo: This section almost identical to the modification version. Look at setupRegularServices() too...
            String sFeatureCode = null;
            String sNinjaParamCode = null;
            if (hAdtParms != null) { //In the modification version we complain about it being null
                Enumeration servParmKeys = hAdtParms.keys();
                while (servParmKeys.hasMoreElements()) {
                    String sSPParamCode = (String) servParmKeys.nextElement();

                    //Modification version has hardcoding for voicemail password here

                    // get Ninja parameter code according to the parameter code, sent by SP
                    sNinjaParamCode = getNinjaParameterCode(sSPParamCode, sServiceCode);
                    sFeatureCode = socDTO.getFeatureCode(sNinjaParamCode); //ToDo (GLL): this is the line that won't work with 2 params with same name on diff features on same soc (ie for "DATA")
                    //if (log.isDebugEnabled()) { log.debug("Feature Code = [" + sFeatureCode + "]"); }
                    String sParamValue = (String) hAdtParms.get(sSPParamCode);

                    if (!socsDTO.setParameterValue(socCode, sFeatureCode, sNinjaParamCode, sParamValue)) {
                        ExceptionHelper.throwClientException(ExceptionHelper.PEETYPE, ExceptionHelper.PEE000045,
                                "Unable to set the Service Feature for " + sServiceCode + " - index - " + serviceIndex + " - "
                                        + sSPParamCode + " - " + sParamValue);
                    }

                }
            }
        } //end of else, ie "not DATA" section (ie standard processing)

    } // end setParametersOnSocDTOForSocAddition()


    //GLL (18/05/2007): Method extracted from modifySubProfile()
    //Sets parameters on the SocDTO passed in, ie for a single soc, for a soc modifcation.
    //ToDo: Get rid of the hardcoding:
    private void setParametersOnSocDTOForSocModification(String sServiceCode, SP_input_IDS in_dset, int serviceIndex, SocDTO socDTO,
                                                         SocsDTO socsDTO) throws ClientException {

        String socCode = socDTO.getCode();

        Hashtable hAdtParms = (Hashtable) in_dset.getValue(SP_input_IDS.SERVICE_PARAM, serviceIndex, null);
        if (hAdtParms == null) {
             //GLL: The message should say "you're trying to modify the service but you've specified no parameter values":
            ExceptionHelper.throwClientException(ExceptionHelper.MPETYPE, ExceptionHelper.MPE000006,
                    "Field SERVICE_PARAM - index - " + serviceIndex + " - is empty or non-existent");
        }

        //Start of voicemail / password validation hack: it is only allowed to change password for Voicemail
        //(GLL: and so they're saying that therefore if you modify a VM soc you must provide a value for its only modifiable feature.
        //     They don't seem to impose a similar restriction on other socs though...
        //     *** Problem is this kind of redefines what "mandatory" means in the feature_parameters table.
        //     *** I really think this should be handled in the core.)
        //13/01/09 (GLL): Had to further hack this to ensure the same restriction is not applied to VMMINI(VS)
        if (Soc.NINJA_TYPE_VOICEMAIL.equals(socDTO.getType()) && !"VMMINI".equals(socDTO.getGroup())) {
            if (!hAdtParms.containsKey("PASSWD")) {
                ExceptionHelper.throwClientException(ExceptionHelper.MPETYPE, ExceptionHelper.MPE000006,
                        "Field SERVICE_PARAM - index - " + serviceIndex + " - Must contain entry for 'PASSWD'");
            }
            //ToDo (GLL): This PASSWD validation should CLEARLY be specified in the database and implemented in the FeatureParameter class.
            //ToDo (cont): presumably it's not done in BBL, batch jobs, etc. (Or it is and is therefore duplicated.)
            String sParamValue = (String) hAdtParms.get("PASSWD");
            if (sParamValue == null || sParamValue.length() != 4) {
                ExceptionHelper.throwClientException(ExceptionHelper.MPETYPE, ExceptionHelper.MPE000006,
                        "Field SERVICE_PARAM - index - " + serviceIndex + " - Value for PASSWD is invalid");
            }
            //Now let's check it's a positive integer:
            try {
                if (Integer.parseInt(sParamValue) < 0) {
                    ExceptionHelper.throwClientException(ExceptionHelper.MPETYPE, ExceptionHelper.MPE000006,
                            "Field SERVICE_PARAM - index - " + serviceIndex + " - Value for PASSWD is invalid");
                }
            } catch (NumberFormatException e) {
                ExceptionHelper.throwClientException(ExceptionHelper.MPETYPE, ExceptionHelper.MPE000006,
                        "Field SERVICE_PARAM - index - " + serviceIndex + " - Value for PASSWD is invalid");
            }
        } //end voicemail / password validation hack (for now)

        //Crappy validation over - let's do some real work:
        String sFeatureCode = null;
        String sNinjaParamCode = null;
        Enumeration servParmKeys = hAdtParms.keys();
        while (servParmKeys.hasMoreElements()) {
            String sSPParamCode = (String) servParmKeys.nextElement();

            //if (log.isDebugEnabled()) { log.debug("sSPParamCode = [" + sSPParamCode + "]"); }

            // .. the password's the only parameter you can change for Voicemail, so ignore any other parameters!!
            //ToDo (GLL): It would have been better to implement a modifiable flag (or mode) in the feature parameter class...
            //13/01/09 (GLL): Had to further hack this to ensure the same restriction is not applied to VMMINI(VS)
            if (Soc.NINJA_TYPE_VOICEMAIL.equals(socDTO.getType()) && !"VMMINI".equals(socDTO.getGroup())
                                                                  && !"PASSWD".equals(sSPParamCode))
            {
                continue;
            }

            // get Ninja parameter code according to the parameter code, sent by SP
            sNinjaParamCode = getNinjaParameterCode(sSPParamCode, sServiceCode);
            sFeatureCode = socDTO.getFeatureCode(sNinjaParamCode);
            //if (log.isDebugEnabled()) { log.debug("Feature Code = [" + sFeatureCode + "]"); }
            String sParamValue = (String) hAdtParms.get(sSPParamCode);

            if (!socsDTO.setParameterValue(socCode, sFeatureCode, sNinjaParamCode, sParamValue))
            {
                ExceptionHelper.throwClientException(ExceptionHelper.PEETYPE, ExceptionHelper.PEE000045,
                        "Unable to set the Service Feature for " + sServiceCode + " - index - " + serviceIndex + " - "
                                + sSPParamCode + " - " + sParamValue);
            }
        }  //end loop

    } // end setParametersOnSocDTOForSocModification()


    public SP_output_IDS getSubDetails(SP_input_IDS in_dset) throws ClientException {
        long nStartTime = System.currentTimeMillis();

        checkSpInputIdsNotNull(in_dset);

        SP_output_IDS spOut = null;
        String sSubNo = (String) in_dset.getValue(SP_input_IDS.SUB_NO, null);
        String sSimNo = (String) in_dset.getValue(SP_input_IDS.SIM_NO, null);
        String sImsiNo = (String) in_dset.getValue(SP_input_IDS.IMSI_NO, null);
        if (sSubNo == null && sSimNo == null && sImsiNo == null) {
            ExceptionHelper.throwClientException(ExceptionHelper.MPETYPE, ExceptionHelper.MPE000006, "Either field SUB_NO, SIM_NO or IMSI_NO must be supplied.");
        }
        try {
            //ToDo (GLL): put this sim/imsi stuff in the new method to get and validate sub (in ToDo 15 lines below)
            if (sSubNo == null) {
                //..find the sub number for the sim number ...  TODO .. replace with tux call
                if (sSimNo != null) {
                    sSubNo = getSubForSim(sSimNo);
                    if (sSubNo == null) {
                        ExceptionHelper.throwClientException(ExceptionHelper.PEETYPE, ExceptionHelper.PEE000000, "SIM " + sSimNo + " is currently not assigned to any subscription");
                    }
                } else {
                    sSubNo = getSubForImsi(sImsiNo);
                    if (sSubNo == null) {
                        ExceptionHelper.throwClientException(ExceptionHelper.PEETYPE, ExceptionHelper.PEE000000, "IMSI " + sImsiNo + " is currently not assigned to any subscription");
                    }
                }

            }

            //ToDo (GLL 18/01/2007): replace inline code with this call: getBanAndSubscriptionAndSetInstanceVariablesToThem(sCtn, this.user, this.sDlrCode);
            //ToDo (cont). It's not quite that simple though - see the try catch below
            // Instansiate Ban using subscriber number
            this.ban = (Ban) BanFactory.getExistingBan(sSubNo, this.user);
            this.ban.getUser().setDealer(this.sDlrCode);
            this.ban.getUser().setSalesAgent("A");
            // Instanciate subscription
            this.sub = this.ban.getSubscription(sSubNo, false);

            //..Is this Sub for this service Provider??
            try {
                verifyDealerForSubscription(this.sub);
            } catch (ClientException e) {
                if (log.isDebugEnabled()) {
                    log.debug("getSubDetails: failed to verify dealer, check for future porting request...");
                }
                //ToDo (GLL): This is only executed as a result of a failure to verify the sub for the dealer - so they
                //ToDo (cont): can see the port details even though it's not ported yet presumably.
                //Check if there is a future move for this subscription and populate details from the clob.
                // If there is no a future move rethrow the exception, received from verifyDealerForSubscription()
                ServiceProviderNetwork serviceProviderNetwork = new ServiceProviderNetwork(this.user, this.sOperatorCode);
                TimePortActionDetailsDTO timePortActionDetailsDTO = null;
                try {
                    timePortActionDetailsDTO = serviceProviderNetwork.getFutureMoveDetails(sub.getCtn().getNumber());
                } catch (NinjaException e1) {
                    ExceptionHelper.throwClientException(ExceptionHelper.PEETYPE, ExceptionHelper.PEE000009, "Error while trying to retrieve port request due to - " + e1);
                }
                if (timePortActionDetailsDTO != null) {
                    spOut = populateSPSubDetailsForFutureMove(timePortActionDetailsDTO, serviceProviderNetwork.getNinjaRefId());
                    this.writeLogInfo("getSubDetails for future porting", nStartTime, System.currentTimeMillis());

                    return spOut;
                } else {
                    ExceptionHelper.throwClientException(e);
                }

            } //end catch

            spOut = populateSPOutputIDSFromSubDetails(this.sub);
        } catch (NinjaException ne) {
            ExceptionHelper.throwClientException(ne);
        }

        this.writeLogInfo("getSubDetails", nStartTime, System.currentTimeMillis());

        return spOut;
    }

    //Creates, populates and returns an instance of the SP_output_IDS from the subscriber details.
    private SP_output_IDS populateSPOutputIDSFromSubDetails(Subscription sub) throws ClientException {

        SP_output_IDS spOutIDS = null;

        //All wrapped in a try block to convert all (Ninja) exceptions to clientexception:
        try {
            spOutIDS = new SP_output_IDS();

            SIMCard simcard = sub.getEquipmentManager().getPrimarySIMCard();
            SIMCardListDTO simCardListDTO = sub.getEquipmentManager().getSIMCardListDTO();
            if (log.isDebugEnabled()) {
                log.debug("simCardListDTO = " + simCardListDTO);
            }

            //..get the sub profile structure
            SocsDTO socsDTO = null;
            try {
                socsDTO = sub.getSocsDTO();
                if (log.isDebugEnabled()) {
                    log.debug("Subscription[" + sub.getNumber() + "] \nSocList[" + socsDTO + "]");
                }
            } catch (Exception e) {
                log.error("Get Socs DTO??? Why..", e);
            }


            if (socsDTO == null) {
                ExceptionHelper.throwClientException(ExceptionHelper.PEETYPE, ExceptionHelper.PEE000009, "Error Retrieving Subscriber Service Details");
            }

            if (log.isDebugEnabled()) {
                log.debug("SocsDTO = " + socsDTO.toString());
            }
            //..Set the Sub Details in the sp output ids
            spOutIDS.setValue(SP_output_IDS.SUBSCRIBER_NO, sub.getNumber());
            try {
                spOutIDS.setValue(SP_output_IDS.SUB_CTN, sub.getCtn().getNumber());
            } catch (NinjaException e) {
                ExceptionHelper.throwClientException(ExceptionHelper.PEETYPE, ExceptionHelper.PEE_SYSTEM_ERROR_OCCURRED, "Retrieving CTN Details: Caused by : " + e.getClass() + " : " + e.getMessage());
            }
            spOutIDS.setValue(SP_output_IDS.SUB_STATUS, sub.getStatus());
            spOutIDS.setValue(SP_output_IDS.SUB_STATUS_DATE, sub.getStatusDate());
            spOutIDS.setValue(SP_output_IDS.SUB_ACT_DATE, TypeConverter.dateToString(sub.getInitActivationDate(), TypeConverter.DATE_FORMAT_SIMPLE));

            if (simCardListDTO != null) {
                try {
                    SIMCardListDTO additionalSimCardListDTO = simCardListDTO.getExistingAdditionalSIMCardListDTO();
                    ArrayList simCardDTOList = additionalSimCardListDTO.getSimCardDTOList();
                    for (int i = 0; i < simCardDTOList.size(); i ++) {
                        SIMCardDTO simCardDTO = (SIMCardDTO) simCardDTOList.get(i);
                        spOutIDS.setValue(SP_output_IDS.ADDITIONAL_SIM_NOS, i, simCardDTO.getNumber());
                        spOutIDS.setValue(SP_output_IDS.ADDITIONAL_SIM_IMSI, i, simCardDTO.getImsi());
                        spOutIDS.setValue(SP_output_IDS.ADDITIONAL_SIM_EFFECTIVE_DATE, i, TypeConverter.dateToString(simcard.getEffectiveDate(), TypeConverter.DATE_FORMAT_COMPLEX));
                        spOutIDS.setValue(SP_output_IDS.ADDITIONAL_SIM_CTN, i, simCardDTO.getAssociatedPhoneNumber());
                        String receivesCloning = "N";
                        if (simCardDTO.receivesClonedSMSFromPrimary()) {
                            receivesCloning = "Y";
                        }
                        spOutIDS.setValue(SP_output_IDS.ADDITIONAL_SIM_CLONING, i, receivesCloning);
                        spOutIDS.setValue(SP_output_IDS.ADDITIONAL_SIM_PUK, i, simCardDTO.getPuk());
                    }
                } catch (NinjaDTOValidationException e) {
                    ExceptionHelper.throwClientException(ExceptionHelper.PEETYPE, ExceptionHelper.PEE000009, "Error Retrieving Additional SIM Cards Details");
                }
            }

            if (simcard == null) {
                spOutIDS.setValue(SP_output_IDS.EQUIPMENT_NO, null);
                spOutIDS.setValue(SP_output_IDS.IMSI, null);
                spOutIDS.setValue(SP_output_IDS.PUK, null);
            } else {
                spOutIDS.setValue(SP_output_IDS.EQUIPMENT_NO, simcard.getNumber());
                spOutIDS.setValue(SP_output_IDS.IMSI, simcard.getIMSI());
                spOutIDS.setValue(SP_output_IDS.SIM_EFFECTIVE_DATE, TypeConverter.dateToString(simcard.getEffectiveDate(), TypeConverter.DATE_FORMAT_COMPLEX));
                spOutIDS.setValue(SP_output_IDS.ITEM_ID, simcard.getItemId());
                spOutIDS.setValue(SP_output_IDS.PUK, simcard.getPuk());
            }
            spOutIDS.setValue(SP_output_IDS.PRICE_PLAN, socsDTO.getPricePlanCode());

            //System.out.println("SP SocsIDS - " + socsIDS);

            List socs = socsDTO.getSocs();
            for (int i = 0; i < socs.size(); i++) {
                SocDTO socDTO = (SocDTO) socs.get(i);

                String sServ = socDTO.getCode();
                if (sServ == null) {
                    continue;
                }
                if (log.isDebugEnabled()) {
                    log.debug("Processing Retrieved Service - " + socDTO.toString());
                }
                String sDisplayable = socDTO.getDisplayable();
                //..don't pass back any non-displayable..
                if (sDisplayable == null || sDisplayable.equals("N")) {
                    continue;
                }

                // Get SP service code according to soc type and group
                // get soc type and group from SP_SERVICES_MAPPING reference table
                SPServicesMappingReferenceTable.ServiceMapping serviceMappingRec = SPServicesMappingReferenceTable.getServiceCode(socDTO.getType(), socDTO.getGroup());
                if (serviceMappingRec == null) {
                    log.error("Failed to find mapping in SP_SERVICES_MAPPING table for soc type " + socDTO.getType() + " and group " + socDTO.getGroup() + " and user " + this.user.getNinjaUser());
                    continue;
                }
                String spServiceCode = serviceMappingRec.getServiceCode();

                Hashtable hServParm = new Hashtable();
                if (spServiceCode != null) {
                    if (spServiceCode.equals("DATA")) {
                        // Handle DATA separatly because it has 2 features with same parameter code.

                        //System.out.println("DATA - " + sServ);
                        //System.out.println("Parameters - " + socsIDS.getValue(SocsIDS.SOC_FEATURE_CODE, i, null));
                        //System.out.println("ASYN = " + socsIDS.getParameterValue(sServ, "B-DA26", "MSISDN"));
                        //System.out.println("ISDN = " + socsIDS.getParameterValue(sServ, "ISDN96", "MSISDN"));

                        FeatureDTO featureDTO = socDTO.getFeatureDTO("B-DA26");
                        FeatureParameterDTO parameterDTO = ((featureDTO == null) ? null : featureDTO.getFeatureParameterDTO("MSISDN"));
                        String sTmpVal = ((parameterDTO == null) ? null : parameterDTO.getValue());
                        hServParm.put("ASYN", (sTmpVal != null) ? sTmpVal : "");
                        featureDTO = socDTO.getFeatureDTO("ISDN96");
                        parameterDTO = ((featureDTO == null) ? null : featureDTO.getFeatureParameterDTO("MSISDN"));
                        sTmpVal = ((parameterDTO == null) ? null : parameterDTO.getValue());
                        hServParm.put("ISDN", (sTmpVal != null) ? sTmpVal : "");
                        //System.out.println("hServParm = " + hServParm);
                        sServ = "DATA";

                    } else {
                        List featureDTOList = socDTO.getFeatures();
                        for (int j = 0; j < featureDTOList.size(); j++) {
                            FeatureDTO featureDTO = (FeatureDTO) featureDTOList.get(j);

                            List featureParameterDTOList = featureDTO.getParameters();
                            for (int k = 0; k < featureParameterDTOList.size(); k++) {
                                FeatureParameterDTO featureParameterDTO = (FeatureParameterDTO) featureParameterDTOList.get(k);
                                String sNinjaParmCode = featureParameterDTO.getCode();
                                if (log.isDebugEnabled()) {
                                    log.debug("Ninja Param code = " + sNinjaParmCode + ", displayable = " + featureParameterDTO.getDisplayable());
                                }

                                // If parameter is displayable get SP parameter code and set the value
                                if ("Y".equals(featureParameterDTO.getDisplayable())) {
                                    String sSpParamCode = getSPParameterCode(sNinjaParmCode, spServiceCode);
                                    String sParmValue = featureParameterDTO.getValue();
                                    if (sSpParamCode != null && sParmValue != null) {
                                        hServParm.put(sSpParamCode, sParmValue);
                                    } else {
                                        log.error("Failed to add parameter " + sSpParamCode + " with value " + sParmValue + " for service " + spServiceCode);
                                    }
                                }
                            }

                        }
                    }
                }
                int nOutServ = spOutIDS.getCount(SP_output_IDS.SERVICE);
                spOutIDS.setValue(SP_output_IDS.SERVICE, nOutServ, spServiceCode);
                Hashtable hServParmsOut = (Hashtable) hServParm.clone();
                spOutIDS.setValue(SP_output_IDS.SERVICE_PARAM, nOutServ, hServParmsOut);
                hServParm.clear();
                Date effectiveDate = socDTO.getEffectiveDate();
                String effectiveDateString = TypeConverter.dateToString(effectiveDate, TypeConverter.DATE_FORMAT_SIMPLE);
                spOutIDS.setValue(SP_output_IDS.SERVICE_ACT_DATE, nOutServ, effectiveDateString);
            }
        } catch (NinjaException e) {
            ExceptionHelper.throwClientException(e);
        }

        return spOutIDS;
    } //end populateSPOutputIDSFromSubDetails()


    /**
     *
     * @param sub
     * @throws ClientException
     * @deprecated Use verifySubscriptionForSP() instead
     */
    //ToDo(GLL 18/01/2007): Used in 12 methods (13 calls) - Only 2 now!!!
    private void verifyDealerForSubscription(Subscription sub) throws ClientException {
        verifySubscriptionForSP(sub, this.sLast_Business_Name, this.sDlrCode, this.sAccSubType);
    }


    //ToDo (GLL 18/01/2007): try to merge this and NinjaTimePorter.validateSubscriptionBelongsToServiceProvider() as they do basically the same thing (and have some of the same hardcoding)
    private void verifySubscriptionForSP(Subscription sub, String spLastBusinessName, String spDealerCode, String spAccSubType) throws ClientException {
        //..Special Case for You Pre-Paid
        //ToDo (GLL 18/01/2007): Can we get rid of this test? (Is You Prepaid Change still used?) Only thing that prevents this method from being static
        //ToDo (GLL 18/01/2007): this is the only place it's used!!
        if (isYouPPChange()) { return; }

        //sCTN is only used in Exception text:
        String sCTN = null;
        try {
            sCTN = sub.getCtn().getNumber();
        } catch (NinjaException e) {
            ExceptionHelper.throwClientException(ExceptionHelper.PEETYPE, ExceptionHelper.PEE_SYSTEM_ERROR_OCCURRED, "Retrieving CTN Details: Caused by : " + e.getClass() + " : " + e.getMessage());
        }

        //..Check that the Account Type is an SP...
        if ( !"S".equals(sub.getBan().getAccountType()) ) {
            ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000001, sCTN + " does not belong to " + spLastBusinessName);
        }

        //Get the subscriptions's dealer code:
        String subDealerCode = null;
        try {
            subDealerCode = sub.getDealer().getCode();
        } catch (NinjaException e) {
            ExceptionHelper.throwClientException(ExceptionHelper.PEETYPE, ExceptionHelper.PEE_SYSTEM_ERROR_OCCURRED, "Retrieving CTN Details: Caused by : " + e.getClass() + " : " + e.getMessage());
        }

        //Special cases (bodges) to allow
        // a) Sense to access old Enitel subscriptions (all cancelled now?)
        // b) Chess to access Sense customers (added by GL 15/08/06)
        if ("EN01".equals(subDealerCode) && "SC01".equals(spDealerCode)) { return; }
        if ("SC01".equals(subDealerCode) && "CH01".equals(spDealerCode)) { return; }

        //Special cases (bodges) to allow the two Chess users to see each other's stuff:
        if ("CH".equals(sub.getBan().getAccountSubType()) && "C2".equals(spAccSubType)) { return; }
        if ("C2".equals(sub.getBan().getAccountSubType()) && "CH".equals(spAccSubType)) { return; }
        // end bodge

        // Check that the subscription still belongs to this SP by checking the account sub type
        if (!sub.getBan().getAccountSubType().equals(spAccSubType)) {
            ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000001, sCTN + " does not belong to " + spLastBusinessName);
        }

        //Now that the acc sub type check is above this, is this necessary?:
        if (!subDealerCode.equalsIgnoreCase(spDealerCode)) {
            ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000001, sCTN + " is not registered to dealer " + spDealerCode);
        }
    } //end verifySubscriptionForSP()


    //..quick hack to retrive the ctn for a given sim card...  TODO.. Replace with call to ban......
    private String getSubForSim(String sSimNo) throws NinjaException {
        String sSubNo;
        //inl 28.12.2007 - getSubscriberForSim method not always returns correct subscriber. TD1964
        //sSubNo = NinjaFBI.getSubscriberForSim(sSimCard, this.user.getFokusOperatorId());
        sSubNo = NinjaFBI.getCurrentSubscriberForSimOrImsi(sSimNo,null);
        if (sSubNo != null) {
            sSubNo = sSubNo.substring(3);
        }

        return sSubNo;
    }

    private String getSubForImsi(String sImsiNo) throws NinjaException {
        String sSubNo;
        sSubNo = NinjaFBI.getCurrentSubscriberForSimOrImsi(null,sImsiNo);
        if (sSubNo != null) {
            sSubNo = sSubNo.substring(3);
        }

        return sSubNo;
    }


    private void writeLogInfo(String sMethodName, long nStartTime, long nEndTime) {
        String sThreadName = Thread.currentThread().getName();
        if (log.isInfoEnabled()) {
            log.info("SPL | " +
                    sMethodName + " | " +
                    this.user.getNinjaUser() + " | " +
                    (nEndTime - nStartTime) + " | " +
                    ExecutionTimes.getTime(sThreadName, "JOLT_CONN") + " | " +
                    ExecutionTimes.getTime(sThreadName, "TUX_CALL") + " | " +
                    ExecutionTimes.getTime(sThreadName, "JDBC_CONN") + " | " +
                    ExecutionTimes.getTime(sThreadName, "JDBC_SELECT"));
        }
    }

    /**
     * Writes performance statistice to logfile
     */
    private void writeLogInfo(String sMethodName, long nStartTime, long nEndTime, Object input, Object output) {
        String sThreadName = Thread.currentThread().getName();
        if (log.isDebugEnabled()) {
            log.debug("SPL | " +
                    sMethodName + " | " +
                    this.user.getNinjaUser() + " | " +
                    (nEndTime - nStartTime) + " | " +
                    ExecutionTimes.getTime(sThreadName, "JOLT_CONN") + " | " + ExecutionTimes.getTime(sThreadName, "TUX_CALL") + " | " +
                    ExecutionTimes.getTime(sThreadName, "JDBC_CONN") + " | " + ExecutionTimes.getTime(sThreadName, "JDBC_SELECT") + "\n" +
                    "input - " + input + "\n" +
                    "output - " + output);
        } else if (log.isInfoEnabled()) {
            log.info("SPL | " +
                    sMethodName + " | " +
                    this.user.getNinjaUser() + " | " +
                    (nEndTime - nStartTime) + " | " +
                    ExecutionTimes.getTime(sThreadName, "JOLT_CONN") + " | " + ExecutionTimes.getTime(sThreadName, "TUX_CALL") + " | " +
                    ExecutionTimes.getTime(sThreadName, "JDBC_CONN") + " | " + ExecutionTimes.getTime(sThreadName, "JDBC_SELECT"));
        }
    }

    /**
     * little temp routine to return the current voicemail soc for an existing SocsIDS (ToDo(GLL): Method never used!!)
     *
     * @param socsDTO
     * @return
     */
    private String whichVoiceMail(SocsDTO socsDTO) {
        String sVoiceMailCode = null;
        //..Check which VoiceMail product they have??
        if (socsDTO != null) {
            List socDTOList = socsDTO.getSocs();
            for (int i = 0; i < socDTOList.size(); i++) {
                SocDTO socDTO = (SocDTO) socDTOList.get(i);
                String sTmpSocCode = socDTO.getCode();
                if (sTmpSocCode == null) {
                    continue;
                }
                if (sTmpSocCode.startsWith("VM")) {
                    sVoiceMailCode = sTmpSocCode;
                    break;
                }
            }
        }
        log.debug("real Voice Mail Code = " + sVoiceMailCode);
        return sVoiceMailCode;
    }

    public boolean isYouPPChange() {
        return youPPChange;
    }

    //GLL 18/01/2007: only used internally (and not part of SP_Remote (thank God) so made private:
    private void setYouPPChange(boolean youPPChange) {
        this.youPPChange = youPPChange;
    }

    public String toString() {
        return "no.netcom.sp.ejb.SP_Business_Logic{" +
                "nManId=" + nManId +
                ", nActBanId=" + nActBanId +
                ", nMaxSubs=" + nMaxSubs +
                ", sDlrCode='" + sDlrCode + "'" +
                ", sNlCode='" + sNlCode + "'" +
                ", sSPshort='" + sSPshort + "'" +
                ", sLanguage='" + sLanguage + "'" +
                ", sAccSubType='" + sAccSubType + "'" +
                ", sOperatorCode='" + sOperatorCode + "'" +
                ", sLast_Business_Name='" + sLast_Business_Name + "'" +
                ", sFirst_Name='" + sFirst_Name + "'" +
                ", sAdr_Country='" + sAdr_Country + "'" +
                ", sAdr_Zip='" + sAdr_Zip + "'" +
                ", sAdr_Street_Name='" + sAdr_Street_Name + "'" +
                ", sAdr_City='" + sAdr_City + "'" +
                ", sAdr_House_Letter='" + sAdr_House_Letter + "'" +
                ", sAdr_House_No='" + sAdr_House_No + "'" +
                ", sAdr_Door_No='" + sAdr_Door_No + "'" +
                ", sAdr_Story='" + sAdr_Story + "'" +
                ", sAdr_Email='" + sAdr_Email + "'" +
                "}";
    }

     /**
     * Retrieve the Event Data Records for a PrePaid Subscriber
     *
     * @param msisdn - full CTN number in format 04749999999
     * @param startDate Date from (if null then defaulted to endDate - 7 Days)
     * @param endDate   Date to (if null then defaulted to today) <strong>(Note: Cannot exceed startDate + 7 Days,
     * in this case then endDate will be set back to startDate + 7 Days)</strong>
     * @return {@link no.netcom.sp.dataset.PrePaidEDRDTOsNew} object containing a List of {@link no.netcom.sp.dataset.PrePaidEDRDTONew} objects.
     * @throws ClientException in the event of server processing errors (SQL Exceptions)
     * @deprecated utilize getPrePaidHistory_new()
     * @since 8.0
     */
    public PrePaidEDRDTOs getPrePaidHistory(String msisdn, Date startDate, Date endDate) throws ClientException {
         //TD1152. GL 24/08/06: Add user validation!!
         //                     It was letting any user see any prepaid history before!!

         this.getBanAndSubscriptionAndSetInstanceVariablesToThem(msisdn, this.user, this.sDlrCode);

        PrePaidEDRDTOs prepaidERDDTOs = new PrePaidEDRDTOs();
        PrePaidEDRDTO prepaidERDDTO = null;

        if (endDate == null) {
            endDate = new Date();
        }
        if (startDate == null) {
            startDate = TypeConverter.add(endDate, TypeConverter.DURATION_UNIT_DAY, -7);
        }

        // check that end date is equal or greater than start date.
        if (startDate.compareTo(endDate) > 0) {
            ExceptionHelper.throwClientException(ExceptionHelper.SYSTYPE,
                    ExceptionHelper.SYS000000, "End date can not be before start date.");
        }

        // check that end date is before or equal to start date + 7 days
        GregorianCalendar startCalendar = new GregorianCalendar();
        startCalendar.setTime(startDate);

        startCalendar.add(Calendar.DATE, 7);

        if (startCalendar.getTime().compareTo(endDate) < 0) {
            startDate = TypeConverter.add(endDate, TypeConverter.DURATION_UNIT_DAY, -7);
        }


        String sSql =
                "select " +
                        "PHONE_NO, " +
                        "TIMESTAMP, " +
                        "ACTION, " +
                        "DURATION, " +
                        "CHARGE, " +
                        "BALANCE " +
                        "from kontant.ninja_prepay_cdr " +
                        "where phone_no = '" + msisdn.substring(1) + "' " +
                        "and timestamp between " +
                        TypeConverter.dateToSQL(startDate, TypeConverter.DATE_FORMAT_COMPLEX, TypeConverter.DATE_FORMAT_COMPLEX_SQL) +
                        " and " +
                        TypeConverter.dateToSQL(endDate, TypeConverter.DATE_FORMAT_COMPLEX, TypeConverter.DATE_FORMAT_COMPLEX_SQL);

        SQLResultSet dbResult = null;
        SQLConnection conn = null;
        try {
            conn = KontantDataSource.getSQLConnection();
            dbResult = conn.executeQuery(sSql, false);
            if (dbResult == null || dbResult.getRowCount() < 1) {
                ExceptionHelper.throwClientException(ExceptionHelper.SYSTYPE,
                        ExceptionHelper.SYS000008,
                        "No PrePaid EDR Records existing for [" + msisdn + "] date Period - " + startDate + " To " + endDate);
            }
            int noofRows = dbResult.getRowCount();
            /** The PrePaid Ctn */
            String ctn = null;
            /** The Date & time of the Event Record */
            Date timestamp = null;
            /** (12) Character String describing the Event record */
            String actionCode = null;
            /** Duration of the Event Record */
            Integer duration = null;
            /** The Charge related to the Event Record (øre) */
            Integer charge = null;
            /** The account balance after appliance of the Event charge to the PrePaid account (øre) */
            Integer balance = null;


            for (int i = 0; i < noofRows; i++) {
                ctn = dbResult.getString("PHONE_NO", i);
                timestamp = dbResult.getDate("TIMESTAMP", i);
                actionCode = dbResult.getString("ACTION", i);
                duration = new Integer(dbResult.getBigDecimal("DURATION", i).intValue());
                charge = new Integer(dbResult.getBigDecimal("CHARGE", i).intValue());
                balance = new Integer(dbResult.getBigDecimal("BALANCE", i).intValue());
                prepaidERDDTO = new PrePaidEDRDTO(ctn, timestamp, actionCode, duration, charge, balance);
                prepaidERDDTOs.addEDRDTO(prepaidERDDTO);
            }
        } catch (Exception e) {
            ExceptionHelper.throwClientException(ExceptionHelper.SYSTYPE,
                    ExceptionHelper.SYS000008, "Caused by :" + e.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                log.error(e);
            }
        }

        return prepaidERDDTOs;
    }

     /**
     * Retrieve the Event Data Records for a PrePaid Subscriber
     *
     * @param msisdn - full CTN number in format 04749999999
     * @param startDate Date from (if null then defaulted to endDate - 7 Days)
     * @param endDate   Date to (if null then defaulted to today) <strong>(Note: Cannot exceed startDate + 7 Days,
     * in this case then endDate will be set back to startDate + 7 Days)</strong>
     * @return {@link no.netcom.sp.dataset.PrePaidEDRDTOsNew} object containing a List of {@link no.netcom.sp.dataset.PrePaidEDRDTONew} objects.
     * @throws ClientException in the event of server processing errors (SQL Exceptions)
     * @since 9.0.3
     */
    public PrePaidEDRDTOsNew getPrePaidHistory_new(String msisdn, Date startDate, Date endDate) throws ClientException {
         //TD1152. GL 24/08/06: Add user validation!!
         //                     It was letting any user see any prepaid history before!!

         this.getBanAndSubscriptionAndSetInstanceVariablesToThem(msisdn, this.user, this.sDlrCode);

        PrePaidEDRDTOsNew prepaidERDDTOsNew = new PrePaidEDRDTOsNew();
        PrePaidEDRDTONew prepaidERDDTO = null;

        if (endDate == null) {
            endDate = new Date();
        }
        if (startDate == null) {
            startDate = TypeConverter.add(endDate, TypeConverter.DURATION_UNIT_DAY, -7);
        }

        // check that end date is equal or greater than start date.
        if (startDate.compareTo(endDate) > 0) {
            ExceptionHelper.throwClientException(ExceptionHelper.SYSTYPE,
                    ExceptionHelper.SYS000000, "End date can not be before start date.");
        }

        // check that end date is before or equal to start date + 7 days
        GregorianCalendar startCalendar = new GregorianCalendar();
        startCalendar.setTime(startDate);

        startCalendar.add(Calendar.DATE, 7);

        if (startCalendar.getTime().compareTo(endDate) < 0) {
            startDate = TypeConverter.add(endDate, TypeConverter.DURATION_UNIT_DAY, -7);
        }

        String sStartDate = TypeConverter.dateToString(startDate, TypeConverter.DATE_FORMAT_COMPLEX);
        String sEndDate = TypeConverter.dateToString(endDate, TypeConverter.DATE_FORMAT_COMPLEX);
        String sSql =
                "select * " +
                        "from kontant.ninja_prepay_cdr_2 " +
                        "where phoneno = '" + msisdn.substring(1) + "' " +
                        "and calltime between '" + sStartDate +
                        "' and '" + sEndDate + "'";

        SQLResultSet dbResult = null;
        SQLConnection conn = null;
        try {
            conn = KontantDataSource.getSQLConnection();
            dbResult = conn.executeQuery(sSql, false);
            if (dbResult == null || dbResult.getRowCount() < 1) {
                ExceptionHelper.throwClientException(ExceptionHelper.SYSTYPE,
                        ExceptionHelper.SYS000008,
                        "No PrePaid EDR Records existing for [" + msisdn + "] date Period - " + startDate + " To " + endDate);
            }
            int noofRows = dbResult.getRowCount();

            if (log.isDebugEnabled()) {
                log.debug("Retrieved " + noofRows + " rows from the DB");
            }

            /** The PrePaid Ctn */
            String ctn = null;
            /** The account balance after appliance of the Event charge to the PrePaid account (øre) */
            Double balance = null;
            Integer seqNo = null;
            String billingType = null;
            String billingTypeDetail = null;
            Date callTime = null;
            Date chargeTime = null;
            String callingLineId = null;
            String calledLineId = null;
            String imsi = null;
            String callDirection = null;
            String callDestinationCountryCd = null;
            String vpmnCountry = null;
            String callType = null;
            String callFeature = null;
            String endUserPricePlan = null;
            String comment = null;
            Double callDuration = null;
            Double callUnits = null;
            Double callCharge = null;
            Date sysCreationDate = null;

            for (int i = 0; i < noofRows; i++) {
                ctn = dbResult.getString("PHONENO", i);
                seqNo = new Integer(dbResult.getBigDecimal("SEQUENCENUMBER", i).intValue());
                billingType = dbResult.getString("BILLINGTYPE", i);
                billingTypeDetail = dbResult.getString("BILLINGTYPEDETAIL", i);
                String sCallTime = dbResult.getString("CALLTIME", i);
                if (sCallTime != null) {
                    callTime = TypeConverter.stringToDate(sCallTime, TypeConverter.DATE_FORMAT_COMPLEX);
                }
                String sChargeTime = dbResult.getString("CHARGETIME", i);
                if (sChargeTime != null) {
                    chargeTime = TypeConverter.stringToDate(sChargeTime, TypeConverter.DATE_FORMAT_COMPLEX);
                }
                callingLineId = dbResult.getString("CALLINGLINEID", i);
                calledLineId = dbResult.getString("CALLEDLINEID", i);
                imsi = dbResult.getString("IMSI", i);
                callDirection = dbResult.getString("CALLDIRECTION", i);
                callDestinationCountryCd = dbResult.getString("CALLDESTINATIONCOUNTRYCODE", i);
                vpmnCountry = dbResult.getString("VPMNCOUNTRY", i);
                callType = dbResult.getString("CALLTYPE", i);
                callFeature = dbResult.getString("CALLFEATURE", i);
                endUserPricePlan = dbResult.getString("ENDUSERPRICEPLAN", i);
                comment = dbResult.getString("L_COMMENT", i);
                endUserPricePlan = dbResult.getString("ENDUSERPRICEPLAN", i);
                BigDecimal bdCallDuration = dbResult.getBigDecimal("CALLDURATION", i);
                if (bdCallDuration != null) {
                    callDuration = new Double(bdCallDuration.doubleValue());
                }
                BigDecimal bdCallUnits = dbResult.getBigDecimal("CALLUNITS", i);
                if (bdCallUnits != null) {
                    callUnits = new Double(bdCallUnits.doubleValue());
                }
                BigDecimal bdCallCharge = dbResult.getBigDecimal("CALLCHARGE", i);
                if (bdCallCharge != null) {
                    callCharge = new Double(bdCallCharge.doubleValue());
                }
                BigDecimal bdBalance = dbResult.getBigDecimal("BALANCE", i);
                if (bdBalance != null) {
                    balance = new Double(bdBalance.doubleValue());
                }
                sysCreationDate = dbResult.getDate("SYS_CREATION_DATE", i);

                prepaidERDDTO = new PrePaidEDRDTONew(ctn,
                        seqNo,
                        billingType,
                        billingTypeDetail,
                        callTime,
                        chargeTime,
                        callingLineId,
                        calledLineId,
                        imsi,
                        callDirection,
                        callDestinationCountryCd,
                        vpmnCountry,
                        callType,
                        callFeature,
                        endUserPricePlan,
                        comment,
                        callDuration,
                        callUnits,
                        callCharge,
                        balance,
                        sysCreationDate);
                prepaidERDDTOsNew.addEDRDTO(prepaidERDDTO);
            }
        } catch (Exception e) {
            ExceptionHelper.throwClientException(ExceptionHelper.SYSTYPE,
                    ExceptionHelper.SYS000008, "Caused by :" + e.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                log.error(e);
            }
        }

        return prepaidERDDTOsNew;
    }

    public SP_output_IDS suspendSubscription(SP_input_IDS in_dset) throws ClientException {
        long nStartTime = System.currentTimeMillis();

        checkSpInputIdsNotNull(in_dset);

        SP_output_IDS spOut = null;
        try {
            //Suspend an active subscription.

            // create Ban with a subNo (from in_dset)
            String sCtn = (String) in_dset.getValue(SP_input_IDS.SUB_NO, null);
            if (sCtn == null) {
                ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field SUB_NO - is empty or non-existent");
            }

            this.getBanAndSubscriptionAndSetInstanceVariablesToThem(sCtn, this.user, this.sDlrCode);

            // suspend it
            this.sub.suspend(Memo.ACTIVITY_REASON_CODE_SUBSCRIPTION_OTHER,
                    FokusDates.getLogicalDate(),
                    "Suspension from Service Provider.",
                    null,
                    "F");
            //..refresh the sub..
            this.sub = this.ban.getSubscription(sCtn, false);

            //..Check the status
            if (!this.sub.getStatus().equals("S")) {
                ExceptionHelper.throwClientException(ExceptionHelper.PEETYPE, ExceptionHelper.PEE_ERROR_CHANGING_SUB_STATUS, "Unable to Suspend Subscription.");
            }

            spOut = populateSPOutputIDSFromSubDetails(this.sub);
        } catch (NinjaException e) {
            ExceptionHelper.throwClientException(e);
        }

        this.writeLogInfo("suspendSubscription", nStartTime, System.currentTimeMillis(), in_dset, spOut);

        return spOut;
    }

    public SP_output_IDS resumeCancelledSubscription(SP_input_IDS in_dset) throws ClientException {
        if (log.isDebugEnabled()) {
            log.debug("Entering SP_Business_Logic.resumeCancelledSubscription - " + in_dset);
        }

        SP_output_IDS spOut = null;

        long nStartTime = System.currentTimeMillis();

        checkSpInputIdsNotNull(in_dset);

        //..simple validation of the input datset
        String sSubCtn = (String) in_dset.getValue(SP_input_IDS.SUB_NO, null);
        if (sSubCtn == null) {
            ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field SUB_NO - is empty or non-existent");
        }
        if (!sSubCtn.startsWith(NinjaConfigurationReferenceTable.getSystemCountryNumberPrefix()) || sSubCtn.length() != 11)
        {
            ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field SUB_NO - " + sSubCtn);
        }

        this.getBanAndSubscriptionAndSetInstanceVariablesToThem(sSubCtn, this.user, this.sDlrCode);

        //////////////////////////////////////// SPECIAL CASE FOR YOU ////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////
        //.. They'll be sending Pre-Paid Price Plan Changes as a new Activation
        if (this.sUser.equals("YouTPlus")) {
            if (log.isInfoEnabled()) {
                log.info("YOU is back - Entering SP_Business_Logic.resumeCancelledSubscription - " + in_dset);
            }
            if (isYouPPConversion(in_dset)) {
                //ToDo (GLL 18/01/2007): resultant value only ever used in verification that EXISTING sub is ok for this SP, AND WE'VE ALREADY CALLED THAT, so it's a bit late here!!
                //ToDo (GLL 18/01/2007): this perfectly illustrates too much use of instance variables. Parameter better.
                setYouPPChange(true);

                SP_output_IDS spOutIDS = new SP_output_IDS();
                SP_input_IDS youPPconvert = new SP_input_IDS();
                youPPconvert.setValue(SP_input_IDS.SUB_NO, sSubCtn);
                youPPconvert.setValue(SP_input_IDS.NEW_PRICE_PLAN, in_dset.getValue(SP_input_IDS.PRICE_PLAN, null));
                spOutIDS = changePricePlan(youPPconvert);
                int nNoofServs = in_dset.getCount(SP_input_IDS.SERVICE);
                if (nNoofServs > 0) {
                    SP_input_IDS youAddServs = new SP_input_IDS();
                    youAddServs.setValue(SP_input_IDS.SUB_NO, sSubCtn);
                    for (int i = 0; i < nNoofServs; i++) {
                        youAddServs.setValue(SP_input_IDS.SERVICE, i, in_dset.getValue(SP_input_IDS.SERVICE, i, null));
                        youAddServs.setValue(SP_input_IDS.SERVICE_PARAM, i, in_dset.getValue(SP_input_IDS.SERVICE_PARAM, i, null));
                        youAddServs.setValue(SP_input_IDS.SUB_SERVICE_ACTION, i, in_dset.getValue(SP_input_IDS.SUB_SERVICE_ACTION, i, null));
                    }
                    spOutIDS = modifySubProfile(youAddServs);
                }
                return spOutIDS;
            }
        }


        String sNewSimNr = (String) in_dset.getValue(SP_input_IDS.SIM_NO, null);
        String sSimNr = null;
        EquipmentManager equipmentManager = null;
        try {
            equipmentManager = this.sub.getEquipmentManager();
            sSimNr = equipmentManager.getPrimarySIMCard().getNumber();
        } catch (NinjaException e) {
            ExceptionHelper.throwClientException(ExceptionHelper.PEETYPE, ExceptionHelper.PEE000048, "Eqiupment number can't be changed during resume operation");
        }
        if (sNewSimNr != null && !sNewSimNr.equals(sSimNr)) {
            ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field SIM_NO - can't be changed during this operation.");
        }

        String sPP = (String) in_dset.getValue(SP_input_IDS.PRICE_PLAN, null);
        if (sPP == null) {
            ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field PRICE_PLAN - Empty");
        }

        String channelCode = null;

        try {
            channelCode = this.user.getChannel().getChannelCode();
        } catch (ChannelException e) {
            log.error("No SP Channel Code", e);
            ExceptionHelper.throwClientException(ExceptionHelper.SYSTYPE, ExceptionHelper.SYS000008, "Could not get information for service provider: '" + this.sUser + "'");
        }

        //GLL (21/02/2007): extracted method - called from 2 places!!
        SubscriptionTypeDTO subscriptionTypeDTO = getPriceplanBelongingToSP(channelCode, sPP);

        //..Create a SocsDTO to pass in...
        SocsDTO socsDTO = null;
        try {
            socsDTO = NinjaBusinessRules.getAvailableSocs(channelCode, subscriptionTypeDTO.getSubscriptionTypeId(), this.sDlrCode, "A", null, null);
        } catch (NinjaException e) {
            ExceptionHelper.throwClientException(ExceptionHelper.PEETYPE, ExceptionHelper.PEE000000, "Error Encountered with Configuration DataBase.");
        }

        if (log.isDebugEnabled()) {
            log.debug("SocsIDS Prior to setting Defaults - " + socsDTO);
        }

        /*if (this.sUser.equals("MAING1")) {
            setupMaingateServices(in_dset, socsDTO);
        } else {
            setupRegularServices(in_dset, socsDTO);
            if (log.isDebugEnabled()) {
                log.debug("After setupRegularServices - " + socsDTO.toString());
            }
        } */

        //Set up the services (socs) specified in the user input, by modifying the SocsDTO:
        setupRegularServices(in_dset, socsDTO);
        if (log.isDebugEnabled()) {
            log.debug("After setupRegularServices - " + socsDTO.toString());
        }

        //.. create ActivateSubscriptionDTO..
        ActivateSubscriptionDTO activateSubscriptionDTO = null;

        try {
            activateSubscriptionDTO = new ActivateSubscriptionDTO(Campaign.CODE_NONE, false, socsDTO);

        } catch (NinjaDTOValidationException e) {
            ExceptionHelper.throwClientException(e);
        }

        //..attempt to resume cancelled subscription
        try {
            ArrayList addtionalSimCardDTOList = new ArrayList();
            int nNoofSims = in_dset.getCount(SP_input_IDS.ADDITIONAL_SIM_NOS);
            for (int i = 0; i < nNoofSims; i++) {
                String tmpSimNo = (String) in_dset.getValue(SP_input_IDS.ADDITIONAL_SIM_NOS, i, null);
                if (log.isDebugEnabled()) {
                    log.debug("Additonal sim [" + i + "] = '" + tmpSimNo + "'");
                }
                SIMCardDTO simCardDTO = new SIMCardDTO(tmpSimNo, false);
                addtionalSimCardDTOList.add(simCardDTO);
            }
            this.sub.resume(activateSubscriptionDTO, addtionalSimCardDTOList);
            this.sub.synchronize();
            //..Check the status
            if (!this.sub.getStatus().equals("A")) {
                ExceptionHelper.throwClientException(ExceptionHelper.PEETYPE, ExceptionHelper.PEE_ERROR_CHANGING_SUB_STATUS, "Unable to Resume Cancelled Subscription.");
            }

            spOut = populateSPOutputIDSFromSubDetails(this.sub);
        } catch (NinjaException e) {
            ExceptionHelper.throwClientException(e);
        }

        this.writeLogInfo("resumeCancelledSubscription", nStartTime, System.currentTimeMillis(), in_dset, spOut);

        return spOut;

    }

    /**
     * Method to release used SIM card for re-use purpose
     *
     * @param in_dset
     * @return true if sim has been successfully released, otherwise false
     * @throws ClientException
     */
    public boolean releaseSimForReuse(SP_input_IDS in_dset) throws ClientException {
        if (log.isDebugEnabled()) {
            log.debug("Entering SP_Business_Logic.releaseSimForReuse - " + in_dset);
        }
        boolean bSuccessInd = false;

        checkSpInputIdsNotNull(in_dset);

        String sSimNr = (String) in_dset.getValue(SP_input_IDS.SIM_NO, null);
        validateSimNumber(sSimNr);

        try {
            // Validate if SP owns the SIM

            SIMCard simCard = validateSimForSP(sSimNr);
            if (log.isDebugEnabled()) {
                log.debug("simCard:\n" + simCard.toString());
            }

            bSuccessInd = simCard.releaseSim(this.user.getFokusUser());

        } catch (NinjaException e) {
            ExceptionHelper.throwClientException(e);
        }

        return bSuccessInd;
    }

    /**
     * Method to retrieve the Status of a Sim.
     *
     * @param sSim - full sim number
     * @return - 1 character code where 'A' - Available for Use, 'C' - Cancelled, 'I' - In Use, 'U' - unknown status
     * @throws ClientException
     */
    public String getSimStatus(String sSim) throws ClientException {
        //ToDo (GLL 29/05/2007): Is there anything here (or in the core) to validate the ownership of the sim? (Or can anyone see any sim?)
        if (log.isDebugEnabled()) {
            log.debug("Entering SP_Business_Logic.getSimStatus(" + sSim + ")");
        }
        if (sSim == null) {
            ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "SIM number - is empty");
        }

        long nStartTime = System.currentTimeMillis();
        String retVal = null;
        try {
            SIMCard simCard = new SIMCard(sSim, this.user.getDealer().getCode(), this.user.getFokusUser());
            //String simPhyHlr = ReferenceTables.getLogicalPhysicalDeviceMapping(simCard.getHLR()).getPhdId();
            String simPhyHlr = simCard.getPhysicalHLRid();
            if (log.isDebugEnabled()) {
                log.debug("SIM physical HLR = " + simPhyHlr + ", SP physical HLR = " + this.sPhyHLRCode);
            }
            if (simPhyHlr == null) {
                ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000000, "Failed to retrieve physical HLR for SIM " + sSim);
            } else if (!simPhyHlr.equals(this.sPhyHLRCode)) {
                ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000014, "Sim " + sSim + " is not owned by Service Provider - " + this.sLast_Business_Name);
            }
            if (simCard.isCancelled()) {
                retVal = "C";
            } else if (SIMCard.isAvailable(sSim)) {
                retVal = "A";
            } else if (simCard.isInUse()) {
                retVal = "I";
            } else {
                retVal = "U";
            }
            this.writeLogInfo("getSimStatus", nStartTime, System.currentTimeMillis());
        } catch (NinjaException ne) {
            ExceptionHelper.throwClientException(ne);
        }
        return retVal;
    }


    //..Populate an instance of the SP_output_IDS with the MoveSubscriptionDTO details.
    private SP_output_IDS populateSPSubDetailsForFutureMove(TimePortActionDetailsDTO timePortActionDetailsDTO, Integer ninjaRefId)
            throws ClientException, SubscriptionException, FokusDatesException, UserException, DealerException, MemoException,
            ServiceCallException, ChannelException, FMLManipulationException, EnvironmentException {
        SP_output_IDS spOutIDS = new SP_output_IDS();
        SIMCard simcard = null;
        MoveSubscriptionDTO moveSubscriptionDTO = timePortActionDetailsDTO.getMoveSubscriptionDTO();
        List equipmentList = moveSubscriptionDTO.getEquipmentList();
        if (equipmentList.size() > 0) {
            for (int i = 0; i < equipmentList.size(); i++) {
                EquipmentDTO equipmentDTO = (EquipmentDTO) equipmentList.get(i);
                if (equipmentDTO instanceof SIMCardDTO) {
                    SIMCardDTO tmpSimCardDTO = (SIMCardDTO) equipmentDTO;
                    if (tmpSimCardDTO.isPrimary()) {
                        simcard = new SIMCard(this.sub, tmpSimCardDTO);
                        break;
                    }
                }
            }
        }

        //SIMCard simcard = new SIMCard(moveSubscriptionDTO.getSIM(), this.user.getDealer().getCode(),this.user.getFokusUser());
        //..get the sub profile structure
        SocsDTO socsDTO = null;
        try {
            socsDTO = moveSubscriptionDTO.getChangeRatingDTO().getSocsDTO();
            if (log.isDebugEnabled()) {
                log.debug("Subscription[" + moveSubscriptionDTO.getPortInDTO().getCtn() + "] \nSocList[" + socsDTO + "]");
            }
        } catch (Exception e) {
            log.error("Get Socs DTO??? Why..", e);
        }

        if (log.isDebugEnabled()) {
            log.debug("SocsDTO = " + socsDTO.toString());
        }
        if (socsDTO == null) {
            ExceptionHelper.throwClientException(ExceptionHelper.PEETYPE, ExceptionHelper.PEE000009, "Error Retrieving Subscriber Service Details");
        }
        //..Set the Sub Details in the sp output ids
        spOutIDS.setValue(SP_output_IDS.SUBSCRIBER_NO, sub.getNumber());
        try {
            spOutIDS.setValue(SP_output_IDS.SUB_CTN, sub.getCtn().getNumber());
        } catch (NinjaException e) {
            ExceptionHelper.throwClientException(ExceptionHelper.PEETYPE, ExceptionHelper.PEE_SYSTEM_ERROR_OCCURRED, "Retrieving CTN Details: Caused by : " + e.getClass() + " : " + e.getMessage());
        }
        spOutIDS.setValue(SP_output_IDS.SUB_STATUS, "P");  //special status to mark that the number is pending for porting

        String sDate = TypeConverter.dateToString(timePortActionDetailsDTO.getPortOrderDTO().getLastStatusDate(), TypeConverter.DATE_FORMAT_COMPLEX);

        String sDateCreate = null;
        String sPortDateTime = null;

        if (ninjaRefId != null) {
            String sql = "SELECT DATE_TIME_CREATED, DATE_TIME_PORT FROM NINJA_TIME_PORT WHERE NINJA_REF_ID = " + ninjaRefId.intValue();
            SQLConnection conn = null;

            try {
                conn = NinjaDataSource.getSQLConnection();
                SQLResultSet rs = conn.executeQuery(sql);
                if (rs.getRowCount() == 1) {
                    Date dateCreate = rs.getDate("DATE_TIME_CREATED", 0);
                    sDateCreate = TypeConverter.dateToString(dateCreate, TypeConverter.DATE_FORMAT_COMPLEX);
                    Date portDateTime = rs.getDate("DATE_TIME_PORT", 0);
                    sPortDateTime = TypeConverter.dateToString(portDateTime, TypeConverter.DATE_FORMAT_COMPLEX);
                }
            } catch (SQLException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            } catch (NamingException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            } catch (DataSourceException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            } finally {
                try {
                    if (conn != null) {
                        conn.close();
                    }
                } catch (Exception e) {
                    log.error("Unable to close connection", e);
                }
            }
        } else {
            //requestExecutionDate doesn't have time and lastStatusDate is not always populated, so we first try to get them from ninja_time_port
            sPortDateTime = TypeConverter.dateToString(timePortActionDetailsDTO.getPortOrderDTO().getRequestExecutionDate(), TypeConverter.DATE_FORMAT_SIMPLE);
            sDateCreate = sDate;
        }
        spOutIDS.setValue(SP_output_IDS.SUB_STATUS_DATE, sDateCreate);  //port request creation date
        spOutIDS.setValue(SP_output_IDS.SUB_ACT_DATE, sPortDateTime);   //port request date

        if (simcard == null) {
            spOutIDS.setValue(SP_output_IDS.EQUIPMENT_NO, null);
            spOutIDS.setValue(SP_output_IDS.IMSI, null);
        } else {
            spOutIDS.setValue(SP_output_IDS.EQUIPMENT_NO, simcard.getNumber());
            spOutIDS.setValue(SP_output_IDS.IMSI, simcard.getIMSI());
            spOutIDS.setValue(SP_output_IDS.SIM_EFFECTIVE_DATE, sPortDateTime);
            spOutIDS.setValue(SP_output_IDS.ITEM_ID, simcard.getItemId());
        }
        spOutIDS.setValue(SP_output_IDS.PRICE_PLAN, socsDTO.getPricePlanCode());

        //System.out.println("SP SocsIDS - " + socsIDS);

        List socs = socsDTO.getSocs();
        for (int i = 0; i < socs.size(); i++) {
            SocDTO socDTO = (SocDTO) socs.get(i);
            if (socDTO.OPERATION_ADDITION.equals(socDTO.getOperation())) {

                String sServ = socDTO.getCode();
                if (sServ == null) {
                    continue;
                }
                String sDisplayable = socDTO.getDisplayable();
                //..don't pass back any non-displayable..
                if (sDisplayable == null || sDisplayable.equals("N")) {
                    continue;
                }

                // Get SP service code according to soc type and group
                // get soc type and group from SP_SERVICES_MAPPING reference table
                SPServicesMappingReferenceTable.ServiceMapping serviceMappingRec = SPServicesMappingReferenceTable.getServiceCode(socDTO.getType(), socDTO.getGroup());
                if (serviceMappingRec == null) {
                    log.error("Failed to find mapping in SP_SERVICES_MAPPING table for soc type " + socDTO.getType() + " and group " + socDTO.getGroup() + " and user " + this.user.getNinjaUser());
                    continue;
                }
                String spServiceCode = serviceMappingRec.getServiceCode();

                Hashtable hServParm = new Hashtable();
                if (spServiceCode != null) {
                    if (spServiceCode.equals("DATA")) {
                        // Handle DATA separatly because it has 2 features with same parameter code.

                        //System.out.println("DATA - " + sServ);
                        //System.out.println("Parameters - " + socsIDS.getValue(SocsIDS.SOC_FEATURE_CODE, i, null));
                        //System.out.println("ASYN = " + socsIDS.getParameterValue(sServ, "B-DA26", "MSISDN"));
                        //System.out.println("ISDN = " + socsIDS.getParameterValue(sServ, "ISDN96", "MSISDN"));

                        FeatureDTO featureDTO = socDTO.getFeatureDTO("B-DA26");
                        FeatureParameterDTO parameterDTO = ((featureDTO == null) ? null : featureDTO.getFeatureParameterDTO("MSISDN"));
                        String sTmpVal = ((parameterDTO == null) ? null : parameterDTO.getValue());
                        hServParm.put("ASYN", (sTmpVal != null) ? sTmpVal : "");
                        featureDTO = socDTO.getFeatureDTO("ISDN96");
                        parameterDTO = ((featureDTO == null) ? null : featureDTO.getFeatureParameterDTO("MSISDN"));
                        sTmpVal = ((parameterDTO == null) ? null : parameterDTO.getValue());
                        hServParm.put("ISDN", (sTmpVal != null) ? sTmpVal : "");
                        //System.out.println("hServParm = " + hServParm);
                        sServ = "DATA";

                    } else {
                        List featureDTOList = socDTO.getFeatures();
                        for (int j = 0; j < featureDTOList.size(); j++) {
                            FeatureDTO featureDTO = (FeatureDTO) featureDTOList.get(j);

                            List featureParameterDTOList = featureDTO.getParameters();
                            for (int k = 0; k < featureParameterDTOList.size(); k++) {
                                FeatureParameterDTO featureParameterDTO = (FeatureParameterDTO) featureParameterDTOList.get(k);
                                String sNinjaParmCode = featureParameterDTO.getCode();
                                if (log.isDebugEnabled()) {
                                    log.debug("Ninja Param code = " + sNinjaParmCode + ", displayable = " + featureParameterDTO.getDisplayable());
                                }

                                // If parameter is displayable get SP parameter code and set the value
                                if ("Y".equals(featureParameterDTO.getDisplayable())) {
                                    String sSpParamCode = getSPParameterCode(sNinjaParmCode, spServiceCode);
                                    String sParmValue = featureParameterDTO.getValue() != null ? featureParameterDTO.getValue() : featureParameterDTO.getDefaultValue();

                                    if (log.isDebugEnabled()) {
                                        log.debug("put(" + sSpParamCode + ", " + sParmValue + ")");
                                    }

                                    if (sSpParamCode != null && sParmValue != null) {
                                        hServParm.put(sSpParamCode, sParmValue);
                                    } else {
                                        log.error("Failed to add parameter " + sSpParamCode + " with value " + sParmValue + " for service " + spServiceCode);
                                    }
                                }
                            }

                        }
                    }
                }

                int nOutServ = spOutIDS.getCount(SP_output_IDS.SERVICE);
                spOutIDS.setValue(SP_output_IDS.SERVICE, nOutServ, sServ);
                Hashtable hServParmsOut = (Hashtable) hServParm.clone();
                spOutIDS.setValue(SP_output_IDS.SERVICE_PARAM, nOutServ, hServParmsOut);
                hServParm.clear();
                //Date effectiveDate = socDTO.getEffectiveDate();
                //String effectiveDateString = TypeConverter.dateToString(effectiveDate, TypeConverter.DATE_FORMAT_SIMPLE);
                spOutIDS.setValue(SP_output_IDS.SERVICE_ACT_DATE, nOutServ, sPortDateTime);

            }
        }

        return spOutIDS;
    }


    public SP_output_IDS maintainMultiSim(SP_input_IDS in_dset) throws ClientException {

        long nStartTime = System.currentTimeMillis();

        checkSpInputIdsNotNull(in_dset);

        SP_output_IDS spOut = new SP_output_IDS();
        try {
            // Validate input parameters
            String subNo = (String) in_dset.getValue(SP_input_IDS.SUB_NO, null);
            if (subNo == null) {
                ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field SUB_NO - is empty or non-existent");
            }

            this.getBanAndSubscriptionAndSetInstanceVariablesToThem(subNo, this.user, this.sDlrCode);

            // Subscription must be a GSM subscription
            if (!this.sub.getCtn().getProductType().equalsIgnoreCase("GSM")) {
                ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Subscriber number is not a GSM number");
            }

            if (!this.sub.isActive()) {
                ExceptionHelper.throwClientException(ExceptionHelper.PEETYPE, ExceptionHelper.PEE000010, "[" + this.sub.getStatus() + "]. Can't manipulate SIM cards on non Active subscriber.");
            }

            int nChanges = in_dset.getCount(SP_input_IDS.ADDITIONAL_SIM_NOS);
            for (int i = 0; i < nChanges; i++) {
                String sSimNo = (String) in_dset.getValue(SP_input_IDS.ADDITIONAL_SIM_NOS, i, null);
                if (sSimNo == null) {
                    ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field ADDITIONAL_SIM_NOS - is empty or non-existent - index - " + i);
                }
                String sAction = (String) in_dset.getValue(SP_input_IDS.SUB_SERVICE_ACTION, i, null);
                if (sAction == null) {
                    ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field SUB_SERVICE_ACTION - is empty or non-existent - index - " + i);
                }

                String receivesCloningSms = (String) in_dset.getValue(SP_input_IDS.ADDITIONAL_SIM_CLONING, i, null);
                if (log.isDebugEnabled()) {
                    log.debug("Additonal sim number[" + i + "] = '" + sSimNo + "', action = '" + sAction + "' , sim cloning = " + receivesCloningSms);
                }
                if (SIMCardDTO.ADD_MODE.equals(sAction)) {
                    SIMCardDTO simCardDTO = new SIMCardDTO(sSimNo, false);
                    this.sub.getEquipmentManager().add(simCardDTO);

                } else if (SIMCardDTO.DELETE_MODE.equals(sAction)) {
                    SIMCardDTO simCardDTOtoRemove = this.sub.getEquipmentManager().getSIMCardListDTO().getSIMCardDTOforNumber(sSimNo);
                    this.sub.getEquipmentManager().remove(simCardDTOtoRemove);

                } else if (SIMCardDTO.MODIFY_MODE.equals(sAction)) {
                    SIMCardDTO simCardDTO = this.sub.getEquipmentManager().getSIMCardListDTO().getSIMCardDTOforNumber(sSimNo);
                    if ("Y".equals(receivesCloningSms)) {
                        simCardDTO.setReceivesClonedSMSFromPrimary(true);
                    } else if ("N".equals(receivesCloningSms)) {
                        simCardDTO.setReceivesClonedSMSFromPrimary(false);
                    } else {
                        ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "Field ADDITIONAL_SIM_CLONING for sim " + sSimNo + "- is invalid or empty ");
                    }

                    this.sub.getEquipmentManager().modifySIM(simCardDTO);

                } else {
                    ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "No Valid Changes Specified.");
                }
            }

            this.sub.save();
            this.sub.synchronize();
            spOut = populateSPOutputIDSFromSubDetails(this.sub);
        } catch (NinjaException e) {
            ExceptionHelper.throwClientException(e);
        }

        this.writeLogInfo("maintainMultiSim", nStartTime, System.currentTimeMillis(), in_dset, spOut);

        return spOut;

    }

    /**
     * Method to get Ninja parameter code by SP parameter code and SP service code
     *
     * @param spFeatureCode
     * @param spServiceCode
     * @return
     */
    private String getNinjaParameterCode(String spFeatureCode, String spServiceCode) {
        if (log.isDebugEnabled()) {
            log.debug("getParameterCode(" + spFeatureCode + "," + spServiceCode + ")");
        }
        String paramCode = null;

        String sql = "SELECT * FROM SP_FEATURES_MAPPING " +
                "WHERE SP_PARAM_CODE = '" + spFeatureCode + "' " +
                "AND SP_SERVICE_CODE = '" + spServiceCode + "'";
        SQLConnection conn = null;

        try {
            conn = NinjaDataSource.getSQLConnection();
            SQLResultSet rs = conn.executeQuery(sql);
            if (rs.getRowCount() == 1) {
                paramCode = (String) rs.getValue("NINJA_PARAMETER_CODE", 0, null);
            }
        } catch (SQLException e) {
            log.error("Sql : ", e);
        } catch (NamingException e) {
            log.error("Naming : ", e);
        } catch (DataSourceException e) {
            log.error("DataSource : ", e);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                log.error("Unable to close connection", e);
            }
        }

        if (log.isDebugEnabled()) {
            log.debug("Found Ninja Param Code [" + paramCode + "]");
        }
        return paramCode;
    }

    /**
     * Method to get SP parameter code by Ninja parameter code and SP service code
     *
     * @param ninjaParamCode
     * @param spServiceCode
     * @return
     */
    private String getSPParameterCode(String ninjaParamCode, String spServiceCode) {
        if (log.isDebugEnabled()) {
            log.debug("getSPParameterCode(" + ninjaParamCode + "," + spServiceCode + ")");
        }
        String paramCode = null;

        String sql = "SELECT * FROM SP_FEATURES_MAPPING " +
                "WHERE NINJA_PARAMETER_CODE = '" + ninjaParamCode + "' " +
                "AND SP_SERVICE_CODE = '" + spServiceCode + "'";
        SQLConnection conn = null;

        try {
            conn = NinjaDataSource.getSQLConnection();
            SQLResultSet rs = conn.executeQuery(sql);
            if (rs.getRowCount() == 1) {
                paramCode = (String) rs.getValue("SP_PARAM_CODE", 0, null);
            }
        } catch (SQLException e) {
            log.error("Sql : ", e);
        } catch (NamingException e) {
            log.error("Naming : ", e);
        } catch (DataSourceException e) {
            log.error("DataSource : ", e);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                log.error("Unable to close connection", e);
            }
        }

        if (log.isDebugEnabled()) {
            log.debug("Found SP Param Code [" + paramCode + "]");
        }
        return paramCode;
    }


    /**
     * Method to get mandatory indicator for SP parameter code and SP service code
     *
     * @param spParamCode
     * @param spServiceCode
     * @return true if parametor is mandatory
     */
    private boolean isParamMandatory(String spParamCode, String spServiceCode) {
        if (log.isDebugEnabled()) {
            log.debug("getMandatoryIndForParameter(" + spParamCode + "," + spServiceCode + ")");
        }
        String sMandatoryInd = null;

        boolean bMandatoryInd = false;

        String sql = "SELECT * FROM SP_FEATURES_MAPPING " +
                "WHERE SP_PARAM_CODE = '" + spParamCode + "' " +
                "AND SP_SERVICE_CODE = '" + spServiceCode + "'";
        SQLConnection conn = null;

        try {
            conn = NinjaDataSource.getSQLConnection();
            SQLResultSet rs = conn.executeQuery(sql);
            if (rs.getRowCount() == 1) {
                sMandatoryInd = (String) rs.getValue("MANDATORY_IND", 0, null);
            }
            if ("Y".equals(sMandatoryInd)) {
                bMandatoryInd = true;
            }
        } catch (SQLException e) {
            log.error("Sql : ", e);
        } catch (DataSourceException e) {
            log.error("DataSource : ", e);
        } catch (NamingException e) {
            log.error("Naming : ", e);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                log.error("Unable to close connection", e);
            }
        }

        if (log.isDebugEnabled()) {
            log.debug("is mandatory = [" + bMandatoryInd + "]");
        }
        return bMandatoryInd;
    }

    /**
     * Method to check if a service has mandatory parameters
     *
     * @param spServiceCode
     * @return true if parametor is mandatory
     */
    private boolean hasMandatoryParam(String spServiceCode) {
        if (log.isDebugEnabled()) {
            log.debug("hasMandatoryParam(" + spServiceCode + ")");
        }

        boolean bHasMandatoryParms = false;

        String sql = "SELECT * FROM SP_FEATURES_MAPPING " +
                "WHERE SP_SERVICE_CODE = '" + spServiceCode + "' " +
                "AND MANDATORY_IND = 'Y'";
        SQLConnection conn = null;

        try {
            conn = NinjaDataSource.getSQLConnection();
            SQLResultSet rs = conn.executeQuery(sql);
            if (rs.size() > 0) {
                bHasMandatoryParms = true;
            }
        } catch (SQLException e) {
            log.error("Sql : ", e);
        } catch (NamingException e) {
            log.error("Naming : ", e);
        } catch (DataSourceException e) {
            log.error("DataSource : ", e);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                log.error("Unable to close connection", e);
            }
        }

        if (log.isDebugEnabled()) {
            log.debug("is mandatory = [" + bHasMandatoryParms + "]");
        }
        return bHasMandatoryParms;
    }

    /**
     * Method to retrieve the PUK of a Sim.
     *
     * @param sSimNumber - full sim number
     * @return - PUK number
     * @throws ClientException
     */
    public Integer getPukCode(String sSimNumber) throws ClientException {
        if (log.isDebugEnabled()) {
            log.debug("Entering SP_Business_Logic.getPukCode(" + sSimNumber + ")");
        }
        Integer puk = null;
        try {
            SIMCard simCard = new SIMCard(sSimNumber, this.user.getDealer().getCode(), this.user.getFokusUser());
            if (simCard != null) {
                puk = simCard.getPuk();
            }
        } catch (NinjaException e) {
            ExceptionHelper.throwClientException(e);
        }

        return puk;
    }

    public ClientMemoOutputDTOs getMemoList(String sMsisdn ,String sSimNo) throws ClientException {
        if (log.isDebugEnabled()) {
            log.debug("Entering SP_Business_Logic.getMemoList(" + sMsisdn + ", " + sSimNo + ")");
        }

        ClientMemoOutputDTOs clientMemoList = new ClientMemoOutputDTOs();
        List tmpList = new ArrayList();
        MemoList memoList = null;

        if(sMsisdn != null){
            try {
                //set ban and subscriber and validate for SP
                getBanAndSubscriptionAndSetInstanceVariablesToThem(sMsisdn, this.user,this.sDlrCode);
                memoList = new MemoList(this.ban.getNumber(), this.sub.getNumber(),this.user.getFokusUser());

            } catch (NinjaException e) {
                ExceptionHelper.throwClientException(e);
            }
        } else if(sSimNo != null && sMsisdn == null){
            try {
                //validate SIM for SP
                SIMCard simCard = validateSimForSP(sSimNo);

                // get msisdn for SIM
                /*sMsisdn = getSubForSim(sSimNo);
                getBanAndSubscriptionAndSetInstanceVariablesToThem(sMsisdn, this.user,this.sDlrCode);
                List subList = new ArrayList();
                subList.add(this.sub);*/
                //Get list of subscribers for the SIM
                List subList =  NinjaFBI.getSubListForSim(sSimNo,this.user);
                memoList = new MemoList(subList,sSimNo,this.user.getFokusUser());
            } catch (NinjaException e) {
                ExceptionHelper.throwClientException(e);
            }
        } else {
            ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000034, "MSISDN or SIM must be specified.");   
        }
        try {
            // move memo's to the output DTOs
            clientMemoList = populateClientMemoList(memoList);
        } catch (FokusDatesException e) {
            ExceptionHelper.throwClientException(e);
        }
        return clientMemoList;
    }

    private ClientMemoOutputDTOs populateClientMemoList(MemoList memoList) throws FokusDatesException {
        if(log.isDebugEnabled()){
            log.debug("populateClientMemoList (MemoList = {" + memoList.toString() + "})");
        }
        ClientMemoOutputDTOs clientMemoList = new ClientMemoOutputDTOs();
        if(memoList!=null){
            int size = memoList.size();
            if(log.isDebugEnabled()){
                log.debug("memoList size = " + size);
            }
            for (int i = 0; i < size; i ++){
                Memo memo =  (Memo) memoList.get(i);
                if(log.isDebugEnabled()){
                    log.debug("memo[" + i + "] = {" + memo.toStringOutParams() + "}");
                }
                ClientMemoOutputDTO clientMemoOutputDTO =
                        new ClientMemoOutputDTO(memo.getBanNo(),
                                                memo.getMemoMsisdn(),
                                                memo.getMemoSystemText(),
                                                memo.getUserText(),
                                                memo.getMemoTypeDesc(),
                                                memo.getMemoCreatedBy(),
                                                TypeConverter.stringToDate(memo.getMemoCreationDate(),TypeConverter.DATE_FORMAT_COMPLEX));

                if(log.isDebugEnabled()){
                    log.debug("clientMemoOutputDTO= {" + clientMemoOutputDTO.toString() + "}");
                }
                clientMemoList.addMemoDTO(clientMemoOutputDTO);
            }
        }
        if(log.isDebugEnabled()){
            log.debug("clientMemoList size = " + clientMemoList.getMemoDTOs().size());
            log.debug("Memo list: \n");
            for (int i = 0; i < clientMemoList.getMemoDTOs().size(); i++){
                ClientMemoOutputDTO tmpDTO = (ClientMemoOutputDTO) clientMemoList.getMemoDTOs().get(i);
                log.debug(tmpDTO.toString() + "\n");
            }
        }
        return clientMemoList;
    }

    private SIMCard validateSimForSP(String sSimNo) throws IllegalDealerException, ServiceCallException, FokusDatesException, IllegalEquipmentException, EquipmentSystemException, FMLManipulationException, EnvironmentException, ClientException {
        // Validate if SP owns the SIM
        if (log.isDebugEnabled()) {
            log.debug("validateSimForSP(" + sSimNo + ")");
        }

        SIMCard simCard = new SIMCard(sSimNo, this.user.getDealer().getCode(), this.user.getFokusUser());
        //get physical HLR for sim and compare it with physical HLR defined for the SP
        String simPhyHlr = ReferenceTables.getLogicalPhysicalDeviceMapping(simCard.getHLR()).getPhdId();
        if (log.isDebugEnabled()) {
            log.debug("SIM physical HLR = " + simPhyHlr + ", SP physical HLR = " + this.sPhyHLRCode);
        }
        if (simPhyHlr == null) {
            ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000000, "Failed to retrieve physical HLR for SIM " + sSimNo);
        } else if (!simPhyHlr.equals(this.sPhyHLRCode)) {
            ExceptionHelper.throwClientException(ExceptionHelper.IPETYPE, ExceptionHelper.IPE000014, "Sim " + sSimNo + " is not owned by Service Provider - " + this.sLast_Business_Name);
        }

        if (log.isDebugEnabled()) {
            log.debug("simCard:\n" + simCard.toString());
        }
        return simCard; 
    }
}

