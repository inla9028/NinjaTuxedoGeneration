package no.netcom.ninja.core.system.tuxedo.service.parameters;

import bea.jolt.pool.Result;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;

/**
 * @author  Ninja - Generated by Ninja tools
 */
public class ArGtpymMtdOutput extends ServiceOutput {

    /**
     * Creates a new instance of ArGtpymMtdOutput.
     *
     * @throws FMLManipulationException
     */
    public ArGtpymMtdOutput(int nApplicationStatus) throws FMLManipulationException {
        createFmlBuffer();
        setApplicationCode(nApplicationStatus);
    }

    public ArGtpymMtdOutput() {
    }

    /**
     * Creates a new instance of ArGtpymMtdOutput.
     *
     * @param ds Output dataset from ArGtpymMtd service.
     * @throws FMLManipulationException
     */
    public ArGtpymMtdOutput(Result ds) throws FMLManipulationException {
        createFmlBuffer();
        populateFmlBuffer(ds);
    }

    /**
     * Populates the FML buffer.
     *
     * @throws FMLManipulationException
     */
    private void createFmlBuffer() throws FMLManipulationException {
        this.fmlBuffer = new FmlField[40];
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
        this.fmlBuffer[16] = new FmlField("ROWID", FmlField.TYPE_STRING, 19, null, 16, 1);
        this.fmlBuffer[17] = new FmlField("BAN", FmlField.TYPE_INTEGER, -1, null, 17, 1);
        this.fmlBuffer[18] = new FmlField("BAN_ENTRY_SEQ_NO", FmlField.TYPE_INTEGER, -1, null, 18, 1);
        this.fmlBuffer[19] = new FmlField("SYS_CREATION_DATE", FmlField.TYPE_STRING, 15, null, 19, 1);
        this.fmlBuffer[20] = new FmlField("SYS_UPDATE_DATE", FmlField.TYPE_STRING, 15, null, 20, 1);
        this.fmlBuffer[21] = new FmlField("PBANPYMRECOPERATOR_ID", FmlField.TYPE_INTEGER, -1, null, 21, 1);
        this.fmlBuffer[22] = new FmlField("PBANPYMRECAPPLICATION_ID", FmlField.TYPE_STRING, 7, null, 22, 1);
        this.fmlBuffer[23] = new FmlField("DL_SERVICE_CODE", FmlField.TYPE_STRING, 6, null, 23, 1);
        this.fmlBuffer[24] = new FmlField("DL_UPDATE_STAMP", FmlField.TYPE_SHORT, -1, null, 24, 1);
        this.fmlBuffer[25] = new FmlField("PAYMENT_METHOD", FmlField.TYPE_STRING, 3, null, 25, 1);
        this.fmlBuffer[26] = new FmlField("PAYMENT_SUB_METHOD", FmlField.TYPE_STRING, 3, null, 26, 1);
        this.fmlBuffer[27] = new FmlField("EFFECTIVE_DATE", FmlField.TYPE_STRING, 9, null, 27, 1);
        this.fmlBuffer[28] = new FmlField("EXPIRATION_DATE", FmlField.TYPE_STRING, 9, null, 28, 1);
        this.fmlBuffer[29] = new FmlField("DD_CONTRACT_NO", FmlField.TYPE_STRING, 10, null, 29, 1);
        this.fmlBuffer[30] = new FmlField("CREDIT_CARD_NO", FmlField.TYPE_STRING, 21, null, 30, 1);
        this.fmlBuffer[31] = new FmlField("CR_CARD_EXPIR_DATE", FmlField.TYPE_STRING, 9, null, 31, 1);
        this.fmlBuffer[32] = new FmlField("BANK_CODE", FmlField.TYPE_STRING, 11, null, 32, 1);
        this.fmlBuffer[33] = new FmlField("BANK_BRANCH_CODE", FmlField.TYPE_STRING, 11, null, 33, 1);
        this.fmlBuffer[34] = new FmlField("BANK_ACCT_NO", FmlField.TYPE_STRING, 21, null, 34, 1);
        this.fmlBuffer[35] = new FmlField("AUTHORIZATION_CODE", FmlField.TYPE_STRING, 21, null, 35, 1);
        this.fmlBuffer[36] = new FmlField("FILE_SEQ_NO", FmlField.TYPE_DOUBLE, -1, null, 36, 1);
        this.fmlBuffer[37] = new FmlField("DD_REFERENCE", FmlField.TYPE_STRING, 11, null, 37, 1);
        this.fmlBuffer[38] = new FmlField("IMD_DDREQ_IND", FmlField.TYPE_BYTE, -1, null, 38, 1);
        this.fmlBuffer[39] = new FmlField("DD_STATUS", FmlField.TYPE_BYTE, -1, null, 39, 1);
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
     * Retrieves the value of the 'ROWID' field in the FML buffer.
     *
     * @return Value of 'ROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ROWID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[16].getValue(0));
    }

