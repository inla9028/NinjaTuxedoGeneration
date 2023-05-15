/*
 * CvSvBanInput.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service.parameters;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;

import java.util.HashSet;

/**
 * @author  Ninja
 *
 * CvSvBanInput class.
 */
public class CvSvBanInput extends ServiceInput implements Conversable {
    // Indicates whether the default values has been loaded from the DB or not
    private static Boolean defaultValuesPopulated = new Boolean(false);
    // Holds default values for fields in FML buffer
    private static String defaultValues[] = null;

    // Holds keys not to be mapped through direct mapping between fields with the same name in both this buffer and CsApiBan-buffer.
    private static HashSet keysNotToBeMapped = new HashSet();
    // Keys not to be mapped.
    private final static String PCUSTRECOPERATOR_ID = "PCUSTRECOPERATOR_ID";
    private final static String PCUSTRECAPPLICATION_ID = "PCUSTRECAPPLICATION_ID";


    static {

        keysNotToBeMapped.add(PCUSTRECOPERATOR_ID);
        keysNotToBeMapped.add(PCUSTRECAPPLICATION_ID);
    }


    /**
     * Creates a new instance of CvSvBanInput
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CvSvBanInput() throws EnvironmentException, FMLManipulationException {
        // Initialize FML buffer
        fmlBuffer = new FmlField[148];

        // Get default values from DB
        synchronized (this.defaultValuesPopulated) {
            if (this.defaultValuesPopulated.equals(Boolean.FALSE)) {
                defaultValues = getDefaultValues("cvSvBan", 148);
                this.defaultValuesPopulated = new Boolean(true);
            }
        }

        this.fmlBuffer[0] = new FmlField("GENERATION", FmlField.TYPE_INTEGER, -1, defaultValues[0], 0, 1);
        this.fmlBuffer[1] = new FmlField("DIRECTIVE", FmlField.TYPE_INTEGER, -1, defaultValues[1], 1, 1);
        this.fmlBuffer[2] = new FmlField("FIRST_DIRECTIVE", FmlField.TYPE_INTEGER, -1, defaultValues[2], 2, 1);
        this.fmlBuffer[3] = new FmlField("SECOND_DIRECTIVE", FmlField.TYPE_INTEGER, -1, defaultValues[3], 3, 1);
        this.fmlBuffer[4] = new FmlField("OPERATOR_ID", FmlField.TYPE_INTEGER, -1, defaultValues[4], 4, 1);
        this.fmlBuffer[5] = new FmlField("APPLICATION_ID", FmlField.TYPE_STRING, 7, defaultValues[5], 5, 1);
        this.fmlBuffer[6] = new FmlField("TRANSACTION_MODE", FmlField.TYPE_BYTE, -1, defaultValues[6], 6, 1);
        this.fmlBuffer[7] = new FmlField("RUN_DATE", FmlField.TYPE_STRING, 9, defaultValues[7], 7, 1);
        this.fmlBuffer[8] = new FmlField("MARKET_CODE", FmlField.TYPE_STRING, 4, defaultValues[8], 8, 1);
        this.fmlBuffer[9] = new FmlField("SVC_STATUS", FmlField.TYPE_BYTE, -1, defaultValues[9], 9, 1);
        this.fmlBuffer[10] = new FmlField("LAST_UPDATE_DATE", FmlField.TYPE_STRING, 15, defaultValues[10], 10, 1);
        this.fmlBuffer[11] = new FmlField("LAST_UPDATE_STAMP", FmlField.TYPE_SHORT, -1, defaultValues[11], 11, 1);
        this.fmlBuffer[12] = new FmlField("ENV_CODE", FmlField.TYPE_STRING, 11, defaultValues[12], 12, 1);
        this.fmlBuffer[13] = new FmlField("SESSION_ID", FmlField.TYPE_INTEGER, -1, defaultValues[13], 13, 1);
        this.fmlBuffer[14] = new FmlField("ONLINE_TRX_NO", FmlField.TYPE_INTEGER, -1, defaultValues[14], 14, 1);
        this.fmlBuffer[15] = new FmlField("GROUP_TRX_ID", FmlField.TYPE_INTEGER, -1, defaultValues[15], 15, 1);
        this.fmlBuffer[16] = new FmlField("ROWID", FmlField.TYPE_STRING, 19, defaultValues[16], 16, 1);
        this.fmlBuffer[17] = new FmlField("CUSTOMER_ID", FmlField.TYPE_INTEGER, -1, defaultValues[17], 17, 1);
        this.fmlBuffer[18] = new FmlField("SYS_CREATION_DATE", FmlField.TYPE_STRING, 15, defaultValues[18], 18, 1);
        this.fmlBuffer[19] = new FmlField("SYS_UPDATE_DATE", FmlField.TYPE_STRING, 15, defaultValues[19], 19, 1);
        this.fmlBuffer[20] = new FmlField("PCUSTRECOPERATOR_ID", FmlField.TYPE_INTEGER, -1, defaultValues[20], 20, 1);
        this.fmlBuffer[21] = new FmlField("PCUSTRECAPPLICATION_ID", FmlField.TYPE_STRING, 7, defaultValues[21], 21, 1);
        this.fmlBuffer[22] = new FmlField("DL_SERVICE_CODE", FmlField.TYPE_STRING, 6, defaultValues[22], 22, 1);
        this.fmlBuffer[23] = new FmlField("DL_UPDATE_STAMP", FmlField.TYPE_SHORT, -1, defaultValues[23], 23, 1);
        this.fmlBuffer[24] = new FmlField("CUSTOMER_TELNO", FmlField.TYPE_STRING, 21, defaultValues[24], 24, 1);
        this.fmlBuffer[25] = new FmlField("CUSTOMER_FAX", FmlField.TYPE_STRING, 21, defaultValues[25], 25, 1);
        this.fmlBuffer[26] = new FmlField("WORK_TELNO", FmlField.TYPE_STRING, 21, defaultValues[26], 26, 1);
        this.fmlBuffer[27] = new FmlField("WORK_FAX", FmlField.TYPE_STRING, 21, defaultValues[27], 27, 1);
        this.fmlBuffer[28] = new FmlField("DEALER_CODE", FmlField.TYPE_STRING, 6, defaultValues[28], 28, 1);
        this.fmlBuffer[29] = new FmlField("SALES_AGENT", FmlField.TYPE_STRING, 6, defaultValues[29], 29, 1);
        this.fmlBuffer[30] = new FmlField("MARKET_ID", FmlField.TYPE_STRING, 4, defaultValues[30], 30, 1);
        this.fmlBuffer[31] = new FmlField("ACC_PASSWORD", FmlField.TYPE_STRING, 21, defaultValues[31], 31, 1);
        this.fmlBuffer[32] = new FmlField("VERIFIED_DATE", FmlField.TYPE_STRING, 9, defaultValues[32], 32, 1);
        this.fmlBuffer[33] = new FmlField("CONV_CUST_ID", FmlField.TYPE_STRING, 11, defaultValues[33], 33, 1);
        this.fmlBuffer[34] = new FmlField("BUSINESS_ENTITY", FmlField.TYPE_STRING, 4, defaultValues[34], 34, 1);
        this.fmlBuffer[35] = new FmlField("LOCATION", FmlField.TYPE_STRING, 5, defaultValues[35], 35, 1);
        this.fmlBuffer[36] = new FmlField("CONV_RUN_NO", FmlField.TYPE_SHORT, -1, defaultValues[36], 36, 1);
        this.fmlBuffer[37] = new FmlField("AGE_VERIFICATION_STATUS", FmlField.TYPE_BYTE, -1, defaultValues[37], 37, 1);
        this.fmlBuffer[38] = new FmlField("EMPLOYMENT_TYPE", FmlField.TYPE_STRING, 5, defaultValues[38], 38, 1);
        this.fmlBuffer[39] = new FmlField("EMPLOYMENT_DATE", FmlField.TYPE_STRING, 9, defaultValues[39], 39, 1);
        this.fmlBuffer[40] = new FmlField("OPEN_BANK_ACCOUNT_DATE", FmlField.TYPE_STRING, 9, defaultValues[40], 40, 1);
        this.fmlBuffer[41] = new FmlField("E_POST", FmlField.TYPE_STRING, 151, defaultValues[41], 41, 1);
        this.fmlBuffer[42] = new FmlField("PBANRECROWID", FmlField.TYPE_STRING, 19, defaultValues[42], 42, 1);
        this.fmlBuffer[43] = new FmlField("BAN", FmlField.TYPE_INTEGER, -1, defaultValues[43], 43, 1);
        this.fmlBuffer[44] = new FmlField("PBANRECSYS_CREATION_DATE", FmlField.TYPE_STRING, 15, defaultValues[44], 44, 1);
        this.fmlBuffer[45] = new FmlField("PBANRECSYS_UPDATE_DATE", FmlField.TYPE_STRING, 15, defaultValues[45], 45, 1);
        this.fmlBuffer[46] = new FmlField("PBANRECOPERATOR_ID", FmlField.TYPE_INTEGER, -1, defaultValues[46], 46, 1);
        this.fmlBuffer[47] = new FmlField("PBANRECAPPLICATION_ID", FmlField.TYPE_STRING, 7, defaultValues[47], 47, 1);
        this.fmlBuffer[48] = new FmlField("PBANRECCUSTOMER_ID", FmlField.TYPE_INTEGER, -1, defaultValues[48], 48, 1);
        this.fmlBuffer[49] = new FmlField("START_SERVICE_DATE", FmlField.TYPE_STRING, 9, defaultValues[49], 49, 1);
        this.fmlBuffer[50] = new FmlField("COL_DELINQ_STATUS", FmlField.TYPE_BYTE, -1, defaultValues[50], 50, 1);
        this.fmlBuffer[51] = new FmlField("BAN_STATUS", FmlField.TYPE_BYTE, -1, defaultValues[51], 51, 1);
        this.fmlBuffer[52] = new FmlField("STATUS_LAST_DATE", FmlField.TYPE_STRING, 9, defaultValues[52], 52, 1);
        this.fmlBuffer[53] = new FmlField("STATUS_ACTV_CODE", FmlField.TYPE_STRING, 4, defaultValues[53], 53, 1);
        this.fmlBuffer[54] = new FmlField("STATUS_ACTV_RSN_CODE", FmlField.TYPE_STRING, 5, defaultValues[54], 54, 1);
        this.fmlBuffer[55] = new FmlField("BILL_CYCLE", FmlField.TYPE_SHORT, -1, defaultValues[55], 55, 1);
        this.fmlBuffer[56] = new FmlField("AR_BALANCE", FmlField.TYPE_DOUBLE, -1, defaultValues[56], 56, 1);
        this.fmlBuffer[57] = new FmlField("BL_CUR_BILL_SEQ_NO", FmlField.TYPE_SHORT, -1, defaultValues[57], 57, 1);
        this.fmlBuffer[58] = new FmlField("BL_LAST_RG_CYC_DATE", FmlField.TYPE_STRING, 9, defaultValues[58], 58, 1);
        this.fmlBuffer[59] = new FmlField("BL_COMPLT_STATUS", FmlField.TYPE_BYTE, -1, defaultValues[59], 59, 1);
        this.fmlBuffer[60] = new FmlField("BL_SPECIAL_CYCLE", FmlField.TYPE_SHORT, -1, defaultValues[60], 60, 1);
        this.fmlBuffer[61] = new FmlField("ACCOUNT_SUB_TYPE", FmlField.TYPE_STRING, 3, defaultValues[61], 61, 1);
        this.fmlBuffer[62] = new FmlField("BL_MAN_HNDL_RSN", FmlField.TYPE_STRING, 3, defaultValues[62], 62, 1);
        this.fmlBuffer[63] = new FmlField("BL_MAN_HNDL_EFF_DATE", FmlField.TYPE_STRING, 9, defaultValues[63], 63, 1);
        this.fmlBuffer[64] = new FmlField("BL_MAN_HNDL_EXP_DATE", FmlField.TYPE_STRING, 9, defaultValues[64], 64, 1);
        this.fmlBuffer[65] = new FmlField("BL_MAN_HNDL_REQ_OPID", FmlField.TYPE_INTEGER, -1, defaultValues[65], 65, 1);
        this.fmlBuffer[66] = new FmlField("BL_MAN_HNDL_BY_OPID", FmlField.TYPE_INTEGER, -1, defaultValues[66], 66, 1);
        this.fmlBuffer[67] = new FmlField("BL_REQ_ST_GRACE_PRD", FmlField.TYPE_STRING, 9, defaultValues[67], 67, 1);
        this.fmlBuffer[68] = new FmlField("BL_REQ_END_GRACE_PRD", FmlField.TYPE_STRING, 9, defaultValues[68], 68, 1);
        this.fmlBuffer[69] = new FmlField("BL_NEXT_CYCLE", FmlField.TYPE_SHORT, -1, defaultValues[69], 69, 1);
        this.fmlBuffer[70] = new FmlField("BL_NEXT_CYC_EFF_DATE", FmlField.TYPE_STRING, 9, defaultValues[70], 70, 1);
        this.fmlBuffer[71] = new FmlField("CS_MIN_REQ_CTNS", FmlField.TYPE_INTEGER, -1, defaultValues[71], 71, 1);
        this.fmlBuffer[72] = new FmlField("CS_SPEC_MEMO_IND", FmlField.TYPE_BYTE, -1, defaultValues[72], 72, 1);
        this.fmlBuffer[73] = new FmlField("AR_EXCPT_ACCT_IND", FmlField.TYPE_BYTE, -1, defaultValues[73], 73, 1);
        this.fmlBuffer[74] = new FmlField("CS_COM_START_DATE", FmlField.TYPE_STRING, 9, defaultValues[74], 74, 1);
        this.fmlBuffer[75] = new FmlField("CS_COM_END_DATE", FmlField.TYPE_STRING, 9, defaultValues[75], 75, 1);
        this.fmlBuffer[76] = new FmlField("CS_COM_REASON_CODE", FmlField.TYPE_STRING, 4, defaultValues[76], 76, 1);
        this.fmlBuffer[77] = new FmlField("CS_COM_ORIG_NO_MONTH", FmlField.TYPE_SHORT, -1, defaultValues[77], 77, 1);
        this.fmlBuffer[78] = new FmlField("AR_WO_IND", FmlField.TYPE_BYTE, -1, defaultValues[78], 78, 1);
        this.fmlBuffer[79] = new FmlField("ACCOUNT_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[79], 79, 1);
        this.fmlBuffer[80] = new FmlField("COL_ASSIGNED_COLL", FmlField.TYPE_STRING, 9, defaultValues[80], 80, 1);
        this.fmlBuffer[81] = new FmlField("BL_ZERO_BALANC_IND", FmlField.TYPE_BYTE, -1, defaultValues[81], 81, 1);
        this.fmlBuffer[82] = new FmlField("DEFAULT_SUB_MARKET", FmlField.TYPE_STRING, 4, defaultValues[82], 82, 1);
        this.fmlBuffer[83] = new FmlField("BL_DEF_MAILING_IND", FmlField.TYPE_BYTE, -1, defaultValues[83], 83, 1);
        this.fmlBuffer[84] = new FmlField("BL_BILL_PROD_IND", FmlField.TYPE_BYTE, -1, defaultValues[84], 84, 1);
        this.fmlBuffer[85] = new FmlField("BL_BAL_HANDLE_IND", FmlField.TYPE_BYTE, -1, defaultValues[85], 85, 1);
        this.fmlBuffer[86] = new FmlField("BL_NO_MNSP_IND", FmlField.TYPE_BYTE, -1, defaultValues[86], 86, 1);
        this.fmlBuffer[87] = new FmlField("CS_BAN_TRX_OFF_IND", FmlField.TYPE_BYTE, -1, defaultValues[87], 87, 1);
        this.fmlBuffer[88] = new FmlField("CS_HANDLE_BY_CTN_IND", FmlField.TYPE_BYTE, -1, defaultValues[88], 88, 1);
        this.fmlBuffer[89] = new FmlField("CS_LOCK_MECHANISM", FmlField.TYPE_BYTE, -1, defaultValues[89], 89, 1);
        this.fmlBuffer[90] = new FmlField("COMP_CRD_LMT", FmlField.TYPE_DOUBLE, -1, defaultValues[90], 90, 1);
        this.fmlBuffer[91] = new FmlField("CREDIT_CLASS", FmlField.TYPE_BYTE, -1, defaultValues[91], 91, 1);
        this.fmlBuffer[92] = new FmlField("CREDIT_DATE", FmlField.TYPE_STRING, 15, defaultValues[92], 92, 1);
        this.fmlBuffer[93] = new FmlField("CREDIT_SOURCE", FmlField.TYPE_BYTE, -1, defaultValues[93], 93, 1);
        this.fmlBuffer[94] = new FmlField("CREDIT_STATUS", FmlField.TYPE_STRING, 3, defaultValues[94], 94, 1);
        this.fmlBuffer[95] = new FmlField("EQU_CRD_LMT", FmlField.TYPE_DOUBLE, -1, defaultValues[95], 95, 1);
        this.fmlBuffer[96] = new FmlField("BL_VAT_EXEMPT_IND", FmlField.TYPE_BYTE, -1, defaultValues[96], 96, 1);
        this.fmlBuffer[97] = new FmlField("BL_VAT_EXEMPT_DATE", FmlField.TYPE_STRING, 9, defaultValues[97], 97, 1);
        this.fmlBuffer[98] = new FmlField("BL_VAT_EXEMPT_REF_NO", FmlField.TYPE_STRING, 17, defaultValues[98], 98, 1);
        this.fmlBuffer[99] = new FmlField("BL_VAT_EXEMPT_RSN_CD", FmlField.TYPE_STRING, 4, defaultValues[99], 99, 1);
        this.fmlBuffer[100] = new FmlField("DEFAULT_DEPARTMENT", FmlField.TYPE_STRING, 5, defaultValues[100], 100, 1);
        this.fmlBuffer[101] = new FmlField("COL_CODE", FmlField.TYPE_BYTE, -1, defaultValues[101], 101, 1);
        this.fmlBuffer[102] = new FmlField("CURR_ROOT_BAN", FmlField.TYPE_INTEGER, -1, defaultValues[102], 102, 1);
        this.fmlBuffer[103] = new FmlField("NEXT_ROOT_BAN", FmlField.TYPE_INTEGER, -1, defaultValues[103], 103, 1);
        this.fmlBuffer[104] = new FmlField("PARTITION_ROOT_BAN", FmlField.TYPE_INTEGER, -1, defaultValues[104], 104, 1);
        this.fmlBuffer[105] = new FmlField("CYCLE_FREQUENCY", FmlField.TYPE_SHORT, -1, defaultValues[105], 105, 1);
        this.fmlBuffer[106] = new FmlField("CYCLE_FIRST_BILL_MONTH", FmlField.TYPE_SHORT, -1, defaultValues[106], 106, 1);
        this.fmlBuffer[107] = new FmlField("BL_DUE_DAY", FmlField.TYPE_SHORT, -1, defaultValues[107], 107, 1);
        this.fmlBuffer[108] = new FmlField("VIP_IND", FmlField.TYPE_BYTE, -1, defaultValues[108], 108, 1);
        this.fmlBuffer[109] = new FmlField("BLACK_LISTED_IND", FmlField.TYPE_BYTE, -1, defaultValues[109], 109, 1);
        this.fmlBuffer[110] = new FmlField("BL_PRT_CATEGORY", FmlField.TYPE_STRING, 3, defaultValues[110], 110, 1);
        this.fmlBuffer[111] = new FmlField("CS_DEF_PRODUCT_TYPE", FmlField.TYPE_STRING, 4, defaultValues[111], 111, 1);
        this.fmlBuffer[112] = new FmlField("ORG_CODE", FmlField.TYPE_STRING, 6, defaultValues[112], 112, 1);
        this.fmlBuffer[113] = new FmlField("BL_HIER_BAN_IND", FmlField.TYPE_BYTE, -1, defaultValues[113], 113, 1);
        this.fmlBuffer[114] = new FmlField("PAYMENT_METHOD", FmlField.TYPE_STRING, 3, defaultValues[114], 114, 1);
        this.fmlBuffer[115] = new FmlField("PAYMENT_SUB_METHOD", FmlField.TYPE_STRING, 3, defaultValues[115], 115, 1);
        this.fmlBuffer[116] = new FmlField("OLD_ACCOUNT_ID", FmlField.TYPE_STRING, 21, defaultValues[116], 116, 1);
        this.fmlBuffer[117] = new FmlField("CARRY_OVER_BILL", FmlField.TYPE_BYTE, -1, defaultValues[117], 117, 1);
        this.fmlBuffer[118] = new FmlField("HIDE_PHONE_DIGITS_IND", FmlField.TYPE_BYTE, -1, defaultValues[118], 118, 1);
        this.fmlBuffer[119] = new FmlField("SEC_DEPARTMENT", FmlField.TYPE_STRING, 5, defaultValues[119], 119, 1);
        this.fmlBuffer[120] = new FmlField("NEXT_CONF_ROOT_BAN", FmlField.TYPE_INTEGER, -1, defaultValues[120], 120, 1);
        this.fmlBuffer[121] = new FmlField("EDI_LOCATION_NUMBER", FmlField.TYPE_DOUBLE, -1, defaultValues[121], 121, 1);
        this.fmlBuffer[122] = new FmlField("ALLOW_ADVERTISING_IND", FmlField.TYPE_BYTE, -1, defaultValues[122], 122, 1);
        this.fmlBuffer[123] = new FmlField("AGENCY_REF_NO", FmlField.TYPE_STRING, 9, defaultValues[123], 123, 1);
        this.fmlBuffer[124] = new FmlField("COL_AGENCY_CONF_DT", FmlField.TYPE_STRING, 9, defaultValues[124], 124, 1);
        this.fmlBuffer[125] = new FmlField("BAN_GROUP_NO", FmlField.TYPE_STRING, 11, defaultValues[125], 125, 1);
        this.fmlBuffer[126] = new FmlField("CAAP_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[126], 126, 1);
        this.fmlBuffer[127] = new FmlField("COL_AGNCY_CODE", FmlField.TYPE_STRING, 9, defaultValues[127], 127, 1);
        this.fmlBuffer[128] = new FmlField("INVOICE_FEE_WAIVE_IND", FmlField.TYPE_BYTE, -1, defaultValues[128], 128, 1);
        this.fmlBuffer[129] = new FmlField("PRD_ZERO_RATE_BILL", FmlField.TYPE_BYTE, -1, defaultValues[129], 129, 1);
        this.fmlBuffer[130] = new FmlField("CS_CREDIT_CLASS", FmlField.TYPE_BYTE, -1, defaultValues[130], 130, 1);
        this.fmlBuffer[131] = new FmlField("CS_APPROVED_CTN_QTY", FmlField.TYPE_SHORT, -1, defaultValues[131], 131, 1);
        this.fmlBuffer[132] = new FmlField("CAS_ORDER_NUMBER", FmlField.TYPE_INTEGER, -1, defaultValues[132], 132, 1);
        this.fmlBuffer[133] = new FmlField("PCNTRINPROWID", FmlField.TYPE_STRING, 19, defaultValues[133], 133, 1);
        this.fmlBuffer[134] = new FmlField("SUBSCRIBER_NO", FmlField.TYPE_STRING, 21, defaultValues[134], 134, 1);
        this.fmlBuffer[135] = new FmlField("PAPER_WORK_STATUS", FmlField.TYPE_STRING, 3, defaultValues[135], 135, 1);
        this.fmlBuffer[136] = new FmlField("PAPER_WORK_DATE", FmlField.TYPE_STRING, 9, defaultValues[136], 136, 1);
        this.fmlBuffer[137] = new FmlField("PAPER_WORK_REF_NO", FmlField.TYPE_STRING, 12, defaultValues[137], 137, 1);
        this.fmlBuffer[138] = new FmlField("PW_DESCRIPTION", FmlField.TYPE_STRING, 21, defaultValues[138], 138, 1);
        this.fmlBuffer[139] = new FmlField("MOREROWS", FmlField.TYPE_SHORT, -1, defaultValues[139], 139, 1);
        this.fmlBuffer[140] = new FmlField("ROWCOUNT", FmlField.TYPE_INTEGER, -1, defaultValues[140], 140, 1);
        this.fmlBuffer[141] = new FmlField("PARTRDREFARRAYROWID", FmlField.TYPE_STRING, 19, defaultValues[141], 141, 10);
        this.fmlBuffer[142] = new FmlField("PARTRDREFARRAYCUSTOMER_ID", FmlField.TYPE_INTEGER, -1, defaultValues[142], 142, 10);
        this.fmlBuffer[143] = new FmlField("TR_SEQ_NO", FmlField.TYPE_INTEGER, -1, defaultValues[143], 143, 10);
        this.fmlBuffer[144] = new FmlField("COMPANY_NAME", FmlField.TYPE_STRING, 61, defaultValues[144], 144, 10);
        this.fmlBuffer[145] = new FmlField("CONTACT_PERSON", FmlField.TYPE_STRING, 61, defaultValues[145], 145, 10);
        this.fmlBuffer[146] = new FmlField("PHONE_NO", FmlField.TYPE_STRING, 16, defaultValues[146], 146, 10);
        this.fmlBuffer[147] = new FmlField("FAX_NO", FmlField.TYPE_STRING, 16, defaultValues[147], 147, 10);
    }

    /**
     * Retrieves the value of the 'GENERATION' field in the FML buffer.
     *
     * @return Value of 'GENERATION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_GENERATION() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[0].getValue(0));
    }

    /**
     * Sets the value of the 'GENERATION' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_GENERATION(Integer value) throws FMLManipulationException {
        this.fmlBuffer[0].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'DIRECTIVE' field in the FML buffer.
     *
     * @return Value of 'DIRECTIVE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_DIRECTIVE() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[1].getValue(0));
    }

    /**
     * Sets the value of the 'DIRECTIVE' field in the FML buffer.
     *
     * @param value Default value: 0.
     * @throws FMLManipulationException
     */
    public void set_DIRECTIVE(Integer value) throws FMLManipulationException {
        this.fmlBuffer[1].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'FIRST_DIRECTIVE' field in the FML buffer.
     *
     * @return Value of 'FIRST_DIRECTIVE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_FIRST_DIRECTIVE() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[2].getValue(0));
    }

