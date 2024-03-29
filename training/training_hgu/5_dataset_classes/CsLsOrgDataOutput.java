package no.netcom.ninja.core.system.tuxedo.service.parameters;

import bea.jolt.pool.Result;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;

/**
 * @author  Ninja - Generated by Ninja tools
 */
public class CsLsOrgDataOutput extends ServiceOutput {

    /**
     * Creates a new instance of CsLsOrgDataOutput.
     *
     * @throws FMLManipulationException
     */
    public CsLsOrgDataOutput(int nApplicationStatus) throws FMLManipulationException {
        createFmlBuffer();
        setApplicationCode(nApplicationStatus);
    }

    public CsLsOrgDataOutput() {
    }

    /**
     * Creates a new instance of CsLsOrgDataOutput.
     *
     * @param ds Output dataset from CsLsOrgData service.
     * @throws FMLManipulationException
     */
    public CsLsOrgDataOutput(Result ds) throws FMLManipulationException {
        createFmlBuffer();
        populateFmlBuffer(ds);
    }

    /**
     * Populates the FML buffer.
     *
     * @throws FMLManipulationException
     */
    private void createFmlBuffer() throws FMLManipulationException {
        this.fmlBuffer = new FmlField[13];
        this.fmlBuffer[0] = new FmlField("GENERATION", FmlField.TYPE_INTEGER, -1, null, 0, 1);
        this.fmlBuffer[1] = new FmlField("MOREROWS", FmlField.TYPE_SHORT, -1, null, 1, 1);
        this.fmlBuffer[2] = new FmlField("ROWCOUNT", FmlField.TYPE_INTEGER, -1, null, 2, 1);
        this.fmlBuffer[3] = new FmlField("ROWID", FmlField.TYPE_STRING, 19, null, 3, 600);
        this.fmlBuffer[4] = new FmlField("ORG_CODE", FmlField.TYPE_STRING, 10, null, 4, 600);
        this.fmlBuffer[5] = new FmlField("SYS_CREATION_DATE", FmlField.TYPE_STRING, 15, null, 5, 600);
        this.fmlBuffer[6] = new FmlField("SYS_UPDATE_DATE", FmlField.TYPE_STRING, 15, null, 6, 600);
        this.fmlBuffer[7] = new FmlField("OPERATOR_ID", FmlField.TYPE_INTEGER, -1, null, 7, 600);
        this.fmlBuffer[8] = new FmlField("APPLICATION_ID", FmlField.TYPE_STRING, 7, null, 8, 600);
        this.fmlBuffer[9] = new FmlField("DL_SERVICE_CODE", FmlField.TYPE_STRING, 6, null, 9, 600);
        this.fmlBuffer[10] = new FmlField("DL_UPDATE_STAMP", FmlField.TYPE_SHORT, -1, null, 10, 600);
        this.fmlBuffer[11] = new FmlField("ORG_DESC", FmlField.TYPE_STRING, 51, null, 11, 600);
        this.fmlBuffer[12] = new FmlField("TOTALCOUNT", FmlField.TYPE_INTEGER, -1, null, 12, 1);
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
     * Retrieves the value of the 'MOREROWS' field in the FML buffer.
     *
     * @return Value of 'MOREROWS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_MOREROWS() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[1].getValue(0)));
    }

    /**
     * Retrieves the value of the 'ROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'ROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[2].getValue(0));
    }

    /**
     * Retrieves the value of the 'ROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'ROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[3].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'ROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'ROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[3].getCount());
    }

    /**
     * Retrieves the value of the 'ORG_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'ORG_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ORG_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[4].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'ORG_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'ORG_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ORG_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[4].getCount());
    }

    /**
     * Retrieves the value of the 'SYS_CREATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'SYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SYS_CREATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[5].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'SYS_CREATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'SYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SYS_CREATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[5].getCount());
    }

    /**
     * Retrieves the value of the 'SYS_UPDATE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'SYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SYS_UPDATE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[6].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'SYS_UPDATE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'SYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SYS_UPDATE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[6].getCount());
    }

    /**
     * Retrieves the value of the 'OPERATOR_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'OPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_OPERATOR_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[7].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'OPERATOR_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'OPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_OPERATOR_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[7].getCount());
    }

    /**
     * Retrieves the value of the 'APPLICATION_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'APPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_APPLICATION_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[8].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'APPLICATION_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'APPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_APPLICATION_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[8].getCount());
    }

    /**
     * Retrieves the value of the 'DL_SERVICE_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'DL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DL_SERVICE_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[9].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'DL_SERVICE_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'DL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DL_SERVICE_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[9].getCount());
    }

    /**
     * Retrieves the value of the 'DL_UPDATE_STAMP' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'DL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_DL_UPDATE_STAMP(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[10].getValue(nIndex)));
    }

    /**
     * Retrieves number of values defined for 'DL_UPDATE_STAMP' field in the FML buffer.
     *
     * @return Number of values defined for 'DL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DL_UPDATE_STAMP_size() throws FMLManipulationException {
        return (this.fmlBuffer[10].getCount());
    }

    /**
     * Retrieves the value of the 'ORG_DESC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'ORG_DESC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ORG_DESC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[11].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'ORG_DESC' field in the FML buffer.
     *
     * @return Number of values defined for 'ORG_DESC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ORG_DESC_size() throws FMLManipulationException {
        return (this.fmlBuffer[11].getCount());
    }

    /**
     * Retrieves the value of the 'TOTALCOUNT' field in the FML buffer.
     *
     * @return Value of 'TOTALCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_TOTALCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[12].getValue(0));
    }
}