    /**
     * Retrieves the value of the 'BAN' field in the FML buffer.
     *
     * @return Value of 'BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BAN() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[17].getValue(0));
    }

    /**
     * Retrieves the value of the 'BAN_ENTRY_SEQ_NO' field in the FML buffer.
     *
     * @return Value of 'BAN_ENTRY_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BAN_ENTRY_SEQ_NO() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[18].getValue(0));
    }

    /**
     * Retrieves the value of the 'SYS_CREATION_DATE' field in the FML buffer.
     *
     * @return Value of 'SYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SYS_CREATION_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[19].getValue(0));
    }

    /**
     * Retrieves the value of the 'SYS_UPDATE_DATE' field in the FML buffer.
     *
     * @return Value of 'SYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SYS_UPDATE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[20].getValue(0));
    }

    /**
     * Retrieves the value of the 'PBANPYMRECOPERATOR_ID' field in the FML buffer.
     *
     * @return Value of 'PBANPYMRECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PBANPYMRECOPERATOR_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[21].getValue(0));
    }

    /**
     * Retrieves the value of the 'PBANPYMRECAPPLICATION_ID' field in the FML buffer.
     *
     * @return Value of 'PBANPYMRECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PBANPYMRECAPPLICATION_ID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[22].getValue(0));
    }

    /**
     * Retrieves the value of the 'DL_SERVICE_CODE' field in the FML buffer.
     *
     * @return Value of 'DL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DL_SERVICE_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[23].getValue(0));
    }

    /**
     * Retrieves the value of the 'DL_UPDATE_STAMP' field in the FML buffer.
     *
     * @return Value of 'DL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_DL_UPDATE_STAMP() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[24].getValue(0)));
    }

    /**
     * Retrieves the value of the 'PAYMENT_METHOD' field in the FML buffer.
     *
     * @return Value of 'PAYMENT_METHOD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAYMENT_METHOD() throws FMLManipulationException {
        return ((String) this.fmlBuffer[25].getValue(0));
    }

    /**
     * Retrieves the value of the 'PAYMENT_SUB_METHOD' field in the FML buffer.
     *
     * @return Value of 'PAYMENT_SUB_METHOD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAYMENT_SUB_METHOD() throws FMLManipulationException {
        return ((String) this.fmlBuffer[26].getValue(0));
    }

    /**
     * Retrieves the value of the 'EFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Value of 'EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EFFECTIVE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[27].getValue(0));
    }

    /**
     * Retrieves the value of the 'EXPIRATION_DATE' field in the FML buffer.
     *
     * @return Value of 'EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EXPIRATION_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[28].getValue(0));
    }

    /**
     * Retrieves the value of the 'DD_CONTRACT_NO' field in the FML buffer.
     *
     * @return Value of 'DD_CONTRACT_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DD_CONTRACT_NO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[29].getValue(0));
    }

    /**
     * Retrieves the value of the 'CREDIT_CARD_NO' field in the FML buffer.
     *
     * @return Value of 'CREDIT_CARD_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CREDIT_CARD_NO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[30].getValue(0));
    }

    /**
     * Retrieves the value of the 'CR_CARD_EXPIR_DATE' field in the FML buffer.
     *
     * @return Value of 'CR_CARD_EXPIR_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CR_CARD_EXPIR_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[31].getValue(0));
    }

    /**
     * Retrieves the value of the 'BANK_CODE' field in the FML buffer.
     *
     * @return Value of 'BANK_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BANK_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[32].getValue(0));
    }

    /**
     * Retrieves the value of the 'BANK_BRANCH_CODE' field in the FML buffer.
     *
     * @return Value of 'BANK_BRANCH_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BANK_BRANCH_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[33].getValue(0));
    }

    /**
     * Retrieves the value of the 'BANK_ACCT_NO' field in the FML buffer.
     *
     * @return Value of 'BANK_ACCT_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BANK_ACCT_NO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[34].getValue(0));
    }

    /**
     * Retrieves the value of the 'AUTHORIZATION_CODE' field in the FML buffer.
     *
     * @return Value of 'AUTHORIZATION_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_AUTHORIZATION_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[35].getValue(0));
    }

    /**
     * Retrieves the value of the 'FILE_SEQ_NO' field in the FML buffer.
     *
     * @return Value of 'FILE_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_FILE_SEQ_NO() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[36].getValue(0));
    }

    /**
     * Retrieves the value of the 'DD_REFERENCE' field in the FML buffer.
     *
     * @return Value of 'DD_REFERENCE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DD_REFERENCE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[37].getValue(0));
    }

    /**
     * Retrieves the value of the 'IMD_DDREQ_IND' field in the FML buffer.
     *
     * @return Value of 'IMD_DDREQ_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_IMD_DDREQ_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[38].getValue(0)));
    }

    /**
     * Retrieves the value of the 'DD_STATUS' field in the FML buffer.
     *
     * @return Value of 'DD_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DD_STATUS() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[39].getValue(0)));
    }
}