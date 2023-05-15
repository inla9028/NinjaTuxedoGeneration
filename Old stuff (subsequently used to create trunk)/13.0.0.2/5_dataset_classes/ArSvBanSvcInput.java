/*
 * ArSvBanSvcInput.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service.parameters;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;

/**
 * @author  Ninja
 *
 * ArSvBanSvcInput class.
 */
public class ArSvBanSvcInput extends ServiceInput {
    // Indicates whether the default values has been loaded from the DB or not
    private static Boolean defaultValuesPopulated = new Boolean(false);
    // Holds default values for fields in FML buffer
    private static String defaultValues[] = null;

    /**
     * Creates a new instance of ArSvBanSvcInput
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArSvBanSvcInput() throws EnvironmentException, FMLManipulationException {
        // Initialize FML buffer
        fmlBuffer = new FmlField[119];

        // Get default values from DB
        synchronized (this.defaultValuesPopulated) {
            if (this.defaultValuesPopulated.equals(Boolean.FALSE)) {
                defaultValues = getDefaultValues("arSvBanSvc", 119);
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
        this.fmlBuffer[22] = new FmlField("DEPLOYINDONCHG", FmlField.TYPE_BYTE, -1, defaultValues[22], 22, 1);
        this.fmlBuffer[23] = new FmlField("ROWID", FmlField.TYPE_STRING, 19, defaultValues[23], 23, 1);
        this.fmlBuffer[24] = new FmlField("BL_REQ_ST_GRACE_PRD", FmlField.TYPE_STRING, 9, defaultValues[24], 24, 1);
        this.fmlBuffer[25] = new FmlField("BL_REQ_END_GRACE_PRD", FmlField.TYPE_STRING, 9, defaultValues[25], 25, 1);
        this.fmlBuffer[26] = new FmlField("CS_MIN_REQ_CTNS", FmlField.TYPE_INTEGER, -1, defaultValues[26], 26, 1);
        this.fmlBuffer[27] = new FmlField("CS_COM_START_DATE", FmlField.TYPE_STRING, 9, defaultValues[27], 27, 1);
        this.fmlBuffer[28] = new FmlField("CS_COM_END_DATE", FmlField.TYPE_STRING, 9, defaultValues[28], 28, 1);
        this.fmlBuffer[29] = new FmlField("CS_COM_REASON_CODE", FmlField.TYPE_STRING, 4, defaultValues[29], 29, 1);
        this.fmlBuffer[30] = new FmlField("CS_COM_ORIG_NO_MONTH", FmlField.TYPE_SHORT, -1, defaultValues[30], 30, 1);
        this.fmlBuffer[31] = new FmlField("ROWCOUNT", FmlField.TYPE_INTEGER, -1, defaultValues[31], 31, 1);
        this.fmlBuffer[32] = new FmlField("PSRVAGRBUFROWID", FmlField.TYPE_STRING, 19, defaultValues[32], 32, 50);
        this.fmlBuffer[33] = new FmlField("SOC", FmlField.TYPE_STRING, 10, defaultValues[33], 33, 50);
        this.fmlBuffer[34] = new FmlField("SOC_EFFECTIVE_DATE", FmlField.TYPE_STRING, 9, defaultValues[34], 34, 50);
        this.fmlBuffer[35] = new FmlField("COMMITMENT_END_DATE", FmlField.TYPE_STRING, 9, defaultValues[35], 35, 50);
        this.fmlBuffer[36] = new FmlField("SERVICE_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[36], 36, 50);
        this.fmlBuffer[37] = new FmlField("EFFECTIVE_DATE", FmlField.TYPE_STRING, 9, defaultValues[37], 37, 50);
        this.fmlBuffer[38] = new FmlField("EXPIRATION_DATE", FmlField.TYPE_STRING, 9, defaultValues[38], 38, 50);
        this.fmlBuffer[39] = new FmlField("SOC_LEVEL_CODE", FmlField.TYPE_BYTE, -1, defaultValues[39], 39, 50);
        this.fmlBuffer[40] = new FmlField("DEALER_CODE", FmlField.TYPE_STRING, 6, defaultValues[40], 40, 50);
        this.fmlBuffer[41] = new FmlField("SALES_AGENT", FmlField.TYPE_STRING, 6, defaultValues[41], 41, 50);
        this.fmlBuffer[42] = new FmlField("SRV_MODE", FmlField.TYPE_BYTE, -1, defaultValues[42], 42, 50);
        this.fmlBuffer[43] = new FmlField("SRV_SUB_MODE", FmlField.TYPE_BYTE, -1, defaultValues[43], 43, 50);
        this.fmlBuffer[44] = new FmlField("SOC_SEQ_NO", FmlField.TYPE_INTEGER, -1, defaultValues[44], 44, 50);
        this.fmlBuffer[45] = new FmlField("SRV_TRX_ID", FmlField.TYPE_INTEGER, -1, defaultValues[45], 45, 50);
        this.fmlBuffer[46] = new FmlField("CAMPAIGN_SEQ", FmlField.TYPE_INTEGER, -1, defaultValues[46], 46, 50);
        this.fmlBuffer[47] = new FmlField("CAMPAIGN", FmlField.TYPE_STRING, 10, defaultValues[47], 47, 50);
        this.fmlBuffer[48] = new FmlField("COMMIT_ORIG_NO_MONTH", FmlField.TYPE_SHORT, -1, defaultValues[48], 48, 50);
        this.fmlBuffer[49] = new FmlField("PRODUCT_TYPE", FmlField.TYPE_STRING, 4, defaultValues[49], 49, 50);
        this.fmlBuffer[50] = new FmlField("LOAN_VER_NO", FmlField.TYPE_INTEGER, -1, defaultValues[50], 50, 50);
        this.fmlBuffer[51] = new FmlField("LOAN_SEQ_NO", FmlField.TYPE_INTEGER, -1, defaultValues[51], 51, 50);
        this.fmlBuffer[52] = new FmlField("SOC_ACTV_FEE", FmlField.TYPE_DOUBLE, -1, defaultValues[52], 52, 50);
        this.fmlBuffer[53] = new FmlField("PROMOTIONAL_SOC", FmlField.TYPE_STRING, 10, defaultValues[53], 53, 50);
        this.fmlBuffer[54] = new FmlField("REASON_CODE", FmlField.TYPE_STRING, 5, defaultValues[54], 54, 50);
        this.fmlBuffer[55] = new FmlField("SOC_START_RC_DATE", FmlField.TYPE_STRING, 9, defaultValues[55], 55, 50);
        this.fmlBuffer[56] = new FmlField("RC_DATE_COPY_IND", FmlField.TYPE_BYTE, -1, defaultValues[56], 56, 50);
        this.fmlBuffer[57] = new FmlField("PSRVFTRBUFROWCOUNT", FmlField.TYPE_INTEGER, -1, defaultValues[57], 57, 1);
        this.fmlBuffer[58] = new FmlField("PSRVFTRBUFROWID", FmlField.TYPE_STRING, 19, defaultValues[58], 58, 200);
        this.fmlBuffer[59] = new FmlField("PSRVFTRBUFSOC", FmlField.TYPE_STRING, 10, defaultValues[59], 59, 200);
        this.fmlBuffer[60] = new FmlField("PSRVFTRBUFSOC_EFFECTIVE_DATE", FmlField.TYPE_STRING, 9, defaultValues[60], 60, 200);
        this.fmlBuffer[61] = new FmlField("FEATURE_CODE", FmlField.TYPE_STRING, 7, defaultValues[61], 61, 200);
        this.fmlBuffer[62] = new FmlField("MPS_FTR_CODE", FmlField.TYPE_STRING, 7, defaultValues[62], 62, 200);
        this.fmlBuffer[63] = new FmlField("FTR_EFFECTIVE_DATE", FmlField.TYPE_STRING, 9, defaultValues[63], 63, 200);
        this.fmlBuffer[64] = new FmlField("FTR_EXPIRATION_DATE", FmlField.TYPE_STRING, 9, defaultValues[64], 64, 200);
        this.fmlBuffer[65] = new FmlField("FTR_EFF_RSN_CODE", FmlField.TYPE_BYTE, -1, defaultValues[65], 65, 200);
        this.fmlBuffer[66] = new FmlField("FTR_EXP_RSN_CODE", FmlField.TYPE_BYTE, -1, defaultValues[66], 66, 200);
        this.fmlBuffer[67] = new FmlField("SERVICE_FTR_SEQ_NO", FmlField.TYPE_INTEGER, -1, defaultValues[67], 67, 200);
        this.fmlBuffer[68] = new FmlField("FTR_MODE", FmlField.TYPE_BYTE, -1, defaultValues[68], 68, 200);
        this.fmlBuffer[69] = new FmlField("PSRVFTRBUFSOC_SEQ_NO", FmlField.TYPE_INTEGER, -1, defaultValues[69], 69, 200);
        this.fmlBuffer[70] = new FmlField("FTR_SUB_MODE", FmlField.TYPE_BYTE, -1, defaultValues[70], 70, 200);
        this.fmlBuffer[71] = new FmlField("FTR_ADD_PARAM", FmlField.TYPE_STRING, 301, defaultValues[71], 71, 200);
        this.fmlBuffer[72] = new FmlField("FEATURE_TYPE", FmlField.TYPE_STRING, 4, defaultValues[72], 72, 200);
        this.fmlBuffer[73] = new FmlField("PSRVFTRBUFPRODUCT_TYPE", FmlField.TYPE_STRING, 4, defaultValues[73], 73, 200);
        this.fmlBuffer[74] = new FmlField("PSRVFTRBUFCAMPAIGN_SEQ", FmlField.TYPE_INTEGER, -1, defaultValues[74], 74, 200);
        this.fmlBuffer[75] = new FmlField("FTR_SPECIAL_TELNO", FmlField.TYPE_STRING, 21, defaultValues[75], 75, 200);
        this.fmlBuffer[76] = new FmlField("SWITCH_ACT_NEEDED", FmlField.TYPE_BYTE, -1, defaultValues[76], 76, 200);
        this.fmlBuffer[77] = new FmlField("SWITCH_CODE", FmlField.TYPE_STRING, 7, defaultValues[77], 77, 200);
        this.fmlBuffer[78] = new FmlField("MSISDN_CRITERIA", FmlField.TYPE_BYTE, -1, defaultValues[78], 78, 200);
        this.fmlBuffer[79] = new FmlField("TN_CLASS_CD", FmlField.TYPE_STRING, 4, defaultValues[79], 79, 200);
        this.fmlBuffer[80] = new FmlField("ACTION_MODE", FmlField.TYPE_BYTE, -1, defaultValues[80], 80, 200);
        this.fmlBuffer[81] = new FmlField("MANUAL_RC_RATE", FmlField.TYPE_DOUBLE, -1, defaultValues[81], 81, 200);
        this.fmlBuffer[82] = new FmlField("MANUAL_RC_EXP_DATE", FmlField.TYPE_STRING, 9, defaultValues[82], 82, 200);
        this.fmlBuffer[83] = new FmlField("ROW_COUNT", FmlField.TYPE_INTEGER, -1, defaultValues[83], 83, 1);
        this.fmlBuffer[84] = new FmlField("ACT_CODE", FmlField.TYPE_STRING, 4, defaultValues[84], 84, 25);
        this.fmlBuffer[85] = new FmlField("ACT_REASON", FmlField.TYPE_STRING, 5, defaultValues[85], 85, 25);
        this.fmlBuffer[86] = new FmlField("SUSP_RC_RATE_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[86], 86, 25);
        this.fmlBuffer[87] = new FmlField("MEMO_CTN", FmlField.TYPE_STRING, 21, defaultValues[87], 87, 25);
        this.fmlBuffer[88] = new FmlField("USER_TEXT", FmlField.TYPE_STRING, 2001, defaultValues[88], 88, 25);
        this.fmlBuffer[89] = new FmlField("MEMO_SOURCE", FmlField.TYPE_BYTE, -1, defaultValues[89], 89, 25);
        this.fmlBuffer[90] = new FmlField("PARAM_COUNT", FmlField.TYPE_INTEGER, -1, defaultValues[90], 90, 25);
        this.fmlBuffer[91] = new FmlField("P1", FmlField.TYPE_STRING, 21, defaultValues[91], 91, 25);
        this.fmlBuffer[92] = new FmlField("P2", FmlField.TYPE_STRING, 21, defaultValues[92], 92, 25);
        this.fmlBuffer[93] = new FmlField("P3", FmlField.TYPE_STRING, 21, defaultValues[93], 93, 25);
        this.fmlBuffer[94] = new FmlField("P4", FmlField.TYPE_STRING, 21, defaultValues[94], 94, 25);
        this.fmlBuffer[95] = new FmlField("P5", FmlField.TYPE_STRING, 21, defaultValues[95], 95, 25);
        this.fmlBuffer[96] = new FmlField("P6", FmlField.TYPE_STRING, 21, defaultValues[96], 96, 25);
        this.fmlBuffer[97] = new FmlField("P7", FmlField.TYPE_STRING, 21, defaultValues[97], 97, 25);
        this.fmlBuffer[98] = new FmlField("P8", FmlField.TYPE_STRING, 21, defaultValues[98], 98, 25);
        this.fmlBuffer[99] = new FmlField("P9", FmlField.TYPE_STRING, 21, defaultValues[99], 99, 25);
        this.fmlBuffer[100] = new FmlField("P10", FmlField.TYPE_STRING, 21, defaultValues[100], 100, 25);
        this.fmlBuffer[101] = new FmlField("MEMO_AMT", FmlField.TYPE_DOUBLE, -1, defaultValues[101], 101, 25);
        this.fmlBuffer[102] = new FmlField("RMS_ACT_CODE", FmlField.TYPE_STRING, 5, defaultValues[102], 102, 25);
        this.fmlBuffer[103] = new FmlField("CHARGE_AMT", FmlField.TYPE_DOUBLE, -1, defaultValues[103], 103, 25);
        this.fmlBuffer[104] = new FmlField("CHARGE_AMT_IND", FmlField.TYPE_BYTE, -1, defaultValues[104], 104, 25);
        this.fmlBuffer[105] = new FmlField("WAIVE_REASON", FmlField.TYPE_STRING, 7, defaultValues[105], 105, 25);
        this.fmlBuffer[106] = new FmlField("WAIVE_IND", FmlField.TYPE_BYTE, -1, defaultValues[106], 106, 25);
        this.fmlBuffer[107] = new FmlField("PCSFRNDFMLROWCOUNT", FmlField.TYPE_INTEGER, -1, defaultValues[107], 107, 1);
        this.fmlBuffer[108] = new FmlField("ACTIONIND", FmlField.TYPE_BYTE, -1, defaultValues[108], 108, 10000);
        this.fmlBuffer[109] = new FmlField("PCSFANDFRECROWID", FmlField.TYPE_STRING, 19, defaultValues[109], 109, 10000);
        this.fmlBuffer[110] = new FmlField("PCSFANDFRECEFFECTIVE_DATE", FmlField.TYPE_STRING, 15, defaultValues[110], 110, 10000);
        this.fmlBuffer[111] = new FmlField("PCSFANDFRECEXPIRATION_DATE", FmlField.TYPE_STRING, 15, defaultValues[111], 111, 10000);
        this.fmlBuffer[112] = new FmlField("PERSONAL_TEL", FmlField.TYPE_STRING, 21, defaultValues[112], 112, 10000);
        this.fmlBuffer[113] = new FmlField("PERSONAL_TEL_TO", FmlField.TYPE_STRING, 21, defaultValues[113], 113, 10000);
        this.fmlBuffer[114] = new FmlField("FF_SOC", FmlField.TYPE_STRING, 10, defaultValues[114], 114, 10000);
        this.fmlBuffer[115] = new FmlField("PLAN_CODE", FmlField.TYPE_STRING, 10, defaultValues[115], 115, 10000);
        this.fmlBuffer[116] = new FmlField("DISCOUNT_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[116], 116, 10000);
        this.fmlBuffer[117] = new FmlField("START_HOUR", FmlField.TYPE_STRING, 7, defaultValues[117], 117, 10000);
        this.fmlBuffer[118] = new FmlField("DURATION", FmlField.TYPE_DOUBLE, -1, defaultValues[118], 118, 10000);
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
     * Retrieves the value of the 'DEPLOYINDONCHG' field in the FML buffer.
     *
     * @return Value of 'DEPLOYINDONCHG' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DEPLOYINDONCHG() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[22].getValue(0)));
    }

    /**
     * Sets the value of the 'DEPLOYINDONCHG' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_DEPLOYINDONCHG(String value) throws FMLManipulationException {
        this.fmlBuffer[22].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'ROWID' field in the FML buffer.
     *
     * @return Value of 'ROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ROWID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[23].getValue(0));
    }

    /**
     * Sets the value of the 'ROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @throws FMLManipulationException
     */
    public void set_ROWID(String value) throws FMLManipulationException {
        this.fmlBuffer[23].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'BL_REQ_ST_GRACE_PRD' field in the FML buffer.
     *
     * @return Value of 'BL_REQ_ST_GRACE_PRD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_REQ_ST_GRACE_PRD() throws FMLManipulationException {
        return ((String) this.fmlBuffer[24].getValue(0));
    }