    /**
     * Sets the value of the 'FIRST_DIRECTIVE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_FIRST_DIRECTIVE(Integer value) throws FMLManipulationException {
        this.fmlBuffer[2].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'SECOND_DIRECTIVE' field in the FML buffer.
     *
     * @return Value of 'SECOND_DIRECTIVE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_SECOND_DIRECTIVE() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[3].getValue(0));
    }

    /**
     * Sets the value of the 'SECOND_DIRECTIVE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_SECOND_DIRECTIVE(Integer value) throws FMLManipulationException {
        this.fmlBuffer[3].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'OPERATOR_ID' field in the FML buffer.
     *
     * @return Value of 'OPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_OPERATOR_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[4].getValue(0));
    }

    /**
     * Sets the value of the 'OPERATOR_ID' field in the FML buffer.
     *
     * @param value Default value: 200900.
     * @throws FMLManipulationException
     */
    public void set_OPERATOR_ID(Integer value) throws FMLManipulationException {
        this.fmlBuffer[4].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'APPLICATION_ID' field in the FML buffer.
     *
     * @return Value of 'APPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_APPLICATION_ID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[5].getValue(0));
    }

    /**
     * Sets the value of the 'APPLICATION_ID' field in the FML buffer.
     *
     * @param value Default value: Ninja, Maximum length: 7.
     * @throws FMLManipulationException
     */
    public void set_APPLICATION_ID(String value) throws FMLManipulationException {
        this.fmlBuffer[5].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'TRANSACTION_MODE' field in the FML buffer.
     *
     * @return Value of 'TRANSACTION_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_TRANSACTION_MODE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[6].getValue(0)));
    }

