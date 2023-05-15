package no.netcom.ninja.core.system.tuxedo.service.parameters;

import bea.jolt.pool.Result;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;

/**
 * @author  Ninja - Generated by Ninja tools
 */
public class CsLsFandFOutput extends ServiceOutput {

    /**
     * Creates a new instance of CsLsFandFOutput.
     *
     * @throws FMLManipulationException
     */
    public CsLsFandFOutput(int nApplicationStatus) throws FMLManipulationException {
        createFmlBuffer();
        setApplicationCode(nApplicationStatus);
    }

    public CsLsFandFOutput() {
    }

    /**
     * Creates a new instance of CsLsFandFOutput.
     *
     * @param ds Output dataset from CsLsFandF service.
     * @throws FMLManipulationException
     */
    public CsLsFandFOutput(Result ds) throws FMLManipulationException {
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
        this.fmlBuffer[1] = new FmlField("ROWCOUNT", FmlField.TYPE_INTEGER, -1, null, 1, 1);
        this.fmlBuffer[2] = new FmlField("ROWID", FmlField.TYPE_STRING, 19, null, 2, 10000);
        this.fmlBuffer[3] = new FmlField("SUBSCRIBER_NO", FmlField.TYPE_STRING, 21, null, 3, 10000);
        this.fmlBuffer[4] = new FmlField("BAN", FmlField.TYPE_INTEGER, -1, null, 4, 10000);
        this.fmlBuffer[5] = new FmlField("EFFECTIVE_DATE", FmlField.TYPE_STRING, 15, null, 5, 10000);
        this.fmlBuffer[6] = new FmlField("PERSONAL_TEL", FmlField.TYPE_STRING, 21, null, 6, 10000);
        this.fmlBuffer[7] = new FmlField("PERSONAL_TEL_TO", FmlField.TYPE_STRING, 21, null, 7, 10000);
        this.fmlBuffer[8] = new FmlField("PLAN_CODE", FmlField.TYPE_STRING, 10, null, 8, 10000);
        this.fmlBuffer[9] = new FmlField("SYS_CREATION_DATE", FmlField.TYPE_STRING, 15, null, 9, 10000);
        this.fmlBuffer[10] = new FmlField("SYS_UPDATE_DATE", FmlField.TYPE_STRING, 15, null, 10, 10000);
        this.fmlBuffer[11] = new FmlField("OPERATOR_ID", FmlField.TYPE_INTEGER, -1, null, 11, 10000);
        this.fmlBuffer[12] = new FmlField("APPLICATION_ID", FmlField.TYPE_STRING, 7, null, 12, 10000);
        this.fmlBuffer[13] = new FmlField("DL_SERVICE_CODE", FmlField.TYPE_STRING, 6, null, 13, 10000);
        this.fmlBuffer[14] = new FmlField("DL_UPDATE_STAMP", FmlField.TYPE_SHORT, -1, null, 14, 10000);
        this.fmlBuffer[15] = new FmlField("DISCOUNT_TYPE", FmlField.TYPE_BYTE, -1, null, 15, 10000);
        this.fmlBuffer[16] = new FmlField("START_HOUR", FmlField.TYPE_STRING, 7, null, 16, 10000);
        this.fmlBuffer[17] = new FmlField("DURATION", FmlField.TYPE_DOUBLE, -1, null, 17, 10000);
        this.fmlBuffer[18] = new FmlField("EXPIRATION_DATE", FmlField.TYPE_STRING, 15, null, 18, 10000);
        this.fmlBuffer[19] = new FmlField("CONV_RUN_NO", FmlField.TYPE_SHORT, -1, null, 19, 10000);
        this.fmlBuffer[20] = new FmlField("FF_SOC", FmlField.TYPE_STRING, 10, null, 20, 10000);
        this.fmlBuffer[21] = new FmlField("PFF_IND", FmlField.TYPE_BYTE, -1, null, 21, 1);
        this.fmlBuffer[22] = new FmlField("PHAPPYH_IND", FmlField.TYPE_BYTE, -1, null, 22, 1);
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
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
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
     * Retrieves the value of the 'SUBSCRIBER_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'SUBSCRIBER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUBSCRIBER_NO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[3].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'SUBSCRIBER_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'SUBSCRIBER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SUBSCRIBER_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[3].getCount());
    }

    /**
     * Retrieves the value of the 'BAN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BAN(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[4].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'BAN' field in the FML buffer.
     *
     * @return Number of values defined for 'BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_BAN_size() throws FMLManipulationException {
        return (this.fmlBuffer[4].getCount());
    }

    /**
     * Retrieves the value of the 'EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
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
     * Retrieves the value of the 'PERSONAL_TEL' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'PERSONAL_TEL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PERSONAL_TEL(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[6].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'PERSONAL_TEL' field in the FML buffer.
     *
     * @return Number of values defined for 'PERSONAL_TEL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PERSONAL_TEL_size() throws FMLManipulationException {
        return (this.fmlBuffer[6].getCount());
    }

    /**
     * Retrieves the value of the 'PERSONAL_TEL_TO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'PERSONAL_TEL_TO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PERSONAL_TEL_TO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[7].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'PERSONAL_TEL_TO' field in the FML buffer.
     *
     * @return Number of values defined for 'PERSONAL_TEL_TO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PERSONAL_TEL_TO_size() throws FMLManipulationException {
        return (this.fmlBuffer[7].getCount());
    }

    /**
     * Retrieves the value of the 'PLAN_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'PLAN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PLAN_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[8].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'PLAN_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'PLAN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PLAN_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[8].getCount());
    }

    /**
     * Retrieves the value of the 'SYS_CREATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'SYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SYS_CREATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[9].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'SYS_CREATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'SYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SYS_CREATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[9].getCount());
    }

    /**
     * Retrieves the value of the 'SYS_UPDATE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'SYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SYS_UPDATE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[10].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'SYS_UPDATE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'SYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SYS_UPDATE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[10].getCount());
    }

    /**
     * Retrieves the value of the 'OPERATOR_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'OPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_OPERATOR_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[11].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'OPERATOR_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'OPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_OPERATOR_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[11].getCount());
    }

    /**
     * Retrieves the value of the 'APPLICATION_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'APPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_APPLICATION_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[12].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'APPLICATION_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'APPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_APPLICATION_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[12].getCount());
    }

    /**
     * Retrieves the value of the 'DL_SERVICE_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'DL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DL_SERVICE_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[13].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'DL_SERVICE_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'DL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DL_SERVICE_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[13].getCount());
    }

    /**
     * Retrieves the value of the 'DL_UPDATE_STAMP' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'DL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_DL_UPDATE_STAMP(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[14].getValue(nIndex)));
    }

    /**
     * Retrieves number of values defined for 'DL_UPDATE_STAMP' field in the FML buffer.
     *
     * @return Number of values defined for 'DL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DL_UPDATE_STAMP_size() throws FMLManipulationException {
        return (this.fmlBuffer[14].getCount());
    }

    /**
     * Retrieves the value of the 'DISCOUNT_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'DISCOUNT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DISCOUNT_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[15].getValue(nIndex)));
    }

    /**
     * Retrieves number of values defined for 'DISCOUNT_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'DISCOUNT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DISCOUNT_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[15].getCount());
    }

    /**
     * Retrieves the value of the 'START_HOUR' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'START_HOUR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_START_HOUR(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[16].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'START_HOUR' field in the FML buffer.
     *
     * @return Number of values defined for 'START_HOUR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_START_HOUR_size() throws FMLManipulationException {
        return (this.fmlBuffer[16].getCount());
    }

    /**
     * Retrieves the value of the 'DURATION' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'DURATION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_DURATION(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[17].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'DURATION' field in the FML buffer.
     *
     * @return Number of values defined for 'DURATION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DURATION_size() throws FMLManipulationException {
        return (this.fmlBuffer[17].getCount());
    }

    /**
     * Retrieves the value of the 'EXPIRATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EXPIRATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[18].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'EXPIRATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_EXPIRATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[18].getCount());
    }

    /**
     * Retrieves the value of the 'CONV_RUN_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'CONV_RUN_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CONV_RUN_NO(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[19].getValue(nIndex)));
    }

    /**
     * Retrieves number of values defined for 'CONV_RUN_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'CONV_RUN_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CONV_RUN_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[19].getCount());
    }

    /**
     * Retrieves the value of the 'FF_SOC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'FF_SOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FF_SOC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[20].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'FF_SOC' field in the FML buffer.
     *
     * @return Number of values defined for 'FF_SOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FF_SOC_size() throws FMLManipulationException {
        return (this.fmlBuffer[20].getCount());
    }

    /**
     * Retrieves the value of the 'PFF_IND' field in the FML buffer.
     *
     * @return Value of 'PFF_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PFF_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[21].getValue(0)));
    }

    /**
     * Retrieves the value of the 'PHAPPYH_IND' field in the FML buffer.
     *
     * @return Value of 'PHAPPYH_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PHAPPYH_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[22].getValue(0)));
    }
}