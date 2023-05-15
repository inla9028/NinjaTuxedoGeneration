/*
 * CvSvCtnAgrInput.java
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
 * CvSvCtnAgrInput class.
 */
public class CvSvCtnAgrInput extends ServiceInput implements Conversable {
    // Indicates whether the default values has been loaded from the DB or not
    private static Boolean defaultValuesPopulated = new Boolean(false);
    // Holds default values for fields in FML buffer
    private static String defaultValues[] = null;

    // Holds keys not to be mapped through direct mapping between fields with the same name in both this buffer and CsApiBan-buffer.
    private static HashSet keysNotToBeMapped = new HashSet();

    // Keys not to be mapped.
    private final static String BAN = "BAN";
    private final static String CUSTOMER_ID = "CUSTOMER_ID";
    private final static String SUBSCRIBER_NO = "SUBSCRIBER_NO";
    private final static String ROWID = "ROWID";
    private final static String EFFECTIVE_DATE = "EFFECTIVE_DATE";
    private final static String DEALER_CODE = "DEALER_CODE";
    private final static String SALES_AGENT = "SALES_AGENT";
    private final static String COMMIT_ORIG_NO_MONTH = "COMMIT_ORIG_NO_MONTH";
    private final static String PRODUCT_TYPE = "PRODUCT_TYPE";
    private final static String PCSFRNDFMLROWCOUNT = "PCSFRNDFMLROWCOUNT";
    private final static String PFTRDEPBUFROWCOUNT = "PFTRDEPBUFROWCOUNT";
    private final static String SYS_CREATION_DATE = "SYS_CREATION_DATE";
    private final static String SYS_UPDATE_DATE = "SYS_UPDATE_DATE";
    private final static String DL_SERVICE_CODE = "DL_SERVICE_CODE";
    private final static String DL_UPDATE_STAMP = "DL_UPDATE_STAMP";
    private final static String SUBSCRIBER_ID = "SUBSCRIBER_ID";

    static {

        keysNotToBeMapped.add(BAN);
        keysNotToBeMapped.add(CUSTOMER_ID);
        keysNotToBeMapped.add(SUBSCRIBER_NO);
        keysNotToBeMapped.add(ROWID);
        keysNotToBeMapped.add(EFFECTIVE_DATE);
        keysNotToBeMapped.add(DEALER_CODE);
        keysNotToBeMapped.add(SALES_AGENT);
        keysNotToBeMapped.add(COMMIT_ORIG_NO_MONTH);
        keysNotToBeMapped.add(PRODUCT_TYPE);
        keysNotToBeMapped.add(PCSFRNDFMLROWCOUNT);
        keysNotToBeMapped.add(PFTRDEPBUFROWCOUNT);
        keysNotToBeMapped.add(SYS_CREATION_DATE);
        keysNotToBeMapped.add(SYS_UPDATE_DATE);
        keysNotToBeMapped.add(DL_SERVICE_CODE);
        keysNotToBeMapped.add(DL_UPDATE_STAMP);
        keysNotToBeMapped.add(SUBSCRIBER_ID);
    }