    /**
     * Sets the value of the 'TRANSACTION_MODE' field in the FML buffer.
     *
     * @param value Default value: O.
     * @throws FMLManipulationException
     */
    public void set_TRANSACTION_MODE(String value) throws FMLManipulationException {
        this.fmlBuffer[6].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'RUN_DATE' field in the FML buffer.
     *
     * @return Value of 'RUN_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_RUN_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[7].getValue(0));
    }

    /**
     * Sets the value of the 'RUN_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_RUN_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[7].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'MARKET_CODE' field in the FML buffer.
     *
     * @return Value of 'MARKET_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MARKET_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[8].getValue(0));
    }

    /**
     * Sets the value of the 'MARKET_CODE' field in the FML buffer.
     *
     * @param value Default value: NTC, Maximum length: 4.
     * @throws FMLManipulationException
     */
    public void set_MARKET_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[8].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'SVC_STATUS' field in the FML buffer.
     *
     * @return Value of 'SVC_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SVC_STATUS() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[9].getValue(0)));
    }

    /**
     * Sets the value of the 'SVC_STATUS' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_SVC_STATUS(String value) throws FMLManipulationException {
        this.fmlBuffer[9].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'LAST_UPDATE_DATE' field in the FML buffer.
     *
     * @return Value of 'LAST_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LAST_UPDATE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[10].getValue(0));
    }

    /**
     * Sets the value of the 'LAST_UPDATE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @throws FMLManipulationException
     */
    public void set_LAST_UPDATE_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[10].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'LAST_UPDATE_STAMP' field in the FML buffer.
     *
     * @return Value of 'LAST_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LAST_UPDATE_STAMP() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[11].getValue(0)));
    }

    /**
     * Sets the value of the 'LAST_UPDATE_STAMP' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_LAST_UPDATE_STAMP(Integer value) throws FMLManipulationException {
        this.fmlBuffer[11].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'ENV_CODE' field in the FML buffer.
     *
     * @return Value of 'ENV_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ENV_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[12].getValue(0));
    }

    /**
     * Sets the value of the 'ENV_CODE' field in the FML buffer.
     *
     * @param value Default value: PRDENV, Maximum length: 11.
     * @throws FMLManipulationException
     */
    public void set_ENV_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[12].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'SESSION_ID' field in the FML buffer.
     *
     * @return Value of 'SESSION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_SESSION_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[13].getValue(0));
    }

    /**
     * Sets the value of the 'SESSION_ID' field in the FML buffer.
     *
     * @param value Default value: 0.
     * @throws FMLManipulationException
     */
    public void set_SESSION_ID(Integer value) throws FMLManipulationException {
        this.fmlBuffer[13].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'ONLINE_TRX_NO' field in the FML buffer.
     *
     * @return Value of 'ONLINE_TRX_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ONLINE_TRX_NO() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[14].getValue(0));
    }

    /**
     * Sets the value of the 'ONLINE_TRX_NO' field in the FML buffer.
     *
     * @param value Default value: 0.
     * @throws FMLManipulationException
     */
    public void set_ONLINE_TRX_NO(Integer value) throws FMLManipulationException {
        this.fmlBuffer[14].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'GROUP_TRX_ID' field in the FML buffer.
     *
     * @return Value of 'GROUP_TRX_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_GROUP_TRX_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[15].getValue(0));
    }

    /**
     * Sets the value of the 'GROUP_TRX_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_GROUP_TRX_ID(Integer value) throws FMLManipulationException {
        this.fmlBuffer[15].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'ROWID' field in the FML buffer.
     *
     * @return Value of 'ROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ROWID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[16].getValue(0));
    }

    /**
     * Sets the value of the 'ROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @throws FMLManipulationException
     */
    public void set_ROWID(String value) throws FMLManipulationException {
        this.fmlBuffer[16].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CUSTOMER_ID' field in the FML buffer.
     *
     * @return Value of 'CUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CUSTOMER_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[17].getValue(0));
    }

    /**
     * Sets the value of the 'CUSTOMER_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CUSTOMER_ID(Integer value) throws FMLManipulationException {
        this.fmlBuffer[17].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'SYS_CREATION_DATE' field in the FML buffer.
     *
     * @return Value of 'SYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SYS_CREATION_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[18].getValue(0));
    }

    /**
     * Sets the value of the 'SYS_CREATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @throws FMLManipulationException
     */
    public void set_SYS_CREATION_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[18].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'SYS_UPDATE_DATE' field in the FML buffer.
     *
     * @return Value of 'SYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SYS_UPDATE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[19].getValue(0));
    }

    /**
     * Sets the value of the 'SYS_UPDATE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @throws FMLManipulationException
     */
    public void set_SYS_UPDATE_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[19].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PCUSTRECOPERATOR_ID' field in the FML buffer.
     *
     * @return Value of 'PCUSTRECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PCUSTRECOPERATOR_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[20].getValue(0));
    }

    /**
     * Sets the value of the 'PCUSTRECOPERATOR_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PCUSTRECOPERATOR_ID(Integer value) throws FMLManipulationException {
        this.fmlBuffer[20].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PCUSTRECAPPLICATION_ID' field in the FML buffer.
     *
     * @return Value of 'PCUSTRECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PCUSTRECAPPLICATION_ID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[21].getValue(0));
    }

    /**
     * Sets the value of the 'PCUSTRECAPPLICATION_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @throws FMLManipulationException
     */
    public void set_PCUSTRECAPPLICATION_ID(String value) throws FMLManipulationException {
        this.fmlBuffer[21].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'DL_SERVICE_CODE' field in the FML buffer.
     *
     * @return Value of 'DL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DL_SERVICE_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[22].getValue(0));
    }

    /**
     * Sets the value of the 'DL_SERVICE_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @throws FMLManipulationException
     */
    public void set_DL_SERVICE_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[22].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'DL_UPDATE_STAMP' field in the FML buffer.
     *
     * @return Value of 'DL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_DL_UPDATE_STAMP() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[23].getValue(0)));
    }

    /**
     * Sets the value of the 'DL_UPDATE_STAMP' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_DL_UPDATE_STAMP(Integer value) throws FMLManipulationException {
        this.fmlBuffer[23].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'CUSTOMER_TELNO' field in the FML buffer.
     *
     * @return Value of 'CUSTOMER_TELNO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CUSTOMER_TELNO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[24].getValue(0));
    }

    /**
     * Sets the value of the 'CUSTOMER_TELNO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @throws FMLManipulationException
     */
    public void set_CUSTOMER_TELNO(String value) throws FMLManipulationException {
        this.fmlBuffer[24].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CUSTOMER_FAX' field in the FML buffer.
     *
     * @return Value of 'CUSTOMER_FAX' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CUSTOMER_FAX() throws FMLManipulationException {
        return ((String) this.fmlBuffer[25].getValue(0));
    }

    /**
     * Sets the value of the 'CUSTOMER_FAX' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @throws FMLManipulationException
     */
    public void set_CUSTOMER_FAX(String value) throws FMLManipulationException {
        this.fmlBuffer[25].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'WORK_TELNO' field in the FML buffer.
     *
     * @return Value of 'WORK_TELNO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_WORK_TELNO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[26].getValue(0));
    }

    /**
     * Sets the value of the 'WORK_TELNO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @throws FMLManipulationException
     */
    public void set_WORK_TELNO(String value) throws FMLManipulationException {
        this.fmlBuffer[26].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'WORK_FAX' field in the FML buffer.
     *
     * @return Value of 'WORK_FAX' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_WORK_FAX() throws FMLManipulationException {
        return ((String) this.fmlBuffer[27].getValue(0));
    }

    /**
     * Sets the value of the 'WORK_FAX' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @throws FMLManipulationException
     */
    public void set_WORK_FAX(String value) throws FMLManipulationException {
        this.fmlBuffer[27].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'DEALER_CODE' field in the FML buffer.
     *
     * @return Value of 'DEALER_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DEALER_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[28].getValue(0));
    }

    /**
     * Sets the value of the 'DEALER_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @throws FMLManipulationException
     */
    public void set_DEALER_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[28].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'SALES_AGENT' field in the FML buffer.
     *
     * @return Value of 'SALES_AGENT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SALES_AGENT() throws FMLManipulationException {
        return ((String) this.fmlBuffer[29].getValue(0));
    }

    /**
     * Sets the value of the 'SALES_AGENT' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @throws FMLManipulationException
     */
    public void set_SALES_AGENT(String value) throws FMLManipulationException {
        this.fmlBuffer[29].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'MARKET_ID' field in the FML buffer.
     *
     * @return Value of 'MARKET_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MARKET_ID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[30].getValue(0));
    }

    /**
     * Sets the value of the 'MARKET_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @throws FMLManipulationException
     */
    public void set_MARKET_ID(String value) throws FMLManipulationException {
        this.fmlBuffer[30].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'ACC_PASSWORD' field in the FML buffer.
     *
     * @return Value of 'ACC_PASSWORD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACC_PASSWORD() throws FMLManipulationException {
        return ((String) this.fmlBuffer[31].getValue(0));
    }

    /**
     * Sets the value of the 'ACC_PASSWORD' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @throws FMLManipulationException
     */
    public void set_ACC_PASSWORD(String value) throws FMLManipulationException {
        this.fmlBuffer[31].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'VERIFIED_DATE' field in the FML buffer.
     *
     * @return Value of 'VERIFIED_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_VERIFIED_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[32].getValue(0));
    }

    /**
     * Sets the value of the 'VERIFIED_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_VERIFIED_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[32].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CONV_CUST_ID' field in the FML buffer.
     *
     * @return Value of 'CONV_CUST_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CONV_CUST_ID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[33].getValue(0));
    }

    /**
     * Sets the value of the 'CONV_CUST_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 11.
     * @throws FMLManipulationException
     */
    public void set_CONV_CUST_ID(String value) throws FMLManipulationException {
        this.fmlBuffer[33].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'BUSINESS_ENTITY' field in the FML buffer.
     *
     * @return Value of 'BUSINESS_ENTITY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BUSINESS_ENTITY() throws FMLManipulationException {
        return ((String) this.fmlBuffer[34].getValue(0));
    }

    /**
     * Sets the value of the 'BUSINESS_ENTITY' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @throws FMLManipulationException
     */
    public void set_BUSINESS_ENTITY(String value) throws FMLManipulationException {
        this.fmlBuffer[34].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'LOCATION' field in the FML buffer.
     *
     * @return Value of 'LOCATION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LOCATION() throws FMLManipulationException {
        return ((String) this.fmlBuffer[35].getValue(0));
    }

    /**
     * Sets the value of the 'LOCATION' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @throws FMLManipulationException
     */
    public void set_LOCATION(String value) throws FMLManipulationException {
        this.fmlBuffer[35].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CONV_RUN_NO' field in the FML buffer.
     *
     * @return Value of 'CONV_RUN_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CONV_RUN_NO() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[36].getValue(0)));
    }

    /**
     * Sets the value of the 'CONV_RUN_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CONV_RUN_NO(Integer value) throws FMLManipulationException {
        this.fmlBuffer[36].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'AGE_VERIFICATION_STATUS' field in the FML buffer.
     *
     * @return Value of 'AGE_VERIFICATION_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_AGE_VERIFICATION_STATUS() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[37].getValue(0)));
    }

    /**
     * Sets the value of the 'AGE_VERIFICATION_STATUS' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_AGE_VERIFICATION_STATUS(String value) throws FMLManipulationException {
        this.fmlBuffer[37].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'EMPLOYMENT_TYPE' field in the FML buffer.
     *
     * @return Value of 'EMPLOYMENT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EMPLOYMENT_TYPE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[38].getValue(0));
    }

    /**
     * Sets the value of the 'EMPLOYMENT_TYPE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @throws FMLManipulationException
     */
    public void set_EMPLOYMENT_TYPE(String value) throws FMLManipulationException {
        this.fmlBuffer[38].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'EMPLOYMENT_DATE' field in the FML buffer.
     *
     * @return Value of 'EMPLOYMENT_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EMPLOYMENT_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[39].getValue(0));
    }

    /**
     * Sets the value of the 'EMPLOYMENT_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_EMPLOYMENT_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[39].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'OPEN_BANK_ACCOUNT_DATE' field in the FML buffer.
     *
     * @return Value of 'OPEN_BANK_ACCOUNT_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_OPEN_BANK_ACCOUNT_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[40].getValue(0));
    }

    /**
     * Sets the value of the 'OPEN_BANK_ACCOUNT_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_OPEN_BANK_ACCOUNT_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[40].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'E_POST' field in the FML buffer.
     *
     * @return Value of 'E_POST' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_E_POST() throws FMLManipulationException {
        return ((String) this.fmlBuffer[41].getValue(0));
    }

    /**
     * Sets the value of the 'E_POST' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 151.
     * @throws FMLManipulationException
     */
    public void set_E_POST(String value) throws FMLManipulationException {
        this.fmlBuffer[41].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PBANRECROWID' field in the FML buffer.
     *
     * @return Value of 'PBANRECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PBANRECROWID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[42].getValue(0));
    }

    /**
     * Sets the value of the 'PBANRECROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @throws FMLManipulationException
     */
    public void set_PBANRECROWID(String value) throws FMLManipulationException {
        this.fmlBuffer[42].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'BAN' field in the FML buffer.
     *
     * @return Value of 'BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BAN() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[43].getValue(0));
    }

    /**
     * Sets the value of the 'BAN' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BAN(Integer value) throws FMLManipulationException {
        this.fmlBuffer[43].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PBANRECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @return Value of 'PBANRECSYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PBANRECSYS_CREATION_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[44].getValue(0));
    }

    /**
     * Sets the value of the 'PBANRECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @throws FMLManipulationException
     */
    public void set_PBANRECSYS_CREATION_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[44].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PBANRECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @return Value of 'PBANRECSYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PBANRECSYS_UPDATE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[45].getValue(0));
    }

    /**
     * Sets the value of the 'PBANRECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @throws FMLManipulationException
     */
    public void set_PBANRECSYS_UPDATE_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[45].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PBANRECOPERATOR_ID' field in the FML buffer.
     *
     * @return Value of 'PBANRECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PBANRECOPERATOR_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[46].getValue(0));
    }

    /**
     * Sets the value of the 'PBANRECOPERATOR_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PBANRECOPERATOR_ID(Integer value) throws FMLManipulationException {
        this.fmlBuffer[46].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PBANRECAPPLICATION_ID' field in the FML buffer.
     *
     * @return Value of 'PBANRECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PBANRECAPPLICATION_ID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[47].getValue(0));
    }

    /**
     * Sets the value of the 'PBANRECAPPLICATION_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @throws FMLManipulationException
     */
    public void set_PBANRECAPPLICATION_ID(String value) throws FMLManipulationException {
        this.fmlBuffer[47].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PBANRECCUSTOMER_ID' field in the FML buffer.
     *
     * @return Value of 'PBANRECCUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PBANRECCUSTOMER_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[48].getValue(0));
    }

    /**
     * Sets the value of the 'PBANRECCUSTOMER_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PBANRECCUSTOMER_ID(Integer value) throws FMLManipulationException {
        this.fmlBuffer[48].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'START_SERVICE_DATE' field in the FML buffer.
     *
     * @return Value of 'START_SERVICE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_START_SERVICE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[49].getValue(0));
    }

    /**
     * Sets the value of the 'START_SERVICE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_START_SERVICE_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[49].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'COL_DELINQ_STATUS' field in the FML buffer.
     *
     * @return Value of 'COL_DELINQ_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_DELINQ_STATUS() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[50].getValue(0)));
    }

    /**
     * Sets the value of the 'COL_DELINQ_STATUS' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_COL_DELINQ_STATUS(String value) throws FMLManipulationException {
        this.fmlBuffer[50].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'BAN_STATUS' field in the FML buffer.
     *
     * @return Value of 'BAN_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BAN_STATUS() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[51].getValue(0)));
    }

    /**
     * Sets the value of the 'BAN_STATUS' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BAN_STATUS(String value) throws FMLManipulationException {
        this.fmlBuffer[51].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'STATUS_LAST_DATE' field in the FML buffer.
     *
     * @return Value of 'STATUS_LAST_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_STATUS_LAST_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[52].getValue(0));
    }

    /**
     * Sets the value of the 'STATUS_LAST_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_STATUS_LAST_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[52].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'STATUS_ACTV_CODE' field in the FML buffer.
     *
     * @return Value of 'STATUS_ACTV_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_STATUS_ACTV_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[53].getValue(0));
    }

    /**
     * Sets the value of the 'STATUS_ACTV_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @throws FMLManipulationException
     */
    public void set_STATUS_ACTV_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[53].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'STATUS_ACTV_RSN_CODE' field in the FML buffer.
     *
     * @return Value of 'STATUS_ACTV_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_STATUS_ACTV_RSN_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[54].getValue(0));
    }

    /**
     * Sets the value of the 'STATUS_ACTV_RSN_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @throws FMLManipulationException
     */
    public void set_STATUS_ACTV_RSN_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[54].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'BILL_CYCLE' field in the FML buffer.
     *
     * @return Value of 'BILL_CYCLE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BILL_CYCLE() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[55].getValue(0)));
    }

    /**
     * Sets the value of the 'BILL_CYCLE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BILL_CYCLE(Integer value) throws FMLManipulationException {
        this.fmlBuffer[55].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'AR_BALANCE' field in the FML buffer.
     *
     * @return Value of 'AR_BALANCE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_AR_BALANCE() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[56].getValue(0));
    }

    /**
     * Sets the value of the 'AR_BALANCE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_AR_BALANCE(Double value) throws FMLManipulationException {
        this.fmlBuffer[56].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'BL_CUR_BILL_SEQ_NO' field in the FML buffer.
     *
     * @return Value of 'BL_CUR_BILL_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BL_CUR_BILL_SEQ_NO() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[57].getValue(0)));
    }

    /**
     * Sets the value of the 'BL_CUR_BILL_SEQ_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BL_CUR_BILL_SEQ_NO(Integer value) throws FMLManipulationException {
        this.fmlBuffer[57].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'BL_LAST_RG_CYC_DATE' field in the FML buffer.
     *
     * @return Value of 'BL_LAST_RG_CYC_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_LAST_RG_CYC_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[58].getValue(0));
    }

    /**
     * Sets the value of the 'BL_LAST_RG_CYC_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_BL_LAST_RG_CYC_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[58].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'BL_COMPLT_STATUS' field in the FML buffer.
     *
     * @return Value of 'BL_COMPLT_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_COMPLT_STATUS() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[59].getValue(0)));
    }

    /**
     * Sets the value of the 'BL_COMPLT_STATUS' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BL_COMPLT_STATUS(String value) throws FMLManipulationException {
        this.fmlBuffer[59].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'BL_SPECIAL_CYCLE' field in the FML buffer.
     *
     * @return Value of 'BL_SPECIAL_CYCLE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BL_SPECIAL_CYCLE() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[60].getValue(0)));
    }

    /**
     * Sets the value of the 'BL_SPECIAL_CYCLE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BL_SPECIAL_CYCLE(Integer value) throws FMLManipulationException {
        this.fmlBuffer[60].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'ACCOUNT_SUB_TYPE' field in the FML buffer.
     *
     * @return Value of 'ACCOUNT_SUB_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACCOUNT_SUB_TYPE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[61].getValue(0));
    }

    /**
     * Sets the value of the 'ACCOUNT_SUB_TYPE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 3.
     * @throws FMLManipulationException
     */
    public void set_ACCOUNT_SUB_TYPE(String value) throws FMLManipulationException {
        this.fmlBuffer[61].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'BL_MAN_HNDL_RSN' field in the FML buffer.
     *
     * @return Value of 'BL_MAN_HNDL_RSN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_MAN_HNDL_RSN() throws FMLManipulationException {
        return ((String) this.fmlBuffer[62].getValue(0));
    }

    /**
     * Sets the value of the 'BL_MAN_HNDL_RSN' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 3.
     * @throws FMLManipulationException
     */
    public void set_BL_MAN_HNDL_RSN(String value) throws FMLManipulationException {
        this.fmlBuffer[62].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'BL_MAN_HNDL_EFF_DATE' field in the FML buffer.
     *
     * @return Value of 'BL_MAN_HNDL_EFF_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_MAN_HNDL_EFF_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[63].getValue(0));
    }

    /**
     * Sets the value of the 'BL_MAN_HNDL_EFF_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_BL_MAN_HNDL_EFF_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[63].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'BL_MAN_HNDL_EXP_DATE' field in the FML buffer.
     *
     * @return Value of 'BL_MAN_HNDL_EXP_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_MAN_HNDL_EXP_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[64].getValue(0));
    }

    /**
     * Sets the value of the 'BL_MAN_HNDL_EXP_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_BL_MAN_HNDL_EXP_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[64].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'BL_MAN_HNDL_REQ_OPID' field in the FML buffer.
     *
     * @return Value of 'BL_MAN_HNDL_REQ_OPID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BL_MAN_HNDL_REQ_OPID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[65].getValue(0));
    }

    /**
     * Sets the value of the 'BL_MAN_HNDL_REQ_OPID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BL_MAN_HNDL_REQ_OPID(Integer value) throws FMLManipulationException {
        this.fmlBuffer[65].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'BL_MAN_HNDL_BY_OPID' field in the FML buffer.
     *
     * @return Value of 'BL_MAN_HNDL_BY_OPID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BL_MAN_HNDL_BY_OPID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[66].getValue(0));
    }

    /**
     * Sets the value of the 'BL_MAN_HNDL_BY_OPID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BL_MAN_HNDL_BY_OPID(Integer value) throws FMLManipulationException {
        this.fmlBuffer[66].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'BL_REQ_ST_GRACE_PRD' field in the FML buffer.
     *
     * @return Value of 'BL_REQ_ST_GRACE_PRD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_REQ_ST_GRACE_PRD() throws FMLManipulationException {
        return ((String) this.fmlBuffer[67].getValue(0));
    }

    /**
     * Sets the value of the 'BL_REQ_ST_GRACE_PRD' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_BL_REQ_ST_GRACE_PRD(String value) throws FMLManipulationException {
        this.fmlBuffer[67].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'BL_REQ_END_GRACE_PRD' field in the FML buffer.
     *
     * @return Value of 'BL_REQ_END_GRACE_PRD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_REQ_END_GRACE_PRD() throws FMLManipulationException {
        return ((String) this.fmlBuffer[68].getValue(0));
    }

    /**
     * Sets the value of the 'BL_REQ_END_GRACE_PRD' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_BL_REQ_END_GRACE_PRD(String value) throws FMLManipulationException {
        this.fmlBuffer[68].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'BL_NEXT_CYCLE' field in the FML buffer.
     *
     * @return Value of 'BL_NEXT_CYCLE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BL_NEXT_CYCLE() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[69].getValue(0)));
    }

    /**
     * Sets the value of the 'BL_NEXT_CYCLE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BL_NEXT_CYCLE(Integer value) throws FMLManipulationException {
        this.fmlBuffer[69].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'BL_NEXT_CYC_EFF_DATE' field in the FML buffer.
     *
     * @return Value of 'BL_NEXT_CYC_EFF_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_NEXT_CYC_EFF_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[70].getValue(0));
    }

    /**
     * Sets the value of the 'BL_NEXT_CYC_EFF_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_BL_NEXT_CYC_EFF_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[70].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CS_MIN_REQ_CTNS' field in the FML buffer.
     *
     * @return Value of 'CS_MIN_REQ_CTNS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CS_MIN_REQ_CTNS() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[71].getValue(0));
    }

    /**
     * Sets the value of the 'CS_MIN_REQ_CTNS' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CS_MIN_REQ_CTNS(Integer value) throws FMLManipulationException {
        this.fmlBuffer[71].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CS_SPEC_MEMO_IND' field in the FML buffer.
     *
     * @return Value of 'CS_SPEC_MEMO_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CS_SPEC_MEMO_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[72].getValue(0)));
    }

    /**
     * Sets the value of the 'CS_SPEC_MEMO_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CS_SPEC_MEMO_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[72].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'AR_EXCPT_ACCT_IND' field in the FML buffer.
     *
     * @return Value of 'AR_EXCPT_ACCT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_AR_EXCPT_ACCT_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[73].getValue(0)));
    }

    /**
     * Sets the value of the 'AR_EXCPT_ACCT_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_AR_EXCPT_ACCT_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[73].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'CS_COM_START_DATE' field in the FML buffer.
     *
     * @return Value of 'CS_COM_START_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CS_COM_START_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[74].getValue(0));
    }

    /**
     * Sets the value of the 'CS_COM_START_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_CS_COM_START_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[74].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CS_COM_END_DATE' field in the FML buffer.
     *
     * @return Value of 'CS_COM_END_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CS_COM_END_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[75].getValue(0));
    }

    /**
     * Sets the value of the 'CS_COM_END_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_CS_COM_END_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[75].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CS_COM_REASON_CODE' field in the FML buffer.
     *
     * @return Value of 'CS_COM_REASON_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CS_COM_REASON_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[76].getValue(0));
    }

    /**
     * Sets the value of the 'CS_COM_REASON_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @throws FMLManipulationException
     */
    public void set_CS_COM_REASON_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[76].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CS_COM_ORIG_NO_MONTH' field in the FML buffer.
     *
     * @return Value of 'CS_COM_ORIG_NO_MONTH' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CS_COM_ORIG_NO_MONTH() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[77].getValue(0)));
    }

    /**
     * Sets the value of the 'CS_COM_ORIG_NO_MONTH' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CS_COM_ORIG_NO_MONTH(Integer value) throws FMLManipulationException {
        this.fmlBuffer[77].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'AR_WO_IND' field in the FML buffer.
     *
     * @return Value of 'AR_WO_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_AR_WO_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[78].getValue(0)));
    }

    /**
     * Sets the value of the 'AR_WO_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_AR_WO_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[78].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'ACCOUNT_TYPE' field in the FML buffer.
     *
     * @return Value of 'ACCOUNT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACCOUNT_TYPE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[79].getValue(0)));
    }

    /**
     * Sets the value of the 'ACCOUNT_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_ACCOUNT_TYPE(String value) throws FMLManipulationException {
        this.fmlBuffer[79].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'COL_ASSIGNED_COLL' field in the FML buffer.
     *
     * @return Value of 'COL_ASSIGNED_COLL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_ASSIGNED_COLL() throws FMLManipulationException {
        return ((String) this.fmlBuffer[80].getValue(0));
    }

    /**
     * Sets the value of the 'COL_ASSIGNED_COLL' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_COL_ASSIGNED_COLL(String value) throws FMLManipulationException {
        this.fmlBuffer[80].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'BL_ZERO_BALANC_IND' field in the FML buffer.
     *
     * @return Value of 'BL_ZERO_BALANC_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_ZERO_BALANC_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[81].getValue(0)));
    }

    /**
     * Sets the value of the 'BL_ZERO_BALANC_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BL_ZERO_BALANC_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[81].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'DEFAULT_SUB_MARKET' field in the FML buffer.
     *
     * @return Value of 'DEFAULT_SUB_MARKET' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DEFAULT_SUB_MARKET() throws FMLManipulationException {
        return ((String) this.fmlBuffer[82].getValue(0));
    }

    /**
     * Sets the value of the 'DEFAULT_SUB_MARKET' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @throws FMLManipulationException
     */
    public void set_DEFAULT_SUB_MARKET(String value) throws FMLManipulationException {
        this.fmlBuffer[82].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'BL_DEF_MAILING_IND' field in the FML buffer.
     *
     * @return Value of 'BL_DEF_MAILING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_DEF_MAILING_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[83].getValue(0)));
    }

    /**
     * Sets the value of the 'BL_DEF_MAILING_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BL_DEF_MAILING_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[83].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'BL_BILL_PROD_IND' field in the FML buffer.
     *
     * @return Value of 'BL_BILL_PROD_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_BILL_PROD_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[84].getValue(0)));
    }

    /**
     * Sets the value of the 'BL_BILL_PROD_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BL_BILL_PROD_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[84].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'BL_BAL_HANDLE_IND' field in the FML buffer.
     *
     * @return Value of 'BL_BAL_HANDLE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_BAL_HANDLE_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[85].getValue(0)));
    }

    /**
     * Sets the value of the 'BL_BAL_HANDLE_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BL_BAL_HANDLE_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[85].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'BL_NO_MNSP_IND' field in the FML buffer.
     *
     * @return Value of 'BL_NO_MNSP_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_NO_MNSP_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[86].getValue(0)));
    }

    /**
     * Sets the value of the 'BL_NO_MNSP_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BL_NO_MNSP_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[86].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'CS_BAN_TRX_OFF_IND' field in the FML buffer.
     *
     * @return Value of 'CS_BAN_TRX_OFF_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CS_BAN_TRX_OFF_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[87].getValue(0)));
    }

    /**
     * Sets the value of the 'CS_BAN_TRX_OFF_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CS_BAN_TRX_OFF_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[87].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'CS_HANDLE_BY_CTN_IND' field in the FML buffer.
     *
     * @return Value of 'CS_HANDLE_BY_CTN_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CS_HANDLE_BY_CTN_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[88].getValue(0)));
    }

    /**
     * Sets the value of the 'CS_HANDLE_BY_CTN_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CS_HANDLE_BY_CTN_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[88].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'CS_LOCK_MECHANISM' field in the FML buffer.
     *
     * @return Value of 'CS_LOCK_MECHANISM' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CS_LOCK_MECHANISM() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[89].getValue(0)));
    }

    /**
     * Sets the value of the 'CS_LOCK_MECHANISM' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CS_LOCK_MECHANISM(String value) throws FMLManipulationException {
        this.fmlBuffer[89].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'COMP_CRD_LMT' field in the FML buffer.
     *
     * @return Value of 'COMP_CRD_LMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_COMP_CRD_LMT() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[90].getValue(0));
    }

    /**
     * Sets the value of the 'COMP_CRD_LMT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_COMP_CRD_LMT(Double value) throws FMLManipulationException {
        this.fmlBuffer[90].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CREDIT_CLASS' field in the FML buffer.
     *
     * @return Value of 'CREDIT_CLASS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CREDIT_CLASS() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[91].getValue(0)));
    }

    /**
     * Sets the value of the 'CREDIT_CLASS' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CREDIT_CLASS(String value) throws FMLManipulationException {
        this.fmlBuffer[91].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'CREDIT_DATE' field in the FML buffer.
     *
     * @return Value of 'CREDIT_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CREDIT_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[92].getValue(0));
    }

    /**
     * Sets the value of the 'CREDIT_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @throws FMLManipulationException
     */
    public void set_CREDIT_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[92].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CREDIT_SOURCE' field in the FML buffer.
     *
     * @return Value of 'CREDIT_SOURCE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CREDIT_SOURCE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[93].getValue(0)));
    }

    /**
     * Sets the value of the 'CREDIT_SOURCE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CREDIT_SOURCE(String value) throws FMLManipulationException {
        this.fmlBuffer[93].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'CREDIT_STATUS' field in the FML buffer.
     *
     * @return Value of 'CREDIT_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CREDIT_STATUS() throws FMLManipulationException {
        return ((String) this.fmlBuffer[94].getValue(0));
    }

    /**
     * Sets the value of the 'CREDIT_STATUS' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 3.
     * @throws FMLManipulationException
     */
    public void set_CREDIT_STATUS(String value) throws FMLManipulationException {
        this.fmlBuffer[94].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'EQU_CRD_LMT' field in the FML buffer.
     *
     * @return Value of 'EQU_CRD_LMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_EQU_CRD_LMT() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[95].getValue(0));
    }

    /**
     * Sets the value of the 'EQU_CRD_LMT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_EQU_CRD_LMT(Double value) throws FMLManipulationException {
        this.fmlBuffer[95].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'BL_VAT_EXEMPT_IND' field in the FML buffer.
     *
     * @return Value of 'BL_VAT_EXEMPT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_VAT_EXEMPT_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[96].getValue(0)));
    }

    /**
     * Sets the value of the 'BL_VAT_EXEMPT_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BL_VAT_EXEMPT_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[96].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'BL_VAT_EXEMPT_DATE' field in the FML buffer.
     *
     * @return Value of 'BL_VAT_EXEMPT_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_VAT_EXEMPT_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[97].getValue(0));
    }

    /**
     * Sets the value of the 'BL_VAT_EXEMPT_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_BL_VAT_EXEMPT_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[97].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'BL_VAT_EXEMPT_REF_NO' field in the FML buffer.
     *
     * @return Value of 'BL_VAT_EXEMPT_REF_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_VAT_EXEMPT_REF_NO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[98].getValue(0));
    }

    /**
     * Sets the value of the 'BL_VAT_EXEMPT_REF_NO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 17.
     * @throws FMLManipulationException
     */
    public void set_BL_VAT_EXEMPT_REF_NO(String value) throws FMLManipulationException {
        this.fmlBuffer[98].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'BL_VAT_EXEMPT_RSN_CD' field in the FML buffer.
     *
     * @return Value of 'BL_VAT_EXEMPT_RSN_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_VAT_EXEMPT_RSN_CD() throws FMLManipulationException {
        return ((String) this.fmlBuffer[99].getValue(0));
    }

    /**
     * Sets the value of the 'BL_VAT_EXEMPT_RSN_CD' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @throws FMLManipulationException
     */
    public void set_BL_VAT_EXEMPT_RSN_CD(String value) throws FMLManipulationException {
        this.fmlBuffer[99].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'DEFAULT_DEPARTMENT' field in the FML buffer.
     *
     * @return Value of 'DEFAULT_DEPARTMENT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DEFAULT_DEPARTMENT() throws FMLManipulationException {
        return ((String) this.fmlBuffer[100].getValue(0));
    }

    /**
     * Sets the value of the 'DEFAULT_DEPARTMENT' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @throws FMLManipulationException
     */
    public void set_DEFAULT_DEPARTMENT(String value) throws FMLManipulationException {
        this.fmlBuffer[100].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'COL_CODE' field in the FML buffer.
     *
     * @return Value of 'COL_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_CODE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[101].getValue(0)));
    }

    /**
     * Sets the value of the 'COL_CODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_COL_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[101].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'CURR_ROOT_BAN' field in the FML buffer.
     *
     * @return Value of 'CURR_ROOT_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CURR_ROOT_BAN() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[102].getValue(0));
    }

    /**
     * Sets the value of the 'CURR_ROOT_BAN' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CURR_ROOT_BAN(Integer value) throws FMLManipulationException {
        this.fmlBuffer[102].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'NEXT_ROOT_BAN' field in the FML buffer.
     *
     * @return Value of 'NEXT_ROOT_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NEXT_ROOT_BAN() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[103].getValue(0));
    }

    /**
     * Sets the value of the 'NEXT_ROOT_BAN' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_NEXT_ROOT_BAN(Integer value) throws FMLManipulationException {
        this.fmlBuffer[103].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PARTITION_ROOT_BAN' field in the FML buffer.
     *
     * @return Value of 'PARTITION_ROOT_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PARTITION_ROOT_BAN() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[104].getValue(0));
    }

    /**
     * Sets the value of the 'PARTITION_ROOT_BAN' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PARTITION_ROOT_BAN(Integer value) throws FMLManipulationException {
        this.fmlBuffer[104].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CYCLE_FREQUENCY' field in the FML buffer.
     *
     * @return Value of 'CYCLE_FREQUENCY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CYCLE_FREQUENCY() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[105].getValue(0)));
    }

    /**
     * Sets the value of the 'CYCLE_FREQUENCY' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CYCLE_FREQUENCY(Integer value) throws FMLManipulationException {
        this.fmlBuffer[105].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'CYCLE_FIRST_BILL_MONTH' field in the FML buffer.
     *
     * @return Value of 'CYCLE_FIRST_BILL_MONTH' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CYCLE_FIRST_BILL_MONTH() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[106].getValue(0)));
    }

    /**
     * Sets the value of the 'CYCLE_FIRST_BILL_MONTH' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CYCLE_FIRST_BILL_MONTH(Integer value) throws FMLManipulationException {
        this.fmlBuffer[106].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'BL_DUE_DAY' field in the FML buffer.
     *
     * @return Value of 'BL_DUE_DAY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BL_DUE_DAY() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[107].getValue(0)));
    }

    /**
     * Sets the value of the 'BL_DUE_DAY' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BL_DUE_DAY(Integer value) throws FMLManipulationException {
        this.fmlBuffer[107].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'VIP_IND' field in the FML buffer.
     *
     * @return Value of 'VIP_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_VIP_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[108].getValue(0)));
    }

    /**
     * Sets the value of the 'VIP_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_VIP_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[108].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'BLACK_LISTED_IND' field in the FML buffer.
     *
     * @return Value of 'BLACK_LISTED_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BLACK_LISTED_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[109].getValue(0)));
    }

    /**
     * Sets the value of the 'BLACK_LISTED_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BLACK_LISTED_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[109].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'BL_PRT_CATEGORY' field in the FML buffer.
     *
     * @return Value of 'BL_PRT_CATEGORY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_PRT_CATEGORY() throws FMLManipulationException {
        return ((String) this.fmlBuffer[110].getValue(0));
    }

    /**
     * Sets the value of the 'BL_PRT_CATEGORY' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 3.
     * @throws FMLManipulationException
     */
    public void set_BL_PRT_CATEGORY(String value) throws FMLManipulationException {
        this.fmlBuffer[110].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CS_DEF_PRODUCT_TYPE' field in the FML buffer.
     *
     * @return Value of 'CS_DEF_PRODUCT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CS_DEF_PRODUCT_TYPE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[111].getValue(0));
    }

    /**
     * Sets the value of the 'CS_DEF_PRODUCT_TYPE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @throws FMLManipulationException
     */
    public void set_CS_DEF_PRODUCT_TYPE(String value) throws FMLManipulationException {
        this.fmlBuffer[111].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'ORG_CODE' field in the FML buffer.
     *
     * @return Value of 'ORG_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ORG_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[112].getValue(0));
    }

    /**
     * Sets the value of the 'ORG_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @throws FMLManipulationException
     */
    public void set_ORG_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[112].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'BL_HIER_BAN_IND' field in the FML buffer.
     *
     * @return Value of 'BL_HIER_BAN_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_HIER_BAN_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[113].getValue(0)));
    }

    /**
     * Sets the value of the 'BL_HIER_BAN_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BL_HIER_BAN_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[113].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'PAYMENT_METHOD' field in the FML buffer.
     *
     * @return Value of 'PAYMENT_METHOD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAYMENT_METHOD() throws FMLManipulationException {
        return ((String) this.fmlBuffer[114].getValue(0));
    }

    /**
     * Sets the value of the 'PAYMENT_METHOD' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 3.
     * @throws FMLManipulationException
     */
    public void set_PAYMENT_METHOD(String value) throws FMLManipulationException {
        this.fmlBuffer[114].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PAYMENT_SUB_METHOD' field in the FML buffer.
     *
     * @return Value of 'PAYMENT_SUB_METHOD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAYMENT_SUB_METHOD() throws FMLManipulationException {
        return ((String) this.fmlBuffer[115].getValue(0));
    }

    /**
     * Sets the value of the 'PAYMENT_SUB_METHOD' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 3.
     * @throws FMLManipulationException
     */
    public void set_PAYMENT_SUB_METHOD(String value) throws FMLManipulationException {
        this.fmlBuffer[115].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'OLD_ACCOUNT_ID' field in the FML buffer.
     *
     * @return Value of 'OLD_ACCOUNT_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_OLD_ACCOUNT_ID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[116].getValue(0));
    }

    /**
     * Sets the value of the 'OLD_ACCOUNT_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @throws FMLManipulationException
     */
    public void set_OLD_ACCOUNT_ID(String value) throws FMLManipulationException {
        this.fmlBuffer[116].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CARRY_OVER_BILL' field in the FML buffer.
     *
     * @return Value of 'CARRY_OVER_BILL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CARRY_OVER_BILL() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[117].getValue(0)));
    }

    /**
     * Sets the value of the 'CARRY_OVER_BILL' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CARRY_OVER_BILL(String value) throws FMLManipulationException {
        this.fmlBuffer[117].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'HIDE_PHONE_DIGITS_IND' field in the FML buffer.
     *
     * @return Value of 'HIDE_PHONE_DIGITS_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_HIDE_PHONE_DIGITS_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[118].getValue(0)));
    }

    /**
     * Sets the value of the 'HIDE_PHONE_DIGITS_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_HIDE_PHONE_DIGITS_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[118].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'SEC_DEPARTMENT' field in the FML buffer.
     *
     * @return Value of 'SEC_DEPARTMENT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SEC_DEPARTMENT() throws FMLManipulationException {
        return ((String) this.fmlBuffer[119].getValue(0));
    }

    /**
     * Sets the value of the 'SEC_DEPARTMENT' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @throws FMLManipulationException
     */
    public void set_SEC_DEPARTMENT(String value) throws FMLManipulationException {
        this.fmlBuffer[119].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'NEXT_CONF_ROOT_BAN' field in the FML buffer.
     *
     * @return Value of 'NEXT_CONF_ROOT_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NEXT_CONF_ROOT_BAN() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[120].getValue(0));
    }

    /**
     * Sets the value of the 'NEXT_CONF_ROOT_BAN' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_NEXT_CONF_ROOT_BAN(Integer value) throws FMLManipulationException {
        this.fmlBuffer[120].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'EDI_LOCATION_NUMBER' field in the FML buffer.
     *
     * @return Value of 'EDI_LOCATION_NUMBER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_EDI_LOCATION_NUMBER() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[121].getValue(0));
    }

    /**
     * Sets the value of the 'EDI_LOCATION_NUMBER' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_EDI_LOCATION_NUMBER(Double value) throws FMLManipulationException {
        this.fmlBuffer[121].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'ALLOW_ADVERTISING_IND' field in the FML buffer.
     *
     * @return Value of 'ALLOW_ADVERTISING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ALLOW_ADVERTISING_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[122].getValue(0)));
    }

    /**
     * Sets the value of the 'ALLOW_ADVERTISING_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_ALLOW_ADVERTISING_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[122].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'AGENCY_REF_NO' field in the FML buffer.
     *
     * @return Value of 'AGENCY_REF_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_AGENCY_REF_NO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[123].getValue(0));
    }

    /**
     * Sets the value of the 'AGENCY_REF_NO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_AGENCY_REF_NO(String value) throws FMLManipulationException {
        this.fmlBuffer[123].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'COL_AGENCY_CONF_DT' field in the FML buffer.
     *
     * @return Value of 'COL_AGENCY_CONF_DT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_AGENCY_CONF_DT() throws FMLManipulationException {
        return ((String) this.fmlBuffer[124].getValue(0));
    }

    /**
     * Sets the value of the 'COL_AGENCY_CONF_DT' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_COL_AGENCY_CONF_DT(String value) throws FMLManipulationException {
        this.fmlBuffer[124].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'BAN_GROUP_NO' field in the FML buffer.
     *
     * @return Value of 'BAN_GROUP_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BAN_GROUP_NO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[125].getValue(0));
    }

    /**
     * Sets the value of the 'BAN_GROUP_NO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 11.
     * @throws FMLManipulationException
     */
    public void set_BAN_GROUP_NO(String value) throws FMLManipulationException {
        this.fmlBuffer[125].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CAAP_TYPE' field in the FML buffer.
     *
     * @return Value of 'CAAP_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CAAP_TYPE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[126].getValue(0)));
    }

    /**
     * Sets the value of the 'CAAP_TYPE' field in the FML buffer.
     *
     * @param value Default value: B.
     * @throws FMLManipulationException
     */
    public void set_CAAP_TYPE(String value) throws FMLManipulationException {
        this.fmlBuffer[126].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'COL_AGNCY_CODE' field in the FML buffer.
     *
     * @return Value of 'COL_AGNCY_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_AGNCY_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[127].getValue(0));
    }

    /**
     * Sets the value of the 'COL_AGNCY_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_COL_AGNCY_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[127].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'INVOICE_FEE_WAIVE_IND' field in the FML buffer.
     *
     * @return Value of 'INVOICE_FEE_WAIVE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_INVOICE_FEE_WAIVE_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[128].getValue(0)));
    }

    /**
     * Sets the value of the 'INVOICE_FEE_WAIVE_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_INVOICE_FEE_WAIVE_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[128].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'PRD_ZERO_RATE_BILL' field in the FML buffer.
     *
     * @return Value of 'PRD_ZERO_RATE_BILL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PRD_ZERO_RATE_BILL() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[129].getValue(0)));
    }

    /**
     * Sets the value of the 'PRD_ZERO_RATE_BILL' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PRD_ZERO_RATE_BILL(String value) throws FMLManipulationException {
        this.fmlBuffer[129].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'CS_CREDIT_CLASS' field in the FML buffer.
     *
     * @return Value of 'CS_CREDIT_CLASS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CS_CREDIT_CLASS() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[130].getValue(0)));
    }

    /**
     * Sets the value of the 'CS_CREDIT_CLASS' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CS_CREDIT_CLASS(String value) throws FMLManipulationException {
        this.fmlBuffer[130].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'CS_APPROVED_CTN_QTY' field in the FML buffer.
     *
     * @return Value of 'CS_APPROVED_CTN_QTY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CS_APPROVED_CTN_QTY() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[131].getValue(0)));
    }

    /**
     * Sets the value of the 'CS_APPROVED_CTN_QTY' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CS_APPROVED_CTN_QTY(Integer value) throws FMLManipulationException {
        this.fmlBuffer[131].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'CAS_ORDER_NUMBER' field in the FML buffer.
     *
     * @return Value of 'CAS_ORDER_NUMBER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CAS_ORDER_NUMBER() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[132].getValue(0));
    }

    /**
     * Sets the value of the 'CAS_ORDER_NUMBER' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CAS_ORDER_NUMBER(Integer value) throws FMLManipulationException {
        this.fmlBuffer[132].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PCNTRINPROWID' field in the FML buffer.
     *
     * @return Value of 'PCNTRINPROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PCNTRINPROWID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[133].getValue(0));
    }

    /**
     * Sets the value of the 'PCNTRINPROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @throws FMLManipulationException
     */
    public void set_PCNTRINPROWID(String value) throws FMLManipulationException {
        this.fmlBuffer[133].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'SUBSCRIBER_NO' field in the FML buffer.
     *
     * @return Value of 'SUBSCRIBER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUBSCRIBER_NO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[134].getValue(0));
    }

    /**
     * Sets the value of the 'SUBSCRIBER_NO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @throws FMLManipulationException
     */
    public void set_SUBSCRIBER_NO(String value) throws FMLManipulationException {
        this.fmlBuffer[134].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PAPER_WORK_STATUS' field in the FML buffer.
     *
     * @return Value of 'PAPER_WORK_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAPER_WORK_STATUS() throws FMLManipulationException {
        return ((String) this.fmlBuffer[135].getValue(0));
    }

    /**
     * Sets the value of the 'PAPER_WORK_STATUS' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 3.
     * @throws FMLManipulationException
     */
    public void set_PAPER_WORK_STATUS(String value) throws FMLManipulationException {
        this.fmlBuffer[135].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PAPER_WORK_DATE' field in the FML buffer.
     *
     * @return Value of 'PAPER_WORK_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAPER_WORK_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[136].getValue(0));
    }

    /**
     * Sets the value of the 'PAPER_WORK_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_PAPER_WORK_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[136].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PAPER_WORK_REF_NO' field in the FML buffer.
     *
     * @return Value of 'PAPER_WORK_REF_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAPER_WORK_REF_NO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[137].getValue(0));
    }

    /**
     * Sets the value of the 'PAPER_WORK_REF_NO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 12.
     * @throws FMLManipulationException
     */
    public void set_PAPER_WORK_REF_NO(String value) throws FMLManipulationException {
        this.fmlBuffer[137].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PW_DESCRIPTION' field in the FML buffer.
     *
     * @return Value of 'PW_DESCRIPTION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PW_DESCRIPTION() throws FMLManipulationException {
        return ((String) this.fmlBuffer[138].getValue(0));
    }

    /**
     * Sets the value of the 'PW_DESCRIPTION' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @throws FMLManipulationException
     */
    public void set_PW_DESCRIPTION(String value) throws FMLManipulationException {
        this.fmlBuffer[138].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'MOREROWS' field in the FML buffer.
     *
     * @return Value of 'MOREROWS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_MOREROWS() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[139].getValue(0)));
    }

    /**
     * Sets the value of the 'MOREROWS' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_MOREROWS(Integer value) throws FMLManipulationException {
        this.fmlBuffer[139].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'ROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'ROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[140].getValue(0));
    }

    /**
     * Sets the value of the 'ROWCOUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_ROWCOUNT(Integer value) throws FMLManipulationException {
        this.fmlBuffer[140].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PARTRDREFARRAYROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10).
     * @return Value of 'PARTRDREFARRAYROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PARTRDREFARRAYROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[141].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PARTRDREFARRAYROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10).
     * @throws FMLManipulationException
     */
    public void set_PARTRDREFARRAYROWID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[141].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PARTRDREFARRAYROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'PARTRDREFARRAYROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PARTRDREFARRAYROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[141].getCount());
    }

    /**
     * Retrieves the value of the 'PARTRDREFARRAYCUSTOMER_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10).
     * @return Value of 'PARTRDREFARRAYCUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PARTRDREFARRAYCUSTOMER_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[142].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PARTRDREFARRAYCUSTOMER_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10).
     * @throws FMLManipulationException
     */
    public void set_PARTRDREFARRAYCUSTOMER_ID(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[142].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PARTRDREFARRAYCUSTOMER_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'PARTRDREFARRAYCUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PARTRDREFARRAYCUSTOMER_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[142].getCount());
    }

    /**
     * Retrieves the value of the 'TR_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10).
     * @return Value of 'TR_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_TR_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[143].getValue(nIndex));
    }

    /**
     * Sets the value of the 'TR_SEQ_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10).
     * @throws FMLManipulationException
     */
    public void set_TR_SEQ_NO(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[143].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'TR_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'TR_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_TR_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[143].getCount());
    }

    /**
     * Retrieves the value of the 'COMPANY_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10).
     * @return Value of 'COMPANY_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COMPANY_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[144].getValue(nIndex));
    }

    /**
     * Sets the value of the 'COMPANY_NAME' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10).
     * @throws FMLManipulationException
     */
    public void set_COMPANY_NAME(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[144].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'COMPANY_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'COMPANY_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COMPANY_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[144].getCount());
    }

    /**
     * Retrieves the value of the 'CONTACT_PERSON' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10).
     * @return Value of 'CONTACT_PERSON' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CONTACT_PERSON(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[145].getValue(nIndex));
    }

    /**
     * Sets the value of the 'CONTACT_PERSON' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10).
     * @throws FMLManipulationException
     */
    public void set_CONTACT_PERSON(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[145].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'CONTACT_PERSON' field in the FML buffer.
     *
     * @return Number of values defined for 'CONTACT_PERSON' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CONTACT_PERSON_size() throws FMLManipulationException {
        return (this.fmlBuffer[145].getCount());
    }

    /**
     * Retrieves the value of the 'PHONE_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10).
     * @return Value of 'PHONE_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PHONE_NO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[146].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PHONE_NO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 16.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10).
     * @throws FMLManipulationException
     */
    public void set_PHONE_NO(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[146].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PHONE_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'PHONE_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PHONE_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[146].getCount());
    }

    /**
     * Retrieves the value of the 'FAX_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10).
     * @return Value of 'FAX_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FAX_NO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[147].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FAX_NO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 16.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10).
     * @throws FMLManipulationException
     */
    public void set_FAX_NO(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[147].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FAX_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'FAX_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FAX_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[147].getCount());
    }

    public void populateCsApiBan(CsApiBanInput csApiBanInput)
            throws FMLManipulationException {

        // Special indirect mapping from fields in this buffer to differently named fields in CsApiBan TODO: how do we know which fields to map where?
        if (csApiBanInput.get_PBANCUSTRECOPERATOR_ID() == null) {
            csApiBanInput.set_PBANCUSTRECOPERATOR_ID(get_PCUSTRECOPERATOR_ID());
        }
        if (csApiBanInput.get_PBANCUSTRECAPPLICATION_ID() == null) {
            csApiBanInput.set_PBANCUSTRECAPPLICATION_ID(get_PCUSTRECAPPLICATION_ID());
        }
        if (csApiBanInput.get_PCTNAGRPRMRECBAN() == null) {
            csApiBanInput.set_PCTNAGRPRMRECBAN(get_BAN());
        }
        if (csApiBanInput.get_PCTNAGRPRMRECCUSTOMER_ID() == null) {
            csApiBanInput.set_PCTNAGRPRMRECCUSTOMER_ID(get_BAN());
        }
        if (csApiBanInput.get_PBANRECCUSTOMER_ID() == null) {
            csApiBanInput.set_PBANRECCUSTOMER_ID(get_BAN());
        }

        // General direct mapping between fields with the same name in both this buffer and CsApiBan-buffer.
        ServiceParameter.copyFmlBuffer(this, csApiBanInput, keysNotToBeMapped);

    }

}