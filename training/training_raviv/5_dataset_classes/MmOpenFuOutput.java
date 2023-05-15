package no.netcom.ninja.core.system.tuxedo.service.parameters;

import bea.jolt.pool.Result;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;

/**
 * @author  Ninja - Generated by Ninja tools
 */
public class MmOpenFuOutput extends ServiceOutput {

    /**
     * Creates a new instance of MmOpenFuOutput.
     *
     * @throws FMLManipulationException
     */
    public MmOpenFuOutput(int nApplicationStatus) throws FMLManipulationException {
        createFmlBuffer();
        setApplicationCode(nApplicationStatus);
    }

    public MmOpenFuOutput() {
    }

    /**
     * Creates a new instance of MmOpenFuOutput.
     *
     * @param ds Output dataset from MmOpenFu service.
     * @throws FMLManipulationException
     */
    public MmOpenFuOutput(Result ds) throws FMLManipulationException {
        createFmlBuffer();
        populateFmlBuffer(ds);
    }

    /**
     * Populates the FML buffer.
     *
     * @throws FMLManipulationException
     */
    private void createFmlBuffer() throws FMLManipulationException {
        this.fmlBuffer = new FmlField[47];
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
        this.fmlBuffer[17] = new FmlField("FU_BAN", FmlField.TYPE_INTEGER, -1, null, 17, 1);
        this.fmlBuffer[18] = new FmlField("FU_ID", FmlField.TYPE_INTEGER, -1, null, 18, 1);
        this.fmlBuffer[19] = new FmlField("SYS_UPDATE_DATE", FmlField.TYPE_STRING, 15, null, 19, 1);
        this.fmlBuffer[20] = new FmlField("FU_TYPE", FmlField.TYPE_STRING, 5, null, 20, 1);
        this.fmlBuffer[21] = new FmlField("FU_DUE_DATE", FmlField.TYPE_STRING, 9, null, 21, 1);
        this.fmlBuffer[22] = new FmlField("FU_STATUS", FmlField.TYPE_BYTE, -1, null, 22, 1);
        this.fmlBuffer[23] = new FmlField("FU_ASSIGNED_TO", FmlField.TYPE_STRING, 9, null, 23, 1);
        this.fmlBuffer[24] = new FmlField("FU_SUBSCRIBER", FmlField.TYPE_STRING, 21, null, 24, 1);
        this.fmlBuffer[25] = new FmlField("FU_TEXT", FmlField.TYPE_STRING, 601, null, 25, 1);
        this.fmlBuffer[26] = new FmlField("FU_OPENED_BY", FmlField.TYPE_INTEGER, -1, null, 26, 1);
        this.fmlBuffer[27] = new FmlField("FU_OPEN_DATE", FmlField.TYPE_STRING, 9, null, 27, 1);
        this.fmlBuffer[28] = new FmlField("FU_CLOSED_BY", FmlField.TYPE_INTEGER, -1, null, 28, 1);
        this.fmlBuffer[29] = new FmlField("FU_CLOSE_DATE", FmlField.TYPE_STRING, 9, null, 29, 1);
        this.fmlBuffer[30] = new FmlField("FU_CLOSE_REASON_CODE", FmlField.TYPE_STRING, 3, null, 30, 1);
        this.fmlBuffer[31] = new FmlField("FU_BYPASS_REASON", FmlField.TYPE_STRING, 3, null, 31, 1);
        this.fmlBuffer[32] = new FmlField("FU_BYPASS_DATE", FmlField.TYPE_STRING, 15, null, 32, 1);
        this.fmlBuffer[33] = new FmlField("FU_AMT", FmlField.TYPE_DOUBLE, -1, null, 33, 1);
        this.fmlBuffer[34] = new FmlField("FU_INVOICE_NO", FmlField.TYPE_STRING, 14, null, 34, 1);
        this.fmlBuffer[35] = new FmlField("FUTP_ROWID", FmlField.TYPE_STRING, 19, null, 35, 1);
        this.fmlBuffer[36] = new FmlField("FUTP_FU_DESCRIPTION", FmlField.TYPE_STRING, 21, null, 36, 1);
        this.fmlBuffer[37] = new FmlField("FUTP_FU_CATEGORY", FmlField.TYPE_STRING, 5, null, 37, 1);
        this.fmlBuffer[38] = new FmlField("FUTP_MANUAL_CLOSE_IND", FmlField.TYPE_BYTE, -1, null, 38, 1);
        this.fmlBuffer[39] = new FmlField("FUTP_IMM_TREAT_IND", FmlField.TYPE_BYTE, -1, null, 39, 1);
        this.fmlBuffer[40] = new FmlField("FUTP_PRIORITY", FmlField.TYPE_SHORT, -1, null, 40, 1);
        this.fmlBuffer[41] = new FmlField("OPENED_USER_SHORT_NAME", FmlField.TYPE_STRING, 21, null, 41, 1);
        this.fmlBuffer[42] = new FmlField("CLOSED_USER_SHORT_NAME", FmlField.TYPE_STRING, 21, null, 42, 1);
        this.fmlBuffer[43] = new FmlField("ASSIGNED_TO_USER_ID", FmlField.TYPE_INTEGER, -1, null, 43, 1);
        this.fmlBuffer[44] = new FmlField("ASSIGNED_TO_SHORT_NAME", FmlField.TYPE_STRING, 21, null, 44, 1);
        this.fmlBuffer[45] = new FmlField("FUNC_FUNCTION_CODE", FmlField.TYPE_STRING, 5, null, 45, 1);
        this.fmlBuffer[46] = new FmlField("FUNC_FUNCTION_DESC", FmlField.TYPE_STRING, 21, null, 46, 1);
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
     * Retrieves the value of the 'FU_BAN' field in the FML buffer.
     *
     * @return Value of 'FU_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_FU_BAN() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[17].getValue(0));
    }