    /**
     * Creates a new instance of CvSvCtnAgrInput
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CvSvCtnAgrInput() throws EnvironmentException, FMLManipulationException {
        // Initialize FML buffer
        fmlBuffer = new FmlField[120];

        // Get default values from DB
        synchronized (this.defaultValuesPopulated) {
            if (this.defaultValuesPopulated.equals(Boolean.FALSE)) {
                defaultValues = getDefaultValues("cvSvCtnAgr", 120);
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
        this.fmlBuffer[16] = new FmlField("BAN", FmlField.TYPE_INTEGER, -1, defaultValues[16], 16, 1);
        this.fmlBuffer[17] = new FmlField("BAN_ROWID", FmlField.TYPE_STRING, 19, defaultValues[17], 17, 1);
        this.fmlBuffer[18] = new FmlField("CUSTOMER_ID", FmlField.TYPE_INTEGER, -1, defaultValues[18], 18, 1);
        this.fmlBuffer[19] = new FmlField("CUSTOMER_ROWID", FmlField.TYPE_STRING, 19, defaultValues[19], 19, 1);
        this.fmlBuffer[20] = new FmlField("SUBSCRIBER_NO", FmlField.TYPE_STRING, 21, defaultValues[20], 20, 1);
        this.fmlBuffer[21] = new FmlField("CTN_ROWID", FmlField.TYPE_STRING, 19, defaultValues[21], 21, 1);
        this.fmlBuffer[22] = new FmlField("ROWCOUNT", FmlField.TYPE_INTEGER, -1, defaultValues[22], 22, 1);
        this.fmlBuffer[23] = new FmlField("ROWID", FmlField.TYPE_STRING, 19, defaultValues[23], 23, 50);
        this.fmlBuffer[24] = new FmlField("SOC", FmlField.TYPE_STRING, 10, defaultValues[24], 24, 50);
        this.fmlBuffer[25] = new FmlField("SOC_EFFECTIVE_DATE", FmlField.TYPE_STRING, 9, defaultValues[25], 25, 50);
        this.fmlBuffer[26] = new FmlField("COMMITMENT_END_DATE", FmlField.TYPE_STRING, 9, defaultValues[26], 26, 50);
        this.fmlBuffer[27] = new FmlField("SERVICE_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[27], 27, 50);
        this.fmlBuffer[28] = new FmlField("EFFECTIVE_DATE", FmlField.TYPE_STRING, 9, defaultValues[28], 28, 50);
        this.fmlBuffer[29] = new FmlField("EXPIRATION_DATE", FmlField.TYPE_STRING, 9, defaultValues[29], 29, 50);
        this.fmlBuffer[30] = new FmlField("SOC_LEVEL_CODE", FmlField.TYPE_BYTE, -1, defaultValues[30], 30, 50);
        this.fmlBuffer[31] = new FmlField("DEALER_CODE", FmlField.TYPE_STRING, 6, defaultValues[31], 31, 50);
        this.fmlBuffer[32] = new FmlField("SALES_AGENT", FmlField.TYPE_STRING, 6, defaultValues[32], 32, 50);
        this.fmlBuffer[33] = new FmlField("SRV_MODE", FmlField.TYPE_BYTE, -1, defaultValues[33], 33, 50);
        this.fmlBuffer[34] = new FmlField("SRV_SUB_MODE", FmlField.TYPE_BYTE, -1, defaultValues[34], 34, 50);
        this.fmlBuffer[35] = new FmlField("SOC_SEQ_NO", FmlField.TYPE_INTEGER, -1, defaultValues[35], 35, 50);
        this.fmlBuffer[36] = new FmlField("SRV_TRX_ID", FmlField.TYPE_INTEGER, -1, defaultValues[36], 36, 50);
        this.fmlBuffer[37] = new FmlField("CAMPAIGN_SEQ", FmlField.TYPE_INTEGER, -1, defaultValues[37], 37, 50);
        this.fmlBuffer[38] = new FmlField("CAMPAIGN", FmlField.TYPE_STRING, 10, defaultValues[38], 38, 50);
        this.fmlBuffer[39] = new FmlField("COMMIT_ORIG_NO_MONTH", FmlField.TYPE_SHORT, -1, defaultValues[39], 39, 50);
        this.fmlBuffer[40] = new FmlField("PRODUCT_TYPE", FmlField.TYPE_STRING, 4, defaultValues[40], 40, 50);
        this.fmlBuffer[41] = new FmlField("LOAN_VER_NO", FmlField.TYPE_INTEGER, -1, defaultValues[41], 41, 50);
        this.fmlBuffer[42] = new FmlField("LOAN_SEQ_NO", FmlField.TYPE_INTEGER, -1, defaultValues[42], 42, 50);
        this.fmlBuffer[43] = new FmlField("SOC_ACTV_FEE", FmlField.TYPE_DOUBLE, -1, defaultValues[43], 43, 50);
        this.fmlBuffer[44] = new FmlField("PROMOTIONAL_SOC", FmlField.TYPE_STRING, 10, defaultValues[44], 44, 50);
        this.fmlBuffer[45] = new FmlField("REASON_CODE", FmlField.TYPE_STRING, 5, defaultValues[45], 45, 50);
        this.fmlBuffer[46] = new FmlField("SOC_START_RC_DATE", FmlField.TYPE_STRING, 9, defaultValues[46], 46, 50);
        this.fmlBuffer[47] = new FmlField("RC_DATE_COPY_IND", FmlField.TYPE_BYTE, -1, defaultValues[47], 47, 50);
        this.fmlBuffer[48] = new FmlField("PSOCFTRBUFROWCOUNT", FmlField.TYPE_INTEGER, -1, defaultValues[48], 48, 1);
        this.fmlBuffer[49] = new FmlField("PSOCFTRBUFROWID", FmlField.TYPE_STRING, 19, defaultValues[49], 49, 200);
        this.fmlBuffer[50] = new FmlField("PSOCFTRBUFSOC", FmlField.TYPE_STRING, 10, defaultValues[50], 50, 200);
        this.fmlBuffer[51] = new FmlField("PSOCFTRBUFSOC_EFFECTIVE_DATE", FmlField.TYPE_STRING, 9, defaultValues[51], 51, 200);
        this.fmlBuffer[52] = new FmlField("FEATURE_CODE", FmlField.TYPE_STRING, 7, defaultValues[52], 52, 200);
        this.fmlBuffer[53] = new FmlField("MPS_FTR_CODE", FmlField.TYPE_STRING, 7, defaultValues[53], 53, 200);
        this.fmlBuffer[54] = new FmlField("FTR_EFFECTIVE_DATE", FmlField.TYPE_STRING, 9, defaultValues[54], 54, 200);
        this.fmlBuffer[55] = new FmlField("FTR_EXPIRATION_DATE", FmlField.TYPE_STRING, 9, defaultValues[55], 55, 200);
        this.fmlBuffer[56] = new FmlField("FTR_EFF_RSN_CODE", FmlField.TYPE_BYTE, -1, defaultValues[56], 56, 200);
        this.fmlBuffer[57] = new FmlField("FTR_EXP_RSN_CODE", FmlField.TYPE_BYTE, -1, defaultValues[57], 57, 200);
        this.fmlBuffer[58] = new FmlField("SERVICE_FTR_SEQ_NO", FmlField.TYPE_INTEGER, -1, defaultValues[58], 58, 200);
        this.fmlBuffer[59] = new FmlField("FTR_MODE", FmlField.TYPE_BYTE, -1, defaultValues[59], 59, 200);
        this.fmlBuffer[60] = new FmlField("PSOCFTRBUFSOC_SEQ_NO", FmlField.TYPE_INTEGER, -1, defaultValues[60], 60, 200);
        this.fmlBuffer[61] = new FmlField("FTR_SUB_MODE", FmlField.TYPE_BYTE, -1, defaultValues[61], 61, 200);
        this.fmlBuffer[62] = new FmlField("FTR_ADD_PARAM", FmlField.TYPE_STRING, 301, defaultValues[62], 62, 200);
        this.fmlBuffer[63] = new FmlField("FEATURE_TYPE", FmlField.TYPE_STRING, 4, defaultValues[63], 63, 200);
        this.fmlBuffer[64] = new FmlField("PSOCFTRBUFPRODUCT_TYPE", FmlField.TYPE_STRING, 4, defaultValues[64], 64, 200);
        this.fmlBuffer[65] = new FmlField("PSOCFTRBUFCAMPAIGN_SEQ", FmlField.TYPE_INTEGER, -1, defaultValues[65], 65, 200);
        this.fmlBuffer[66] = new FmlField("FTR_SPECIAL_TELNO", FmlField.TYPE_STRING, 21, defaultValues[66], 66, 200);
        this.fmlBuffer[67] = new FmlField("SWITCH_ACT_NEEDED", FmlField.TYPE_BYTE, -1, defaultValues[67], 67, 200);
        this.fmlBuffer[68] = new FmlField("SWITCH_CODE", FmlField.TYPE_STRING, 7, defaultValues[68], 68, 200);
        this.fmlBuffer[69] = new FmlField("MSISDN_CRITERIA", FmlField.TYPE_BYTE, -1, defaultValues[69], 69, 200);
        this.fmlBuffer[70] = new FmlField("TN_CLASS_CD", FmlField.TYPE_STRING, 4, defaultValues[70], 70, 200);
        this.fmlBuffer[71] = new FmlField("ACTION_MODE", FmlField.TYPE_BYTE, -1, defaultValues[71], 71, 200);
        this.fmlBuffer[72] = new FmlField("MANUAL_RC_RATE", FmlField.TYPE_DOUBLE, -1, defaultValues[72], 72, 200);
        this.fmlBuffer[73] = new FmlField("MANUAL_RC_EXP_DATE", FmlField.TYPE_STRING, 9, defaultValues[73], 73, 200);
        this.fmlBuffer[74] = new FmlField("PCSFRNDFMLROWCOUNT", FmlField.TYPE_INTEGER, -1, defaultValues[74], 74, 1);
        this.fmlBuffer[75] = new FmlField("ACTIONIND", FmlField.TYPE_BYTE, -1, defaultValues[75], 75, 10000);
        this.fmlBuffer[76] = new FmlField("PCSFANDFRECROWID", FmlField.TYPE_STRING, 19, defaultValues[76], 76, 10000);
        this.fmlBuffer[77] = new FmlField("PCSFANDFRECEFFECTIVE_DATE", FmlField.TYPE_STRING, 15, defaultValues[77], 77, 10000);
        this.fmlBuffer[78] = new FmlField("PCSFANDFRECEXPIRATION_DATE", FmlField.TYPE_STRING, 15, defaultValues[78], 78, 10000);
        this.fmlBuffer[79] = new FmlField("PERSONAL_TEL", FmlField.TYPE_STRING, 21, defaultValues[79], 79, 10000);
        this.fmlBuffer[80] = new FmlField("PERSONAL_TEL_TO", FmlField.TYPE_STRING, 21, defaultValues[80], 80, 10000);
        this.fmlBuffer[81] = new FmlField("FF_SOC", FmlField.TYPE_STRING, 10, defaultValues[81], 81, 10000);
        this.fmlBuffer[82] = new FmlField("PLAN_CODE", FmlField.TYPE_STRING, 10, defaultValues[82], 82, 10000);
        this.fmlBuffer[83] = new FmlField("DISCOUNT_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[83], 83, 10000);
        this.fmlBuffer[84] = new FmlField("START_HOUR", FmlField.TYPE_STRING, 7, defaultValues[84], 84, 10000);
        this.fmlBuffer[85] = new FmlField("DURATION", FmlField.TYPE_DOUBLE, -1, defaultValues[85], 85, 10000);
        this.fmlBuffer[86] = new FmlField("PFTRDEPBUFROWCOUNT", FmlField.TYPE_INTEGER, -1, defaultValues[86], 86, 1);
        this.fmlBuffer[87] = new FmlField("DEPOSIT_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[87], 87, 2);
        this.fmlBuffer[88] = new FmlField("DEPOSIT_AMOUNT", FmlField.TYPE_DOUBLE, -1, defaultValues[88], 88, 2);
        this.fmlBuffer[89] = new FmlField("PNPINFOBUFFROWCOUNT", FmlField.TYPE_INTEGER, -1, defaultValues[89], 89, 1);
        this.fmlBuffer[90] = new FmlField("NPNUMINFORECROWID", FmlField.TYPE_STRING, 19, defaultValues[90], 90, 500);
        this.fmlBuffer[91] = new FmlField("PORT_NUMBER", FmlField.TYPE_STRING, 21, defaultValues[91], 91, 500);
        this.fmlBuffer[92] = new FmlField("NPNUMINFORECEFFECTIVE_DATE", FmlField.TYPE_STRING, 15, defaultValues[92], 92, 500);
        this.fmlBuffer[93] = new FmlField("SYS_CREATION_DATE", FmlField.TYPE_STRING, 15, defaultValues[93], 93, 500);
        this.fmlBuffer[94] = new FmlField("SYS_UPDATE_DATE", FmlField.TYPE_STRING, 15, defaultValues[94], 94, 500);
        this.fmlBuffer[95] = new FmlField("NPNUMINFORECOPERATOR_ID", FmlField.TYPE_INTEGER, -1, defaultValues[95], 95, 500);
        this.fmlBuffer[96] = new FmlField("NPNUMINFORECAPPLICATION_ID", FmlField.TYPE_STRING, 7, defaultValues[96], 96, 500);
        this.fmlBuffer[97] = new FmlField("DL_SERVICE_CODE", FmlField.TYPE_STRING, 6, defaultValues[97], 97, 500);
        this.fmlBuffer[98] = new FmlField("DL_UPDATE_STAMP", FmlField.TYPE_SHORT, -1, defaultValues[98], 98, 500);
        this.fmlBuffer[99] = new FmlField("NPNUMINFORECEXPIRATION_DATE", FmlField.TYPE_STRING, 15, defaultValues[99], 99, 500);
        this.fmlBuffer[100] = new FmlField("INT_ORDER_ID", FmlField.TYPE_DOUBLE, -1, defaultValues[100], 100, 500);
        this.fmlBuffer[101] = new FmlField("ORG_CUSTOMER_ID", FmlField.TYPE_STRING, 61, defaultValues[101], 101, 500);
        this.fmlBuffer[102] = new FmlField("PORT_IND", FmlField.TYPE_BYTE, -1, defaultValues[102], 102, 500);
        this.fmlBuffer[103] = new FmlField("NUMBER_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[103], 103, 500);
        this.fmlBuffer[104] = new FmlField("PORT_REQUEST_DATE", FmlField.TYPE_STRING, 15, defaultValues[104], 104, 500);
        this.fmlBuffer[105] = new FmlField("ORG_OPERATOR", FmlField.TYPE_STRING, 6, defaultValues[105], 105, 500);
        this.fmlBuffer[106] = new FmlField("SUBSCRIBER_ID", FmlField.TYPE_INTEGER, -1, defaultValues[106], 106, 500);
        this.fmlBuffer[107] = new FmlField("LAST_INT_ORD_ID", FmlField.TYPE_DOUBLE, -1, defaultValues[107], 107, 500);
        this.fmlBuffer[108] = new FmlField("FUNCTION_PORT_IND", FmlField.TYPE_BYTE, -1, defaultValues[108], 108, 500);
        this.fmlBuffer[109] = new FmlField("PASSIVE_IND", FmlField.TYPE_BYTE, -1, defaultValues[109], 109, 500);
        this.fmlBuffer[110] = new FmlField("AUTO_CONFIRM", FmlField.TYPE_BYTE, -1, defaultValues[110], 110, 500);
        this.fmlBuffer[111] = new FmlField("TEMPORARY_MSISDN", FmlField.TYPE_STRING, 21, defaultValues[111], 111, 500);
        this.fmlBuffer[112] = new FmlField("HANDLE_MODE", FmlField.TYPE_BYTE, -1, defaultValues[112], 112, 500);
        this.fmlBuffer[113] = new FmlField("SEND_IND", FmlField.TYPE_BYTE, -1, defaultValues[113], 113, 500);
        this.fmlBuffer[114] = new FmlField("ORDID_STR", FmlField.TYPE_STRING, 21, defaultValues[114], 114, 500);
        this.fmlBuffer[115] = new FmlField("LAST_ORDID_STR", FmlField.TYPE_STRING, 21, defaultValues[115], 115, 500);
        this.fmlBuffer[116] = new FmlField("ICC", FmlField.TYPE_STRING, 61, defaultValues[116], 116, 500);
        this.fmlBuffer[117] = new FmlField("CUSTOMER_NAME", FmlField.TYPE_STRING, 255, defaultValues[117], 117, 500);
        this.fmlBuffer[118] = new FmlField("NPINFOBUFFCUSTOMER_ID", FmlField.TYPE_STRING, 61, defaultValues[118], 118, 500);
        this.fmlBuffer[119] = new FmlField("SERVICE_PROVIDER", FmlField.TYPE_STRING, 6, defaultValues[119], 119, 500);
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
     * Retrieves the value of the 'BAN' field in the FML buffer.
     *
     * @return Value of 'BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BAN() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[16].getValue(0));
    }

    /**
     * Sets the value of the 'BAN' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BAN(Integer value) throws FMLManipulationException {
        this.fmlBuffer[16].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'BAN_ROWID' field in the FML buffer.
     *
     * @return Value of 'BAN_ROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BAN_ROWID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[17].getValue(0));
    }

    /**
     * Sets the value of the 'BAN_ROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @throws FMLManipulationException
     */
    public void set_BAN_ROWID(String value) throws FMLManipulationException {
        this.fmlBuffer[17].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CUSTOMER_ID' field in the FML buffer.
     *
     * @return Value of 'CUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CUSTOMER_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[18].getValue(0));
    }

