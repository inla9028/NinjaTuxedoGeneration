package no.netcom.ninja.core.system.tuxedo.service.parameters;

import bea.jolt.pool.Result;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;

/**
 * @author  Ninja - Generated by Ninja tools
 */
public class BlLsSubSumOutput extends ServiceOutput {

    /**
     * Creates a new instance of BlLsSubSumOutput.
     *
     * @throws FMLManipulationException
     */
    public BlLsSubSumOutput(int nApplicationStatus) throws FMLManipulationException {
        createFmlBuffer();
        setApplicationCode(nApplicationStatus);
    }

    public BlLsSubSumOutput() {
    }

    /**
     * Creates a new instance of BlLsSubSumOutput.
     *
     * @param ds Output dataset from BlLsSubSum service.
     * @throws FMLManipulationException
     */
    public BlLsSubSumOutput(Result ds) throws FMLManipulationException {
        createFmlBuffer();
        populateFmlBuffer(ds);
    }

    /**
     * Populates the FML buffer.
     *
     * @throws FMLManipulationException
     */
    private void createFmlBuffer() throws FMLManipulationException {
        this.fmlBuffer = new FmlField[18];
        this.fmlBuffer[0] = new FmlField("GENERATION", FmlField.TYPE_INTEGER, -1, null, 0, 1);
        this.fmlBuffer[1] = new FmlField("TOTALCOUNT", FmlField.TYPE_INTEGER, -1, null, 1, 1);
        this.fmlBuffer[2] = new FmlField("MOREROWS", FmlField.TYPE_SHORT, -1, null, 2, 1);
        this.fmlBuffer[3] = new FmlField("ROWCOUNT", FmlField.TYPE_INTEGER, -1, null, 3, 1);
        this.fmlBuffer[4] = new FmlField("SUBSCRIBER_NO", FmlField.TYPE_STRING, 21, null, 4, 600);
        this.fmlBuffer[5] = new FmlField("RC_GROSS_AMT", FmlField.TYPE_DOUBLE, -1, null, 5, 600);
        this.fmlBuffer[6] = new FmlField("RC_DISCOUNT_AMT", FmlField.TYPE_DOUBLE, -1, null, 6, 600);
        this.fmlBuffer[7] = new FmlField("RC_UTC_AMT", FmlField.TYPE_DOUBLE, -1, null, 7, 600);
        this.fmlBuffer[8] = new FmlField("RC_NET_AMT", FmlField.TYPE_DOUBLE, -1, null, 8, 600);
        this.fmlBuffer[9] = new FmlField("UC_GROSS_AMT", FmlField.TYPE_DOUBLE, -1, null, 9, 600);
        this.fmlBuffer[10] = new FmlField("UC_DISCOUNT_AMT", FmlField.TYPE_DOUBLE, -1, null, 10, 600);
        this.fmlBuffer[11] = new FmlField("UC_UTC_AMT", FmlField.TYPE_DOUBLE, -1, null, 11, 600);
        this.fmlBuffer[12] = new FmlField("UC_NET_AMT", FmlField.TYPE_DOUBLE, -1, null, 12, 600);
        this.fmlBuffer[13] = new FmlField("OC_GROSS_AMT", FmlField.TYPE_DOUBLE, -1, null, 13, 600);
        this.fmlBuffer[14] = new FmlField("OC_UTC_AMT", FmlField.TYPE_DOUBLE, -1, null, 14, 600);
        this.fmlBuffer[15] = new FmlField("OC_NET_AMT", FmlField.TYPE_DOUBLE, -1, null, 15, 600);
        this.fmlBuffer[16] = new FmlField("ADJUSTMENTS_AMT", FmlField.TYPE_DOUBLE, -1, null, 16, 600);
        this.fmlBuffer[17] = new FmlField("TOTAL_NET_AMT", FmlField.TYPE_DOUBLE, -1, null, 17, 600);
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
     * Retrieves the value of the 'TOTALCOUNT' field in the FML buffer.
     *
     * @return Value of 'TOTALCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_TOTALCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[1].getValue(0));
    }

