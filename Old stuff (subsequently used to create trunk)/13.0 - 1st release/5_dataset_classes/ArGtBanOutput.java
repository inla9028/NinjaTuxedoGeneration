/*
 * ArGtBanOutput.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service.parameters;

import bea.jolt.pool.Result;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;

/**
 * @author  Ninja
 *
 * ArGtBanOutput class.
 */
public class ArGtBanOutput extends ServiceOutput {

    /**
     * Creates a new instance of ArGtBanOutput.
     *
     * @throws FMLManipulationException
     */
    public ArGtBanOutput(int nApplicationStatus) throws FMLManipulationException {
        createFmlBuffer();
        setApplicationCode(nApplicationStatus);
    }

    public ArGtBanOutput() {
    }

    /**
     * Creates a new instance of ArGtBanOutput.
     *
     * @param ds Output dataset from ArGtBan service.
     * @throws FMLManipulationException
     */
    public ArGtBanOutput(Result ds) throws FMLManipulationException {
        createFmlBuffer();
        populateFmlBuffer(ds);
    }

    /**
     * Populates the FML buffer.
     *
     * @throws FMLManipulationException
     */
    private void createFmlBuffer() throws FMLManipulationException {
        this.fmlBuffer = new FmlField[161];
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
        this.fmlBuffer[18] = new FmlField("SYS_CREATION_DATE", FmlField.TYPE_STRING, 15, null, 18, 1);
        this.fmlBuffer[19] = new FmlField("SYS_UPDATE_DATE", FmlField.TYPE_STRING, 15, null, 19, 1);
        this.fmlBuffer[20] = new FmlField("PBANRECOPERATOR_ID", FmlField.TYPE_INTEGER, -1, null, 20, 1);
        this.fmlBuffer[21] = new FmlField("PBANRECAPPLICATION_ID", FmlField.TYPE_STRING, 7, null, 21, 1);
        this.fmlBuffer[22] = new FmlField("DL_SERVICE_CODE", FmlField.TYPE_STRING, 6, null, 22, 1);
        this.fmlBuffer[23] = new FmlField("DL_UPDATE_STAMP", FmlField.TYPE_SHORT, -1, null, 23, 1);
        this.fmlBuffer[24] = new FmlField("CURR_ROOT_BAN", FmlField.TYPE_INTEGER, -1, null, 24, 1);
        this.fmlBuffer[25] = new FmlField("NEXT_ROOT_BAN", FmlField.TYPE_INTEGER, -1, null, 25, 1);
        this.fmlBuffer[26] = new FmlField("PARTITION_ROOT_BAN", FmlField.TYPE_INTEGER, -1, null, 26, 1);
        this.fmlBuffer[27] = new FmlField("AR_EXCPT_ACCT_IND", FmlField.TYPE_BYTE, -1, null, 27, 1);
        this.fmlBuffer[28] = new FmlField("ACCOUNT_TYPE", FmlField.TYPE_BYTE, -1, null, 28, 1);
        this.fmlBuffer[29] = new FmlField("ACCOUNT_SUB_TYPE", FmlField.TYPE_STRING, 3, null, 29, 1);
        this.fmlBuffer[30] = new FmlField("AR_BALANCE", FmlField.TYPE_DOUBLE, -1, null, 30, 1);
        this.fmlBuffer[31] = new FmlField("BAN_STATUS", FmlField.TYPE_BYTE, -1, null, 31, 1);
        this.fmlBuffer[32] = new FmlField("HIST_LAST_DATE", FmlField.TYPE_STRING, 9, null, 32, 1);
        this.fmlBuffer[33] = new FmlField("STATUS_LAST_DATE", FmlField.TYPE_STRING, 9, null, 33, 1);
        this.fmlBuffer[34] = new FmlField("STATUS_ACTV_CODE", FmlField.TYPE_STRING, 4, null, 34, 1);
        this.fmlBuffer[35] = new FmlField("STATUS_ACTV_RSN_CODE", FmlField.TYPE_STRING, 5, null, 35, 1);
        this.fmlBuffer[36] = new FmlField("AR_WO_IND", FmlField.TYPE_BYTE, -1, null, 36, 1);
        this.fmlBuffer[37] = new FmlField("CUSTOMER_ID", FmlField.TYPE_INTEGER, -1, null, 37, 1);
        this.fmlBuffer[38] = new FmlField("START_SERVICE_DATE", FmlField.TYPE_STRING, 9, null, 38, 1);
        this.fmlBuffer[39] = new FmlField("DEFAULT_SUB_MARKET", FmlField.TYPE_STRING, 4, null, 39, 1);
        this.fmlBuffer[40] = new FmlField("DEFAULT_DEPARTMENT", FmlField.TYPE_STRING, 5, null, 40, 1);
        this.fmlBuffer[41] = new FmlField("COL_DELINQ_STATUS", FmlField.TYPE_BYTE, -1, null, 41, 1);
        this.fmlBuffer[42] = new FmlField("COL_DELINQ_STS_DATE", FmlField.TYPE_STRING, 9, null, 42, 1);
        this.fmlBuffer[43] = new FmlField("COL_WAIVER_IND", FmlField.TYPE_BYTE, -1, null, 43, 1);
        this.fmlBuffer[44] = new FmlField("COL_WAIVER_DATE", FmlField.TYPE_STRING, 9, null, 44, 1);
        this.fmlBuffer[45] = new FmlField("COL_WAIVER_UID", FmlField.TYPE_STRING, 9, null, 45, 1);
        this.fmlBuffer[46] = new FmlField("COL_CATEGORY_NO", FmlField.TYPE_SHORT, -1, null, 46, 1);
        this.fmlBuffer[47] = new FmlField("COL_PATH_CODE", FmlField.TYPE_STRING, 4, null, 47, 1);
        this.fmlBuffer[48] = new FmlField("COL_NEXT_STEP_NO", FmlField.TYPE_SHORT, -1, null, 48, 1);
        this.fmlBuffer[49] = new FmlField("COL_NEXT_STEP_DATE", FmlField.TYPE_STRING, 9, null, 49, 1);
        this.fmlBuffer[50] = new FmlField("COL_NEXT_STP_APR_COD", FmlField.TYPE_BYTE, -1, null, 50, 1);
        this.fmlBuffer[51] = new FmlField("COL_NEXT_STP_APR_COL", FmlField.TYPE_STRING, 9, null, 51, 1);
        this.fmlBuffer[52] = new FmlField("COL_ASSIGNED_COLL", FmlField.TYPE_STRING, 9, null, 52, 1);
        this.fmlBuffer[53] = new FmlField("COL_COLCT_ASD_DATE", FmlField.TYPE_STRING, 9, null, 53, 1);
        this.fmlBuffer[54] = new FmlField("COL_AGNCY_CODE", FmlField.TYPE_STRING, 9, null, 54, 1);
        this.fmlBuffer[55] = new FmlField("COL_AGNCY_ASD_DATE", FmlField.TYPE_STRING, 9, null, 55, 1);
        this.fmlBuffer[56] = new FmlField("COL_AGNCY_ASD_AMT", FmlField.TYPE_DOUBLE, -1, null, 56, 1);
        this.fmlBuffer[57] = new FmlField("COL_FIRST_CNTCT_DATE", FmlField.TYPE_STRING, 9, null, 57, 1);
        this.fmlBuffer[58] = new FmlField("COL_CODE", FmlField.TYPE_BYTE, -1, null, 58, 1);
        this.fmlBuffer[59] = new FmlField("COMP_CRD_LMT", FmlField.TYPE_DOUBLE, -1, null, 59, 1);
        this.fmlBuffer[60] = new FmlField("EQU_CRD_LMT", FmlField.TYPE_DOUBLE, -1, null, 60, 1);
        this.fmlBuffer[61] = new FmlField("COL_FIXED_PATH", FmlField.TYPE_STRING, 4, null, 61, 1);
        this.fmlBuffer[62] = new FmlField("CREDIT_DATE", FmlField.TYPE_STRING, 15, null, 62, 1);
        this.fmlBuffer[63] = new FmlField("CREDIT_SOURCE", FmlField.TYPE_BYTE, -1, null, 63, 1);
        this.fmlBuffer[64] = new FmlField("CREDIT_STATUS", FmlField.TYPE_STRING, 3, null, 64, 1);
        this.fmlBuffer[65] = new FmlField("CREDIT_CLASS", FmlField.TYPE_BYTE, -1, null, 65, 1);
        this.fmlBuffer[66] = new FmlField("BILL_CYCLE", FmlField.TYPE_SHORT, -1, null, 66, 1);
        this.fmlBuffer[67] = new FmlField("BL_CUR_BILL_SEQ_NO", FmlField.TYPE_SHORT, -1, null, 67, 1);
        this.fmlBuffer[68] = new FmlField("BL_LAST_PROD_DATE", FmlField.TYPE_STRING, 9, null, 68, 1);
        this.fmlBuffer[69] = new FmlField("BL_VAT_EXEMPT_IND", FmlField.TYPE_BYTE, -1, null, 69, 1);
        this.fmlBuffer[70] = new FmlField("BL_VAT_EXEMPT_DATE", FmlField.TYPE_STRING, 9, null, 70, 1);
        this.fmlBuffer[71] = new FmlField("BL_VAT_EXEMPT_REF_NO", FmlField.TYPE_STRING, 17, null, 71, 1);
        this.fmlBuffer[72] = new FmlField("BL_VAT_EXEMPT_RSN_CD", FmlField.TYPE_STRING, 4, null, 72, 1);
        this.fmlBuffer[73] = new FmlField("BL_LAST_CYC_RUN_YEAR", FmlField.TYPE_SHORT, -1, null, 73, 1);
        this.fmlBuffer[74] = new FmlField("BL_LAST_CYC_RUN_MNTH", FmlField.TYPE_SHORT, -1, null, 74, 1);
        this.fmlBuffer[75] = new FmlField("BL_LAST_CYC_CODE", FmlField.TYPE_SHORT, -1, null, 75, 1);
        this.fmlBuffer[76] = new FmlField("BL_LAST_RG_BL_SEQ_NO", FmlField.TYPE_SHORT, -1, null, 76, 1);
        this.fmlBuffer[77] = new FmlField("BL_LAST_RG_CYC_DATE", FmlField.TYPE_STRING, 9, null, 77, 1);
        this.fmlBuffer[78] = new FmlField("BL_COMPLT_STATUS", FmlField.TYPE_BYTE, -1, null, 78, 1);
        this.fmlBuffer[79] = new FmlField("BL_COMPLT_DATE", FmlField.TYPE_STRING, 9, null, 79, 1);
        this.fmlBuffer[80] = new FmlField("BL_SPECIAL_CYCLE", FmlField.TYPE_SHORT, -1, null, 80, 1);
        this.fmlBuffer[81] = new FmlField("BL_SPECL_CYCL_TYPE", FmlField.TYPE_BYTE, -1, null, 81, 1);
        this.fmlBuffer[82] = new FmlField("BL_PRT_CATEGORY", FmlField.TYPE_STRING, 3, null, 82, 1);
        this.fmlBuffer[83] = new FmlField("BL_ZERO_BALANC_IND", FmlField.TYPE_BYTE, -1, null, 83, 1);
        this.fmlBuffer[84] = new FmlField("BL_MAN_HNDL_RSN", FmlField.TYPE_STRING, 3, null, 84, 1);
        this.fmlBuffer[85] = new FmlField("BL_MAN_HNDL_EFF_DATE", FmlField.TYPE_STRING, 9, null, 85, 1);
        this.fmlBuffer[86] = new FmlField("BL_MAN_HNDL_EXP_DATE", FmlField.TYPE_STRING, 9, null, 86, 1);
        this.fmlBuffer[87] = new FmlField("BL_MAN_HNDL_REQ_OPID", FmlField.TYPE_INTEGER, -1, null, 87, 1);
        this.fmlBuffer[88] = new FmlField("BL_MAN_HNDL_BY_OPID", FmlField.TYPE_INTEGER, -1, null, 88, 1);
        this.fmlBuffer[89] = new FmlField("BL_REQ_ST_GRACE_PRD", FmlField.TYPE_STRING, 9, null, 89, 1);
        this.fmlBuffer[90] = new FmlField("BL_REQ_END_GRACE_PRD", FmlField.TYPE_STRING, 9, null, 90, 1);
        this.fmlBuffer[91] = new FmlField("BL_NEXT_CYCLE", FmlField.TYPE_SHORT, -1, null, 91, 1);
        this.fmlBuffer[92] = new FmlField("BL_NEXT_CYC_EFF_DATE", FmlField.TYPE_STRING, 9, null, 92, 1);
        this.fmlBuffer[93] = new FmlField("BL_SUSP_RC_RATE_TYPE", FmlField.TYPE_BYTE, -1, null, 93, 1);
        this.fmlBuffer[94] = new FmlField("BL_DEF_MAILING_IND", FmlField.TYPE_BYTE, -1, null, 94, 1);
        this.fmlBuffer[95] = new FmlField("BL_BILL_PROD_IND", FmlField.TYPE_BYTE, -1, null, 95, 1);
        this.fmlBuffer[96] = new FmlField("BL_BAL_HANDLE_IND", FmlField.TYPE_BYTE, -1, null, 96, 1);
        this.fmlBuffer[97] = new FmlField("BL_UD_LST_PROD_DATE", FmlField.TYPE_STRING, 9, null, 97, 1);
        this.fmlBuffer[98] = new FmlField("BL_UD_LST_CYC_RUN_YR", FmlField.TYPE_SHORT, -1, null, 98, 1);
        this.fmlBuffer[99] = new FmlField("BL_UD_LST_CYC_RUN_MN", FmlField.TYPE_SHORT, -1, null, 99, 1);
        this.fmlBuffer[100] = new FmlField("BL_UD_LST_RG_BL_SEQNO", FmlField.TYPE_SHORT, -1, null, 100, 1);
        this.fmlBuffer[101] = new FmlField("BL_UD_LST_RG_CYC_DATE", FmlField.TYPE_STRING, 9, null, 101, 1);
        this.fmlBuffer[102] = new FmlField("BL_UD_LST_CYC_CD", FmlField.TYPE_SHORT, -1, null, 102, 1);
        this.fmlBuffer[103] = new FmlField("BL_UD_SPCL_CYC", FmlField.TYPE_SHORT, -1, null, 103, 1);
        this.fmlBuffer[104] = new FmlField("BL_UD_SPCL_CYC_TYPE", FmlField.TYPE_BYTE, -1, null, 104, 1);
        this.fmlBuffer[105] = new FmlField("BL_NO_MNSP_IND", FmlField.TYPE_BYTE, -1, null, 105, 1);
        this.fmlBuffer[106] = new FmlField("BL_LST_BAN_DIS_DT", FmlField.TYPE_STRING, 9, null, 106, 1);
        this.fmlBuffer[107] = new FmlField("BL_LST_HIER_DIS_DT", FmlField.TYPE_STRING, 9, null, 107, 1);
        this.fmlBuffer[108] = new FmlField("BL_LST_TREE_DIS_DT", FmlField.TYPE_STRING, 9, null, 108, 1);
        this.fmlBuffer[109] = new FmlField("BL_LST_BAN_DIS_DT_U", FmlField.TYPE_STRING, 9, null, 109, 1);
        this.fmlBuffer[110] = new FmlField("BL_LST_HIER_DIS_DT_U", FmlField.TYPE_STRING, 9, null, 110, 1);
        this.fmlBuffer[111] = new FmlField("BL_LST_TREE_DIS_DT_U", FmlField.TYPE_STRING, 9, null, 111, 1);
        this.fmlBuffer[112] = new FmlField("BL_LST_BAN_DIS_SN", FmlField.TYPE_SHORT, -1, null, 112, 1);
        this.fmlBuffer[113] = new FmlField("BL_LST_HIER_DIS_SN", FmlField.TYPE_SHORT, -1, null, 113, 1);
        this.fmlBuffer[114] = new FmlField("BL_LST_TREE_DIS_SN", FmlField.TYPE_SHORT, -1, null, 114, 1);
        this.fmlBuffer[115] = new FmlField("BL_LST_BAN_DIS_SN_U", FmlField.TYPE_SHORT, -1, null, 115, 1);
        this.fmlBuffer[116] = new FmlField("BL_LST_HIER_DIS_SN_U", FmlField.TYPE_SHORT, -1, null, 116, 1);
        this.fmlBuffer[117] = new FmlField("BL_LST_TREE_DIS_SN_U", FmlField.TYPE_SHORT, -1, null, 117, 1);
        this.fmlBuffer[118] = new FmlField("BL_HIER_BAN_IND", FmlField.TYPE_BYTE, -1, null, 118, 1);
        this.fmlBuffer[119] = new FmlField("BL_DUE_DAY", FmlField.TYPE_SHORT, -1, null, 119, 1);
        this.fmlBuffer[120] = new FmlField("BL_PREPAYMENT_IND", FmlField.TYPE_BYTE, -1, null, 120, 1);
        this.fmlBuffer[121] = new FmlField("BLACK_LISTED_IND", FmlField.TYPE_BYTE, -1, null, 121, 1);
        this.fmlBuffer[122] = new FmlField("VIP_IND", FmlField.TYPE_BYTE, -1, null, 122, 1);
        this.fmlBuffer[123] = new FmlField("ORG_CODE", FmlField.TYPE_STRING, 6, null, 123, 1);
        this.fmlBuffer[124] = new FmlField("CYCLE_FREQUENCY", FmlField.TYPE_SHORT, -1, null, 124, 1);
        this.fmlBuffer[125] = new FmlField("CYCLE_FIRST_BILL_MONTH", FmlField.TYPE_SHORT, -1, null, 125, 1);
        this.fmlBuffer[126] = new FmlField("EDI_LOCATION_NUMBER", FmlField.TYPE_DOUBLE, -1, null, 126, 1);
        this.fmlBuffer[127] = new FmlField("CS_MIN_REQ_CTNS", FmlField.TYPE_INTEGER, -1, null, 127, 1);
        this.fmlBuffer[128] = new FmlField("CS_PEN_PER_MISS_CTN", FmlField.TYPE_DOUBLE, -1, null, 128, 1);
        this.fmlBuffer[129] = new FmlField("CS_COM_START_DATE", FmlField.TYPE_STRING, 9, null, 129, 1);
        this.fmlBuffer[130] = new FmlField("CS_COM_END_DATE", FmlField.TYPE_STRING, 9, null, 130, 1);
        this.fmlBuffer[131] = new FmlField("CS_COM_REASON_CODE", FmlField.TYPE_STRING, 4, null, 131, 1);
        this.fmlBuffer[132] = new FmlField("CS_COM_ORIG_NO_MONTH", FmlField.TYPE_SHORT, -1, null, 132, 1);
        this.fmlBuffer[133] = new FmlField("CS_FOLLOW_UPS_STATE", FmlField.TYPE_STRING, 4, null, 133, 1);
        this.fmlBuffer[134] = new FmlField("CS_SPEC_MEMO_IND", FmlField.TYPE_BYTE, -1, null, 134, 1);
        this.fmlBuffer[135] = new FmlField("STATUS_ISSUE_DATE", FmlField.TYPE_STRING, 9, null, 135, 1);
        this.fmlBuffer[136] = new FmlField("CS_BAN_TRX_OFF_IND", FmlField.TYPE_BYTE, -1, null, 136, 1);
        this.fmlBuffer[137] = new FmlField("CS_HANDLE_BY_CTN_IND", FmlField.TYPE_BYTE, -1, null, 137, 1);
        this.fmlBuffer[138] = new FmlField("CS_LOCK_MECHANISM", FmlField.TYPE_BYTE, -1, null, 138, 1);
        this.fmlBuffer[139] = new FmlField("CS_DEF_PRODUCT_TYPE", FmlField.TYPE_STRING, 4, null, 139, 1);
        this.fmlBuffer[140] = new FmlField("CAS_DEP_AMT_PER_CTN", FmlField.TYPE_DOUBLE, -1, null, 140, 1);
        this.fmlBuffer[141] = new FmlField("CONV_RUN_NO", FmlField.TYPE_SHORT, -1, null, 141, 1);
        this.fmlBuffer[142] = new FmlField("CARRY_OVER_BILL", FmlField.TYPE_BYTE, -1, null, 142, 1);
        this.fmlBuffer[143] = new FmlField("OLD_ACCOUNT_ID", FmlField.TYPE_STRING, 21, null, 143, 1);
        this.fmlBuffer[144] = new FmlField("HIDE_PHONE_DIGITS_IND", FmlField.TYPE_BYTE, -1, null, 144, 1);
        this.fmlBuffer[145] = new FmlField("SEC_DEPARTMENT", FmlField.TYPE_STRING, 5, null, 145, 1);
        this.fmlBuffer[146] = new FmlField("PAYABLE_LTR_SEND_DATE", FmlField.TYPE_STRING, 9, null, 146, 1);
        this.fmlBuffer[147] = new FmlField("NEXT_CONF_ROOT_BAN", FmlField.TYPE_INTEGER, -1, null, 147, 1);
        this.fmlBuffer[148] = new FmlField("LAST_CONF_DATE", FmlField.TYPE_STRING, 9, null, 148, 1);
        this.fmlBuffer[149] = new FmlField("ALLOW_ADVERTISING_IND", FmlField.TYPE_BYTE, -1, null, 149, 1);
        this.fmlBuffer[150] = new FmlField("AGENCY_REF_NO", FmlField.TYPE_STRING, 9, null, 150, 1);
        this.fmlBuffer[151] = new FmlField("COL_AGENCY_CONF_DT", FmlField.TYPE_STRING, 9, null, 151, 1);
        this.fmlBuffer[152] = new FmlField("BAN_GROUP_NO", FmlField.TYPE_STRING, 11, null, 152, 1);
        this.fmlBuffer[153] = new FmlField("CAAP_TYPE", FmlField.TYPE_BYTE, -1, null, 153, 1);
        this.fmlBuffer[154] = new FmlField("BAN_FF_EXP_DATE", FmlField.TYPE_STRING, 15, null, 154, 1);
        this.fmlBuffer[155] = new FmlField("UNBILLED_REVENUE", FmlField.TYPE_DOUBLE, -1, null, 155, 1);
        this.fmlBuffer[156] = new FmlField("LAST_AGNCY_UPDATE", FmlField.TYPE_STRING, 9, null, 156, 1);
        this.fmlBuffer[157] = new FmlField("WAIVER_RSN_CODE", FmlField.TYPE_STRING, 7, null, 157, 1);
        this.fmlBuffer[158] = new FmlField("COL_WAIVER_EXP_DATE", FmlField.TYPE_STRING, 9, null, 158, 1);
        this.fmlBuffer[159] = new FmlField("INVOICE_FEE_WAIVE_IND", FmlField.TYPE_BYTE, -1, null, 159, 1);
        this.fmlBuffer[160] = new FmlField("PRD_ZERO_RATE_BILL", FmlField.TYPE_BYTE, -1, null, 160, 1);
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
     * Retrieves the value of the 'SYS_CREATION_DATE' field in the FML buffer.
     *
     * @return Value of 'SYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SYS_CREATION_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[18].getValue(0));
    }