    /**
     * Sets the value of the 'CUSTOMER_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CUSTOMER_ID(Integer value) throws FMLManipulationException {
        this.fmlBuffer[18].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CUSTOMER_ROWID' field in the FML buffer.
     *
     * @return Value of 'CUSTOMER_ROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CUSTOMER_ROWID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[19].getValue(0));
    }

    /**
     * Sets the value of the 'CUSTOMER_ROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @throws FMLManipulationException
     */
    public void set_CUSTOMER_ROWID(String value) throws FMLManipulationException {
        this.fmlBuffer[19].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'SUBSCRIBER_NO' field in the FML buffer.
     *
     * @return Value of 'SUBSCRIBER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUBSCRIBER_NO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[20].getValue(0));
    }

    /**
     * Sets the value of the 'SUBSCRIBER_NO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @throws FMLManipulationException
     */
    public void set_SUBSCRIBER_NO(String value) throws FMLManipulationException {
        this.fmlBuffer[20].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CTN_ROWID' field in the FML buffer.
     *
     * @return Value of 'CTN_ROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CTN_ROWID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[21].getValue(0));
    }

    /**
     * Sets the value of the 'CTN_ROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @throws FMLManipulationException
     */
    public void set_CTN_ROWID(String value) throws FMLManipulationException {
        this.fmlBuffer[21].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'ROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'ROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[22].getValue(0));
    }

    /**
     * Sets the value of the 'ROWCOUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_ROWCOUNT(Integer value) throws FMLManipulationException {
        this.fmlBuffer[22].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'ROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[23].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_ROWID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[23].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'ROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[23].getCount());
    }

    /**
     * Retrieves the value of the 'SOC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SOC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[24].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SOC' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 10.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SOC(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[24].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SOC' field in the FML buffer.
     *
     * @return Number of values defined for 'SOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SOC_size() throws FMLManipulationException {
        return (this.fmlBuffer[24].getCount());
    }

    /**
     * Retrieves the value of the 'SOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SOC_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SOC_EFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[25].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SOC_EFFECTIVE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[25].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'SOC_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SOC_EFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[25].getCount());
    }

    /**
     * Retrieves the value of the 'COMMITMENT_END_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'COMMITMENT_END_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COMMITMENT_END_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[26].getValue(nIndex));
    }

    /**
     * Sets the value of the 'COMMITMENT_END_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_COMMITMENT_END_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[26].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'COMMITMENT_END_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'COMMITMENT_END_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COMMITMENT_END_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[26].getCount());
    }

    /**
     * Retrieves the value of the 'SERVICE_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SERVICE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SERVICE_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[27].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'SERVICE_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SERVICE_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[27].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'SERVICE_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'SERVICE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SERVICE_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[27].getCount());
    }

    /**
     * Retrieves the value of the 'EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[28].getValue(nIndex));
    }

    /**
     * Sets the value of the 'EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_EFFECTIVE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[28].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'EFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_EFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[28].getCount());
    }

    /**
     * Retrieves the value of the 'EXPIRATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EXPIRATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[29].getValue(nIndex));
    }

    /**
     * Sets the value of the 'EXPIRATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_EXPIRATION_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[29].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'EXPIRATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_EXPIRATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[29].getCount());
    }

    /**
     * Retrieves the value of the 'SOC_LEVEL_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SOC_LEVEL_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SOC_LEVEL_CODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[30].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'SOC_LEVEL_CODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SOC_LEVEL_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[30].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'SOC_LEVEL_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'SOC_LEVEL_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SOC_LEVEL_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[30].getCount());
    }

    /**
     * Retrieves the value of the 'DEALER_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'DEALER_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DEALER_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[31].getValue(nIndex));
    }

    /**
     * Sets the value of the 'DEALER_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_DEALER_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[31].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'DEALER_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'DEALER_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DEALER_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[31].getCount());
    }

    /**
     * Retrieves the value of the 'SALES_AGENT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SALES_AGENT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SALES_AGENT(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[32].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SALES_AGENT' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SALES_AGENT(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[32].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SALES_AGENT' field in the FML buffer.
     *
     * @return Number of values defined for 'SALES_AGENT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SALES_AGENT_size() throws FMLManipulationException {
        return (this.fmlBuffer[32].getCount());
    }

    /**
     * Retrieves the value of the 'SRV_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SRV_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SRV_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[33].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'SRV_MODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SRV_MODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[33].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'SRV_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'SRV_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SRV_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[33].getCount());
    }

    /**
     * Retrieves the value of the 'SRV_SUB_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SRV_SUB_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SRV_SUB_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[34].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'SRV_SUB_MODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SRV_SUB_MODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[34].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'SRV_SUB_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'SRV_SUB_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SRV_SUB_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[34].getCount());
    }

    /**
     * Retrieves the value of the 'SOC_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SOC_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_SOC_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[35].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SOC_SEQ_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SOC_SEQ_NO(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[35].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SOC_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'SOC_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SOC_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[35].getCount());
    }

    /**
     * Retrieves the value of the 'SRV_TRX_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SRV_TRX_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_SRV_TRX_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[36].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SRV_TRX_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SRV_TRX_ID(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[36].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SRV_TRX_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'SRV_TRX_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SRV_TRX_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[36].getCount());
    }

    /**
     * Retrieves the value of the 'CAMPAIGN_SEQ' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'CAMPAIGN_SEQ' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CAMPAIGN_SEQ(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[37].getValue(nIndex));
    }

    /**
     * Sets the value of the 'CAMPAIGN_SEQ' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_CAMPAIGN_SEQ(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[37].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'CAMPAIGN_SEQ' field in the FML buffer.
     *
     * @return Number of values defined for 'CAMPAIGN_SEQ' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CAMPAIGN_SEQ_size() throws FMLManipulationException {
        return (this.fmlBuffer[37].getCount());
    }

    /**
     * Retrieves the value of the 'CAMPAIGN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'CAMPAIGN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CAMPAIGN(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[38].getValue(nIndex));
    }

    /**
     * Sets the value of the 'CAMPAIGN' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 10.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_CAMPAIGN(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[38].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'CAMPAIGN' field in the FML buffer.
     *
     * @return Number of values defined for 'CAMPAIGN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CAMPAIGN_size() throws FMLManipulationException {
        return (this.fmlBuffer[38].getCount());
    }

    /**
     * Retrieves the value of the 'COMMIT_ORIG_NO_MONTH' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'COMMIT_ORIG_NO_MONTH' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_COMMIT_ORIG_NO_MONTH(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[39].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'COMMIT_ORIG_NO_MONTH' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_COMMIT_ORIG_NO_MONTH(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[39].setValue(nIndex, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves number of values defined for 'COMMIT_ORIG_NO_MONTH' field in the FML buffer.
     *
     * @return Number of values defined for 'COMMIT_ORIG_NO_MONTH' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COMMIT_ORIG_NO_MONTH_size() throws FMLManipulationException {
        return (this.fmlBuffer[39].getCount());
    }

    /**
     * Retrieves the value of the 'PRODUCT_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PRODUCT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PRODUCT_TYPE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[40].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PRODUCT_TYPE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_PRODUCT_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[40].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PRODUCT_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'PRODUCT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PRODUCT_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[40].getCount());
    }

    /**
     * Retrieves the value of the 'LOAN_VER_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'LOAN_VER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LOAN_VER_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[41].getValue(nIndex));
    }

    /**
     * Sets the value of the 'LOAN_VER_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_LOAN_VER_NO(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[41].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'LOAN_VER_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'LOAN_VER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LOAN_VER_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[41].getCount());
    }

    /**
     * Retrieves the value of the 'LOAN_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'LOAN_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LOAN_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[42].getValue(nIndex));
    }

    /**
     * Sets the value of the 'LOAN_SEQ_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_LOAN_SEQ_NO(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[42].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'LOAN_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'LOAN_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LOAN_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[42].getCount());
    }

    /**
     * Retrieves the value of the 'SOC_ACTV_FEE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SOC_ACTV_FEE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_SOC_ACTV_FEE(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[43].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SOC_ACTV_FEE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SOC_ACTV_FEE(int nIndex, Double value) throws FMLManipulationException {
        this.fmlBuffer[43].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SOC_ACTV_FEE' field in the FML buffer.
     *
     * @return Number of values defined for 'SOC_ACTV_FEE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SOC_ACTV_FEE_size() throws FMLManipulationException {
        return (this.fmlBuffer[43].getCount());
    }

    /**
     * Retrieves the value of the 'PROMOTIONAL_SOC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PROMOTIONAL_SOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PROMOTIONAL_SOC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[44].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PROMOTIONAL_SOC' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 10.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_PROMOTIONAL_SOC(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[44].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PROMOTIONAL_SOC' field in the FML buffer.
     *
     * @return Number of values defined for 'PROMOTIONAL_SOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PROMOTIONAL_SOC_size() throws FMLManipulationException {
        return (this.fmlBuffer[44].getCount());
    }

    /**
     * Retrieves the value of the 'REASON_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'REASON_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_REASON_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[45].getValue(nIndex));
    }

    /**
     * Sets the value of the 'REASON_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_REASON_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[45].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'REASON_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'REASON_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_REASON_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[45].getCount());
    }

    /**
     * Retrieves the value of the 'SOC_START_RC_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SOC_START_RC_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SOC_START_RC_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[46].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SOC_START_RC_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SOC_START_RC_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[46].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SOC_START_RC_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'SOC_START_RC_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SOC_START_RC_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[46].getCount());
    }

    /**
     * Retrieves the value of the 'RC_DATE_COPY_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'RC_DATE_COPY_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_RC_DATE_COPY_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[47].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'RC_DATE_COPY_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_RC_DATE_COPY_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[47].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'RC_DATE_COPY_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'RC_DATE_COPY_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_RC_DATE_COPY_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[47].getCount());
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'PSOCFTRBUFROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PSOCFTRBUFROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[48].getValue(0));
    }

    /**
     * Sets the value of the 'PSOCFTRBUFROWCOUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PSOCFTRBUFROWCOUNT(Integer value) throws FMLManipulationException {
        this.fmlBuffer[48].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSOCFTRBUFROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PSOCFTRBUFROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[49].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PSOCFTRBUFROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_PSOCFTRBUFROWID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[49].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PSOCFTRBUFROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'PSOCFTRBUFROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSOCFTRBUFROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[49].getCount());
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFSOC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSOCFTRBUFSOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PSOCFTRBUFSOC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[50].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PSOCFTRBUFSOC' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 10.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_PSOCFTRBUFSOC(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[50].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PSOCFTRBUFSOC' field in the FML buffer.
     *
     * @return Number of values defined for 'PSOCFTRBUFSOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSOCFTRBUFSOC_size() throws FMLManipulationException {
        return (this.fmlBuffer[50].getCount());
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFSOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSOCFTRBUFSOC_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PSOCFTRBUFSOC_EFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[51].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PSOCFTRBUFSOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_PSOCFTRBUFSOC_EFFECTIVE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[51].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PSOCFTRBUFSOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'PSOCFTRBUFSOC_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSOCFTRBUFSOC_EFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[51].getCount());
    }

    /**
     * Retrieves the value of the 'FEATURE_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FEATURE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FEATURE_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[52].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FEATURE_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FEATURE_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[52].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FEATURE_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FEATURE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FEATURE_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[52].getCount());
    }

    /**
     * Retrieves the value of the 'MPS_FTR_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'MPS_FTR_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MPS_FTR_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[53].getValue(nIndex));
    }

    /**
     * Sets the value of the 'MPS_FTR_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_MPS_FTR_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[53].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'MPS_FTR_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'MPS_FTR_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MPS_FTR_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[53].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_EFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[54].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FTR_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FTR_EFFECTIVE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[54].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FTR_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_EFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[54].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_EXPIRATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_EXPIRATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[55].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FTR_EXPIRATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FTR_EXPIRATION_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[55].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FTR_EXPIRATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_EXPIRATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[55].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_EFF_RSN_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_EFF_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_EFF_RSN_CODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[56].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'FTR_EFF_RSN_CODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FTR_EFF_RSN_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[56].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'FTR_EFF_RSN_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_EFF_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_EFF_RSN_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[56].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_EXP_RSN_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_EXP_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_EXP_RSN_CODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[57].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'FTR_EXP_RSN_CODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FTR_EXP_RSN_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[57].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'FTR_EXP_RSN_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_EXP_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_EXP_RSN_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[57].getCount());
    }

    /**
     * Retrieves the value of the 'SERVICE_FTR_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'SERVICE_FTR_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_SERVICE_FTR_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[58].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SERVICE_FTR_SEQ_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_SERVICE_FTR_SEQ_NO(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[58].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SERVICE_FTR_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'SERVICE_FTR_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SERVICE_FTR_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[58].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[59].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'FTR_MODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FTR_MODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[59].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'FTR_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[59].getCount());
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFSOC_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSOCFTRBUFSOC_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PSOCFTRBUFSOC_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[60].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PSOCFTRBUFSOC_SEQ_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_PSOCFTRBUFSOC_SEQ_NO(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[60].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PSOCFTRBUFSOC_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'PSOCFTRBUFSOC_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSOCFTRBUFSOC_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[60].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_SUB_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_SUB_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_SUB_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[61].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'FTR_SUB_MODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FTR_SUB_MODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[61].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'FTR_SUB_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_SUB_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_SUB_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[61].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_ADD_PARAM' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_ADD_PARAM' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_ADD_PARAM(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[62].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FTR_ADD_PARAM' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 301.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FTR_ADD_PARAM(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[62].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FTR_ADD_PARAM' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_ADD_PARAM' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_ADD_PARAM_size() throws FMLManipulationException {
        return (this.fmlBuffer[62].getCount());
    }

    /**
     * Retrieves the value of the 'FEATURE_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FEATURE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FEATURE_TYPE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[63].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FEATURE_TYPE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FEATURE_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[63].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FEATURE_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'FEATURE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FEATURE_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[63].getCount());
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFPRODUCT_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSOCFTRBUFPRODUCT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PSOCFTRBUFPRODUCT_TYPE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[64].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PSOCFTRBUFPRODUCT_TYPE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_PSOCFTRBUFPRODUCT_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[64].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PSOCFTRBUFPRODUCT_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'PSOCFTRBUFPRODUCT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSOCFTRBUFPRODUCT_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[64].getCount());
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFCAMPAIGN_SEQ' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSOCFTRBUFCAMPAIGN_SEQ' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PSOCFTRBUFCAMPAIGN_SEQ(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[65].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PSOCFTRBUFCAMPAIGN_SEQ' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_PSOCFTRBUFCAMPAIGN_SEQ(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[65].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PSOCFTRBUFCAMPAIGN_SEQ' field in the FML buffer.
     *
     * @return Number of values defined for 'PSOCFTRBUFCAMPAIGN_SEQ' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSOCFTRBUFCAMPAIGN_SEQ_size() throws FMLManipulationException {
        return (this.fmlBuffer[65].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_SPECIAL_TELNO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_SPECIAL_TELNO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_SPECIAL_TELNO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[66].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FTR_SPECIAL_TELNO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FTR_SPECIAL_TELNO(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[66].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FTR_SPECIAL_TELNO' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_SPECIAL_TELNO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_SPECIAL_TELNO_size() throws FMLManipulationException {
        return (this.fmlBuffer[66].getCount());
    }

    /**
     * Retrieves the value of the 'SWITCH_ACT_NEEDED' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'SWITCH_ACT_NEEDED' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SWITCH_ACT_NEEDED(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[67].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'SWITCH_ACT_NEEDED' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_SWITCH_ACT_NEEDED(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[67].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'SWITCH_ACT_NEEDED' field in the FML buffer.
     *
     * @return Number of values defined for 'SWITCH_ACT_NEEDED' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SWITCH_ACT_NEEDED_size() throws FMLManipulationException {
        return (this.fmlBuffer[67].getCount());
    }

    /**
     * Retrieves the value of the 'SWITCH_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'SWITCH_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SWITCH_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[68].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SWITCH_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_SWITCH_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[68].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SWITCH_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'SWITCH_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SWITCH_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[68].getCount());
    }

    /**
     * Retrieves the value of the 'MSISDN_CRITERIA' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'MSISDN_CRITERIA' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MSISDN_CRITERIA(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[69].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'MSISDN_CRITERIA' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_MSISDN_CRITERIA(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[69].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'MSISDN_CRITERIA' field in the FML buffer.
     *
     * @return Number of values defined for 'MSISDN_CRITERIA' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MSISDN_CRITERIA_size() throws FMLManipulationException {
        return (this.fmlBuffer[69].getCount());
    }

    /**
     * Retrieves the value of the 'TN_CLASS_CD' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'TN_CLASS_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_TN_CLASS_CD(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[70].getValue(nIndex));
    }

    /**
     * Sets the value of the 'TN_CLASS_CD' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_TN_CLASS_CD(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[70].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'TN_CLASS_CD' field in the FML buffer.
     *
     * @return Number of values defined for 'TN_CLASS_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_TN_CLASS_CD_size() throws FMLManipulationException {
        return (this.fmlBuffer[70].getCount());
    }

    /**
     * Retrieves the value of the 'ACTION_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'ACTION_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACTION_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[71].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'ACTION_MODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_ACTION_MODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[71].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'ACTION_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'ACTION_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACTION_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[71].getCount());
    }

    /**
     * Retrieves the value of the 'MANUAL_RC_RATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'MANUAL_RC_RATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_MANUAL_RC_RATE(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[72].getValue(nIndex));
    }

    /**
     * Sets the value of the 'MANUAL_RC_RATE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_MANUAL_RC_RATE(int nIndex, Double value) throws FMLManipulationException {
        this.fmlBuffer[72].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'MANUAL_RC_RATE' field in the FML buffer.
     *
     * @return Number of values defined for 'MANUAL_RC_RATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MANUAL_RC_RATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[72].getCount());
    }

    /**
     * Retrieves the value of the 'MANUAL_RC_EXP_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'MANUAL_RC_EXP_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MANUAL_RC_EXP_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[73].getValue(nIndex));
    }

    /**
     * Sets the value of the 'MANUAL_RC_EXP_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_MANUAL_RC_EXP_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[73].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'MANUAL_RC_EXP_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'MANUAL_RC_EXP_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MANUAL_RC_EXP_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[73].getCount());
    }

    /**
     * Retrieves the value of the 'PCSFRNDFMLROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'PCSFRNDFMLROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PCSFRNDFMLROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[74].getValue(0));
    }

    /**
     * Sets the value of the 'PCSFRNDFMLROWCOUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PCSFRNDFMLROWCOUNT(Integer value) throws FMLManipulationException {
        this.fmlBuffer[74].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'ACTIONIND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'ACTIONIND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACTIONIND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[75].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'ACTIONIND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_ACTIONIND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[75].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'ACTIONIND' field in the FML buffer.
     *
     * @return Number of values defined for 'ACTIONIND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACTIONIND_size() throws FMLManipulationException {
        return (this.fmlBuffer[75].getCount());
    }

    /**
     * Retrieves the value of the 'PCSFANDFRECROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'PCSFANDFRECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PCSFANDFRECROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[76].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PCSFANDFRECROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_PCSFANDFRECROWID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[76].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PCSFANDFRECROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'PCSFANDFRECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PCSFANDFRECROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[76].getCount());
    }

    /**
     * Retrieves the value of the 'PCSFANDFRECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'PCSFANDFRECEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PCSFANDFRECEFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[77].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PCSFANDFRECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_PCSFANDFRECEFFECTIVE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[77].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PCSFANDFRECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'PCSFANDFRECEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PCSFANDFRECEFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[77].getCount());
    }

    /**
     * Retrieves the value of the 'PCSFANDFRECEXPIRATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'PCSFANDFRECEXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PCSFANDFRECEXPIRATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[78].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PCSFANDFRECEXPIRATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_PCSFANDFRECEXPIRATION_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[78].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PCSFANDFRECEXPIRATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'PCSFANDFRECEXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PCSFANDFRECEXPIRATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[78].getCount());
    }

    /**
     * Retrieves the value of the 'PERSONAL_TEL' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'PERSONAL_TEL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PERSONAL_TEL(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[79].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PERSONAL_TEL' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_PERSONAL_TEL(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[79].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PERSONAL_TEL' field in the FML buffer.
     *
     * @return Number of values defined for 'PERSONAL_TEL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PERSONAL_TEL_size() throws FMLManipulationException {
        return (this.fmlBuffer[79].getCount());
    }

    /**
     * Retrieves the value of the 'PERSONAL_TEL_TO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'PERSONAL_TEL_TO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PERSONAL_TEL_TO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[80].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PERSONAL_TEL_TO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_PERSONAL_TEL_TO(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[80].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PERSONAL_TEL_TO' field in the FML buffer.
     *
     * @return Number of values defined for 'PERSONAL_TEL_TO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PERSONAL_TEL_TO_size() throws FMLManipulationException {
        return (this.fmlBuffer[80].getCount());
    }

    /**
     * Retrieves the value of the 'FF_SOC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'FF_SOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FF_SOC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[81].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FF_SOC' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 10.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_FF_SOC(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[81].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FF_SOC' field in the FML buffer.
     *
     * @return Number of values defined for 'FF_SOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FF_SOC_size() throws FMLManipulationException {
        return (this.fmlBuffer[81].getCount());
    }

    /**
     * Retrieves the value of the 'PLAN_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'PLAN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PLAN_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[82].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PLAN_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 10.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_PLAN_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[82].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PLAN_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'PLAN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PLAN_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[82].getCount());
    }

    /**
     * Retrieves the value of the 'DISCOUNT_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'DISCOUNT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DISCOUNT_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[83].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'DISCOUNT_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_DISCOUNT_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[83].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'DISCOUNT_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'DISCOUNT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DISCOUNT_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[83].getCount());
    }

    /**
     * Retrieves the value of the 'START_HOUR' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'START_HOUR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_START_HOUR(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[84].getValue(nIndex));
    }

    /**
     * Sets the value of the 'START_HOUR' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_START_HOUR(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[84].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'START_HOUR' field in the FML buffer.
     *
     * @return Number of values defined for 'START_HOUR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_START_HOUR_size() throws FMLManipulationException {
        return (this.fmlBuffer[84].getCount());
    }

    /**
     * Retrieves the value of the 'DURATION' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'DURATION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_DURATION(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[85].getValue(nIndex));
    }

    /**
     * Sets the value of the 'DURATION' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_DURATION(int nIndex, Double value) throws FMLManipulationException {
        this.fmlBuffer[85].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'DURATION' field in the FML buffer.
     *
     * @return Number of values defined for 'DURATION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DURATION_size() throws FMLManipulationException {
        return (this.fmlBuffer[85].getCount());
    }

    /**
     * Retrieves the value of the 'PFTRDEPBUFROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'PFTRDEPBUFROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PFTRDEPBUFROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[86].getValue(0));
    }

    /**
     * Sets the value of the 'PFTRDEPBUFROWCOUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PFTRDEPBUFROWCOUNT(Integer value) throws FMLManipulationException {
        this.fmlBuffer[86].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'DEPOSIT_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 2).
     * @return Value of 'DEPOSIT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DEPOSIT_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[87].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'DEPOSIT_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 2).
     * @throws FMLManipulationException
     */
    public void set_DEPOSIT_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[87].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'DEPOSIT_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'DEPOSIT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DEPOSIT_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[87].getCount());
    }

    /**
     * Retrieves the value of the 'DEPOSIT_AMOUNT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 2).
     * @return Value of 'DEPOSIT_AMOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_DEPOSIT_AMOUNT(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[88].getValue(nIndex));
    }

    /**
     * Sets the value of the 'DEPOSIT_AMOUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 2).
     * @throws FMLManipulationException
     */
    public void set_DEPOSIT_AMOUNT(int nIndex, Double value) throws FMLManipulationException {
        this.fmlBuffer[88].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'DEPOSIT_AMOUNT' field in the FML buffer.
     *
     * @return Number of values defined for 'DEPOSIT_AMOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DEPOSIT_AMOUNT_size() throws FMLManipulationException {
        return (this.fmlBuffer[88].getCount());
    }

    /**
     * Retrieves the value of the 'PNPINFOBUFFROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'PNPINFOBUFFROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PNPINFOBUFFROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[89].getValue(0));
    }

    /**
     * Sets the value of the 'PNPINFOBUFFROWCOUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PNPINFOBUFFROWCOUNT(Integer value) throws FMLManipulationException {
        this.fmlBuffer[89].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPNUMINFORECROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[90].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NPNUMINFORECROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_NPNUMINFORECROWID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[90].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NPNUMINFORECROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[90].getCount());
    }

    /**
     * Retrieves the value of the 'PORT_NUMBER' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'PORT_NUMBER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PORT_NUMBER(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[91].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PORT_NUMBER' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_PORT_NUMBER(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[91].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PORT_NUMBER' field in the FML buffer.
     *
     * @return Number of values defined for 'PORT_NUMBER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PORT_NUMBER_size() throws FMLManipulationException {
        return (this.fmlBuffer[91].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPNUMINFORECEFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[92].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NPNUMINFORECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_NPNUMINFORECEFFECTIVE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[92].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NPNUMINFORECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECEFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[92].getCount());
    }

    /**
     * Retrieves the value of the 'SYS_CREATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'SYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SYS_CREATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[93].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SYS_CREATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_SYS_CREATION_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[93].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SYS_CREATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'SYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SYS_CREATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[93].getCount());
    }

    /**
     * Retrieves the value of the 'SYS_UPDATE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'SYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SYS_UPDATE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[94].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SYS_UPDATE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_SYS_UPDATE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[94].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SYS_UPDATE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'SYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SYS_UPDATE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[94].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECOPERATOR_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NPNUMINFORECOPERATOR_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[95].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NPNUMINFORECOPERATOR_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_NPNUMINFORECOPERATOR_ID(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[95].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NPNUMINFORECOPERATOR_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECOPERATOR_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[95].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECAPPLICATION_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPNUMINFORECAPPLICATION_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[96].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NPNUMINFORECAPPLICATION_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_NPNUMINFORECAPPLICATION_ID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[96].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NPNUMINFORECAPPLICATION_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECAPPLICATION_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[96].getCount());
    }

    /**
     * Retrieves the value of the 'DL_SERVICE_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'DL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DL_SERVICE_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[97].getValue(nIndex));
    }

    /**
     * Sets the value of the 'DL_SERVICE_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_DL_SERVICE_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[97].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'DL_SERVICE_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'DL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DL_SERVICE_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[97].getCount());
    }

    /**
     * Retrieves the value of the 'DL_UPDATE_STAMP' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'DL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_DL_UPDATE_STAMP(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[98].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'DL_UPDATE_STAMP' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_DL_UPDATE_STAMP(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[98].setValue(nIndex, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves number of values defined for 'DL_UPDATE_STAMP' field in the FML buffer.
     *
     * @return Number of values defined for 'DL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DL_UPDATE_STAMP_size() throws FMLManipulationException {
        return (this.fmlBuffer[98].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECEXPIRATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECEXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPNUMINFORECEXPIRATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[99].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NPNUMINFORECEXPIRATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_NPNUMINFORECEXPIRATION_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[99].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NPNUMINFORECEXPIRATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECEXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECEXPIRATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[99].getCount());
    }

    /**
     * Retrieves the value of the 'INT_ORDER_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'INT_ORDER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_INT_ORDER_ID(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[100].getValue(nIndex));
    }

    /**
     * Sets the value of the 'INT_ORDER_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_INT_ORDER_ID(int nIndex, Double value) throws FMLManipulationException {
        this.fmlBuffer[100].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'INT_ORDER_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'INT_ORDER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_INT_ORDER_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[100].getCount());
    }

    /**
     * Retrieves the value of the 'ORG_CUSTOMER_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'ORG_CUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ORG_CUSTOMER_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[101].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ORG_CUSTOMER_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_ORG_CUSTOMER_ID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[101].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ORG_CUSTOMER_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'ORG_CUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ORG_CUSTOMER_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[101].getCount());
    }

    /**
     * Retrieves the value of the 'PORT_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'PORT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PORT_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[102].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'PORT_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_PORT_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[102].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'PORT_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'PORT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PORT_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[102].getCount());
    }

    /**
     * Retrieves the value of the 'NUMBER_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NUMBER_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NUMBER_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[103].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'NUMBER_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_NUMBER_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[103].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'NUMBER_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'NUMBER_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NUMBER_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[103].getCount());
    }

    /**
     * Retrieves the value of the 'PORT_REQUEST_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'PORT_REQUEST_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PORT_REQUEST_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[104].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PORT_REQUEST_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_PORT_REQUEST_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[104].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PORT_REQUEST_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'PORT_REQUEST_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PORT_REQUEST_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[104].getCount());
    }

    /**
     * Retrieves the value of the 'ORG_OPERATOR' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'ORG_OPERATOR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ORG_OPERATOR(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[105].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ORG_OPERATOR' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_ORG_OPERATOR(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[105].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ORG_OPERATOR' field in the FML buffer.
     *
     * @return Number of values defined for 'ORG_OPERATOR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ORG_OPERATOR_size() throws FMLManipulationException {
        return (this.fmlBuffer[105].getCount());
    }

    /**
     * Retrieves the value of the 'SUBSCRIBER_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'SUBSCRIBER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_SUBSCRIBER_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[106].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SUBSCRIBER_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_SUBSCRIBER_ID(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[106].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SUBSCRIBER_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'SUBSCRIBER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SUBSCRIBER_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[106].getCount());
    }

    /**
     * Retrieves the value of the 'LAST_INT_ORD_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'LAST_INT_ORD_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_LAST_INT_ORD_ID(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[107].getValue(nIndex));
    }

    /**
     * Sets the value of the 'LAST_INT_ORD_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_LAST_INT_ORD_ID(int nIndex, Double value) throws FMLManipulationException {
        this.fmlBuffer[107].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'LAST_INT_ORD_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'LAST_INT_ORD_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LAST_INT_ORD_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[107].getCount());
    }

    /**
     * Retrieves the value of the 'FUNCTION_PORT_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'FUNCTION_PORT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FUNCTION_PORT_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[108].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'FUNCTION_PORT_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_FUNCTION_PORT_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[108].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'FUNCTION_PORT_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'FUNCTION_PORT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FUNCTION_PORT_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[108].getCount());
    }

    /**
     * Retrieves the value of the 'PASSIVE_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'PASSIVE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PASSIVE_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[109].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'PASSIVE_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_PASSIVE_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[109].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'PASSIVE_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'PASSIVE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PASSIVE_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[109].getCount());
    }

    /**
     * Retrieves the value of the 'AUTO_CONFIRM' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'AUTO_CONFIRM' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_AUTO_CONFIRM(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[110].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'AUTO_CONFIRM' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_AUTO_CONFIRM(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[110].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'AUTO_CONFIRM' field in the FML buffer.
     *
     * @return Number of values defined for 'AUTO_CONFIRM' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_AUTO_CONFIRM_size() throws FMLManipulationException {
        return (this.fmlBuffer[110].getCount());
    }

    /**
     * Retrieves the value of the 'TEMPORARY_MSISDN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'TEMPORARY_MSISDN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_TEMPORARY_MSISDN(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[111].getValue(nIndex));
    }

    /**
     * Sets the value of the 'TEMPORARY_MSISDN' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_TEMPORARY_MSISDN(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[111].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'TEMPORARY_MSISDN' field in the FML buffer.
     *
     * @return Number of values defined for 'TEMPORARY_MSISDN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_TEMPORARY_MSISDN_size() throws FMLManipulationException {
        return (this.fmlBuffer[111].getCount());
    }

    /**
     * Retrieves the value of the 'HANDLE_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'HANDLE_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_HANDLE_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[112].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'HANDLE_MODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_HANDLE_MODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[112].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'HANDLE_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'HANDLE_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_HANDLE_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[112].getCount());
    }

    /**
     * Retrieves the value of the 'SEND_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'SEND_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SEND_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[113].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'SEND_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_SEND_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[113].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'SEND_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'SEND_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SEND_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[113].getCount());
    }

    /**
     * Retrieves the value of the 'ORDID_STR' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'ORDID_STR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ORDID_STR(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[114].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ORDID_STR' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_ORDID_STR(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[114].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ORDID_STR' field in the FML buffer.
     *
     * @return Number of values defined for 'ORDID_STR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ORDID_STR_size() throws FMLManipulationException {
        return (this.fmlBuffer[114].getCount());
    }

    /**
     * Retrieves the value of the 'LAST_ORDID_STR' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'LAST_ORDID_STR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LAST_ORDID_STR(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[115].getValue(nIndex));
    }

    /**
     * Sets the value of the 'LAST_ORDID_STR' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_LAST_ORDID_STR(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[115].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'LAST_ORDID_STR' field in the FML buffer.
     *
     * @return Number of values defined for 'LAST_ORDID_STR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LAST_ORDID_STR_size() throws FMLManipulationException {
        return (this.fmlBuffer[115].getCount());
    }

    /**
     * Retrieves the value of the 'ICC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'ICC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ICC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[116].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ICC' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_ICC(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[116].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ICC' field in the FML buffer.
     *
     * @return Number of values defined for 'ICC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ICC_size() throws FMLManipulationException {
        return (this.fmlBuffer[116].getCount());
    }

    /**
     * Retrieves the value of the 'CUSTOMER_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'CUSTOMER_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CUSTOMER_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[117].getValue(nIndex));
    }

    /**
     * Sets the value of the 'CUSTOMER_NAME' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 255.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_CUSTOMER_NAME(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[117].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'CUSTOMER_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'CUSTOMER_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CUSTOMER_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[117].getCount());
    }

    /**
     * Retrieves the value of the 'NPINFOBUFFCUSTOMER_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPINFOBUFFCUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPINFOBUFFCUSTOMER_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[118].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NPINFOBUFFCUSTOMER_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_NPINFOBUFFCUSTOMER_ID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[118].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NPINFOBUFFCUSTOMER_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'NPINFOBUFFCUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPINFOBUFFCUSTOMER_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[118].getCount());
    }

    /**
     * Retrieves the value of the 'SERVICE_PROVIDER' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'SERVICE_PROVIDER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SERVICE_PROVIDER(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[119].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SERVICE_PROVIDER' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_SERVICE_PROVIDER(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[119].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SERVICE_PROVIDER' field in the FML buffer.
     *
     * @return Number of values defined for 'SERVICE_PROVIDER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SERVICE_PROVIDER_size() throws FMLManipulationException {
        return (this.fmlBuffer[119].getCount());
    }

    public void populateCsApiBan(CsApiBanInput csApiBanInput)
            throws FMLManipulationException {

        // Special indirect mapping from fields in this buffer to differently named fields in CsApiBan TODO: how do we know which fields to map where?
        if (csApiBanInput.get_PCTNAGRPRMRECBAN() == null) {
            csApiBanInput.set_PCTNAGRPRMRECBAN(get_BAN());
        }
        if (csApiBanInput.get_PCTNAGRPRMRECCUSTOMER_ID() == null) {
            csApiBanInput.set_PCTNAGRPRMRECCUSTOMER_ID(get_CUSTOMER_ID());
        }
        // TODO: is this really correct? Would guess they should only be mapped from the cvSvCtn-service.
        if (csApiBanInput.get_PCTNRECCUSTOMER_ID() == null) {
            csApiBanInput.set_PCTNRECCUSTOMER_ID(get_CUSTOMER_ID());
        }
        if (csApiBanInput.get_PCTNRECSUBSCRIBER_NO() == null) {
            csApiBanInput.set_PCTNRECSUBSCRIBER_NO(get_SUBSCRIBER_NO());
        }

        for (int i = 0; i < get_ROWID_size(); i++) {
            csApiBanInput.set_PAGRSOCBUFROWID(i, get_ROWID(i));
        }
        for (int i = 0; i < get_EFFECTIVE_DATE_size(); i++) {
            csApiBanInput.set_PAGRSOCBUFEFFECTIVE_DATE(i, get_EFFECTIVE_DATE(i));
        }
        for (int i = 0; i < get_DEALER_CODE_size(); i++) {
            csApiBanInput.set_PAGRSOCBUFDEALER_CODE(i, get_DEALER_CODE(i));
        }
        for (int i = 0; i < get_SALES_AGENT_size(); i++) {
            csApiBanInput.set_PAGRSOCBUFSALES_AGENT(i, get_SALES_AGENT(i));
        }
        for (int i = 0; i < get_COMMIT_ORIG_NO_MONTH_size(); i++) {
            csApiBanInput.set_PAGRSOCBUFCOMMIT_ORIG_NO_MONTH(i, get_COMMIT_ORIG_NO_MONTH(i));
        }
        for (int i = 0; i < get_PRODUCT_TYPE_size(); i++) {
            csApiBanInput.set_PAGRSOCBUFPRODUCT_TYPE(i, get_PRODUCT_TYPE(i));
        }

        if (csApiBanInput.get_PAGRFRNDFMLROWCOUNT() == null) {
            csApiBanInput.set_PAGRFRNDFMLROWCOUNT(get_PCSFRNDFMLROWCOUNT());
        }
        if (csApiBanInput.get_PAGRFTRDEPBUFROWCOUNT() == null) {
            csApiBanInput.set_PAGRFTRDEPBUFROWCOUNT(get_PFTRDEPBUFROWCOUNT());
        }

        for (int i = 0; i < get_SYS_CREATION_DATE_size(); i++) {
            csApiBanInput.set_NPNUMINFORECSYS_CREATION_DATE(i, get_SYS_CREATION_DATE(i));
        }
        for (int i = 0; i < get_SYS_UPDATE_DATE_size(); i++) {
            csApiBanInput.set_NPNUMINFORECSYS_UPDATE_DATE(i, get_SYS_UPDATE_DATE(i));
        }
        for (int i = 0; i < get_DL_SERVICE_CODE_size(); i++) {
            csApiBanInput.set_NPNUMINFORECDL_SERVICE_CODE(i, get_DL_SERVICE_CODE(i));
        }
        for (int i = 0; i < get_DL_UPDATE_STAMP_size(); i++) {
            csApiBanInput.set_NPNUMINFORECDL_UPDATE_STAMP(i, get_DL_UPDATE_STAMP(i));
        }
        for (int i = 0; i < get_SUBSCRIBER_ID_size(); i++) {
            csApiBanInput.set_NPNUMINFORECSUBSCRIBER_ID(i, get_SUBSCRIBER_ID(i));
        }

        if (csApiBanInput.get_SUBSCRIBER_NO() == null) {
            csApiBanInput.set_SUBSCRIBER_NO(get_SUBSCRIBER_NO()); // This one is mapped special and general?
        }

        // General direct mapping between fields with the same name in both this buffer and CsApiBan-buffer.
        ServiceParameter.copyFmlBuffer(this, csApiBanInput, keysNotToBeMapped);

    }

}