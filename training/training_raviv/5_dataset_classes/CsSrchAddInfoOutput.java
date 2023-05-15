package no.netcom.ninja.core.system.tuxedo.service.parameters;

import bea.jolt.pool.Result;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;

/**
 * @author  Ninja - Generated by Ninja tools
 */
public class CsSrchAddInfoOutput extends ServiceOutput {

    /**
     * Creates a new instance of CsSrchAddInfoOutput.
     *
     * @throws FMLManipulationException
     */
    public CsSrchAddInfoOutput(int nApplicationStatus) throws FMLManipulationException {
        createFmlBuffer();
        setApplicationCode(nApplicationStatus);
    }

    public CsSrchAddInfoOutput() {
    }

    /**
     * Creates a new instance of CsSrchAddInfoOutput.
     *
     * @param ds Output dataset from CsSrchAddInfo service.
     * @throws FMLManipulationException
     */
    public CsSrchAddInfoOutput(Result ds) throws FMLManipulationException {
        createFmlBuffer();
        populateFmlBuffer(ds);
    }

    /**
     * Populates the FML buffer.
     *
     * @throws FMLManipulationException
     */
    private void createFmlBuffer() throws FMLManipulationException {
        this.fmlBuffer = new FmlField[44];
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
        this.fmlBuffer[16] = new FmlField("MOREROWS", FmlField.TYPE_SHORT, -1, null, 16, 1);
        this.fmlBuffer[17] = new FmlField("ROWCOUNT", FmlField.TYPE_INTEGER, -1, null, 17, 1);
        this.fmlBuffer[18] = new FmlField("ROWID", FmlField.TYPE_STRING, 19, null, 18, 100);
        this.fmlBuffer[19] = new FmlField("BAN", FmlField.TYPE_INTEGER, -1, null, 19, 100);
        this.fmlBuffer[20] = new FmlField("ACCOUNT_TYPE", FmlField.TYPE_BYTE, -1, null, 20, 100);
        this.fmlBuffer[21] = new FmlField("BAN_STATUS", FmlField.TYPE_BYTE, -1, null, 21, 100);
        this.fmlBuffer[22] = new FmlField("STATUS_LAST_DATE", FmlField.TYPE_STRING, 9, null, 22, 100);
        this.fmlBuffer[23] = new FmlField("BL_HIER_BAN_IND", FmlField.TYPE_BYTE, -1, null, 23, 100);
        this.fmlBuffer[24] = new FmlField("VIP_IND", FmlField.TYPE_BYTE, -1, null, 24, 100);
        this.fmlBuffer[25] = new FmlField("ACCOUNT_SUB_TYPE", FmlField.TYPE_STRING, 3, null, 25, 100);
        this.fmlBuffer[26] = new FmlField("BILL_CYCLE", FmlField.TYPE_SHORT, -1, null, 26, 100);
        this.fmlBuffer[27] = new FmlField("START_SERVICE_DATE", FmlField.TYPE_STRING, 9, null, 27, 100);
        this.fmlBuffer[28] = new FmlField("AR_BALANCE", FmlField.TYPE_DOUBLE, -1, null, 28, 100);
        this.fmlBuffer[29] = new FmlField("BL_BILL_PROD_IND", FmlField.TYPE_BYTE, -1, null, 29, 100);
        this.fmlBuffer[30] = new FmlField("CURR_ROOT_BAN", FmlField.TYPE_INTEGER, -1, null, 30, 100);
        this.fmlBuffer[31] = new FmlField("NEXT_ROOT_BAN", FmlField.TYPE_INTEGER, -1, null, 31, 100);
        this.fmlBuffer[32] = new FmlField("NEXT_CONF_ROOT_BAN", FmlField.TYPE_INTEGER, -1, null, 32, 100);
        this.fmlBuffer[33] = new FmlField("O_ATTRADDRROWID", FmlField.TYPE_STRING, 19, null, 33, 100);
        this.fmlBuffer[34] = new FmlField("LINK_TYPE", FmlField.TYPE_BYTE, -1, null, 34, 100);
        this.fmlBuffer[35] = new FmlField("CONTROL_NAME", FmlField.TYPE_STRING, 41, null, 35, 100);
        this.fmlBuffer[36] = new FmlField("ADR_ZIP", FmlField.TYPE_STRING, 10, null, 36, 100);
        this.fmlBuffer[37] = new FmlField("ADR_STREET_NAME", FmlField.TYPE_STRING, 61, null, 37, 100);
        this.fmlBuffer[38] = new FmlField("ADR_CITY", FmlField.TYPE_STRING, 40, null, 38, 100);
        this.fmlBuffer[39] = new FmlField("ADR_POB", FmlField.TYPE_STRING, 11, null, 39, 100);
        this.fmlBuffer[40] = new FmlField("NAME_ID", FmlField.TYPE_INTEGER, -1, null, 40, 100);
        this.fmlBuffer[41] = new FmlField("ADDRESS_ID", FmlField.TYPE_INTEGER, -1, null, 41, 100);
        this.fmlBuffer[42] = new FmlField("NAME_FORMAT", FmlField.TYPE_BYTE, -1, null, 42, 100);
        this.fmlBuffer[43] = new FmlField("ADDITIONAL_TITLE", FmlField.TYPE_STRING, 61, null, 43, 100);
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
     * Retrieves the value of the 'MOREROWS' field in the FML buffer.
     *
     * @return Value of 'MOREROWS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_MOREROWS() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[16].getValue(0)));
    }

