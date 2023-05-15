/*
 * ArInCstBanOutput.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service.parameters;

import bea.jolt.pool.Result;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;

/**
 * @author  Ninja
 *
 * ArInCstBanOutput class.
 */
public class ArInCstBanOutput extends ServiceOutput {

    /**
     * Creates a new instance of ArInCstBanOutput.
     *
     * @throws FMLManipulationException
     */
    public ArInCstBanOutput(int nApplicationStatus) throws FMLManipulationException {
        createFmlBuffer();
        setApplicationCode(nApplicationStatus);
    }

    public ArInCstBanOutput() {
    }

    /**
     * Creates a new instance of ArInCstBanOutput.
     *
     * @param ds Output dataset from ArInCstBan service.
     * @throws FMLManipulationException
     */
    public ArInCstBanOutput(Result ds) throws FMLManipulationException {
        createFmlBuffer();
        populateFmlBuffer(ds);
    }

    /**
     * Populates the FML buffer.
     *
     * @throws FMLManipulationException
     */
    private void createFmlBuffer() throws FMLManipulationException {
        this.fmlBuffer = new FmlField[234];
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
        this.fmlBuffer[17] = new FmlField("CUSTOMER_ID", FmlField.TYPE_INTEGER, -1, null, 17, 1);
        this.fmlBuffer[18] = new FmlField("SYS_CREATION_DATE", FmlField.TYPE_STRING, 15, null, 18, 1);
        this.fmlBuffer[19] = new FmlField("SYS_UPDATE_DATE", FmlField.TYPE_STRING, 15, null, 19, 1);
        this.fmlBuffer[20] = new FmlField("PCUSTRECOPERATOR_ID", FmlField.TYPE_INTEGER, -1, null, 20, 1);
        this.fmlBuffer[21] = new FmlField("PCUSTRECAPPLICATION_ID", FmlField.TYPE_STRING, 7, null, 21, 1);
        this.fmlBuffer[22] = new FmlField("DL_SERVICE_CODE", FmlField.TYPE_STRING, 6, null, 22, 1);
        this.fmlBuffer[23] = new FmlField("DL_UPDATE_STAMP", FmlField.TYPE_SHORT, -1, null, 23, 1);
        this.fmlBuffer[24] = new FmlField("CUSTOMER_TELNO", FmlField.TYPE_STRING, 21, null, 24, 1);
        this.fmlBuffer[25] = new FmlField("CUSTOMER_FAX", FmlField.TYPE_STRING, 21, null, 25, 1);
        this.fmlBuffer[26] = new FmlField("WORK_TELNO", FmlField.TYPE_STRING, 21, null, 26, 1);
        this.fmlBuffer[27] = new FmlField("WORK_FAX", FmlField.TYPE_STRING, 21, null, 27, 1);
        this.fmlBuffer[28] = new FmlField("DEALER_CODE", FmlField.TYPE_STRING, 6, null, 28, 1);
        this.fmlBuffer[29] = new FmlField("SALES_AGENT", FmlField.TYPE_STRING, 6, null, 29, 1);
        this.fmlBuffer[30] = new FmlField("MARKET_ID", FmlField.TYPE_STRING, 4, null, 30, 1);
        this.fmlBuffer[31] = new FmlField("ACC_PASSWORD", FmlField.TYPE_STRING, 21, null, 31, 1);
        this.fmlBuffer[32] = new FmlField("VERIFIED_DATE", FmlField.TYPE_STRING, 9, null, 32, 1);
        this.fmlBuffer[33] = new FmlField("CONV_CUST_ID", FmlField.TYPE_STRING, 11, null, 33, 1);
        this.fmlBuffer[34] = new FmlField("BUSINESS_ENTITY", FmlField.TYPE_STRING, 4, null, 34, 1);
        this.fmlBuffer[35] = new FmlField("LOCATION", FmlField.TYPE_STRING, 5, null, 35, 1);
        this.fmlBuffer[36] = new FmlField("CONV_RUN_NO", FmlField.TYPE_SHORT, -1, null, 36, 1);
        this.fmlBuffer[37] = new FmlField("AGE_VERIFICATION_STATUS", FmlField.TYPE_BYTE, -1, null, 37, 1);
        this.fmlBuffer[38] = new FmlField("EMPLOYMENT_TYPE", FmlField.TYPE_STRING, 5, null, 38, 1);
        this.fmlBuffer[39] = new FmlField("EMPLOYMENT_DATE", FmlField.TYPE_STRING, 9, null, 39, 1);
        this.fmlBuffer[40] = new FmlField("OPEN_BANK_ACCOUNT_DATE", FmlField.TYPE_STRING, 9, null, 40, 1);
        this.fmlBuffer[41] = new FmlField("E_POST", FmlField.TYPE_STRING, 151, null, 41, 1);
        this.fmlBuffer[42] = new FmlField("PPARBANRECROWID", FmlField.TYPE_STRING, 19, null, 42, 1);
        this.fmlBuffer[43] = new FmlField("BAN", FmlField.TYPE_INTEGER, -1, null, 43, 1);
        this.fmlBuffer[44] = new FmlField("PPARBANRECSYS_CREATION_DATE", FmlField.TYPE_STRING, 15, null, 44, 1);
        this.fmlBuffer[45] = new FmlField("PPARBANRECSYS_UPDATE_DATE", FmlField.TYPE_STRING, 15, null, 45, 1);
        this.fmlBuffer[46] = new FmlField("PPARBANRECOPERATOR_ID", FmlField.TYPE_INTEGER, -1, null, 46, 1);
        this.fmlBuffer[47] = new FmlField("PPARBANRECAPPLICATION_ID", FmlField.TYPE_STRING, 7, null, 47, 1);
        this.fmlBuffer[48] = new FmlField("PPARBANRECCUSTOMER_ID", FmlField.TYPE_INTEGER, -1, null, 48, 1);
        this.fmlBuffer[49] = new FmlField("START_SERVICE_DATE", FmlField.TYPE_STRING, 9, null, 49, 1);
        this.fmlBuffer[50] = new FmlField("COL_DELINQ_STATUS", FmlField.TYPE_BYTE, -1, null, 50, 1);
        this.fmlBuffer[51] = new FmlField("BAN_STATUS", FmlField.TYPE_BYTE, -1, null, 51, 1);
        this.fmlBuffer[52] = new FmlField("STATUS_LAST_DATE", FmlField.TYPE_STRING, 9, null, 52, 1);
        this.fmlBuffer[53] = new FmlField("STATUS_ACTV_CODE", FmlField.TYPE_STRING, 4, null, 53, 1);
        this.fmlBuffer[54] = new FmlField("STATUS_ACTV_RSN_CODE", FmlField.TYPE_STRING, 5, null, 54, 1);
        this.fmlBuffer[55] = new FmlField("BILL_CYCLE", FmlField.TYPE_SHORT, -1, null, 55, 1);
        this.fmlBuffer[56] = new FmlField("AR_BALANCE", FmlField.TYPE_DOUBLE, -1, null, 56, 1);
        this.fmlBuffer[57] = new FmlField("BL_CUR_BILL_SEQ_NO", FmlField.TYPE_SHORT, -1, null, 57, 1);
        this.fmlBuffer[58] = new FmlField("BL_LAST_RG_CYC_DATE", FmlField.TYPE_STRING, 9, null, 58, 1);
        this.fmlBuffer[59] = new FmlField("BL_COMPLT_STATUS", FmlField.TYPE_BYTE, -1, null, 59, 1);
        this.fmlBuffer[60] = new FmlField("BL_SPECIAL_CYCLE", FmlField.TYPE_SHORT, -1, null, 60, 1);
        this.fmlBuffer[61] = new FmlField("ACCOUNT_SUB_TYPE", FmlField.TYPE_STRING, 3, null, 61, 1);
        this.fmlBuffer[62] = new FmlField("BL_MAN_HNDL_RSN", FmlField.TYPE_STRING, 3, null, 62, 1);
        this.fmlBuffer[63] = new FmlField("BL_MAN_HNDL_EFF_DATE", FmlField.TYPE_STRING, 9, null, 63, 1);
        this.fmlBuffer[64] = new FmlField("BL_MAN_HNDL_EXP_DATE", FmlField.TYPE_STRING, 9, null, 64, 1);
        this.fmlBuffer[65] = new FmlField("BL_MAN_HNDL_REQ_OPID", FmlField.TYPE_INTEGER, -1, null, 65, 1);
        this.fmlBuffer[66] = new FmlField("BL_MAN_HNDL_BY_OPID", FmlField.TYPE_INTEGER, -1, null, 66, 1);
        this.fmlBuffer[67] = new FmlField("BL_REQ_ST_GRACE_PRD", FmlField.TYPE_STRING, 9, null, 67, 1);
        this.fmlBuffer[68] = new FmlField("BL_REQ_END_GRACE_PRD", FmlField.TYPE_STRING, 9, null, 68, 1);
        this.fmlBuffer[69] = new FmlField("BL_NEXT_CYCLE", FmlField.TYPE_SHORT, -1, null, 69, 1);
        this.fmlBuffer[70] = new FmlField("BL_NEXT_CYC_EFF_DATE", FmlField.TYPE_STRING, 9, null, 70, 1);
        this.fmlBuffer[71] = new FmlField("CS_MIN_REQ_CTNS", FmlField.TYPE_INTEGER, -1, null, 71, 1);
        this.fmlBuffer[72] = new FmlField("CS_SPEC_MEMO_IND", FmlField.TYPE_BYTE, -1, null, 72, 1);
        this.fmlBuffer[73] = new FmlField("AR_EXCPT_ACCT_IND", FmlField.TYPE_BYTE, -1, null, 73, 1);
        this.fmlBuffer[74] = new FmlField("CS_COM_START_DATE", FmlField.TYPE_STRING, 9, null, 74, 1);
        this.fmlBuffer[75] = new FmlField("CS_COM_END_DATE", FmlField.TYPE_STRING, 9, null, 75, 1);
        this.fmlBuffer[76] = new FmlField("CS_COM_REASON_CODE", FmlField.TYPE_STRING, 4, null, 76, 1);
        this.fmlBuffer[77] = new FmlField("CS_COM_ORIG_NO_MONTH", FmlField.TYPE_SHORT, -1, null, 77, 1);
        this.fmlBuffer[78] = new FmlField("AR_WO_IND", FmlField.TYPE_BYTE, -1, null, 78, 1);
        this.fmlBuffer[79] = new FmlField("ACCOUNT_TYPE", FmlField.TYPE_BYTE, -1, null, 79, 1);
        this.fmlBuffer[80] = new FmlField("COL_ASSIGNED_COLL", FmlField.TYPE_STRING, 9, null, 80, 1);
        this.fmlBuffer[81] = new FmlField("BL_ZERO_BALANC_IND", FmlField.TYPE_BYTE, -1, null, 81, 1);
        this.fmlBuffer[82] = new FmlField("DEFAULT_SUB_MARKET", FmlField.TYPE_STRING, 4, null, 82, 1);
        this.fmlBuffer[83] = new FmlField("BL_DEF_MAILING_IND", FmlField.TYPE_BYTE, -1, null, 83, 1);
        this.fmlBuffer[84] = new FmlField("BL_BILL_PROD_IND", FmlField.TYPE_BYTE, -1, null, 84, 1);
        this.fmlBuffer[85] = new FmlField("BL_BAL_HANDLE_IND", FmlField.TYPE_BYTE, -1, null, 85, 1);
        this.fmlBuffer[86] = new FmlField("BL_NO_MNSP_IND", FmlField.TYPE_BYTE, -1, null, 86, 1);
        this.fmlBuffer[87] = new FmlField("CS_BAN_TRX_OFF_IND", FmlField.TYPE_BYTE, -1, null, 87, 1);
        this.fmlBuffer[88] = new FmlField("CS_HANDLE_BY_CTN_IND", FmlField.TYPE_BYTE, -1, null, 88, 1);
        this.fmlBuffer[89] = new FmlField("CS_LOCK_MECHANISM", FmlField.TYPE_BYTE, -1, null, 89, 1);
        this.fmlBuffer[90] = new FmlField("COMP_CRD_LMT", FmlField.TYPE_DOUBLE, -1, null, 90, 1);
        this.fmlBuffer[91] = new FmlField("CREDIT_CLASS", FmlField.TYPE_BYTE, -1, null, 91, 1);
        this.fmlBuffer[92] = new FmlField("CREDIT_DATE", FmlField.TYPE_STRING, 15, null, 92, 1);
        this.fmlBuffer[93] = new FmlField("CREDIT_SOURCE", FmlField.TYPE_BYTE, -1, null, 93, 1);
        this.fmlBuffer[94] = new FmlField("CREDIT_STATUS", FmlField.TYPE_STRING, 3, null, 94, 1);
        this.fmlBuffer[95] = new FmlField("EQU_CRD_LMT", FmlField.TYPE_DOUBLE, -1, null, 95, 1);
        this.fmlBuffer[96] = new FmlField("BL_VAT_EXEMPT_IND", FmlField.TYPE_BYTE, -1, null, 96, 1);
        this.fmlBuffer[97] = new FmlField("BL_VAT_EXEMPT_DATE", FmlField.TYPE_STRING, 9, null, 97, 1);
        this.fmlBuffer[98] = new FmlField("BL_VAT_EXEMPT_REF_NO", FmlField.TYPE_STRING, 17, null, 98, 1);
        this.fmlBuffer[99] = new FmlField("BL_VAT_EXEMPT_RSN_CD", FmlField.TYPE_STRING, 4, null, 99, 1);
        this.fmlBuffer[100] = new FmlField("DEFAULT_DEPARTMENT", FmlField.TYPE_STRING, 5, null, 100, 1);
        this.fmlBuffer[101] = new FmlField("COL_CODE", FmlField.TYPE_BYTE, -1, null, 101, 1);
        this.fmlBuffer[102] = new FmlField("CURR_ROOT_BAN", FmlField.TYPE_INTEGER, -1, null, 102, 1);
        this.fmlBuffer[103] = new FmlField("NEXT_ROOT_BAN", FmlField.TYPE_INTEGER, -1, null, 103, 1);
        this.fmlBuffer[104] = new FmlField("PARTITION_ROOT_BAN", FmlField.TYPE_INTEGER, -1, null, 104, 1);
        this.fmlBuffer[105] = new FmlField("CYCLE_FREQUENCY", FmlField.TYPE_SHORT, -1, null, 105, 1);
        this.fmlBuffer[106] = new FmlField("CYCLE_FIRST_BILL_MONTH", FmlField.TYPE_SHORT, -1, null, 106, 1);
        this.fmlBuffer[107] = new FmlField("BL_DUE_DAY", FmlField.TYPE_SHORT, -1, null, 107, 1);
        this.fmlBuffer[108] = new FmlField("VIP_IND", FmlField.TYPE_BYTE, -1, null, 108, 1);
        this.fmlBuffer[109] = new FmlField("BLACK_LISTED_IND", FmlField.TYPE_BYTE, -1, null, 109, 1);
        this.fmlBuffer[110] = new FmlField("BL_PRT_CATEGORY", FmlField.TYPE_STRING, 3, null, 110, 1);
        this.fmlBuffer[111] = new FmlField("CS_DEF_PRODUCT_TYPE", FmlField.TYPE_STRING, 4, null, 111, 1);
        this.fmlBuffer[112] = new FmlField("ORG_CODE", FmlField.TYPE_STRING, 6, null, 112, 1);
        this.fmlBuffer[113] = new FmlField("BL_HIER_BAN_IND", FmlField.TYPE_BYTE, -1, null, 113, 1);
        this.fmlBuffer[114] = new FmlField("PAYMENT_METHOD", FmlField.TYPE_STRING, 3, null, 114, 1);
        this.fmlBuffer[115] = new FmlField("PAYMENT_SUB_METHOD", FmlField.TYPE_STRING, 3, null, 115, 1);
        this.fmlBuffer[116] = new FmlField("OLD_ACCOUNT_ID", FmlField.TYPE_STRING, 21, null, 116, 1);
        this.fmlBuffer[117] = new FmlField("CARRY_OVER_BILL", FmlField.TYPE_BYTE, -1, null, 117, 1);
        this.fmlBuffer[118] = new FmlField("HIDE_PHONE_DIGITS_IND", FmlField.TYPE_BYTE, -1, null, 118, 1);
        this.fmlBuffer[119] = new FmlField("SEC_DEPARTMENT", FmlField.TYPE_STRING, 5, null, 119, 1);
        this.fmlBuffer[120] = new FmlField("NEXT_CONF_ROOT_BAN", FmlField.TYPE_INTEGER, -1, null, 120, 1);
        this.fmlBuffer[121] = new FmlField("EDI_LOCATION_NUMBER", FmlField.TYPE_DOUBLE, -1, null, 121, 1);
        this.fmlBuffer[122] = new FmlField("ALLOW_ADVERTISING_IND", FmlField.TYPE_BYTE, -1, null, 122, 1);
        this.fmlBuffer[123] = new FmlField("AGENCY_REF_NO", FmlField.TYPE_STRING, 9, null, 123, 1);
        this.fmlBuffer[124] = new FmlField("COL_AGENCY_CONF_DT", FmlField.TYPE_STRING, 9, null, 124, 1);
        this.fmlBuffer[125] = new FmlField("BAN_GROUP_NO", FmlField.TYPE_STRING, 11, null, 125, 1);
        this.fmlBuffer[126] = new FmlField("CAAP_TYPE", FmlField.TYPE_BYTE, -1, null, 126, 1);
        this.fmlBuffer[127] = new FmlField("COL_AGNCY_CODE", FmlField.TYPE_STRING, 9, null, 127, 1);
        this.fmlBuffer[128] = new FmlField("INVOICE_FEE_WAIVE_IND", FmlField.TYPE_BYTE, -1, null, 128, 1);
        this.fmlBuffer[129] = new FmlField("PRD_ZERO_RATE_BILL", FmlField.TYPE_BYTE, -1, null, 129, 1);
        this.fmlBuffer[130] = new FmlField("ROWCOUNT", FmlField.TYPE_INTEGER, -1, null, 130, 1);
        this.fmlBuffer[131] = new FmlField("LINK_MODE", FmlField.TYPE_BYTE, -1, null, 131, 20);
        this.fmlBuffer[132] = new FmlField("LINK_BAN", FmlField.TYPE_INTEGER, -1, null, 132, 20);
        this.fmlBuffer[133] = new FmlField("LINK_SUBSCRIBER", FmlField.TYPE_STRING, 21, null, 133, 20);
        this.fmlBuffer[134] = new FmlField("LINK_ROW_ID", FmlField.TYPE_STRING, 19, null, 134, 20);
        this.fmlBuffer[135] = new FmlField("LINK_SEQ_NO", FmlField.TYPE_INTEGER, -1, null, 135, 20);
        this.fmlBuffer[136] = new FmlField("LNKRECCUSTOMER_ID", FmlField.TYPE_INTEGER, -1, null, 136, 20);
        this.fmlBuffer[137] = new FmlField("LNKRECBAN", FmlField.TYPE_INTEGER, -1, null, 137, 20);
        this.fmlBuffer[138] = new FmlField("SUBSCRIBER_NO", FmlField.TYPE_STRING, 21, null, 138, 20);
        this.fmlBuffer[139] = new FmlField("LINK_TYPE", FmlField.TYPE_BYTE, -1, null, 139, 20);
        this.fmlBuffer[140] = new FmlField("EFFECTIVE_DATE", FmlField.TYPE_STRING, 9, null, 140, 20);
        this.fmlBuffer[141] = new FmlField("FOREIGN_SEQ_NO", FmlField.TYPE_INTEGER, -1, null, 141, 20);
        this.fmlBuffer[142] = new FmlField("BILLING_IND", FmlField.TYPE_BYTE, -1, null, 142, 20);
        this.fmlBuffer[143] = new FmlField("MAILING_IND", FmlField.TYPE_BYTE, -1, null, 143, 20);
        this.fmlBuffer[144] = new FmlField("USER_IND", FmlField.TYPE_BYTE, -1, null, 144, 20);
        this.fmlBuffer[145] = new FmlField("LINK_BILLING_IND", FmlField.TYPE_BYTE, -1, null, 145, 20);
        this.fmlBuffer[146] = new FmlField("LINK_MAILING_IND", FmlField.TYPE_BYTE, -1, null, 146, 20);
        this.fmlBuffer[147] = new FmlField("LINK_USER_IND", FmlField.TYPE_BYTE, -1, null, 147, 20);
        this.fmlBuffer[148] = new FmlField("NM_MODE", FmlField.TYPE_BYTE, -1, null, 148, 20);
        this.fmlBuffer[149] = new FmlField("NM_UP_TYPE", FmlField.TYPE_BYTE, -1, null, 149, 20);
        this.fmlBuffer[150] = new FmlField("NM_EXPIRE_DATE", FmlField.TYPE_STRING, 9, null, 150, 20);
        this.fmlBuffer[151] = new FmlField("NAMERECROWID", FmlField.TYPE_STRING, 19, null, 151, 20);
        this.fmlBuffer[152] = new FmlField("NAME_ID", FmlField.TYPE_INTEGER, -1, null, 152, 20);
        this.fmlBuffer[153] = new FmlField("NAMERECSYS_CREATION_DATE", FmlField.TYPE_STRING, 15, null, 153, 20);
        this.fmlBuffer[154] = new FmlField("NAMERECSYS_UPDATE_DATE", FmlField.TYPE_STRING, 15, null, 154, 20);
        this.fmlBuffer[155] = new FmlField("NAMERECOPERATOR_ID", FmlField.TYPE_INTEGER, -1, null, 155, 20);
        this.fmlBuffer[156] = new FmlField("NAMERECAPPLICATION_ID", FmlField.TYPE_STRING, 7, null, 156, 20);
        this.fmlBuffer[157] = new FmlField("NAMERECDL_SERVICE_CODE", FmlField.TYPE_STRING, 6, null, 157, 20);
        this.fmlBuffer[158] = new FmlField("NAMERECDL_UPDATE_STAMP", FmlField.TYPE_SHORT, -1, null, 158, 20);
        this.fmlBuffer[159] = new FmlField("CONTROL_NAME", FmlField.TYPE_STRING, 41, null, 159, 20);
        this.fmlBuffer[160] = new FmlField("LAST_BUSINESS_NAME", FmlField.TYPE_STRING, 61, null, 160, 20);
        this.fmlBuffer[161] = new FmlField("FIRST_NAME", FmlField.TYPE_STRING, 33, null, 161, 20);
        this.fmlBuffer[162] = new FmlField("ADDITIONAL_TITLE", FmlField.TYPE_STRING, 61, null, 162, 20);
        this.fmlBuffer[163] = new FmlField("NAME_FORMAT", FmlField.TYPE_BYTE, -1, null, 163, 20);
        this.fmlBuffer[164] = new FmlField("BIRTH_DATE", FmlField.TYPE_STRING, 9, null, 164, 20);
        this.fmlBuffer[165] = new FmlField("IDENTIFY", FmlField.TYPE_STRING, 21, null, 165, 20);
        this.fmlBuffer[166] = new FmlField("ID_TYPE", FmlField.TYPE_STRING, 5, null, 166, 20);
        this.fmlBuffer[167] = new FmlField("COMP_REG_ID", FmlField.TYPE_STRING, 21, null, 167, 20);
        this.fmlBuffer[168] = new FmlField("KOB", FmlField.TYPE_DOUBLE, -1, null, 168, 20);
        this.fmlBuffer[169] = new FmlField("MIDDLE_INITIAL", FmlField.TYPE_STRING, 33, null, 169, 20);
        this.fmlBuffer[170] = new FmlField("TELEMARKET_ID", FmlField.TYPE_STRING, 11, null, 170, 20);
        this.fmlBuffer[171] = new FmlField("NAMERECCONV_RUN_NO", FmlField.TYPE_SHORT, -1, null, 171, 20);
        this.fmlBuffer[172] = new FmlField("NAME_TITLE_SALUTATION", FmlField.TYPE_STRING, 21, null, 172, 20);
        this.fmlBuffer[173] = new FmlField("NATIONALITY_CD", FmlField.TYPE_STRING, 4, null, 173, 20);
        this.fmlBuffer[174] = new FmlField("GENDER", FmlField.TYPE_BYTE, -1, null, 174, 20);
        this.fmlBuffer[175] = new FmlField("MARITAL_STATUS", FmlField.TYPE_STRING, 5, null, 175, 20);
        this.fmlBuffer[176] = new FmlField("ROLE_IND", FmlField.TYPE_BYTE, -1, null, 176, 20);
        this.fmlBuffer[177] = new FmlField("ADR_MODE", FmlField.TYPE_BYTE, -1, null, 177, 20);
        this.fmlBuffer[178] = new FmlField("ADR_UP_TYPE", FmlField.TYPE_BYTE, -1, null, 178, 20);
        this.fmlBuffer[179] = new FmlField("ADR_EXPIRE_DATE", FmlField.TYPE_STRING, 9, null, 179, 20);
        this.fmlBuffer[180] = new FmlField("ADDRESSRECROWID", FmlField.TYPE_STRING, 19, null, 180, 20);
        this.fmlBuffer[181] = new FmlField("ADDRESS_ID", FmlField.TYPE_INTEGER, -1, null, 181, 20);
        this.fmlBuffer[182] = new FmlField("ADDRESSRECSYS_CREATION_DATE", FmlField.TYPE_STRING, 15, null, 182, 20);
        this.fmlBuffer[183] = new FmlField("ADDRESSRECSYS_UPDATE_DATE", FmlField.TYPE_STRING, 15, null, 183, 20);
        this.fmlBuffer[184] = new FmlField("ADDRESSRECOPERATOR_ID", FmlField.TYPE_INTEGER, -1, null, 184, 20);
        this.fmlBuffer[185] = new FmlField("ADDRESSRECAPPLICATION_ID", FmlField.TYPE_STRING, 7, null, 185, 20);
        this.fmlBuffer[186] = new FmlField("ADDRESSRECDL_SERVICE_CODE", FmlField.TYPE_STRING, 6, null, 186, 20);
        this.fmlBuffer[187] = new FmlField("ADDRESSRECDL_UPDATE_STAMP", FmlField.TYPE_SHORT, -1, null, 187, 20);
        this.fmlBuffer[188] = new FmlField("ADR_TYPE", FmlField.TYPE_BYTE, -1, null, 188, 20);
        this.fmlBuffer[189] = new FmlField("ADR_STATUS", FmlField.TYPE_BYTE, -1, null, 189, 20);
        this.fmlBuffer[190] = new FmlField("ADR_STATUS_DATE", FmlField.TYPE_STRING, 9, null, 190, 20);
        this.fmlBuffer[191] = new FmlField("ADR_SECONDARY_LN", FmlField.TYPE_STRING, 101, null, 191, 20);
        this.fmlBuffer[192] = new FmlField("ADR_PRIMARY_LN", FmlField.TYPE_STRING, 101, null, 192, 20);
        this.fmlBuffer[193] = new FmlField("ADR_CITY", FmlField.TYPE_STRING, 40, null, 193, 20);
        this.fmlBuffer[194] = new FmlField("ADR_ZIP", FmlField.TYPE_STRING, 10, null, 194, 20);
        this.fmlBuffer[195] = new FmlField("ADR_HOUSE_NO", FmlField.TYPE_STRING, 21, null, 195, 20);
        this.fmlBuffer[196] = new FmlField("ADR_STREET_NAME", FmlField.TYPE_STRING, 61, null, 196, 20);
        this.fmlBuffer[197] = new FmlField("ADR_DIRECTION", FmlField.TYPE_STRING, 3, null, 197, 20);
        this.fmlBuffer[198] = new FmlField("ADR_POB", FmlField.TYPE_STRING, 11, null, 198, 20);
        this.fmlBuffer[199] = new FmlField("ADR_COUNTRY", FmlField.TYPE_STRING, 4, null, 199, 20);
        this.fmlBuffer[200] = new FmlField("ADR_HOUSE_LETTER", FmlField.TYPE_STRING, 3, null, 200, 20);
        this.fmlBuffer[201] = new FmlField("ADR_STORY", FmlField.TYPE_STRING, 3, null, 201, 20);
        this.fmlBuffer[202] = new FmlField("ADR_DOOR_NO", FmlField.TYPE_STRING, 5, null, 202, 20);
        this.fmlBuffer[203] = new FmlField("ADR_EMAIL", FmlField.TYPE_STRING, 151, null, 203, 20);
        this.fmlBuffer[204] = new FmlField("SINCE_DATE", FmlField.TYPE_STRING, 9, null, 204, 20);
        this.fmlBuffer[205] = new FmlField("ADR_DISTRICT", FmlField.TYPE_STRING, 41, null, 205, 20);
        this.fmlBuffer[206] = new FmlField("CO_IND", FmlField.TYPE_BYTE, -1, null, 206, 20);
        this.fmlBuffer[207] = new FmlField("ADDRESSRECCONV_RUN_NO", FmlField.TYPE_SHORT, -1, null, 207, 20);
        this.fmlBuffer[208] = new FmlField("ACCOMMODATION_TYPE", FmlField.TYPE_STRING, 5, null, 208, 20);
        this.fmlBuffer[209] = new FmlField("COUNTY_CODE", FmlField.TYPE_STRING, 3, null, 209, 20);
        this.fmlBuffer[210] = new FmlField("COMMUNITY_NAME", FmlField.TYPE_STRING, 31, null, 210, 20);
        this.fmlBuffer[211] = new FmlField("ADR_CO_NAME", FmlField.TYPE_STRING, 61, null, 211, 20);
        this.fmlBuffer[212] = new FmlField("ADR_HOUSE_NAME", FmlField.TYPE_STRING, 61, null, 212, 20);
        this.fmlBuffer[213] = new FmlField("ADR_P1", FmlField.TYPE_STRING, 61, null, 213, 20);
        this.fmlBuffer[214] = new FmlField("ADR_P2", FmlField.TYPE_STRING, 61, null, 214, 20);
        this.fmlBuffer[215] = new FmlField("ADR_P3", FmlField.TYPE_STRING, 61, null, 215, 20);
        this.fmlBuffer[216] = new FmlField("ADR_P4", FmlField.TYPE_STRING, 61, null, 216, 20);
        this.fmlBuffer[217] = new FmlField("ADR_P5", FmlField.TYPE_STRING, 61, null, 217, 20);
        this.fmlBuffer[218] = new FmlField("ADR_P6", FmlField.TYPE_STRING, 61, null, 218, 20);
        this.fmlBuffer[219] = new FmlField("ADR_P7", FmlField.TYPE_STRING, 61, null, 219, 20);
        this.fmlBuffer[220] = new FmlField("ADR_P8", FmlField.TYPE_STRING, 61, null, 220, 20);
        this.fmlBuffer[221] = new FmlField("ADR_P9", FmlField.TYPE_STRING, 61, null, 221, 20);
        this.fmlBuffer[222] = new FmlField("ADR_P10", FmlField.TYPE_STRING, 61, null, 222, 20);
        this.fmlBuffer[223] = new FmlField("PSVBLPRMBUFROWCOUNT", FmlField.TYPE_INTEGER, -1, null, 223, 1);
        this.fmlBuffer[224] = new FmlField("BPMODE", FmlField.TYPE_BYTE, -1, null, 224, 20);
        this.fmlBuffer[225] = new FmlField("BPSEQNO", FmlField.TYPE_INTEGER, -1, null, 225, 20);
        this.fmlBuffer[226] = new FmlField("BPEFFDATE", FmlField.TYPE_STRING, 9, null, 226, 20);
        this.fmlBuffer[227] = new FmlField("BPEXPDATE", FmlField.TYPE_STRING, 9, null, 227, 20);
        this.fmlBuffer[228] = new FmlField("BPFORMAT", FmlField.TYPE_STRING, 3, null, 228, 20);
        this.fmlBuffer[229] = new FmlField("BPMEDIA", FmlField.TYPE_STRING, 3, null, 229, 20);
        this.fmlBuffer[230] = new FmlField("BPPRINTCATEGORY", FmlField.TYPE_STRING, 3, null, 230, 20);
        this.fmlBuffer[231] = new FmlField("BPNOOFCOPIES", FmlField.TYPE_SHORT, -1, null, 231, 20);
        this.fmlBuffer[232] = new FmlField("BP_LANGUAGE", FmlField.TYPE_STRING, 3, null, 232, 20);
        this.fmlBuffer[233] = new FmlField("BP_CALL_DETAILS_MEDIA", FmlField.TYPE_BYTE, -1, null, 233, 20);
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
     * Retrieves the value of the 'CUSTOMER_ID' field in the FML buffer.
     *
     * @return Value of 'CUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CUSTOMER_ID() throws FMLManipulationException {
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
     * Retrieves the value of the 'PCUSTRECOPERATOR_ID' field in the FML buffer.
     *
     * @return Value of 'PCUSTRECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PCUSTRECOPERATOR_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[20].getValue(0));
    }

