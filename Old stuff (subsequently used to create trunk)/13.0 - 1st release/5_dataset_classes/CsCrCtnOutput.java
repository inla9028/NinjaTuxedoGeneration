/*
 * CsCrCtnOutput.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service.parameters;

import bea.jolt.pool.Result;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;

/**
 * @author  Ninja
 *
 * CsCrCtnOutput class.
 */
public class CsCrCtnOutput extends ServiceOutput {

    /**
     * Creates a new instance of CsCrCtnOutput.
     *
     * @throws FMLManipulationException
     */
    public CsCrCtnOutput(int nApplicationStatus) throws FMLManipulationException {
        createFmlBuffer();
        setApplicationCode(nApplicationStatus);
    }

    public CsCrCtnOutput() {
    }

    /**
     * Creates a new instance of CsCrCtnOutput.
     *
     * @param ds Output dataset from CsCrCtn service.
     * @throws FMLManipulationException
     */
    public CsCrCtnOutput(Result ds) throws FMLManipulationException {
        createFmlBuffer();
        populateFmlBuffer(ds);
    }

    /**
     * Populates the FML buffer.
     *
     * @throws FMLManipulationException
     */
    private void createFmlBuffer() throws FMLManipulationException {
        this.fmlBuffer = new FmlField[47];
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
        this.fmlBuffer[16] = new FmlField("PNPINFOBUFFROWCOUNT", FmlField.TYPE_INTEGER, -1, null, 16, 1);
        this.fmlBuffer[17] = new FmlField("NPNUMINFORECROWID", FmlField.TYPE_STRING, 19, null, 17, 500);
        this.fmlBuffer[18] = new FmlField("PORT_NUMBER", FmlField.TYPE_STRING, 21, null, 18, 500);
        this.fmlBuffer[19] = new FmlField("NPNUMINFORECEFFECTIVE_DATE", FmlField.TYPE_STRING, 15, null, 19, 500);
        this.fmlBuffer[20] = new FmlField("NPNUMINFORECSYS_CREATION_DATE", FmlField.TYPE_STRING, 15, null, 20, 500);
        this.fmlBuffer[21] = new FmlField("NPNUMINFORECSYS_UPDATE_DATE", FmlField.TYPE_STRING, 15, null, 21, 500);
        this.fmlBuffer[22] = new FmlField("NPNUMINFORECOPERATOR_ID", FmlField.TYPE_INTEGER, -1, null, 22, 500);
        this.fmlBuffer[23] = new FmlField("NPNUMINFORECAPPLICATION_ID", FmlField.TYPE_STRING, 7, null, 23, 500);
        this.fmlBuffer[24] = new FmlField("NPNUMINFORECDL_SERVICE_CODE", FmlField.TYPE_STRING, 6, null, 24, 500);
        this.fmlBuffer[25] = new FmlField("NPNUMINFORECDL_UPDATE_STAMP", FmlField.TYPE_SHORT, -1, null, 25, 500);
        this.fmlBuffer[26] = new FmlField("NPNUMINFORECEXPIRATION_DATE", FmlField.TYPE_STRING, 15, null, 26, 500);
        this.fmlBuffer[27] = new FmlField("INT_ORDER_ID", FmlField.TYPE_DOUBLE, -1, null, 27, 500);
        this.fmlBuffer[28] = new FmlField("ORG_CUSTOMER_ID", FmlField.TYPE_STRING, 61, null, 28, 500);
        this.fmlBuffer[29] = new FmlField("PORT_IND", FmlField.TYPE_BYTE, -1, null, 29, 500);
        this.fmlBuffer[30] = new FmlField("NUMBER_TYPE", FmlField.TYPE_BYTE, -1, null, 30, 500);
        this.fmlBuffer[31] = new FmlField("PORT_REQUEST_DATE", FmlField.TYPE_STRING, 15, null, 31, 500);
        this.fmlBuffer[32] = new FmlField("ORG_OPERATOR", FmlField.TYPE_STRING, 6, null, 32, 500);
        this.fmlBuffer[33] = new FmlField("NPNUMINFORECSUBSCRIBER_ID", FmlField.TYPE_INTEGER, -1, null, 33, 500);
        this.fmlBuffer[34] = new FmlField("LAST_INT_ORD_ID", FmlField.TYPE_DOUBLE, -1, null, 34, 500);
        this.fmlBuffer[35] = new FmlField("FUNCTION_PORT_IND", FmlField.TYPE_BYTE, -1, null, 35, 500);
        this.fmlBuffer[36] = new FmlField("PASSIVE_IND", FmlField.TYPE_BYTE, -1, null, 36, 500);
        this.fmlBuffer[37] = new FmlField("AUTO_CONFIRM", FmlField.TYPE_BYTE, -1, null, 37, 500);
        this.fmlBuffer[38] = new FmlField("TEMPORARY_MSISDN", FmlField.TYPE_STRING, 21, null, 38, 500);
        this.fmlBuffer[39] = new FmlField("HANDLE_MODE", FmlField.TYPE_BYTE, -1, null, 39, 500);
        this.fmlBuffer[40] = new FmlField("SEND_IND", FmlField.TYPE_BYTE, -1, null, 40, 500);
        this.fmlBuffer[41] = new FmlField("ORDID_STR", FmlField.TYPE_STRING, 21, null, 41, 500);
        this.fmlBuffer[42] = new FmlField("LAST_ORDID_STR", FmlField.TYPE_STRING, 21, null, 42, 500);
        this.fmlBuffer[43] = new FmlField("ICC", FmlField.TYPE_STRING, 61, null, 43, 500);
        this.fmlBuffer[44] = new FmlField("CUSTOMER_NAME", FmlField.TYPE_STRING, 255, null, 44, 500);
        this.fmlBuffer[45] = new FmlField("NPINFOBUFFCUSTOMER_ID", FmlField.TYPE_STRING, 61, null, 45, 500);
        this.fmlBuffer[46] = new FmlField("SERVICE_PROVIDER", FmlField.TYPE_STRING, 6, null, 46, 500);
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
     * Retrieves the value of the 'PNPINFOBUFFROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'PNPINFOBUFFROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PNPINFOBUFFROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[16].getValue(0));
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPNUMINFORECROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[17].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NPNUMINFORECROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[17].getCount());
    }

    /**
     * Retrieves the value of the 'PORT_NUMBER' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'PORT_NUMBER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PORT_NUMBER(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[18].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'PORT_NUMBER' field in the FML buffer.
     *
     * @return Number of values defined for 'PORT_NUMBER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PORT_NUMBER_size() throws FMLManipulationException {
        return (this.fmlBuffer[18].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPNUMINFORECEFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[19].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NPNUMINFORECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECEFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[19].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECSYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPNUMINFORECSYS_CREATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[20].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NPNUMINFORECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECSYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECSYS_CREATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[20].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECSYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPNUMINFORECSYS_UPDATE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[21].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NPNUMINFORECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECSYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECSYS_UPDATE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[21].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECOPERATOR_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NPNUMINFORECOPERATOR_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[22].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NPNUMINFORECOPERATOR_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECOPERATOR_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[22].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECAPPLICATION_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPNUMINFORECAPPLICATION_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[23].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NPNUMINFORECAPPLICATION_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECAPPLICATION_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[23].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECDL_SERVICE_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECDL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPNUMINFORECDL_SERVICE_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[24].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NPNUMINFORECDL_SERVICE_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECDL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECDL_SERVICE_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[24].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECDL_UPDATE_STAMP' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECDL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NPNUMINFORECDL_UPDATE_STAMP(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[25].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'NPNUMINFORECDL_UPDATE_STAMP' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECDL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECDL_UPDATE_STAMP_size() throws FMLManipulationException {
        return (this.fmlBuffer[25].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECEXPIRATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECEXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPNUMINFORECEXPIRATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[26].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NPNUMINFORECEXPIRATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECEXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECEXPIRATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[26].getCount());
    }

    /**
     * Retrieves the value of the 'INT_ORDER_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'INT_ORDER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_INT_ORDER_ID(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[27].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'INT_ORDER_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'INT_ORDER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_INT_ORDER_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[27].getCount());
    }

    /**
     * Retrieves the value of the 'ORG_CUSTOMER_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'ORG_CUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ORG_CUSTOMER_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[28].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ORG_CUSTOMER_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'ORG_CUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ORG_CUSTOMER_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[28].getCount());
    }

    /**
     * Retrieves the value of the 'PORT_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'PORT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PORT_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[29].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'PORT_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'PORT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PORT_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[29].getCount());
    }

    /**
     * Retrieves the value of the 'NUMBER_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NUMBER_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NUMBER_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[30].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'NUMBER_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'NUMBER_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NUMBER_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[30].getCount());
    }

    /**
     * Retrieves the value of the 'PORT_REQUEST_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'PORT_REQUEST_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PORT_REQUEST_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[31].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'PORT_REQUEST_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'PORT_REQUEST_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PORT_REQUEST_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[31].getCount());
    }

    /**
     * Retrieves the value of the 'ORG_OPERATOR' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'ORG_OPERATOR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ORG_OPERATOR(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[32].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ORG_OPERATOR' field in the FML buffer.
     *
     * @return Number of values defined for 'ORG_OPERATOR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ORG_OPERATOR_size() throws FMLManipulationException {
        return (this.fmlBuffer[32].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECSUBSCRIBER_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECSUBSCRIBER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NPNUMINFORECSUBSCRIBER_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[33].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NPNUMINFORECSUBSCRIBER_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECSUBSCRIBER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECSUBSCRIBER_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[33].getCount());
    }

    /**
     * Retrieves the value of the 'LAST_INT_ORD_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'LAST_INT_ORD_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_LAST_INT_ORD_ID(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[34].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'LAST_INT_ORD_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'LAST_INT_ORD_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LAST_INT_ORD_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[34].getCount());
    }

    /**
     * Retrieves the value of the 'FUNCTION_PORT_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'FUNCTION_PORT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FUNCTION_PORT_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[35].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'FUNCTION_PORT_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'FUNCTION_PORT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FUNCTION_PORT_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[35].getCount());
    }

    /**
     * Retrieves the value of the 'PASSIVE_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'PASSIVE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PASSIVE_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[36].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'PASSIVE_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'PASSIVE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PASSIVE_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[36].getCount());
    }

    /**
     * Retrieves the value of the 'AUTO_CONFIRM' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'AUTO_CONFIRM' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_AUTO_CONFIRM(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[37].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'AUTO_CONFIRM' field in the FML buffer.
     *
     * @return Number of values defined for 'AUTO_CONFIRM' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_AUTO_CONFIRM_size() throws FMLManipulationException {
        return (this.fmlBuffer[37].getCount());
    }

    /**
     * Retrieves the value of the 'TEMPORARY_MSISDN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'TEMPORARY_MSISDN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_TEMPORARY_MSISDN(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[38].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'TEMPORARY_MSISDN' field in the FML buffer.
     *
     * @return Number of values defined for 'TEMPORARY_MSISDN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_TEMPORARY_MSISDN_size() throws FMLManipulationException {
        return (this.fmlBuffer[38].getCount());
    }

    /**
     * Retrieves the value of the 'HANDLE_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'HANDLE_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_HANDLE_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[39].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'HANDLE_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'HANDLE_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_HANDLE_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[39].getCount());
    }

    /**
     * Retrieves the value of the 'SEND_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'SEND_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SEND_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[40].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'SEND_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'SEND_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SEND_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[40].getCount());
    }

    /**
     * Retrieves the value of the 'ORDID_STR' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'ORDID_STR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ORDID_STR(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[41].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ORDID_STR' field in the FML buffer.
     *
     * @return Number of values defined for 'ORDID_STR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ORDID_STR_size() throws FMLManipulationException {
        return (this.fmlBuffer[41].getCount());
    }

    /**
     * Retrieves the value of the 'LAST_ORDID_STR' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'LAST_ORDID_STR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LAST_ORDID_STR(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[42].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'LAST_ORDID_STR' field in the FML buffer.
     *
     * @return Number of values defined for 'LAST_ORDID_STR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LAST_ORDID_STR_size() throws FMLManipulationException {
        return (this.fmlBuffer[42].getCount());
    }

    /**
     * Retrieves the value of the 'ICC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'ICC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ICC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[43].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ICC' field in the FML buffer.
     *
     * @return Number of values defined for 'ICC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ICC_size() throws FMLManipulationException {
        return (this.fmlBuffer[43].getCount());
    }

    /**
     * Retrieves the value of the 'CUSTOMER_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'CUSTOMER_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CUSTOMER_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[44].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'CUSTOMER_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'CUSTOMER_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CUSTOMER_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[44].getCount());
    }

    /**
     * Retrieves the value of the 'NPINFOBUFFCUSTOMER_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPINFOBUFFCUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPINFOBUFFCUSTOMER_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[45].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NPINFOBUFFCUSTOMER_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'NPINFOBUFFCUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPINFOBUFFCUSTOMER_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[45].getCount());
    }

    /**
     * Retrieves the value of the 'SERVICE_PROVIDER' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'SERVICE_PROVIDER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SERVICE_PROVIDER(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[46].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'SERVICE_PROVIDER' field in the FML buffer.
     *
     * @return Number of values defined for 'SERVICE_PROVIDER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SERVICE_PROVIDER_size() throws FMLManipulationException {
        return (this.fmlBuffer[46].getCount());
    }
}