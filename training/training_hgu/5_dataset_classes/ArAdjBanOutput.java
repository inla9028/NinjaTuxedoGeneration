package no.netcom.ninja.core.system.tuxedo.service.parameters;

import bea.jolt.pool.Result;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;

/**
 * @author  Ninja - Generated by Ninja tools
 */
public class ArAdjBanOutput extends ServiceOutput {

    /**
     * Creates a new instance of ArAdjBanOutput.
     *
     * @throws FMLManipulationException
     */
    public ArAdjBanOutput(int nApplicationStatus) throws FMLManipulationException {
        createFmlBuffer();
        setApplicationCode(nApplicationStatus);
    }

    public ArAdjBanOutput() {
    }

    /**
     * Creates a new instance of ArAdjBanOutput.
     *
     * @param ds Output dataset from ArAdjBan service.
     * @throws FMLManipulationException
     */
    public ArAdjBanOutput(Result ds) throws FMLManipulationException {
        createFmlBuffer();
        populateFmlBuffer(ds);
    }

    /**
     * Populates the FML buffer.
     *
     * @throws FMLManipulationException
     */
    private void createFmlBuffer() throws FMLManipulationException {
        this.fmlBuffer = new FmlField[84];
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
        this.fmlBuffer[16] = new FmlField("ROWID", FmlField.TYPE_STRING, 19, null, 16, 1);
        this.fmlBuffer[17] = new FmlField("BAN", FmlField.TYPE_INTEGER, -1, null, 17, 1);
        this.fmlBuffer[18] = new FmlField("PARTITION_ROOT_BAN", FmlField.TYPE_INTEGER, -1, null, 18, 1);
        this.fmlBuffer[19] = new FmlField("ADJ_REASON_CODE", FmlField.TYPE_STRING, 7, null, 19, 1);
        this.fmlBuffer[20] = new FmlField("BALANCE_IMPACT_CODE", FmlField.TYPE_BYTE, -1, null, 20, 1);
        this.fmlBuffer[21] = new FmlField("EFFECTIVE_DATE", FmlField.TYPE_STRING, 9, null, 21, 1);
        this.fmlBuffer[22] = new FmlField("SOURCE_APPL_CD", FmlField.TYPE_BYTE, -1, null, 22, 1);
        this.fmlBuffer[23] = new FmlField("ADJ_LEVEL_CODE", FmlField.TYPE_BYTE, -1, null, 23, 1);
        this.fmlBuffer[24] = new FmlField("INV_SEQ_NO", FmlField.TYPE_INTEGER, -1, null, 24, 1);
        this.fmlBuffer[25] = new FmlField("SUBSCRIBER_NO", FmlField.TYPE_STRING, 21, null, 25, 1);
        this.fmlBuffer[26] = new FmlField("CHARGE_ID", FmlField.TYPE_INTEGER, -1, null, 26, 1);
        this.fmlBuffer[27] = new FmlField("ADJUSTMENT_AMOUNT", FmlField.TYPE_DOUBLE, -1, null, 27, 1);
        this.fmlBuffer[28] = new FmlField("TAX_CODE", FmlField.TYPE_BYTE, -1, null, 28, 1);
        this.fmlBuffer[29] = new FmlField("ADJ_PRIOD_START_DATE", FmlField.TYPE_STRING, 9, null, 29, 1);
        this.fmlBuffer[30] = new FmlField("ADJ_PRIOD_END_DATE", FmlField.TYPE_STRING, 9, null, 30, 1);
        this.fmlBuffer[31] = new FmlField("USER_COMMENT", FmlField.TYPE_STRING, 501, null, 31, 1);
        this.fmlBuffer[32] = new FmlField("MEMO_ID", FmlField.TYPE_INTEGER, -1, null, 32, 1);
        this.fmlBuffer[33] = new FmlField("MESSAGE_EXIST_IND", FmlField.TYPE_BYTE, -1, null, 33, 1);
        this.fmlBuffer[34] = new FmlField("SOURCE_BILL_SEQ_NO", FmlField.TYPE_SHORT, -1, null, 34, 1);
        this.fmlBuffer[35] = new FmlField("CHANNEL_SEIZURE_DATE", FmlField.TYPE_STRING, 15, null, 35, 1);
        this.fmlBuffer[36] = new FmlField("MESSAGE_SWITCH_ID", FmlField.TYPE_STRING, 8, null, 36, 1);
        this.fmlBuffer[37] = new FmlField("MESSAGE_IDENTIFIER", FmlField.TYPE_STRING, 25, null, 37, 1);
        this.fmlBuffer[38] = new FmlField("BL_IGNORE_IND", FmlField.TYPE_BYTE, -1, null, 38, 1);
        this.fmlBuffer[39] = new FmlField("RMS_INV_STORE_ID", FmlField.TYPE_STRING, 5, null, 39, 1);
        this.fmlBuffer[40] = new FmlField("RMS_INV_ACTV_TYPE", FmlField.TYPE_BYTE, -1, null, 40, 1);
        this.fmlBuffer[41] = new FmlField("RMS_INV_ID", FmlField.TYPE_INTEGER, -1, null, 41, 1);
        this.fmlBuffer[42] = new FmlField("DISCOUNT_PCT_L", FmlField.TYPE_INTEGER, -1, null, 42, 1);
        this.fmlBuffer[43] = new FmlField("SOC", FmlField.TYPE_STRING, 10, null, 43, 1);
        this.fmlBuffer[44] = new FmlField("FTR_REVENUE_CODE", FmlField.TYPE_STRING, 4, null, 44, 1);
        this.fmlBuffer[45] = new FmlField("FEATURE_CODE", FmlField.TYPE_STRING, 7, null, 45, 1);
        this.fmlBuffer[46] = new FmlField("SUB_MARKET_CD", FmlField.TYPE_STRING, 4, null, 46, 1);
        this.fmlBuffer[47] = new FmlField("SERVICE_FTR_SEQ_NO", FmlField.TYPE_INTEGER, -1, null, 47, 1);
        this.fmlBuffer[48] = new FmlField("TAX_ADJUSTMENT_IND", FmlField.TYPE_BYTE, -1, null, 48, 1);
        this.fmlBuffer[49] = new FmlField("ORG_CODE", FmlField.TYPE_STRING, 10, null, 49, 1);
        this.fmlBuffer[50] = new FmlField("VOUCHER_NUM", FmlField.TYPE_STRING, 14, null, 50, 1);
        this.fmlBuffer[51] = new FmlField("DESIGNATED_INV", FmlField.TYPE_STRING, 14, null, 51, 1);
        this.fmlBuffer[52] = new FmlField("ACTV_CODE", FmlField.TYPE_STRING, 5, null, 52, 1);
        this.fmlBuffer[53] = new FmlField("BILL_RELEVANCE_IND", FmlField.TYPE_BYTE, -1, null, 53, 1);
        this.fmlBuffer[54] = new FmlField("ENT_SEQ_NO", FmlField.TYPE_INTEGER, -1, null, 54, 1);
        this.fmlBuffer[55] = new FmlField("ACTV_SEQ_NO", FmlField.TYPE_SHORT, -1, null, 55, 1);
        this.fmlBuffer[56] = new FmlField("CRD_DBT_IND", FmlField.TYPE_BYTE, -1, null, 56, 1);
        this.fmlBuffer[57] = new FmlField("PARADJINFOEFFECTIVE_DATE", FmlField.TYPE_STRING, 9, null, 57, 1);
        this.fmlBuffer[58] = new FmlField("CRD_DBT_CODE", FmlField.TYPE_STRING, 7, null, 58, 1);
        this.fmlBuffer[59] = new FmlField("PARADJINFOFEATURE_CODE", FmlField.TYPE_STRING, 7, null, 59, 1);
        this.fmlBuffer[60] = new FmlField("BILL_FIXED_TEXT", FmlField.TYPE_STRING, 61, null, 60, 1);
        this.fmlBuffer[61] = new FmlField("USER_TEXT", FmlField.TYPE_STRING, 501, null, 61, 1);
        this.fmlBuffer[62] = new FmlField("PARADJINFOSUBSCRIBER_NO", FmlField.TYPE_STRING, 21, null, 62, 1);
        this.fmlBuffer[63] = new FmlField("PARADJINFOSOC", FmlField.TYPE_STRING, 10, null, 63, 1);
        this.fmlBuffer[64] = new FmlField("PARADJINFOFTR_REVENUE_CODE", FmlField.TYPE_STRING, 4, null, 64, 1);
        this.fmlBuffer[65] = new FmlField("PRIOD_CVRG_ST_DATE", FmlField.TYPE_STRING, 9, null, 65, 1);
        this.fmlBuffer[66] = new FmlField("PRIOD_CVRG_ND_DATE", FmlField.TYPE_STRING, 9, null, 66, 1);
        this.fmlBuffer[67] = new FmlField("CREATION_DATE", FmlField.TYPE_STRING, 9, null, 67, 1);
        this.fmlBuffer[68] = new FmlField("CRD_DBT_SOURCE_CODE", FmlField.TYPE_BYTE, -1, null, 68, 1);
        this.fmlBuffer[69] = new FmlField("ACTV_AMT", FmlField.TYPE_DOUBLE, -1, null, 69, 1);
        this.fmlBuffer[70] = new FmlField("APPLIED_CREDIT_AMT", FmlField.TYPE_DOUBLE, -1, null, 70, 1);
        this.fmlBuffer[71] = new FmlField("BALANCE_IMPACT", FmlField.TYPE_BYTE, -1, null, 71, 1);
        this.fmlBuffer[72] = new FmlField("BILL_CLOSE_DATE", FmlField.TYPE_STRING, 9, null, 72, 1);
        this.fmlBuffer[73] = new FmlField("CHG_MEMO_ID", FmlField.TYPE_INTEGER, -1, null, 73, 1);
        this.fmlBuffer[74] = new FmlField("ADJ_MEMO_ID", FmlField.TYPE_INTEGER, -1, null, 74, 1);
        this.fmlBuffer[75] = new FmlField("ADJ_CHARGE_ID", FmlField.TYPE_INTEGER, -1, null, 75, 1);
        this.fmlBuffer[76] = new FmlField("PARADJINFOBL_IGNORE_IND", FmlField.TYPE_BYTE, -1, null, 76, 1);
        this.fmlBuffer[77] = new FmlField("ADJ_REVERSED", FmlField.TYPE_BYTE, -1, null, 77, 1);
        this.fmlBuffer[78] = new FmlField("NO_OF_INSTALL_FROM", FmlField.TYPE_SHORT, -1, null, 78, 1);
        this.fmlBuffer[79] = new FmlField("NO_OF_INSTALL_TO", FmlField.TYPE_SHORT, -1, null, 79, 1);
        this.fmlBuffer[80] = new FmlField("TOTAL_NO_OF_INSTALL", FmlField.TYPE_SHORT, -1, null, 80, 1);
        this.fmlBuffer[81] = new FmlField("PARADJINFORMS_INV_ACTV_TYPE", FmlField.TYPE_BYTE, -1, null, 81, 1);
        this.fmlBuffer[82] = new FmlField("PARADJINFORMS_INV_STORE_ID", FmlField.TYPE_STRING, 5, null, 82, 1);
        this.fmlBuffer[83] = new FmlField("PARADJINFORMS_INV_ID", FmlField.TYPE_INTEGER, -1, null, 83, 1);
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
     * Retrieves the value of the 'ROWID' field in the FML buffer.
     *
     * @return Value of 'ROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ROWID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[16].getValue(0));
    }

