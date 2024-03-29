package no.netcom.ninja.core.system.tuxedo.service.parameters;

import bea.jolt.pool.Result;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;

/**
 * @author  Ninja - Generated by Ninja tools
 */
public class BlGtBillDetOutput extends ServiceOutput {

    /**
     * Creates a new instance of BlGtBillDetOutput.
     *
     * @throws FMLManipulationException
     */
    public BlGtBillDetOutput(int nApplicationStatus) throws FMLManipulationException {
        createFmlBuffer();
        setApplicationCode(nApplicationStatus);
    }

    public BlGtBillDetOutput() {
    }

    /**
     * Creates a new instance of BlGtBillDetOutput.
     *
     * @param ds Output dataset from BlGtBillDet service.
     * @throws FMLManipulationException
     */
    public BlGtBillDetOutput(Result ds) throws FMLManipulationException {
        createFmlBuffer();
        populateFmlBuffer(ds);
    }

    /**
     * Populates the FML buffer.
     *
     * @throws FMLManipulationException
     */
    private void createFmlBuffer() throws FMLManipulationException {
        this.fmlBuffer = new FmlField[45];
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
        this.fmlBuffer[16] = new FmlField("GROSS_AMT", FmlField.TYPE_DOUBLE, -1, null, 16, 1);
        this.fmlBuffer[17] = new FmlField("DISCOUNT_AMT", FmlField.TYPE_DOUBLE, -1, null, 17, 1);
        this.fmlBuffer[18] = new FmlField("UTC_TO_PARENT", FmlField.TYPE_DOUBLE, -1, null, 18, 1);
        this.fmlBuffer[19] = new FmlField("UTC_FROM_SONS", FmlField.TYPE_DOUBLE, -1, null, 19, 1);
        this.fmlBuffer[20] = new FmlField("NET_AMT", FmlField.TYPE_DOUBLE, -1, null, 20, 1);
        this.fmlBuffer[21] = new FmlField("TAX_RET_AMT", FmlField.TYPE_DOUBLE, -1, null, 21, 1);
        this.fmlBuffer[22] = new FmlField("PREV_MONTH", FmlField.TYPE_SHORT, -1, null, 22, 1);
        this.fmlBuffer[23] = new FmlField("PREV_YEAR", FmlField.TYPE_SHORT, -1, null, 23, 1);
        this.fmlBuffer[24] = new FmlField("PREV_AMOUNT_DUE", FmlField.TYPE_DOUBLE, -1, null, 24, 1);
        this.fmlBuffer[25] = new FmlField("CARRY_OVER_PAYMENTS", FmlField.TYPE_DOUBLE, -1, null, 25, 1);
        this.fmlBuffer[26] = new FmlField("CARRY_OVER_ADJUSTMENTS", FmlField.TYPE_DOUBLE, -1, null, 26, 1);
        this.fmlBuffer[27] = new FmlField("CARRY_OVER_CHARGES", FmlField.TYPE_DOUBLE, -1, null, 27, 1);
        this.fmlBuffer[28] = new FmlField("CURRENT_PAYMENTS", FmlField.TYPE_DOUBLE, -1, null, 28, 1);
        this.fmlBuffer[29] = new FmlField("CURRENT_ADJUSTMENTS", FmlField.TYPE_DOUBLE, -1, null, 29, 1);
        this.fmlBuffer[30] = new FmlField("CURRENT_CHARGES", FmlField.TYPE_DOUBLE, -1, null, 30, 1);
        this.fmlBuffer[31] = new FmlField("TOTAL_AMOUNT_DUE", FmlField.TYPE_DOUBLE, -1, null, 31, 1);
        this.fmlBuffer[32] = new FmlField("TAX_AMOUNT", FmlField.TYPE_DOUBLE, -1, null, 32, 1);
        this.fmlBuffer[33] = new FmlField("DUE_DATE", FmlField.TYPE_STRING, 9, null, 33, 1);
        this.fmlBuffer[34] = new FmlField("FROM_DATE", FmlField.TYPE_STRING, 9, null, 34, 1);
        this.fmlBuffer[35] = new FmlField("TO_DATE", FmlField.TYPE_STRING, 9, null, 35, 1);
        this.fmlBuffer[36] = new FmlField("BILL_SEQ_NO", FmlField.TYPE_SHORT, -1, null, 36, 1);
        this.fmlBuffer[37] = new FmlField("PREV_CARRY_OVER_IND", FmlField.TYPE_BYTE, -1, null, 37, 1);
        this.fmlBuffer[38] = new FmlField("CARRY_OVER_IND", FmlField.TYPE_BYTE, -1, null, 38, 1);
        this.fmlBuffer[39] = new FmlField("ADJUSTMENT_ALLOWED_IND", FmlField.TYPE_BYTE, -1, null, 39, 1);
        this.fmlBuffer[40] = new FmlField("HIDE_PHONE_DIGITS_IND", FmlField.TYPE_BYTE, -1, null, 40, 1);
        this.fmlBuffer[41] = new FmlField("VAT_EXMP_IND", FmlField.TYPE_BYTE, -1, null, 41, 1);
        this.fmlBuffer[42] = new FmlField("CYCLE_CODE", FmlField.TYPE_SHORT, -1, null, 42, 1);
        this.fmlBuffer[43] = new FmlField("CYCLE_RUN_MONTH", FmlField.TYPE_SHORT, -1, null, 43, 1);
        this.fmlBuffer[44] = new FmlField("CYCLE_RUN_YEAR", FmlField.TYPE_SHORT, -1, null, 44, 1);
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
     * Retrieves the value of the 'GROSS_AMT' field in the FML buffer.
     *
     * @return Value of 'GROSS_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_GROSS_AMT() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[16].getValue(0));
    }

