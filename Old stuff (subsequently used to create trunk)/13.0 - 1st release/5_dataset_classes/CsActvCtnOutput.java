/*
 * CsActvCtnOutput.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service.parameters;

import bea.jolt.pool.Result;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;

/**
 * @author  Ninja
 *
 * CsActvCtnOutput class.
 */
public class CsActvCtnOutput extends ServiceOutput {

    /**
     * Creates a new instance of CsActvCtnOutput.
     *
     * @throws FMLManipulationException
     */
    public CsActvCtnOutput(int nApplicationStatus) throws FMLManipulationException {
        createFmlBuffer();
        setApplicationCode(nApplicationStatus);
    }

    public CsActvCtnOutput() {
    }

    /**
     * Creates a new instance of CsActvCtnOutput.
     *
     * @param ds Output dataset from CsActvCtn service.
     * @throws FMLManipulationException
     */
    public CsActvCtnOutput(Result ds) throws FMLManipulationException {
        createFmlBuffer();
        populateFmlBuffer(ds);
    }

    /**
     * Populates the FML buffer.
     *
     * @throws FMLManipulationException
     */
    private void createFmlBuffer() throws FMLManipulationException {
        this.fmlBuffer = new FmlField[23];
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
        this.fmlBuffer[17] = new FmlField("MSISDN", FmlField.TYPE_STRING, 21, null, 17, 100);
        this.fmlBuffer[18] = new FmlField("NL", FmlField.TYPE_STRING, 4, null, 18, 100);
        this.fmlBuffer[19] = new FmlField("CODE", FmlField.TYPE_INTEGER, -1, null, 19, 100);
        this.fmlBuffer[20] = new FmlField("SUBSCRIBER_NO", FmlField.TYPE_STRING, 21, null, 20, 100);
        this.fmlBuffer[21] = new FmlField("FEATURE_CODE", FmlField.TYPE_STRING, 7, null, 21, 100);
        this.fmlBuffer[22] = new FmlField("CYCLE_CODE", FmlField.TYPE_SHORT, -1, null, 22, 1);
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
     * Retrieves the value of the 'MSISDN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'MSISDN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MSISDN(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[17].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'MSISDN' field in the FML buffer.
     *
     * @return Number of values defined for 'MSISDN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MSISDN_size() throws FMLManipulationException {
        return (this.fmlBuffer[17].getCount());
    }

    /**
     * Retrieves the value of the 'NL' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'NL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NL(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[18].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NL' field in the FML buffer.
     *
     * @return Number of values defined for 'NL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NL_size() throws FMLManipulationException {
        return (this.fmlBuffer[18].getCount());
    }

    /**
     * Retrieves the value of the 'CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CODE(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[19].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[19].getCount());
    }

    /**
     * Retrieves the value of the 'SUBSCRIBER_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'SUBSCRIBER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUBSCRIBER_NO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[20].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'SUBSCRIBER_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'SUBSCRIBER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SUBSCRIBER_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[20].getCount());
    }

    /**
     * Retrieves the value of the 'FEATURE_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'FEATURE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FEATURE_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[21].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'FEATURE_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FEATURE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FEATURE_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[21].getCount());
    }

    /**
     * Retrieves the value of the 'CYCLE_CODE' field in the FML buffer.
     *
     * @return Value of 'CYCLE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CYCLE_CODE() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[22].getValue(0)));
    }
}