package no.netcom.ninja.core.system.tuxedo.service.parameters;

import bea.jolt.pool.Result;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;

/**
 * @author  Ninja - Generated by Ninja tools
 */
public class ArLsOrdPymOutput extends ServiceOutput {

    /**
     * Creates a new instance of ArLsOrdPymOutput.
     *
     * @throws FMLManipulationException
     */
    public ArLsOrdPymOutput(int nApplicationStatus) throws FMLManipulationException {
        createFmlBuffer();
        setApplicationCode(nApplicationStatus);
    }

    public ArLsOrdPymOutput() {
    }

    /**
     * Creates a new instance of ArLsOrdPymOutput.
     *
     * @param ds Output dataset from ArLsOrdPym service.
     * @throws FMLManipulationException
     */
    public ArLsOrdPymOutput(Result ds) throws FMLManipulationException {
        createFmlBuffer();
        populateFmlBuffer(ds);
    }

    /**
     * Populates the FML buffer.
     *
     * @throws FMLManipulationException
     */
    private void createFmlBuffer() throws FMLManipulationException {
        this.fmlBuffer = new FmlField[37];
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
        this.fmlBuffer[17] = new FmlField("ROWID", FmlField.TYPE_STRING, 19, null, 17, 50);
        this.fmlBuffer[18] = new FmlField("BAN", FmlField.TYPE_INTEGER, -1, null, 18, 50);
        this.fmlBuffer[19] = new FmlField("PAYMENT_SEQ_NO", FmlField.TYPE_INTEGER, -1, null, 19, 50);
        this.fmlBuffer[20] = new FmlField("SYS_CREATION_DATE", FmlField.TYPE_STRING, 15, null, 20, 50);
        this.fmlBuffer[21] = new FmlField("SYS_UPDATE_DATE", FmlField.TYPE_STRING, 15, null, 21, 50);
        this.fmlBuffer[22] = new FmlField("ORDPYMLISTOPERATOR_ID", FmlField.TYPE_INTEGER, -1, null, 22, 50);
        this.fmlBuffer[23] = new FmlField("ORDPYMLISTAPPLICATION_ID", FmlField.TYPE_STRING, 7, null, 23, 50);
        this.fmlBuffer[24] = new FmlField("DL_SERVICE_CODE", FmlField.TYPE_STRING, 6, null, 24, 50);
        this.fmlBuffer[25] = new FmlField("DL_UPDATE_STAMP", FmlField.TYPE_SHORT, -1, null, 25, 50);
        this.fmlBuffer[26] = new FmlField("PAYMENT_AMOUNT", FmlField.TYPE_DOUBLE, -1, null, 26, 50);
        this.fmlBuffer[27] = new FmlField("PAYMENT_CREATION_DATE", FmlField.TYPE_STRING, 15, null, 27, 50);
        this.fmlBuffer[28] = new FmlField("EXTERNAL_ORDER_ID", FmlField.TYPE_STRING, 41, null, 28, 50);
        this.fmlBuffer[29] = new FmlField("PAYMENT_STATUS", FmlField.TYPE_BYTE, -1, null, 29, 50);
        this.fmlBuffer[30] = new FmlField("PAYMENT_STATUS_DATE", FmlField.TYPE_STRING, 15, null, 30, 50);
        this.fmlBuffer[31] = new FmlField("AR_PYM_ENT_SEQ_NO", FmlField.TYPE_INTEGER, -1, null, 31, 50);
        this.fmlBuffer[32] = new FmlField("PAYMENT_METHOD", FmlField.TYPE_STRING, 3, null, 32, 50);
        this.fmlBuffer[33] = new FmlField("PAYMENT_SUB_METHOD", FmlField.TYPE_STRING, 3, null, 33, 50);
        this.fmlBuffer[34] = new FmlField("SOURCE_TYPE", FmlField.TYPE_BYTE, -1, null, 34, 50);
        this.fmlBuffer[35] = new FmlField("SOURCE_ID", FmlField.TYPE_STRING, 9, null, 35, 50);
        this.fmlBuffer[36] = new FmlField("REFERENCE_ID", FmlField.TYPE_STRING, 41, null, 36, 50);
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
     * Retrieves the value of the 'ROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[17].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'ROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'ROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[17].getCount());
    }

