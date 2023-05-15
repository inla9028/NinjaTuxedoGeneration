/*
 * ArSvBanSvcOutput.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service.parameters;

import bea.jolt.pool.Result;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;

/**
 * @author  Ninja
 *
 * ArSvBanSvcOutput class.
 */
public class ArSvBanSvcOutput extends ServiceOutput {

    /**
     * Creates a new instance of ArSvBanSvcOutput.
     *
     * @throws FMLManipulationException
     */
    public ArSvBanSvcOutput(int nApplicationStatus) throws FMLManipulationException {
        createFmlBuffer();
        setApplicationCode(nApplicationStatus);
    }

    public ArSvBanSvcOutput() {
    }

    /**
     * Creates a new instance of ArSvBanSvcOutput.
     *
     * @param ds Output dataset from ArSvBanSvc service.
     * @throws FMLManipulationException
     */
    public ArSvBanSvcOutput(Result ds) throws FMLManipulationException {
        createFmlBuffer();
        populateFmlBuffer(ds);
    }

    /**
     * Populates the FML buffer.
     *
     * @throws FMLManipulationException
     */
    private void createFmlBuffer() throws FMLManipulationException {
        this.fmlBuffer = new FmlField[68];
        this.fmlBuffer[0] = new FmlField("GENERATION", FmlField.TYPE_INTEGER, -1, null, 0, 1);
        this.fmlBuffer[1] = new FmlField("DIRECTIVE", FmlField.TYPE_INTEGER, -1, null, 1, 1);
        this.fmlBuffer[2] = new FmlField("FIRST_DIRECTIVE", FmlField.TYPE_INTEGER, -1, null, 2, 1);
        this.fmlBuffer[3] = new FmlField("SECOND_DIRECTIVE", FmlField.TYPE_INTEGER, -1, null, 3, 1);
        this.fmlBuffer[4] = new FmlField("OPERATOR_ID", FmlField.TYPE_INTEGER, -1, null, 4, 1);
        this.fmlBuffer[5] = new FmlField("APPLICATION_ID", FmlField.TYPE_STRING, 7, null, 5, 1);
        this.fmlBuffer[6] = new FmlField("TRANSACTION_MODE", FmlField.TYPE_BYTE, -1, null, 6, 1);
        this.fmlBuffer[7] = new FmlField("RUN_DATE", FmlField.TYPE_STRING, 9, null, 7, 1);
        this.fmlBuffer[8] = new FmlField("MARKET_CODE", FmlField.TYPE_STRING, 4, null, 8, 1);
        this.fmlBuffer[9] = new FmlField("SVC_STATUS", FmlField.TYPE_BYTE, -1, null, 9, 1);
        this.fmlBuffer[10] = new FmlField("LAST_UPDATE_DATE", FmlField.TYPE_STRING, 15, null, 10, 1);
        this.fmlBuffer[11] = new FmlField("LAST_UPDATE_STAMP", FmlField.TYPE_SHORT, -1, null, 11, 1);
        this.fmlBuffer[12] = new FmlField("ENV_CODE", FmlField.TYPE_STRING, 11, null, 12, 1);
        this.fmlBuffer[13] = new FmlField("SESSION_ID", FmlField.TYPE_INTEGER, -1, null, 13, 1);
        this.fmlBuffer[14] = new FmlField("ONLINE_TRX_NO", FmlField.TYPE_INTEGER, -1, null, 14, 1);
        this.fmlBuffer[15] = new FmlField("GROUP_TRX_ID", FmlField.TYPE_INTEGER, -1, null, 15, 1);
        this.fmlBuffer[16] = new FmlField("ROWCOUNT", FmlField.TYPE_INTEGER, -1, null, 16, 1);
        this.fmlBuffer[17] = new FmlField("PSRVAGRBUFROWID", FmlField.TYPE_STRING, 19, null, 17, 50);
        this.fmlBuffer[18] = new FmlField("SOC", FmlField.TYPE_STRING, 10, null, 18, 50);
        this.fmlBuffer[19] = new FmlField("SOC_EFFECTIVE_DATE", FmlField.TYPE_STRING, 9, null, 19, 50);
        this.fmlBuffer[20] = new FmlField("COMMITMENT_END_DATE", FmlField.TYPE_STRING, 9, null, 20, 50);
        this.fmlBuffer[21] = new FmlField("SERVICE_TYPE", FmlField.TYPE_BYTE, -1, null, 21, 50);
        this.fmlBuffer[22] = new FmlField("EFFECTIVE_DATE", FmlField.TYPE_STRING, 9, null, 22, 50);
        this.fmlBuffer[23] = new FmlField("EXPIRATION_DATE", FmlField.TYPE_STRING, 9, null, 23, 50);
        this.fmlBuffer[24] = new FmlField("SOC_LEVEL_CODE", FmlField.TYPE_BYTE, -1, null, 24, 50);
        this.fmlBuffer[25] = new FmlField("DEALER_CODE", FmlField.TYPE_STRING, 6, null, 25, 50);
        this.fmlBuffer[26] = new FmlField("SALES_AGENT", FmlField.TYPE_STRING, 6, null, 26, 50);
        this.fmlBuffer[27] = new FmlField("SRV_MODE", FmlField.TYPE_BYTE, -1, null, 27, 50);
        this.fmlBuffer[28] = new FmlField("SRV_SUB_MODE", FmlField.TYPE_BYTE, -1, null, 28, 50);
        this.fmlBuffer[29] = new FmlField("SOC_SEQ_NO", FmlField.TYPE_INTEGER, -1, null, 29, 50);
        this.fmlBuffer[30] = new FmlField("SRV_TRX_ID", FmlField.TYPE_INTEGER, -1, null, 30, 50);
        this.fmlBuffer[31] = new FmlField("CAMPAIGN_SEQ", FmlField.TYPE_INTEGER, -1, null, 31, 50);
        this.fmlBuffer[32] = new FmlField("CAMPAIGN", FmlField.TYPE_STRING, 10, null, 32, 50);
        this.fmlBuffer[33] = new FmlField("COMMIT_ORIG_NO_MONTH", FmlField.TYPE_SHORT, -1, null, 33, 50);
        this.fmlBuffer[34] = new FmlField("PRODUCT_TYPE", FmlField.TYPE_STRING, 4, null, 34, 50);
        this.fmlBuffer[35] = new FmlField("LOAN_VER_NO", FmlField.TYPE_INTEGER, -1, null, 35, 50);
        this.fmlBuffer[36] = new FmlField("LOAN_SEQ_NO", FmlField.TYPE_INTEGER, -1, null, 36, 50);
        this.fmlBuffer[37] = new FmlField("SOC_ACTV_FEE", FmlField.TYPE_DOUBLE, -1, null, 37, 50);
        this.fmlBuffer[38] = new FmlField("PROMOTIONAL_SOC", FmlField.TYPE_STRING, 10, null, 38, 50);
        this.fmlBuffer[39] = new FmlField("REASON_CODE", FmlField.TYPE_STRING, 5, null, 39, 50);
        this.fmlBuffer[40] = new FmlField("SOC_START_RC_DATE", FmlField.TYPE_STRING, 9, null, 40, 50);
        this.fmlBuffer[41] = new FmlField("RC_DATE_COPY_IND", FmlField.TYPE_BYTE, -1, null, 41, 50);
        this.fmlBuffer[42] = new FmlField("PSRVFTRBUFROWCOUNT", FmlField.TYPE_INTEGER, -1, null, 42, 1);
        this.fmlBuffer[43] = new FmlField("PSRVFTRBUFROWID", FmlField.TYPE_STRING, 19, null, 43, 200);
        this.fmlBuffer[44] = new FmlField("PSRVFTRBUFSOC", FmlField.TYPE_STRING, 10, null, 44, 200);
        this.fmlBuffer[45] = new FmlField("PSRVFTRBUFSOC_EFFECTIVE_DATE", FmlField.TYPE_STRING, 9, null, 45, 200);
        this.fmlBuffer[46] = new FmlField("FEATURE_CODE", FmlField.TYPE_STRING, 7, null, 46, 200);
        this.fmlBuffer[47] = new FmlField("MPS_FTR_CODE", FmlField.TYPE_STRING, 7, null, 47, 200);
        this.fmlBuffer[48] = new FmlField("FTR_EFFECTIVE_DATE", FmlField.TYPE_STRING, 9, null, 48, 200);
        this.fmlBuffer[49] = new FmlField("FTR_EXPIRATION_DATE", FmlField.TYPE_STRING, 9, null, 49, 200);
        this.fmlBuffer[50] = new FmlField("FTR_EFF_RSN_CODE", FmlField.TYPE_BYTE, -1, null, 50, 200);
        this.fmlBuffer[51] = new FmlField("FTR_EXP_RSN_CODE", FmlField.TYPE_BYTE, -1, null, 51, 200);
        this.fmlBuffer[52] = new FmlField("SERVICE_FTR_SEQ_NO", FmlField.TYPE_INTEGER, -1, null, 52, 200);
        this.fmlBuffer[53] = new FmlField("FTR_MODE", FmlField.TYPE_BYTE, -1, null, 53, 200);
        this.fmlBuffer[54] = new FmlField("PSRVFTRBUFSOC_SEQ_NO", FmlField.TYPE_INTEGER, -1, null, 54, 200);
        this.fmlBuffer[55] = new FmlField("FTR_SUB_MODE", FmlField.TYPE_BYTE, -1, null, 55, 200);
        this.fmlBuffer[56] = new FmlField("FTR_ADD_PARAM", FmlField.TYPE_STRING, 301, null, 56, 200);
        this.fmlBuffer[57] = new FmlField("FEATURE_TYPE", FmlField.TYPE_STRING, 4, null, 57, 200);
        this.fmlBuffer[58] = new FmlField("PSRVFTRBUFPRODUCT_TYPE", FmlField.TYPE_STRING, 4, null, 58, 200);
        this.fmlBuffer[59] = new FmlField("PSRVFTRBUFCAMPAIGN_SEQ", FmlField.TYPE_INTEGER, -1, null, 59, 200);
        this.fmlBuffer[60] = new FmlField("FTR_SPECIAL_TELNO", FmlField.TYPE_STRING, 21, null, 60, 200);
        this.fmlBuffer[61] = new FmlField("SWITCH_ACT_NEEDED", FmlField.TYPE_BYTE, -1, null, 61, 200);
        this.fmlBuffer[62] = new FmlField("SWITCH_CODE", FmlField.TYPE_STRING, 7, null, 62, 200);
        this.fmlBuffer[63] = new FmlField("MSISDN_CRITERIA", FmlField.TYPE_BYTE, -1, null, 63, 200);
        this.fmlBuffer[64] = new FmlField("TN_CLASS_CD", FmlField.TYPE_STRING, 4, null, 64, 200);
        this.fmlBuffer[65] = new FmlField("ACTION_MODE", FmlField.TYPE_BYTE, -1, null, 65, 200);
        this.fmlBuffer[66] = new FmlField("MANUAL_RC_RATE", FmlField.TYPE_DOUBLE, -1, null, 66, 200);
        this.fmlBuffer[67] = new FmlField("MANUAL_RC_EXP_DATE", FmlField.TYPE_STRING, 9, null, 67, 200);
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
     * Retrieves the value of the 'DIRECTIVE' field in the FML buffer.
     *
     * @return Value of 'DIRECTIVE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_DIRECTIVE() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[1].getValue(0));
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
     * Retrieves the value of the 'SECOND_DIRECTIVE' field in the FML buffer.
     *
     * @return Value of 'SECOND_DIRECTIVE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_SECOND_DIRECTIVE() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[3].getValue(0));
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
     * Retrieves the value of the 'APPLICATION_ID' field in the FML buffer.
     *
     * @return Value of 'APPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_APPLICATION_ID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[5].getValue(0));
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
     * Retrieves the value of the 'RUN_DATE' field in the FML buffer.
     *
     * @return Value of 'RUN_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_RUN_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[7].getValue(0));
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
     * Retrieves the value of the 'SVC_STATUS' field in the FML buffer.
     *
     * @return Value of 'SVC_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SVC_STATUS() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[9].getValue(0)));
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
     * Retrieves the value of the 'LAST_UPDATE_STAMP' field in the FML buffer.
     *
     * @return Value of 'LAST_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LAST_UPDATE_STAMP() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[11].getValue(0)));
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
     * Retrieves the value of the 'SESSION_ID' field in the FML buffer.
     *
     * @return Value of 'SESSION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_SESSION_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[13].getValue(0));
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
     * Retrieves the value of the 'GROUP_TRX_ID' field in the FML buffer.
     *
     * @return Value of 'GROUP_TRX_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_GROUP_TRX_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[15].getValue(0));
    }