    /**
     * Retrieves the value of the 'SYS_UPDATE_DATE' field in the FML buffer.
     *
     * @return Value of 'SYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SYS_UPDATE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[19].getValue(0));
    }

    /**
     * Retrieves the value of the 'PBANRECOPERATOR_ID' field in the FML buffer.
     *
     * @return Value of 'PBANRECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PBANRECOPERATOR_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[20].getValue(0));
    }

    /**
     * Retrieves the value of the 'PBANRECAPPLICATION_ID' field in the FML buffer.
     *
     * @return Value of 'PBANRECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PBANRECAPPLICATION_ID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[21].getValue(0));
    }

    /**
     * Retrieves the value of the 'DL_SERVICE_CODE' field in the FML buffer.
     *
     * @return Value of 'DL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DL_SERVICE_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[22].getValue(0));
    }

    /**
     * Retrieves the value of the 'DL_UPDATE_STAMP' field in the FML buffer.
     *
     * @return Value of 'DL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_DL_UPDATE_STAMP() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[23].getValue(0)));
    }

    /**
     * Retrieves the value of the 'CURR_ROOT_BAN' field in the FML buffer.
     *
     * @return Value of 'CURR_ROOT_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CURR_ROOT_BAN() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[24].getValue(0));
    }

    /**
     * Retrieves the value of the 'NEXT_ROOT_BAN' field in the FML buffer.
     *
     * @return Value of 'NEXT_ROOT_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NEXT_ROOT_BAN() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[25].getValue(0));
    }

    /**
     * Retrieves the value of the 'PARTITION_ROOT_BAN' field in the FML buffer.
     *
     * @return Value of 'PARTITION_ROOT_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PARTITION_ROOT_BAN() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[26].getValue(0));
    }

    /**
     * Retrieves the value of the 'AR_EXCPT_ACCT_IND' field in the FML buffer.
     *
     * @return Value of 'AR_EXCPT_ACCT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_AR_EXCPT_ACCT_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[27].getValue(0)));
    }

    /**
     * Retrieves the value of the 'ACCOUNT_TYPE' field in the FML buffer.
     *
     * @return Value of 'ACCOUNT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACCOUNT_TYPE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[28].getValue(0)));
    }

    /**
     * Retrieves the value of the 'ACCOUNT_SUB_TYPE' field in the FML buffer.
     *
     * @return Value of 'ACCOUNT_SUB_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACCOUNT_SUB_TYPE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[29].getValue(0));
    }

    /**
     * Retrieves the value of the 'AR_BALANCE' field in the FML buffer.
     *
     * @return Value of 'AR_BALANCE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_AR_BALANCE() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[30].getValue(0));
    }

    /**
     * Retrieves the value of the 'BAN_STATUS' field in the FML buffer.
     *
     * @return Value of 'BAN_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BAN_STATUS() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[31].getValue(0)));
    }

    /**
     * Retrieves the value of the 'HIST_LAST_DATE' field in the FML buffer.
     *
     * @return Value of 'HIST_LAST_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_HIST_LAST_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[32].getValue(0));
    }

    /**
     * Retrieves the value of the 'STATUS_LAST_DATE' field in the FML buffer.
     *
     * @return Value of 'STATUS_LAST_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_STATUS_LAST_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[33].getValue(0));
    }

    /**
     * Retrieves the value of the 'STATUS_ACTV_CODE' field in the FML buffer.
     *
     * @return Value of 'STATUS_ACTV_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_STATUS_ACTV_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[34].getValue(0));
    }

    /**
     * Retrieves the value of the 'STATUS_ACTV_RSN_CODE' field in the FML buffer.
     *
     * @return Value of 'STATUS_ACTV_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_STATUS_ACTV_RSN_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[35].getValue(0));
    }

    /**
     * Retrieves the value of the 'AR_WO_IND' field in the FML buffer.
     *
     * @return Value of 'AR_WO_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_AR_WO_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[36].getValue(0)));
    }

    /**
     * Retrieves the value of the 'CUSTOMER_ID' field in the FML buffer.
     *
     * @return Value of 'CUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CUSTOMER_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[37].getValue(0));
    }

    /**
     * Retrieves the value of the 'START_SERVICE_DATE' field in the FML buffer.
     *
     * @return Value of 'START_SERVICE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_START_SERVICE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[38].getValue(0));
    }

    /**
     * Retrieves the value of the 'DEFAULT_SUB_MARKET' field in the FML buffer.
     *
     * @return Value of 'DEFAULT_SUB_MARKET' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DEFAULT_SUB_MARKET() throws FMLManipulationException {
        return ((String) this.fmlBuffer[39].getValue(0));
    }

    /**
     * Retrieves the value of the 'DEFAULT_DEPARTMENT' field in the FML buffer.
     *
     * @return Value of 'DEFAULT_DEPARTMENT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DEFAULT_DEPARTMENT() throws FMLManipulationException {
        return ((String) this.fmlBuffer[40].getValue(0));
    }

    /**
     * Retrieves the value of the 'COL_DELINQ_STATUS' field in the FML buffer.
     *
     * @return Value of 'COL_DELINQ_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_DELINQ_STATUS() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[41].getValue(0)));
    }

    /**
     * Retrieves the value of the 'COL_DELINQ_STS_DATE' field in the FML buffer.
     *
     * @return Value of 'COL_DELINQ_STS_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_DELINQ_STS_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[42].getValue(0));
    }

    /**
     * Retrieves the value of the 'COL_WAIVER_IND' field in the FML buffer.
     *
     * @return Value of 'COL_WAIVER_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_WAIVER_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[43].getValue(0)));
    }

    /**
     * Retrieves the value of the 'COL_WAIVER_DATE' field in the FML buffer.
     *
     * @return Value of 'COL_WAIVER_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_WAIVER_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[44].getValue(0));
    }

    /**
     * Retrieves the value of the 'COL_WAIVER_UID' field in the FML buffer.
     *
     * @return Value of 'COL_WAIVER_UID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_WAIVER_UID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[45].getValue(0));
    }

    /**
     * Retrieves the value of the 'COL_CATEGORY_NO' field in the FML buffer.
     *
     * @return Value of 'COL_CATEGORY_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_COL_CATEGORY_NO() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[46].getValue(0)));
    }

    /**
     * Retrieves the value of the 'COL_PATH_CODE' field in the FML buffer.
     *
     * @return Value of 'COL_PATH_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_PATH_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[47].getValue(0));
    }

    /**
     * Retrieves the value of the 'COL_NEXT_STEP_NO' field in the FML buffer.
     *
     * @return Value of 'COL_NEXT_STEP_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_COL_NEXT_STEP_NO() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[48].getValue(0)));
    }

    /**
     * Retrieves the value of the 'COL_NEXT_STEP_DATE' field in the FML buffer.
     *
     * @return Value of 'COL_NEXT_STEP_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_NEXT_STEP_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[49].getValue(0));
    }

    /**
     * Retrieves the value of the 'COL_NEXT_STP_APR_COD' field in the FML buffer.
     *
     * @return Value of 'COL_NEXT_STP_APR_COD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_NEXT_STP_APR_COD() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[50].getValue(0)));
    }

    /**
     * Retrieves the value of the 'COL_NEXT_STP_APR_COL' field in the FML buffer.
     *
     * @return Value of 'COL_NEXT_STP_APR_COL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_NEXT_STP_APR_COL() throws FMLManipulationException {
        return ((String) this.fmlBuffer[51].getValue(0));
    }

    /**
     * Retrieves the value of the 'COL_ASSIGNED_COLL' field in the FML buffer.
     *
     * @return Value of 'COL_ASSIGNED_COLL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_ASSIGNED_COLL() throws FMLManipulationException {
        return ((String) this.fmlBuffer[52].getValue(0));
    }

    /**
     * Retrieves the value of the 'COL_COLCT_ASD_DATE' field in the FML buffer.
     *
     * @return Value of 'COL_COLCT_ASD_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_COLCT_ASD_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[53].getValue(0));
    }

    /**
     * Retrieves the value of the 'COL_AGNCY_CODE' field in the FML buffer.
     *
     * @return Value of 'COL_AGNCY_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_AGNCY_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[54].getValue(0));
    }

    /**
     * Retrieves the value of the 'COL_AGNCY_ASD_DATE' field in the FML buffer.
     *
     * @return Value of 'COL_AGNCY_ASD_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_AGNCY_ASD_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[55].getValue(0));
    }

    /**
     * Retrieves the value of the 'COL_AGNCY_ASD_AMT' field in the FML buffer.
     *
     * @return Value of 'COL_AGNCY_ASD_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_COL_AGNCY_ASD_AMT() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[56].getValue(0));
    }

    /**
     * Retrieves the value of the 'COL_FIRST_CNTCT_DATE' field in the FML buffer.
     *
     * @return Value of 'COL_FIRST_CNTCT_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_FIRST_CNTCT_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[57].getValue(0));
    }

    /**
     * Retrieves the value of the 'COL_CODE' field in the FML buffer.
     *
     * @return Value of 'COL_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_CODE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[58].getValue(0)));
    }

    /**
     * Retrieves the value of the 'COMP_CRD_LMT' field in the FML buffer.
     *
     * @return Value of 'COMP_CRD_LMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_COMP_CRD_LMT() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[59].getValue(0));
    }

    /**
     * Retrieves the value of the 'EQU_CRD_LMT' field in the FML buffer.
     *
     * @return Value of 'EQU_CRD_LMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_EQU_CRD_LMT() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[60].getValue(0));
    }

    /**
     * Retrieves the value of the 'COL_FIXED_PATH' field in the FML buffer.
     *
     * @return Value of 'COL_FIXED_PATH' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_FIXED_PATH() throws FMLManipulationException {
        return ((String) this.fmlBuffer[61].getValue(0));
    }

    /**
     * Retrieves the value of the 'CREDIT_DATE' field in the FML buffer.
     *
     * @return Value of 'CREDIT_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CREDIT_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[62].getValue(0));
    }

    /**
     * Retrieves the value of the 'CREDIT_SOURCE' field in the FML buffer.
     *
     * @return Value of 'CREDIT_SOURCE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CREDIT_SOURCE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[63].getValue(0)));
    }

    /**
     * Retrieves the value of the 'CREDIT_STATUS' field in the FML buffer.
     *
     * @return Value of 'CREDIT_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CREDIT_STATUS() throws FMLManipulationException {
        return ((String) this.fmlBuffer[64].getValue(0));
    }

    /**
     * Retrieves the value of the 'CREDIT_CLASS' field in the FML buffer.
     *
     * @return Value of 'CREDIT_CLASS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CREDIT_CLASS() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[65].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BILL_CYCLE' field in the FML buffer.
     *
     * @return Value of 'BILL_CYCLE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BILL_CYCLE() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[66].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_CUR_BILL_SEQ_NO' field in the FML buffer.
     *
     * @return Value of 'BL_CUR_BILL_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BL_CUR_BILL_SEQ_NO() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[67].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_LAST_PROD_DATE' field in the FML buffer.
     *
     * @return Value of 'BL_LAST_PROD_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_LAST_PROD_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[68].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_VAT_EXEMPT_IND' field in the FML buffer.
     *
     * @return Value of 'BL_VAT_EXEMPT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_VAT_EXEMPT_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[69].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_VAT_EXEMPT_DATE' field in the FML buffer.
     *
     * @return Value of 'BL_VAT_EXEMPT_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_VAT_EXEMPT_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[70].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_VAT_EXEMPT_REF_NO' field in the FML buffer.
     *
     * @return Value of 'BL_VAT_EXEMPT_REF_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_VAT_EXEMPT_REF_NO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[71].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_VAT_EXEMPT_RSN_CD' field in the FML buffer.
     *
     * @return Value of 'BL_VAT_EXEMPT_RSN_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_VAT_EXEMPT_RSN_CD() throws FMLManipulationException {
        return ((String) this.fmlBuffer[72].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_LAST_CYC_RUN_YEAR' field in the FML buffer.
     *
     * @return Value of 'BL_LAST_CYC_RUN_YEAR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BL_LAST_CYC_RUN_YEAR() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[73].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_LAST_CYC_RUN_MNTH' field in the FML buffer.
     *
     * @return Value of 'BL_LAST_CYC_RUN_MNTH' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BL_LAST_CYC_RUN_MNTH() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[74].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_LAST_CYC_CODE' field in the FML buffer.
     *
     * @return Value of 'BL_LAST_CYC_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BL_LAST_CYC_CODE() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[75].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_LAST_RG_BL_SEQ_NO' field in the FML buffer.
     *
     * @return Value of 'BL_LAST_RG_BL_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BL_LAST_RG_BL_SEQ_NO() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[76].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_LAST_RG_CYC_DATE' field in the FML buffer.
     *
     * @return Value of 'BL_LAST_RG_CYC_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_LAST_RG_CYC_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[77].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_COMPLT_STATUS' field in the FML buffer.
     *
     * @return Value of 'BL_COMPLT_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_COMPLT_STATUS() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[78].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_COMPLT_DATE' field in the FML buffer.
     *
     * @return Value of 'BL_COMPLT_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_COMPLT_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[79].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_SPECIAL_CYCLE' field in the FML buffer.
     *
     * @return Value of 'BL_SPECIAL_CYCLE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BL_SPECIAL_CYCLE() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[80].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_SPECL_CYCL_TYPE' field in the FML buffer.
     *
     * @return Value of 'BL_SPECL_CYCL_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_SPECL_CYCL_TYPE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[81].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_PRT_CATEGORY' field in the FML buffer.
     *
     * @return Value of 'BL_PRT_CATEGORY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_PRT_CATEGORY() throws FMLManipulationException {
        return ((String) this.fmlBuffer[82].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_ZERO_BALANC_IND' field in the FML buffer.
     *
     * @return Value of 'BL_ZERO_BALANC_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_ZERO_BALANC_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[83].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_MAN_HNDL_RSN' field in the FML buffer.
     *
     * @return Value of 'BL_MAN_HNDL_RSN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_MAN_HNDL_RSN() throws FMLManipulationException {
        return ((String) this.fmlBuffer[84].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_MAN_HNDL_EFF_DATE' field in the FML buffer.
     *
     * @return Value of 'BL_MAN_HNDL_EFF_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_MAN_HNDL_EFF_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[85].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_MAN_HNDL_EXP_DATE' field in the FML buffer.
     *
     * @return Value of 'BL_MAN_HNDL_EXP_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_MAN_HNDL_EXP_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[86].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_MAN_HNDL_REQ_OPID' field in the FML buffer.
     *
     * @return Value of 'BL_MAN_HNDL_REQ_OPID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BL_MAN_HNDL_REQ_OPID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[87].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_MAN_HNDL_BY_OPID' field in the FML buffer.
     *
     * @return Value of 'BL_MAN_HNDL_BY_OPID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BL_MAN_HNDL_BY_OPID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[88].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_REQ_ST_GRACE_PRD' field in the FML buffer.
     *
     * @return Value of 'BL_REQ_ST_GRACE_PRD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_REQ_ST_GRACE_PRD() throws FMLManipulationException {
        return ((String) this.fmlBuffer[89].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_REQ_END_GRACE_PRD' field in the FML buffer.
     *
     * @return Value of 'BL_REQ_END_GRACE_PRD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_REQ_END_GRACE_PRD() throws FMLManipulationException {
        return ((String) this.fmlBuffer[90].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_NEXT_CYCLE' field in the FML buffer.
     *
     * @return Value of 'BL_NEXT_CYCLE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BL_NEXT_CYCLE() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[91].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_NEXT_CYC_EFF_DATE' field in the FML buffer.
     *
     * @return Value of 'BL_NEXT_CYC_EFF_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_NEXT_CYC_EFF_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[92].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_SUSP_RC_RATE_TYPE' field in the FML buffer.
     *
     * @return Value of 'BL_SUSP_RC_RATE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_SUSP_RC_RATE_TYPE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[93].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_DEF_MAILING_IND' field in the FML buffer.
     *
     * @return Value of 'BL_DEF_MAILING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_DEF_MAILING_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[94].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_BILL_PROD_IND' field in the FML buffer.
     *
     * @return Value of 'BL_BILL_PROD_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_BILL_PROD_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[95].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_BAL_HANDLE_IND' field in the FML buffer.
     *
     * @return Value of 'BL_BAL_HANDLE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_BAL_HANDLE_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[96].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_UD_LST_PROD_DATE' field in the FML buffer.
     *
     * @return Value of 'BL_UD_LST_PROD_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_UD_LST_PROD_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[97].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_UD_LST_CYC_RUN_YR' field in the FML buffer.
     *
     * @return Value of 'BL_UD_LST_CYC_RUN_YR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BL_UD_LST_CYC_RUN_YR() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[98].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_UD_LST_CYC_RUN_MN' field in the FML buffer.
     *
     * @return Value of 'BL_UD_LST_CYC_RUN_MN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BL_UD_LST_CYC_RUN_MN() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[99].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_UD_LST_RG_BL_SEQNO' field in the FML buffer.
     *
     * @return Value of 'BL_UD_LST_RG_BL_SEQNO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BL_UD_LST_RG_BL_SEQNO() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[100].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_UD_LST_RG_CYC_DATE' field in the FML buffer.
     *
     * @return Value of 'BL_UD_LST_RG_CYC_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_UD_LST_RG_CYC_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[101].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_UD_LST_CYC_CD' field in the FML buffer.
     *
     * @return Value of 'BL_UD_LST_CYC_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BL_UD_LST_CYC_CD() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[102].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_UD_SPCL_CYC' field in the FML buffer.
     *
     * @return Value of 'BL_UD_SPCL_CYC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BL_UD_SPCL_CYC() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[103].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_UD_SPCL_CYC_TYPE' field in the FML buffer.
     *
     * @return Value of 'BL_UD_SPCL_CYC_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_UD_SPCL_CYC_TYPE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[104].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_NO_MNSP_IND' field in the FML buffer.
     *
     * @return Value of 'BL_NO_MNSP_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_NO_MNSP_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[105].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_LST_BAN_DIS_DT' field in the FML buffer.
     *
     * @return Value of 'BL_LST_BAN_DIS_DT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_LST_BAN_DIS_DT() throws FMLManipulationException {
        return ((String) this.fmlBuffer[106].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_LST_HIER_DIS_DT' field in the FML buffer.
     *
     * @return Value of 'BL_LST_HIER_DIS_DT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_LST_HIER_DIS_DT() throws FMLManipulationException {
        return ((String) this.fmlBuffer[107].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_LST_TREE_DIS_DT' field in the FML buffer.
     *
     * @return Value of 'BL_LST_TREE_DIS_DT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_LST_TREE_DIS_DT() throws FMLManipulationException {
        return ((String) this.fmlBuffer[108].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_LST_BAN_DIS_DT_U' field in the FML buffer.
     *
     * @return Value of 'BL_LST_BAN_DIS_DT_U' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_LST_BAN_DIS_DT_U() throws FMLManipulationException {
        return ((String) this.fmlBuffer[109].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_LST_HIER_DIS_DT_U' field in the FML buffer.
     *
     * @return Value of 'BL_LST_HIER_DIS_DT_U' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_LST_HIER_DIS_DT_U() throws FMLManipulationException {
        return ((String) this.fmlBuffer[110].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_LST_TREE_DIS_DT_U' field in the FML buffer.
     *
     * @return Value of 'BL_LST_TREE_DIS_DT_U' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_LST_TREE_DIS_DT_U() throws FMLManipulationException {
        return ((String) this.fmlBuffer[111].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_LST_BAN_DIS_SN' field in the FML buffer.
     *
     * @return Value of 'BL_LST_BAN_DIS_SN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BL_LST_BAN_DIS_SN() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[112].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_LST_HIER_DIS_SN' field in the FML buffer.
     *
     * @return Value of 'BL_LST_HIER_DIS_SN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BL_LST_HIER_DIS_SN() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[113].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_LST_TREE_DIS_SN' field in the FML buffer.
     *
     * @return Value of 'BL_LST_TREE_DIS_SN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BL_LST_TREE_DIS_SN() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[114].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_LST_BAN_DIS_SN_U' field in the FML buffer.
     *
     * @return Value of 'BL_LST_BAN_DIS_SN_U' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BL_LST_BAN_DIS_SN_U() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[115].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_LST_HIER_DIS_SN_U' field in the FML buffer.
     *
     * @return Value of 'BL_LST_HIER_DIS_SN_U' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BL_LST_HIER_DIS_SN_U() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[116].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_LST_TREE_DIS_SN_U' field in the FML buffer.
     *
     * @return Value of 'BL_LST_TREE_DIS_SN_U' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BL_LST_TREE_DIS_SN_U() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[117].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_HIER_BAN_IND' field in the FML buffer.
     *
     * @return Value of 'BL_HIER_BAN_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_HIER_BAN_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[118].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_DUE_DAY' field in the FML buffer.
     *
     * @return Value of 'BL_DUE_DAY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BL_DUE_DAY() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[119].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_PREPAYMENT_IND' field in the FML buffer.
     *
     * @return Value of 'BL_PREPAYMENT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_PREPAYMENT_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[120].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BLACK_LISTED_IND' field in the FML buffer.
     *
     * @return Value of 'BLACK_LISTED_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BLACK_LISTED_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[121].getValue(0)));
    }

    /**
     * Retrieves the value of the 'VIP_IND' field in the FML buffer.
     *
     * @return Value of 'VIP_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_VIP_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[122].getValue(0)));
    }

    /**
     * Retrieves the value of the 'ORG_CODE' field in the FML buffer.
     *
     * @return Value of 'ORG_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ORG_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[123].getValue(0));
    }

    /**
     * Retrieves the value of the 'CYCLE_FREQUENCY' field in the FML buffer.
     *
     * @return Value of 'CYCLE_FREQUENCY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CYCLE_FREQUENCY() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[124].getValue(0)));
    }

    /**
     * Retrieves the value of the 'CYCLE_FIRST_BILL_MONTH' field in the FML buffer.
     *
     * @return Value of 'CYCLE_FIRST_BILL_MONTH' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CYCLE_FIRST_BILL_MONTH() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[125].getValue(0)));
    }

    /**
     * Retrieves the value of the 'EDI_LOCATION_NUMBER' field in the FML buffer.
     *
     * @return Value of 'EDI_LOCATION_NUMBER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_EDI_LOCATION_NUMBER() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[126].getValue(0));
    }

    /**
     * Retrieves the value of the 'CS_MIN_REQ_CTNS' field in the FML buffer.
     *
     * @return Value of 'CS_MIN_REQ_CTNS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CS_MIN_REQ_CTNS() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[127].getValue(0));
    }

    /**
     * Retrieves the value of the 'CS_PEN_PER_MISS_CTN' field in the FML buffer.
     *
     * @return Value of 'CS_PEN_PER_MISS_CTN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_CS_PEN_PER_MISS_CTN() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[128].getValue(0));
    }

    /**
     * Retrieves the value of the 'CS_COM_START_DATE' field in the FML buffer.
     *
     * @return Value of 'CS_COM_START_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CS_COM_START_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[129].getValue(0));
    }

    /**
     * Retrieves the value of the 'CS_COM_END_DATE' field in the FML buffer.
     *
     * @return Value of 'CS_COM_END_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CS_COM_END_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[130].getValue(0));
    }

    /**
     * Retrieves the value of the 'CS_COM_REASON_CODE' field in the FML buffer.
     *
     * @return Value of 'CS_COM_REASON_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CS_COM_REASON_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[131].getValue(0));
    }

    /**
     * Retrieves the value of the 'CS_COM_ORIG_NO_MONTH' field in the FML buffer.
     *
     * @return Value of 'CS_COM_ORIG_NO_MONTH' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CS_COM_ORIG_NO_MONTH() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[132].getValue(0)));
    }

    /**
     * Retrieves the value of the 'CS_FOLLOW_UPS_STATE' field in the FML buffer.
     *
     * @return Value of 'CS_FOLLOW_UPS_STATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CS_FOLLOW_UPS_STATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[133].getValue(0));
    }

    /**
     * Retrieves the value of the 'CS_SPEC_MEMO_IND' field in the FML buffer.
     *
     * @return Value of 'CS_SPEC_MEMO_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CS_SPEC_MEMO_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[134].getValue(0)));
    }

    /**
     * Retrieves the value of the 'STATUS_ISSUE_DATE' field in the FML buffer.
     *
     * @return Value of 'STATUS_ISSUE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_STATUS_ISSUE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[135].getValue(0));
    }

    /**
     * Retrieves the value of the 'CS_BAN_TRX_OFF_IND' field in the FML buffer.
     *
     * @return Value of 'CS_BAN_TRX_OFF_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CS_BAN_TRX_OFF_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[136].getValue(0)));
    }

    /**
     * Retrieves the value of the 'CS_HANDLE_BY_CTN_IND' field in the FML buffer.
     *
     * @return Value of 'CS_HANDLE_BY_CTN_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CS_HANDLE_BY_CTN_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[137].getValue(0)));
    }

    /**
     * Retrieves the value of the 'CS_LOCK_MECHANISM' field in the FML buffer.
     *
     * @return Value of 'CS_LOCK_MECHANISM' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CS_LOCK_MECHANISM() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[138].getValue(0)));
    }

    /**
     * Retrieves the value of the 'CS_DEF_PRODUCT_TYPE' field in the FML buffer.
     *
     * @return Value of 'CS_DEF_PRODUCT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CS_DEF_PRODUCT_TYPE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[139].getValue(0));
    }

    /**
     * Retrieves the value of the 'CAS_DEP_AMT_PER_CTN' field in the FML buffer.
     *
     * @return Value of 'CAS_DEP_AMT_PER_CTN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_CAS_DEP_AMT_PER_CTN() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[140].getValue(0));
    }

    /**
     * Retrieves the value of the 'CONV_RUN_NO' field in the FML buffer.
     *
     * @return Value of 'CONV_RUN_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CONV_RUN_NO() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[141].getValue(0)));
    }

    /**
     * Retrieves the value of the 'CARRY_OVER_BILL' field in the FML buffer.
     *
     * @return Value of 'CARRY_OVER_BILL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CARRY_OVER_BILL() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[142].getValue(0)));
    }

    /**
     * Retrieves the value of the 'OLD_ACCOUNT_ID' field in the FML buffer.
     *
     * @return Value of 'OLD_ACCOUNT_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_OLD_ACCOUNT_ID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[143].getValue(0));
    }

    /**
     * Retrieves the value of the 'HIDE_PHONE_DIGITS_IND' field in the FML buffer.
     *
     * @return Value of 'HIDE_PHONE_DIGITS_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_HIDE_PHONE_DIGITS_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[144].getValue(0)));
    }

    /**
     * Retrieves the value of the 'SEC_DEPARTMENT' field in the FML buffer.
     *
     * @return Value of 'SEC_DEPARTMENT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SEC_DEPARTMENT() throws FMLManipulationException {
        return ((String) this.fmlBuffer[145].getValue(0));
    }

    /**
     * Retrieves the value of the 'PAYABLE_LTR_SEND_DATE' field in the FML buffer.
     *
     * @return Value of 'PAYABLE_LTR_SEND_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAYABLE_LTR_SEND_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[146].getValue(0));
    }

    /**
     * Retrieves the value of the 'NEXT_CONF_ROOT_BAN' field in the FML buffer.
     *
     * @return Value of 'NEXT_CONF_ROOT_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NEXT_CONF_ROOT_BAN() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[147].getValue(0));
    }

    /**
     * Retrieves the value of the 'LAST_CONF_DATE' field in the FML buffer.
     *
     * @return Value of 'LAST_CONF_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LAST_CONF_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[148].getValue(0));
    }

    /**
     * Retrieves the value of the 'ALLOW_ADVERTISING_IND' field in the FML buffer.
     *
     * @return Value of 'ALLOW_ADVERTISING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ALLOW_ADVERTISING_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[149].getValue(0)));
    }

    /**
     * Retrieves the value of the 'AGENCY_REF_NO' field in the FML buffer.
     *
     * @return Value of 'AGENCY_REF_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_AGENCY_REF_NO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[150].getValue(0));
    }

    /**
     * Retrieves the value of the 'COL_AGENCY_CONF_DT' field in the FML buffer.
     *
     * @return Value of 'COL_AGENCY_CONF_DT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_AGENCY_CONF_DT() throws FMLManipulationException {
        return ((String) this.fmlBuffer[151].getValue(0));
    }

    /**
     * Retrieves the value of the 'BAN_GROUP_NO' field in the FML buffer.
     *
     * @return Value of 'BAN_GROUP_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BAN_GROUP_NO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[152].getValue(0));
    }

    /**
     * Retrieves the value of the 'CAAP_TYPE' field in the FML buffer.
     *
     * @return Value of 'CAAP_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CAAP_TYPE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[153].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BAN_FF_EXP_DATE' field in the FML buffer.
     *
     * @return Value of 'BAN_FF_EXP_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BAN_FF_EXP_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[154].getValue(0));
    }

    /**
     * Retrieves the value of the 'UNBILLED_REVENUE' field in the FML buffer.
     *
     * @return Value of 'UNBILLED_REVENUE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_UNBILLED_REVENUE() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[155].getValue(0));
    }

    /**
     * Retrieves the value of the 'LAST_AGNCY_UPDATE' field in the FML buffer.
     *
     * @return Value of 'LAST_AGNCY_UPDATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LAST_AGNCY_UPDATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[156].getValue(0));
    }

    /**
     * Retrieves the value of the 'WAIVER_RSN_CODE' field in the FML buffer.
     *
     * @return Value of 'WAIVER_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_WAIVER_RSN_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[157].getValue(0));
    }

    /**
     * Retrieves the value of the 'COL_WAIVER_EXP_DATE' field in the FML buffer.
     *
     * @return Value of 'COL_WAIVER_EXP_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_WAIVER_EXP_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[158].getValue(0));
    }

    /**
     * Retrieves the value of the 'INVOICE_FEE_WAIVE_IND' field in the FML buffer.
     *
     * @return Value of 'INVOICE_FEE_WAIVE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_INVOICE_FEE_WAIVE_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[159].getValue(0)));
    }

    /**
     * Retrieves the value of the 'PRD_ZERO_RATE_BILL' field in the FML buffer.
     *
     * @return Value of 'PRD_ZERO_RATE_BILL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PRD_ZERO_RATE_BILL() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[160].getValue(0)));
    }
}