    /**
     * Retrieves the value of the 'MOREROWS' field in the FML buffer.
     *
     * @return Value of 'MOREROWS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_MOREROWS() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[2].getValue(0)));
    }

    /**
     * Retrieves the value of the 'ROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'ROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[3].getValue(0));
    }

    /**
     * Retrieves the value of the 'SUBSCRIBER_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'SUBSCRIBER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUBSCRIBER_NO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[4].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'SUBSCRIBER_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'SUBSCRIBER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SUBSCRIBER_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[4].getCount());
    }

    /**
     * Retrieves the value of the 'RC_GROSS_AMT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'RC_GROSS_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_RC_GROSS_AMT(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[5].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'RC_GROSS_AMT' field in the FML buffer.
     *
     * @return Number of values defined for 'RC_GROSS_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_RC_GROSS_AMT_size() throws FMLManipulationException {
        return (this.fmlBuffer[5].getCount());
    }

    /**
     * Retrieves the value of the 'RC_DISCOUNT_AMT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'RC_DISCOUNT_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_RC_DISCOUNT_AMT(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[6].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'RC_DISCOUNT_AMT' field in the FML buffer.
     *
     * @return Number of values defined for 'RC_DISCOUNT_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_RC_DISCOUNT_AMT_size() throws FMLManipulationException {
        return (this.fmlBuffer[6].getCount());
    }

    /**
     * Retrieves the value of the 'RC_UTC_AMT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'RC_UTC_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_RC_UTC_AMT(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[7].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'RC_UTC_AMT' field in the FML buffer.
     *
     * @return Number of values defined for 'RC_UTC_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_RC_UTC_AMT_size() throws FMLManipulationException {
        return (this.fmlBuffer[7].getCount());
    }

    /**
     * Retrieves the value of the 'RC_NET_AMT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'RC_NET_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_RC_NET_AMT(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[8].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'RC_NET_AMT' field in the FML buffer.
     *
     * @return Number of values defined for 'RC_NET_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_RC_NET_AMT_size() throws FMLManipulationException {
        return (this.fmlBuffer[8].getCount());
    }

    /**
     * Retrieves the value of the 'UC_GROSS_AMT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'UC_GROSS_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_UC_GROSS_AMT(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[9].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'UC_GROSS_AMT' field in the FML buffer.
     *
     * @return Number of values defined for 'UC_GROSS_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_UC_GROSS_AMT_size() throws FMLManipulationException {
        return (this.fmlBuffer[9].getCount());
    }

    /**
     * Retrieves the value of the 'UC_DISCOUNT_AMT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'UC_DISCOUNT_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_UC_DISCOUNT_AMT(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[10].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'UC_DISCOUNT_AMT' field in the FML buffer.
     *
     * @return Number of values defined for 'UC_DISCOUNT_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_UC_DISCOUNT_AMT_size() throws FMLManipulationException {
        return (this.fmlBuffer[10].getCount());
    }

    /**
     * Retrieves the value of the 'UC_UTC_AMT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'UC_UTC_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_UC_UTC_AMT(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[11].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'UC_UTC_AMT' field in the FML buffer.
     *
     * @return Number of values defined for 'UC_UTC_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_UC_UTC_AMT_size() throws FMLManipulationException {
        return (this.fmlBuffer[11].getCount());
    }

    /**
     * Retrieves the value of the 'UC_NET_AMT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'UC_NET_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_UC_NET_AMT(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[12].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'UC_NET_AMT' field in the FML buffer.
     *
     * @return Number of values defined for 'UC_NET_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_UC_NET_AMT_size() throws FMLManipulationException {
        return (this.fmlBuffer[12].getCount());
    }

    /**
     * Retrieves the value of the 'OC_GROSS_AMT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'OC_GROSS_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_OC_GROSS_AMT(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[13].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'OC_GROSS_AMT' field in the FML buffer.
     *
     * @return Number of values defined for 'OC_GROSS_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_OC_GROSS_AMT_size() throws FMLManipulationException {
        return (this.fmlBuffer[13].getCount());
    }

    /**
     * Retrieves the value of the 'OC_UTC_AMT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'OC_UTC_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_OC_UTC_AMT(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[14].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'OC_UTC_AMT' field in the FML buffer.
     *
     * @return Number of values defined for 'OC_UTC_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_OC_UTC_AMT_size() throws FMLManipulationException {
        return (this.fmlBuffer[14].getCount());
    }

    /**
     * Retrieves the value of the 'OC_NET_AMT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'OC_NET_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_OC_NET_AMT(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[15].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'OC_NET_AMT' field in the FML buffer.
     *
     * @return Number of values defined for 'OC_NET_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_OC_NET_AMT_size() throws FMLManipulationException {
        return (this.fmlBuffer[15].getCount());
    }

    /**
     * Retrieves the value of the 'ADJUSTMENTS_AMT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'ADJUSTMENTS_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_ADJUSTMENTS_AMT(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[16].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'ADJUSTMENTS_AMT' field in the FML buffer.
     *
     * @return Number of values defined for 'ADJUSTMENTS_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADJUSTMENTS_AMT_size() throws FMLManipulationException {
        return (this.fmlBuffer[16].getCount());
    }

    /**
     * Retrieves the value of the 'TOTAL_NET_AMT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 600).
     * @return Value of 'TOTAL_NET_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_TOTAL_NET_AMT(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[17].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'TOTAL_NET_AMT' field in the FML buffer.
     *
     * @return Number of values defined for 'TOTAL_NET_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_TOTAL_NET_AMT_size() throws FMLManipulationException {
        return (this.fmlBuffer[17].getCount());
    }
}