    /**
     * Retrieves the value of the 'ROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'ROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[16].getValue(0));
    }

    /**
     * Retrieves the value of the 'PSRVAGRBUFROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PSRVAGRBUFROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PSRVAGRBUFROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[17].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'PSRVAGRBUFROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'PSRVAGRBUFROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSRVAGRBUFROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[17].getCount());
    }

    /**
     * Retrieves the value of the 'SOC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SOC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[18].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'SOC' field in the FML buffer.
     *
     * @return Number of values defined for 'SOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SOC_size() throws FMLManipulationException {
        return (this.fmlBuffer[18].getCount());
    }

    /**
     * Retrieves the value of the 'SOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SOC_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SOC_EFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[19].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'SOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'SOC_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SOC_EFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[19].getCount());
    }

    /**
     * Retrieves the value of the 'COMMITMENT_END_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'COMMITMENT_END_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COMMITMENT_END_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[20].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'COMMITMENT_END_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'COMMITMENT_END_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COMMITMENT_END_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[20].getCount());
    }

    /**
     * Retrieves the value of the 'SERVICE_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SERVICE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SERVICE_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[21].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'SERVICE_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'SERVICE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SERVICE_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[21].getCount());
    }

    /**
     * Retrieves the value of the 'EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[22].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'EFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_EFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[22].getCount());
    }

    /**
     * Retrieves the value of the 'EXPIRATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EXPIRATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[23].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'EXPIRATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_EXPIRATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[23].getCount());
    }

    /**
     * Retrieves the value of the 'SOC_LEVEL_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SOC_LEVEL_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SOC_LEVEL_CODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[24].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'SOC_LEVEL_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'SOC_LEVEL_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SOC_LEVEL_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[24].getCount());
    }

    /**
     * Retrieves the value of the 'DEALER_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'DEALER_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DEALER_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[25].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'DEALER_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'DEALER_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DEALER_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[25].getCount());
    }

    /**
     * Retrieves the value of the 'SALES_AGENT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SALES_AGENT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SALES_AGENT(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[26].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'SALES_AGENT' field in the FML buffer.
     *
     * @return Number of values defined for 'SALES_AGENT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SALES_AGENT_size() throws FMLManipulationException {
        return (this.fmlBuffer[26].getCount());
    }

    /**
     * Retrieves the value of the 'SRV_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SRV_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SRV_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[27].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'SRV_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'SRV_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SRV_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[27].getCount());
    }

    /**
     * Retrieves the value of the 'SRV_SUB_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SRV_SUB_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SRV_SUB_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[28].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'SRV_SUB_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'SRV_SUB_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SRV_SUB_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[28].getCount());
    }

    /**
     * Retrieves the value of the 'SOC_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SOC_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_SOC_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[29].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'SOC_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'SOC_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SOC_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[29].getCount());
    }

    /**
     * Retrieves the value of the 'SRV_TRX_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SRV_TRX_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_SRV_TRX_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[30].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'SRV_TRX_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'SRV_TRX_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SRV_TRX_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[30].getCount());
    }

    /**
     * Retrieves the value of the 'CAMPAIGN_SEQ' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'CAMPAIGN_SEQ' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CAMPAIGN_SEQ(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[31].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'CAMPAIGN_SEQ' field in the FML buffer.
     *
     * @return Number of values defined for 'CAMPAIGN_SEQ' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CAMPAIGN_SEQ_size() throws FMLManipulationException {
        return (this.fmlBuffer[31].getCount());
    }

    /**
     * Retrieves the value of the 'CAMPAIGN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'CAMPAIGN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CAMPAIGN(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[32].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'CAMPAIGN' field in the FML buffer.
     *
     * @return Number of values defined for 'CAMPAIGN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CAMPAIGN_size() throws FMLManipulationException {
        return (this.fmlBuffer[32].getCount());
    }

    /**
     * Retrieves the value of the 'COMMIT_ORIG_NO_MONTH' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'COMMIT_ORIG_NO_MONTH' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_COMMIT_ORIG_NO_MONTH(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[33].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'COMMIT_ORIG_NO_MONTH' field in the FML buffer.
     *
     * @return Number of values defined for 'COMMIT_ORIG_NO_MONTH' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COMMIT_ORIG_NO_MONTH_size() throws FMLManipulationException {
        return (this.fmlBuffer[33].getCount());
    }

    /**
     * Retrieves the value of the 'PRODUCT_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PRODUCT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PRODUCT_TYPE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[34].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'PRODUCT_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'PRODUCT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PRODUCT_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[34].getCount());
    }

    /**
     * Retrieves the value of the 'LOAN_VER_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'LOAN_VER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LOAN_VER_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[35].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'LOAN_VER_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'LOAN_VER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LOAN_VER_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[35].getCount());
    }

    /**
     * Retrieves the value of the 'LOAN_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'LOAN_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LOAN_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[36].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'LOAN_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'LOAN_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LOAN_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[36].getCount());
    }

    /**
     * Retrieves the value of the 'SOC_ACTV_FEE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SOC_ACTV_FEE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_SOC_ACTV_FEE(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[37].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'SOC_ACTV_FEE' field in the FML buffer.
     *
     * @return Number of values defined for 'SOC_ACTV_FEE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SOC_ACTV_FEE_size() throws FMLManipulationException {
        return (this.fmlBuffer[37].getCount());
    }

    /**
     * Retrieves the value of the 'PROMOTIONAL_SOC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PROMOTIONAL_SOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PROMOTIONAL_SOC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[38].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'PROMOTIONAL_SOC' field in the FML buffer.
     *
     * @return Number of values defined for 'PROMOTIONAL_SOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PROMOTIONAL_SOC_size() throws FMLManipulationException {
        return (this.fmlBuffer[38].getCount());
    }

    /**
     * Retrieves the value of the 'REASON_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'REASON_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_REASON_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[39].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'REASON_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'REASON_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_REASON_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[39].getCount());
    }

    /**
     * Retrieves the value of the 'SOC_START_RC_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SOC_START_RC_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SOC_START_RC_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[40].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'SOC_START_RC_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'SOC_START_RC_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SOC_START_RC_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[40].getCount());
    }

    /**
     * Retrieves the value of the 'RC_DATE_COPY_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'RC_DATE_COPY_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_RC_DATE_COPY_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[41].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'RC_DATE_COPY_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'RC_DATE_COPY_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_RC_DATE_COPY_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[41].getCount());
    }

    /**
     * Retrieves the value of the 'PSRVFTRBUFROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'PSRVFTRBUFROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PSRVFTRBUFROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[42].getValue(0));
    }

    /**
     * Retrieves the value of the 'PSRVFTRBUFROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSRVFTRBUFROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PSRVFTRBUFROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[43].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'PSRVFTRBUFROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'PSRVFTRBUFROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSRVFTRBUFROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[43].getCount());
    }

    /**
     * Retrieves the value of the 'PSRVFTRBUFSOC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSRVFTRBUFSOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PSRVFTRBUFSOC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[44].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'PSRVFTRBUFSOC' field in the FML buffer.
     *
     * @return Number of values defined for 'PSRVFTRBUFSOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSRVFTRBUFSOC_size() throws FMLManipulationException {
        return (this.fmlBuffer[44].getCount());
    }

    /**
     * Retrieves the value of the 'PSRVFTRBUFSOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSRVFTRBUFSOC_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PSRVFTRBUFSOC_EFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[45].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'PSRVFTRBUFSOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'PSRVFTRBUFSOC_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSRVFTRBUFSOC_EFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[45].getCount());
    }

    /**
     * Retrieves the value of the 'FEATURE_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FEATURE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FEATURE_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[46].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'FEATURE_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FEATURE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FEATURE_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[46].getCount());
    }

    /**
     * Retrieves the value of the 'MPS_FTR_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'MPS_FTR_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MPS_FTR_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[47].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'MPS_FTR_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'MPS_FTR_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MPS_FTR_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[47].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_EFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[48].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'FTR_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_EFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[48].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_EXPIRATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_EXPIRATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[49].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'FTR_EXPIRATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_EXPIRATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[49].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_EFF_RSN_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_EFF_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_EFF_RSN_CODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[50].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'FTR_EFF_RSN_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_EFF_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_EFF_RSN_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[50].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_EXP_RSN_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_EXP_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_EXP_RSN_CODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[51].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'FTR_EXP_RSN_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_EXP_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_EXP_RSN_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[51].getCount());
    }

    /**
     * Retrieves the value of the 'SERVICE_FTR_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'SERVICE_FTR_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_SERVICE_FTR_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[52].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'SERVICE_FTR_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'SERVICE_FTR_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SERVICE_FTR_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[52].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[53].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'FTR_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[53].getCount());
    }

    /**
     * Retrieves the value of the 'PSRVFTRBUFSOC_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSRVFTRBUFSOC_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PSRVFTRBUFSOC_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[54].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'PSRVFTRBUFSOC_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'PSRVFTRBUFSOC_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSRVFTRBUFSOC_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[54].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_SUB_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_SUB_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_SUB_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[55].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'FTR_SUB_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_SUB_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_SUB_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[55].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_ADD_PARAM' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_ADD_PARAM' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_ADD_PARAM(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[56].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'FTR_ADD_PARAM' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_ADD_PARAM' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_ADD_PARAM_size() throws FMLManipulationException {
        return (this.fmlBuffer[56].getCount());
    }

    /**
     * Retrieves the value of the 'FEATURE_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FEATURE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FEATURE_TYPE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[57].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'FEATURE_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'FEATURE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FEATURE_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[57].getCount());
    }

    /**
     * Retrieves the value of the 'PSRVFTRBUFPRODUCT_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSRVFTRBUFPRODUCT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PSRVFTRBUFPRODUCT_TYPE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[58].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'PSRVFTRBUFPRODUCT_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'PSRVFTRBUFPRODUCT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSRVFTRBUFPRODUCT_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[58].getCount());
    }

    /**
     * Retrieves the value of the 'PSRVFTRBUFCAMPAIGN_SEQ' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSRVFTRBUFCAMPAIGN_SEQ' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PSRVFTRBUFCAMPAIGN_SEQ(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[59].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'PSRVFTRBUFCAMPAIGN_SEQ' field in the FML buffer.
     *
     * @return Number of values defined for 'PSRVFTRBUFCAMPAIGN_SEQ' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSRVFTRBUFCAMPAIGN_SEQ_size() throws FMLManipulationException {
        return (this.fmlBuffer[59].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_SPECIAL_TELNO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_SPECIAL_TELNO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_SPECIAL_TELNO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[60].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'FTR_SPECIAL_TELNO' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_SPECIAL_TELNO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_SPECIAL_TELNO_size() throws FMLManipulationException {
        return (this.fmlBuffer[60].getCount());
    }

    /**
     * Retrieves the value of the 'SWITCH_ACT_NEEDED' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'SWITCH_ACT_NEEDED' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SWITCH_ACT_NEEDED(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[61].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'SWITCH_ACT_NEEDED' field in the FML buffer.
     *
     * @return Number of values defined for 'SWITCH_ACT_NEEDED' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SWITCH_ACT_NEEDED_size() throws FMLManipulationException {
        return (this.fmlBuffer[61].getCount());
    }

    /**
     * Retrieves the value of the 'SWITCH_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'SWITCH_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SWITCH_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[62].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'SWITCH_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'SWITCH_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SWITCH_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[62].getCount());
    }

    /**
     * Retrieves the value of the 'MSISDN_CRITERIA' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'MSISDN_CRITERIA' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MSISDN_CRITERIA(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[63].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'MSISDN_CRITERIA' field in the FML buffer.
     *
     * @return Number of values defined for 'MSISDN_CRITERIA' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MSISDN_CRITERIA_size() throws FMLManipulationException {
        return (this.fmlBuffer[63].getCount());
    }

    /**
     * Retrieves the value of the 'TN_CLASS_CD' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'TN_CLASS_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_TN_CLASS_CD(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[64].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'TN_CLASS_CD' field in the FML buffer.
     *
     * @return Number of values defined for 'TN_CLASS_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_TN_CLASS_CD_size() throws FMLManipulationException {
        return (this.fmlBuffer[64].getCount());
    }

    /**
     * Retrieves the value of the 'ACTION_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'ACTION_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACTION_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[65].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'ACTION_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'ACTION_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACTION_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[65].getCount());
    }

    /**
     * Retrieves the value of the 'MANUAL_RC_RATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'MANUAL_RC_RATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_MANUAL_RC_RATE(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[66].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'MANUAL_RC_RATE' field in the FML buffer.
     *
     * @return Number of values defined for 'MANUAL_RC_RATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MANUAL_RC_RATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[66].getCount());
    }

    /**
     * Retrieves the value of the 'MANUAL_RC_EXP_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'MANUAL_RC_EXP_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MANUAL_RC_EXP_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[67].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'MANUAL_RC_EXP_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'MANUAL_RC_EXP_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MANUAL_RC_EXP_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[67].getCount());
    }
}