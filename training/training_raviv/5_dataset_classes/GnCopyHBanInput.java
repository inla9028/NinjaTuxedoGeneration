package no.netcom.ninja.core.system.tuxedo.service.parameters;

import no.netcom.ninja.core.referencetables.NinjaConfigurationReferenceTable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;


/**
 * @author  Ninja - Generated by Ninja tools
 */
public class GnCopyHBanInput extends ServiceInput {
    //// Indicates whether the default values has been loaded from the DB or not
    //private static Boolean defaultValuesPopulated = Boolean.FALSE;
    //// Holds default values for fields in FML buffer
    //private static String defaultValues[] = null;

    /**
     * Creates a new instance of GnCopyHBanInput
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnCopyHBanInput() throws EnvironmentException, FMLManipulationException {
        // Initialise FML buffer
        fmlBuffer = new FmlField[44];

        //// Get default values from DB
        //synchronized (this.defaultValuesPopulated) {
        //    if (this.defaultValuesPopulated.equals(Boolean.FALSE)) {
        //        defaultValues = getDefaultValues("gnCopyHBan", 44);
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
        this.fmlBuffer[16] = new FmlField("SOURCEBAN", FmlField.TYPE_INTEGER, -1, null, 16, 1);
        this.fmlBuffer[17] = new FmlField("PARENTBAN", FmlField.TYPE_INTEGER, -1, null, 17, 1);
        this.fmlBuffer[18] = new FmlField("TARGETBAN", FmlField.TYPE_INTEGER, -1, null, 18, 1);
        this.fmlBuffer[19] = new FmlField("TREECYCLE", FmlField.TYPE_SHORT, -1, null, 19, 1);
        this.fmlBuffer[20] = new FmlField("TREEROOTBAN", FmlField.TYPE_INTEGER, -1, null, 20, 1);
        this.fmlBuffer[21] = new FmlField("ACT_CODE", FmlField.TYPE_STRING, 4, null, 21, 1);
        this.fmlBuffer[22] = new FmlField("ACT_REASON", FmlField.TYPE_STRING, 5, null, 22, 1);
        this.fmlBuffer[23] = new FmlField("SUSP_RC_RATE_TYPE", FmlField.TYPE_BYTE, -1, null, 23, 1);
        this.fmlBuffer[24] = new FmlField("MEMO_CTN", FmlField.TYPE_STRING, 21, null, 24, 1);
        this.fmlBuffer[25] = new FmlField("USER_TEXT", FmlField.TYPE_STRING, 2001, null, 25, 1);
        this.fmlBuffer[26] = new FmlField("MEMO_SOURCE", FmlField.TYPE_BYTE, -1, null, 26, 1);
        this.fmlBuffer[27] = new FmlField("PARAM_COUNT", FmlField.TYPE_INTEGER, -1, null, 27, 1);
        this.fmlBuffer[28] = new FmlField("P1", FmlField.TYPE_STRING, 51, null, 28, 1);
        this.fmlBuffer[29] = new FmlField("P2", FmlField.TYPE_STRING, 51, null, 29, 1);
        this.fmlBuffer[30] = new FmlField("P3", FmlField.TYPE_STRING, 51, null, 30, 1);
        this.fmlBuffer[31] = new FmlField("P4", FmlField.TYPE_STRING, 51, null, 31, 1);
        this.fmlBuffer[32] = new FmlField("P5", FmlField.TYPE_STRING, 51, null, 32, 1);
        this.fmlBuffer[33] = new FmlField("P6", FmlField.TYPE_STRING, 51, null, 33, 1);
        this.fmlBuffer[34] = new FmlField("P7", FmlField.TYPE_STRING, 51, null, 34, 1);
        this.fmlBuffer[35] = new FmlField("P8", FmlField.TYPE_STRING, 51, null, 35, 1);
        this.fmlBuffer[36] = new FmlField("P9", FmlField.TYPE_STRING, 51, null, 36, 1);
        this.fmlBuffer[37] = new FmlField("P10", FmlField.TYPE_STRING, 51, null, 37, 1);
        this.fmlBuffer[38] = new FmlField("MEMO_AMT", FmlField.TYPE_DOUBLE, -1, null, 38, 1);
        this.fmlBuffer[39] = new FmlField("RMS_ACT_CODE", FmlField.TYPE_STRING, 5, null, 39, 1);
        this.fmlBuffer[40] = new FmlField("CHARGE_AMT", FmlField.TYPE_DOUBLE, -1, null, 40, 1);
        this.fmlBuffer[41] = new FmlField("CHARGE_AMT_IND", FmlField.TYPE_BYTE, -1, null, 41, 1);
        this.fmlBuffer[42] = new FmlField("WAIVE_REASON", FmlField.TYPE_STRING, 7, null, 42, 1);
        this.fmlBuffer[43] = new FmlField("WAIVE_IND", FmlField.TYPE_BYTE, -1, null, 43, 1);
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
     * Retrieves the value of the 'SOURCEBAN' field in the FML buffer.
     *
     * @return Value of 'SOURCEBAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_SOURCEBAN() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[16].getValue(0));
    }

    /**
     * Sets the value of the 'SOURCEBAN' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_SOURCEBAN(Integer value) throws FMLManipulationException {
        this.fmlBuffer[16].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PARENTBAN' field in the FML buffer.
     *
     * @return Value of 'PARENTBAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PARENTBAN() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[17].getValue(0));
    }

    /**
     * Sets the value of the 'PARENTBAN' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PARENTBAN(Integer value) throws FMLManipulationException {
        this.fmlBuffer[17].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'TARGETBAN' field in the FML buffer.
     *
     * @return Value of 'TARGETBAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_TARGETBAN() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[18].getValue(0));
    }

    /**
     * Sets the value of the 'TARGETBAN' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_TARGETBAN(Integer value) throws FMLManipulationException {
        this.fmlBuffer[18].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'TREECYCLE' field in the FML buffer.
     *
     * @return Value of 'TREECYCLE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_TREECYCLE() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[19].getValue(0)));
    }

    /**
     * Sets the value of the 'TREECYCLE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_TREECYCLE(Integer value) throws FMLManipulationException {
        this.fmlBuffer[19].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'TREEROOTBAN' field in the FML buffer.
     *
     * @return Value of 'TREEROOTBAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_TREEROOTBAN() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[20].getValue(0));
    }

    /**
     * Sets the value of the 'TREEROOTBAN' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_TREEROOTBAN(Integer value) throws FMLManipulationException {
        this.fmlBuffer[20].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'ACT_CODE' field in the FML buffer.
     *
     * @return Value of 'ACT_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACT_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[21].getValue(0));
    }

    /**
     * Sets the value of the 'ACT_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @throws FMLManipulationException
     */
    public void set_ACT_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[21].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'ACT_REASON' field in the FML buffer.
     *
     * @return Value of 'ACT_REASON' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACT_REASON() throws FMLManipulationException {
        return ((String) this.fmlBuffer[22].getValue(0));
    }

