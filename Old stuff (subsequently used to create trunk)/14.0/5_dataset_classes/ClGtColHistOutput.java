/*
 * ClGtColHistOutput.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service.parameters;

import bea.jolt.pool.Result;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;

/**
 * @author  Ninja
 *
 * ClGtColHistOutput class.
 */
public class ClGtColHistOutput extends ServiceOutput {

    /**
     * Creates a new instance of ClGtColHistOutput.
     *
     * @throws FMLManipulationException
     */
    public ClGtColHistOutput(int nApplicationStatus) throws FMLManipulationException {
        createFmlBuffer();
        setApplicationCode(nApplicationStatus);
    }

    public ClGtColHistOutput() {
    }

    /**
     * Creates a new instance of ClGtColHistOutput.
     *
     * @param ds Output dataset from ClGtColHist service.
     * @throws FMLManipulationException
     */
    public ClGtColHistOutput(Result ds) throws FMLManipulationException {
        createFmlBuffer();
        populateFmlBuffer(ds);
    }

    /**
     * Populates the FML buffer.
     *
     * @throws FMLManipulationException
     */
    private void createFmlBuffer() throws FMLManipulationException {
        this.fmlBuffer = new FmlField[43];
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
        this.fmlBuffer[16] = new FmlField("MOREROWS", FmlField.TYPE_SHORT, -1, null, 16, 1);
        this.fmlBuffer[17] = new FmlField("ROWCOUNT", FmlField.TYPE_INTEGER, -1, null, 17, 1);
        this.fmlBuffer[18] = new FmlField("ROWID", FmlField.TYPE_STRING, 19, null, 18, 100);
        this.fmlBuffer[19] = new FmlField("BAN", FmlField.TYPE_INTEGER, -1, null, 19, 100);
        this.fmlBuffer[20] = new FmlField("ENT_SEQ_NO", FmlField.TYPE_INTEGER, -1, null, 20, 100);
        this.fmlBuffer[21] = new FmlField("COL_ACTV_DATE", FmlField.TYPE_STRING, 9, null, 21, 100);
        this.fmlBuffer[22] = new FmlField("ASGN_COLLECTOR", FmlField.TYPE_STRING, 9, null, 22, 100);
        this.fmlBuffer[23] = new FmlField("ASGN_COLL_DATE", FmlField.TYPE_STRING, 9, null, 23, 100);
        this.fmlBuffer[24] = new FmlField("ASGN_AGENCY", FmlField.TYPE_STRING, 9, null, 24, 100);
        this.fmlBuffer[25] = new FmlField("ASGN_AGENCY_DATE", FmlField.TYPE_STRING, 9, null, 25, 100);
        this.fmlBuffer[26] = new FmlField("APPROVAL_COLLECTOR", FmlField.TYPE_STRING, 9, null, 26, 100);
        this.fmlBuffer[27] = new FmlField("COL_PATH_CODE", FmlField.TYPE_STRING, 4, null, 27, 100);
        this.fmlBuffer[28] = new FmlField("COL_STEP_NUM", FmlField.TYPE_SHORT, -1, null, 28, 100);
        this.fmlBuffer[29] = new FmlField("COL_ACTV_CODE", FmlField.TYPE_STRING, 3, null, 29, 100);
        this.fmlBuffer[30] = new FmlField("COL_ACTV_TYPE_IND", FmlField.TYPE_BYTE, -1, null, 30, 100);
        this.fmlBuffer[31] = new FmlField("COL_CATEGORY_NO", FmlField.TYPE_SHORT, -1, null, 31, 100);
        this.fmlBuffer[32] = new FmlField("COL_NEXT_STP_APR_COD", FmlField.TYPE_BYTE, -1, null, 32, 100);
        this.fmlBuffer[33] = new FmlField("COL_CODE", FmlField.TYPE_BYTE, -1, null, 33, 100);
        this.fmlBuffer[34] = new FmlField("COL_AMT", FmlField.TYPE_DOUBLE, -1, null, 34, 100);
        this.fmlBuffer[35] = new FmlField("INVOICE_NO", FmlField.TYPE_STRING, 14, null, 35, 100);
        this.fmlBuffer[36] = new FmlField("COL_ACTIVITY_DESC", FmlField.TYPE_STRING, 31, null, 36, 100);
        this.fmlBuffer[37] = new FmlField("COL_AGENCY_FULL_NAME", FmlField.TYPE_STRING, 31, null, 37, 100);
        this.fmlBuffer[38] = new FmlField("COLLECTOR_USER_ID", FmlField.TYPE_INTEGER, -1, null, 38, 100);
        this.fmlBuffer[39] = new FmlField("COLLECTOR_USER_NAME", FmlField.TYPE_STRING, 21, null, 39, 100);
        this.fmlBuffer[40] = new FmlField("APPROVE_USER_ID", FmlField.TYPE_INTEGER, -1, null, 40, 100);
        this.fmlBuffer[41] = new FmlField("APPROVE_USER_NAME", FmlField.TYPE_STRING, 21, null, 41, 100);
        this.fmlBuffer[42] = new FmlField("COLL_FEE_IND", FmlField.TYPE_BYTE, -1, null, 42, 100);
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
     * Retrieves the value of the 'MOREROWS' field in the FML buffer.
     *
     * @return Value of 'MOREROWS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_MOREROWS() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[16].getValue(0)));
    }

