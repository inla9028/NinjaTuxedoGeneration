package no.netcom.ninja.core.system.tuxedo.service.parameters;

import bea.jolt.pool.Result;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;

/**
 * @author  Ninja - Generated by Ninja tools
 */
public class GnGtAdrItmOutput extends ServiceOutput {

    /**
     * Creates a new instance of GnGtAdrItmOutput.
     *
     * @throws FMLManipulationException
     */
    public GnGtAdrItmOutput(int nApplicationStatus) throws FMLManipulationException {
        createFmlBuffer();
        setApplicationCode(nApplicationStatus);
    }

    public GnGtAdrItmOutput() {
    }

    /**
     * Creates a new instance of GnGtAdrItmOutput.
     *
     * @param ds Output dataset from GnGtAdrItm service.
     * @throws FMLManipulationException
     */
    public GnGtAdrItmOutput(Result ds) throws FMLManipulationException {
        createFmlBuffer();
        populateFmlBuffer(ds);
    }

    /**
     * Populates the FML buffer.
     *
     * @throws FMLManipulationException
     */
    private void createFmlBuffer() throws FMLManipulationException {
        this.fmlBuffer = new FmlField[28];
        this.fmlBuffer[0] = new FmlField("GENERATION", FmlField.TYPE_INTEGER, -1, null, 0, 1);
        this.fmlBuffer[1] = new FmlField("MOREROWS", FmlField.TYPE_SHORT, -1, null, 1, 1);
        this.fmlBuffer[2] = new FmlField("ROWCOUNT", FmlField.TYPE_INTEGER, -1, null, 2, 1);
        this.fmlBuffer[3] = new FmlField("ADDRZIPARR", FmlField.TYPE_STRING, 10, null, 3, 100);
        this.fmlBuffer[4] = new FmlField("ADDRCITYARR", FmlField.TYPE_STRING, 40, null, 4, 100);
        this.fmlBuffer[5] = new FmlField("ADDRSTREETARR", FmlField.TYPE_STRING, 61, null, 5, 100);
        this.fmlBuffer[6] = new FmlField("ROWID", FmlField.TYPE_STRING, 19, null, 6, 100);
        this.fmlBuffer[7] = new FmlField("SEQ_NO", FmlField.TYPE_INTEGER, -1, null, 7, 100);
        this.fmlBuffer[8] = new FmlField("SYS_CREATION_DATE", FmlField.TYPE_STRING, 15, null, 8, 100);
        this.fmlBuffer[9] = new FmlField("SYS_UPDATE_DATE", FmlField.TYPE_STRING, 15, null, 9, 100);
        this.fmlBuffer[10] = new FmlField("OPERATOR_ID", FmlField.TYPE_INTEGER, -1, null, 10, 100);
        this.fmlBuffer[11] = new FmlField("APPLICATION_ID", FmlField.TYPE_STRING, 7, null, 11, 100);
        this.fmlBuffer[12] = new FmlField("DL_SERVICE_CODE", FmlField.TYPE_STRING, 6, null, 12, 100);
        this.fmlBuffer[13] = new FmlField("DL_UPDATE_STAMP", FmlField.TYPE_SHORT, -1, null, 13, 100);
        this.fmlBuffer[14] = new FmlField("ZIP_CODE", FmlField.TYPE_STRING, 10, null, 14, 100);
        this.fmlBuffer[15] = new FmlField("CITY", FmlField.TYPE_STRING, 40, null, 15, 100);
        this.fmlBuffer[16] = new FmlField("STREET_NAME", FmlField.TYPE_STRING, 61, null, 16, 100);
        this.fmlBuffer[17] = new FmlField("HOUSE_LETTER_BEGIN_RANGE", FmlField.TYPE_STRING, 3, null, 17, 100);
        this.fmlBuffer[18] = new FmlField("HOUSE_LETTER_END_RANGE", FmlField.TYPE_STRING, 3, null, 18, 100);
        this.fmlBuffer[19] = new FmlField("HOUSE_NO_BEGIN_RANGE", FmlField.TYPE_STRING, 21, null, 19, 100);
        this.fmlBuffer[20] = new FmlField("HOUSE_NO_END_RANGE", FmlField.TYPE_STRING, 21, null, 20, 100);
        this.fmlBuffer[21] = new FmlField("VALIDATION_TYPE", FmlField.TYPE_BYTE, -1, null, 21, 100);
        this.fmlBuffer[22] = new FmlField("ADR_POB", FmlField.TYPE_STRING, 11, null, 22, 100);
        this.fmlBuffer[23] = new FmlField("ADR_TYPE", FmlField.TYPE_BYTE, -1, null, 23, 100);
        this.fmlBuffer[24] = new FmlField("CANTON", FmlField.TYPE_STRING, 3, null, 24, 100);
        this.fmlBuffer[25] = new FmlField("COUNTY_CODE", FmlField.TYPE_STRING, 3, null, 25, 100);
        this.fmlBuffer[26] = new FmlField("COMMUNITY_NAME", FmlField.TYPE_STRING, 31, null, 26, 100);
        this.fmlBuffer[27] = new FmlField("DISTRICT", FmlField.TYPE_STRING, 41, null, 27, 100);
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
     * Retrieves the value of the 'ADDRZIPARR' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'ADDRZIPARR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADDRZIPARR(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[3].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'ADDRZIPARR' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRZIPARR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRZIPARR_size() throws FMLManipulationException {
        return (this.fmlBuffer[3].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRCITYARR' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'ADDRCITYARR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADDRCITYARR(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[4].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'ADDRCITYARR' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRCITYARR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRCITYARR_size() throws FMLManipulationException {
        return (this.fmlBuffer[4].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRSTREETARR' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'ADDRSTREETARR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADDRSTREETARR(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[5].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'ADDRSTREETARR' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRSTREETARR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRSTREETARR_size() throws FMLManipulationException {
        return (this.fmlBuffer[5].getCount());
    }

    /**
     * Retrieves the value of the 'ROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'ROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[6].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'ROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'ROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[6].getCount());
    }

    /**
     * Retrieves the value of the 'SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[7].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[7].getCount());
    }

    /**
     * Retrieves the value of the 'SYS_CREATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'SYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SYS_CREATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[8].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'SYS_CREATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'SYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SYS_CREATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[8].getCount());
    }

    /**
     * Retrieves the value of the 'SYS_UPDATE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'SYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SYS_UPDATE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[9].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'SYS_UPDATE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'SYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SYS_UPDATE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[9].getCount());
    }

    /**
     * Retrieves the value of the 'OPERATOR_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'OPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_OPERATOR_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[10].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'OPERATOR_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'OPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_OPERATOR_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[10].getCount());
    }

    /**
     * Retrieves the value of the 'APPLICATION_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'APPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_APPLICATION_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[11].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'APPLICATION_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'APPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_APPLICATION_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[11].getCount());
    }

    /**
     * Retrieves the value of the 'DL_SERVICE_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'DL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DL_SERVICE_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[12].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'DL_SERVICE_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'DL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DL_SERVICE_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[12].getCount());
    }

    /**
     * Retrieves the value of the 'DL_UPDATE_STAMP' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'DL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_DL_UPDATE_STAMP(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[13].getValue(nIndex)));
    }

    /**
     * Retrieves number of values defined for 'DL_UPDATE_STAMP' field in the FML buffer.
     *
     * @return Number of values defined for 'DL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DL_UPDATE_STAMP_size() throws FMLManipulationException {
        return (this.fmlBuffer[13].getCount());
    }

    /**
     * Retrieves the value of the 'ZIP_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'ZIP_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ZIP_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[14].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'ZIP_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'ZIP_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ZIP_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[14].getCount());
    }

    /**
     * Retrieves the value of the 'CITY' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'CITY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CITY(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[15].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'CITY' field in the FML buffer.
     *
     * @return Number of values defined for 'CITY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CITY_size() throws FMLManipulationException {
        return (this.fmlBuffer[15].getCount());
    }

    /**
     * Retrieves the value of the 'STREET_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'STREET_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_STREET_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[16].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'STREET_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'STREET_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_STREET_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[16].getCount());
    }

    /**
     * Retrieves the value of the 'HOUSE_LETTER_BEGIN_RANGE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'HOUSE_LETTER_BEGIN_RANGE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_HOUSE_LETTER_BEGIN_RANGE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[17].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'HOUSE_LETTER_BEGIN_RANGE' field in the FML buffer.
     *
     * @return Number of values defined for 'HOUSE_LETTER_BEGIN_RANGE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_HOUSE_LETTER_BEGIN_RANGE_size() throws FMLManipulationException {
        return (this.fmlBuffer[17].getCount());
    }

    /**
     * Retrieves the value of the 'HOUSE_LETTER_END_RANGE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'HOUSE_LETTER_END_RANGE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_HOUSE_LETTER_END_RANGE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[18].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'HOUSE_LETTER_END_RANGE' field in the FML buffer.
     *
     * @return Number of values defined for 'HOUSE_LETTER_END_RANGE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_HOUSE_LETTER_END_RANGE_size() throws FMLManipulationException {
        return (this.fmlBuffer[18].getCount());
    }

    /**
     * Retrieves the value of the 'HOUSE_NO_BEGIN_RANGE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'HOUSE_NO_BEGIN_RANGE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_HOUSE_NO_BEGIN_RANGE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[19].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'HOUSE_NO_BEGIN_RANGE' field in the FML buffer.
     *
     * @return Number of values defined for 'HOUSE_NO_BEGIN_RANGE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_HOUSE_NO_BEGIN_RANGE_size() throws FMLManipulationException {
        return (this.fmlBuffer[19].getCount());
    }

    /**
     * Retrieves the value of the 'HOUSE_NO_END_RANGE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'HOUSE_NO_END_RANGE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_HOUSE_NO_END_RANGE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[20].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'HOUSE_NO_END_RANGE' field in the FML buffer.
     *
     * @return Number of values defined for 'HOUSE_NO_END_RANGE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_HOUSE_NO_END_RANGE_size() throws FMLManipulationException {
        return (this.fmlBuffer[20].getCount());
    }

    /**
     * Retrieves the value of the 'VALIDATION_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'VALIDATION_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_VALIDATION_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[21].getValue(nIndex)));
    }

    /**
     * Retrieves number of values defined for 'VALIDATION_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'VALIDATION_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_VALIDATION_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[21].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_POB' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'ADR_POB' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_POB(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[22].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'ADR_POB' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_POB' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_POB_size() throws FMLManipulationException {
        return (this.fmlBuffer[22].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'ADR_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[23].getValue(nIndex)));
    }

    /**
     * Retrieves number of values defined for 'ADR_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[23].getCount());
    }

    /**
     * Retrieves the value of the 'CANTON' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'CANTON' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CANTON(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[24].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'CANTON' field in the FML buffer.
     *
     * @return Number of values defined for 'CANTON' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CANTON_size() throws FMLManipulationException {
        return (this.fmlBuffer[24].getCount());
    }

    /**
     * Retrieves the value of the 'COUNTY_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'COUNTY_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COUNTY_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[25].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'COUNTY_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'COUNTY_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COUNTY_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[25].getCount());
    }

    /**
     * Retrieves the value of the 'COMMUNITY_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'COMMUNITY_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COMMUNITY_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[26].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'COMMUNITY_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'COMMUNITY_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COMMUNITY_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[26].getCount());
    }

    /**
     * Retrieves the value of the 'DISTRICT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'DISTRICT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DISTRICT(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[27].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'DISTRICT' field in the FML buffer.
     *
     * @return Number of values defined for 'DISTRICT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DISTRICT_size() throws FMLManipulationException {
        return (this.fmlBuffer[27].getCount());
    }
}