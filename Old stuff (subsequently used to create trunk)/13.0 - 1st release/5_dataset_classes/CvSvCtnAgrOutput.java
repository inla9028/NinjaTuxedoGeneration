/*
 * CvSvCtnAgrOutput.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service.parameters;

import bea.jolt.pool.Result;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;

/**
 * @author  Ninja
 *
 * CvSvCtnAgrOutput class.
 */
public class CvSvCtnAgrOutput extends ServiceOutput {

    /**
     * Creates a new instance of CvSvCtnAgrOutput.
     *
     * @throws FMLManipulationException
     */
    public CvSvCtnAgrOutput(int nApplicationStatus) throws FMLManipulationException {
        createFmlBuffer();
        setApplicationCode(nApplicationStatus);
    }

    public CvSvCtnAgrOutput() {
    }

    /**
     * Creates a new instance of CvSvCtnAgrOutput.
     *
     * @param ds Output dataset from CvSvCtnAgr service.
     * @throws FMLManipulationException
     */
    public CvSvCtnAgrOutput(Result ds) throws FMLManipulationException {
        createFmlBuffer();
        populateFmlBuffer(ds);
    }

    /**
     * Populates the FML buffer.
     *
     * @throws FMLManipulationException
     */
    private void createFmlBuffer() throws FMLManipulationException {
        this.fmlBuffer = new FmlField[64];
        this.fmlBuffer[0] = new FmlField("GENERATION", FmlField.TYPE_INTEGER, -1, null, 0, 1);
        this.fmlBuffer[1] = new FmlField("PSOCFTRBUFROWCOUNT", FmlField.TYPE_INTEGER, -1, null, 1, 1);
        this.fmlBuffer[2] = new FmlField("PSOCFTRBUFROWID", FmlField.TYPE_STRING, 19, null, 2, 200);
        this.fmlBuffer[3] = new FmlField("PSOCFTRBUFSOC", FmlField.TYPE_STRING, 10, null, 3, 200);
        this.fmlBuffer[4] = new FmlField("PSOCFTRBUFSOC_EFFECTIVE_DATE", FmlField.TYPE_STRING, 9, null, 4, 200);
        this.fmlBuffer[5] = new FmlField("FEATURE_CODE", FmlField.TYPE_STRING, 7, null, 5, 200);
        this.fmlBuffer[6] = new FmlField("MPS_FTR_CODE", FmlField.TYPE_STRING, 7, null, 6, 200);
        this.fmlBuffer[7] = new FmlField("FTR_EFFECTIVE_DATE", FmlField.TYPE_STRING, 9, null, 7, 200);
        this.fmlBuffer[8] = new FmlField("FTR_EXPIRATION_DATE", FmlField.TYPE_STRING, 9, null, 8, 200);
        this.fmlBuffer[9] = new FmlField("FTR_EFF_RSN_CODE", FmlField.TYPE_BYTE, -1, null, 9, 200);
        this.fmlBuffer[10] = new FmlField("FTR_EXP_RSN_CODE", FmlField.TYPE_BYTE, -1, null, 10, 200);
        this.fmlBuffer[11] = new FmlField("SERVICE_FTR_SEQ_NO", FmlField.TYPE_INTEGER, -1, null, 11, 200);
        this.fmlBuffer[12] = new FmlField("FTR_MODE", FmlField.TYPE_BYTE, -1, null, 12, 200);
        this.fmlBuffer[13] = new FmlField("PSOCFTRBUFSOC_SEQ_NO", FmlField.TYPE_INTEGER, -1, null, 13, 200);
        this.fmlBuffer[14] = new FmlField("FTR_SUB_MODE", FmlField.TYPE_BYTE, -1, null, 14, 200);
        this.fmlBuffer[15] = new FmlField("FTR_ADD_PARAM", FmlField.TYPE_STRING, 301, null, 15, 200);
        this.fmlBuffer[16] = new FmlField("FEATURE_TYPE", FmlField.TYPE_STRING, 4, null, 16, 200);
        this.fmlBuffer[17] = new FmlField("PSOCFTRBUFPRODUCT_TYPE", FmlField.TYPE_STRING, 4, null, 17, 200);
        this.fmlBuffer[18] = new FmlField("PSOCFTRBUFCAMPAIGN_SEQ", FmlField.TYPE_INTEGER, -1, null, 18, 200);
        this.fmlBuffer[19] = new FmlField("FTR_SPECIAL_TELNO", FmlField.TYPE_STRING, 21, null, 19, 200);
        this.fmlBuffer[20] = new FmlField("SWITCH_ACT_NEEDED", FmlField.TYPE_BYTE, -1, null, 20, 200);
        this.fmlBuffer[21] = new FmlField("SWITCH_CODE", FmlField.TYPE_STRING, 7, null, 21, 200);
        this.fmlBuffer[22] = new FmlField("MSISDN_CRITERIA", FmlField.TYPE_BYTE, -1, null, 22, 200);
        this.fmlBuffer[23] = new FmlField("TN_CLASS_CD", FmlField.TYPE_STRING, 4, null, 23, 200);
        this.fmlBuffer[24] = new FmlField("ACTION_MODE", FmlField.TYPE_BYTE, -1, null, 24, 200);
        this.fmlBuffer[25] = new FmlField("MANUAL_RC_RATE", FmlField.TYPE_DOUBLE, -1, null, 25, 200);
        this.fmlBuffer[26] = new FmlField("MANUAL_RC_EXP_DATE", FmlField.TYPE_STRING, 9, null, 26, 200);
        this.fmlBuffer[27] = new FmlField("ROWCOUNT", FmlField.TYPE_INTEGER, -1, null, 27, 1);
        this.fmlBuffer[28] = new FmlField("MSISDN", FmlField.TYPE_STRING, 21, null, 28, 100);
        this.fmlBuffer[29] = new FmlField("NL", FmlField.TYPE_STRING, 4, null, 29, 100);
        this.fmlBuffer[30] = new FmlField("CODE", FmlField.TYPE_INTEGER, -1, null, 30, 100);
        this.fmlBuffer[31] = new FmlField("SUBSCRIBER_NO", FmlField.TYPE_STRING, 21, null, 31, 100);
        this.fmlBuffer[32] = new FmlField("GSMBUFFEATURE_CODE", FmlField.TYPE_STRING, 7, null, 32, 100);
        this.fmlBuffer[33] = new FmlField("PNPINFOBUFFROWCOUNT", FmlField.TYPE_INTEGER, -1, null, 33, 1);
        this.fmlBuffer[34] = new FmlField("NPNUMINFORECROWID", FmlField.TYPE_STRING, 19, null, 34, 500);
        this.fmlBuffer[35] = new FmlField("PORT_NUMBER", FmlField.TYPE_STRING, 21, null, 35, 500);
        this.fmlBuffer[36] = new FmlField("NPNUMINFORECEFFECTIVE_DATE", FmlField.TYPE_STRING, 15, null, 36, 500);
        this.fmlBuffer[37] = new FmlField("SYS_CREATION_DATE", FmlField.TYPE_STRING, 15, null, 37, 500);
        this.fmlBuffer[38] = new FmlField("SYS_UPDATE_DATE", FmlField.TYPE_STRING, 15, null, 38, 500);
        this.fmlBuffer[39] = new FmlField("NPNUMINFORECOPERATOR_ID", FmlField.TYPE_INTEGER, -1, null, 39, 500);
        this.fmlBuffer[40] = new FmlField("NPNUMINFORECAPPLICATION_ID", FmlField.TYPE_STRING, 7, null, 40, 500);
        this.fmlBuffer[41] = new FmlField("DL_SERVICE_CODE", FmlField.TYPE_STRING, 6, null, 41, 500);
        this.fmlBuffer[42] = new FmlField("DL_UPDATE_STAMP", FmlField.TYPE_SHORT, -1, null, 42, 500);
        this.fmlBuffer[43] = new FmlField("NPNUMINFORECEXPIRATION_DATE", FmlField.TYPE_STRING, 15, null, 43, 500);
        this.fmlBuffer[44] = new FmlField("INT_ORDER_ID", FmlField.TYPE_DOUBLE, -1, null, 44, 500);
        this.fmlBuffer[45] = new FmlField("ORG_CUSTOMER_ID", FmlField.TYPE_STRING, 61, null, 45, 500);
        this.fmlBuffer[46] = new FmlField("PORT_IND", FmlField.TYPE_BYTE, -1, null, 46, 500);
        this.fmlBuffer[47] = new FmlField("NUMBER_TYPE", FmlField.TYPE_BYTE, -1, null, 47, 500);
        this.fmlBuffer[48] = new FmlField("PORT_REQUEST_DATE", FmlField.TYPE_STRING, 15, null, 48, 500);
        this.fmlBuffer[49] = new FmlField("ORG_OPERATOR", FmlField.TYPE_STRING, 6, null, 49, 500);
        this.fmlBuffer[50] = new FmlField("SUBSCRIBER_ID", FmlField.TYPE_INTEGER, -1, null, 50, 500);
        this.fmlBuffer[51] = new FmlField("LAST_INT_ORD_ID", FmlField.TYPE_DOUBLE, -1, null, 51, 500);
        this.fmlBuffer[52] = new FmlField("FUNCTION_PORT_IND", FmlField.TYPE_BYTE, -1, null, 52, 500);
        this.fmlBuffer[53] = new FmlField("PASSIVE_IND", FmlField.TYPE_BYTE, -1, null, 53, 500);
        this.fmlBuffer[54] = new FmlField("AUTO_CONFIRM", FmlField.TYPE_BYTE, -1, null, 54, 500);
        this.fmlBuffer[55] = new FmlField("TEMPORARY_MSISDN", FmlField.TYPE_STRING, 21, null, 55, 500);
        this.fmlBuffer[56] = new FmlField("HANDLE_MODE", FmlField.TYPE_BYTE, -1, null, 56, 500);
        this.fmlBuffer[57] = new FmlField("SEND_IND", FmlField.TYPE_BYTE, -1, null, 57, 500);
        this.fmlBuffer[58] = new FmlField("ORDID_STR", FmlField.TYPE_STRING, 21, null, 58, 500);
        this.fmlBuffer[59] = new FmlField("LAST_ORDID_STR", FmlField.TYPE_STRING, 21, null, 59, 500);
        this.fmlBuffer[60] = new FmlField("ICC", FmlField.TYPE_STRING, 61, null, 60, 500);
        this.fmlBuffer[61] = new FmlField("CUSTOMER_NAME", FmlField.TYPE_STRING, 255, null, 61, 500);
        this.fmlBuffer[62] = new FmlField("NPINFOBUFFCUSTOMER_ID", FmlField.TYPE_STRING, 61, null, 62, 500);
        this.fmlBuffer[63] = new FmlField("SERVICE_PROVIDER", FmlField.TYPE_STRING, 6, null, 63, 500);
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
     * Retrieves the value of the 'PSOCFTRBUFROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'PSOCFTRBUFROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PSOCFTRBUFROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[1].getValue(0));
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSOCFTRBUFROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PSOCFTRBUFROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[2].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'PSOCFTRBUFROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'PSOCFTRBUFROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSOCFTRBUFROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[2].getCount());
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFSOC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSOCFTRBUFSOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PSOCFTRBUFSOC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[3].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'PSOCFTRBUFSOC' field in the FML buffer.
     *
     * @return Number of values defined for 'PSOCFTRBUFSOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSOCFTRBUFSOC_size() throws FMLManipulationException {
        return (this.fmlBuffer[3].getCount());
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFSOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSOCFTRBUFSOC_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PSOCFTRBUFSOC_EFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[4].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'PSOCFTRBUFSOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'PSOCFTRBUFSOC_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSOCFTRBUFSOC_EFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[4].getCount());
    }

    /**
     * Retrieves the value of the 'FEATURE_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FEATURE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FEATURE_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[5].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'FEATURE_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FEATURE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FEATURE_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[5].getCount());
    }

    /**
     * Retrieves the value of the 'MPS_FTR_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'MPS_FTR_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MPS_FTR_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[6].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'MPS_FTR_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'MPS_FTR_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MPS_FTR_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[6].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_EFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[7].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'FTR_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_EFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[7].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_EXPIRATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_EXPIRATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[8].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'FTR_EXPIRATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_EXPIRATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[8].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_EFF_RSN_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_EFF_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_EFF_RSN_CODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[9].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'FTR_EFF_RSN_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_EFF_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_EFF_RSN_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[9].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_EXP_RSN_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_EXP_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_EXP_RSN_CODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[10].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'FTR_EXP_RSN_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_EXP_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_EXP_RSN_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[10].getCount());
    }

    /**
     * Retrieves the value of the 'SERVICE_FTR_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'SERVICE_FTR_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_SERVICE_FTR_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[11].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'SERVICE_FTR_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'SERVICE_FTR_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SERVICE_FTR_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[11].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[12].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'FTR_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[12].getCount());
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFSOC_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSOCFTRBUFSOC_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PSOCFTRBUFSOC_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[13].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'PSOCFTRBUFSOC_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'PSOCFTRBUFSOC_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSOCFTRBUFSOC_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[13].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_SUB_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_SUB_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_SUB_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[14].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'FTR_SUB_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_SUB_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_SUB_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[14].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_ADD_PARAM' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_ADD_PARAM' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_ADD_PARAM(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[15].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'FTR_ADD_PARAM' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_ADD_PARAM' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_ADD_PARAM_size() throws FMLManipulationException {
        return (this.fmlBuffer[15].getCount());
    }

    /**
     * Retrieves the value of the 'FEATURE_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FEATURE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FEATURE_TYPE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[16].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'FEATURE_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'FEATURE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FEATURE_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[16].getCount());
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFPRODUCT_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSOCFTRBUFPRODUCT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PSOCFTRBUFPRODUCT_TYPE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[17].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'PSOCFTRBUFPRODUCT_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'PSOCFTRBUFPRODUCT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSOCFTRBUFPRODUCT_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[17].getCount());
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFCAMPAIGN_SEQ' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSOCFTRBUFCAMPAIGN_SEQ' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PSOCFTRBUFCAMPAIGN_SEQ(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[18].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'PSOCFTRBUFCAMPAIGN_SEQ' field in the FML buffer.
     *
     * @return Number of values defined for 'PSOCFTRBUFCAMPAIGN_SEQ' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSOCFTRBUFCAMPAIGN_SEQ_size() throws FMLManipulationException {
        return (this.fmlBuffer[18].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_SPECIAL_TELNO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_SPECIAL_TELNO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_SPECIAL_TELNO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[19].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'FTR_SPECIAL_TELNO' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_SPECIAL_TELNO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_SPECIAL_TELNO_size() throws FMLManipulationException {
        return (this.fmlBuffer[19].getCount());
    }

    /**
     * Retrieves the value of the 'SWITCH_ACT_NEEDED' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'SWITCH_ACT_NEEDED' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SWITCH_ACT_NEEDED(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[20].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'SWITCH_ACT_NEEDED' field in the FML buffer.
     *
     * @return Number of values defined for 'SWITCH_ACT_NEEDED' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SWITCH_ACT_NEEDED_size() throws FMLManipulationException {
        return (this.fmlBuffer[20].getCount());
    }

    /**
     * Retrieves the value of the 'SWITCH_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'SWITCH_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SWITCH_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[21].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'SWITCH_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'SWITCH_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SWITCH_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[21].getCount());
    }

    /**
     * Retrieves the value of the 'MSISDN_CRITERIA' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'MSISDN_CRITERIA' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MSISDN_CRITERIA(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[22].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'MSISDN_CRITERIA' field in the FML buffer.
     *
     * @return Number of values defined for 'MSISDN_CRITERIA' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MSISDN_CRITERIA_size() throws FMLManipulationException {
        return (this.fmlBuffer[22].getCount());
    }

    /**
     * Retrieves the value of the 'TN_CLASS_CD' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'TN_CLASS_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_TN_CLASS_CD(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[23].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'TN_CLASS_CD' field in the FML buffer.
     *
     * @return Number of values defined for 'TN_CLASS_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_TN_CLASS_CD_size() throws FMLManipulationException {
        return (this.fmlBuffer[23].getCount());
    }

    /**
     * Retrieves the value of the 'ACTION_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'ACTION_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACTION_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[24].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'ACTION_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'ACTION_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACTION_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[24].getCount());
    }

    /**
     * Retrieves the value of the 'MANUAL_RC_RATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'MANUAL_RC_RATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_MANUAL_RC_RATE(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[25].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'MANUAL_RC_RATE' field in the FML buffer.
     *
     * @return Number of values defined for 'MANUAL_RC_RATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MANUAL_RC_RATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[25].getCount());
    }

    /**
     * Retrieves the value of the 'MANUAL_RC_EXP_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'MANUAL_RC_EXP_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MANUAL_RC_EXP_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[26].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'MANUAL_RC_EXP_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'MANUAL_RC_EXP_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MANUAL_RC_EXP_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[26].getCount());
    }

    /**
     * Retrieves the value of the 'ROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'ROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[27].getValue(0));
    }

    /**
     * Retrieves the value of the 'MSISDN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'MSISDN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MSISDN(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[28].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'MSISDN' field in the FML buffer.
     *
     * @return Number of values defined for 'MSISDN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MSISDN_size() throws FMLManipulationException {
        return (this.fmlBuffer[28].getCount());
    }

    /**
     * Retrieves the value of the 'NL' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'NL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NL(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[29].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NL' field in the FML buffer.
     *
     * @return Number of values defined for 'NL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NL_size() throws FMLManipulationException {
        return (this.fmlBuffer[29].getCount());
    }

    /**
     * Retrieves the value of the 'CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CODE(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[30].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[30].getCount());
    }

    /**
     * Retrieves the value of the 'SUBSCRIBER_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'SUBSCRIBER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUBSCRIBER_NO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[31].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'SUBSCRIBER_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'SUBSCRIBER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SUBSCRIBER_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[31].getCount());
    }

    /**
     * Retrieves the value of the 'GSMBUFFEATURE_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'GSMBUFFEATURE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_GSMBUFFEATURE_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[32].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'GSMBUFFEATURE_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'GSMBUFFEATURE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_GSMBUFFEATURE_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[32].getCount());
    }

    /**
     * Retrieves the value of the 'PNPINFOBUFFROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'PNPINFOBUFFROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PNPINFOBUFFROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[33].getValue(0));
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPNUMINFORECROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[34].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NPNUMINFORECROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[34].getCount());
    }

    /**
     * Retrieves the value of the 'PORT_NUMBER' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'PORT_NUMBER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PORT_NUMBER(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[35].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'PORT_NUMBER' field in the FML buffer.
     *
     * @return Number of values defined for 'PORT_NUMBER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PORT_NUMBER_size() throws FMLManipulationException {
        return (this.fmlBuffer[35].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPNUMINFORECEFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[36].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NPNUMINFORECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECEFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[36].getCount());
    }

    /**
     * Retrieves the value of the 'SYS_CREATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'SYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SYS_CREATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[37].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'SYS_CREATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'SYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SYS_CREATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[37].getCount());
    }

    /**
     * Retrieves the value of the 'SYS_UPDATE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'SYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SYS_UPDATE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[38].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'SYS_UPDATE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'SYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SYS_UPDATE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[38].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECOPERATOR_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NPNUMINFORECOPERATOR_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[39].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NPNUMINFORECOPERATOR_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECOPERATOR_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[39].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECAPPLICATION_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPNUMINFORECAPPLICATION_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[40].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NPNUMINFORECAPPLICATION_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECAPPLICATION_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[40].getCount());
    }

    /**
     * Retrieves the value of the 'DL_SERVICE_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'DL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DL_SERVICE_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[41].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'DL_SERVICE_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'DL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DL_SERVICE_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[41].getCount());
    }

    /**
     * Retrieves the value of the 'DL_UPDATE_STAMP' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'DL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_DL_UPDATE_STAMP(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[42].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'DL_UPDATE_STAMP' field in the FML buffer.
     *
     * @return Number of values defined for 'DL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DL_UPDATE_STAMP_size() throws FMLManipulationException {
        return (this.fmlBuffer[42].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECEXPIRATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECEXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPNUMINFORECEXPIRATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[43].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NPNUMINFORECEXPIRATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECEXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECEXPIRATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[43].getCount());
    }

    /**
     * Retrieves the value of the 'INT_ORDER_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'INT_ORDER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_INT_ORDER_ID(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[44].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'INT_ORDER_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'INT_ORDER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_INT_ORDER_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[44].getCount());
    }

    /**
     * Retrieves the value of the 'ORG_CUSTOMER_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'ORG_CUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ORG_CUSTOMER_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[45].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ORG_CUSTOMER_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'ORG_CUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ORG_CUSTOMER_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[45].getCount());
    }

    /**
     * Retrieves the value of the 'PORT_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'PORT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PORT_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[46].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'PORT_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'PORT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PORT_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[46].getCount());
    }

    /**
     * Retrieves the value of the 'NUMBER_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NUMBER_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NUMBER_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[47].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'NUMBER_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'NUMBER_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NUMBER_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[47].getCount());
    }

    /**
     * Retrieves the value of the 'PORT_REQUEST_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'PORT_REQUEST_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PORT_REQUEST_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[48].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'PORT_REQUEST_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'PORT_REQUEST_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PORT_REQUEST_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[48].getCount());
    }

    /**
     * Retrieves the value of the 'ORG_OPERATOR' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'ORG_OPERATOR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ORG_OPERATOR(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[49].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ORG_OPERATOR' field in the FML buffer.
     *
     * @return Number of values defined for 'ORG_OPERATOR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ORG_OPERATOR_size() throws FMLManipulationException {
        return (this.fmlBuffer[49].getCount());
    }

    /**
     * Retrieves the value of the 'SUBSCRIBER_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'SUBSCRIBER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_SUBSCRIBER_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[50].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'SUBSCRIBER_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'SUBSCRIBER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SUBSCRIBER_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[50].getCount());
    }

    /**
     * Retrieves the value of the 'LAST_INT_ORD_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'LAST_INT_ORD_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_LAST_INT_ORD_ID(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[51].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'LAST_INT_ORD_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'LAST_INT_ORD_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LAST_INT_ORD_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[51].getCount());
    }

    /**
     * Retrieves the value of the 'FUNCTION_PORT_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'FUNCTION_PORT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FUNCTION_PORT_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[52].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'FUNCTION_PORT_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'FUNCTION_PORT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FUNCTION_PORT_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[52].getCount());
    }

    /**
     * Retrieves the value of the 'PASSIVE_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'PASSIVE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PASSIVE_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[53].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'PASSIVE_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'PASSIVE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PASSIVE_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[53].getCount());
    }

    /**
     * Retrieves the value of the 'AUTO_CONFIRM' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'AUTO_CONFIRM' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_AUTO_CONFIRM(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[54].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'AUTO_CONFIRM' field in the FML buffer.
     *
     * @return Number of values defined for 'AUTO_CONFIRM' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_AUTO_CONFIRM_size() throws FMLManipulationException {
        return (this.fmlBuffer[54].getCount());
    }

    /**
     * Retrieves the value of the 'TEMPORARY_MSISDN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'TEMPORARY_MSISDN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_TEMPORARY_MSISDN(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[55].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'TEMPORARY_MSISDN' field in the FML buffer.
     *
     * @return Number of values defined for 'TEMPORARY_MSISDN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_TEMPORARY_MSISDN_size() throws FMLManipulationException {
        return (this.fmlBuffer[55].getCount());
    }

    /**
     * Retrieves the value of the 'HANDLE_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'HANDLE_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_HANDLE_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[56].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'HANDLE_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'HANDLE_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_HANDLE_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[56].getCount());
    }

    /**
     * Retrieves the value of the 'SEND_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'SEND_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SEND_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[57].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'SEND_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'SEND_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SEND_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[57].getCount());
    }

    /**
     * Retrieves the value of the 'ORDID_STR' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'ORDID_STR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ORDID_STR(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[58].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ORDID_STR' field in the FML buffer.
     *
     * @return Number of values defined for 'ORDID_STR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ORDID_STR_size() throws FMLManipulationException {
        return (this.fmlBuffer[58].getCount());
    }

    /**
     * Retrieves the value of the 'LAST_ORDID_STR' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'LAST_ORDID_STR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LAST_ORDID_STR(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[59].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'LAST_ORDID_STR' field in the FML buffer.
     *
     * @return Number of values defined for 'LAST_ORDID_STR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LAST_ORDID_STR_size() throws FMLManipulationException {
        return (this.fmlBuffer[59].getCount());
    }

    /**
     * Retrieves the value of the 'ICC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'ICC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ICC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[60].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ICC' field in the FML buffer.
     *
     * @return Number of values defined for 'ICC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ICC_size() throws FMLManipulationException {
        return (this.fmlBuffer[60].getCount());
    }

    /**
     * Retrieves the value of the 'CUSTOMER_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'CUSTOMER_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CUSTOMER_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[61].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'CUSTOMER_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'CUSTOMER_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CUSTOMER_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[61].getCount());
    }

    /**
     * Retrieves the value of the 'NPINFOBUFFCUSTOMER_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPINFOBUFFCUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPINFOBUFFCUSTOMER_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[62].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NPINFOBUFFCUSTOMER_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'NPINFOBUFFCUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPINFOBUFFCUSTOMER_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[62].getCount());
    }

    /**
     * Retrieves the value of the 'SERVICE_PROVIDER' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'SERVICE_PROVIDER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SERVICE_PROVIDER(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[63].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'SERVICE_PROVIDER' field in the FML buffer.
     *
     * @return Number of values defined for 'SERVICE_PROVIDER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SERVICE_PROVIDER_size() throws FMLManipulationException {
        return (this.fmlBuffer[63].getCount());
    }

    public void populateCvFolder(CsApiBanOutput csApiBanOutput) throws FMLManipulationException {
        super.populateCvFolder(csApiBanOutput);

        for (int i = 0; i < csApiBanOutput.get_NPNUMINFORECSYS_CREATION_DATE_size(); i++) {
            set_SYS_CREATION_DATE(i, csApiBanOutput.get_NPNUMINFORECSYS_CREATION_DATE(i));
        }
        for (int i = 0; i < csApiBanOutput.get_NPNUMINFORECSYS_UPDATE_DATE_size(); i++) {
            set_SYS_UPDATE_DATE(i, csApiBanOutput.get_NPNUMINFORECSYS_UPDATE_DATE(i));
        }
        for (int i = 0; i < csApiBanOutput.get_NPNUMINFORECDL_SERVICE_CODE_size(); i++) {
            set_DL_SERVICE_CODE(i, csApiBanOutput.get_NPNUMINFORECDL_SERVICE_CODE(i));
        }
        for (int i = 0; i < csApiBanOutput.get_NPNUMINFORECDL_UPDATE_STAMP_size(); i++) {
            set_DL_UPDATE_STAMP(i, csApiBanOutput.get_NPNUMINFORECDL_UPDATE_STAMP(i));
        }
        for (int i = 0; i < csApiBanOutput.get_NPNUMINFORECSUBSCRIBER_ID_size(); i++) {
            set_SUBSCRIBER_ID(i, csApiBanOutput.get_NPNUMINFORECSUBSCRIBER_ID(i));
        }

        ServiceParameter.copyFmlBuffer(csApiBanOutput, this);

    }

}