    /**
     * Sets the value of the 'ACT_REASON' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @throws FMLManipulationException
     */
    public void set_ACT_REASON(String value) throws FMLManipulationException {
        this.fmlBuffer[22].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'SUSP_RC_RATE_TYPE' field in the FML buffer.
     *
     * @return Value of 'SUSP_RC_RATE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUSP_RC_RATE_TYPE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[23].getValue(0)));
    }

    /**
     * Sets the value of the 'SUSP_RC_RATE_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_SUSP_RC_RATE_TYPE(String value) throws FMLManipulationException {
        this.fmlBuffer[23].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'MEMO_CTN' field in the FML buffer.
     *
     * @return Value of 'MEMO_CTN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MEMO_CTN() throws FMLManipulationException {
        return ((String) this.fmlBuffer[24].getValue(0));
    }

    /**
     * Sets the value of the 'MEMO_CTN' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @throws FMLManipulationException
     */
    public void set_MEMO_CTN(String value) throws FMLManipulationException {
        this.fmlBuffer[24].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'USER_TEXT' field in the FML buffer.
     *
     * @return Value of 'USER_TEXT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_USER_TEXT() throws FMLManipulationException {
        return ((String) this.fmlBuffer[25].getValue(0));
    }

    /**
     * Sets the value of the 'USER_TEXT' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 2001.
     * @throws FMLManipulationException
     */
    public void set_USER_TEXT(String value) throws FMLManipulationException {
        this.fmlBuffer[25].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'MEMO_SOURCE' field in the FML buffer.
     *
     * @return Value of 'MEMO_SOURCE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MEMO_SOURCE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[26].getValue(0)));
    }