    /**
     * Retrieves the value of the 'BAN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BAN(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[18].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'BAN' field in the FML buffer.
     *
     * @return Number of values defined for 'BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_BAN_size() throws FMLManipulationException {
        return (this.fmlBuffer[18].getCount());
    }

    /**
     * Retrieves the value of the 'PAYMENT_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PAYMENT_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PAYMENT_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[19].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'PAYMENT_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'PAYMENT_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PAYMENT_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[19].getCount());
    }

    /**
     * Retrieves the value of the 'SYS_CREATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SYS_CREATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[20].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'SYS_CREATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'SYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SYS_CREATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[20].getCount());
    }

    /**
     * Retrieves the value of the 'SYS_UPDATE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SYS_UPDATE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[21].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'SYS_UPDATE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'SYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SYS_UPDATE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[21].getCount());
    }

    /**
     * Retrieves the value of the 'ORDPYMLISTOPERATOR_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ORDPYMLISTOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ORDPYMLISTOPERATOR_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[22].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'ORDPYMLISTOPERATOR_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'ORDPYMLISTOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ORDPYMLISTOPERATOR_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[22].getCount());
    }

    /**
     * Retrieves the value of the 'ORDPYMLISTAPPLICATION_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ORDPYMLISTAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ORDPYMLISTAPPLICATION_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[23].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'ORDPYMLISTAPPLICATION_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'ORDPYMLISTAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ORDPYMLISTAPPLICATION_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[23].getCount());
    }

    /**
     * Retrieves the value of the 'DL_SERVICE_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'DL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DL_SERVICE_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[24].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'DL_SERVICE_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'DL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DL_SERVICE_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[24].getCount());
    }

    /**
     * Retrieves the value of the 'DL_UPDATE_STAMP' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'DL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_DL_UPDATE_STAMP(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[25].getValue(nIndex)));
    }

    /**
     * Retrieves number of values defined for 'DL_UPDATE_STAMP' field in the FML buffer.
     *
     * @return Number of values defined for 'DL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DL_UPDATE_STAMP_size() throws FMLManipulationException {
        return (this.fmlBuffer[25].getCount());
    }

    /**
     * Retrieves the value of the 'PAYMENT_AMOUNT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PAYMENT_AMOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_PAYMENT_AMOUNT(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[26].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'PAYMENT_AMOUNT' field in the FML buffer.
     *
     * @return Number of values defined for 'PAYMENT_AMOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PAYMENT_AMOUNT_size() throws FMLManipulationException {
        return (this.fmlBuffer[26].getCount());
    }

    /**
     * Retrieves the value of the 'PAYMENT_CREATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PAYMENT_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAYMENT_CREATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[27].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'PAYMENT_CREATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'PAYMENT_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PAYMENT_CREATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[27].getCount());
    }

    /**
     * Retrieves the value of the 'EXTERNAL_ORDER_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'EXTERNAL_ORDER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EXTERNAL_ORDER_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[28].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'EXTERNAL_ORDER_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'EXTERNAL_ORDER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_EXTERNAL_ORDER_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[28].getCount());
    }

    /**
     * Retrieves the value of the 'PAYMENT_STATUS' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PAYMENT_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAYMENT_STATUS(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[29].getValue(nIndex)));
    }

    /**
     * Retrieves number of values defined for 'PAYMENT_STATUS' field in the FML buffer.
     *
     * @return Number of values defined for 'PAYMENT_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PAYMENT_STATUS_size() throws FMLManipulationException {
        return (this.fmlBuffer[29].getCount());
    }

    /**
     * Retrieves the value of the 'PAYMENT_STATUS_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PAYMENT_STATUS_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAYMENT_STATUS_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[30].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'PAYMENT_STATUS_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'PAYMENT_STATUS_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PAYMENT_STATUS_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[30].getCount());
    }

    /**
     * Retrieves the value of the 'AR_PYM_ENT_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'AR_PYM_ENT_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_AR_PYM_ENT_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[31].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'AR_PYM_ENT_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'AR_PYM_ENT_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_AR_PYM_ENT_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[31].getCount());
    }

    /**
     * Retrieves the value of the 'PAYMENT_METHOD' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PAYMENT_METHOD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAYMENT_METHOD(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[32].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'PAYMENT_METHOD' field in the FML buffer.
     *
     * @return Number of values defined for 'PAYMENT_METHOD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PAYMENT_METHOD_size() throws FMLManipulationException {
        return (this.fmlBuffer[32].getCount());
    }

    /**
     * Retrieves the value of the 'PAYMENT_SUB_METHOD' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PAYMENT_SUB_METHOD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAYMENT_SUB_METHOD(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[33].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'PAYMENT_SUB_METHOD' field in the FML buffer.
     *
     * @return Number of values defined for 'PAYMENT_SUB_METHOD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PAYMENT_SUB_METHOD_size() throws FMLManipulationException {
        return (this.fmlBuffer[33].getCount());
    }

    /**
     * Retrieves the value of the 'SOURCE_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SOURCE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SOURCE_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[34].getValue(nIndex)));
    }

    /**
     * Retrieves number of values defined for 'SOURCE_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'SOURCE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SOURCE_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[34].getCount());
    }

    /**
     * Retrieves the value of the 'SOURCE_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SOURCE_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SOURCE_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[35].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'SOURCE_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'SOURCE_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SOURCE_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[35].getCount());
    }

    /**
     * Retrieves the value of the 'REFERENCE_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'REFERENCE_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_REFERENCE_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[36].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'REFERENCE_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'REFERENCE_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_REFERENCE_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[36].getCount());
    }
}