    /**
     * Retrieves the value of the 'PCUSTRECAPPLICATION_ID' field in the FML buffer.
     *
     * @return Value of 'PCUSTRECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PCUSTRECAPPLICATION_ID() throws FMLManipulationException {
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
     * Retrieves the value of the 'CUSTOMER_TELNO' field in the FML buffer.
     *
     * @return Value of 'CUSTOMER_TELNO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CUSTOMER_TELNO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[24].getValue(0));
    }

    /**
     * Retrieves the value of the 'CUSTOMER_FAX' field in the FML buffer.
     *
     * @return Value of 'CUSTOMER_FAX' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CUSTOMER_FAX() throws FMLManipulationException {
        return ((String) this.fmlBuffer[25].getValue(0));
    }

    /**
     * Retrieves the value of the 'WORK_TELNO' field in the FML buffer.
     *
     * @return Value of 'WORK_TELNO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_WORK_TELNO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[26].getValue(0));
    }

    /**
     * Retrieves the value of the 'WORK_FAX' field in the FML buffer.
     *
     * @return Value of 'WORK_FAX' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_WORK_FAX() throws FMLManipulationException {
        return ((String) this.fmlBuffer[27].getValue(0));
    }

    /**
     * Retrieves the value of the 'DEALER_CODE' field in the FML buffer.
     *
     * @return Value of 'DEALER_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DEALER_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[28].getValue(0));
    }

    /**
     * Retrieves the value of the 'SALES_AGENT' field in the FML buffer.
     *
     * @return Value of 'SALES_AGENT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SALES_AGENT() throws FMLManipulationException {
        return ((String) this.fmlBuffer[29].getValue(0));
    }

    /**
     * Retrieves the value of the 'MARKET_ID' field in the FML buffer.
     *
     * @return Value of 'MARKET_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MARKET_ID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[30].getValue(0));
    }

    /**
     * Retrieves the value of the 'ACC_PASSWORD' field in the FML buffer.
     *
     * @return Value of 'ACC_PASSWORD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACC_PASSWORD() throws FMLManipulationException {
        return ((String) this.fmlBuffer[31].getValue(0));
    }

    /**
     * Retrieves the value of the 'VERIFIED_DATE' field in the FML buffer.
     *
     * @return Value of 'VERIFIED_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_VERIFIED_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[32].getValue(0));
    }

    /**
     * Retrieves the value of the 'CONV_CUST_ID' field in the FML buffer.
     *
     * @return Value of 'CONV_CUST_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CONV_CUST_ID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[33].getValue(0));
    }

    /**
     * Retrieves the value of the 'BUSINESS_ENTITY' field in the FML buffer.
     *
     * @return Value of 'BUSINESS_ENTITY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BUSINESS_ENTITY() throws FMLManipulationException {
        return ((String) this.fmlBuffer[34].getValue(0));
    }

    /**
     * Retrieves the value of the 'LOCATION' field in the FML buffer.
     *
     * @return Value of 'LOCATION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LOCATION() throws FMLManipulationException {
        return ((String) this.fmlBuffer[35].getValue(0));
    }

    /**
     * Retrieves the value of the 'CONV_RUN_NO' field in the FML buffer.
     *
     * @return Value of 'CONV_RUN_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CONV_RUN_NO() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[36].getValue(0)));
    }

    /**
     * Retrieves the value of the 'AGE_VERIFICATION_STATUS' field in the FML buffer.
     *
     * @return Value of 'AGE_VERIFICATION_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_AGE_VERIFICATION_STATUS() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[37].getValue(0)));
    }

    /**
     * Retrieves the value of the 'EMPLOYMENT_TYPE' field in the FML buffer.
     *
     * @return Value of 'EMPLOYMENT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EMPLOYMENT_TYPE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[38].getValue(0));
    }

    /**
     * Retrieves the value of the 'EMPLOYMENT_DATE' field in the FML buffer.
     *
     * @return Value of 'EMPLOYMENT_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EMPLOYMENT_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[39].getValue(0));
    }

    /**
     * Retrieves the value of the 'OPEN_BANK_ACCOUNT_DATE' field in the FML buffer.
     *
     * @return Value of 'OPEN_BANK_ACCOUNT_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_OPEN_BANK_ACCOUNT_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[40].getValue(0));
    }

    /**
     * Retrieves the value of the 'E_POST' field in the FML buffer.
     *
     * @return Value of 'E_POST' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_E_POST() throws FMLManipulationException {
        return ((String) this.fmlBuffer[41].getValue(0));
    }

    /**
     * Retrieves the value of the 'PPARBANRECROWID' field in the FML buffer.
     *
     * @return Value of 'PPARBANRECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PPARBANRECROWID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[42].getValue(0));
    }

    /**
     * Retrieves the value of the 'BAN' field in the FML buffer.
     *
     * @return Value of 'BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BAN() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[43].getValue(0));
    }

    /**
     * Retrieves the value of the 'PPARBANRECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @return Value of 'PPARBANRECSYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PPARBANRECSYS_CREATION_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[44].getValue(0));
    }

    /**
     * Retrieves the value of the 'PPARBANRECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @return Value of 'PPARBANRECSYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PPARBANRECSYS_UPDATE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[45].getValue(0));
    }

    /**
     * Retrieves the value of the 'PPARBANRECOPERATOR_ID' field in the FML buffer.
     *
     * @return Value of 'PPARBANRECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PPARBANRECOPERATOR_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[46].getValue(0));
    }

    /**
     * Retrieves the value of the 'PPARBANRECAPPLICATION_ID' field in the FML buffer.
     *
     * @return Value of 'PPARBANRECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PPARBANRECAPPLICATION_ID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[47].getValue(0));
    }

    /**
     * Retrieves the value of the 'PPARBANRECCUSTOMER_ID' field in the FML buffer.
     *
     * @return Value of 'PPARBANRECCUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PPARBANRECCUSTOMER_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[48].getValue(0));
    }

    /**
     * Retrieves the value of the 'START_SERVICE_DATE' field in the FML buffer.
     *
     * @return Value of 'START_SERVICE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_START_SERVICE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[49].getValue(0));
    }

    /**
     * Retrieves the value of the 'COL_DELINQ_STATUS' field in the FML buffer.
     *
     * @return Value of 'COL_DELINQ_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_DELINQ_STATUS() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[50].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BAN_STATUS' field in the FML buffer.
     *
     * @return Value of 'BAN_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BAN_STATUS() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[51].getValue(0)));
    }

    /**
     * Retrieves the value of the 'STATUS_LAST_DATE' field in the FML buffer.
     *
     * @return Value of 'STATUS_LAST_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_STATUS_LAST_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[52].getValue(0));
    }

    /**
     * Retrieves the value of the 'STATUS_ACTV_CODE' field in the FML buffer.
     *
     * @return Value of 'STATUS_ACTV_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_STATUS_ACTV_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[53].getValue(0));
    }

    /**
     * Retrieves the value of the 'STATUS_ACTV_RSN_CODE' field in the FML buffer.
     *
     * @return Value of 'STATUS_ACTV_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_STATUS_ACTV_RSN_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[54].getValue(0));
    }

    /**
     * Retrieves the value of the 'BILL_CYCLE' field in the FML buffer.
     *
     * @return Value of 'BILL_CYCLE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BILL_CYCLE() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[55].getValue(0)));
    }

    /**
     * Retrieves the value of the 'AR_BALANCE' field in the FML buffer.
     *
     * @return Value of 'AR_BALANCE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_AR_BALANCE() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[56].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_CUR_BILL_SEQ_NO' field in the FML buffer.
     *
     * @return Value of 'BL_CUR_BILL_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BL_CUR_BILL_SEQ_NO() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[57].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_LAST_RG_CYC_DATE' field in the FML buffer.
     *
     * @return Value of 'BL_LAST_RG_CYC_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_LAST_RG_CYC_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[58].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_COMPLT_STATUS' field in the FML buffer.
     *
     * @return Value of 'BL_COMPLT_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_COMPLT_STATUS() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[59].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_SPECIAL_CYCLE' field in the FML buffer.
     *
     * @return Value of 'BL_SPECIAL_CYCLE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BL_SPECIAL_CYCLE() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[60].getValue(0)));
    }

    /**
     * Retrieves the value of the 'ACCOUNT_SUB_TYPE' field in the FML buffer.
     *
     * @return Value of 'ACCOUNT_SUB_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACCOUNT_SUB_TYPE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[61].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_MAN_HNDL_RSN' field in the FML buffer.
     *
     * @return Value of 'BL_MAN_HNDL_RSN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_MAN_HNDL_RSN() throws FMLManipulationException {
        return ((String) this.fmlBuffer[62].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_MAN_HNDL_EFF_DATE' field in the FML buffer.
     *
     * @return Value of 'BL_MAN_HNDL_EFF_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_MAN_HNDL_EFF_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[63].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_MAN_HNDL_EXP_DATE' field in the FML buffer.
     *
     * @return Value of 'BL_MAN_HNDL_EXP_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_MAN_HNDL_EXP_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[64].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_MAN_HNDL_REQ_OPID' field in the FML buffer.
     *
     * @return Value of 'BL_MAN_HNDL_REQ_OPID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BL_MAN_HNDL_REQ_OPID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[65].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_MAN_HNDL_BY_OPID' field in the FML buffer.
     *
     * @return Value of 'BL_MAN_HNDL_BY_OPID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BL_MAN_HNDL_BY_OPID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[66].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_REQ_ST_GRACE_PRD' field in the FML buffer.
     *
     * @return Value of 'BL_REQ_ST_GRACE_PRD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_REQ_ST_GRACE_PRD() throws FMLManipulationException {
        return ((String) this.fmlBuffer[67].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_REQ_END_GRACE_PRD' field in the FML buffer.
     *
     * @return Value of 'BL_REQ_END_GRACE_PRD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_REQ_END_GRACE_PRD() throws FMLManipulationException {
        return ((String) this.fmlBuffer[68].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_NEXT_CYCLE' field in the FML buffer.
     *
     * @return Value of 'BL_NEXT_CYCLE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BL_NEXT_CYCLE() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[69].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_NEXT_CYC_EFF_DATE' field in the FML buffer.
     *
     * @return Value of 'BL_NEXT_CYC_EFF_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_NEXT_CYC_EFF_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[70].getValue(0));
    }

    /**
     * Retrieves the value of the 'CS_MIN_REQ_CTNS' field in the FML buffer.
     *
     * @return Value of 'CS_MIN_REQ_CTNS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CS_MIN_REQ_CTNS() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[71].getValue(0));
    }

    /**
     * Retrieves the value of the 'CS_SPEC_MEMO_IND' field in the FML buffer.
     *
     * @return Value of 'CS_SPEC_MEMO_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CS_SPEC_MEMO_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[72].getValue(0)));
    }

    /**
     * Retrieves the value of the 'AR_EXCPT_ACCT_IND' field in the FML buffer.
     *
     * @return Value of 'AR_EXCPT_ACCT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_AR_EXCPT_ACCT_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[73].getValue(0)));
    }

    /**
     * Retrieves the value of the 'CS_COM_START_DATE' field in the FML buffer.
     *
     * @return Value of 'CS_COM_START_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CS_COM_START_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[74].getValue(0));
    }

    /**
     * Retrieves the value of the 'CS_COM_END_DATE' field in the FML buffer.
     *
     * @return Value of 'CS_COM_END_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CS_COM_END_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[75].getValue(0));
    }

    /**
     * Retrieves the value of the 'CS_COM_REASON_CODE' field in the FML buffer.
     *
     * @return Value of 'CS_COM_REASON_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CS_COM_REASON_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[76].getValue(0));
    }

    /**
     * Retrieves the value of the 'CS_COM_ORIG_NO_MONTH' field in the FML buffer.
     *
     * @return Value of 'CS_COM_ORIG_NO_MONTH' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CS_COM_ORIG_NO_MONTH() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[77].getValue(0)));
    }

    /**
     * Retrieves the value of the 'AR_WO_IND' field in the FML buffer.
     *
     * @return Value of 'AR_WO_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_AR_WO_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[78].getValue(0)));
    }

    /**
     * Retrieves the value of the 'ACCOUNT_TYPE' field in the FML buffer.
     *
     * @return Value of 'ACCOUNT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACCOUNT_TYPE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[79].getValue(0)));
    }

    /**
     * Retrieves the value of the 'COL_ASSIGNED_COLL' field in the FML buffer.
     *
     * @return Value of 'COL_ASSIGNED_COLL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_ASSIGNED_COLL() throws FMLManipulationException {
        return ((String) this.fmlBuffer[80].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_ZERO_BALANC_IND' field in the FML buffer.
     *
     * @return Value of 'BL_ZERO_BALANC_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_ZERO_BALANC_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[81].getValue(0)));
    }

    /**
     * Retrieves the value of the 'DEFAULT_SUB_MARKET' field in the FML buffer.
     *
     * @return Value of 'DEFAULT_SUB_MARKET' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DEFAULT_SUB_MARKET() throws FMLManipulationException {
        return ((String) this.fmlBuffer[82].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_DEF_MAILING_IND' field in the FML buffer.
     *
     * @return Value of 'BL_DEF_MAILING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_DEF_MAILING_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[83].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_BILL_PROD_IND' field in the FML buffer.
     *
     * @return Value of 'BL_BILL_PROD_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_BILL_PROD_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[84].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_BAL_HANDLE_IND' field in the FML buffer.
     *
     * @return Value of 'BL_BAL_HANDLE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_BAL_HANDLE_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[85].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_NO_MNSP_IND' field in the FML buffer.
     *
     * @return Value of 'BL_NO_MNSP_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_NO_MNSP_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[86].getValue(0)));
    }

    /**
     * Retrieves the value of the 'CS_BAN_TRX_OFF_IND' field in the FML buffer.
     *
     * @return Value of 'CS_BAN_TRX_OFF_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CS_BAN_TRX_OFF_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[87].getValue(0)));
    }

    /**
     * Retrieves the value of the 'CS_HANDLE_BY_CTN_IND' field in the FML buffer.
     *
     * @return Value of 'CS_HANDLE_BY_CTN_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CS_HANDLE_BY_CTN_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[88].getValue(0)));
    }

    /**
     * Retrieves the value of the 'CS_LOCK_MECHANISM' field in the FML buffer.
     *
     * @return Value of 'CS_LOCK_MECHANISM' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CS_LOCK_MECHANISM() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[89].getValue(0)));
    }

    /**
     * Retrieves the value of the 'COMP_CRD_LMT' field in the FML buffer.
     *
     * @return Value of 'COMP_CRD_LMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_COMP_CRD_LMT() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[90].getValue(0));
    }

    /**
     * Retrieves the value of the 'CREDIT_CLASS' field in the FML buffer.
     *
     * @return Value of 'CREDIT_CLASS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CREDIT_CLASS() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[91].getValue(0)));
    }

    /**
     * Retrieves the value of the 'CREDIT_DATE' field in the FML buffer.
     *
     * @return Value of 'CREDIT_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CREDIT_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[92].getValue(0));
    }

    /**
     * Retrieves the value of the 'CREDIT_SOURCE' field in the FML buffer.
     *
     * @return Value of 'CREDIT_SOURCE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CREDIT_SOURCE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[93].getValue(0)));
    }

    /**
     * Retrieves the value of the 'CREDIT_STATUS' field in the FML buffer.
     *
     * @return Value of 'CREDIT_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CREDIT_STATUS() throws FMLManipulationException {
        return ((String) this.fmlBuffer[94].getValue(0));
    }

    /**
     * Retrieves the value of the 'EQU_CRD_LMT' field in the FML buffer.
     *
     * @return Value of 'EQU_CRD_LMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_EQU_CRD_LMT() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[95].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_VAT_EXEMPT_IND' field in the FML buffer.
     *
     * @return Value of 'BL_VAT_EXEMPT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_VAT_EXEMPT_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[96].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_VAT_EXEMPT_DATE' field in the FML buffer.
     *
     * @return Value of 'BL_VAT_EXEMPT_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_VAT_EXEMPT_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[97].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_VAT_EXEMPT_REF_NO' field in the FML buffer.
     *
     * @return Value of 'BL_VAT_EXEMPT_REF_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_VAT_EXEMPT_REF_NO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[98].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_VAT_EXEMPT_RSN_CD' field in the FML buffer.
     *
     * @return Value of 'BL_VAT_EXEMPT_RSN_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_VAT_EXEMPT_RSN_CD() throws FMLManipulationException {
        return ((String) this.fmlBuffer[99].getValue(0));
    }

    /**
     * Retrieves the value of the 'DEFAULT_DEPARTMENT' field in the FML buffer.
     *
     * @return Value of 'DEFAULT_DEPARTMENT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DEFAULT_DEPARTMENT() throws FMLManipulationException {
        return ((String) this.fmlBuffer[100].getValue(0));
    }

    /**
     * Retrieves the value of the 'COL_CODE' field in the FML buffer.
     *
     * @return Value of 'COL_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_CODE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[101].getValue(0)));
    }

    /**
     * Retrieves the value of the 'CURR_ROOT_BAN' field in the FML buffer.
     *
     * @return Value of 'CURR_ROOT_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CURR_ROOT_BAN() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[102].getValue(0));
    }

    /**
     * Retrieves the value of the 'NEXT_ROOT_BAN' field in the FML buffer.
     *
     * @return Value of 'NEXT_ROOT_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NEXT_ROOT_BAN() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[103].getValue(0));
    }

    /**
     * Retrieves the value of the 'PARTITION_ROOT_BAN' field in the FML buffer.
     *
     * @return Value of 'PARTITION_ROOT_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PARTITION_ROOT_BAN() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[104].getValue(0));
    }

    /**
     * Retrieves the value of the 'CYCLE_FREQUENCY' field in the FML buffer.
     *
     * @return Value of 'CYCLE_FREQUENCY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CYCLE_FREQUENCY() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[105].getValue(0)));
    }

    /**
     * Retrieves the value of the 'CYCLE_FIRST_BILL_MONTH' field in the FML buffer.
     *
     * @return Value of 'CYCLE_FIRST_BILL_MONTH' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CYCLE_FIRST_BILL_MONTH() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[106].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_DUE_DAY' field in the FML buffer.
     *
     * @return Value of 'BL_DUE_DAY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BL_DUE_DAY() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[107].getValue(0)));
    }

    /**
     * Retrieves the value of the 'VIP_IND' field in the FML buffer.
     *
     * @return Value of 'VIP_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_VIP_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[108].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BLACK_LISTED_IND' field in the FML buffer.
     *
     * @return Value of 'BLACK_LISTED_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BLACK_LISTED_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[109].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BL_PRT_CATEGORY' field in the FML buffer.
     *
     * @return Value of 'BL_PRT_CATEGORY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_PRT_CATEGORY() throws FMLManipulationException {
        return ((String) this.fmlBuffer[110].getValue(0));
    }

    /**
     * Retrieves the value of the 'CS_DEF_PRODUCT_TYPE' field in the FML buffer.
     *
     * @return Value of 'CS_DEF_PRODUCT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CS_DEF_PRODUCT_TYPE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[111].getValue(0));
    }

    /**
     * Retrieves the value of the 'ORG_CODE' field in the FML buffer.
     *
     * @return Value of 'ORG_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ORG_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[112].getValue(0));
    }

    /**
     * Retrieves the value of the 'BL_HIER_BAN_IND' field in the FML buffer.
     *
     * @return Value of 'BL_HIER_BAN_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BL_HIER_BAN_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[113].getValue(0)));
    }

    /**
     * Retrieves the value of the 'PAYMENT_METHOD' field in the FML buffer.
     *
     * @return Value of 'PAYMENT_METHOD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAYMENT_METHOD() throws FMLManipulationException {
        return ((String) this.fmlBuffer[114].getValue(0));
    }

    /**
     * Retrieves the value of the 'PAYMENT_SUB_METHOD' field in the FML buffer.
     *
     * @return Value of 'PAYMENT_SUB_METHOD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAYMENT_SUB_METHOD() throws FMLManipulationException {
        return ((String) this.fmlBuffer[115].getValue(0));
    }

    /**
     * Retrieves the value of the 'OLD_ACCOUNT_ID' field in the FML buffer.
     *
     * @return Value of 'OLD_ACCOUNT_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_OLD_ACCOUNT_ID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[116].getValue(0));
    }

    /**
     * Retrieves the value of the 'CARRY_OVER_BILL' field in the FML buffer.
     *
     * @return Value of 'CARRY_OVER_BILL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CARRY_OVER_BILL() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[117].getValue(0)));
    }

    /**
     * Retrieves the value of the 'HIDE_PHONE_DIGITS_IND' field in the FML buffer.
     *
     * @return Value of 'HIDE_PHONE_DIGITS_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_HIDE_PHONE_DIGITS_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[118].getValue(0)));
    }

    /**
     * Retrieves the value of the 'SEC_DEPARTMENT' field in the FML buffer.
     *
     * @return Value of 'SEC_DEPARTMENT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SEC_DEPARTMENT() throws FMLManipulationException {
        return ((String) this.fmlBuffer[119].getValue(0));
    }

    /**
     * Retrieves the value of the 'NEXT_CONF_ROOT_BAN' field in the FML buffer.
     *
     * @return Value of 'NEXT_CONF_ROOT_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NEXT_CONF_ROOT_BAN() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[120].getValue(0));
    }

    /**
     * Retrieves the value of the 'EDI_LOCATION_NUMBER' field in the FML buffer.
     *
     * @return Value of 'EDI_LOCATION_NUMBER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_EDI_LOCATION_NUMBER() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[121].getValue(0));
    }

    /**
     * Retrieves the value of the 'ALLOW_ADVERTISING_IND' field in the FML buffer.
     *
     * @return Value of 'ALLOW_ADVERTISING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ALLOW_ADVERTISING_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[122].getValue(0)));
    }

    /**
     * Retrieves the value of the 'AGENCY_REF_NO' field in the FML buffer.
     *
     * @return Value of 'AGENCY_REF_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_AGENCY_REF_NO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[123].getValue(0));
    }

    /**
     * Retrieves the value of the 'COL_AGENCY_CONF_DT' field in the FML buffer.
     *
     * @return Value of 'COL_AGENCY_CONF_DT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_AGENCY_CONF_DT() throws FMLManipulationException {
        return ((String) this.fmlBuffer[124].getValue(0));
    }

    /**
     * Retrieves the value of the 'BAN_GROUP_NO' field in the FML buffer.
     *
     * @return Value of 'BAN_GROUP_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BAN_GROUP_NO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[125].getValue(0));
    }

    /**
     * Retrieves the value of the 'CAAP_TYPE' field in the FML buffer.
     *
     * @return Value of 'CAAP_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CAAP_TYPE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[126].getValue(0)));
    }

    /**
     * Retrieves the value of the 'COL_AGNCY_CODE' field in the FML buffer.
     *
     * @return Value of 'COL_AGNCY_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COL_AGNCY_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[127].getValue(0));
    }

    /**
     * Retrieves the value of the 'INVOICE_FEE_WAIVE_IND' field in the FML buffer.
     *
     * @return Value of 'INVOICE_FEE_WAIVE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_INVOICE_FEE_WAIVE_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[128].getValue(0)));
    }

    /**
     * Retrieves the value of the 'PRD_ZERO_RATE_BILL' field in the FML buffer.
     *
     * @return Value of 'PRD_ZERO_RATE_BILL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PRD_ZERO_RATE_BILL() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[129].getValue(0)));
    }

    /**
     * Retrieves the value of the 'ROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'ROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[130].getValue(0));
    }

    /**
     * Retrieves the value of the 'LINK_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LINK_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[131].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'LINK_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[131].getCount());
    }

    /**
     * Retrieves the value of the 'LINK_BAN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LINK_BAN(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[132].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'LINK_BAN' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_BAN_size() throws FMLManipulationException {
        return (this.fmlBuffer[132].getCount());
    }

    /**
     * Retrieves the value of the 'LINK_SUBSCRIBER' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_SUBSCRIBER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LINK_SUBSCRIBER(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[133].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'LINK_SUBSCRIBER' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_SUBSCRIBER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_SUBSCRIBER_size() throws FMLManipulationException {
        return (this.fmlBuffer[133].getCount());
    }

    /**
     * Retrieves the value of the 'LINK_ROW_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_ROW_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LINK_ROW_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[134].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'LINK_ROW_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_ROW_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_ROW_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[134].getCount());
    }

    /**
     * Retrieves the value of the 'LINK_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LINK_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[135].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'LINK_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[135].getCount());
    }

    /**
     * Retrieves the value of the 'LNKRECCUSTOMER_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LNKRECCUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LNKRECCUSTOMER_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[136].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'LNKRECCUSTOMER_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'LNKRECCUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LNKRECCUSTOMER_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[136].getCount());
    }

    /**
     * Retrieves the value of the 'LNKRECBAN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LNKRECBAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LNKRECBAN(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[137].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'LNKRECBAN' field in the FML buffer.
     *
     * @return Number of values defined for 'LNKRECBAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LNKRECBAN_size() throws FMLManipulationException {
        return (this.fmlBuffer[137].getCount());
    }

    /**
     * Retrieves the value of the 'SUBSCRIBER_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'SUBSCRIBER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUBSCRIBER_NO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[138].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'SUBSCRIBER_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'SUBSCRIBER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SUBSCRIBER_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[138].getCount());
    }

    /**
     * Retrieves the value of the 'LINK_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LINK_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[139].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'LINK_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[139].getCount());
    }

    /**
     * Retrieves the value of the 'EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[140].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'EFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_EFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[140].getCount());
    }

    /**
     * Retrieves the value of the 'FOREIGN_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'FOREIGN_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_FOREIGN_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[141].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'FOREIGN_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'FOREIGN_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FOREIGN_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[141].getCount());
    }

    /**
     * Retrieves the value of the 'BILLING_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'BILLING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BILLING_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[142].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'BILLING_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'BILLING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_BILLING_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[142].getCount());
    }

    /**
     * Retrieves the value of the 'MAILING_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'MAILING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MAILING_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[143].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'MAILING_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'MAILING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MAILING_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[143].getCount());
    }

    /**
     * Retrieves the value of the 'USER_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'USER_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_USER_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[144].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'USER_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'USER_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_USER_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[144].getCount());
    }

    /**
     * Retrieves the value of the 'LINK_BILLING_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_BILLING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LINK_BILLING_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[145].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'LINK_BILLING_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_BILLING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_BILLING_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[145].getCount());
    }

    /**
     * Retrieves the value of the 'LINK_MAILING_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_MAILING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LINK_MAILING_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[146].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'LINK_MAILING_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_MAILING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_MAILING_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[146].getCount());
    }

    /**
     * Retrieves the value of the 'LINK_USER_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_USER_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LINK_USER_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[147].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'LINK_USER_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_USER_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_USER_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[147].getCount());
    }

    /**
     * Retrieves the value of the 'NM_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NM_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NM_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[148].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'NM_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'NM_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NM_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[148].getCount());
    }

    /**
     * Retrieves the value of the 'NM_UP_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NM_UP_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NM_UP_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[149].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'NM_UP_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'NM_UP_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NM_UP_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[149].getCount());
    }

    /**
     * Retrieves the value of the 'NM_EXPIRE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NM_EXPIRE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NM_EXPIRE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[150].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NM_EXPIRE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'NM_EXPIRE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NM_EXPIRE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[150].getCount());
    }

    /**
     * Retrieves the value of the 'NAMERECROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAMERECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NAMERECROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[151].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NAMERECROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'NAMERECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAMERECROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[151].getCount());
    }

    /**
     * Retrieves the value of the 'NAME_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAME_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NAME_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[152].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NAME_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'NAME_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAME_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[152].getCount());
    }

    /**
     * Retrieves the value of the 'NAMERECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAMERECSYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NAMERECSYS_CREATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[153].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NAMERECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'NAMERECSYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAMERECSYS_CREATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[153].getCount());
    }

    /**
     * Retrieves the value of the 'NAMERECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAMERECSYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NAMERECSYS_UPDATE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[154].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NAMERECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'NAMERECSYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAMERECSYS_UPDATE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[154].getCount());
    }

    /**
     * Retrieves the value of the 'NAMERECOPERATOR_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAMERECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NAMERECOPERATOR_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[155].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NAMERECOPERATOR_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'NAMERECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAMERECOPERATOR_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[155].getCount());
    }

    /**
     * Retrieves the value of the 'NAMERECAPPLICATION_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAMERECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NAMERECAPPLICATION_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[156].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NAMERECAPPLICATION_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'NAMERECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAMERECAPPLICATION_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[156].getCount());
    }

    /**
     * Retrieves the value of the 'NAMERECDL_SERVICE_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAMERECDL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NAMERECDL_SERVICE_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[157].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NAMERECDL_SERVICE_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'NAMERECDL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAMERECDL_SERVICE_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[157].getCount());
    }

    /**
     * Retrieves the value of the 'NAMERECDL_UPDATE_STAMP' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAMERECDL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NAMERECDL_UPDATE_STAMP(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[158].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'NAMERECDL_UPDATE_STAMP' field in the FML buffer.
     *
     * @return Number of values defined for 'NAMERECDL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAMERECDL_UPDATE_STAMP_size() throws FMLManipulationException {
        return (this.fmlBuffer[158].getCount());
    }

    /**
     * Retrieves the value of the 'CONTROL_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'CONTROL_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CONTROL_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[159].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'CONTROL_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'CONTROL_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CONTROL_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[159].getCount());
    }

    /**
     * Retrieves the value of the 'LAST_BUSINESS_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LAST_BUSINESS_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LAST_BUSINESS_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[160].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'LAST_BUSINESS_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'LAST_BUSINESS_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LAST_BUSINESS_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[160].getCount());
    }

    /**
     * Retrieves the value of the 'FIRST_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'FIRST_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FIRST_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[161].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'FIRST_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'FIRST_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FIRST_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[161].getCount());
    }

    /**
     * Retrieves the value of the 'ADDITIONAL_TITLE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDITIONAL_TITLE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADDITIONAL_TITLE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[162].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADDITIONAL_TITLE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDITIONAL_TITLE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDITIONAL_TITLE_size() throws FMLManipulationException {
        return (this.fmlBuffer[162].getCount());
    }

    /**
     * Retrieves the value of the 'NAME_FORMAT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAME_FORMAT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NAME_FORMAT(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[163].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'NAME_FORMAT' field in the FML buffer.
     *
     * @return Number of values defined for 'NAME_FORMAT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAME_FORMAT_size() throws FMLManipulationException {
        return (this.fmlBuffer[163].getCount());
    }

    /**
     * Retrieves the value of the 'BIRTH_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'BIRTH_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BIRTH_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[164].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'BIRTH_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'BIRTH_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_BIRTH_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[164].getCount());
    }

    /**
     * Retrieves the value of the 'IDENTIFY' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'IDENTIFY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_IDENTIFY(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[165].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'IDENTIFY' field in the FML buffer.
     *
     * @return Number of values defined for 'IDENTIFY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_IDENTIFY_size() throws FMLManipulationException {
        return (this.fmlBuffer[165].getCount());
    }

    /**
     * Retrieves the value of the 'ID_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ID_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ID_TYPE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[166].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ID_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'ID_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ID_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[166].getCount());
    }

    /**
     * Retrieves the value of the 'COMP_REG_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'COMP_REG_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COMP_REG_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[167].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'COMP_REG_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'COMP_REG_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COMP_REG_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[167].getCount());
    }

    /**
     * Retrieves the value of the 'KOB' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'KOB' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_KOB(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[168].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'KOB' field in the FML buffer.
     *
     * @return Number of values defined for 'KOB' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_KOB_size() throws FMLManipulationException {
        return (this.fmlBuffer[168].getCount());
    }

    /**
     * Retrieves the value of the 'MIDDLE_INITIAL' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'MIDDLE_INITIAL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MIDDLE_INITIAL(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[169].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'MIDDLE_INITIAL' field in the FML buffer.
     *
     * @return Number of values defined for 'MIDDLE_INITIAL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MIDDLE_INITIAL_size() throws FMLManipulationException {
        return (this.fmlBuffer[169].getCount());
    }

    /**
     * Retrieves the value of the 'TELEMARKET_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'TELEMARKET_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_TELEMARKET_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[170].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'TELEMARKET_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'TELEMARKET_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_TELEMARKET_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[170].getCount());
    }

    /**
     * Retrieves the value of the 'NAMERECCONV_RUN_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAMERECCONV_RUN_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NAMERECCONV_RUN_NO(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[171].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'NAMERECCONV_RUN_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'NAMERECCONV_RUN_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAMERECCONV_RUN_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[171].getCount());
    }

    /**
     * Retrieves the value of the 'NAME_TITLE_SALUTATION' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAME_TITLE_SALUTATION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NAME_TITLE_SALUTATION(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[172].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NAME_TITLE_SALUTATION' field in the FML buffer.
     *
     * @return Number of values defined for 'NAME_TITLE_SALUTATION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAME_TITLE_SALUTATION_size() throws FMLManipulationException {
        return (this.fmlBuffer[172].getCount());
    }

    /**
     * Retrieves the value of the 'NATIONALITY_CD' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NATIONALITY_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NATIONALITY_CD(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[173].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NATIONALITY_CD' field in the FML buffer.
     *
     * @return Number of values defined for 'NATIONALITY_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NATIONALITY_CD_size() throws FMLManipulationException {
        return (this.fmlBuffer[173].getCount());
    }

    /**
     * Retrieves the value of the 'GENDER' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'GENDER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_GENDER(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[174].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'GENDER' field in the FML buffer.
     *
     * @return Number of values defined for 'GENDER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_GENDER_size() throws FMLManipulationException {
        return (this.fmlBuffer[174].getCount());
    }

    /**
     * Retrieves the value of the 'MARITAL_STATUS' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'MARITAL_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MARITAL_STATUS(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[175].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'MARITAL_STATUS' field in the FML buffer.
     *
     * @return Number of values defined for 'MARITAL_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MARITAL_STATUS_size() throws FMLManipulationException {
        return (this.fmlBuffer[175].getCount());
    }

    /**
     * Retrieves the value of the 'ROLE_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ROLE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ROLE_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[176].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'ROLE_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'ROLE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ROLE_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[176].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[177].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'ADR_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[177].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_UP_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_UP_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_UP_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[178].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'ADR_UP_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_UP_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_UP_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[178].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_EXPIRE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_EXPIRE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_EXPIRE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[179].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_EXPIRE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_EXPIRE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_EXPIRE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[179].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESSRECROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESSRECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADDRESSRECROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[180].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADDRESSRECROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESSRECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESSRECROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[180].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESS_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESS_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ADDRESS_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[181].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADDRESS_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESS_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESS_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[181].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESSRECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESSRECSYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADDRESSRECSYS_CREATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[182].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADDRESSRECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESSRECSYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESSRECSYS_CREATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[182].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESSRECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESSRECSYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADDRESSRECSYS_UPDATE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[183].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADDRESSRECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESSRECSYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESSRECSYS_UPDATE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[183].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESSRECOPERATOR_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESSRECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ADDRESSRECOPERATOR_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[184].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADDRESSRECOPERATOR_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESSRECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESSRECOPERATOR_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[184].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESSRECAPPLICATION_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESSRECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADDRESSRECAPPLICATION_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[185].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADDRESSRECAPPLICATION_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESSRECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESSRECAPPLICATION_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[185].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESSRECDL_SERVICE_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESSRECDL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADDRESSRECDL_SERVICE_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[186].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADDRESSRECDL_SERVICE_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESSRECDL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESSRECDL_SERVICE_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[186].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESSRECDL_UPDATE_STAMP' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESSRECDL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ADDRESSRECDL_UPDATE_STAMP(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[187].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'ADDRESSRECDL_UPDATE_STAMP' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESSRECDL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESSRECDL_UPDATE_STAMP_size() throws FMLManipulationException {
        return (this.fmlBuffer[187].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[188].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'ADR_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[188].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_STATUS' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_STATUS(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[189].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'ADR_STATUS' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_STATUS_size() throws FMLManipulationException {
        return (this.fmlBuffer[189].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_STATUS_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_STATUS_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_STATUS_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[190].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_STATUS_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_STATUS_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_STATUS_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[190].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_SECONDARY_LN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_SECONDARY_LN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_SECONDARY_LN(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[191].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_SECONDARY_LN' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_SECONDARY_LN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_SECONDARY_LN_size() throws FMLManipulationException {
        return (this.fmlBuffer[191].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_PRIMARY_LN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_PRIMARY_LN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_PRIMARY_LN(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[192].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_PRIMARY_LN' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_PRIMARY_LN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_PRIMARY_LN_size() throws FMLManipulationException {
        return (this.fmlBuffer[192].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_CITY' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_CITY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_CITY(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[193].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_CITY' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_CITY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_CITY_size() throws FMLManipulationException {
        return (this.fmlBuffer[193].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_ZIP' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_ZIP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_ZIP(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[194].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_ZIP' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_ZIP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_ZIP_size() throws FMLManipulationException {
        return (this.fmlBuffer[194].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_HOUSE_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_HOUSE_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_HOUSE_NO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[195].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_HOUSE_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_HOUSE_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_HOUSE_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[195].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_STREET_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_STREET_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_STREET_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[196].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_STREET_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_STREET_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_STREET_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[196].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_DIRECTION' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_DIRECTION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_DIRECTION(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[197].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_DIRECTION' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_DIRECTION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_DIRECTION_size() throws FMLManipulationException {
        return (this.fmlBuffer[197].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_POB' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_POB' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_POB(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[198].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_POB' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_POB' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_POB_size() throws FMLManipulationException {
        return (this.fmlBuffer[198].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_COUNTRY' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_COUNTRY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_COUNTRY(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[199].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_COUNTRY' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_COUNTRY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_COUNTRY_size() throws FMLManipulationException {
        return (this.fmlBuffer[199].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_HOUSE_LETTER' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_HOUSE_LETTER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_HOUSE_LETTER(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[200].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_HOUSE_LETTER' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_HOUSE_LETTER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_HOUSE_LETTER_size() throws FMLManipulationException {
        return (this.fmlBuffer[200].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_STORY' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_STORY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_STORY(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[201].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_STORY' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_STORY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_STORY_size() throws FMLManipulationException {
        return (this.fmlBuffer[201].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_DOOR_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_DOOR_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_DOOR_NO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[202].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_DOOR_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_DOOR_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_DOOR_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[202].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_EMAIL' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_EMAIL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_EMAIL(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[203].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_EMAIL' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_EMAIL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_EMAIL_size() throws FMLManipulationException {
        return (this.fmlBuffer[203].getCount());
    }

    /**
     * Retrieves the value of the 'SINCE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'SINCE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SINCE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[204].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'SINCE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'SINCE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SINCE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[204].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_DISTRICT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_DISTRICT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_DISTRICT(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[205].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_DISTRICT' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_DISTRICT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_DISTRICT_size() throws FMLManipulationException {
        return (this.fmlBuffer[205].getCount());
    }

    /**
     * Retrieves the value of the 'CO_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'CO_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CO_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[206].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'CO_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'CO_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CO_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[206].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESSRECCONV_RUN_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESSRECCONV_RUN_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ADDRESSRECCONV_RUN_NO(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[207].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'ADDRESSRECCONV_RUN_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESSRECCONV_RUN_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESSRECCONV_RUN_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[207].getCount());
    }

    /**
     * Retrieves the value of the 'ACCOMMODATION_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ACCOMMODATION_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACCOMMODATION_TYPE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[208].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ACCOMMODATION_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'ACCOMMODATION_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACCOMMODATION_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[208].getCount());
    }

    /**
     * Retrieves the value of the 'COUNTY_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'COUNTY_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COUNTY_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[209].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'COUNTY_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'COUNTY_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COUNTY_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[209].getCount());
    }

    /**
     * Retrieves the value of the 'COMMUNITY_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'COMMUNITY_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COMMUNITY_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[210].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'COMMUNITY_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'COMMUNITY_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COMMUNITY_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[210].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_CO_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_CO_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_CO_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[211].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_CO_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_CO_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_CO_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[211].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_HOUSE_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_HOUSE_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_HOUSE_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[212].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_HOUSE_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_HOUSE_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_HOUSE_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[212].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P1' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P1' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P1(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[213].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_P1' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P1' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P1_size() throws FMLManipulationException {
        return (this.fmlBuffer[213].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P2' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P2' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P2(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[214].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_P2' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P2' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P2_size() throws FMLManipulationException {
        return (this.fmlBuffer[214].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P3' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P3' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P3(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[215].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_P3' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P3' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P3_size() throws FMLManipulationException {
        return (this.fmlBuffer[215].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P4' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P4' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P4(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[216].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_P4' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P4' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P4_size() throws FMLManipulationException {
        return (this.fmlBuffer[216].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P5' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P5' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P5(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[217].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_P5' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P5' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P5_size() throws FMLManipulationException {
        return (this.fmlBuffer[217].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P6' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P6' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P6(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[218].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_P6' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P6' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P6_size() throws FMLManipulationException {
        return (this.fmlBuffer[218].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P7' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P7' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P7(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[219].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_P7' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P7' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P7_size() throws FMLManipulationException {
        return (this.fmlBuffer[219].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P8' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P8' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P8(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[220].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_P8' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P8' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P8_size() throws FMLManipulationException {
        return (this.fmlBuffer[220].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P9' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P9' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P9(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[221].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_P9' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P9' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P9_size() throws FMLManipulationException {
        return (this.fmlBuffer[221].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P10' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P10' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P10(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[222].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_P10' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P10' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P10_size() throws FMLManipulationException {
        return (this.fmlBuffer[222].getCount());
    }

    /**
     * Retrieves the value of the 'PSVBLPRMBUFROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'PSVBLPRMBUFROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PSVBLPRMBUFROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[223].getValue(0));
    }

    /**
     * Retrieves the value of the 'BPMODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'BPMODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BPMODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[224].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'BPMODE' field in the FML buffer.
     *
     * @return Number of values defined for 'BPMODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_BPMODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[224].getCount());
    }

    /**
     * Retrieves the value of the 'BPSEQNO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'BPSEQNO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BPSEQNO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[225].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'BPSEQNO' field in the FML buffer.
     *
     * @return Number of values defined for 'BPSEQNO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_BPSEQNO_size() throws FMLManipulationException {
        return (this.fmlBuffer[225].getCount());
    }

    /**
     * Retrieves the value of the 'BPEFFDATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'BPEFFDATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BPEFFDATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[226].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'BPEFFDATE' field in the FML buffer.
     *
     * @return Number of values defined for 'BPEFFDATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_BPEFFDATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[226].getCount());
    }

    /**
     * Retrieves the value of the 'BPEXPDATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'BPEXPDATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BPEXPDATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[227].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'BPEXPDATE' field in the FML buffer.
     *
     * @return Number of values defined for 'BPEXPDATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_BPEXPDATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[227].getCount());
    }

    /**
     * Retrieves the value of the 'BPFORMAT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'BPFORMAT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BPFORMAT(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[228].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'BPFORMAT' field in the FML buffer.
     *
     * @return Number of values defined for 'BPFORMAT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_BPFORMAT_size() throws FMLManipulationException {
        return (this.fmlBuffer[228].getCount());
    }

    /**
     * Retrieves the value of the 'BPMEDIA' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'BPMEDIA' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BPMEDIA(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[229].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'BPMEDIA' field in the FML buffer.
     *
     * @return Number of values defined for 'BPMEDIA' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_BPMEDIA_size() throws FMLManipulationException {
        return (this.fmlBuffer[229].getCount());
    }

    /**
     * Retrieves the value of the 'BPPRINTCATEGORY' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'BPPRINTCATEGORY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BPPRINTCATEGORY(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[230].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'BPPRINTCATEGORY' field in the FML buffer.
     *
     * @return Number of values defined for 'BPPRINTCATEGORY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_BPPRINTCATEGORY_size() throws FMLManipulationException {
        return (this.fmlBuffer[230].getCount());
    }

    /**
     * Retrieves the value of the 'BPNOOFCOPIES' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'BPNOOFCOPIES' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BPNOOFCOPIES(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[231].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'BPNOOFCOPIES' field in the FML buffer.
     *
     * @return Number of values defined for 'BPNOOFCOPIES' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_BPNOOFCOPIES_size() throws FMLManipulationException {
        return (this.fmlBuffer[231].getCount());
    }

    /**
     * Retrieves the value of the 'BP_LANGUAGE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'BP_LANGUAGE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BP_LANGUAGE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[232].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'BP_LANGUAGE' field in the FML buffer.
     *
     * @return Number of values defined for 'BP_LANGUAGE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_BP_LANGUAGE_size() throws FMLManipulationException {
        return (this.fmlBuffer[232].getCount());
    }

    /**
     * Retrieves the value of the 'BP_CALL_DETAILS_MEDIA' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'BP_CALL_DETAILS_MEDIA' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BP_CALL_DETAILS_MEDIA(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[233].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'BP_CALL_DETAILS_MEDIA' field in the FML buffer.
     *
     * @return Number of values defined for 'BP_CALL_DETAILS_MEDIA' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_BP_CALL_DETAILS_MEDIA_size() throws FMLManipulationException {
        return (this.fmlBuffer[233].getCount());
    }
}