    /**
     * Retrieves the value of the 'DISCOUNT_AMT' field in the FML buffer.
     *
     * @return Value of 'DISCOUNT_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_DISCOUNT_AMT() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[17].getValue(0));
    }

    /**
     * Retrieves the value of the 'UTC_TO_PARENT' field in the FML buffer.
     *
     * @return Value of 'UTC_TO_PARENT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_UTC_TO_PARENT() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[18].getValue(0));
    }

    /**
     * Retrieves the value of the 'UTC_FROM_SONS' field in the FML buffer.
     *
     * @return Value of 'UTC_FROM_SONS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_UTC_FROM_SONS() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[19].getValue(0));
    }

    /**
     * Retrieves the value of the 'NET_AMT' field in the FML buffer.
     *
     * @return Value of 'NET_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_NET_AMT() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[20].getValue(0));
    }

    /**
     * Retrieves the value of the 'TAX_RET_AMT' field in the FML buffer.
     *
     * @return Value of 'TAX_RET_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_TAX_RET_AMT() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[21].getValue(0));
    }

    /**
     * Retrieves the value of the 'PREV_MONTH' field in the FML buffer.
     *
     * @return Value of 'PREV_MONTH' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PREV_MONTH() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[22].getValue(0)));
    }

    /**
     * Retrieves the value of the 'PREV_YEAR' field in the FML buffer.
     *
     * @return Value of 'PREV_YEAR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PREV_YEAR() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[23].getValue(0)));
    }

    /**
     * Retrieves the value of the 'PREV_AMOUNT_DUE' field in the FML buffer.
     *
     * @return Value of 'PREV_AMOUNT_DUE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_PREV_AMOUNT_DUE() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[24].getValue(0));
    }

    /**
     * Retrieves the value of the 'CARRY_OVER_PAYMENTS' field in the FML buffer.
     *
     * @return Value of 'CARRY_OVER_PAYMENTS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_CARRY_OVER_PAYMENTS() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[25].getValue(0));
    }

    /**
     * Retrieves the value of the 'CARRY_OVER_ADJUSTMENTS' field in the FML buffer.
     *
     * @return Value of 'CARRY_OVER_ADJUSTMENTS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_CARRY_OVER_ADJUSTMENTS() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[26].getValue(0));
    }

    /**
     * Retrieves the value of the 'CARRY_OVER_CHARGES' field in the FML buffer.
     *
     * @return Value of 'CARRY_OVER_CHARGES' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_CARRY_OVER_CHARGES() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[27].getValue(0));
    }

    /**
     * Retrieves the value of the 'CURRENT_PAYMENTS' field in the FML buffer.
     *
     * @return Value of 'CURRENT_PAYMENTS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_CURRENT_PAYMENTS() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[28].getValue(0));
    }

    /**
     * Retrieves the value of the 'CURRENT_ADJUSTMENTS' field in the FML buffer.
     *
     * @return Value of 'CURRENT_ADJUSTMENTS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_CURRENT_ADJUSTMENTS() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[29].getValue(0));
    }

    /**
     * Retrieves the value of the 'CURRENT_CHARGES' field in the FML buffer.
     *
     * @return Value of 'CURRENT_CHARGES' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_CURRENT_CHARGES() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[30].getValue(0));
    }

    /**
     * Retrieves the value of the 'TOTAL_AMOUNT_DUE' field in the FML buffer.
     *
     * @return Value of 'TOTAL_AMOUNT_DUE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_TOTAL_AMOUNT_DUE() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[31].getValue(0));
    }

    /**
     * Retrieves the value of the 'TAX_AMOUNT' field in the FML buffer.
     *
     * @return Value of 'TAX_AMOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_TAX_AMOUNT() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[32].getValue(0));
    }

    /**
     * Retrieves the value of the 'DUE_DATE' field in the FML buffer.
     *
     * @return Value of 'DUE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DUE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[33].getValue(0));
    }

    /**
     * Retrieves the value of the 'FROM_DATE' field in the FML buffer.
     *
     * @return Value of 'FROM_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FROM_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[34].getValue(0));
    }

    /**
     * Retrieves the value of the 'TO_DATE' field in the FML buffer.
     *
     * @return Value of 'TO_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_TO_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[35].getValue(0));
    }

    /**
     * Retrieves the value of the 'BILL_SEQ_NO' field in the FML buffer.
     *
     * @return Value of 'BILL_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BILL_SEQ_NO() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[36].getValue(0)));
    }

    /**
     * Retrieves the value of the 'PREV_CARRY_OVER_IND' field in the FML buffer.
     *
     * @return Value of 'PREV_CARRY_OVER_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PREV_CARRY_OVER_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[37].getValue(0)));
    }

    /**
     * Retrieves the value of the 'CARRY_OVER_IND' field in the FML buffer.
     *
     * @return Value of 'CARRY_OVER_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CARRY_OVER_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[38].getValue(0)));
    }

    /**
     * Retrieves the value of the 'ADJUSTMENT_ALLOWED_IND' field in the FML buffer.
     *
     * @return Value of 'ADJUSTMENT_ALLOWED_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADJUSTMENT_ALLOWED_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[39].getValue(0)));
    }

    /**
     * Retrieves the value of the 'HIDE_PHONE_DIGITS_IND' field in the FML buffer.
     *
     * @return Value of 'HIDE_PHONE_DIGITS_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_HIDE_PHONE_DIGITS_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[40].getValue(0)));
    }

    /**
     * Retrieves the value of the 'VAT_EXMP_IND' field in the FML buffer.
     *
     * @return Value of 'VAT_EXMP_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_VAT_EXMP_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[41].getValue(0)));
    }

    /**
     * Retrieves the value of the 'CYCLE_CODE' field in the FML buffer.
     *
     * @return Value of 'CYCLE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CYCLE_CODE() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[42].getValue(0)));
    }

    /**
     * Retrieves the value of the 'CYCLE_RUN_MONTH' field in the FML buffer.
     *
     * @return Value of 'CYCLE_RUN_MONTH' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CYCLE_RUN_MONTH() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[43].getValue(0)));
    }

    /**
     * Retrieves the value of the 'CYCLE_RUN_YEAR' field in the FML buffer.
     *
     * @return Value of 'CYCLE_RUN_YEAR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CYCLE_RUN_YEAR() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[44].getValue(0)));
    }
}