    /**
     * Sets the value of the 'BL_REQ_ST_GRACE_PRD' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_BL_REQ_ST_GRACE_PRD(String value) throws FMLManipulationException {
        this.fmlBuffer[24].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'BL_REQ_END_GRACE_PRD' field in the FML buffer.
     *
     * @return Value of 'BL_REQ_END_GRACE_PRD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_REQ_END_GRACE_PRD() throws FMLManipulationException {
        return ((String) this.fmlBuffer[25].getValue(0));
    }

    /**
     * Sets the value of the 'BL_REQ_END_GRACE_PRD' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_BL_REQ_END_GRACE_PRD(String value) throws FMLManipulationException {
        this.fmlBuffer[25].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CS_MIN_REQ_CTNS' field in the FML buffer.
     *
     * @return Value of 'CS_MIN_REQ_CTNS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CS_MIN_REQ_CTNS() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[26].getValue(0));
    }

    /**
     * Sets the value of the 'CS_MIN_REQ_CTNS' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CS_MIN_REQ_CTNS(Integer value) throws FMLManipulationException {
        this.fmlBuffer[26].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CS_COM_START_DATE' field in the FML buffer.
     *
     * @return Value of 'CS_COM_START_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CS_COM_START_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[27].getValue(0));
    }

    /**
     * Sets the value of the 'CS_COM_START_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_CS_COM_START_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[27].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CS_COM_END_DATE' field in the FML buffer.
     *
     * @return Value of 'CS_COM_END_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CS_COM_END_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[28].getValue(0));
    }

    /**
     * Sets the value of the 'CS_COM_END_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_CS_COM_END_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[28].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CS_COM_REASON_CODE' field in the FML buffer.
     *
     * @return Value of 'CS_COM_REASON_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CS_COM_REASON_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[29].getValue(0));
    }

    /**
     * Sets the value of the 'CS_COM_REASON_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @throws FMLManipulationException
     */
    public void set_CS_COM_REASON_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[29].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CS_COM_ORIG_NO_MONTH' field in the FML buffer.
     *
     * @return Value of 'CS_COM_ORIG_NO_MONTH' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CS_COM_ORIG_NO_MONTH() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[30].getValue(0)));
    }

    /**
     * Sets the value of the 'CS_COM_ORIG_NO_MONTH' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CS_COM_ORIG_NO_MONTH(Integer value) throws FMLManipulationException {
        this.fmlBuffer[30].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'ROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'ROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[31].getValue(0));
    }

    /**
     * Sets the value of the 'ROWCOUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_ROWCOUNT(Integer value) throws FMLManipulationException {
        this.fmlBuffer[31].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PSRVAGRBUFROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PSRVAGRBUFROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PSRVAGRBUFROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[32].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PSRVAGRBUFROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_PSRVAGRBUFROWID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[32].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PSRVAGRBUFROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'PSRVAGRBUFROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSRVAGRBUFROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[32].getCount());
    }

    /**
     * Retrieves the value of the 'SOC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SOC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[33].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SOC' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 10.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SOC(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[33].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SOC' field in the FML buffer.
     *
     * @return Number of values defined for 'SOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SOC_size() throws FMLManipulationException {
        return (this.fmlBuffer[33].getCount());
    }

    /**
     * Retrieves the value of the 'SOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SOC_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SOC_EFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[34].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SOC_EFFECTIVE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[34].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'SOC_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SOC_EFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[34].getCount());
    }

    /**
     * Retrieves the value of the 'COMMITMENT_END_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'COMMITMENT_END_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COMMITMENT_END_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[35].getValue(nIndex));
    }

    /**
     * Sets the value of the 'COMMITMENT_END_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_COMMITMENT_END_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[35].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'COMMITMENT_END_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'COMMITMENT_END_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COMMITMENT_END_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[35].getCount());
    }

    /**
     * Retrieves the value of the 'SERVICE_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SERVICE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SERVICE_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[36].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'SERVICE_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SERVICE_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[36].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'SERVICE_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'SERVICE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SERVICE_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[36].getCount());
    }

    /**
     * Retrieves the value of the 'EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[37].getValue(nIndex));
    }

    /**
     * Sets the value of the 'EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_EFFECTIVE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[37].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'EFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_EFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[37].getCount());
    }

    /**
     * Retrieves the value of the 'EXPIRATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EXPIRATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[38].getValue(nIndex));
    }

    /**
     * Sets the value of the 'EXPIRATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_EXPIRATION_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[38].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'EXPIRATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_EXPIRATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[38].getCount());
    }

    /**
     * Retrieves the value of the 'SOC_LEVEL_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SOC_LEVEL_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SOC_LEVEL_CODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[39].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'SOC_LEVEL_CODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SOC_LEVEL_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[39].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'SOC_LEVEL_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'SOC_LEVEL_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SOC_LEVEL_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[39].getCount());
    }

    /**
     * Retrieves the value of the 'DEALER_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'DEALER_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DEALER_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[40].getValue(nIndex));
    }

    /**
     * Sets the value of the 'DEALER_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_DEALER_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[40].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'DEALER_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'DEALER_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DEALER_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[40].getCount());
    }

    /**
     * Retrieves the value of the 'SALES_AGENT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SALES_AGENT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SALES_AGENT(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[41].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SALES_AGENT' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SALES_AGENT(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[41].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SALES_AGENT' field in the FML buffer.
     *
     * @return Number of values defined for 'SALES_AGENT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SALES_AGENT_size() throws FMLManipulationException {
        return (this.fmlBuffer[41].getCount());
    }

    /**
     * Retrieves the value of the 'SRV_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SRV_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SRV_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[42].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'SRV_MODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SRV_MODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[42].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'SRV_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'SRV_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SRV_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[42].getCount());
    }

    /**
     * Retrieves the value of the 'SRV_SUB_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SRV_SUB_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SRV_SUB_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[43].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'SRV_SUB_MODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SRV_SUB_MODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[43].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'SRV_SUB_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'SRV_SUB_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SRV_SUB_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[43].getCount());
    }

    /**
     * Retrieves the value of the 'SOC_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SOC_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_SOC_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[44].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SOC_SEQ_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SOC_SEQ_NO(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[44].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SOC_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'SOC_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SOC_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[44].getCount());
    }

    /**
     * Retrieves the value of the 'SRV_TRX_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SRV_TRX_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_SRV_TRX_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[45].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SRV_TRX_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SRV_TRX_ID(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[45].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SRV_TRX_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'SRV_TRX_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SRV_TRX_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[45].getCount());
    }

    /**
     * Retrieves the value of the 'CAMPAIGN_SEQ' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'CAMPAIGN_SEQ' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CAMPAIGN_SEQ(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[46].getValue(nIndex));
    }

    /**
     * Sets the value of the 'CAMPAIGN_SEQ' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_CAMPAIGN_SEQ(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[46].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'CAMPAIGN_SEQ' field in the FML buffer.
     *
     * @return Number of values defined for 'CAMPAIGN_SEQ' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CAMPAIGN_SEQ_size() throws FMLManipulationException {
        return (this.fmlBuffer[46].getCount());
    }

    /**
     * Retrieves the value of the 'CAMPAIGN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'CAMPAIGN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CAMPAIGN(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[47].getValue(nIndex));
    }

    /**
     * Sets the value of the 'CAMPAIGN' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 10.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_CAMPAIGN(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[47].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'CAMPAIGN' field in the FML buffer.
     *
     * @return Number of values defined for 'CAMPAIGN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CAMPAIGN_size() throws FMLManipulationException {
        return (this.fmlBuffer[47].getCount());
    }

    /**
     * Retrieves the value of the 'COMMIT_ORIG_NO_MONTH' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'COMMIT_ORIG_NO_MONTH' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_COMMIT_ORIG_NO_MONTH(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[48].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'COMMIT_ORIG_NO_MONTH' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_COMMIT_ORIG_NO_MONTH(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[48].setValue(nIndex, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves number of values defined for 'COMMIT_ORIG_NO_MONTH' field in the FML buffer.
     *
     * @return Number of values defined for 'COMMIT_ORIG_NO_MONTH' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COMMIT_ORIG_NO_MONTH_size() throws FMLManipulationException {
        return (this.fmlBuffer[48].getCount());
    }

    /**
     * Retrieves the value of the 'PRODUCT_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PRODUCT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PRODUCT_TYPE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[49].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PRODUCT_TYPE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_PRODUCT_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[49].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PRODUCT_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'PRODUCT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PRODUCT_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[49].getCount());
    }

    /**
     * Retrieves the value of the 'LOAN_VER_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'LOAN_VER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LOAN_VER_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[50].getValue(nIndex));
    }

    /**
     * Sets the value of the 'LOAN_VER_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_LOAN_VER_NO(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[50].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'LOAN_VER_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'LOAN_VER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LOAN_VER_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[50].getCount());
    }

    /**
     * Retrieves the value of the 'LOAN_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'LOAN_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LOAN_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[51].getValue(nIndex));
    }

    /**
     * Sets the value of the 'LOAN_SEQ_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_LOAN_SEQ_NO(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[51].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'LOAN_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'LOAN_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LOAN_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[51].getCount());
    }

    /**
     * Retrieves the value of the 'SOC_ACTV_FEE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SOC_ACTV_FEE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_SOC_ACTV_FEE(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[52].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SOC_ACTV_FEE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SOC_ACTV_FEE(int nIndex, Double value) throws FMLManipulationException {
        this.fmlBuffer[52].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SOC_ACTV_FEE' field in the FML buffer.
     *
     * @return Number of values defined for 'SOC_ACTV_FEE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SOC_ACTV_FEE_size() throws FMLManipulationException {
        return (this.fmlBuffer[52].getCount());
    }

    /**
     * Retrieves the value of the 'PROMOTIONAL_SOC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PROMOTIONAL_SOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PROMOTIONAL_SOC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[53].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PROMOTIONAL_SOC' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 10.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_PROMOTIONAL_SOC(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[53].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PROMOTIONAL_SOC' field in the FML buffer.
     *
     * @return Number of values defined for 'PROMOTIONAL_SOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PROMOTIONAL_SOC_size() throws FMLManipulationException {
        return (this.fmlBuffer[53].getCount());
    }

    /**
     * Retrieves the value of the 'REASON_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'REASON_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_REASON_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[54].getValue(nIndex));
    }

    /**
     * Sets the value of the 'REASON_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_REASON_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[54].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'REASON_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'REASON_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_REASON_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[54].getCount());
    }

    /**
     * Retrieves the value of the 'SOC_START_RC_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SOC_START_RC_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SOC_START_RC_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[55].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SOC_START_RC_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SOC_START_RC_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[55].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SOC_START_RC_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'SOC_START_RC_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SOC_START_RC_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[55].getCount());
    }

    /**
     * Retrieves the value of the 'RC_DATE_COPY_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'RC_DATE_COPY_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_RC_DATE_COPY_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[56].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'RC_DATE_COPY_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_RC_DATE_COPY_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[56].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'RC_DATE_COPY_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'RC_DATE_COPY_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_RC_DATE_COPY_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[56].getCount());
    }

    /**
     * Retrieves the value of the 'PSRVFTRBUFROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'PSRVFTRBUFROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PSRVFTRBUFROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[57].getValue(0));
    }

    /**
     * Sets the value of the 'PSRVFTRBUFROWCOUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PSRVFTRBUFROWCOUNT(Integer value) throws FMLManipulationException {
        this.fmlBuffer[57].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PSRVFTRBUFROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSRVFTRBUFROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PSRVFTRBUFROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[58].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PSRVFTRBUFROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_PSRVFTRBUFROWID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[58].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PSRVFTRBUFROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'PSRVFTRBUFROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSRVFTRBUFROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[58].getCount());
    }

    /**
     * Retrieves the value of the 'PSRVFTRBUFSOC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSRVFTRBUFSOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PSRVFTRBUFSOC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[59].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PSRVFTRBUFSOC' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 10.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_PSRVFTRBUFSOC(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[59].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PSRVFTRBUFSOC' field in the FML buffer.
     *
     * @return Number of values defined for 'PSRVFTRBUFSOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSRVFTRBUFSOC_size() throws FMLManipulationException {
        return (this.fmlBuffer[59].getCount());
    }

    /**
     * Retrieves the value of the 'PSRVFTRBUFSOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSRVFTRBUFSOC_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PSRVFTRBUFSOC_EFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[60].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PSRVFTRBUFSOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_PSRVFTRBUFSOC_EFFECTIVE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[60].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PSRVFTRBUFSOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'PSRVFTRBUFSOC_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSRVFTRBUFSOC_EFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[60].getCount());
    }

    /**
     * Retrieves the value of the 'FEATURE_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FEATURE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FEATURE_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[61].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FEATURE_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FEATURE_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[61].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FEATURE_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FEATURE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FEATURE_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[61].getCount());
    }

    /**
     * Retrieves the value of the 'MPS_FTR_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'MPS_FTR_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MPS_FTR_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[62].getValue(nIndex));
    }

    /**
     * Sets the value of the 'MPS_FTR_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_MPS_FTR_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[62].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'MPS_FTR_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'MPS_FTR_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MPS_FTR_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[62].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_EFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[63].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FTR_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FTR_EFFECTIVE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[63].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FTR_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_EFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[63].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_EXPIRATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_EXPIRATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[64].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FTR_EXPIRATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FTR_EXPIRATION_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[64].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FTR_EXPIRATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_EXPIRATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[64].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_EFF_RSN_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_EFF_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_EFF_RSN_CODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[65].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'FTR_EFF_RSN_CODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FTR_EFF_RSN_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[65].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'FTR_EFF_RSN_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_EFF_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_EFF_RSN_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[65].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_EXP_RSN_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_EXP_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_EXP_RSN_CODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[66].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'FTR_EXP_RSN_CODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FTR_EXP_RSN_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[66].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'FTR_EXP_RSN_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_EXP_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_EXP_RSN_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[66].getCount());
    }

    /**
     * Retrieves the value of the 'SERVICE_FTR_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'SERVICE_FTR_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_SERVICE_FTR_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[67].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SERVICE_FTR_SEQ_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_SERVICE_FTR_SEQ_NO(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[67].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SERVICE_FTR_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'SERVICE_FTR_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SERVICE_FTR_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[67].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[68].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'FTR_MODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FTR_MODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[68].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'FTR_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[68].getCount());
    }

    /**
     * Retrieves the value of the 'PSRVFTRBUFSOC_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSRVFTRBUFSOC_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PSRVFTRBUFSOC_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[69].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PSRVFTRBUFSOC_SEQ_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_PSRVFTRBUFSOC_SEQ_NO(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[69].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PSRVFTRBUFSOC_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'PSRVFTRBUFSOC_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSRVFTRBUFSOC_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[69].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_SUB_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_SUB_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_SUB_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[70].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'FTR_SUB_MODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FTR_SUB_MODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[70].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'FTR_SUB_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_SUB_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_SUB_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[70].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_ADD_PARAM' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_ADD_PARAM' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_ADD_PARAM(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[71].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FTR_ADD_PARAM' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 301.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FTR_ADD_PARAM(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[71].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FTR_ADD_PARAM' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_ADD_PARAM' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_ADD_PARAM_size() throws FMLManipulationException {
        return (this.fmlBuffer[71].getCount());
    }

    /**
     * Retrieves the value of the 'FEATURE_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FEATURE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FEATURE_TYPE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[72].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FEATURE_TYPE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FEATURE_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[72].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FEATURE_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'FEATURE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FEATURE_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[72].getCount());
    }

    /**
     * Retrieves the value of the 'PSRVFTRBUFPRODUCT_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSRVFTRBUFPRODUCT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PSRVFTRBUFPRODUCT_TYPE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[73].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PSRVFTRBUFPRODUCT_TYPE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_PSRVFTRBUFPRODUCT_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[73].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PSRVFTRBUFPRODUCT_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'PSRVFTRBUFPRODUCT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSRVFTRBUFPRODUCT_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[73].getCount());
    }

    /**
     * Retrieves the value of the 'PSRVFTRBUFCAMPAIGN_SEQ' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSRVFTRBUFCAMPAIGN_SEQ' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PSRVFTRBUFCAMPAIGN_SEQ(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[74].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PSRVFTRBUFCAMPAIGN_SEQ' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_PSRVFTRBUFCAMPAIGN_SEQ(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[74].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PSRVFTRBUFCAMPAIGN_SEQ' field in the FML buffer.
     *
     * @return Number of values defined for 'PSRVFTRBUFCAMPAIGN_SEQ' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSRVFTRBUFCAMPAIGN_SEQ_size() throws FMLManipulationException {
        return (this.fmlBuffer[74].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_SPECIAL_TELNO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_SPECIAL_TELNO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_SPECIAL_TELNO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[75].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FTR_SPECIAL_TELNO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FTR_SPECIAL_TELNO(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[75].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FTR_SPECIAL_TELNO' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_SPECIAL_TELNO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_SPECIAL_TELNO_size() throws FMLManipulationException {
        return (this.fmlBuffer[75].getCount());
    }

    /**
     * Retrieves the value of the 'SWITCH_ACT_NEEDED' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'SWITCH_ACT_NEEDED' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SWITCH_ACT_NEEDED(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[76].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'SWITCH_ACT_NEEDED' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_SWITCH_ACT_NEEDED(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[76].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'SWITCH_ACT_NEEDED' field in the FML buffer.
     *
     * @return Number of values defined for 'SWITCH_ACT_NEEDED' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SWITCH_ACT_NEEDED_size() throws FMLManipulationException {
        return (this.fmlBuffer[76].getCount());
    }

    /**
     * Retrieves the value of the 'SWITCH_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'SWITCH_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SWITCH_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[77].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SWITCH_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_SWITCH_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[77].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SWITCH_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'SWITCH_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SWITCH_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[77].getCount());
    }

    /**
     * Retrieves the value of the 'MSISDN_CRITERIA' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'MSISDN_CRITERIA' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MSISDN_CRITERIA(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[78].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'MSISDN_CRITERIA' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_MSISDN_CRITERIA(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[78].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'MSISDN_CRITERIA' field in the FML buffer.
     *
     * @return Number of values defined for 'MSISDN_CRITERIA' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MSISDN_CRITERIA_size() throws FMLManipulationException {
        return (this.fmlBuffer[78].getCount());
    }

    /**
     * Retrieves the value of the 'TN_CLASS_CD' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'TN_CLASS_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_TN_CLASS_CD(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[79].getValue(nIndex));
    }

    /**
     * Sets the value of the 'TN_CLASS_CD' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_TN_CLASS_CD(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[79].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'TN_CLASS_CD' field in the FML buffer.
     *
     * @return Number of values defined for 'TN_CLASS_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_TN_CLASS_CD_size() throws FMLManipulationException {
        return (this.fmlBuffer[79].getCount());
    }

    /**
     * Retrieves the value of the 'ACTION_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'ACTION_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACTION_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[80].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'ACTION_MODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_ACTION_MODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[80].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'ACTION_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'ACTION_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACTION_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[80].getCount());
    }

    /**
     * Retrieves the value of the 'MANUAL_RC_RATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'MANUAL_RC_RATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_MANUAL_RC_RATE(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[81].getValue(nIndex));
    }

    /**
     * Sets the value of the 'MANUAL_RC_RATE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_MANUAL_RC_RATE(int nIndex, Double value) throws FMLManipulationException {
        this.fmlBuffer[81].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'MANUAL_RC_RATE' field in the FML buffer.
     *
     * @return Number of values defined for 'MANUAL_RC_RATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MANUAL_RC_RATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[81].getCount());
    }

    /**
     * Retrieves the value of the 'MANUAL_RC_EXP_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'MANUAL_RC_EXP_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MANUAL_RC_EXP_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[82].getValue(nIndex));
    }

    /**
     * Sets the value of the 'MANUAL_RC_EXP_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_MANUAL_RC_EXP_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[82].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'MANUAL_RC_EXP_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'MANUAL_RC_EXP_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MANUAL_RC_EXP_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[82].getCount());
    }

    /**
     * Retrieves the value of the 'ROW_COUNT' field in the FML buffer.
     *
     * @return Value of 'ROW_COUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ROW_COUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[83].getValue(0));
    }

    /**
     * Sets the value of the 'ROW_COUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_ROW_COUNT(Integer value) throws FMLManipulationException {
        this.fmlBuffer[83].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'ACT_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'ACT_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACT_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[84].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ACT_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_ACT_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[84].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ACT_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'ACT_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACT_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[84].getCount());
    }

    /**
     * Retrieves the value of the 'ACT_REASON' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'ACT_REASON' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACT_REASON(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[85].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ACT_REASON' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_ACT_REASON(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[85].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ACT_REASON' field in the FML buffer.
     *
     * @return Number of values defined for 'ACT_REASON' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACT_REASON_size() throws FMLManipulationException {
        return (this.fmlBuffer[85].getCount());
    }

    /**
     * Retrieves the value of the 'SUSP_RC_RATE_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'SUSP_RC_RATE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUSP_RC_RATE_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[86].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'SUSP_RC_RATE_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_SUSP_RC_RATE_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[86].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'SUSP_RC_RATE_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'SUSP_RC_RATE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SUSP_RC_RATE_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[86].getCount());
    }

    /**
     * Retrieves the value of the 'MEMO_CTN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'MEMO_CTN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MEMO_CTN(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[87].getValue(nIndex));
    }

    /**
     * Sets the value of the 'MEMO_CTN' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_MEMO_CTN(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[87].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'MEMO_CTN' field in the FML buffer.
     *
     * @return Number of values defined for 'MEMO_CTN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MEMO_CTN_size() throws FMLManipulationException {
        return (this.fmlBuffer[87].getCount());
    }

    /**
     * Retrieves the value of the 'USER_TEXT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'USER_TEXT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_USER_TEXT(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[88].getValue(nIndex));
    }

    /**
     * Sets the value of the 'USER_TEXT' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 2001.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_USER_TEXT(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[88].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'USER_TEXT' field in the FML buffer.
     *
     * @return Number of values defined for 'USER_TEXT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_USER_TEXT_size() throws FMLManipulationException {
        return (this.fmlBuffer[88].getCount());
    }

    /**
     * Retrieves the value of the 'MEMO_SOURCE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'MEMO_SOURCE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MEMO_SOURCE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[89].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'MEMO_SOURCE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_MEMO_SOURCE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[89].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'MEMO_SOURCE' field in the FML buffer.
     *
     * @return Number of values defined for 'MEMO_SOURCE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MEMO_SOURCE_size() throws FMLManipulationException {
        return (this.fmlBuffer[89].getCount());
    }

    /**
     * Retrieves the value of the 'PARAM_COUNT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'PARAM_COUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PARAM_COUNT(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[90].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PARAM_COUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_PARAM_COUNT(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[90].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PARAM_COUNT' field in the FML buffer.
     *
     * @return Number of values defined for 'PARAM_COUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PARAM_COUNT_size() throws FMLManipulationException {
        return (this.fmlBuffer[90].getCount());
    }

    /**
     * Retrieves the value of the 'P1' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'P1' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P1(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[91].getValue(nIndex));
    }

    /**
     * Sets the value of the 'P1' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_P1(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[91].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'P1' field in the FML buffer.
     *
     * @return Number of values defined for 'P1' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_P1_size() throws FMLManipulationException {
        return (this.fmlBuffer[91].getCount());
    }

    /**
     * Retrieves the value of the 'P2' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'P2' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P2(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[92].getValue(nIndex));
    }

    /**
     * Sets the value of the 'P2' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_P2(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[92].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'P2' field in the FML buffer.
     *
     * @return Number of values defined for 'P2' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_P2_size() throws FMLManipulationException {
        return (this.fmlBuffer[92].getCount());
    }

    /**
     * Retrieves the value of the 'P3' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'P3' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P3(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[93].getValue(nIndex));
    }

    /**
     * Sets the value of the 'P3' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_P3(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[93].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'P3' field in the FML buffer.
     *
     * @return Number of values defined for 'P3' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_P3_size() throws FMLManipulationException {
        return (this.fmlBuffer[93].getCount());
    }

    /**
     * Retrieves the value of the 'P4' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'P4' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P4(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[94].getValue(nIndex));
    }

    /**
     * Sets the value of the 'P4' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_P4(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[94].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'P4' field in the FML buffer.
     *
     * @return Number of values defined for 'P4' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_P4_size() throws FMLManipulationException {
        return (this.fmlBuffer[94].getCount());
    }

    /**
     * Retrieves the value of the 'P5' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'P5' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P5(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[95].getValue(nIndex));
    }

    /**
     * Sets the value of the 'P5' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_P5(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[95].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'P5' field in the FML buffer.
     *
     * @return Number of values defined for 'P5' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_P5_size() throws FMLManipulationException {
        return (this.fmlBuffer[95].getCount());
    }

    /**
     * Retrieves the value of the 'P6' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'P6' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P6(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[96].getValue(nIndex));
    }

    /**
     * Sets the value of the 'P6' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_P6(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[96].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'P6' field in the FML buffer.
     *
     * @return Number of values defined for 'P6' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_P6_size() throws FMLManipulationException {
        return (this.fmlBuffer[96].getCount());
    }

    /**
     * Retrieves the value of the 'P7' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'P7' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P7(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[97].getValue(nIndex));
    }

    /**
     * Sets the value of the 'P7' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_P7(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[97].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'P7' field in the FML buffer.
     *
     * @return Number of values defined for 'P7' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_P7_size() throws FMLManipulationException {
        return (this.fmlBuffer[97].getCount());
    }

    /**
     * Retrieves the value of the 'P8' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'P8' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P8(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[98].getValue(nIndex));
    }

    /**
     * Sets the value of the 'P8' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_P8(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[98].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'P8' field in the FML buffer.
     *
     * @return Number of values defined for 'P8' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_P8_size() throws FMLManipulationException {
        return (this.fmlBuffer[98].getCount());
    }

    /**
     * Retrieves the value of the 'P9' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'P9' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P9(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[99].getValue(nIndex));
    }

    /**
     * Sets the value of the 'P9' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_P9(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[99].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'P9' field in the FML buffer.
     *
     * @return Number of values defined for 'P9' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_P9_size() throws FMLManipulationException {
        return (this.fmlBuffer[99].getCount());
    }

    /**
     * Retrieves the value of the 'P10' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'P10' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P10(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[100].getValue(nIndex));
    }

    /**
     * Sets the value of the 'P10' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_P10(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[100].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'P10' field in the FML buffer.
     *
     * @return Number of values defined for 'P10' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_P10_size() throws FMLManipulationException {
        return (this.fmlBuffer[100].getCount());
    }

    /**
     * Retrieves the value of the 'MEMO_AMT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'MEMO_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_MEMO_AMT(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[101].getValue(nIndex));
    }

    /**
     * Sets the value of the 'MEMO_AMT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_MEMO_AMT(int nIndex, Double value) throws FMLManipulationException {
        this.fmlBuffer[101].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'MEMO_AMT' field in the FML buffer.
     *
     * @return Number of values defined for 'MEMO_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MEMO_AMT_size() throws FMLManipulationException {
        return (this.fmlBuffer[101].getCount());
    }

    /**
     * Retrieves the value of the 'RMS_ACT_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'RMS_ACT_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_RMS_ACT_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[102].getValue(nIndex));
    }

    /**
     * Sets the value of the 'RMS_ACT_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_RMS_ACT_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[102].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'RMS_ACT_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'RMS_ACT_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_RMS_ACT_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[102].getCount());
    }

    /**
     * Retrieves the value of the 'CHARGE_AMT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'CHARGE_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_CHARGE_AMT(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[103].getValue(nIndex));
    }

    /**
     * Sets the value of the 'CHARGE_AMT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_CHARGE_AMT(int nIndex, Double value) throws FMLManipulationException {
        this.fmlBuffer[103].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'CHARGE_AMT' field in the FML buffer.
     *
     * @return Number of values defined for 'CHARGE_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CHARGE_AMT_size() throws FMLManipulationException {
        return (this.fmlBuffer[103].getCount());
    }

    /**
     * Retrieves the value of the 'CHARGE_AMT_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'CHARGE_AMT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CHARGE_AMT_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[104].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'CHARGE_AMT_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_CHARGE_AMT_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[104].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'CHARGE_AMT_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'CHARGE_AMT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CHARGE_AMT_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[104].getCount());
    }

    /**
     * Retrieves the value of the 'WAIVE_REASON' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'WAIVE_REASON' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_WAIVE_REASON(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[105].getValue(nIndex));
    }

    /**
     * Sets the value of the 'WAIVE_REASON' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_WAIVE_REASON(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[105].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'WAIVE_REASON' field in the FML buffer.
     *
     * @return Number of values defined for 'WAIVE_REASON' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_WAIVE_REASON_size() throws FMLManipulationException {
        return (this.fmlBuffer[105].getCount());
    }

    /**
     * Retrieves the value of the 'WAIVE_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'WAIVE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_WAIVE_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[106].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'WAIVE_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_WAIVE_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[106].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'WAIVE_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'WAIVE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_WAIVE_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[106].getCount());
    }

    /**
     * Retrieves the value of the 'PCSFRNDFMLROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'PCSFRNDFMLROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PCSFRNDFMLROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[107].getValue(0));
    }

    /**
     * Sets the value of the 'PCSFRNDFMLROWCOUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PCSFRNDFMLROWCOUNT(Integer value) throws FMLManipulationException {
        this.fmlBuffer[107].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'ACTIONIND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'ACTIONIND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACTIONIND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[108].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'ACTIONIND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_ACTIONIND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[108].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'ACTIONIND' field in the FML buffer.
     *
     * @return Number of values defined for 'ACTIONIND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACTIONIND_size() throws FMLManipulationException {
        return (this.fmlBuffer[108].getCount());
    }

    /**
     * Retrieves the value of the 'PCSFANDFRECROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'PCSFANDFRECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PCSFANDFRECROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[109].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PCSFANDFRECROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_PCSFANDFRECROWID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[109].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PCSFANDFRECROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'PCSFANDFRECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PCSFANDFRECROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[109].getCount());
    }

    /**
     * Retrieves the value of the 'PCSFANDFRECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'PCSFANDFRECEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PCSFANDFRECEFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[110].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PCSFANDFRECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_PCSFANDFRECEFFECTIVE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[110].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PCSFANDFRECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'PCSFANDFRECEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PCSFANDFRECEFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[110].getCount());
    }

    /**
     * Retrieves the value of the 'PCSFANDFRECEXPIRATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'PCSFANDFRECEXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PCSFANDFRECEXPIRATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[111].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PCSFANDFRECEXPIRATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_PCSFANDFRECEXPIRATION_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[111].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PCSFANDFRECEXPIRATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'PCSFANDFRECEXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PCSFANDFRECEXPIRATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[111].getCount());
    }

    /**
     * Retrieves the value of the 'PERSONAL_TEL' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'PERSONAL_TEL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PERSONAL_TEL(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[112].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PERSONAL_TEL' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_PERSONAL_TEL(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[112].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PERSONAL_TEL' field in the FML buffer.
     *
     * @return Number of values defined for 'PERSONAL_TEL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PERSONAL_TEL_size() throws FMLManipulationException {
        return (this.fmlBuffer[112].getCount());
    }

    /**
     * Retrieves the value of the 'PERSONAL_TEL_TO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'PERSONAL_TEL_TO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PERSONAL_TEL_TO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[113].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PERSONAL_TEL_TO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_PERSONAL_TEL_TO(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[113].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PERSONAL_TEL_TO' field in the FML buffer.
     *
     * @return Number of values defined for 'PERSONAL_TEL_TO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PERSONAL_TEL_TO_size() throws FMLManipulationException {
        return (this.fmlBuffer[113].getCount());
    }

    /**
     * Retrieves the value of the 'FF_SOC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'FF_SOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FF_SOC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[114].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FF_SOC' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 10.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_FF_SOC(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[114].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FF_SOC' field in the FML buffer.
     *
     * @return Number of values defined for 'FF_SOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FF_SOC_size() throws FMLManipulationException {
        return (this.fmlBuffer[114].getCount());
    }

    /**
     * Retrieves the value of the 'PLAN_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'PLAN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PLAN_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[115].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PLAN_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 10.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_PLAN_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[115].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PLAN_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'PLAN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PLAN_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[115].getCount());
    }

    /**
     * Retrieves the value of the 'DISCOUNT_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'DISCOUNT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DISCOUNT_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[116].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'DISCOUNT_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_DISCOUNT_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[116].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'DISCOUNT_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'DISCOUNT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DISCOUNT_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[116].getCount());
    }

    /**
     * Retrieves the value of the 'START_HOUR' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'START_HOUR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_START_HOUR(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[117].getValue(nIndex));
    }

    /**
     * Sets the value of the 'START_HOUR' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_START_HOUR(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[117].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'START_HOUR' field in the FML buffer.
     *
     * @return Number of values defined for 'START_HOUR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_START_HOUR_size() throws FMLManipulationException {
        return (this.fmlBuffer[117].getCount());
    }

    /**
     * Retrieves the value of the 'DURATION' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'DURATION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_DURATION(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[118].getValue(nIndex));
    }

    /**
     * Sets the value of the 'DURATION' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_DURATION(int nIndex, Double value) throws FMLManipulationException {
        this.fmlBuffer[118].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'DURATION' field in the FML buffer.
     *
     * @return Number of values defined for 'DURATION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DURATION_size() throws FMLManipulationException {
        return (this.fmlBuffer[118].getCount());
    }
}