package no.netcom.ninja.core.system.tuxedo.service.parameters;

import bea.jolt.pool.Result;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;

/**
 * @author  Ninja - Generated by Ninja tools
 */
public class CsLsSubPdpOutput extends ServiceOutput {

    /**
     * Creates a new instance of CsLsSubPdpOutput.
     *
     * @throws FMLManipulationException
     */
    public CsLsSubPdpOutput(int nApplicationStatus) throws FMLManipulationException {
        createFmlBuffer();
        setApplicationCode(nApplicationStatus);
    }

    public CsLsSubPdpOutput() {
    }

    /**
     * Creates a new instance of CsLsSubPdpOutput.
     *
     * @param ds Output dataset from CsLsSubPdp service.
     * @throws FMLManipulationException
     */
    public CsLsSubPdpOutput(Result ds) throws FMLManipulationException {
        createFmlBuffer();
        populateFmlBuffer(ds);
    }

    /**
     * Populates the FML buffer.
     *
     * @throws FMLManipulationException
     */
    private void createFmlBuffer() throws FMLManipulationException {
        this.fmlBuffer = new FmlField[16];
        this.fmlBuffer[0] = new FmlField("GENERATION", FmlField.TYPE_INTEGER, -1, null, 0, 1);
        this.fmlBuffer[1] = new FmlField("ROWCOUNT", FmlField.TYPE_INTEGER, -1, null, 1, 1);
        this.fmlBuffer[2] = new FmlField("ROWID", FmlField.TYPE_STRING, 19, null, 2, 10);
        this.fmlBuffer[3] = new FmlField("SUBSCRIBER_ID", FmlField.TYPE_INTEGER, -1, null, 3, 10);
        this.fmlBuffer[4] = new FmlField("PDP_ID", FmlField.TYPE_INTEGER, -1, null, 4, 10);
        this.fmlBuffer[5] = new FmlField("EFFECTIVE_DATE", FmlField.TYPE_STRING, 15, null, 5, 10);
        this.fmlBuffer[6] = new FmlField("SYS_CREATION_DATE", FmlField.TYPE_STRING, 15, null, 6, 10);
        this.fmlBuffer[7] = new FmlField("SYS_UPDATE_DATE", FmlField.TYPE_STRING, 15, null, 7, 10);
        this.fmlBuffer[8] = new FmlField("OPERATOR_ID", FmlField.TYPE_INTEGER, -1, null, 8, 10);
        this.fmlBuffer[9] = new FmlField("APPLICATION_ID", FmlField.TYPE_STRING, 7, null, 9, 10);
        this.fmlBuffer[10] = new FmlField("DL_SERVICE_CODE", FmlField.TYPE_STRING, 6, null, 10, 10);
        this.fmlBuffer[11] = new FmlField("DL_UPDATE_STAMP", FmlField.TYPE_SHORT, -1, null, 11, 10);
        this.fmlBuffer[12] = new FmlField("PDP", FmlField.TYPE_STRING, 16, null, 12, 10);
        this.fmlBuffer[13] = new FmlField("FEATURE_CODE", FmlField.TYPE_STRING, 7, null, 13, 10);
        this.fmlBuffer[14] = new FmlField("EXPIRATION_DATE", FmlField.TYPE_STRING, 15, null, 14, 10);
        this.fmlBuffer[15] = new FmlField("APN", FmlField.TYPE_STRING, 64, null, 15, 10);
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
     * Retrieves the value of the 'ROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'ROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[1].getValue(0));
    }

    /**
     * Retrieves the value of the 'ROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10).
     * @return Value of 'ROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[2].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'ROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'ROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[2].getCount());
    }

    /**
     * Retrieves the value of the 'SUBSCRIBER_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10).
     * @return Value of 'SUBSCRIBER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_SUBSCRIBER_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[3].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'SUBSCRIBER_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'SUBSCRIBER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SUBSCRIBER_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[3].getCount());
    }

    /**
     * Retrieves the value of the 'PDP_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10).
     * @return Value of 'PDP_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PDP_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[4].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'PDP_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'PDP_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PDP_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[4].getCount());
    }

    /**
     * Retrieves the value of the 'EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10).
     * @return Value of 'EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[5].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'EFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_EFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[5].getCount());
    }

    /**
     * Retrieves the value of the 'SYS_CREATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10).
     * @return Value of 'SYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SYS_CREATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[6].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'SYS_CREATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'SYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SYS_CREATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[6].getCount());
    }

    /**
     * Retrieves the value of the 'SYS_UPDATE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10).
     * @return Value of 'SYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SYS_UPDATE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[7].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'SYS_UPDATE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'SYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SYS_UPDATE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[7].getCount());
    }

    /**
     * Retrieves the value of the 'OPERATOR_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10).
     * @return Value of 'OPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_OPERATOR_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[8].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'OPERATOR_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'OPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_OPERATOR_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[8].getCount());
    }

    /**
     * Retrieves the value of the 'APPLICATION_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10).
     * @return Value of 'APPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_APPLICATION_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[9].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'APPLICATION_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'APPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_APPLICATION_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[9].getCount());
    }

    /**
     * Retrieves the value of the 'DL_SERVICE_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10).
     * @return Value of 'DL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DL_SERVICE_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[10].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'DL_SERVICE_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'DL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DL_SERVICE_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[10].getCount());
    }

    /**
     * Retrieves the value of the 'DL_UPDATE_STAMP' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10).
     * @return Value of 'DL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_DL_UPDATE_STAMP(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[11].getValue(nIndex)));
    }

    /**
     * Retrieves number of values defined for 'DL_UPDATE_STAMP' field in the FML buffer.
     *
     * @return Number of values defined for 'DL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DL_UPDATE_STAMP_size() throws FMLManipulationException {
        return (this.fmlBuffer[11].getCount());
    }

    /**
     * Retrieves the value of the 'PDP' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10).
     * @return Value of 'PDP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PDP(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[12].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'PDP' field in the FML buffer.
     *
     * @return Number of values defined for 'PDP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PDP_size() throws FMLManipulationException {
        return (this.fmlBuffer[12].getCount());
    }

    /**
     * Retrieves the value of the 'FEATURE_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10).
     * @return Value of 'FEATURE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FEATURE_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[13].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'FEATURE_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FEATURE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FEATURE_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[13].getCount());
    }

    /**
     * Retrieves the value of the 'EXPIRATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10).
     * @return Value of 'EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EXPIRATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[14].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'EXPIRATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_EXPIRATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[14].getCount());
    }

    /**
     * Retrieves the value of the 'APN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10).
     * @return Value of 'APN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_APN(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[15].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'APN' field in the FML buffer.
     *
     * @return Number of values defined for 'APN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_APN_size() throws FMLManipulationException {
        return (this.fmlBuffer[15].getCount());
    }
}