    /**
     * Retrieves the value of the 'ROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'ROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[17].getValue(0));
    }

    /**
     * Retrieves the value of the 'ROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'ROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[18].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'ROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'ROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[18].getCount());
    }

    /**
     * Retrieves the value of the 'BAN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BAN(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[19].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'BAN' field in the FML buffer.
     *
     * @return Number of values defined for 'BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_BAN_size() throws FMLManipulationException {
        return (this.fmlBuffer[19].getCount());
    }

    /**
     * Retrieves the value of the 'ACCOUNT_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'ACCOUNT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACCOUNT_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[20].getValue(nIndex)));
    }

    /**
     * Retrieves number of values defined for 'ACCOUNT_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'ACCOUNT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACCOUNT_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[20].getCount());
    }

    /**
     * Retrieves the value of the 'BAN_STATUS' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'BAN_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BAN_STATUS(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[21].getValue(nIndex)));
    }

    /**
     * Retrieves number of values defined for 'BAN_STATUS' field in the FML buffer.
     *
     * @return Number of values defined for 'BAN_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_BAN_STATUS_size() throws FMLManipulationException {
        return (this.fmlBuffer[21].getCount());
    }

    /**
     * Retrieves the value of the 'STATUS_LAST_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'STATUS_LAST_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_STATUS_LAST_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[22].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'STATUS_LAST_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'STATUS_LAST_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_STATUS_LAST_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[22].getCount());
    }

    /**
     * Retrieves the value of the 'BL_HIER_BAN_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'BL_HIER_BAN_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_HIER_BAN_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[23].getValue(nIndex)));
    }

    /**
     * Retrieves number of values defined for 'BL_HIER_BAN_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'BL_HIER_BAN_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_BL_HIER_BAN_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[23].getCount());
    }

    /**
     * Retrieves the value of the 'VIP_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'VIP_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_VIP_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[24].getValue(nIndex)));
    }

    /**
     * Retrieves number of values defined for 'VIP_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'VIP_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_VIP_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[24].getCount());
    }

    /**
     * Retrieves the value of the 'ACCOUNT_SUB_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'ACCOUNT_SUB_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACCOUNT_SUB_TYPE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[25].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'ACCOUNT_SUB_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'ACCOUNT_SUB_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACCOUNT_SUB_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[25].getCount());
    }

    /**
     * Retrieves the value of the 'BILL_CYCLE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'BILL_CYCLE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BILL_CYCLE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[26].getValue(nIndex)));
    }

    /**
     * Retrieves number of values defined for 'BILL_CYCLE' field in the FML buffer.
     *
     * @return Number of values defined for 'BILL_CYCLE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_BILL_CYCLE_size() throws FMLManipulationException {
        return (this.fmlBuffer[26].getCount());
    }

    /**
     * Retrieves the value of the 'START_SERVICE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'START_SERVICE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_START_SERVICE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[27].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'START_SERVICE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'START_SERVICE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_START_SERVICE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[27].getCount());
    }

    /**
     * Retrieves the value of the 'AR_BALANCE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'AR_BALANCE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_AR_BALANCE(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[28].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'AR_BALANCE' field in the FML buffer.
     *
     * @return Number of values defined for 'AR_BALANCE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_AR_BALANCE_size() throws FMLManipulationException {
        return (this.fmlBuffer[28].getCount());
    }

    /**
     * Retrieves the value of the 'BL_BILL_PROD_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'BL_BILL_PROD_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_BILL_PROD_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[29].getValue(nIndex)));
    }

    /**
     * Retrieves number of values defined for 'BL_BILL_PROD_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'BL_BILL_PROD_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_BL_BILL_PROD_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[29].getCount());
    }

    /**
     * Retrieves the value of the 'CURR_ROOT_BAN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'CURR_ROOT_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CURR_ROOT_BAN(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[30].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'CURR_ROOT_BAN' field in the FML buffer.
     *
     * @return Number of values defined for 'CURR_ROOT_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CURR_ROOT_BAN_size() throws FMLManipulationException {
        return (this.fmlBuffer[30].getCount());
    }

    /**
     * Retrieves the value of the 'NEXT_ROOT_BAN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'NEXT_ROOT_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NEXT_ROOT_BAN(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[31].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'NEXT_ROOT_BAN' field in the FML buffer.
     *
     * @return Number of values defined for 'NEXT_ROOT_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NEXT_ROOT_BAN_size() throws FMLManipulationException {
        return (this.fmlBuffer[31].getCount());
    }

    /**
     * Retrieves the value of the 'NEXT_CONF_ROOT_BAN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'NEXT_CONF_ROOT_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NEXT_CONF_ROOT_BAN(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[32].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'NEXT_CONF_ROOT_BAN' field in the FML buffer.
     *
     * @return Number of values defined for 'NEXT_CONF_ROOT_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NEXT_CONF_ROOT_BAN_size() throws FMLManipulationException {
        return (this.fmlBuffer[32].getCount());
    }

    /**
     * Retrieves the value of the 'O_ATTRADDRROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'O_ATTRADDRROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_O_ATTRADDRROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[33].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'O_ATTRADDRROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'O_ATTRADDRROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_O_ATTRADDRROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[33].getCount());
    }

    /**
     * Retrieves the value of the 'LINK_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'LINK_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LINK_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[34].getValue(nIndex)));
    }

    /**
     * Retrieves number of values defined for 'LINK_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[34].getCount());
    }

    /**
     * Retrieves the value of the 'CONTROL_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'CONTROL_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CONTROL_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[35].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'CONTROL_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'CONTROL_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CONTROL_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[35].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_ZIP' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'ADR_ZIP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_ZIP(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[36].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'ADR_ZIP' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_ZIP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_ZIP_size() throws FMLManipulationException {
        return (this.fmlBuffer[36].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_STREET_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'ADR_STREET_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_STREET_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[37].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'ADR_STREET_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_STREET_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_STREET_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[37].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_CITY' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'ADR_CITY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_CITY(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[38].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'ADR_CITY' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_CITY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_CITY_size() throws FMLManipulationException {
        return (this.fmlBuffer[38].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_POB' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'ADR_POB' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_POB(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[39].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'ADR_POB' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_POB' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_POB_size() throws FMLManipulationException {
        return (this.fmlBuffer[39].getCount());
    }

    /**
     * Retrieves the value of the 'NAME_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'NAME_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NAME_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[40].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'NAME_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'NAME_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAME_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[40].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESS_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'ADDRESS_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ADDRESS_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[41].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'ADDRESS_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESS_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESS_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[41].getCount());
    }

    /**
     * Retrieves the value of the 'NAME_FORMAT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'NAME_FORMAT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NAME_FORMAT(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[42].getValue(nIndex)));
    }

    /**
     * Retrieves number of values defined for 'NAME_FORMAT' field in the FML buffer.
     *
     * @return Number of values defined for 'NAME_FORMAT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAME_FORMAT_size() throws FMLManipulationException {
        return (this.fmlBuffer[42].getCount());
    }

    /**
     * Retrieves the value of the 'ADDITIONAL_TITLE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'ADDITIONAL_TITLE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADDITIONAL_TITLE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[43].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'ADDITIONAL_TITLE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDITIONAL_TITLE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDITIONAL_TITLE_size() throws FMLManipulationException {
        return (this.fmlBuffer[43].getCount());
    }
}