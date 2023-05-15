package no.netcom.ninja.core.system.tuxedo.service.parameters;

import no.netcom.ninja.core.referencetables.NinjaConfigurationReferenceTable;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;


/**
 * @author  Ninja - Generated by Ninja tools
 */
public class CsSvOrgDepInput extends ServiceInput {
    //// Indicates whether the default values has been loaded from the DB or not
    //private static Boolean defaultValuesPopulated = Boolean.FALSE;
    //// Holds default values for fields in FML buffer
    //private static String defaultValues[] = null;

    /**
     * Creates a new instance of CsSvOrgDepInput
     *
     * @throws FMLManipulationException
     */
    public CsSvOrgDepInput() throws FMLManipulationException {
        // Initialise FML buffer
        fmlBuffer = new FmlField[29];

        //// Get default values from DB
        //synchronized (this.defaultValuesPopulated) {
        //    if (this.defaultValuesPopulated.equals(Boolean.FALSE)) {
        //        defaultValues = getDefaultValues("csSvOrgDep", 29);
        //        this.defaultValuesPopulated = Boolean.TRUE;
        //    }
        //}

        this.fmlBuffer[0] = new FmlField("GENERATION", FmlField.TYPE_INTEGER, -1, null, 0, 1);
        this.fmlBuffer[1] = new FmlField("DIRECTIVE", FmlField.TYPE_INTEGER, -1, NinjaConfigurationReferenceTable.getTuxedoDirective(), 1, 1);
        this.fmlBuffer[2] = new FmlField("FIRST_DIRECTIVE", FmlField.TYPE_INTEGER, -1, null, 2, 1);
        this.fmlBuffer[3] = new FmlField("SECOND_DIRECTIVE", FmlField.TYPE_INTEGER, -1, null, 3, 1);
        this.fmlBuffer[4] = new FmlField("OPERATOR_ID", FmlField.TYPE_INTEGER, -1, NinjaConfigurationReferenceTable.getDefaultFokusOperatorId(), 4, 1);
        this.fmlBuffer[5] = new FmlField("APPLICATION_ID", FmlField.TYPE_STRING, 7, NinjaConfigurationReferenceTable.getApplicationId(), 5, 1);
        this.fmlBuffer[6] = new FmlField("TRANSACTION_MODE", FmlField.TYPE_BYTE, -1, NinjaConfigurationReferenceTable.getTuxedoTransactionMode(), 6, 1);
        this.fmlBuffer[7] = new FmlField("RUN_DATE", FmlField.TYPE_STRING, 9, null, 7, 1);
        this.fmlBuffer[8] = new FmlField("MARKET_CODE", FmlField.TYPE_STRING, 4, NinjaConfigurationReferenceTable.getDefaultMarket(), 8, 1);
        this.fmlBuffer[9] = new FmlField("SVC_STATUS", FmlField.TYPE_BYTE, -1, null, 9, 1);
        this.fmlBuffer[10] = new FmlField("LAST_UPDATE_DATE", FmlField.TYPE_STRING, 15, null, 10, 1);
        this.fmlBuffer[11] = new FmlField("LAST_UPDATE_STAMP", FmlField.TYPE_SHORT, -1, null, 11, 1);
        this.fmlBuffer[12] = new FmlField("ENV_CODE", FmlField.TYPE_STRING, 11, NinjaConfigurationReferenceTable.getFokusEnvironmentCode(), 12, 1);
        this.fmlBuffer[13] = new FmlField("SESSION_ID", FmlField.TYPE_INTEGER, -1, NinjaConfigurationReferenceTable.getTuxedoSessionId(), 13, 1);
        this.fmlBuffer[14] = new FmlField("ONLINE_TRX_NO", FmlField.TYPE_INTEGER, -1, NinjaConfigurationReferenceTable.getTuxedoOnlineTrxNo(), 14, 1);
        this.fmlBuffer[15] = new FmlField("GROUP_TRX_ID", FmlField.TYPE_INTEGER, -1, null, 15, 1);
        this.fmlBuffer[16] = new FmlField("ROWCOUNT", FmlField.TYPE_INTEGER, -1, null, 16, 1);
        this.fmlBuffer[17] = new FmlField("ROWMODE", FmlField.TYPE_BYTE, -1, null, 17, 50);
        this.fmlBuffer[18] = new FmlField("ROWID", FmlField.TYPE_STRING, 19, null, 18, 50);
        this.fmlBuffer[19] = new FmlField("ORG_CODE", FmlField.TYPE_STRING, 10, null, 19, 50);
        this.fmlBuffer[20] = new FmlField("DEPARTMENT_CD", FmlField.TYPE_STRING, 5, null, 20, 50);
        this.fmlBuffer[21] = new FmlField("SYS_CREATION_DATE", FmlField.TYPE_STRING, 15, null, 21, 50);
        this.fmlBuffer[22] = new FmlField("SYS_UPDATE_DATE", FmlField.TYPE_STRING, 15, null, 22, 50);
        this.fmlBuffer[23] = new FmlField("ORGDEPRECOPERATOR_ID", FmlField.TYPE_INTEGER, -1, null, 23, 50);
        this.fmlBuffer[24] = new FmlField("ORGDEPRECAPPLICATION_ID", FmlField.TYPE_STRING, 7, null, 24, 50);
        this.fmlBuffer[25] = new FmlField("DL_SERVICE_CODE", FmlField.TYPE_STRING, 6, null, 25, 50);
        this.fmlBuffer[26] = new FmlField("DL_UPDATE_STAMP", FmlField.TYPE_SHORT, -1, null, 26, 50);
        this.fmlBuffer[27] = new FmlField("DEPT_DESC", FmlField.TYPE_STRING, 51, null, 27, 50);
        this.fmlBuffer[28] = new FmlField("ERRORDESC", FmlField.TYPE_STRING, 161, null, 28, 50);
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
     * @param value Default value: :NinjaConfigurationReferenceTable.getTuxedoDirective().
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
     * @param value Default value: :NinjaConfigurationReferenceTable.getDefaultFokusOperatorId().
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
     * @param value Default value: :NinjaConfigurationReferenceTable.getApplicationId(), Maximum length: 7.
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
     * @param value Default value: :NinjaConfigurationReferenceTable.getTuxedoTransactionMode().
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
     * @param value Default value: :NinjaConfigurationReferenceTable.getDefaultMarket(), Maximum length: 4.
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
     * @param value Default value: :NinjaConfigurationReferenceTable.getFokusEnvironmentCode(), Maximum length: 11.
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
     * @param value Default value: :NinjaConfigurationReferenceTable.getTuxedoSessionId().
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
     * @param value Default value: :NinjaConfigurationReferenceTable.getTuxedoOnlineTrxNo().
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
     * Retrieves the value of the 'ROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'ROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[16].getValue(0));
    }

    /**
     * Sets the value of the 'ROWCOUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_ROWCOUNT(Integer value) throws FMLManipulationException {
        this.fmlBuffer[16].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'ROWMODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ROWMODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ROWMODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[17].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'ROWMODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_ROWMODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[17].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'ROWMODE' field in the FML buffer.
     *
     * @return Number of values defined for 'ROWMODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ROWMODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[17].getCount());
    }

    /**
     * Retrieves the value of the 'ROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[18].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_ROWID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[18].setValue(nIndex, value);
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
     * Retrieves the value of the 'ORG_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ORG_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ORG_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[19].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ORG_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 10.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_ORG_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[19].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ORG_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'ORG_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ORG_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[19].getCount());
    }

    /**
     * Retrieves the value of the 'DEPARTMENT_CD' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'DEPARTMENT_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DEPARTMENT_CD(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[20].getValue(nIndex));
    }

    /**
     * Sets the value of the 'DEPARTMENT_CD' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_DEPARTMENT_CD(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[20].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'DEPARTMENT_CD' field in the FML buffer.
     *
     * @return Number of values defined for 'DEPARTMENT_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DEPARTMENT_CD_size() throws FMLManipulationException {
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
     * Sets the value of the 'SYS_CREATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SYS_CREATION_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[21].setValue(nIndex, value);
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
     * Sets the value of the 'SYS_UPDATE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SYS_UPDATE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[22].setValue(nIndex, value);
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
     * Retrieves the value of the 'ORGDEPRECOPERATOR_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ORGDEPRECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ORGDEPRECOPERATOR_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[23].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ORGDEPRECOPERATOR_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_ORGDEPRECOPERATOR_ID(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[23].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ORGDEPRECOPERATOR_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'ORGDEPRECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ORGDEPRECOPERATOR_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[23].getCount());
    }

    /**
     * Retrieves the value of the 'ORGDEPRECAPPLICATION_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ORGDEPRECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ORGDEPRECAPPLICATION_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[24].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ORGDEPRECAPPLICATION_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_ORGDEPRECAPPLICATION_ID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[24].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ORGDEPRECAPPLICATION_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'ORGDEPRECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ORGDEPRECAPPLICATION_ID_size() throws FMLManipulationException {
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
     * Sets the value of the 'DL_SERVICE_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_DL_SERVICE_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[25].setValue(nIndex, value);
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
     * Sets the value of the 'DL_UPDATE_STAMP' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_DL_UPDATE_STAMP(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[26].setValue(nIndex, TypeConverter.integerToShort(value));
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
     * Retrieves the value of the 'DEPT_DESC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'DEPT_DESC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DEPT_DESC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[27].getValue(nIndex));
    }

    /**
     * Sets the value of the 'DEPT_DESC' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 51.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_DEPT_DESC(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[27].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'DEPT_DESC' field in the FML buffer.
     *
     * @return Number of values defined for 'DEPT_DESC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DEPT_DESC_size() throws FMLManipulationException {
        return (this.fmlBuffer[27].getCount());
    }

    /**
     * Retrieves the value of the 'ERRORDESC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ERRORDESC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ERRORDESC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[28].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ERRORDESC' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 161.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_ERRORDESC(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[28].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ERRORDESC' field in the FML buffer.
     *
     * @return Number of values defined for 'ERRORDESC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ERRORDESC_size() throws FMLManipulationException {
        return (this.fmlBuffer[28].getCount());
    }
}