    /**
     * Retrieves the value of the 'FU_ID' field in the FML buffer.
     *
     * @return Value of 'FU_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_FU_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[18].getValue(0));
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
     * Retrieves the value of the 'FU_TYPE' field in the FML buffer.
     *
     * @return Value of 'FU_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FU_TYPE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[20].getValue(0));
    }

    /**
     * Retrieves the value of the 'FU_DUE_DATE' field in the FML buffer.
     *
     * @return Value of 'FU_DUE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FU_DUE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[21].getValue(0));
    }

    /**
     * Retrieves the value of the 'FU_STATUS' field in the FML buffer.
     *
     * @return Value of 'FU_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FU_STATUS() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[22].getValue(0)));
    }

    /**
     * Retrieves the value of the 'FU_ASSIGNED_TO' field in the FML buffer.
     *
     * @return Value of 'FU_ASSIGNED_TO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FU_ASSIGNED_TO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[23].getValue(0));
    }

    /**
     * Retrieves the value of the 'FU_SUBSCRIBER' field in the FML buffer.
     *
     * @return Value of 'FU_SUBSCRIBER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FU_SUBSCRIBER() throws FMLManipulationException {
        return ((String) this.fmlBuffer[24].getValue(0));
    }

    /**
     * Retrieves the value of the 'FU_TEXT' field in the FML buffer.
     *
     * @return Value of 'FU_TEXT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FU_TEXT() throws FMLManipulationException {
        return ((String) this.fmlBuffer[25].getValue(0));
    }

    /**
     * Retrieves the value of the 'FU_OPENED_BY' field in the FML buffer.
     *
     * @return Value of 'FU_OPENED_BY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_FU_OPENED_BY() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[26].getValue(0));
    }

    /**
     * Retrieves the value of the 'FU_OPEN_DATE' field in the FML buffer.
     *
     * @return Value of 'FU_OPEN_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FU_OPEN_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[27].getValue(0));
    }

    /**
     * Retrieves the value of the 'FU_CLOSED_BY' field in the FML buffer.
     *
     * @return Value of 'FU_CLOSED_BY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_FU_CLOSED_BY() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[28].getValue(0));
    }

    /**
     * Retrieves the value of the 'FU_CLOSE_DATE' field in the FML buffer.
     *
     * @return Value of 'FU_CLOSE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FU_CLOSE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[29].getValue(0));
    }

    /**
     * Retrieves the value of the 'FU_CLOSE_REASON_CODE' field in the FML buffer.
     *
     * @return Value of 'FU_CLOSE_REASON_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FU_CLOSE_REASON_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[30].getValue(0));
    }

    /**
     * Retrieves the value of the 'FU_BYPASS_REASON' field in the FML buffer.
     *
     * @return Value of 'FU_BYPASS_REASON' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FU_BYPASS_REASON() throws FMLManipulationException {
        return ((String) this.fmlBuffer[31].getValue(0));
    }

    /**
     * Retrieves the value of the 'FU_BYPASS_DATE' field in the FML buffer.
     *
     * @return Value of 'FU_BYPASS_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FU_BYPASS_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[32].getValue(0));
    }

    /**
     * Retrieves the value of the 'FU_AMT' field in the FML buffer.
     *
     * @return Value of 'FU_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_FU_AMT() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[33].getValue(0));
    }

    /**
     * Retrieves the value of the 'FU_INVOICE_NO' field in the FML buffer.
     *
     * @return Value of 'FU_INVOICE_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FU_INVOICE_NO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[34].getValue(0));
    }

    /**
     * Retrieves the value of the 'FUTP_ROWID' field in the FML buffer.
     *
     * @return Value of 'FUTP_ROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FUTP_ROWID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[35].getValue(0));
    }

    /**
     * Retrieves the value of the 'FUTP_FU_DESCRIPTION' field in the FML buffer.
     *
     * @return Value of 'FUTP_FU_DESCRIPTION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FUTP_FU_DESCRIPTION() throws FMLManipulationException {
        return ((String) this.fmlBuffer[36].getValue(0));
    }

    /**
     * Retrieves the value of the 'FUTP_FU_CATEGORY' field in the FML buffer.
     *
     * @return Value of 'FUTP_FU_CATEGORY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FUTP_FU_CATEGORY() throws FMLManipulationException {
        return ((String) this.fmlBuffer[37].getValue(0));
    }

    /**
     * Retrieves the value of the 'FUTP_MANUAL_CLOSE_IND' field in the FML buffer.
     *
     * @return Value of 'FUTP_MANUAL_CLOSE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FUTP_MANUAL_CLOSE_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[38].getValue(0)));
    }

    /**
     * Retrieves the value of the 'FUTP_IMM_TREAT_IND' field in the FML buffer.
     *
     * @return Value of 'FUTP_IMM_TREAT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FUTP_IMM_TREAT_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[39].getValue(0)));
    }

    /**
     * Retrieves the value of the 'FUTP_PRIORITY' field in the FML buffer.
     *
     * @return Value of 'FUTP_PRIORITY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_FUTP_PRIORITY() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[40].getValue(0)));
    }

    /**
     * Retrieves the value of the 'OPENED_USER_SHORT_NAME' field in the FML buffer.
     *
     * @return Value of 'OPENED_USER_SHORT_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_OPENED_USER_SHORT_NAME() throws FMLManipulationException {
        return ((String) this.fmlBuffer[41].getValue(0));
    }

    /**
     * Retrieves the value of the 'CLOSED_USER_SHORT_NAME' field in the FML buffer.
     *
     * @return Value of 'CLOSED_USER_SHORT_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CLOSED_USER_SHORT_NAME() throws FMLManipulationException {
        return ((String) this.fmlBuffer[42].getValue(0));
    }

    /**
     * Retrieves the value of the 'ASSIGNED_TO_USER_ID' field in the FML buffer.
     *
     * @return Value of 'ASSIGNED_TO_USER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ASSIGNED_TO_USER_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[43].getValue(0));
    }

    /**
     * Retrieves the value of the 'ASSIGNED_TO_SHORT_NAME' field in the FML buffer.
     *
     * @return Value of 'ASSIGNED_TO_SHORT_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ASSIGNED_TO_SHORT_NAME() throws FMLManipulationException {
        return ((String) this.fmlBuffer[44].getValue(0));
    }

    /**
     * Retrieves the value of the 'FUNC_FUNCTION_CODE' field in the FML buffer.
     *
     * @return Value of 'FUNC_FUNCTION_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FUNC_FUNCTION_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[45].getValue(0));
    }

    /**
     * Retrieves the value of the 'FUNC_FUNCTION_DESC' field in the FML buffer.
     *
     * @return Value of 'FUNC_FUNCTION_DESC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FUNC_FUNCTION_DESC() throws FMLManipulationException {
        return ((String) this.fmlBuffer[46].getValue(0));
    }
}