    /**
     * Retrieves the value of the 'BAN' field in the FML buffer.
     *
     * @return Value of 'BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BAN() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[17].getValue(0));
    }

    /**
     * Retrieves the value of the 'PARTITION_ROOT_BAN' field in the FML buffer.
     *
     * @return Value of 'PARTITION_ROOT_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PARTITION_ROOT_BAN() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[18].getValue(0));
    }

    /**
     * Retrieves the value of the 'ADJ_REASON_CODE' field in the FML buffer.
     *
     * @return Value of 'ADJ_REASON_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADJ_REASON_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[19].getValue(0));
    }

    /**
     * Retrieves the value of the 'BALANCE_IMPACT_CODE' field in the FML buffer.
     *
     * @return Value of 'BALANCE_IMPACT_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BALANCE_IMPACT_CODE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[20].getValue(0)));
    }

    /**
     * Retrieves the value of the 'EFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Value of 'EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EFFECTIVE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[21].getValue(0));
    }

    /**
     * Retrieves the value of the 'SOURCE_APPL_CD' field in the FML buffer.
     *
     * @return Value of 'SOURCE_APPL_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SOURCE_APPL_CD() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[22].getValue(0)));
    }

    /**
     * Retrieves the value of the 'ADJ_LEVEL_CODE' field in the FML buffer.
     *
     * @return Value of 'ADJ_LEVEL_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADJ_LEVEL_CODE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[23].getValue(0)));
    }

    /**
     * Retrieves the value of the 'INV_SEQ_NO' field in the FML buffer.
     *
     * @return Value of 'INV_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_INV_SEQ_NO() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[24].getValue(0));
    }

    /**
     * Retrieves the value of the 'SUBSCRIBER_NO' field in the FML buffer.
     *
     * @return Value of 'SUBSCRIBER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUBSCRIBER_NO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[25].getValue(0));
    }

    /**
     * Retrieves the value of the 'CHARGE_ID' field in the FML buffer.
     *
     * @return Value of 'CHARGE_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CHARGE_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[26].getValue(0));
    }

    /**
     * Retrieves the value of the 'ADJUSTMENT_AMOUNT' field in the FML buffer.
     *
     * @return Value of 'ADJUSTMENT_AMOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_ADJUSTMENT_AMOUNT() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[27].getValue(0));
    }

    /**
     * Retrieves the value of the 'TAX_CODE' field in the FML buffer.
     *
     * @return Value of 'TAX_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_TAX_CODE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[28].getValue(0)));
    }

    /**
     * Retrieves the value of the 'ADJ_PRIOD_START_DATE' field in the FML buffer.
     *
     * @return Value of 'ADJ_PRIOD_START_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADJ_PRIOD_START_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[29].getValue(0));
    }

    /**
     * Retrieves the value of the 'ADJ_PRIOD_END_DATE' field in the FML buffer.
     *
     * @return Value of 'ADJ_PRIOD_END_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADJ_PRIOD_END_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[30].getValue(0));
    }

    /**
     * Retrieves the value of the 'USER_COMMENT' field in the FML buffer.
     *
     * @return Value of 'USER_COMMENT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_USER_COMMENT() throws FMLManipulationException {
        return ((String) this.fmlBuffer[31].getValue(0));
    }

    /**
     * Retrieves the value of the 'MEMO_ID' field in the FML buffer.
     *
     * @return Value of 'MEMO_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_MEMO_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[32].getValue(0));
    }

    /**
     * Retrieves the value of the 'MESSAGE_EXIST_IND' field in the FML buffer.
     *
     * @return Value of 'MESSAGE_EXIST_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MESSAGE_EXIST_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[33].getValue(0)));
    }

    /**
     * Retrieves the value of the 'SOURCE_BILL_SEQ_NO' field in the FML buffer.
     *
     * @return Value of 'SOURCE_BILL_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_SOURCE_BILL_SEQ_NO() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[34].getValue(0)));
    }

    /**
     * Retrieves the value of the 'CHANNEL_SEIZURE_DATE' field in the FML buffer.
     *
     * @return Value of 'CHANNEL_SEIZURE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CHANNEL_SEIZURE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[35].getValue(0));
    }

    /**
     * Retrieves the value of the 'MESSAGE_SWITCH_ID' field in the FML buffer.
     *
     * @return Value of 'MESSAGE_SWITCH_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MESSAGE_SWITCH_ID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[36].getValue(0));
    }

    /**
     * Retrieves the value of the 'MESSAGE_IDENTIFIER' field in the FML buffer.
     *
     * @return Value of 'MESSAGE_IDENTIFIER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MESSAGE_IDENTIFIER() throws FMLManipulationException {
        return ((String) this.fmlBuffer[37].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_IGNORE_IND' field in the FML buffer.
     *
     * @return Value of 'BL_IGNORE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_IGNORE_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[38].getValue(0)));
    }

    /**
     * Retrieves the value of the 'RMS_INV_STORE_ID' field in the FML buffer.
     *
     * @return Value of 'RMS_INV_STORE_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_RMS_INV_STORE_ID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[39].getValue(0));
    }

    /**
     * Retrieves the value of the 'RMS_INV_ACTV_TYPE' field in the FML buffer.
     *
     * @return Value of 'RMS_INV_ACTV_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_RMS_INV_ACTV_TYPE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[40].getValue(0)));
    }

    /**
     * Retrieves the value of the 'RMS_INV_ID' field in the FML buffer.
     *
     * @return Value of 'RMS_INV_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_RMS_INV_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[41].getValue(0));
    }

    /**
     * Retrieves the value of the 'DISCOUNT_PCT_L' field in the FML buffer.
     *
     * @return Value of 'DISCOUNT_PCT_L' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_DISCOUNT_PCT_L() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[42].getValue(0));
    }

    /**
     * Retrieves the value of the 'SOC' field in the FML buffer.
     *
     * @return Value of 'SOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SOC() throws FMLManipulationException {
        return ((String) this.fmlBuffer[43].getValue(0));
    }

    /**
     * Retrieves the value of the 'FTR_REVENUE_CODE' field in the FML buffer.
     *
     * @return Value of 'FTR_REVENUE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_REVENUE_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[44].getValue(0));
    }

    /**
     * Retrieves the value of the 'FEATURE_CODE' field in the FML buffer.
     *
     * @return Value of 'FEATURE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FEATURE_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[45].getValue(0));
    }

    /**
     * Retrieves the value of the 'SUB_MARKET_CD' field in the FML buffer.
     *
     * @return Value of 'SUB_MARKET_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUB_MARKET_CD() throws FMLManipulationException {
        return ((String) this.fmlBuffer[46].getValue(0));
    }

    /**
     * Retrieves the value of the 'SERVICE_FTR_SEQ_NO' field in the FML buffer.
     *
     * @return Value of 'SERVICE_FTR_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_SERVICE_FTR_SEQ_NO() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[47].getValue(0));
    }

    /**
     * Retrieves the value of the 'TAX_ADJUSTMENT_IND' field in the FML buffer.
     *
     * @return Value of 'TAX_ADJUSTMENT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_TAX_ADJUSTMENT_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[48].getValue(0)));
    }

    /**
     * Retrieves the value of the 'ORG_CODE' field in the FML buffer.
     *
     * @return Value of 'ORG_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ORG_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[49].getValue(0));
    }

    /**
     * Retrieves the value of the 'VOUCHER_NUM' field in the FML buffer.
     *
     * @return Value of 'VOUCHER_NUM' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_VOUCHER_NUM() throws FMLManipulationException {
        return ((String) this.fmlBuffer[50].getValue(0));
    }

    /**
     * Retrieves the value of the 'DESIGNATED_INV' field in the FML buffer.
     *
     * @return Value of 'DESIGNATED_INV' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DESIGNATED_INV() throws FMLManipulationException {
        return ((String) this.fmlBuffer[51].getValue(0));
    }

    /**
     * Retrieves the value of the 'ACTV_CODE' field in the FML buffer.
     *
     * @return Value of 'ACTV_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACTV_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[52].getValue(0));
    }

    /**
     * Retrieves the value of the 'BILL_RELEVANCE_IND' field in the FML buffer.
     *
     * @return Value of 'BILL_RELEVANCE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BILL_RELEVANCE_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[53].getValue(0)));
    }

    /**
     * Retrieves the value of the 'ENT_SEQ_NO' field in the FML buffer.
     *
     * @return Value of 'ENT_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ENT_SEQ_NO() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[54].getValue(0));
    }

    /**
     * Retrieves the value of the 'ACTV_SEQ_NO' field in the FML buffer.
     *
     * @return Value of 'ACTV_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ACTV_SEQ_NO() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[55].getValue(0)));
    }

    /**
     * Retrieves the value of the 'CRD_DBT_IND' field in the FML buffer.
     *
     * @return Value of 'CRD_DBT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CRD_DBT_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[56].getValue(0)));
    }

    /**
     * Retrieves the value of the 'PARADJINFOEFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Value of 'PARADJINFOEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PARADJINFOEFFECTIVE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[57].getValue(0));
    }

    /**
     * Retrieves the value of the 'CRD_DBT_CODE' field in the FML buffer.
     *
     * @return Value of 'CRD_DBT_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CRD_DBT_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[58].getValue(0));
    }

    /**
     * Retrieves the value of the 'PARADJINFOFEATURE_CODE' field in the FML buffer.
     *
     * @return Value of 'PARADJINFOFEATURE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PARADJINFOFEATURE_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[59].getValue(0));
    }

    /**
     * Retrieves the value of the 'BILL_FIXED_TEXT' field in the FML buffer.
     *
     * @return Value of 'BILL_FIXED_TEXT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BILL_FIXED_TEXT() throws FMLManipulationException {
        return ((String) this.fmlBuffer[60].getValue(0));
    }

    /**
     * Retrieves the value of the 'USER_TEXT' field in the FML buffer.
     *
     * @return Value of 'USER_TEXT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_USER_TEXT() throws FMLManipulationException {
        return ((String) this.fmlBuffer[61].getValue(0));
    }

    /**
     * Retrieves the value of the 'PARADJINFOSUBSCRIBER_NO' field in the FML buffer.
     *
     * @return Value of 'PARADJINFOSUBSCRIBER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PARADJINFOSUBSCRIBER_NO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[62].getValue(0));
    }

    /**
     * Retrieves the value of the 'PARADJINFOSOC' field in the FML buffer.
     *
     * @return Value of 'PARADJINFOSOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PARADJINFOSOC() throws FMLManipulationException {
        return ((String) this.fmlBuffer[63].getValue(0));
    }

    /**
     * Retrieves the value of the 'PARADJINFOFTR_REVENUE_CODE' field in the FML buffer.
     *
     * @return Value of 'PARADJINFOFTR_REVENUE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PARADJINFOFTR_REVENUE_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[64].getValue(0));
    }

    /**
     * Retrieves the value of the 'PRIOD_CVRG_ST_DATE' field in the FML buffer.
     *
     * @return Value of 'PRIOD_CVRG_ST_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PRIOD_CVRG_ST_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[65].getValue(0));
    }

    /**
     * Retrieves the value of the 'PRIOD_CVRG_ND_DATE' field in the FML buffer.
     *
     * @return Value of 'PRIOD_CVRG_ND_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PRIOD_CVRG_ND_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[66].getValue(0));
    }

    /**
     * Retrieves the value of the 'CREATION_DATE' field in the FML buffer.
     *
     * @return Value of 'CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CREATION_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[67].getValue(0));
    }

    /**
     * Retrieves the value of the 'CRD_DBT_SOURCE_CODE' field in the FML buffer.
     *
     * @return Value of 'CRD_DBT_SOURCE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CRD_DBT_SOURCE_CODE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[68].getValue(0)));
    }

    /**
     * Retrieves the value of the 'ACTV_AMT' field in the FML buffer.
     *
     * @return Value of 'ACTV_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_ACTV_AMT() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[69].getValue(0));
    }

    /**
     * Retrieves the value of the 'APPLIED_CREDIT_AMT' field in the FML buffer.
     *
     * @return Value of 'APPLIED_CREDIT_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_APPLIED_CREDIT_AMT() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[70].getValue(0));
    }

    /**
     * Retrieves the value of the 'BALANCE_IMPACT' field in the FML buffer.
     *
     * @return Value of 'BALANCE_IMPACT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BALANCE_IMPACT() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[71].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BILL_CLOSE_DATE' field in the FML buffer.
     *
     * @return Value of 'BILL_CLOSE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BILL_CLOSE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[72].getValue(0));
    }

    /**
     * Retrieves the value of the 'CHG_MEMO_ID' field in the FML buffer.
     *
     * @return Value of 'CHG_MEMO_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CHG_MEMO_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[73].getValue(0));
    }

    /**
     * Retrieves the value of the 'ADJ_MEMO_ID' field in the FML buffer.
     *
     * @return Value of 'ADJ_MEMO_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ADJ_MEMO_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[74].getValue(0));
    }

    /**
     * Retrieves the value of the 'ADJ_CHARGE_ID' field in the FML buffer.
     *
     * @return Value of 'ADJ_CHARGE_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ADJ_CHARGE_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[75].getValue(0));
    }

    /**
     * Retrieves the value of the 'PARADJINFOBL_IGNORE_IND' field in the FML buffer.
     *
     * @return Value of 'PARADJINFOBL_IGNORE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PARADJINFOBL_IGNORE_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[76].getValue(0)));
    }

    /**
     * Retrieves the value of the 'ADJ_REVERSED' field in the FML buffer.
     *
     * @return Value of 'ADJ_REVERSED' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADJ_REVERSED() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[77].getValue(0)));
    }

    /**
     * Retrieves the value of the 'NO_OF_INSTALL_FROM' field in the FML buffer.
     *
     * @return Value of 'NO_OF_INSTALL_FROM' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NO_OF_INSTALL_FROM() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[78].getValue(0)));
    }

    /**
     * Retrieves the value of the 'NO_OF_INSTALL_TO' field in the FML buffer.
     *
     * @return Value of 'NO_OF_INSTALL_TO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NO_OF_INSTALL_TO() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[79].getValue(0)));
    }

    /**
     * Retrieves the value of the 'TOTAL_NO_OF_INSTALL' field in the FML buffer.
     *
     * @return Value of 'TOTAL_NO_OF_INSTALL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_TOTAL_NO_OF_INSTALL() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[80].getValue(0)));
    }

    /**
     * Retrieves the value of the 'PARADJINFORMS_INV_ACTV_TYPE' field in the FML buffer.
     *
     * @return Value of 'PARADJINFORMS_INV_ACTV_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PARADJINFORMS_INV_ACTV_TYPE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[81].getValue(0)));
    }

    /**
     * Retrieves the value of the 'PARADJINFORMS_INV_STORE_ID' field in the FML buffer.
     *
     * @return Value of 'PARADJINFORMS_INV_STORE_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PARADJINFORMS_INV_STORE_ID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[82].getValue(0));
    }

    /**
     * Retrieves the value of the 'PARADJINFORMS_INV_ID' field in the FML buffer.
     *
     * @return Value of 'PARADJINFORMS_INV_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PARADJINFORMS_INV_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[83].getValue(0));
    }
}