    /**
     * Retrieves the value of the 'ROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'ROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[17].getValue(0));
    }

    /**
     * Retrieves the value of the 'ROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'ROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[18].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'ROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[18].getCount());
    }

    /**
     * Retrieves the value of the 'BAN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BAN(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[19].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'BAN' field in the FML buffer.
     *
     * @return Number of values defined for 'BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_BAN_size() throws FMLManipulationException {
        return (this.fmlBuffer[19].getCount());
    }

    /**
     * Retrieves the value of the 'ENT_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'ENT_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ENT_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[20].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ENT_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'ENT_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ENT_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[20].getCount());
    }

    /**
     * Retrieves the value of the 'COL_ACTV_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'COL_ACTV_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_ACTV_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[21].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'COL_ACTV_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'COL_ACTV_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COL_ACTV_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[21].getCount());
    }

    /**
     * Retrieves the value of the 'ASGN_COLLECTOR' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'ASGN_COLLECTOR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ASGN_COLLECTOR(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[22].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ASGN_COLLECTOR' field in the FML buffer.
     *
     * @return Number of values defined for 'ASGN_COLLECTOR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ASGN_COLLECTOR_size() throws FMLManipulationException {
        return (this.fmlBuffer[22].getCount());
    }

    /**
     * Retrieves the value of the 'ASGN_COLL_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'ASGN_COLL_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ASGN_COLL_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[23].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ASGN_COLL_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'ASGN_COLL_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ASGN_COLL_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[23].getCount());
    }

    /**
     * Retrieves the value of the 'ASGN_AGENCY' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'ASGN_AGENCY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ASGN_AGENCY(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[24].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ASGN_AGENCY' field in the FML buffer.
     *
     * @return Number of values defined for 'ASGN_AGENCY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ASGN_AGENCY_size() throws FMLManipulationException {
        return (this.fmlBuffer[24].getCount());
    }

    /**
     * Retrieves the value of the 'ASGN_AGENCY_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'ASGN_AGENCY_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ASGN_AGENCY_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[25].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ASGN_AGENCY_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'ASGN_AGENCY_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ASGN_AGENCY_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[25].getCount());
    }

    /**
     * Retrieves the value of the 'APPROVAL_COLLECTOR' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'APPROVAL_COLLECTOR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_APPROVAL_COLLECTOR(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[26].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'APPROVAL_COLLECTOR' field in the FML buffer.
     *
     * @return Number of values defined for 'APPROVAL_COLLECTOR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_APPROVAL_COLLECTOR_size() throws FMLManipulationException {
        return (this.fmlBuffer[26].getCount());
    }

    /**
     * Retrieves the value of the 'COL_PATH_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'COL_PATH_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_PATH_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[27].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'COL_PATH_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'COL_PATH_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COL_PATH_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[27].getCount());
    }

    /**
     * Retrieves the value of the 'COL_STEP_NUM' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'COL_STEP_NUM' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_COL_STEP_NUM(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[28].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'COL_STEP_NUM' field in the FML buffer.
     *
     * @return Number of values defined for 'COL_STEP_NUM' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COL_STEP_NUM_size() throws FMLManipulationException {
        return (this.fmlBuffer[28].getCount());
    }

    /**
     * Retrieves the value of the 'COL_ACTV_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'COL_ACTV_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_ACTV_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[29].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'COL_ACTV_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'COL_ACTV_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COL_ACTV_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[29].getCount());
    }

    /**
     * Retrieves the value of the 'COL_ACTV_TYPE_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'COL_ACTV_TYPE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_ACTV_TYPE_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[30].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'COL_ACTV_TYPE_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'COL_ACTV_TYPE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COL_ACTV_TYPE_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[30].getCount());
    }

    /**
     * Retrieves the value of the 'COL_CATEGORY_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'COL_CATEGORY_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_COL_CATEGORY_NO(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[31].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'COL_CATEGORY_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'COL_CATEGORY_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COL_CATEGORY_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[31].getCount());
    }

    /**
     * Retrieves the value of the 'COL_NEXT_STP_APR_COD' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'COL_NEXT_STP_APR_COD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_NEXT_STP_APR_COD(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[32].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'COL_NEXT_STP_APR_COD' field in the FML buffer.
     *
     * @return Number of values defined for 'COL_NEXT_STP_APR_COD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COL_NEXT_STP_APR_COD_size() throws FMLManipulationException {
        return (this.fmlBuffer[32].getCount());
    }

    /**
     * Retrieves the value of the 'COL_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'COL_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_CODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[33].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'COL_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'COL_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COL_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[33].getCount());
    }

    /**
     * Retrieves the value of the 'COL_AMT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'COL_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_COL_AMT(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[34].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'COL_AMT' field in the FML buffer.
     *
     * @return Number of values defined for 'COL_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COL_AMT_size() throws FMLManipulationException {
        return (this.fmlBuffer[34].getCount());
    }

    /**
     * Retrieves the value of the 'INVOICE_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'INVOICE_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_INVOICE_NO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[35].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'INVOICE_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'INVOICE_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_INVOICE_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[35].getCount());
    }

    /**
     * Retrieves the value of the 'COL_ACTIVITY_DESC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'COL_ACTIVITY_DESC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_ACTIVITY_DESC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[36].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'COL_ACTIVITY_DESC' field in the FML buffer.
     *
     * @return Number of values defined for 'COL_ACTIVITY_DESC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COL_ACTIVITY_DESC_size() throws FMLManipulationException {
        return (this.fmlBuffer[36].getCount());
    }

    /**
     * Retrieves the value of the 'COL_AGENCY_FULL_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'COL_AGENCY_FULL_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_AGENCY_FULL_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[37].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'COL_AGENCY_FULL_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'COL_AGENCY_FULL_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COL_AGENCY_FULL_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[37].getCount());
    }

    /**
     * Retrieves the value of the 'COLLECTOR_USER_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'COLLECTOR_USER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_COLLECTOR_USER_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[38].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'COLLECTOR_USER_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'COLLECTOR_USER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COLLECTOR_USER_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[38].getCount());
    }

    /**
     * Retrieves the value of the 'COLLECTOR_USER_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'COLLECTOR_USER_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COLLECTOR_USER_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[39].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'COLLECTOR_USER_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'COLLECTOR_USER_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COLLECTOR_USER_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[39].getCount());
    }

    /**
     * Retrieves the value of the 'APPROVE_USER_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'APPROVE_USER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_APPROVE_USER_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[40].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'APPROVE_USER_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'APPROVE_USER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_APPROVE_USER_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[40].getCount());
    }

    /**
     * Retrieves the value of the 'APPROVE_USER_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'APPROVE_USER_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_APPROVE_USER_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[41].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'APPROVE_USER_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'APPROVE_USER_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_APPROVE_USER_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[41].getCount());
    }

    /**
     * Retrieves the value of the 'COLL_FEE_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'COLL_FEE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COLL_FEE_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[42].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'COLL_FEE_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'COLL_FEE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COLL_FEE_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[42].getCount());
    }
}