    /**
     * Sets the value of the 'MEMO_SOURCE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_MEMO_SOURCE(String value) throws FMLManipulationException {
        this.fmlBuffer[26].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'PARAM_COUNT' field in the FML buffer.
     *
     * @return Value of 'PARAM_COUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PARAM_COUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[27].getValue(0));
    }

    /**
     * Sets the value of the 'PARAM_COUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PARAM_COUNT(Integer value) throws FMLManipulationException {
        this.fmlBuffer[27].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'P1' field in the FML buffer.
     *
     * @return Value of 'P1' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P1() throws FMLManipulationException {
        return ((String) this.fmlBuffer[28].getValue(0));
    }

    /**
     * Sets the value of the 'P1' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 51.
     * @throws FMLManipulationException
     */
    public void set_P1(String value) throws FMLManipulationException {
        this.fmlBuffer[28].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'P2' field in the FML buffer.
     *
     * @return Value of 'P2' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P2() throws FMLManipulationException {
        return ((String) this.fmlBuffer[29].getValue(0));
    }

    /**
     * Sets the value of the 'P2' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 51.
     * @throws FMLManipulationException
     */
    public void set_P2(String value) throws FMLManipulationException {
        this.fmlBuffer[29].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'P3' field in the FML buffer.
     *
     * @return Value of 'P3' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P3() throws FMLManipulationException {
        return ((String) this.fmlBuffer[30].getValue(0));
    }

    /**
     * Sets the value of the 'P3' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 51.
     * @throws FMLManipulationException
     */
    public void set_P3(String value) throws FMLManipulationException {
        this.fmlBuffer[30].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'P4' field in the FML buffer.
     *
     * @return Value of 'P4' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P4() throws FMLManipulationException {
        return ((String) this.fmlBuffer[31].getValue(0));
    }

    /**
     * Sets the value of the 'P4' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 51.
     * @throws FMLManipulationException
     */
    public void set_P4(String value) throws FMLManipulationException {
        this.fmlBuffer[31].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'P5' field in the FML buffer.
     *
     * @return Value of 'P5' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P5() throws FMLManipulationException {
        return ((String) this.fmlBuffer[32].getValue(0));
    }

    /**
     * Sets the value of the 'P5' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 51.
     * @throws FMLManipulationException
     */
    public void set_P5(String value) throws FMLManipulationException {
        this.fmlBuffer[32].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'P6' field in the FML buffer.
     *
     * @return Value of 'P6' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P6() throws FMLManipulationException {
        return ((String) this.fmlBuffer[33].getValue(0));
    }

    /**
     * Sets the value of the 'P6' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 51.
     * @throws FMLManipulationException
     */
    public void set_P6(String value) throws FMLManipulationException {
        this.fmlBuffer[33].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'P7' field in the FML buffer.
     *
     * @return Value of 'P7' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P7() throws FMLManipulationException {
        return ((String) this.fmlBuffer[34].getValue(0));
    }

    /**
     * Sets the value of the 'P7' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 51.
     * @throws FMLManipulationException
     */
    public void set_P7(String value) throws FMLManipulationException {
        this.fmlBuffer[34].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'P8' field in the FML buffer.
     *
     * @return Value of 'P8' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P8() throws FMLManipulationException {
        return ((String) this.fmlBuffer[35].getValue(0));
    }

    /**
     * Sets the value of the 'P8' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 51.
     * @throws FMLManipulationException
     */
    public void set_P8(String value) throws FMLManipulationException {
        this.fmlBuffer[35].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'P9' field in the FML buffer.
     *
     * @return Value of 'P9' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P9() throws FMLManipulationException {
        return ((String) this.fmlBuffer[36].getValue(0));
    }

    /**
     * Sets the value of the 'P9' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 51.
     * @throws FMLManipulationException
     */
    public void set_P9(String value) throws FMLManipulationException {
        this.fmlBuffer[36].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'P10' field in the FML buffer.
     *
     * @return Value of 'P10' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P10() throws FMLManipulationException {
        return ((String) this.fmlBuffer[37].getValue(0));
    }

    /**
     * Sets the value of the 'P10' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 51.
     * @throws FMLManipulationException
     */
    public void set_P10(String value) throws FMLManipulationException {
        this.fmlBuffer[37].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'MEMO_AMT' field in the FML buffer.
     *
     * @return Value of 'MEMO_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_MEMO_AMT() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[38].getValue(0));
    }

    /**
     * Sets the value of the 'MEMO_AMT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_MEMO_AMT(Double value) throws FMLManipulationException {
        this.fmlBuffer[38].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'RMS_ACT_CODE' field in the FML buffer.
     *
     * @return Value of 'RMS_ACT_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_RMS_ACT_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[39].getValue(0));
    }

    /**
     * Sets the value of the 'RMS_ACT_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @throws FMLManipulationException
     */
    public void set_RMS_ACT_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[39].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CHARGE_AMT' field in the FML buffer.
     *
     * @return Value of 'CHARGE_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_CHARGE_AMT() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[40].getValue(0));
    }

    /**
     * Sets the value of the 'CHARGE_AMT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CHARGE_AMT(Double value) throws FMLManipulationException {
        this.fmlBuffer[40].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CHARGE_AMT_IND' field in the FML buffer.
     *
     * @return Value of 'CHARGE_AMT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CHARGE_AMT_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[41].getValue(0)));
    }

    /**
     * Sets the value of the 'CHARGE_AMT_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CHARGE_AMT_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[41].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'WAIVE_REASON' field in the FML buffer.
     *
     * @return Value of 'WAIVE_REASON' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_WAIVE_REASON() throws FMLManipulationException {
        return ((String) this.fmlBuffer[42].getValue(0));
    }

    /**
     * Sets the value of the 'WAIVE_REASON' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @throws FMLManipulationException
     */
    public void set_WAIVE_REASON(String value) throws FMLManipulationException {
        this.fmlBuffer[42].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'WAIVE_IND' field in the FML buffer.
     *
     * @return Value of 'WAIVE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_WAIVE_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[43].getValue(0)));
    }

    /**
     * Sets the value of the 'WAIVE_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_WAIVE_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[43].setValue(0, TypeConverter.stringToByte(value));
    }
}