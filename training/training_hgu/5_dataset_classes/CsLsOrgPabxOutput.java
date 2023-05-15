package no.netcom.ninja.core.system.tuxedo.service.parameters;

import bea.jolt.pool.Result;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;

/**
 * @author  Ninja - Generated by Ninja tools
 */
public class CsLsOrgPabxOutput extends ServiceOutput {

    /**
     * Creates a new instance of CsLsOrgPabxOutput.
     *
     * @throws FMLManipulationException
     */
    public CsLsOrgPabxOutput(int nApplicationStatus) throws FMLManipulationException {
        createFmlBuffer();
        setApplicationCode(nApplicationStatus);
    }

    public CsLsOrgPabxOutput() {
    }

    /**
     * Creates a new instance of CsLsOrgPabxOutput.
     *
     * @param ds Output dataset from CsLsOrgPabx service.
     * @throws FMLManipulationException
     */
    public CsLsOrgPabxOutput(Result ds) throws FMLManipulationException {
        createFmlBuffer();
        populateFmlBuffer(ds);
    }

    /**
     * Populates the FML buffer.
     *
     * @throws FMLManipulationException
     */
    private void createFmlBuffer() throws FMLManipulationException {
        this.fmlBuffer = new FmlField[26];
        this.fmlBuffer[0] = new FmlField("GENERATION", FmlField.TYPE_INTEGER, -1, null, 0, 1);
        this.fmlBuffer[1] = new FmlField("MOREROWS", FmlField.TYPE_SHORT, -1, null, 1, 1);
        this.fmlBuffer[2] = new FmlField("ROWCOUNT", FmlField.TYPE_INTEGER, -1, null, 2, 1);
        this.fmlBuffer[3] = new FmlField("ROWID", FmlField.TYPE_STRING, 19, null, 3, 600);
        this.fmlBuffer[4] = new FmlField("PABX_ID", FmlField.TYPE_STRING, 13, null, 4, 600);
        this.fmlBuffer[5] = new FmlField("SYS_CREATION_DATE", FmlField.TYPE_STRING, 15, null, 5, 600);
        this.fmlBuffer[6] = new FmlField("SYS_UPDATE_DATE", FmlField.TYPE_STRING, 15, null, 6, 600);
        this.fmlBuffer[7] = new FmlField("OPERATOR_ID", FmlField.TYPE_INTEGER, -1, null, 7, 600);
        this.fmlBuffer[8] = new FmlField("APPLICATION_ID", FmlField.TYPE_STRING, 7, null, 8, 600);
        this.fmlBuffer[9] = new FmlField("DL_SERVICE_CODE", FmlField.TYPE_STRING, 6, null, 9, 600);
        this.fmlBuffer[10] = new FmlField("DL_UPDATE_STAMP", FmlField.TYPE_SHORT, -1, null, 10, 600);
        this.fmlBuffer[11] = new FmlField("LEADING_NUMBER", FmlField.TYPE_STRING, 21, null, 11, 600);
        this.fmlBuffer[12] = new FmlField("PABX_ISSUE_DATE", FmlField.TYPE_STRING, 9, null, 12, 600);
        this.fmlBuffer[13] = new FmlField("EFFECTIVE_DATE", FmlField.TYPE_STRING, 9, null, 13, 600);
        this.fmlBuffer[14] = new FmlField("EXPIRATION_DATE", FmlField.TYPE_STRING, 9, null, 14, 600);
        this.fmlBuffer[15] = new FmlField("ACTIVE_PABX", FmlField.TYPE_BYTE, -1, null, 15, 600);
        this.fmlBuffer[16] = new FmlField("PABX_TYPE", FmlField.TYPE_STRING, 21, null, 16, 600);
        this.fmlBuffer[17] = new FmlField("CONNECT_TYPE", FmlField.TYPE_STRING, 21, null, 17, 600);
        this.fmlBuffer[18] = new FmlField("PABX_DESC", FmlField.TYPE_STRING, 21, null, 18, 600);
        this.fmlBuffer[19] = new FmlField("OWNER", FmlField.TYPE_STRING, 41, null, 19, 600);
        this.fmlBuffer[20] = new FmlField("ADDRESS", FmlField.TYPE_STRING, 61, null, 20, 600);
        this.fmlBuffer[21] = new FmlField("RESPONSIBLE", FmlField.TYPE_STRING, 41, null, 21, 600);
        this.fmlBuffer[22] = new FmlField("PHONE", FmlField.TYPE_STRING, 21, null, 22, 600);
        this.fmlBuffer[23] = new FmlField("SIP_MAIN", FmlField.TYPE_STRING, 21, null, 23, 600);
        this.fmlBuffer[24] = new FmlField("AUTO_ACTIVATE_IND", FmlField.TYPE_BYTE, -1, null, 24, 600);
        this.fmlBuffer[25] = new FmlField("TOTALCOUNT", FmlField.TYPE_INTEGER, -1, null, 25, 1);
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
     * Retrieves the value of the 'PABX_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'PABX_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PABX_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[4].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'PABX_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'PABX_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PABX_ID_size() throws FMLManipulationException {
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
     * Retrieves the value of the 'LEADING_NUMBER' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'LEADING_NUMBER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LEADING_NUMBER(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[11].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'LEADING_NUMBER' field in the FML buffer.
     *
     * @return Number of values defined for 'LEADING_NUMBER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LEADING_NUMBER_size() throws FMLManipulationException {
        return (this.fmlBuffer[11].getCount());
    }

    /**
     * Retrieves the value of the 'PABX_ISSUE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'PABX_ISSUE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PABX_ISSUE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[12].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'PABX_ISSUE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'PABX_ISSUE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PABX_ISSUE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[12].getCount());
    }

    /**
     * Retrieves the value of the 'EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[13].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'EFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_EFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[13].getCount());
    }

    /**
     * Retrieves the value of the 'EXPIRATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
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
     * Retrieves the value of the 'ACTIVE_PABX' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'ACTIVE_PABX' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACTIVE_PABX(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[15].getValue(nIndex)));
    }

    /**
     * Retrieves number of values defined for 'ACTIVE_PABX' field in the FML buffer.
     *
     * @return Number of values defined for 'ACTIVE_PABX' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACTIVE_PABX_size() throws FMLManipulationException {
        return (this.fmlBuffer[15].getCount());
    }

    /**
     * Retrieves the value of the 'PABX_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'PABX_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PABX_TYPE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[16].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'PABX_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'PABX_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PABX_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[16].getCount());
    }

    /**
     * Retrieves the value of the 'CONNECT_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'CONNECT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CONNECT_TYPE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[17].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'CONNECT_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'CONNECT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CONNECT_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[17].getCount());
    }

    /**
     * Retrieves the value of the 'PABX_DESC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'PABX_DESC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PABX_DESC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[18].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'PABX_DESC' field in the FML buffer.
     *
     * @return Number of values defined for 'PABX_DESC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PABX_DESC_size() throws FMLManipulationException {
        return (this.fmlBuffer[18].getCount());
    }

    /**
     * Retrieves the value of the 'OWNER' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'OWNER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_OWNER(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[19].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'OWNER' field in the FML buffer.
     *
     * @return Number of values defined for 'OWNER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_OWNER_size() throws FMLManipulationException {
        return (this.fmlBuffer[19].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESS' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'ADDRESS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADDRESS(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[20].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'ADDRESS' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESS_size() throws FMLManipulationException {
        return (this.fmlBuffer[20].getCount());
    }

    /**
     * Retrieves the value of the 'RESPONSIBLE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'RESPONSIBLE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_RESPONSIBLE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[21].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'RESPONSIBLE' field in the FML buffer.
     *
     * @return Number of values defined for 'RESPONSIBLE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_RESPONSIBLE_size() throws FMLManipulationException {
        return (this.fmlBuffer[21].getCount());
    }

    /**
     * Retrieves the value of the 'PHONE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'PHONE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PHONE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[22].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'PHONE' field in the FML buffer.
     *
     * @return Number of values defined for 'PHONE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PHONE_size() throws FMLManipulationException {
        return (this.fmlBuffer[22].getCount());
    }

    /**
     * Retrieves the value of the 'SIP_MAIN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'SIP_MAIN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SIP_MAIN(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[23].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'SIP_MAIN' field in the FML buffer.
     *
     * @return Number of values defined for 'SIP_MAIN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SIP_MAIN_size() throws FMLManipulationException {
        return (this.fmlBuffer[23].getCount());
    }

    /**
     * Retrieves the value of the 'AUTO_ACTIVATE_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'AUTO_ACTIVATE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_AUTO_ACTIVATE_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[24].getValue(nIndex)));
    }

    /**
     * Retrieves number of values defined for 'AUTO_ACTIVATE_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'AUTO_ACTIVATE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_AUTO_ACTIVATE_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[24].getCount());
    }

    /**
     * Retrieves the value of the 'TOTALCOUNT' field in the FML buffer.
     *
     * @return Value of 'TOTALCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_TOTALCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[25].getValue(0));
    }
}