package no.netcom.ninja.core.system.tuxedo.service.parameters;

import bea.jolt.pool.Result;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;

/**
 * @author  Ninja - Generated by Ninja tools
 */
public class CsSvOrgPabxOutput extends ServiceOutput {

    /**
     * Creates a new instance of CsSvOrgPabxOutput.
     *
     * @throws FMLManipulationException
     */
    public CsSvOrgPabxOutput(int nApplicationStatus) throws FMLManipulationException {
        createFmlBuffer();
        setApplicationCode(nApplicationStatus);
    }

    public CsSvOrgPabxOutput() {
    }

    /**
     * Creates a new instance of CsSvOrgPabxOutput.
     *
     * @param ds Output dataset from CsSvOrgPabx service.
     * @throws FMLManipulationException
     */
    public CsSvOrgPabxOutput(Result ds) throws FMLManipulationException {
        createFmlBuffer();
        populateFmlBuffer(ds);
    }

    /**
     * Populates the FML buffer.
     *
     * @throws FMLManipulationException
     */
    private void createFmlBuffer() throws FMLManipulationException {
        this.fmlBuffer = new FmlField[42];
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
        this.fmlBuffer[17] = new FmlField("ORGCODE", FmlField.TYPE_STRING, 10, null, 17, 1);
        this.fmlBuffer[18] = new FmlField("ROWMODE", FmlField.TYPE_BYTE, -1, null, 18, 50);
        this.fmlBuffer[19] = new FmlField("ROWID", FmlField.TYPE_STRING, 19, null, 19, 50);
        this.fmlBuffer[20] = new FmlField("PABX_ID", FmlField.TYPE_STRING, 13, null, 20, 50);
        this.fmlBuffer[21] = new FmlField("SYS_CREATION_DATE", FmlField.TYPE_STRING, 15, null, 21, 50);
        this.fmlBuffer[22] = new FmlField("SYS_UPDATE_DATE", FmlField.TYPE_STRING, 15, null, 22, 50);
        this.fmlBuffer[23] = new FmlField("PABXRECOPERATOR_ID", FmlField.TYPE_INTEGER, -1, null, 23, 50);
        this.fmlBuffer[24] = new FmlField("PABXRECAPPLICATION_ID", FmlField.TYPE_STRING, 7, null, 24, 50);
        this.fmlBuffer[25] = new FmlField("DL_SERVICE_CODE", FmlField.TYPE_STRING, 6, null, 25, 50);
        this.fmlBuffer[26] = new FmlField("DL_UPDATE_STAMP", FmlField.TYPE_SHORT, -1, null, 26, 50);
        this.fmlBuffer[27] = new FmlField("LEADING_NUMBER", FmlField.TYPE_STRING, 21, null, 27, 50);
        this.fmlBuffer[28] = new FmlField("PABX_ISSUE_DATE", FmlField.TYPE_STRING, 9, null, 28, 50);
        this.fmlBuffer[29] = new FmlField("EFFECTIVE_DATE", FmlField.TYPE_STRING, 9, null, 29, 50);
        this.fmlBuffer[30] = new FmlField("EXPIRATION_DATE", FmlField.TYPE_STRING, 9, null, 30, 50);
        this.fmlBuffer[31] = new FmlField("ACTIVE_PABX", FmlField.TYPE_BYTE, -1, null, 31, 50);
        this.fmlBuffer[32] = new FmlField("PABX_TYPE", FmlField.TYPE_STRING, 21, null, 32, 50);
        this.fmlBuffer[33] = new FmlField("CONNECT_TYPE", FmlField.TYPE_STRING, 21, null, 33, 50);
        this.fmlBuffer[34] = new FmlField("PABX_DESC", FmlField.TYPE_STRING, 21, null, 34, 50);
        this.fmlBuffer[35] = new FmlField("OWNER", FmlField.TYPE_STRING, 41, null, 35, 50);
        this.fmlBuffer[36] = new FmlField("ADDRESS", FmlField.TYPE_STRING, 61, null, 36, 50);
        this.fmlBuffer[37] = new FmlField("RESPONSIBLE", FmlField.TYPE_STRING, 41, null, 37, 50);
        this.fmlBuffer[38] = new FmlField("PHONE", FmlField.TYPE_STRING, 21, null, 38, 50);
        this.fmlBuffer[39] = new FmlField("SIP_MAIN", FmlField.TYPE_STRING, 21, null, 39, 50);
        this.fmlBuffer[40] = new FmlField("AUTO_ACTIVATE_IND", FmlField.TYPE_BYTE, -1, null, 40, 50);
        this.fmlBuffer[41] = new FmlField("ERRORDESC", FmlField.TYPE_STRING, 161, null, 41, 50);
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
     * Retrieves the value of the 'ORGCODE' field in the FML buffer.
     *
     * @return Value of 'ORGCODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ORGCODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[17].getValue(0));
    }

    /**
     * Retrieves the value of the 'ROWMODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ROWMODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ROWMODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[18].getValue(nIndex)));
    }

    /**
     * Retrieves number of values defined for 'ROWMODE' field in the FML buffer.
     *
     * @return Number of values defined for 'ROWMODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ROWMODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[18].getCount());
    }

    /**
     * Retrieves the value of the 'ROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[19].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'ROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'ROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[19].getCount());
    }

    /**
     * Retrieves the value of the 'PABX_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PABX_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PABX_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[20].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'PABX_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'PABX_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PABX_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[20].getCount());
    }

    /**
     * Retrieves the value of the 'SYS_CREATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SYS_CREATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[21].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'SYS_CREATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'SYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SYS_CREATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[21].getCount());
    }

    /**
     * Retrieves the value of the 'SYS_UPDATE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SYS_UPDATE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[22].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'SYS_UPDATE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'SYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SYS_UPDATE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[22].getCount());
    }

    /**
     * Retrieves the value of the 'PABXRECOPERATOR_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PABXRECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PABXRECOPERATOR_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[23].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'PABXRECOPERATOR_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'PABXRECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PABXRECOPERATOR_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[23].getCount());
    }

    /**
     * Retrieves the value of the 'PABXRECAPPLICATION_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PABXRECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PABXRECAPPLICATION_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[24].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'PABXRECAPPLICATION_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'PABXRECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PABXRECAPPLICATION_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[24].getCount());
    }

    /**
     * Retrieves the value of the 'DL_SERVICE_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'DL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DL_SERVICE_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[25].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'DL_SERVICE_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'DL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DL_SERVICE_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[25].getCount());
    }

    /**
     * Retrieves the value of the 'DL_UPDATE_STAMP' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'DL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_DL_UPDATE_STAMP(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[26].getValue(nIndex)));
    }

    /**
     * Retrieves number of values defined for 'DL_UPDATE_STAMP' field in the FML buffer.
     *
     * @return Number of values defined for 'DL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DL_UPDATE_STAMP_size() throws FMLManipulationException {
        return (this.fmlBuffer[26].getCount());
    }

    /**
     * Retrieves the value of the 'LEADING_NUMBER' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'LEADING_NUMBER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LEADING_NUMBER(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[27].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'LEADING_NUMBER' field in the FML buffer.
     *
     * @return Number of values defined for 'LEADING_NUMBER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LEADING_NUMBER_size() throws FMLManipulationException {
        return (this.fmlBuffer[27].getCount());
    }

    /**
     * Retrieves the value of the 'PABX_ISSUE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PABX_ISSUE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PABX_ISSUE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[28].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'PABX_ISSUE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'PABX_ISSUE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PABX_ISSUE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[28].getCount());
    }

    /**
     * Retrieves the value of the 'EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[29].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'EFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_EFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[29].getCount());
    }

    /**
     * Retrieves the value of the 'EXPIRATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EXPIRATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[30].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'EXPIRATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_EXPIRATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[30].getCount());
    }

    /**
     * Retrieves the value of the 'ACTIVE_PABX' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ACTIVE_PABX' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACTIVE_PABX(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[31].getValue(nIndex)));
    }

    /**
     * Retrieves number of values defined for 'ACTIVE_PABX' field in the FML buffer.
     *
     * @return Number of values defined for 'ACTIVE_PABX' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACTIVE_PABX_size() throws FMLManipulationException {
        return (this.fmlBuffer[31].getCount());
    }

    /**
     * Retrieves the value of the 'PABX_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PABX_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PABX_TYPE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[32].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'PABX_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'PABX_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PABX_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[32].getCount());
    }

    /**
     * Retrieves the value of the 'CONNECT_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'CONNECT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CONNECT_TYPE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[33].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'CONNECT_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'CONNECT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CONNECT_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[33].getCount());
    }

    /**
     * Retrieves the value of the 'PABX_DESC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PABX_DESC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PABX_DESC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[34].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'PABX_DESC' field in the FML buffer.
     *
     * @return Number of values defined for 'PABX_DESC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PABX_DESC_size() throws FMLManipulationException {
        return (this.fmlBuffer[34].getCount());
    }

    /**
     * Retrieves the value of the 'OWNER' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'OWNER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_OWNER(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[35].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'OWNER' field in the FML buffer.
     *
     * @return Number of values defined for 'OWNER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_OWNER_size() throws FMLManipulationException {
        return (this.fmlBuffer[35].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESS' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ADDRESS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADDRESS(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[36].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'ADDRESS' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESS_size() throws FMLManipulationException {
        return (this.fmlBuffer[36].getCount());
    }

    /**
     * Retrieves the value of the 'RESPONSIBLE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'RESPONSIBLE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_RESPONSIBLE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[37].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'RESPONSIBLE' field in the FML buffer.
     *
     * @return Number of values defined for 'RESPONSIBLE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_RESPONSIBLE_size() throws FMLManipulationException {
        return (this.fmlBuffer[37].getCount());
    }

    /**
     * Retrieves the value of the 'PHONE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PHONE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PHONE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[38].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'PHONE' field in the FML buffer.
     *
     * @return Number of values defined for 'PHONE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PHONE_size() throws FMLManipulationException {
        return (this.fmlBuffer[38].getCount());
    }

    /**
     * Retrieves the value of the 'SIP_MAIN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SIP_MAIN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SIP_MAIN(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[39].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'SIP_MAIN' field in the FML buffer.
     *
     * @return Number of values defined for 'SIP_MAIN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SIP_MAIN_size() throws FMLManipulationException {
        return (this.fmlBuffer[39].getCount());
    }

    /**
     * Retrieves the value of the 'AUTO_ACTIVATE_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'AUTO_ACTIVATE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_AUTO_ACTIVATE_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[40].getValue(nIndex)));
    }

    /**
     * Retrieves number of values defined for 'AUTO_ACTIVATE_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'AUTO_ACTIVATE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_AUTO_ACTIVATE_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[40].getCount());
    }

    /**
     * Retrieves the value of the 'ERRORDESC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ERRORDESC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ERRORDESC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[41].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'ERRORDESC' field in the FML buffer.
     *
     * @return Number of values defined for 'ERRORDESC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ERRORDESC_size() throws FMLManipulationException {
        return (this.fmlBuffer[41].getCount());
    }
}