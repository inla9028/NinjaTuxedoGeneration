/*
 * CsApiBanInput.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service.parameters;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;

/**
 * @author  Ninja
 *
 * CsApiBanInput class.
 */
public class CsApiBanInput extends ServiceInput {
    // Indicates whether the default values has been loaded from the DB or not
    private static Boolean defaultValuesPopulated = new Boolean(false);
    // Holds default values for fields in FML buffer
    private static String defaultValues[] = null;

    /**
     * Creates a new instance of CsApiBanInput
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsApiBanInput() throws EnvironmentException, FMLManipulationException {
        // Initialize FML buffer
        fmlBuffer = new FmlField[500];

        // Get default values from DB
        synchronized (this.defaultValuesPopulated) {
            if (this.defaultValuesPopulated.equals(Boolean.FALSE)) {
                defaultValues = getDefaultValues("csApiBan", 500);
                this.defaultValuesPopulated = new Boolean(true);
            }
        }

        this.fmlBuffer[0] = new FmlField("GENERATION", FmlField.TYPE_INTEGER, -1, defaultValues[0], 0, 1);
        this.fmlBuffer[1] = new FmlField("DIRECTIVE", FmlField.TYPE_INTEGER, -1, defaultValues[1], 1, 1);
        this.fmlBuffer[2] = new FmlField("FIRST_DIRECTIVE", FmlField.TYPE_INTEGER, -1, defaultValues[2], 2, 1);
        this.fmlBuffer[3] = new FmlField("SECOND_DIRECTIVE", FmlField.TYPE_INTEGER, -1, defaultValues[3], 3, 1);
        this.fmlBuffer[4] = new FmlField("OPERATOR_ID", FmlField.TYPE_INTEGER, -1, defaultValues[4], 4, 1);
        this.fmlBuffer[5] = new FmlField("APPLICATION_ID", FmlField.TYPE_STRING, 7, defaultValues[5], 5, 1);
        this.fmlBuffer[6] = new FmlField("TRANSACTION_MODE", FmlField.TYPE_BYTE, -1, defaultValues[6], 6, 1);
        this.fmlBuffer[7] = new FmlField("RUN_DATE", FmlField.TYPE_STRING, 9, defaultValues[7], 7, 1);
        this.fmlBuffer[8] = new FmlField("MARKET_CODE", FmlField.TYPE_STRING, 4, defaultValues[8], 8, 1);
        this.fmlBuffer[9] = new FmlField("SVC_STATUS", FmlField.TYPE_BYTE, -1, defaultValues[9], 9, 1);
        this.fmlBuffer[10] = new FmlField("LAST_UPDATE_DATE", FmlField.TYPE_STRING, 15, defaultValues[10], 10, 1);
        this.fmlBuffer[11] = new FmlField("LAST_UPDATE_STAMP", FmlField.TYPE_SHORT, -1, defaultValues[11], 11, 1);
        this.fmlBuffer[12] = new FmlField("ENV_CODE", FmlField.TYPE_STRING, 11, defaultValues[12], 12, 1);
        this.fmlBuffer[13] = new FmlField("SESSION_ID", FmlField.TYPE_INTEGER, -1, defaultValues[13], 13, 1);
        this.fmlBuffer[14] = new FmlField("ONLINE_TRX_NO", FmlField.TYPE_INTEGER, -1, defaultValues[14], 14, 1);
        this.fmlBuffer[15] = new FmlField("GROUP_TRX_ID", FmlField.TYPE_INTEGER, -1, defaultValues[15], 15, 1);
        this.fmlBuffer[16] = new FmlField("ROWID", FmlField.TYPE_STRING, 19, defaultValues[16], 16, 1);
        this.fmlBuffer[17] = new FmlField("CUSTOMER_ID", FmlField.TYPE_INTEGER, -1, defaultValues[17], 17, 1);
        this.fmlBuffer[18] = new FmlField("SYS_CREATION_DATE", FmlField.TYPE_STRING, 15, defaultValues[18], 18, 1);
        this.fmlBuffer[19] = new FmlField("SYS_UPDATE_DATE", FmlField.TYPE_STRING, 15, defaultValues[19], 19, 1);
        this.fmlBuffer[20] = new FmlField("PBANCUSTRECOPERATOR_ID", FmlField.TYPE_INTEGER, -1, defaultValues[20], 20, 1);
        this.fmlBuffer[21] = new FmlField("PBANCUSTRECAPPLICATION_ID", FmlField.TYPE_STRING, 7, defaultValues[21], 21, 1);
        this.fmlBuffer[22] = new FmlField("DL_SERVICE_CODE", FmlField.TYPE_STRING, 6, defaultValues[22], 22, 1);
        this.fmlBuffer[23] = new FmlField("DL_UPDATE_STAMP", FmlField.TYPE_SHORT, -1, defaultValues[23], 23, 1);
        this.fmlBuffer[24] = new FmlField("CUSTOMER_TELNO", FmlField.TYPE_STRING, 21, defaultValues[24], 24, 1);
        this.fmlBuffer[25] = new FmlField("CUSTOMER_FAX", FmlField.TYPE_STRING, 21, defaultValues[25], 25, 1);
        this.fmlBuffer[26] = new FmlField("WORK_TELNO", FmlField.TYPE_STRING, 21, defaultValues[26], 26, 1);
        this.fmlBuffer[27] = new FmlField("WORK_FAX", FmlField.TYPE_STRING, 21, defaultValues[27], 27, 1);
        this.fmlBuffer[28] = new FmlField("DEALER_CODE", FmlField.TYPE_STRING, 6, defaultValues[28], 28, 1);
        this.fmlBuffer[29] = new FmlField("SALES_AGENT", FmlField.TYPE_STRING, 6, defaultValues[29], 29, 1);
        this.fmlBuffer[30] = new FmlField("MARKET_ID", FmlField.TYPE_STRING, 4, defaultValues[30], 30, 1);
        this.fmlBuffer[31] = new FmlField("ACC_PASSWORD", FmlField.TYPE_STRING, 21, defaultValues[31], 31, 1);
        this.fmlBuffer[32] = new FmlField("VERIFIED_DATE", FmlField.TYPE_STRING, 9, defaultValues[32], 32, 1);
        this.fmlBuffer[33] = new FmlField("CONV_CUST_ID", FmlField.TYPE_STRING, 11, defaultValues[33], 33, 1);
        this.fmlBuffer[34] = new FmlField("BUSINESS_ENTITY", FmlField.TYPE_STRING, 4, defaultValues[34], 34, 1);
        this.fmlBuffer[35] = new FmlField("LOCATION", FmlField.TYPE_STRING, 5, defaultValues[35], 35, 1);
        this.fmlBuffer[36] = new FmlField("CONV_RUN_NO", FmlField.TYPE_SHORT, -1, defaultValues[36], 36, 1);
        this.fmlBuffer[37] = new FmlField("AGE_VERIFICATION_STATUS", FmlField.TYPE_BYTE, -1, defaultValues[37], 37, 1);
        this.fmlBuffer[38] = new FmlField("EMPLOYMENT_TYPE", FmlField.TYPE_STRING, 5, defaultValues[38], 38, 1);
        this.fmlBuffer[39] = new FmlField("EMPLOYMENT_DATE", FmlField.TYPE_STRING, 9, defaultValues[39], 39, 1);
        this.fmlBuffer[40] = new FmlField("OPEN_BANK_ACCOUNT_DATE", FmlField.TYPE_STRING, 9, defaultValues[40], 40, 1);
        this.fmlBuffer[41] = new FmlField("E_POST", FmlField.TYPE_STRING, 151, defaultValues[41], 41, 1);
        this.fmlBuffer[42] = new FmlField("PBANRECROWID", FmlField.TYPE_STRING, 19, defaultValues[42], 42, 1);
        this.fmlBuffer[43] = new FmlField("BAN", FmlField.TYPE_INTEGER, -1, defaultValues[43], 43, 1);
        this.fmlBuffer[44] = new FmlField("PBANRECSYS_CREATION_DATE", FmlField.TYPE_STRING, 15, defaultValues[44], 44, 1);
        this.fmlBuffer[45] = new FmlField("PBANRECSYS_UPDATE_DATE", FmlField.TYPE_STRING, 15, defaultValues[45], 45, 1);
        this.fmlBuffer[46] = new FmlField("PBANRECOPERATOR_ID", FmlField.TYPE_INTEGER, -1, defaultValues[46], 46, 1);
        this.fmlBuffer[47] = new FmlField("PBANRECAPPLICATION_ID", FmlField.TYPE_STRING, 7, defaultValues[47], 47, 1);
        this.fmlBuffer[48] = new FmlField("PBANRECCUSTOMER_ID", FmlField.TYPE_INTEGER, -1, defaultValues[48], 48, 1);
        this.fmlBuffer[49] = new FmlField("START_SERVICE_DATE", FmlField.TYPE_STRING, 9, defaultValues[49], 49, 1);
        this.fmlBuffer[50] = new FmlField("COL_DELINQ_STATUS", FmlField.TYPE_BYTE, -1, defaultValues[50], 50, 1);
        this.fmlBuffer[51] = new FmlField("BAN_STATUS", FmlField.TYPE_BYTE, -1, defaultValues[51], 51, 1);
        this.fmlBuffer[52] = new FmlField("STATUS_LAST_DATE", FmlField.TYPE_STRING, 9, defaultValues[52], 52, 1);
        this.fmlBuffer[53] = new FmlField("STATUS_ACTV_CODE", FmlField.TYPE_STRING, 4, defaultValues[53], 53, 1);
        this.fmlBuffer[54] = new FmlField("STATUS_ACTV_RSN_CODE", FmlField.TYPE_STRING, 5, defaultValues[54], 54, 1);
        this.fmlBuffer[55] = new FmlField("BILL_CYCLE", FmlField.TYPE_SHORT, -1, defaultValues[55], 55, 1);
        this.fmlBuffer[56] = new FmlField("AR_BALANCE", FmlField.TYPE_DOUBLE, -1, defaultValues[56], 56, 1);
        this.fmlBuffer[57] = new FmlField("BL_CUR_BILL_SEQ_NO", FmlField.TYPE_SHORT, -1, defaultValues[57], 57, 1);
        this.fmlBuffer[58] = new FmlField("BL_LAST_RG_CYC_DATE", FmlField.TYPE_STRING, 9, defaultValues[58], 58, 1);
        this.fmlBuffer[59] = new FmlField("BL_COMPLT_STATUS", FmlField.TYPE_BYTE, -1, defaultValues[59], 59, 1);
        this.fmlBuffer[60] = new FmlField("BL_SPECIAL_CYCLE", FmlField.TYPE_SHORT, -1, defaultValues[60], 60, 1);
        this.fmlBuffer[61] = new FmlField("ACCOUNT_SUB_TYPE", FmlField.TYPE_STRING, 3, defaultValues[61], 61, 1);
        this.fmlBuffer[62] = new FmlField("BL_MAN_HNDL_RSN", FmlField.TYPE_STRING, 3, defaultValues[62], 62, 1);
        this.fmlBuffer[63] = new FmlField("BL_MAN_HNDL_EFF_DATE", FmlField.TYPE_STRING, 9, defaultValues[63], 63, 1);
        this.fmlBuffer[64] = new FmlField("BL_MAN_HNDL_EXP_DATE", FmlField.TYPE_STRING, 9, defaultValues[64], 64, 1);
        this.fmlBuffer[65] = new FmlField("BL_MAN_HNDL_REQ_OPID", FmlField.TYPE_INTEGER, -1, defaultValues[65], 65, 1);
        this.fmlBuffer[66] = new FmlField("BL_MAN_HNDL_BY_OPID", FmlField.TYPE_INTEGER, -1, defaultValues[66], 66, 1);
        this.fmlBuffer[67] = new FmlField("BL_REQ_ST_GRACE_PRD", FmlField.TYPE_STRING, 9, defaultValues[67], 67, 1);
        this.fmlBuffer[68] = new FmlField("BL_REQ_END_GRACE_PRD", FmlField.TYPE_STRING, 9, defaultValues[68], 68, 1);
        this.fmlBuffer[69] = new FmlField("BL_NEXT_CYCLE", FmlField.TYPE_SHORT, -1, defaultValues[69], 69, 1);
        this.fmlBuffer[70] = new FmlField("BL_NEXT_CYC_EFF_DATE", FmlField.TYPE_STRING, 9, defaultValues[70], 70, 1);
        this.fmlBuffer[71] = new FmlField("CS_MIN_REQ_CTNS", FmlField.TYPE_INTEGER, -1, defaultValues[71], 71, 1);
        this.fmlBuffer[72] = new FmlField("CS_SPEC_MEMO_IND", FmlField.TYPE_BYTE, -1, defaultValues[72], 72, 1);
        this.fmlBuffer[73] = new FmlField("AR_EXCPT_ACCT_IND", FmlField.TYPE_BYTE, -1, defaultValues[73], 73, 1);
        this.fmlBuffer[74] = new FmlField("CS_COM_START_DATE", FmlField.TYPE_STRING, 9, defaultValues[74], 74, 1);
        this.fmlBuffer[75] = new FmlField("CS_COM_END_DATE", FmlField.TYPE_STRING, 9, defaultValues[75], 75, 1);
        this.fmlBuffer[76] = new FmlField("CS_COM_REASON_CODE", FmlField.TYPE_STRING, 4, defaultValues[76], 76, 1);
        this.fmlBuffer[77] = new FmlField("CS_COM_ORIG_NO_MONTH", FmlField.TYPE_SHORT, -1, defaultValues[77], 77, 1);
        this.fmlBuffer[78] = new FmlField("AR_WO_IND", FmlField.TYPE_BYTE, -1, defaultValues[78], 78, 1);
        this.fmlBuffer[79] = new FmlField("ACCOUNT_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[79], 79, 1);
        this.fmlBuffer[80] = new FmlField("COL_ASSIGNED_COLL", FmlField.TYPE_STRING, 9, defaultValues[80], 80, 1);
        this.fmlBuffer[81] = new FmlField("BL_ZERO_BALANC_IND", FmlField.TYPE_BYTE, -1, defaultValues[81], 81, 1);
        this.fmlBuffer[82] = new FmlField("DEFAULT_SUB_MARKET", FmlField.TYPE_STRING, 4, defaultValues[82], 82, 1);
        this.fmlBuffer[83] = new FmlField("BL_DEF_MAILING_IND", FmlField.TYPE_BYTE, -1, defaultValues[83], 83, 1);
        this.fmlBuffer[84] = new FmlField("BL_BILL_PROD_IND", FmlField.TYPE_BYTE, -1, defaultValues[84], 84, 1);
        this.fmlBuffer[85] = new FmlField("BL_BAL_HANDLE_IND", FmlField.TYPE_BYTE, -1, defaultValues[85], 85, 1);
        this.fmlBuffer[86] = new FmlField("BL_NO_MNSP_IND", FmlField.TYPE_BYTE, -1, defaultValues[86], 86, 1);
        this.fmlBuffer[87] = new FmlField("CS_BAN_TRX_OFF_IND", FmlField.TYPE_BYTE, -1, defaultValues[87], 87, 1);
        this.fmlBuffer[88] = new FmlField("CS_HANDLE_BY_CTN_IND", FmlField.TYPE_BYTE, -1, defaultValues[88], 88, 1);
        this.fmlBuffer[89] = new FmlField("CS_LOCK_MECHANISM", FmlField.TYPE_BYTE, -1, defaultValues[89], 89, 1);
        this.fmlBuffer[90] = new FmlField("COMP_CRD_LMT", FmlField.TYPE_DOUBLE, -1, defaultValues[90], 90, 1);
        this.fmlBuffer[91] = new FmlField("CREDIT_CLASS", FmlField.TYPE_BYTE, -1, defaultValues[91], 91, 1);
        this.fmlBuffer[92] = new FmlField("CREDIT_DATE", FmlField.TYPE_STRING, 15, defaultValues[92], 92, 1);
        this.fmlBuffer[93] = new FmlField("CREDIT_SOURCE", FmlField.TYPE_BYTE, -1, defaultValues[93], 93, 1);
        this.fmlBuffer[94] = new FmlField("CREDIT_STATUS", FmlField.TYPE_STRING, 3, defaultValues[94], 94, 1);
        this.fmlBuffer[95] = new FmlField("EQU_CRD_LMT", FmlField.TYPE_DOUBLE, -1, defaultValues[95], 95, 1);
        this.fmlBuffer[96] = new FmlField("BL_VAT_EXEMPT_IND", FmlField.TYPE_BYTE, -1, defaultValues[96], 96, 1);
        this.fmlBuffer[97] = new FmlField("BL_VAT_EXEMPT_DATE", FmlField.TYPE_STRING, 9, defaultValues[97], 97, 1);
        this.fmlBuffer[98] = new FmlField("BL_VAT_EXEMPT_REF_NO", FmlField.TYPE_STRING, 17, defaultValues[98], 98, 1);
        this.fmlBuffer[99] = new FmlField("BL_VAT_EXEMPT_RSN_CD", FmlField.TYPE_STRING, 4, defaultValues[99], 99, 1);
        this.fmlBuffer[100] = new FmlField("DEFAULT_DEPARTMENT", FmlField.TYPE_STRING, 5, defaultValues[100], 100, 1);
        this.fmlBuffer[101] = new FmlField("COL_CODE", FmlField.TYPE_BYTE, -1, defaultValues[101], 101, 1);
        this.fmlBuffer[102] = new FmlField("CURR_ROOT_BAN", FmlField.TYPE_INTEGER, -1, defaultValues[102], 102, 1);
        this.fmlBuffer[103] = new FmlField("NEXT_ROOT_BAN", FmlField.TYPE_INTEGER, -1, defaultValues[103], 103, 1);
        this.fmlBuffer[104] = new FmlField("PARTITION_ROOT_BAN", FmlField.TYPE_INTEGER, -1, defaultValues[104], 104, 1);
        this.fmlBuffer[105] = new FmlField("CYCLE_FREQUENCY", FmlField.TYPE_SHORT, -1, defaultValues[105], 105, 1);
        this.fmlBuffer[106] = new FmlField("CYCLE_FIRST_BILL_MONTH", FmlField.TYPE_SHORT, -1, defaultValues[106], 106, 1);
        this.fmlBuffer[107] = new FmlField("BL_DUE_DAY", FmlField.TYPE_SHORT, -1, defaultValues[107], 107, 1);
        this.fmlBuffer[108] = new FmlField("VIP_IND", FmlField.TYPE_BYTE, -1, defaultValues[108], 108, 1);
        this.fmlBuffer[109] = new FmlField("BLACK_LISTED_IND", FmlField.TYPE_BYTE, -1, defaultValues[109], 109, 1);
        this.fmlBuffer[110] = new FmlField("BL_PRT_CATEGORY", FmlField.TYPE_STRING, 3, defaultValues[110], 110, 1);
        this.fmlBuffer[111] = new FmlField("CS_DEF_PRODUCT_TYPE", FmlField.TYPE_STRING, 4, defaultValues[111], 111, 1);
        this.fmlBuffer[112] = new FmlField("ORG_CODE", FmlField.TYPE_STRING, 6, defaultValues[112], 112, 1);
        this.fmlBuffer[113] = new FmlField("BL_HIER_BAN_IND", FmlField.TYPE_BYTE, -1, defaultValues[113], 113, 1);
        this.fmlBuffer[114] = new FmlField("PAYMENT_METHOD", FmlField.TYPE_STRING, 3, defaultValues[114], 114, 1);
        this.fmlBuffer[115] = new FmlField("PAYMENT_SUB_METHOD", FmlField.TYPE_STRING, 3, defaultValues[115], 115, 1);
        this.fmlBuffer[116] = new FmlField("OLD_ACCOUNT_ID", FmlField.TYPE_STRING, 21, defaultValues[116], 116, 1);
        this.fmlBuffer[117] = new FmlField("CARRY_OVER_BILL", FmlField.TYPE_BYTE, -1, defaultValues[117], 117, 1);
        this.fmlBuffer[118] = new FmlField("HIDE_PHONE_DIGITS_IND", FmlField.TYPE_BYTE, -1, defaultValues[118], 118, 1);
        this.fmlBuffer[119] = new FmlField("SEC_DEPARTMENT", FmlField.TYPE_STRING, 5, defaultValues[119], 119, 1);
        this.fmlBuffer[120] = new FmlField("NEXT_CONF_ROOT_BAN", FmlField.TYPE_INTEGER, -1, defaultValues[120], 120, 1);
        this.fmlBuffer[121] = new FmlField("EDI_LOCATION_NUMBER", FmlField.TYPE_DOUBLE, -1, defaultValues[121], 121, 1);
        this.fmlBuffer[122] = new FmlField("ALLOW_ADVERTISING_IND", FmlField.TYPE_BYTE, -1, defaultValues[122], 122, 1);
        this.fmlBuffer[123] = new FmlField("AGENCY_REF_NO", FmlField.TYPE_STRING, 9, defaultValues[123], 123, 1);
        this.fmlBuffer[124] = new FmlField("COL_AGENCY_CONF_DT", FmlField.TYPE_STRING, 9, defaultValues[124], 124, 1);
        this.fmlBuffer[125] = new FmlField("BAN_GROUP_NO", FmlField.TYPE_STRING, 11, defaultValues[125], 125, 1);
        this.fmlBuffer[126] = new FmlField("CAAP_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[126], 126, 1);
        this.fmlBuffer[127] = new FmlField("COL_AGNCY_CODE", FmlField.TYPE_STRING, 9, defaultValues[127], 127, 1);
        this.fmlBuffer[128] = new FmlField("INVOICE_FEE_WAIVE_IND", FmlField.TYPE_BYTE, -1, defaultValues[128], 128, 1);
        this.fmlBuffer[129] = new FmlField("PRD_ZERO_RATE_BILL", FmlField.TYPE_BYTE, -1, defaultValues[129], 129, 1);
        this.fmlBuffer[130] = new FmlField("CS_CREDIT_CLASS", FmlField.TYPE_BYTE, -1, defaultValues[130], 130, 1);
        this.fmlBuffer[131] = new FmlField("CS_APPROVED_CTN_QTY", FmlField.TYPE_SHORT, -1, defaultValues[131], 131, 1);
        this.fmlBuffer[132] = new FmlField("CAS_ORDER_NUMBER", FmlField.TYPE_INTEGER, -1, defaultValues[132], 132, 1);
        this.fmlBuffer[133] = new FmlField("PCTNAGRPRMRECBAN", FmlField.TYPE_INTEGER, -1, defaultValues[133], 133, 1);
        this.fmlBuffer[134] = new FmlField("BAN_ROWID", FmlField.TYPE_STRING, 19, defaultValues[134], 134, 1);
        this.fmlBuffer[135] = new FmlField("PCTNAGRPRMRECCUSTOMER_ID", FmlField.TYPE_INTEGER, -1, defaultValues[135], 135, 1);
        this.fmlBuffer[136] = new FmlField("CUSTOMER_ROWID", FmlField.TYPE_STRING, 19, defaultValues[136], 136, 1);
        this.fmlBuffer[137] = new FmlField("SUBSCRIBER_NO", FmlField.TYPE_STRING, 21, defaultValues[137], 137, 1);
        this.fmlBuffer[138] = new FmlField("CTN_ROWID", FmlField.TYPE_STRING, 19, defaultValues[138], 138, 1);
        this.fmlBuffer[139] = new FmlField("PCTNRECROWID", FmlField.TYPE_STRING, 19, defaultValues[139], 139, 1);
        this.fmlBuffer[140] = new FmlField("PCTNRECSUBSCRIBER_NO", FmlField.TYPE_STRING, 21, defaultValues[140], 140, 1);
        this.fmlBuffer[141] = new FmlField("PCTNRECCUSTOMER_ID", FmlField.TYPE_INTEGER, -1, defaultValues[141], 141, 1);
        this.fmlBuffer[142] = new FmlField("PCTNRECSYS_CREATION_DATE", FmlField.TYPE_STRING, 15, defaultValues[142], 142, 1);
        this.fmlBuffer[143] = new FmlField("PCTNRECSYS_UPDATE_DATE", FmlField.TYPE_STRING, 15, defaultValues[143], 143, 1);
        this.fmlBuffer[144] = new FmlField("PCTNRECOPERATOR_ID", FmlField.TYPE_INTEGER, -1, defaultValues[144], 144, 1);
        this.fmlBuffer[145] = new FmlField("PCTNRECAPPLICATION_ID", FmlField.TYPE_STRING, 7, defaultValues[145], 145, 1);
        this.fmlBuffer[146] = new FmlField("PCTNRECDL_SERVICE_CODE", FmlField.TYPE_STRING, 6, defaultValues[146], 146, 1);
        this.fmlBuffer[147] = new FmlField("PCTNRECDL_UPDATE_STAMP", FmlField.TYPE_SHORT, -1, defaultValues[147], 147, 1);
        this.fmlBuffer[148] = new FmlField("EFFECTIVE_DATE", FmlField.TYPE_STRING, 15, defaultValues[148], 148, 1);
        this.fmlBuffer[149] = new FmlField("INIT_ACTIVATION_DATE", FmlField.TYPE_STRING, 9, defaultValues[149], 149, 1);
        this.fmlBuffer[150] = new FmlField("SUB_STATUS", FmlField.TYPE_BYTE, -1, defaultValues[150], 150, 1);
        this.fmlBuffer[151] = new FmlField("SUB_STATUS_DATE", FmlField.TYPE_STRING, 9, defaultValues[151], 151, 1);
        this.fmlBuffer[152] = new FmlField("ORIGINAL_INIT_DATE", FmlField.TYPE_STRING, 15, defaultValues[152], 152, 1);
        this.fmlBuffer[153] = new FmlField("SUB_STATUS_LAST_ACT", FmlField.TYPE_STRING, 4, defaultValues[153], 153, 1);
        this.fmlBuffer[154] = new FmlField("SUB_STATUS_RSN_CODE", FmlField.TYPE_STRING, 5, defaultValues[154], 154, 1);
        this.fmlBuffer[155] = new FmlField("PRODUCT_TYPE", FmlField.TYPE_STRING, 4, defaultValues[155], 155, 1);
        this.fmlBuffer[156] = new FmlField("CUSTOMER_BAN", FmlField.TYPE_INTEGER, -1, defaultValues[156], 156, 1);
        this.fmlBuffer[157] = new FmlField("CTN_SEQ_NO", FmlField.TYPE_INTEGER, -1, defaultValues[157], 157, 1);
        this.fmlBuffer[158] = new FmlField("REQ_ST_GRACE_PERIOD", FmlField.TYPE_STRING, 9, defaultValues[158], 158, 1);
        this.fmlBuffer[159] = new FmlField("REQ_END_GRACE_PERIOD", FmlField.TYPE_STRING, 9, defaultValues[159], 159, 1);
        this.fmlBuffer[160] = new FmlField("COMMIT_START_DATE", FmlField.TYPE_STRING, 9, defaultValues[160], 160, 1);
        this.fmlBuffer[161] = new FmlField("COMMIT_END_DATE", FmlField.TYPE_STRING, 9, defaultValues[161], 161, 1);
        this.fmlBuffer[162] = new FmlField("COMMIT_REASON_CODE", FmlField.TYPE_STRING, 4, defaultValues[162], 162, 1);
        this.fmlBuffer[163] = new FmlField("COMMIT_ORIG_NO_MONTH", FmlField.TYPE_SHORT, -1, defaultValues[163], 163, 1);
        this.fmlBuffer[164] = new FmlField("SUSP_RC_RATE_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[164], 164, 1);
        this.fmlBuffer[165] = new FmlField("CONTRACT_NO", FmlField.TYPE_STRING, 11, defaultValues[165], 165, 1);
        this.fmlBuffer[166] = new FmlField("CNT_SEQ_NO", FmlField.TYPE_INTEGER, -1, defaultValues[166], 166, 1);
        this.fmlBuffer[167] = new FmlField("PCTNRECDEALER_CODE", FmlField.TYPE_STRING, 6, defaultValues[167], 167, 1);
        this.fmlBuffer[168] = new FmlField("ORG_DEALER_CODE", FmlField.TYPE_STRING, 6, defaultValues[168], 168, 1);
        this.fmlBuffer[169] = new FmlField("PCTNRECSALES_AGENT", FmlField.TYPE_STRING, 6, defaultValues[169], 169, 1);
        this.fmlBuffer[170] = new FmlField("ORG_SALES_AGENT", FmlField.TYPE_STRING, 6, defaultValues[170], 170, 1);
        this.fmlBuffer[171] = new FmlField("REQ_DEPOSIT_AMT", FmlField.TYPE_DOUBLE, -1, defaultValues[171], 171, 1);
        this.fmlBuffer[172] = new FmlField("LEADING_NUMBER", FmlField.TYPE_STRING, 21, defaultValues[172], 172, 1);
        this.fmlBuffer[173] = new FmlField("PABX_IND", FmlField.TYPE_BYTE, -1, defaultValues[173], 173, 1);
        this.fmlBuffer[174] = new FmlField("NEXT_CTN", FmlField.TYPE_STRING, 21, defaultValues[174], 174, 1);
        this.fmlBuffer[175] = new FmlField("NEXT_CTN_CHG_DATE", FmlField.TYPE_STRING, 9, defaultValues[175], 175, 1);
        this.fmlBuffer[176] = new FmlField("PRV_CTN", FmlField.TYPE_STRING, 21, defaultValues[176], 176, 1);
        this.fmlBuffer[177] = new FmlField("PRV_CTN_CHG_DATE", FmlField.TYPE_STRING, 9, defaultValues[177], 177, 1);
        this.fmlBuffer[178] = new FmlField("NEXT_BAN", FmlField.TYPE_INTEGER, -1, defaultValues[178], 178, 1);
        this.fmlBuffer[179] = new FmlField("NEXT_BAN_MOVE_DATE", FmlField.TYPE_STRING, 9, defaultValues[179], 179, 1);
        this.fmlBuffer[180] = new FmlField("PRV_BAN", FmlField.TYPE_INTEGER, -1, defaultValues[180], 180, 1);
        this.fmlBuffer[181] = new FmlField("PRV_BAN_MOVE_DATE", FmlField.TYPE_STRING, 9, defaultValues[181], 181, 1);
        this.fmlBuffer[182] = new FmlField("SUB_STS_ISSUE_DATE", FmlField.TYPE_STRING, 9, defaultValues[182], 182, 1);
        this.fmlBuffer[183] = new FmlField("ACTIVATE_WAIVE_RSN", FmlField.TYPE_STRING, 7, defaultValues[183], 183, 1);
        this.fmlBuffer[184] = new FmlField("EARLIEST_ACTV_DATE", FmlField.TYPE_STRING, 9, defaultValues[184], 184, 1);
        this.fmlBuffer[185] = new FmlField("SUB_ACTV_LOCATION", FmlField.TYPE_STRING, 5, defaultValues[185], 185, 1);
        this.fmlBuffer[186] = new FmlField("CUST_WATCH_LMT", FmlField.TYPE_DOUBLE, -1, defaultValues[186], 186, 1);
        this.fmlBuffer[187] = new FmlField("CUST_WATCH_DATE", FmlField.TYPE_STRING, 9, defaultValues[187], 187, 1);
        this.fmlBuffer[188] = new FmlField("BASIC_WATCH_LMT", FmlField.TYPE_DOUBLE, -1, defaultValues[188], 188, 1);
        this.fmlBuffer[189] = new FmlField("CREDIT_WATCH_PIN_CD", FmlField.TYPE_SHORT, -1, defaultValues[189], 189, 1);
        this.fmlBuffer[190] = new FmlField("SUB_MARKET_CODE", FmlField.TYPE_STRING, 4, defaultValues[190], 190, 1);
        this.fmlBuffer[191] = new FmlField("LIMIT_RESERVED_DAYS", FmlField.TYPE_SHORT, -1, defaultValues[191], 191, 1);
        this.fmlBuffer[192] = new FmlField("FF_EXPIRATION_DATE", FmlField.TYPE_STRING, 15, defaultValues[192], 192, 1);
        this.fmlBuffer[193] = new FmlField("FLEX_IND", FmlField.TYPE_BYTE, -1, defaultValues[193], 193, 1);
        this.fmlBuffer[194] = new FmlField("DUO_IND", FmlField.TYPE_BYTE, -1, defaultValues[194], 194, 1);
        this.fmlBuffer[195] = new FmlField("LISTED_IND", FmlField.TYPE_BYTE, -1, defaultValues[195], 195, 1);
        this.fmlBuffer[196] = new FmlField("SUB_DEPARTMENT_CD", FmlField.TYPE_STRING, 5, defaultValues[196], 196, 1);
        this.fmlBuffer[197] = new FmlField("LAST_SUBS_DISC_DT", FmlField.TYPE_STRING, 9, defaultValues[197], 197, 1);
        this.fmlBuffer[198] = new FmlField("LAST_SUBS_DISC_DT_UD", FmlField.TYPE_STRING, 9, defaultValues[198], 198, 1);
        this.fmlBuffer[199] = new FmlField("LAST_SUBSCR_DISC_SN", FmlField.TYPE_SHORT, -1, defaultValues[199], 199, 1);
        this.fmlBuffer[200] = new FmlField("LAST_SUBSCR_DISC_SN_UD", FmlField.TYPE_SHORT, -1, defaultValues[200], 200, 1);
        this.fmlBuffer[201] = new FmlField("PNI", FmlField.TYPE_STRING, 11, defaultValues[201], 201, 1);
        this.fmlBuffer[202] = new FmlField("RMS_REF_STORE_ID", FmlField.TYPE_STRING, 5, defaultValues[202], 202, 1);
        this.fmlBuffer[203] = new FmlField("RMS_REF_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[203], 203, 1);
        this.fmlBuffer[204] = new FmlField("RMS_REF_OD", FmlField.TYPE_INTEGER, -1, defaultValues[204], 204, 1);
        this.fmlBuffer[205] = new FmlField("DLR_ACT_FEE", FmlField.TYPE_DOUBLE, -1, defaultValues[205], 205, 1);
        this.fmlBuffer[206] = new FmlField("PREP_AMOUNT", FmlField.TYPE_DOUBLE, -1, defaultValues[206], 206, 1);
        this.fmlBuffer[207] = new FmlField("SUBSCRIBER_ID", FmlField.TYPE_INTEGER, -1, defaultValues[207], 207, 1);
        this.fmlBuffer[208] = new FmlField("SUB_LANG", FmlField.TYPE_STRING, 3, defaultValues[208], 208, 1);
        this.fmlBuffer[209] = new FmlField("SMS_RCV_STYLE_CODE", FmlField.TYPE_STRING, 3, defaultValues[209], 209, 1);
        this.fmlBuffer[210] = new FmlField("PCTNRECCONV_RUN_NO", FmlField.TYPE_SHORT, -1, defaultValues[210], 210, 1);
        this.fmlBuffer[211] = new FmlField("PCTNRECALLOW_ADVERTISING_IND", FmlField.TYPE_BYTE, -1, defaultValues[211], 211, 1);
        this.fmlBuffer[212] = new FmlField("IVR_WRONG_ACCESS_NO", FmlField.TYPE_SHORT, -1, defaultValues[212], 212, 1);
        this.fmlBuffer[213] = new FmlField("THRESHOLD_AMT", FmlField.TYPE_DOUBLE, -1, defaultValues[213], 213, 1);
        this.fmlBuffer[214] = new FmlField("PUBLISH_LEVEL", FmlField.TYPE_STRING, 31, defaultValues[214], 214, 1);
        this.fmlBuffer[215] = new FmlField("AUTO_RELEASE_IND", FmlField.TYPE_BYTE, -1, defaultValues[215], 215, 1);
        this.fmlBuffer[216] = new FmlField("CUST_WATCH_EFF_DATE", FmlField.TYPE_STRING, 9, defaultValues[216], 216, 1);
        this.fmlBuffer[217] = new FmlField("CUST_WATCH_EXP_DATE", FmlField.TYPE_STRING, 9, defaultValues[217], 217, 1);
        this.fmlBuffer[218] = new FmlField("OPERATOR_CW_LMT", FmlField.TYPE_DOUBLE, -1, defaultValues[218], 218, 1);
        this.fmlBuffer[219] = new FmlField("SEND_SMS_FOR_MATCH", FmlField.TYPE_BYTE, -1, defaultValues[219], 219, 1);
        this.fmlBuffer[220] = new FmlField("CPS_STATUS", FmlField.TYPE_BYTE, -1, defaultValues[220], 220, 1);
        this.fmlBuffer[221] = new FmlField("CPS_TRANSACTION", FmlField.TYPE_SHORT, -1, defaultValues[221], 221, 1);
        this.fmlBuffer[222] = new FmlField("CPS_TYPE", FmlField.TYPE_SHORT, -1, defaultValues[222], 222, 1);
        this.fmlBuffer[223] = new FmlField("ISP_PASS", FmlField.TYPE_STRING, 31, defaultValues[223], 223, 1);
        this.fmlBuffer[224] = new FmlField("ISP_TYPE", FmlField.TYPE_STRING, 3, defaultValues[224], 224, 1);
        this.fmlBuffer[225] = new FmlField("OPERATOR_TMP_DATE", FmlField.TYPE_STRING, 9, defaultValues[225], 225, 1);
        this.fmlBuffer[226] = new FmlField("OPERATOR_TMP_LMT", FmlField.TYPE_DOUBLE, -1, defaultValues[226], 226, 1);
        this.fmlBuffer[227] = new FmlField("SUB_ORG_CD", FmlField.TYPE_STRING, 11, defaultValues[227], 227, 1);
        this.fmlBuffer[228] = new FmlField("ORG_MEMBER_NO", FmlField.TYPE_STRING, 21, defaultValues[228], 228, 1);
        this.fmlBuffer[229] = new FmlField("FULLTABLE", FmlField.TYPE_BYTE, -1, defaultValues[229], 229, 1);
        this.fmlBuffer[230] = new FmlField("PAPER_WORK_STATUS", FmlField.TYPE_STRING, 3, defaultValues[230], 230, 1);
        this.fmlBuffer[231] = new FmlField("PAPER_WORK_REQUIRED", FmlField.TYPE_BYTE, -1, defaultValues[231], 231, 1);
        this.fmlBuffer[232] = new FmlField("PAPER_WORK_DATE", FmlField.TYPE_STRING, 9, defaultValues[232], 232, 1);
        this.fmlBuffer[233] = new FmlField("PAPER_WORK_REF_NO", FmlField.TYPE_STRING, 12, defaultValues[233], 233, 1);
        this.fmlBuffer[234] = new FmlField("PAPER_WORK_TRNS_NO", FmlField.TYPE_STRING, 26, defaultValues[234], 234, 1);
        this.fmlBuffer[235] = new FmlField("DELIVERY_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[235], 235, 1);
        this.fmlBuffer[236] = new FmlField("ROWCOUNT", FmlField.TYPE_INTEGER, -1, defaultValues[236], 236, 1);
        this.fmlBuffer[237] = new FmlField("PAGRSOCBUFROWID", FmlField.TYPE_STRING, 19, defaultValues[237], 237, 50);
        this.fmlBuffer[238] = new FmlField("SOC", FmlField.TYPE_STRING, 10, defaultValues[238], 238, 50);
        this.fmlBuffer[239] = new FmlField("SOC_EFFECTIVE_DATE", FmlField.TYPE_STRING, 9, defaultValues[239], 239, 50);
        this.fmlBuffer[240] = new FmlField("COMMITMENT_END_DATE", FmlField.TYPE_STRING, 9, defaultValues[240], 240, 50);
        this.fmlBuffer[241] = new FmlField("SERVICE_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[241], 241, 50);
        this.fmlBuffer[242] = new FmlField("PAGRSOCBUFEFFECTIVE_DATE", FmlField.TYPE_STRING, 9, defaultValues[242], 242, 50);
        this.fmlBuffer[243] = new FmlField("EXPIRATION_DATE", FmlField.TYPE_STRING, 9, defaultValues[243], 243, 50);
        this.fmlBuffer[244] = new FmlField("SOC_LEVEL_CODE", FmlField.TYPE_BYTE, -1, defaultValues[244], 244, 50);
        this.fmlBuffer[245] = new FmlField("PAGRSOCBUFDEALER_CODE", FmlField.TYPE_STRING, 6, defaultValues[245], 245, 50);
        this.fmlBuffer[246] = new FmlField("PAGRSOCBUFSALES_AGENT", FmlField.TYPE_STRING, 6, defaultValues[246], 246, 50);
        this.fmlBuffer[247] = new FmlField("SRV_MODE", FmlField.TYPE_BYTE, -1, defaultValues[247], 247, 50);
        this.fmlBuffer[248] = new FmlField("SRV_SUB_MODE", FmlField.TYPE_BYTE, -1, defaultValues[248], 248, 50);
        this.fmlBuffer[249] = new FmlField("SOC_SEQ_NO", FmlField.TYPE_INTEGER, -1, defaultValues[249], 249, 50);
        this.fmlBuffer[250] = new FmlField("SRV_TRX_ID", FmlField.TYPE_INTEGER, -1, defaultValues[250], 250, 50);
        this.fmlBuffer[251] = new FmlField("CAMPAIGN_SEQ", FmlField.TYPE_INTEGER, -1, defaultValues[251], 251, 50);
        this.fmlBuffer[252] = new FmlField("CAMPAIGN", FmlField.TYPE_STRING, 10, defaultValues[252], 252, 50);
        this.fmlBuffer[253] = new FmlField("PAGRSOCBUFCOMMIT_ORIG_NO_MONTH", FmlField.TYPE_SHORT, -1, defaultValues[253], 253, 50);
        this.fmlBuffer[254] = new FmlField("PAGRSOCBUFPRODUCT_TYPE", FmlField.TYPE_STRING, 4, defaultValues[254], 254, 50);
        this.fmlBuffer[255] = new FmlField("LOAN_VER_NO", FmlField.TYPE_INTEGER, -1, defaultValues[255], 255, 50);
        this.fmlBuffer[256] = new FmlField("LOAN_SEQ_NO", FmlField.TYPE_INTEGER, -1, defaultValues[256], 256, 50);
        this.fmlBuffer[257] = new FmlField("SOC_ACTV_FEE", FmlField.TYPE_DOUBLE, -1, defaultValues[257], 257, 50);
        this.fmlBuffer[258] = new FmlField("PROMOTIONAL_SOC", FmlField.TYPE_STRING, 10, defaultValues[258], 258, 50);
        this.fmlBuffer[259] = new FmlField("REASON_CODE", FmlField.TYPE_STRING, 5, defaultValues[259], 259, 50);
        this.fmlBuffer[260] = new FmlField("SOC_START_RC_DATE", FmlField.TYPE_STRING, 9, defaultValues[260], 260, 50);
        this.fmlBuffer[261] = new FmlField("RC_DATE_COPY_IND", FmlField.TYPE_BYTE, -1, defaultValues[261], 261, 50);
        this.fmlBuffer[262] = new FmlField("PAGRFRNDFMLROWCOUNT", FmlField.TYPE_INTEGER, -1, defaultValues[262], 262, 1);
        this.fmlBuffer[263] = new FmlField("ACTIONIND", FmlField.TYPE_BYTE, -1, defaultValues[263], 263, 10000);
        this.fmlBuffer[264] = new FmlField("PCSFANDFRECROWID", FmlField.TYPE_STRING, 19, defaultValues[264], 264, 10000);
        this.fmlBuffer[265] = new FmlField("PCSFANDFRECEFFECTIVE_DATE", FmlField.TYPE_STRING, 15, defaultValues[265], 265, 10000);
        this.fmlBuffer[266] = new FmlField("PCSFANDFRECEXPIRATION_DATE", FmlField.TYPE_STRING, 15, defaultValues[266], 266, 10000);
        this.fmlBuffer[267] = new FmlField("PERSONAL_TEL", FmlField.TYPE_STRING, 21, defaultValues[267], 267, 10000);
        this.fmlBuffer[268] = new FmlField("PERSONAL_TEL_TO", FmlField.TYPE_STRING, 21, defaultValues[268], 268, 10000);
        this.fmlBuffer[269] = new FmlField("FF_SOC", FmlField.TYPE_STRING, 10, defaultValues[269], 269, 10000);
        this.fmlBuffer[270] = new FmlField("PLAN_CODE", FmlField.TYPE_STRING, 10, defaultValues[270], 270, 10000);
        this.fmlBuffer[271] = new FmlField("DISCOUNT_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[271], 271, 10000);
        this.fmlBuffer[272] = new FmlField("START_HOUR", FmlField.TYPE_STRING, 7, defaultValues[272], 272, 10000);
        this.fmlBuffer[273] = new FmlField("DURATION", FmlField.TYPE_DOUBLE, -1, defaultValues[273], 273, 10000);
        this.fmlBuffer[274] = new FmlField("PAGRFTRDEPBUFROWCOUNT", FmlField.TYPE_INTEGER, -1, defaultValues[274], 274, 1);
        this.fmlBuffer[275] = new FmlField("DEPOSIT_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[275], 275, 2);
        this.fmlBuffer[276] = new FmlField("DEPOSIT_AMOUNT", FmlField.TYPE_DOUBLE, -1, defaultValues[276], 276, 2);
        this.fmlBuffer[277] = new FmlField("ROW_COUNT", FmlField.TYPE_INTEGER, -1, defaultValues[277], 277, 1);
        this.fmlBuffer[278] = new FmlField("ACT_CODE", FmlField.TYPE_STRING, 4, defaultValues[278], 278, 25);
        this.fmlBuffer[279] = new FmlField("ACT_REASON", FmlField.TYPE_STRING, 5, defaultValues[279], 279, 25);
        this.fmlBuffer[280] = new FmlField("PEFCSMACTVBUFSUSP_RC_RATE_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[280], 280, 25);
        this.fmlBuffer[281] = new FmlField("MEMO_CTN", FmlField.TYPE_STRING, 21, defaultValues[281], 281, 25);
        this.fmlBuffer[282] = new FmlField("USER_TEXT", FmlField.TYPE_STRING, 2001, defaultValues[282], 282, 25);
        this.fmlBuffer[283] = new FmlField("MEMO_SOURCE", FmlField.TYPE_BYTE, -1, defaultValues[283], 283, 25);
        this.fmlBuffer[284] = new FmlField("PARAM_COUNT", FmlField.TYPE_INTEGER, -1, defaultValues[284], 284, 25);
        this.fmlBuffer[285] = new FmlField("P1", FmlField.TYPE_STRING, 21, defaultValues[285], 285, 25);
        this.fmlBuffer[286] = new FmlField("P2", FmlField.TYPE_STRING, 21, defaultValues[286], 286, 25);
        this.fmlBuffer[287] = new FmlField("P3", FmlField.TYPE_STRING, 21, defaultValues[287], 287, 25);
        this.fmlBuffer[288] = new FmlField("P4", FmlField.TYPE_STRING, 21, defaultValues[288], 288, 25);
        this.fmlBuffer[289] = new FmlField("P5", FmlField.TYPE_STRING, 21, defaultValues[289], 289, 25);
        this.fmlBuffer[290] = new FmlField("P6", FmlField.TYPE_STRING, 21, defaultValues[290], 290, 25);
        this.fmlBuffer[291] = new FmlField("P7", FmlField.TYPE_STRING, 21, defaultValues[291], 291, 25);
        this.fmlBuffer[292] = new FmlField("P8", FmlField.TYPE_STRING, 21, defaultValues[292], 292, 25);
        this.fmlBuffer[293] = new FmlField("P9", FmlField.TYPE_STRING, 21, defaultValues[293], 293, 25);
        this.fmlBuffer[294] = new FmlField("P10", FmlField.TYPE_STRING, 21, defaultValues[294], 294, 25);
        this.fmlBuffer[295] = new FmlField("MEMO_AMT", FmlField.TYPE_DOUBLE, -1, defaultValues[295], 295, 25);
        this.fmlBuffer[296] = new FmlField("RMS_ACT_CODE", FmlField.TYPE_STRING, 5, defaultValues[296], 296, 25);
        this.fmlBuffer[297] = new FmlField("CHARGE_AMT", FmlField.TYPE_DOUBLE, -1, defaultValues[297], 297, 25);
        this.fmlBuffer[298] = new FmlField("CHARGE_AMT_IND", FmlField.TYPE_BYTE, -1, defaultValues[298], 298, 25);
        this.fmlBuffer[299] = new FmlField("WAIVE_REASON", FmlField.TYPE_STRING, 7, defaultValues[299], 299, 25);
        this.fmlBuffer[300] = new FmlField("WAIVE_IND", FmlField.TYPE_BYTE, -1, defaultValues[300], 300, 25);
        this.fmlBuffer[301] = new FmlField("PSRVTPINPBUFROWCOUNT", FmlField.TYPE_INTEGER, -1, defaultValues[301], 301, 1);
        this.fmlBuffer[302] = new FmlField("TUXSRVTP", FmlField.TYPE_BYTE, -1, defaultValues[302], 302, 25);
        this.fmlBuffer[303] = new FmlField("PNAMEADRBUFROWCOUNT", FmlField.TYPE_INTEGER, -1, defaultValues[303], 303, 1);
        this.fmlBuffer[304] = new FmlField("LINK_MODE", FmlField.TYPE_BYTE, -1, defaultValues[304], 304, 20);
        this.fmlBuffer[305] = new FmlField("LINK_BAN", FmlField.TYPE_INTEGER, -1, defaultValues[305], 305, 20);
        this.fmlBuffer[306] = new FmlField("LINK_SUBSCRIBER", FmlField.TYPE_STRING, 21, defaultValues[306], 306, 20);
        this.fmlBuffer[307] = new FmlField("LINK_ROW_ID", FmlField.TYPE_STRING, 19, defaultValues[307], 307, 20);
        this.fmlBuffer[308] = new FmlField("LINK_SEQ_NO", FmlField.TYPE_INTEGER, -1, defaultValues[308], 308, 20);
        this.fmlBuffer[309] = new FmlField("LNKRECCUSTOMER_ID", FmlField.TYPE_INTEGER, -1, defaultValues[309], 309, 20);
        this.fmlBuffer[310] = new FmlField("LNKRECBAN", FmlField.TYPE_INTEGER, -1, defaultValues[310], 310, 20);
        this.fmlBuffer[311] = new FmlField("LNKRECSUBSCRIBER_NO", FmlField.TYPE_STRING, 21, defaultValues[311], 311, 20);
        this.fmlBuffer[312] = new FmlField("LINK_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[312], 312, 20);
        this.fmlBuffer[313] = new FmlField("LNKRECEFFECTIVE_DATE", FmlField.TYPE_STRING, 9, defaultValues[313], 313, 20);
        this.fmlBuffer[314] = new FmlField("FOREIGN_SEQ_NO", FmlField.TYPE_INTEGER, -1, defaultValues[314], 314, 20);
        this.fmlBuffer[315] = new FmlField("BILLING_IND", FmlField.TYPE_BYTE, -1, defaultValues[315], 315, 20);
        this.fmlBuffer[316] = new FmlField("MAILING_IND", FmlField.TYPE_BYTE, -1, defaultValues[316], 316, 20);
        this.fmlBuffer[317] = new FmlField("USER_IND", FmlField.TYPE_BYTE, -1, defaultValues[317], 317, 20);
        this.fmlBuffer[318] = new FmlField("LINK_BILLING_IND", FmlField.TYPE_BYTE, -1, defaultValues[318], 318, 20);
        this.fmlBuffer[319] = new FmlField("LINK_MAILING_IND", FmlField.TYPE_BYTE, -1, defaultValues[319], 319, 20);
        this.fmlBuffer[320] = new FmlField("LINK_USER_IND", FmlField.TYPE_BYTE, -1, defaultValues[320], 320, 20);
        this.fmlBuffer[321] = new FmlField("NM_MODE", FmlField.TYPE_BYTE, -1, defaultValues[321], 321, 20);
        this.fmlBuffer[322] = new FmlField("NM_UP_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[322], 322, 20);
        this.fmlBuffer[323] = new FmlField("NM_EXPIRE_DATE", FmlField.TYPE_STRING, 9, defaultValues[323], 323, 20);
        this.fmlBuffer[324] = new FmlField("NAMERECROWID", FmlField.TYPE_STRING, 19, defaultValues[324], 324, 20);
        this.fmlBuffer[325] = new FmlField("NAME_ID", FmlField.TYPE_INTEGER, -1, defaultValues[325], 325, 20);
        this.fmlBuffer[326] = new FmlField("NAMERECSYS_CREATION_DATE", FmlField.TYPE_STRING, 15, defaultValues[326], 326, 20);
        this.fmlBuffer[327] = new FmlField("NAMERECSYS_UPDATE_DATE", FmlField.TYPE_STRING, 15, defaultValues[327], 327, 20);
        this.fmlBuffer[328] = new FmlField("NAMERECOPERATOR_ID", FmlField.TYPE_INTEGER, -1, defaultValues[328], 328, 20);
        this.fmlBuffer[329] = new FmlField("NAMERECAPPLICATION_ID", FmlField.TYPE_STRING, 7, defaultValues[329], 329, 20);
        this.fmlBuffer[330] = new FmlField("NAMERECDL_SERVICE_CODE", FmlField.TYPE_STRING, 6, defaultValues[330], 330, 20);
        this.fmlBuffer[331] = new FmlField("NAMERECDL_UPDATE_STAMP", FmlField.TYPE_SHORT, -1, defaultValues[331], 331, 20);
        this.fmlBuffer[332] = new FmlField("CONTROL_NAME", FmlField.TYPE_STRING, 41, defaultValues[332], 332, 20);
        this.fmlBuffer[333] = new FmlField("LAST_BUSINESS_NAME", FmlField.TYPE_STRING, 61, defaultValues[333], 333, 20);
        this.fmlBuffer[334] = new FmlField("FIRST_NAME", FmlField.TYPE_STRING, 33, defaultValues[334], 334, 20);
        this.fmlBuffer[335] = new FmlField("ADDITIONAL_TITLE", FmlField.TYPE_STRING, 61, defaultValues[335], 335, 20);
        this.fmlBuffer[336] = new FmlField("NAME_FORMAT", FmlField.TYPE_BYTE, -1, defaultValues[336], 336, 20);
        this.fmlBuffer[337] = new FmlField("BIRTH_DATE", FmlField.TYPE_STRING, 9, defaultValues[337], 337, 20);
        this.fmlBuffer[338] = new FmlField("IDENTIFY", FmlField.TYPE_STRING, 21, defaultValues[338], 338, 20);
        this.fmlBuffer[339] = new FmlField("ID_TYPE", FmlField.TYPE_STRING, 5, defaultValues[339], 339, 20);
        this.fmlBuffer[340] = new FmlField("COMP_REG_ID", FmlField.TYPE_STRING, 21, defaultValues[340], 340, 20);
        this.fmlBuffer[341] = new FmlField("KOB", FmlField.TYPE_DOUBLE, -1, defaultValues[341], 341, 20);
        this.fmlBuffer[342] = new FmlField("MIDDLE_INITIAL", FmlField.TYPE_STRING, 33, defaultValues[342], 342, 20);
        this.fmlBuffer[343] = new FmlField("TELEMARKET_ID", FmlField.TYPE_STRING, 11, defaultValues[343], 343, 20);
        this.fmlBuffer[344] = new FmlField("NAMERECCONV_RUN_NO", FmlField.TYPE_SHORT, -1, defaultValues[344], 344, 20);
        this.fmlBuffer[345] = new FmlField("NAME_TITLE_SALUTATION", FmlField.TYPE_STRING, 21, defaultValues[345], 345, 20);
        this.fmlBuffer[346] = new FmlField("NATIONALITY_CD", FmlField.TYPE_STRING, 4, defaultValues[346], 346, 20);
        this.fmlBuffer[347] = new FmlField("GENDER", FmlField.TYPE_BYTE, -1, defaultValues[347], 347, 20);
        this.fmlBuffer[348] = new FmlField("MARITAL_STATUS", FmlField.TYPE_STRING, 5, defaultValues[348], 348, 20);
        this.fmlBuffer[349] = new FmlField("ROLE_IND", FmlField.TYPE_BYTE, -1, defaultValues[349], 349, 20);
        this.fmlBuffer[350] = new FmlField("ADR_MODE", FmlField.TYPE_BYTE, -1, defaultValues[350], 350, 20);
        this.fmlBuffer[351] = new FmlField("ADR_UP_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[351], 351, 20);
        this.fmlBuffer[352] = new FmlField("ADR_EXPIRE_DATE", FmlField.TYPE_STRING, 9, defaultValues[352], 352, 20);
        this.fmlBuffer[353] = new FmlField("ADDRESSRECROWID", FmlField.TYPE_STRING, 19, defaultValues[353], 353, 20);
        this.fmlBuffer[354] = new FmlField("ADDRESS_ID", FmlField.TYPE_INTEGER, -1, defaultValues[354], 354, 20);
        this.fmlBuffer[355] = new FmlField("ADDRESSRECSYS_CREATION_DATE", FmlField.TYPE_STRING, 15, defaultValues[355], 355, 20);
        this.fmlBuffer[356] = new FmlField("ADDRESSRECSYS_UPDATE_DATE", FmlField.TYPE_STRING, 15, defaultValues[356], 356, 20);
        this.fmlBuffer[357] = new FmlField("ADDRESSRECOPERATOR_ID", FmlField.TYPE_INTEGER, -1, defaultValues[357], 357, 20);
        this.fmlBuffer[358] = new FmlField("ADDRESSRECAPPLICATION_ID", FmlField.TYPE_STRING, 7, defaultValues[358], 358, 20);
        this.fmlBuffer[359] = new FmlField("ADDRESSRECDL_SERVICE_CODE", FmlField.TYPE_STRING, 6, defaultValues[359], 359, 20);
        this.fmlBuffer[360] = new FmlField("ADDRESSRECDL_UPDATE_STAMP", FmlField.TYPE_SHORT, -1, defaultValues[360], 360, 20);
        this.fmlBuffer[361] = new FmlField("ADR_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[361], 361, 20);
        this.fmlBuffer[362] = new FmlField("ADR_STATUS", FmlField.TYPE_BYTE, -1, defaultValues[362], 362, 20);
        this.fmlBuffer[363] = new FmlField("ADR_STATUS_DATE", FmlField.TYPE_STRING, 9, defaultValues[363], 363, 20);
        this.fmlBuffer[364] = new FmlField("ADR_SECONDARY_LN", FmlField.TYPE_STRING, 101, defaultValues[364], 364, 20);
        this.fmlBuffer[365] = new FmlField("ADR_PRIMARY_LN", FmlField.TYPE_STRING, 101, defaultValues[365], 365, 20);
        this.fmlBuffer[366] = new FmlField("ADR_CITY", FmlField.TYPE_STRING, 40, defaultValues[366], 366, 20);
        this.fmlBuffer[367] = new FmlField("ADR_ZIP", FmlField.TYPE_STRING, 10, defaultValues[367], 367, 20);
        this.fmlBuffer[368] = new FmlField("ADR_HOUSE_NO", FmlField.TYPE_STRING, 21, defaultValues[368], 368, 20);
        this.fmlBuffer[369] = new FmlField("ADR_STREET_NAME", FmlField.TYPE_STRING, 61, defaultValues[369], 369, 20);
        this.fmlBuffer[370] = new FmlField("ADR_DIRECTION", FmlField.TYPE_STRING, 3, defaultValues[370], 370, 20);
        this.fmlBuffer[371] = new FmlField("ADR_POB", FmlField.TYPE_STRING, 11, defaultValues[371], 371, 20);
        this.fmlBuffer[372] = new FmlField("ADR_COUNTRY", FmlField.TYPE_STRING, 4, defaultValues[372], 372, 20);
        this.fmlBuffer[373] = new FmlField("ADR_HOUSE_LETTER", FmlField.TYPE_STRING, 3, defaultValues[373], 373, 20);
        this.fmlBuffer[374] = new FmlField("ADR_STORY", FmlField.TYPE_STRING, 3, defaultValues[374], 374, 20);
        this.fmlBuffer[375] = new FmlField("ADR_DOOR_NO", FmlField.TYPE_STRING, 5, defaultValues[375], 375, 20);
        this.fmlBuffer[376] = new FmlField("ADR_EMAIL", FmlField.TYPE_STRING, 151, defaultValues[376], 376, 20);
        this.fmlBuffer[377] = new FmlField("SINCE_DATE", FmlField.TYPE_STRING, 9, defaultValues[377], 377, 20);
        this.fmlBuffer[378] = new FmlField("ADR_DISTRICT", FmlField.TYPE_STRING, 41, defaultValues[378], 378, 20);
        this.fmlBuffer[379] = new FmlField("CO_IND", FmlField.TYPE_BYTE, -1, defaultValues[379], 379, 20);
        this.fmlBuffer[380] = new FmlField("ADDRESSRECCONV_RUN_NO", FmlField.TYPE_SHORT, -1, defaultValues[380], 380, 20);
        this.fmlBuffer[381] = new FmlField("ACCOMMODATION_TYPE", FmlField.TYPE_STRING, 5, defaultValues[381], 381, 20);
        this.fmlBuffer[382] = new FmlField("COUNTY_CODE", FmlField.TYPE_STRING, 3, defaultValues[382], 382, 20);
        this.fmlBuffer[383] = new FmlField("COMMUNITY_NAME", FmlField.TYPE_STRING, 31, defaultValues[383], 383, 20);
        this.fmlBuffer[384] = new FmlField("ADR_CO_NAME", FmlField.TYPE_STRING, 61, defaultValues[384], 384, 20);
        this.fmlBuffer[385] = new FmlField("ADR_HOUSE_NAME", FmlField.TYPE_STRING, 61, defaultValues[385], 385, 20);
        this.fmlBuffer[386] = new FmlField("ADR_P1", FmlField.TYPE_STRING, 61, defaultValues[386], 386, 20);
        this.fmlBuffer[387] = new FmlField("ADR_P2", FmlField.TYPE_STRING, 61, defaultValues[387], 387, 20);
        this.fmlBuffer[388] = new FmlField("ADR_P3", FmlField.TYPE_STRING, 61, defaultValues[388], 388, 20);
        this.fmlBuffer[389] = new FmlField("ADR_P4", FmlField.TYPE_STRING, 61, defaultValues[389], 389, 20);
        this.fmlBuffer[390] = new FmlField("ADR_P5", FmlField.TYPE_STRING, 61, defaultValues[390], 390, 20);
        this.fmlBuffer[391] = new FmlField("ADR_P6", FmlField.TYPE_STRING, 61, defaultValues[391], 391, 20);
        this.fmlBuffer[392] = new FmlField("ADR_P7", FmlField.TYPE_STRING, 61, defaultValues[392], 392, 20);
        this.fmlBuffer[393] = new FmlField("ADR_P8", FmlField.TYPE_STRING, 61, defaultValues[393], 393, 20);
        this.fmlBuffer[394] = new FmlField("ADR_P9", FmlField.TYPE_STRING, 61, defaultValues[394], 394, 20);
        this.fmlBuffer[395] = new FmlField("ADR_P10", FmlField.TYPE_STRING, 61, defaultValues[395], 395, 20);
        this.fmlBuffer[396] = new FmlField("PESNBUFROWCOUNT", FmlField.TYPE_INTEGER, -1, defaultValues[396], 396, 1);
        this.fmlBuffer[397] = new FmlField("EQUIPMENT_NO", FmlField.TYPE_STRING, 21, defaultValues[397], 397, 50);
        this.fmlBuffer[398] = new FmlField("PHD_SEQ_NO", FmlField.TYPE_INTEGER, -1, defaultValues[398], 398, 50);
        this.fmlBuffer[399] = new FmlField("EQUIPMENT_LEVEL", FmlField.TYPE_SHORT, -1, defaultValues[399], 399, 50);
        this.fmlBuffer[400] = new FmlField("IMSI", FmlField.TYPE_STRING, 16, defaultValues[400], 400, 50);
        this.fmlBuffer[401] = new FmlField("PHYDEVARRAYEXPIRATION_DATE", FmlField.TYPE_STRING, 15, defaultValues[401], 401, 50);
        this.fmlBuffer[402] = new FmlField("PHYDEVARRAYEFFECTIVE_DATE", FmlField.TYPE_STRING, 15, defaultValues[402], 402, 50);
        this.fmlBuffer[403] = new FmlField("OWNERSHIP_CODE", FmlField.TYPE_STRING, 3, defaultValues[403], 403, 50);
        this.fmlBuffer[404] = new FmlField("SW_STATE_IND", FmlField.TYPE_BYTE, -1, defaultValues[404], 404, 50);
        this.fmlBuffer[405] = new FmlField("LAST_SW_ACTV_DATE", FmlField.TYPE_STRING, 9, defaultValues[405], 405, 50);
        this.fmlBuffer[406] = new FmlField("NEXT_ACTV_CODE", FmlField.TYPE_BYTE, -1, defaultValues[406], 406, 50);
        this.fmlBuffer[407] = new FmlField("NEXT_ACTV_DATE", FmlField.TYPE_STRING, 9, defaultValues[407], 407, 50);
        this.fmlBuffer[408] = new FmlField("NEXT_ACTV_ISSUE_DT", FmlField.TYPE_STRING, 9, defaultValues[408], 408, 50);
        this.fmlBuffer[409] = new FmlField("DEVICE_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[409], 409, 50);
        this.fmlBuffer[410] = new FmlField("ESN_MODE", FmlField.TYPE_BYTE, -1, defaultValues[410], 410, 50);
        this.fmlBuffer[411] = new FmlField("ITEM_ID", FmlField.TYPE_STRING, 16, defaultValues[411], 411, 50);
        this.fmlBuffer[412] = new FmlField("POOL", FmlField.TYPE_STRING, 3, defaultValues[412], 412, 50);
        this.fmlBuffer[413] = new FmlField("LOCATION_ID", FmlField.TYPE_STRING, 5, defaultValues[413], 413, 50);
        this.fmlBuffer[414] = new FmlField("ACTIVITY_CODE", FmlField.TYPE_STRING, 5, defaultValues[414], 414, 50);
        this.fmlBuffer[415] = new FmlField("ACTIVITY_DATE", FmlField.TYPE_STRING, 15, defaultValues[415], 415, 50);
        this.fmlBuffer[416] = new FmlField("OPERATION_STATUS", FmlField.TYPE_BYTE, -1, defaultValues[416], 416, 50);
        this.fmlBuffer[417] = new FmlField("ITEM_OWNERSHIP", FmlField.TYPE_BYTE, -1, defaultValues[417], 417, 50);
        this.fmlBuffer[418] = new FmlField("ITEM_OWNERSHIP_DT", FmlField.TYPE_STRING, 15, defaultValues[418], 418, 50);
        this.fmlBuffer[419] = new FmlField("CURR_POSSESSION", FmlField.TYPE_BYTE, -1, defaultValues[419], 419, 50);
        this.fmlBuffer[420] = new FmlField("CURR_POSSESSION_DT", FmlField.TYPE_STRING, 15, defaultValues[420], 420, 50);
        this.fmlBuffer[421] = new FmlField("MISSING_IND", FmlField.TYPE_BYTE, -1, defaultValues[421], 421, 50);
        this.fmlBuffer[422] = new FmlField("IN_REPAIR_IND", FmlField.TYPE_BYTE, -1, defaultValues[422], 422, 50);
        this.fmlBuffer[423] = new FmlField("IN_TRANSIT_IND", FmlField.TYPE_BYTE, -1, defaultValues[423], 423, 50);
        this.fmlBuffer[424] = new FmlField("COMITED_TO_POS_IND", FmlField.TYPE_BYTE, -1, defaultValues[424], 424, 50);
        this.fmlBuffer[425] = new FmlField("COMITED_DATE", FmlField.TYPE_STRING, 15, defaultValues[425], 425, 50);
        this.fmlBuffer[426] = new FmlField("ACTIVITY_REASON", FmlField.TYPE_STRING, 4, defaultValues[426], 426, 50);
        this.fmlBuffer[427] = new FmlField("UPGRADE_IND", FmlField.TYPE_BYTE, -1, defaultValues[427], 427, 50);
        this.fmlBuffer[428] = new FmlField("EXPECTED_RTRN_DATE", FmlField.TYPE_STRING, 15, defaultValues[428], 428, 50);
        this.fmlBuffer[429] = new FmlField("POLICE_REPORT_NO", FmlField.TYPE_STRING, 16, defaultValues[429], 429, 50);
        this.fmlBuffer[430] = new FmlField("POLICE_REPORT_DATE", FmlField.TYPE_STRING, 15, defaultValues[430], 430, 50);
        this.fmlBuffer[431] = new FmlField("POLICE_STATION", FmlField.TYPE_STRING, 31, defaultValues[431], 431, 50);
        this.fmlBuffer[432] = new FmlField("PUK", FmlField.TYPE_INTEGER, -1, defaultValues[432], 432, 50);
        this.fmlBuffer[433] = new FmlField("PUK2", FmlField.TYPE_INTEGER, -1, defaultValues[433], 433, 50);
        this.fmlBuffer[434] = new FmlField("FIRST_USED_DATE", FmlField.TYPE_STRING, 15, defaultValues[434], 434, 50);
        this.fmlBuffer[435] = new FmlField("SIM_STATUS", FmlField.TYPE_BYTE, -1, defaultValues[435], 435, 50);
        this.fmlBuffer[436] = new FmlField("SUSPEND_IND", FmlField.TYPE_BYTE, -1, defaultValues[436], 436, 50);
        this.fmlBuffer[437] = new FmlField("SUSPEND_DATE", FmlField.TYPE_STRING, 15, defaultValues[437], 437, 50);
        this.fmlBuffer[438] = new FmlField("SENT_TO_AUC_IND", FmlField.TYPE_BYTE, -1, defaultValues[438], 438, 50);
        this.fmlBuffer[439] = new FmlField("HLR_CD", FmlField.TYPE_STRING, 4, defaultValues[439], 439, 50);
        this.fmlBuffer[440] = new FmlField("K4ID", FmlField.TYPE_STRING, 41, defaultValues[440], 440, 50);
        this.fmlBuffer[441] = new FmlField("PHYDEVARRAYDEALER_CODE", FmlField.TYPE_STRING, 6, defaultValues[441], 441, 50);
        this.fmlBuffer[442] = new FmlField("PSOCFTRBUFROWCOUNT", FmlField.TYPE_INTEGER, -1, defaultValues[442], 442, 1);
        this.fmlBuffer[443] = new FmlField("PSOCFTRBUFROWID", FmlField.TYPE_STRING, 19, defaultValues[443], 443, 200);
        this.fmlBuffer[444] = new FmlField("PSOCFTRBUFSOC", FmlField.TYPE_STRING, 10, defaultValues[444], 444, 200);
        this.fmlBuffer[445] = new FmlField("PSOCFTRBUFSOC_EFFECTIVE_DATE", FmlField.TYPE_STRING, 9, defaultValues[445], 445, 200);
        this.fmlBuffer[446] = new FmlField("FEATURE_CODE", FmlField.TYPE_STRING, 7, defaultValues[446], 446, 200);
        this.fmlBuffer[447] = new FmlField("MPS_FTR_CODE", FmlField.TYPE_STRING, 7, defaultValues[447], 447, 200);
        this.fmlBuffer[448] = new FmlField("FTR_EFFECTIVE_DATE", FmlField.TYPE_STRING, 9, defaultValues[448], 448, 200);
        this.fmlBuffer[449] = new FmlField("FTR_EXPIRATION_DATE", FmlField.TYPE_STRING, 9, defaultValues[449], 449, 200);
        this.fmlBuffer[450] = new FmlField("FTR_EFF_RSN_CODE", FmlField.TYPE_BYTE, -1, defaultValues[450], 450, 200);
        this.fmlBuffer[451] = new FmlField("FTR_EXP_RSN_CODE", FmlField.TYPE_BYTE, -1, defaultValues[451], 451, 200);
        this.fmlBuffer[452] = new FmlField("SERVICE_FTR_SEQ_NO", FmlField.TYPE_INTEGER, -1, defaultValues[452], 452, 200);
        this.fmlBuffer[453] = new FmlField("FTR_MODE", FmlField.TYPE_BYTE, -1, defaultValues[453], 453, 200);
        this.fmlBuffer[454] = new FmlField("PSOCFTRBUFSOC_SEQ_NO", FmlField.TYPE_INTEGER, -1, defaultValues[454], 454, 200);
        this.fmlBuffer[455] = new FmlField("FTR_SUB_MODE", FmlField.TYPE_BYTE, -1, defaultValues[455], 455, 200);
        this.fmlBuffer[456] = new FmlField("FTR_ADD_PARAM", FmlField.TYPE_STRING, 301, defaultValues[456], 456, 200);
        this.fmlBuffer[457] = new FmlField("FEATURE_TYPE", FmlField.TYPE_STRING, 4, defaultValues[457], 457, 200);
        this.fmlBuffer[458] = new FmlField("PSOCFTRBUFPRODUCT_TYPE", FmlField.TYPE_STRING, 4, defaultValues[458], 458, 200);
        this.fmlBuffer[459] = new FmlField("PSOCFTRBUFCAMPAIGN_SEQ", FmlField.TYPE_INTEGER, -1, defaultValues[459], 459, 200);
        this.fmlBuffer[460] = new FmlField("FTR_SPECIAL_TELNO", FmlField.TYPE_STRING, 21, defaultValues[460], 460, 200);
        this.fmlBuffer[461] = new FmlField("SWITCH_ACT_NEEDED", FmlField.TYPE_BYTE, -1, defaultValues[461], 461, 200);
        this.fmlBuffer[462] = new FmlField("SWITCH_CODE", FmlField.TYPE_STRING, 7, defaultValues[462], 462, 200);
        this.fmlBuffer[463] = new FmlField("MSISDN_CRITERIA", FmlField.TYPE_BYTE, -1, defaultValues[463], 463, 200);
        this.fmlBuffer[464] = new FmlField("TN_CLASS_CD", FmlField.TYPE_STRING, 4, defaultValues[464], 464, 200);
        this.fmlBuffer[465] = new FmlField("ACTION_MODE", FmlField.TYPE_BYTE, -1, defaultValues[465], 465, 200);
        this.fmlBuffer[466] = new FmlField("MANUAL_RC_RATE", FmlField.TYPE_DOUBLE, -1, defaultValues[466], 466, 200);
        this.fmlBuffer[467] = new FmlField("MANUAL_RC_EXP_DATE", FmlField.TYPE_STRING, 9, defaultValues[467], 467, 200);
        this.fmlBuffer[468] = new FmlField("PNPINFOBUFFROWCOUNT", FmlField.TYPE_INTEGER, -1, defaultValues[468], 468, 1);
        this.fmlBuffer[469] = new FmlField("NPNUMINFORECROWID", FmlField.TYPE_STRING, 19, defaultValues[469], 469, 500);
        this.fmlBuffer[470] = new FmlField("PORT_NUMBER", FmlField.TYPE_STRING, 21, defaultValues[470], 470, 500);
        this.fmlBuffer[471] = new FmlField("NPNUMINFORECEFFECTIVE_DATE", FmlField.TYPE_STRING, 15, defaultValues[471], 471, 500);
        this.fmlBuffer[472] = new FmlField("NPNUMINFORECSYS_CREATION_DATE", FmlField.TYPE_STRING, 15, defaultValues[472], 472, 500);
        this.fmlBuffer[473] = new FmlField("NPNUMINFORECSYS_UPDATE_DATE", FmlField.TYPE_STRING, 15, defaultValues[473], 473, 500);
        this.fmlBuffer[474] = new FmlField("NPNUMINFORECOPERATOR_ID", FmlField.TYPE_INTEGER, -1, defaultValues[474], 474, 500);
        this.fmlBuffer[475] = new FmlField("NPNUMINFORECAPPLICATION_ID", FmlField.TYPE_STRING, 7, defaultValues[475], 475, 500);
        this.fmlBuffer[476] = new FmlField("NPNUMINFORECDL_SERVICE_CODE", FmlField.TYPE_STRING, 6, defaultValues[476], 476, 500);
        this.fmlBuffer[477] = new FmlField("NPNUMINFORECDL_UPDATE_STAMP", FmlField.TYPE_SHORT, -1, defaultValues[477], 477, 500);
        this.fmlBuffer[478] = new FmlField("NPNUMINFORECEXPIRATION_DATE", FmlField.TYPE_STRING, 15, defaultValues[478], 478, 500);
        this.fmlBuffer[479] = new FmlField("INT_ORDER_ID", FmlField.TYPE_DOUBLE, -1, defaultValues[479], 479, 500);
        this.fmlBuffer[480] = new FmlField("ORG_CUSTOMER_ID", FmlField.TYPE_STRING, 61, defaultValues[480], 480, 500);
        this.fmlBuffer[481] = new FmlField("PORT_IND", FmlField.TYPE_BYTE, -1, defaultValues[481], 481, 500);
        this.fmlBuffer[482] = new FmlField("NUMBER_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[482], 482, 500);
        this.fmlBuffer[483] = new FmlField("PORT_REQUEST_DATE", FmlField.TYPE_STRING, 15, defaultValues[483], 483, 500);
        this.fmlBuffer[484] = new FmlField("ORG_OPERATOR", FmlField.TYPE_STRING, 6, defaultValues[484], 484, 500);
        this.fmlBuffer[485] = new FmlField("NPNUMINFORECSUBSCRIBER_ID", FmlField.TYPE_INTEGER, -1, defaultValues[485], 485, 500);
        this.fmlBuffer[486] = new FmlField("LAST_INT_ORD_ID", FmlField.TYPE_DOUBLE, -1, defaultValues[486], 486, 500);
        this.fmlBuffer[487] = new FmlField("FUNCTION_PORT_IND", FmlField.TYPE_BYTE, -1, defaultValues[487], 487, 500);
        this.fmlBuffer[488] = new FmlField("PASSIVE_IND", FmlField.TYPE_BYTE, -1, defaultValues[488], 488, 500);
        this.fmlBuffer[489] = new FmlField("AUTO_CONFIRM", FmlField.TYPE_BYTE, -1, defaultValues[489], 489, 500);
        this.fmlBuffer[490] = new FmlField("TEMPORARY_MSISDN", FmlField.TYPE_STRING, 21, defaultValues[490], 490, 500);
        this.fmlBuffer[491] = new FmlField("HANDLE_MODE", FmlField.TYPE_BYTE, -1, defaultValues[491], 491, 500);
        this.fmlBuffer[492] = new FmlField("SEND_IND", FmlField.TYPE_BYTE, -1, defaultValues[492], 492, 500);
        this.fmlBuffer[493] = new FmlField("ORDID_STR", FmlField.TYPE_STRING, 21, defaultValues[493], 493, 500);
        this.fmlBuffer[494] = new FmlField("LAST_ORDID_STR", FmlField.TYPE_STRING, 21, defaultValues[494], 494, 500);
        this.fmlBuffer[495] = new FmlField("ICC", FmlField.TYPE_STRING, 61, defaultValues[495], 495, 500);
        this.fmlBuffer[496] = new FmlField("CUSTOMER_NAME", FmlField.TYPE_STRING, 255, defaultValues[496], 496, 500);
        this.fmlBuffer[497] = new FmlField("NPINFOBUFFCUSTOMER_ID", FmlField.TYPE_STRING, 61, defaultValues[497], 497, 500);
        this.fmlBuffer[498] = new FmlField("SERVICE_PROVIDER", FmlField.TYPE_STRING, 6, defaultValues[498], 498, 500);
        this.fmlBuffer[499] = new FmlField("RSNCODE", FmlField.TYPE_STRING, 5, defaultValues[499], 499, 1);
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
     * Sets the value of the 'GENERATION' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_GENERATION(Integer value) throws FMLManipulationException {
        this.fmlBuffer[0].setValue(0, value);
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
     * Sets the value of the 'DIRECTIVE' field in the FML buffer.
     *
     * @param value Default value: 0.
     * @throws FMLManipulationException
     */
    public void set_DIRECTIVE(Integer value) throws FMLManipulationException {
        this.fmlBuffer[1].setValue(0, value);
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
     * Sets the value of the 'FIRST_DIRECTIVE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_FIRST_DIRECTIVE(Integer value) throws FMLManipulationException {
        this.fmlBuffer[2].setValue(0, value);
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
     * Sets the value of the 'SECOND_DIRECTIVE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_SECOND_DIRECTIVE(Integer value) throws FMLManipulationException {
        this.fmlBuffer[3].setValue(0, value);
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
     * Sets the value of the 'OPERATOR_ID' field in the FML buffer.
     *
     * @param value Default value: 200900.
     * @throws FMLManipulationException
     */
    public void set_OPERATOR_ID(Integer value) throws FMLManipulationException {
        this.fmlBuffer[4].setValue(0, value);
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
     * Sets the value of the 'APPLICATION_ID' field in the FML buffer.
     *
     * @param value Default value: Ninja, Maximum length: 7.
     * @throws FMLManipulationException
     */
    public void set_APPLICATION_ID(String value) throws FMLManipulationException {
        this.fmlBuffer[5].setValue(0, value);
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
     * Sets the value of the 'TRANSACTION_MODE' field in the FML buffer.
     *
     * @param value Default value: O.
     * @throws FMLManipulationException
     */
    public void set_TRANSACTION_MODE(String value) throws FMLManipulationException {
        this.fmlBuffer[6].setValue(0, TypeConverter.stringToByte(value));
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
     * Sets the value of the 'RUN_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_RUN_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[7].setValue(0, value);
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
     * Sets the value of the 'MARKET_CODE' field in the FML buffer.
     *
     * @param value Default value: NTC, Maximum length: 4.
     * @throws FMLManipulationException
     */
    public void set_MARKET_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[8].setValue(0, value);
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
     * Sets the value of the 'SVC_STATUS' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_SVC_STATUS(String value) throws FMLManipulationException {
        this.fmlBuffer[9].setValue(0, TypeConverter.stringToByte(value));
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
     * Sets the value of the 'LAST_UPDATE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @throws FMLManipulationException
     */
    public void set_LAST_UPDATE_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[10].setValue(0, value);
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
     * Sets the value of the 'LAST_UPDATE_STAMP' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_LAST_UPDATE_STAMP(Integer value) throws FMLManipulationException {
        this.fmlBuffer[11].setValue(0, TypeConverter.integerToShort(value));
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
     * Sets the value of the 'ENV_CODE' field in the FML buffer.
     *
     * @param value Default value: PRDENV, Maximum length: 11.
     * @throws FMLManipulationException
     */
    public void set_ENV_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[12].setValue(0, value);
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
     * Sets the value of the 'SESSION_ID' field in the FML buffer.
     *
     * @param value Default value: 0.
     * @throws FMLManipulationException
     */
    public void set_SESSION_ID(Integer value) throws FMLManipulationException {
        this.fmlBuffer[13].setValue(0, value);
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
     * Sets the value of the 'ONLINE_TRX_NO' field in the FML buffer.
     *
     * @param value Default value: 0.
     * @throws FMLManipulationException
     */
    public void set_ONLINE_TRX_NO(Integer value) throws FMLManipulationException {
        this.fmlBuffer[14].setValue(0, value);
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
     * Sets the value of the 'GROUP_TRX_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_GROUP_TRX_ID(Integer value) throws FMLManipulationException {
        this.fmlBuffer[15].setValue(0, value);
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
     * Sets the value of the 'ROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @throws FMLManipulationException
     */
    public void set_ROWID(String value) throws FMLManipulationException {
        this.fmlBuffer[16].setValue(0, value);
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
     * Sets the value of the 'CUSTOMER_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CUSTOMER_ID(Integer value) throws FMLManipulationException {
        this.fmlBuffer[17].setValue(0, value);
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
     * Sets the value of the 'SYS_CREATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @throws FMLManipulationException
     */
    public void set_SYS_CREATION_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[18].setValue(0, value);
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
     * Sets the value of the 'SYS_UPDATE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @throws FMLManipulationException
     */
    public void set_SYS_UPDATE_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[19].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PBANCUSTRECOPERATOR_ID' field in the FML buffer.
     *
     * @return Value of 'PBANCUSTRECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PBANCUSTRECOPERATOR_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[20].getValue(0));
    }

    /**
     * Sets the value of the 'PBANCUSTRECOPERATOR_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PBANCUSTRECOPERATOR_ID(Integer value) throws FMLManipulationException {
        this.fmlBuffer[20].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PBANCUSTRECAPPLICATION_ID' field in the FML buffer.
     *
     * @return Value of 'PBANCUSTRECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PBANCUSTRECAPPLICATION_ID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[21].getValue(0));
    }

    /**
     * Sets the value of the 'PBANCUSTRECAPPLICATION_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @throws FMLManipulationException
     */
    public void set_PBANCUSTRECAPPLICATION_ID(String value) throws FMLManipulationException {
        this.fmlBuffer[21].setValue(0, value);
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
     * Sets the value of the 'DL_SERVICE_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @throws FMLManipulationException
     */
    public void set_DL_SERVICE_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[22].setValue(0, value);
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
     * Sets the value of the 'DL_UPDATE_STAMP' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_DL_UPDATE_STAMP(Integer value) throws FMLManipulationException {
        this.fmlBuffer[23].setValue(0, TypeConverter.integerToShort(value));
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
     * Sets the value of the 'CUSTOMER_TELNO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @throws FMLManipulationException
     */
    public void set_CUSTOMER_TELNO(String value) throws FMLManipulationException {
        this.fmlBuffer[24].setValue(0, value);
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
     * Sets the value of the 'CUSTOMER_FAX' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @throws FMLManipulationException
     */
    public void set_CUSTOMER_FAX(String value) throws FMLManipulationException {
        this.fmlBuffer[25].setValue(0, value);
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
     * Sets the value of the 'WORK_TELNO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @throws FMLManipulationException
     */
    public void set_WORK_TELNO(String value) throws FMLManipulationException {
        this.fmlBuffer[26].setValue(0, value);
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
     * Sets the value of the 'WORK_FAX' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @throws FMLManipulationException
     */
    public void set_WORK_FAX(String value) throws FMLManipulationException {
        this.fmlBuffer[27].setValue(0, value);
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
     * Sets the value of the 'DEALER_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @throws FMLManipulationException
     */
    public void set_DEALER_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[28].setValue(0, value);
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
     * Sets the value of the 'SALES_AGENT' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @throws FMLManipulationException
     */
    public void set_SALES_AGENT(String value) throws FMLManipulationException {
        this.fmlBuffer[29].setValue(0, value);
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
     * Sets the value of the 'MARKET_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @throws FMLManipulationException
     */
    public void set_MARKET_ID(String value) throws FMLManipulationException {
        this.fmlBuffer[30].setValue(0, value);
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
     * Sets the value of the 'ACC_PASSWORD' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @throws FMLManipulationException
     */
    public void set_ACC_PASSWORD(String value) throws FMLManipulationException {
        this.fmlBuffer[31].setValue(0, value);
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
     * Sets the value of the 'VERIFIED_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_VERIFIED_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[32].setValue(0, value);
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
     * Sets the value of the 'CONV_CUST_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 11.
     * @throws FMLManipulationException
     */
    public void set_CONV_CUST_ID(String value) throws FMLManipulationException {
        this.fmlBuffer[33].setValue(0, value);
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
     * Sets the value of the 'BUSINESS_ENTITY' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @throws FMLManipulationException
     */
    public void set_BUSINESS_ENTITY(String value) throws FMLManipulationException {
        this.fmlBuffer[34].setValue(0, value);
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
     * Sets the value of the 'LOCATION' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @throws FMLManipulationException
     */
    public void set_LOCATION(String value) throws FMLManipulationException {
        this.fmlBuffer[35].setValue(0, value);
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
     * Sets the value of the 'CONV_RUN_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CONV_RUN_NO(Integer value) throws FMLManipulationException {
        this.fmlBuffer[36].setValue(0, TypeConverter.integerToShort(value));
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
     * Sets the value of the 'AGE_VERIFICATION_STATUS' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_AGE_VERIFICATION_STATUS(String value) throws FMLManipulationException {
        this.fmlBuffer[37].setValue(0, TypeConverter.stringToByte(value));
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
     * Sets the value of the 'EMPLOYMENT_TYPE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @throws FMLManipulationException
     */
    public void set_EMPLOYMENT_TYPE(String value) throws FMLManipulationException {
        this.fmlBuffer[38].setValue(0, value);
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
     * Sets the value of the 'EMPLOYMENT_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_EMPLOYMENT_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[39].setValue(0, value);
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
     * Sets the value of the 'OPEN_BANK_ACCOUNT_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_OPEN_BANK_ACCOUNT_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[40].setValue(0, value);
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
     * Sets the value of the 'E_POST' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 151.
     * @throws FMLManipulationException
     */
    public void set_E_POST(String value) throws FMLManipulationException {
        this.fmlBuffer[41].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PBANRECROWID' field in the FML buffer.
     *
     * @return Value of 'PBANRECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PBANRECROWID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[42].getValue(0));
    }

    /**
     * Sets the value of the 'PBANRECROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @throws FMLManipulationException
     */
    public void set_PBANRECROWID(String value) throws FMLManipulationException {
        this.fmlBuffer[42].setValue(0, value);
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
     * Sets the value of the 'BAN' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BAN(Integer value) throws FMLManipulationException {
        this.fmlBuffer[43].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PBANRECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @return Value of 'PBANRECSYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PBANRECSYS_CREATION_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[44].getValue(0));
    }

    /**
     * Sets the value of the 'PBANRECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @throws FMLManipulationException
     */
    public void set_PBANRECSYS_CREATION_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[44].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PBANRECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @return Value of 'PBANRECSYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PBANRECSYS_UPDATE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[45].getValue(0));
    }

    /**
     * Sets the value of the 'PBANRECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @throws FMLManipulationException
     */
    public void set_PBANRECSYS_UPDATE_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[45].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PBANRECOPERATOR_ID' field in the FML buffer.
     *
     * @return Value of 'PBANRECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PBANRECOPERATOR_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[46].getValue(0));
    }

    /**
     * Sets the value of the 'PBANRECOPERATOR_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PBANRECOPERATOR_ID(Integer value) throws FMLManipulationException {
        this.fmlBuffer[46].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PBANRECAPPLICATION_ID' field in the FML buffer.
     *
     * @return Value of 'PBANRECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PBANRECAPPLICATION_ID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[47].getValue(0));
    }

    /**
     * Sets the value of the 'PBANRECAPPLICATION_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @throws FMLManipulationException
     */
    public void set_PBANRECAPPLICATION_ID(String value) throws FMLManipulationException {
        this.fmlBuffer[47].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PBANRECCUSTOMER_ID' field in the FML buffer.
     *
     * @return Value of 'PBANRECCUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PBANRECCUSTOMER_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[48].getValue(0));
    }

    /**
     * Sets the value of the 'PBANRECCUSTOMER_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PBANRECCUSTOMER_ID(Integer value) throws FMLManipulationException {
        this.fmlBuffer[48].setValue(0, value);
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
     * Sets the value of the 'START_SERVICE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_START_SERVICE_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[49].setValue(0, value);
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
     * Sets the value of the 'COL_DELINQ_STATUS' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_COL_DELINQ_STATUS(String value) throws FMLManipulationException {
        this.fmlBuffer[50].setValue(0, TypeConverter.stringToByte(value));
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
     * Sets the value of the 'BAN_STATUS' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BAN_STATUS(String value) throws FMLManipulationException {
        this.fmlBuffer[51].setValue(0, TypeConverter.stringToByte(value));
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
     * Sets the value of the 'STATUS_LAST_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_STATUS_LAST_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[52].setValue(0, value);
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
     * Sets the value of the 'STATUS_ACTV_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @throws FMLManipulationException
     */
    public void set_STATUS_ACTV_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[53].setValue(0, value);
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
     * Sets the value of the 'STATUS_ACTV_RSN_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @throws FMLManipulationException
     */
    public void set_STATUS_ACTV_RSN_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[54].setValue(0, value);
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
     * Sets the value of the 'BILL_CYCLE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BILL_CYCLE(Integer value) throws FMLManipulationException {
        this.fmlBuffer[55].setValue(0, TypeConverter.integerToShort(value));
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
     * Sets the value of the 'AR_BALANCE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_AR_BALANCE(Double value) throws FMLManipulationException {
        this.fmlBuffer[56].setValue(0, value);
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
     * Sets the value of the 'BL_CUR_BILL_SEQ_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BL_CUR_BILL_SEQ_NO(Integer value) throws FMLManipulationException {
        this.fmlBuffer[57].setValue(0, TypeConverter.integerToShort(value));
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
     * Sets the value of the 'BL_LAST_RG_CYC_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_BL_LAST_RG_CYC_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[58].setValue(0, value);
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
     * Sets the value of the 'BL_COMPLT_STATUS' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BL_COMPLT_STATUS(String value) throws FMLManipulationException {
        this.fmlBuffer[59].setValue(0, TypeConverter.stringToByte(value));
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
     * Sets the value of the 'BL_SPECIAL_CYCLE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BL_SPECIAL_CYCLE(Integer value) throws FMLManipulationException {
        this.fmlBuffer[60].setValue(0, TypeConverter.integerToShort(value));
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
     * Sets the value of the 'ACCOUNT_SUB_TYPE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 3.
     * @throws FMLManipulationException
     */
    public void set_ACCOUNT_SUB_TYPE(String value) throws FMLManipulationException {
        this.fmlBuffer[61].setValue(0, value);
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
     * Sets the value of the 'BL_MAN_HNDL_RSN' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 3.
     * @throws FMLManipulationException
     */
    public void set_BL_MAN_HNDL_RSN(String value) throws FMLManipulationException {
        this.fmlBuffer[62].setValue(0, value);
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
     * Sets the value of the 'BL_MAN_HNDL_EFF_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_BL_MAN_HNDL_EFF_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[63].setValue(0, value);
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
     * Sets the value of the 'BL_MAN_HNDL_EXP_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_BL_MAN_HNDL_EXP_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[64].setValue(0, value);
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
     * Sets the value of the 'BL_MAN_HNDL_REQ_OPID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BL_MAN_HNDL_REQ_OPID(Integer value) throws FMLManipulationException {
        this.fmlBuffer[65].setValue(0, value);
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
     * Sets the value of the 'BL_MAN_HNDL_BY_OPID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BL_MAN_HNDL_BY_OPID(Integer value) throws FMLManipulationException {
        this.fmlBuffer[66].setValue(0, value);
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
     * Sets the value of the 'BL_REQ_ST_GRACE_PRD' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_BL_REQ_ST_GRACE_PRD(String value) throws FMLManipulationException {
        this.fmlBuffer[67].setValue(0, value);
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
     * Sets the value of the 'BL_REQ_END_GRACE_PRD' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_BL_REQ_END_GRACE_PRD(String value) throws FMLManipulationException {
        this.fmlBuffer[68].setValue(0, value);
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
     * Sets the value of the 'BL_NEXT_CYCLE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BL_NEXT_CYCLE(Integer value) throws FMLManipulationException {
        this.fmlBuffer[69].setValue(0, TypeConverter.integerToShort(value));
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
     * Sets the value of the 'BL_NEXT_CYC_EFF_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_BL_NEXT_CYC_EFF_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[70].setValue(0, value);
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
     * Sets the value of the 'CS_MIN_REQ_CTNS' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CS_MIN_REQ_CTNS(Integer value) throws FMLManipulationException {
        this.fmlBuffer[71].setValue(0, value);
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
     * Sets the value of the 'CS_SPEC_MEMO_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CS_SPEC_MEMO_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[72].setValue(0, TypeConverter.stringToByte(value));
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
     * Sets the value of the 'AR_EXCPT_ACCT_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_AR_EXCPT_ACCT_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[73].setValue(0, TypeConverter.stringToByte(value));
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
     * Sets the value of the 'CS_COM_START_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_CS_COM_START_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[74].setValue(0, value);
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
     * Sets the value of the 'CS_COM_END_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_CS_COM_END_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[75].setValue(0, value);
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
     * Sets the value of the 'CS_COM_REASON_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @throws FMLManipulationException
     */
    public void set_CS_COM_REASON_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[76].setValue(0, value);
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
     * Sets the value of the 'CS_COM_ORIG_NO_MONTH' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CS_COM_ORIG_NO_MONTH(Integer value) throws FMLManipulationException {
        this.fmlBuffer[77].setValue(0, TypeConverter.integerToShort(value));
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
     * Sets the value of the 'AR_WO_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_AR_WO_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[78].setValue(0, TypeConverter.stringToByte(value));
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
     * Sets the value of the 'ACCOUNT_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_ACCOUNT_TYPE(String value) throws FMLManipulationException {
        this.fmlBuffer[79].setValue(0, TypeConverter.stringToByte(value));
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
     * Sets the value of the 'COL_ASSIGNED_COLL' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_COL_ASSIGNED_COLL(String value) throws FMLManipulationException {
        this.fmlBuffer[80].setValue(0, value);
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
     * Sets the value of the 'BL_ZERO_BALANC_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BL_ZERO_BALANC_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[81].setValue(0, TypeConverter.stringToByte(value));
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
     * Sets the value of the 'DEFAULT_SUB_MARKET' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @throws FMLManipulationException
     */
    public void set_DEFAULT_SUB_MARKET(String value) throws FMLManipulationException {
        this.fmlBuffer[82].setValue(0, value);
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
     * Sets the value of the 'BL_DEF_MAILING_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BL_DEF_MAILING_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[83].setValue(0, TypeConverter.stringToByte(value));
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
     * Sets the value of the 'BL_BILL_PROD_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BL_BILL_PROD_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[84].setValue(0, TypeConverter.stringToByte(value));
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
     * Sets the value of the 'BL_BAL_HANDLE_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BL_BAL_HANDLE_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[85].setValue(0, TypeConverter.stringToByte(value));
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
     * Sets the value of the 'BL_NO_MNSP_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BL_NO_MNSP_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[86].setValue(0, TypeConverter.stringToByte(value));
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
     * Sets the value of the 'CS_BAN_TRX_OFF_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CS_BAN_TRX_OFF_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[87].setValue(0, TypeConverter.stringToByte(value));
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
     * Sets the value of the 'CS_HANDLE_BY_CTN_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CS_HANDLE_BY_CTN_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[88].setValue(0, TypeConverter.stringToByte(value));
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
     * Sets the value of the 'CS_LOCK_MECHANISM' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CS_LOCK_MECHANISM(String value) throws FMLManipulationException {
        this.fmlBuffer[89].setValue(0, TypeConverter.stringToByte(value));
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
     * Sets the value of the 'COMP_CRD_LMT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_COMP_CRD_LMT(Double value) throws FMLManipulationException {
        this.fmlBuffer[90].setValue(0, value);
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
     * Sets the value of the 'CREDIT_CLASS' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CREDIT_CLASS(String value) throws FMLManipulationException {
        this.fmlBuffer[91].setValue(0, TypeConverter.stringToByte(value));
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
     * Sets the value of the 'CREDIT_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @throws FMLManipulationException
     */
    public void set_CREDIT_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[92].setValue(0, value);
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
     * Sets the value of the 'CREDIT_SOURCE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CREDIT_SOURCE(String value) throws FMLManipulationException {
        this.fmlBuffer[93].setValue(0, TypeConverter.stringToByte(value));
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
     * Sets the value of the 'CREDIT_STATUS' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 3.
     * @throws FMLManipulationException
     */
    public void set_CREDIT_STATUS(String value) throws FMLManipulationException {
        this.fmlBuffer[94].setValue(0, value);
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
     * Sets the value of the 'EQU_CRD_LMT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_EQU_CRD_LMT(Double value) throws FMLManipulationException {
        this.fmlBuffer[95].setValue(0, value);
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
     * Sets the value of the 'BL_VAT_EXEMPT_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BL_VAT_EXEMPT_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[96].setValue(0, TypeConverter.stringToByte(value));
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
     * Sets the value of the 'BL_VAT_EXEMPT_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_BL_VAT_EXEMPT_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[97].setValue(0, value);
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
     * Sets the value of the 'BL_VAT_EXEMPT_REF_NO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 17.
     * @throws FMLManipulationException
     */
    public void set_BL_VAT_EXEMPT_REF_NO(String value) throws FMLManipulationException {
        this.fmlBuffer[98].setValue(0, value);
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
     * Sets the value of the 'BL_VAT_EXEMPT_RSN_CD' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @throws FMLManipulationException
     */
    public void set_BL_VAT_EXEMPT_RSN_CD(String value) throws FMLManipulationException {
        this.fmlBuffer[99].setValue(0, value);
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
     * Sets the value of the 'DEFAULT_DEPARTMENT' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @throws FMLManipulationException
     */
    public void set_DEFAULT_DEPARTMENT(String value) throws FMLManipulationException {
        this.fmlBuffer[100].setValue(0, value);
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
     * Sets the value of the 'COL_CODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_COL_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[101].setValue(0, TypeConverter.stringToByte(value));
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
     * Sets the value of the 'CURR_ROOT_BAN' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CURR_ROOT_BAN(Integer value) throws FMLManipulationException {
        this.fmlBuffer[102].setValue(0, value);
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
     * Sets the value of the 'NEXT_ROOT_BAN' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_NEXT_ROOT_BAN(Integer value) throws FMLManipulationException {
        this.fmlBuffer[103].setValue(0, value);
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
     * Sets the value of the 'PARTITION_ROOT_BAN' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PARTITION_ROOT_BAN(Integer value) throws FMLManipulationException {
        this.fmlBuffer[104].setValue(0, value);
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
     * Sets the value of the 'CYCLE_FREQUENCY' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CYCLE_FREQUENCY(Integer value) throws FMLManipulationException {
        this.fmlBuffer[105].setValue(0, TypeConverter.integerToShort(value));
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
     * Sets the value of the 'CYCLE_FIRST_BILL_MONTH' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CYCLE_FIRST_BILL_MONTH(Integer value) throws FMLManipulationException {
        this.fmlBuffer[106].setValue(0, TypeConverter.integerToShort(value));
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
     * Sets the value of the 'BL_DUE_DAY' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BL_DUE_DAY(Integer value) throws FMLManipulationException {
        this.fmlBuffer[107].setValue(0, TypeConverter.integerToShort(value));
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
     * Sets the value of the 'VIP_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_VIP_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[108].setValue(0, TypeConverter.stringToByte(value));
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
     * Sets the value of the 'BLACK_LISTED_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BLACK_LISTED_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[109].setValue(0, TypeConverter.stringToByte(value));
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
     * Sets the value of the 'BL_PRT_CATEGORY' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 3.
     * @throws FMLManipulationException
     */
    public void set_BL_PRT_CATEGORY(String value) throws FMLManipulationException {
        this.fmlBuffer[110].setValue(0, value);
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
     * Sets the value of the 'CS_DEF_PRODUCT_TYPE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @throws FMLManipulationException
     */
    public void set_CS_DEF_PRODUCT_TYPE(String value) throws FMLManipulationException {
        this.fmlBuffer[111].setValue(0, value);
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
     * Sets the value of the 'ORG_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @throws FMLManipulationException
     */
    public void set_ORG_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[112].setValue(0, value);
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
     * Sets the value of the 'BL_HIER_BAN_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BL_HIER_BAN_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[113].setValue(0, TypeConverter.stringToByte(value));
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
     * Sets the value of the 'PAYMENT_METHOD' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 3.
     * @throws FMLManipulationException
     */
    public void set_PAYMENT_METHOD(String value) throws FMLManipulationException {
        this.fmlBuffer[114].setValue(0, value);
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
     * Sets the value of the 'PAYMENT_SUB_METHOD' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 3.
     * @throws FMLManipulationException
     */
    public void set_PAYMENT_SUB_METHOD(String value) throws FMLManipulationException {
        this.fmlBuffer[115].setValue(0, value);
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
     * Sets the value of the 'OLD_ACCOUNT_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @throws FMLManipulationException
     */
    public void set_OLD_ACCOUNT_ID(String value) throws FMLManipulationException {
        this.fmlBuffer[116].setValue(0, value);
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
     * Sets the value of the 'CARRY_OVER_BILL' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CARRY_OVER_BILL(String value) throws FMLManipulationException {
        this.fmlBuffer[117].setValue(0, TypeConverter.stringToByte(value));
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
     * Sets the value of the 'HIDE_PHONE_DIGITS_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_HIDE_PHONE_DIGITS_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[118].setValue(0, TypeConverter.stringToByte(value));
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
     * Sets the value of the 'SEC_DEPARTMENT' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @throws FMLManipulationException
     */
    public void set_SEC_DEPARTMENT(String value) throws FMLManipulationException {
        this.fmlBuffer[119].setValue(0, value);
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
     * Sets the value of the 'NEXT_CONF_ROOT_BAN' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_NEXT_CONF_ROOT_BAN(Integer value) throws FMLManipulationException {
        this.fmlBuffer[120].setValue(0, value);
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
     * Sets the value of the 'EDI_LOCATION_NUMBER' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_EDI_LOCATION_NUMBER(Double value) throws FMLManipulationException {
        this.fmlBuffer[121].setValue(0, value);
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
     * Sets the value of the 'ALLOW_ADVERTISING_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_ALLOW_ADVERTISING_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[122].setValue(0, TypeConverter.stringToByte(value));
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
     * Sets the value of the 'AGENCY_REF_NO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_AGENCY_REF_NO(String value) throws FMLManipulationException {
        this.fmlBuffer[123].setValue(0, value);
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
     * Sets the value of the 'COL_AGENCY_CONF_DT' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_COL_AGENCY_CONF_DT(String value) throws FMLManipulationException {
        this.fmlBuffer[124].setValue(0, value);
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
     * Sets the value of the 'BAN_GROUP_NO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 11.
     * @throws FMLManipulationException
     */
    public void set_BAN_GROUP_NO(String value) throws FMLManipulationException {
        this.fmlBuffer[125].setValue(0, value);
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
     * Sets the value of the 'CAAP_TYPE' field in the FML buffer.
     *
     * @param value Default value: B.
     * @throws FMLManipulationException
     */
    public void set_CAAP_TYPE(String value) throws FMLManipulationException {
        this.fmlBuffer[126].setValue(0, TypeConverter.stringToByte(value));
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
     * Sets the value of the 'COL_AGNCY_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_COL_AGNCY_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[127].setValue(0, value);
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
     * Sets the value of the 'INVOICE_FEE_WAIVE_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_INVOICE_FEE_WAIVE_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[128].setValue(0, TypeConverter.stringToByte(value));
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
     * Sets the value of the 'PRD_ZERO_RATE_BILL' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PRD_ZERO_RATE_BILL(String value) throws FMLManipulationException {
        this.fmlBuffer[129].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'CS_CREDIT_CLASS' field in the FML buffer.
     *
     * @return Value of 'CS_CREDIT_CLASS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CS_CREDIT_CLASS() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[130].getValue(0)));
    }

    /**
     * Sets the value of the 'CS_CREDIT_CLASS' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CS_CREDIT_CLASS(String value) throws FMLManipulationException {
        this.fmlBuffer[130].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'CS_APPROVED_CTN_QTY' field in the FML buffer.
     *
     * @return Value of 'CS_APPROVED_CTN_QTY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CS_APPROVED_CTN_QTY() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[131].getValue(0)));
    }

    /**
     * Sets the value of the 'CS_APPROVED_CTN_QTY' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CS_APPROVED_CTN_QTY(Integer value) throws FMLManipulationException {
        this.fmlBuffer[131].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'CAS_ORDER_NUMBER' field in the FML buffer.
     *
     * @return Value of 'CAS_ORDER_NUMBER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CAS_ORDER_NUMBER() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[132].getValue(0));
    }

    /**
     * Sets the value of the 'CAS_ORDER_NUMBER' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CAS_ORDER_NUMBER(Integer value) throws FMLManipulationException {
        this.fmlBuffer[132].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PCTNAGRPRMRECBAN' field in the FML buffer.
     *
     * @return Value of 'PCTNAGRPRMRECBAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PCTNAGRPRMRECBAN() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[133].getValue(0));
    }

    /**
     * Sets the value of the 'PCTNAGRPRMRECBAN' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PCTNAGRPRMRECBAN(Integer value) throws FMLManipulationException {
        this.fmlBuffer[133].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'BAN_ROWID' field in the FML buffer.
     *
     * @return Value of 'BAN_ROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BAN_ROWID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[134].getValue(0));
    }

    /**
     * Sets the value of the 'BAN_ROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @throws FMLManipulationException
     */
    public void set_BAN_ROWID(String value) throws FMLManipulationException {
        this.fmlBuffer[134].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PCTNAGRPRMRECCUSTOMER_ID' field in the FML buffer.
     *
     * @return Value of 'PCTNAGRPRMRECCUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PCTNAGRPRMRECCUSTOMER_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[135].getValue(0));
    }

    /**
     * Sets the value of the 'PCTNAGRPRMRECCUSTOMER_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PCTNAGRPRMRECCUSTOMER_ID(Integer value) throws FMLManipulationException {
        this.fmlBuffer[135].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CUSTOMER_ROWID' field in the FML buffer.
     *
     * @return Value of 'CUSTOMER_ROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CUSTOMER_ROWID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[136].getValue(0));
    }

    /**
     * Sets the value of the 'CUSTOMER_ROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @throws FMLManipulationException
     */
    public void set_CUSTOMER_ROWID(String value) throws FMLManipulationException {
        this.fmlBuffer[136].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'SUBSCRIBER_NO' field in the FML buffer.
     *
     * @return Value of 'SUBSCRIBER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUBSCRIBER_NO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[137].getValue(0));
    }

    /**
     * Sets the value of the 'SUBSCRIBER_NO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @throws FMLManipulationException
     */
    public void set_SUBSCRIBER_NO(String value) throws FMLManipulationException {
        this.fmlBuffer[137].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CTN_ROWID' field in the FML buffer.
     *
     * @return Value of 'CTN_ROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CTN_ROWID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[138].getValue(0));
    }

    /**
     * Sets the value of the 'CTN_ROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @throws FMLManipulationException
     */
    public void set_CTN_ROWID(String value) throws FMLManipulationException {
        this.fmlBuffer[138].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PCTNRECROWID' field in the FML buffer.
     *
     * @return Value of 'PCTNRECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PCTNRECROWID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[139].getValue(0));
    }

    /**
     * Sets the value of the 'PCTNRECROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @throws FMLManipulationException
     */
    public void set_PCTNRECROWID(String value) throws FMLManipulationException {
        this.fmlBuffer[139].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PCTNRECSUBSCRIBER_NO' field in the FML buffer.
     *
     * @return Value of 'PCTNRECSUBSCRIBER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PCTNRECSUBSCRIBER_NO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[140].getValue(0));
    }

    /**
     * Sets the value of the 'PCTNRECSUBSCRIBER_NO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @throws FMLManipulationException
     */
    public void set_PCTNRECSUBSCRIBER_NO(String value) throws FMLManipulationException {
        this.fmlBuffer[140].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PCTNRECCUSTOMER_ID' field in the FML buffer.
     *
     * @return Value of 'PCTNRECCUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PCTNRECCUSTOMER_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[141].getValue(0));
    }

    /**
     * Sets the value of the 'PCTNRECCUSTOMER_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PCTNRECCUSTOMER_ID(Integer value) throws FMLManipulationException {
        this.fmlBuffer[141].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PCTNRECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @return Value of 'PCTNRECSYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PCTNRECSYS_CREATION_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[142].getValue(0));
    }

    /**
     * Sets the value of the 'PCTNRECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @throws FMLManipulationException
     */
    public void set_PCTNRECSYS_CREATION_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[142].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PCTNRECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @return Value of 'PCTNRECSYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PCTNRECSYS_UPDATE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[143].getValue(0));
    }

    /**
     * Sets the value of the 'PCTNRECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @throws FMLManipulationException
     */
    public void set_PCTNRECSYS_UPDATE_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[143].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PCTNRECOPERATOR_ID' field in the FML buffer.
     *
     * @return Value of 'PCTNRECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PCTNRECOPERATOR_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[144].getValue(0));
    }

    /**
     * Sets the value of the 'PCTNRECOPERATOR_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PCTNRECOPERATOR_ID(Integer value) throws FMLManipulationException {
        this.fmlBuffer[144].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PCTNRECAPPLICATION_ID' field in the FML buffer.
     *
     * @return Value of 'PCTNRECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PCTNRECAPPLICATION_ID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[145].getValue(0));
    }

    /**
     * Sets the value of the 'PCTNRECAPPLICATION_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @throws FMLManipulationException
     */
    public void set_PCTNRECAPPLICATION_ID(String value) throws FMLManipulationException {
        this.fmlBuffer[145].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PCTNRECDL_SERVICE_CODE' field in the FML buffer.
     *
     * @return Value of 'PCTNRECDL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PCTNRECDL_SERVICE_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[146].getValue(0));
    }

    /**
     * Sets the value of the 'PCTNRECDL_SERVICE_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @throws FMLManipulationException
     */
    public void set_PCTNRECDL_SERVICE_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[146].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PCTNRECDL_UPDATE_STAMP' field in the FML buffer.
     *
     * @return Value of 'PCTNRECDL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PCTNRECDL_UPDATE_STAMP() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[147].getValue(0)));
    }

    /**
     * Sets the value of the 'PCTNRECDL_UPDATE_STAMP' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PCTNRECDL_UPDATE_STAMP(Integer value) throws FMLManipulationException {
        this.fmlBuffer[147].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'EFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Value of 'EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EFFECTIVE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[148].getValue(0));
    }

    /**
     * Sets the value of the 'EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @throws FMLManipulationException
     */
    public void set_EFFECTIVE_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[148].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'INIT_ACTIVATION_DATE' field in the FML buffer.
     *
     * @return Value of 'INIT_ACTIVATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_INIT_ACTIVATION_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[149].getValue(0));
    }

    /**
     * Sets the value of the 'INIT_ACTIVATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_INIT_ACTIVATION_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[149].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'SUB_STATUS' field in the FML buffer.
     *
     * @return Value of 'SUB_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUB_STATUS() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[150].getValue(0)));
    }

    /**
     * Sets the value of the 'SUB_STATUS' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_SUB_STATUS(String value) throws FMLManipulationException {
        this.fmlBuffer[150].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'SUB_STATUS_DATE' field in the FML buffer.
     *
     * @return Value of 'SUB_STATUS_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUB_STATUS_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[151].getValue(0));
    }

    /**
     * Sets the value of the 'SUB_STATUS_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_SUB_STATUS_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[151].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'ORIGINAL_INIT_DATE' field in the FML buffer.
     *
     * @return Value of 'ORIGINAL_INIT_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ORIGINAL_INIT_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[152].getValue(0));
    }

    /**
     * Sets the value of the 'ORIGINAL_INIT_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @throws FMLManipulationException
     */
    public void set_ORIGINAL_INIT_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[152].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'SUB_STATUS_LAST_ACT' field in the FML buffer.
     *
     * @return Value of 'SUB_STATUS_LAST_ACT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUB_STATUS_LAST_ACT() throws FMLManipulationException {
        return ((String) this.fmlBuffer[153].getValue(0));
    }

    /**
     * Sets the value of the 'SUB_STATUS_LAST_ACT' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @throws FMLManipulationException
     */
    public void set_SUB_STATUS_LAST_ACT(String value) throws FMLManipulationException {
        this.fmlBuffer[153].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'SUB_STATUS_RSN_CODE' field in the FML buffer.
     *
     * @return Value of 'SUB_STATUS_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUB_STATUS_RSN_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[154].getValue(0));
    }

    /**
     * Sets the value of the 'SUB_STATUS_RSN_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @throws FMLManipulationException
     */
    public void set_SUB_STATUS_RSN_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[154].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PRODUCT_TYPE' field in the FML buffer.
     *
     * @return Value of 'PRODUCT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PRODUCT_TYPE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[155].getValue(0));
    }

    /**
     * Sets the value of the 'PRODUCT_TYPE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @throws FMLManipulationException
     */
    public void set_PRODUCT_TYPE(String value) throws FMLManipulationException {
        this.fmlBuffer[155].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CUSTOMER_BAN' field in the FML buffer.
     *
     * @return Value of 'CUSTOMER_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CUSTOMER_BAN() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[156].getValue(0));
    }

    /**
     * Sets the value of the 'CUSTOMER_BAN' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CUSTOMER_BAN(Integer value) throws FMLManipulationException {
        this.fmlBuffer[156].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CTN_SEQ_NO' field in the FML buffer.
     *
     * @return Value of 'CTN_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CTN_SEQ_NO() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[157].getValue(0));
    }

    /**
     * Sets the value of the 'CTN_SEQ_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CTN_SEQ_NO(Integer value) throws FMLManipulationException {
        this.fmlBuffer[157].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'REQ_ST_GRACE_PERIOD' field in the FML buffer.
     *
     * @return Value of 'REQ_ST_GRACE_PERIOD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_REQ_ST_GRACE_PERIOD() throws FMLManipulationException {
        return ((String) this.fmlBuffer[158].getValue(0));
    }

    /**
     * Sets the value of the 'REQ_ST_GRACE_PERIOD' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_REQ_ST_GRACE_PERIOD(String value) throws FMLManipulationException {
        this.fmlBuffer[158].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'REQ_END_GRACE_PERIOD' field in the FML buffer.
     *
     * @return Value of 'REQ_END_GRACE_PERIOD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_REQ_END_GRACE_PERIOD() throws FMLManipulationException {
        return ((String) this.fmlBuffer[159].getValue(0));
    }

    /**
     * Sets the value of the 'REQ_END_GRACE_PERIOD' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_REQ_END_GRACE_PERIOD(String value) throws FMLManipulationException {
        this.fmlBuffer[159].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'COMMIT_START_DATE' field in the FML buffer.
     *
     * @return Value of 'COMMIT_START_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COMMIT_START_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[160].getValue(0));
    }

    /**
     * Sets the value of the 'COMMIT_START_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_COMMIT_START_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[160].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'COMMIT_END_DATE' field in the FML buffer.
     *
     * @return Value of 'COMMIT_END_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COMMIT_END_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[161].getValue(0));
    }

    /**
     * Sets the value of the 'COMMIT_END_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_COMMIT_END_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[161].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'COMMIT_REASON_CODE' field in the FML buffer.
     *
     * @return Value of 'COMMIT_REASON_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COMMIT_REASON_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[162].getValue(0));
    }

    /**
     * Sets the value of the 'COMMIT_REASON_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @throws FMLManipulationException
     */
    public void set_COMMIT_REASON_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[162].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'COMMIT_ORIG_NO_MONTH' field in the FML buffer.
     *
     * @return Value of 'COMMIT_ORIG_NO_MONTH' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_COMMIT_ORIG_NO_MONTH() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[163].getValue(0)));
    }

    /**
     * Sets the value of the 'COMMIT_ORIG_NO_MONTH' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_COMMIT_ORIG_NO_MONTH(Integer value) throws FMLManipulationException {
        this.fmlBuffer[163].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'SUSP_RC_RATE_TYPE' field in the FML buffer.
     *
     * @return Value of 'SUSP_RC_RATE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUSP_RC_RATE_TYPE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[164].getValue(0)));
    }

    /**
     * Sets the value of the 'SUSP_RC_RATE_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_SUSP_RC_RATE_TYPE(String value) throws FMLManipulationException {
        this.fmlBuffer[164].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'CONTRACT_NO' field in the FML buffer.
     *
     * @return Value of 'CONTRACT_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CONTRACT_NO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[165].getValue(0));
    }

    /**
     * Sets the value of the 'CONTRACT_NO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 11.
     * @throws FMLManipulationException
     */
    public void set_CONTRACT_NO(String value) throws FMLManipulationException {
        this.fmlBuffer[165].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CNT_SEQ_NO' field in the FML buffer.
     *
     * @return Value of 'CNT_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CNT_SEQ_NO() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[166].getValue(0));
    }

    /**
     * Sets the value of the 'CNT_SEQ_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CNT_SEQ_NO(Integer value) throws FMLManipulationException {
        this.fmlBuffer[166].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PCTNRECDEALER_CODE' field in the FML buffer.
     *
     * @return Value of 'PCTNRECDEALER_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PCTNRECDEALER_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[167].getValue(0));
    }

    /**
     * Sets the value of the 'PCTNRECDEALER_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @throws FMLManipulationException
     */
    public void set_PCTNRECDEALER_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[167].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'ORG_DEALER_CODE' field in the FML buffer.
     *
     * @return Value of 'ORG_DEALER_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ORG_DEALER_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[168].getValue(0));
    }

    /**
     * Sets the value of the 'ORG_DEALER_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @throws FMLManipulationException
     */
    public void set_ORG_DEALER_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[168].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PCTNRECSALES_AGENT' field in the FML buffer.
     *
     * @return Value of 'PCTNRECSALES_AGENT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PCTNRECSALES_AGENT() throws FMLManipulationException {
        return ((String) this.fmlBuffer[169].getValue(0));
    }

    /**
     * Sets the value of the 'PCTNRECSALES_AGENT' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @throws FMLManipulationException
     */
    public void set_PCTNRECSALES_AGENT(String value) throws FMLManipulationException {
        this.fmlBuffer[169].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'ORG_SALES_AGENT' field in the FML buffer.
     *
     * @return Value of 'ORG_SALES_AGENT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ORG_SALES_AGENT() throws FMLManipulationException {
        return ((String) this.fmlBuffer[170].getValue(0));
    }

    /**
     * Sets the value of the 'ORG_SALES_AGENT' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @throws FMLManipulationException
     */
    public void set_ORG_SALES_AGENT(String value) throws FMLManipulationException {
        this.fmlBuffer[170].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'REQ_DEPOSIT_AMT' field in the FML buffer.
     *
     * @return Value of 'REQ_DEPOSIT_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_REQ_DEPOSIT_AMT() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[171].getValue(0));
    }

    /**
     * Sets the value of the 'REQ_DEPOSIT_AMT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_REQ_DEPOSIT_AMT(Double value) throws FMLManipulationException {
        this.fmlBuffer[171].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'LEADING_NUMBER' field in the FML buffer.
     *
     * @return Value of 'LEADING_NUMBER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LEADING_NUMBER() throws FMLManipulationException {
        return ((String) this.fmlBuffer[172].getValue(0));
    }

    /**
     * Sets the value of the 'LEADING_NUMBER' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @throws FMLManipulationException
     */
    public void set_LEADING_NUMBER(String value) throws FMLManipulationException {
        this.fmlBuffer[172].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PABX_IND' field in the FML buffer.
     *
     * @return Value of 'PABX_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PABX_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[173].getValue(0)));
    }

    /**
     * Sets the value of the 'PABX_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PABX_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[173].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'NEXT_CTN' field in the FML buffer.
     *
     * @return Value of 'NEXT_CTN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NEXT_CTN() throws FMLManipulationException {
        return ((String) this.fmlBuffer[174].getValue(0));
    }

    /**
     * Sets the value of the 'NEXT_CTN' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @throws FMLManipulationException
     */
    public void set_NEXT_CTN(String value) throws FMLManipulationException {
        this.fmlBuffer[174].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'NEXT_CTN_CHG_DATE' field in the FML buffer.
     *
     * @return Value of 'NEXT_CTN_CHG_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NEXT_CTN_CHG_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[175].getValue(0));
    }

    /**
     * Sets the value of the 'NEXT_CTN_CHG_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_NEXT_CTN_CHG_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[175].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PRV_CTN' field in the FML buffer.
     *
     * @return Value of 'PRV_CTN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PRV_CTN() throws FMLManipulationException {
        return ((String) this.fmlBuffer[176].getValue(0));
    }

    /**
     * Sets the value of the 'PRV_CTN' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @throws FMLManipulationException
     */
    public void set_PRV_CTN(String value) throws FMLManipulationException {
        this.fmlBuffer[176].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PRV_CTN_CHG_DATE' field in the FML buffer.
     *
     * @return Value of 'PRV_CTN_CHG_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PRV_CTN_CHG_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[177].getValue(0));
    }

    /**
     * Sets the value of the 'PRV_CTN_CHG_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_PRV_CTN_CHG_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[177].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'NEXT_BAN' field in the FML buffer.
     *
     * @return Value of 'NEXT_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NEXT_BAN() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[178].getValue(0));
    }

    /**
     * Sets the value of the 'NEXT_BAN' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_NEXT_BAN(Integer value) throws FMLManipulationException {
        this.fmlBuffer[178].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'NEXT_BAN_MOVE_DATE' field in the FML buffer.
     *
     * @return Value of 'NEXT_BAN_MOVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NEXT_BAN_MOVE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[179].getValue(0));
    }

    /**
     * Sets the value of the 'NEXT_BAN_MOVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_NEXT_BAN_MOVE_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[179].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PRV_BAN' field in the FML buffer.
     *
     * @return Value of 'PRV_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PRV_BAN() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[180].getValue(0));
    }

    /**
     * Sets the value of the 'PRV_BAN' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PRV_BAN(Integer value) throws FMLManipulationException {
        this.fmlBuffer[180].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PRV_BAN_MOVE_DATE' field in the FML buffer.
     *
     * @return Value of 'PRV_BAN_MOVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PRV_BAN_MOVE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[181].getValue(0));
    }

    /**
     * Sets the value of the 'PRV_BAN_MOVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_PRV_BAN_MOVE_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[181].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'SUB_STS_ISSUE_DATE' field in the FML buffer.
     *
     * @return Value of 'SUB_STS_ISSUE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUB_STS_ISSUE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[182].getValue(0));
    }

    /**
     * Sets the value of the 'SUB_STS_ISSUE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_SUB_STS_ISSUE_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[182].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'ACTIVATE_WAIVE_RSN' field in the FML buffer.
     *
     * @return Value of 'ACTIVATE_WAIVE_RSN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACTIVATE_WAIVE_RSN() throws FMLManipulationException {
        return ((String) this.fmlBuffer[183].getValue(0));
    }

    /**
     * Sets the value of the 'ACTIVATE_WAIVE_RSN' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @throws FMLManipulationException
     */
    public void set_ACTIVATE_WAIVE_RSN(String value) throws FMLManipulationException {
        this.fmlBuffer[183].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'EARLIEST_ACTV_DATE' field in the FML buffer.
     *
     * @return Value of 'EARLIEST_ACTV_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EARLIEST_ACTV_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[184].getValue(0));
    }

    /**
     * Sets the value of the 'EARLIEST_ACTV_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_EARLIEST_ACTV_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[184].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'SUB_ACTV_LOCATION' field in the FML buffer.
     *
     * @return Value of 'SUB_ACTV_LOCATION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUB_ACTV_LOCATION() throws FMLManipulationException {
        return ((String) this.fmlBuffer[185].getValue(0));
    }

    /**
     * Sets the value of the 'SUB_ACTV_LOCATION' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @throws FMLManipulationException
     */
    public void set_SUB_ACTV_LOCATION(String value) throws FMLManipulationException {
        this.fmlBuffer[185].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CUST_WATCH_LMT' field in the FML buffer.
     *
     * @return Value of 'CUST_WATCH_LMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_CUST_WATCH_LMT() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[186].getValue(0));
    }

    /**
     * Sets the value of the 'CUST_WATCH_LMT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CUST_WATCH_LMT(Double value) throws FMLManipulationException {
        this.fmlBuffer[186].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CUST_WATCH_DATE' field in the FML buffer.
     *
     * @return Value of 'CUST_WATCH_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CUST_WATCH_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[187].getValue(0));
    }

    /**
     * Sets the value of the 'CUST_WATCH_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_CUST_WATCH_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[187].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'BASIC_WATCH_LMT' field in the FML buffer.
     *
     * @return Value of 'BASIC_WATCH_LMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_BASIC_WATCH_LMT() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[188].getValue(0));
    }

    /**
     * Sets the value of the 'BASIC_WATCH_LMT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BASIC_WATCH_LMT(Double value) throws FMLManipulationException {
        this.fmlBuffer[188].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CREDIT_WATCH_PIN_CD' field in the FML buffer.
     *
     * @return Value of 'CREDIT_WATCH_PIN_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CREDIT_WATCH_PIN_CD() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[189].getValue(0)));
    }

    /**
     * Sets the value of the 'CREDIT_WATCH_PIN_CD' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CREDIT_WATCH_PIN_CD(Integer value) throws FMLManipulationException {
        this.fmlBuffer[189].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'SUB_MARKET_CODE' field in the FML buffer.
     *
     * @return Value of 'SUB_MARKET_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUB_MARKET_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[190].getValue(0));
    }

    /**
     * Sets the value of the 'SUB_MARKET_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @throws FMLManipulationException
     */
    public void set_SUB_MARKET_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[190].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'LIMIT_RESERVED_DAYS' field in the FML buffer.
     *
     * @return Value of 'LIMIT_RESERVED_DAYS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LIMIT_RESERVED_DAYS() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[191].getValue(0)));
    }

    /**
     * Sets the value of the 'LIMIT_RESERVED_DAYS' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_LIMIT_RESERVED_DAYS(Integer value) throws FMLManipulationException {
        this.fmlBuffer[191].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'FF_EXPIRATION_DATE' field in the FML buffer.
     *
     * @return Value of 'FF_EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FF_EXPIRATION_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[192].getValue(0));
    }

    /**
     * Sets the value of the 'FF_EXPIRATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @throws FMLManipulationException
     */
    public void set_FF_EXPIRATION_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[192].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'FLEX_IND' field in the FML buffer.
     *
     * @return Value of 'FLEX_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FLEX_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[193].getValue(0)));
    }

    /**
     * Sets the value of the 'FLEX_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_FLEX_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[193].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'DUO_IND' field in the FML buffer.
     *
     * @return Value of 'DUO_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DUO_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[194].getValue(0)));
    }

    /**
     * Sets the value of the 'DUO_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_DUO_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[194].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'LISTED_IND' field in the FML buffer.
     *
     * @return Value of 'LISTED_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LISTED_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[195].getValue(0)));
    }

    /**
     * Sets the value of the 'LISTED_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_LISTED_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[195].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'SUB_DEPARTMENT_CD' field in the FML buffer.
     *
     * @return Value of 'SUB_DEPARTMENT_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUB_DEPARTMENT_CD() throws FMLManipulationException {
        return ((String) this.fmlBuffer[196].getValue(0));
    }

    /**
     * Sets the value of the 'SUB_DEPARTMENT_CD' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @throws FMLManipulationException
     */
    public void set_SUB_DEPARTMENT_CD(String value) throws FMLManipulationException {
        this.fmlBuffer[196].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'LAST_SUBS_DISC_DT' field in the FML buffer.
     *
     * @return Value of 'LAST_SUBS_DISC_DT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LAST_SUBS_DISC_DT() throws FMLManipulationException {
        return ((String) this.fmlBuffer[197].getValue(0));
    }

    /**
     * Sets the value of the 'LAST_SUBS_DISC_DT' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_LAST_SUBS_DISC_DT(String value) throws FMLManipulationException {
        this.fmlBuffer[197].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'LAST_SUBS_DISC_DT_UD' field in the FML buffer.
     *
     * @return Value of 'LAST_SUBS_DISC_DT_UD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LAST_SUBS_DISC_DT_UD() throws FMLManipulationException {
        return ((String) this.fmlBuffer[198].getValue(0));
    }

    /**
     * Sets the value of the 'LAST_SUBS_DISC_DT_UD' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_LAST_SUBS_DISC_DT_UD(String value) throws FMLManipulationException {
        this.fmlBuffer[198].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'LAST_SUBSCR_DISC_SN' field in the FML buffer.
     *
     * @return Value of 'LAST_SUBSCR_DISC_SN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LAST_SUBSCR_DISC_SN() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[199].getValue(0)));
    }

    /**
     * Sets the value of the 'LAST_SUBSCR_DISC_SN' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_LAST_SUBSCR_DISC_SN(Integer value) throws FMLManipulationException {
        this.fmlBuffer[199].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'LAST_SUBSCR_DISC_SN_UD' field in the FML buffer.
     *
     * @return Value of 'LAST_SUBSCR_DISC_SN_UD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LAST_SUBSCR_DISC_SN_UD() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[200].getValue(0)));
    }

    /**
     * Sets the value of the 'LAST_SUBSCR_DISC_SN_UD' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_LAST_SUBSCR_DISC_SN_UD(Integer value) throws FMLManipulationException {
        this.fmlBuffer[200].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'PNI' field in the FML buffer.
     *
     * @return Value of 'PNI' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PNI() throws FMLManipulationException {
        return ((String) this.fmlBuffer[201].getValue(0));
    }

    /**
     * Sets the value of the 'PNI' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 11.
     * @throws FMLManipulationException
     */
    public void set_PNI(String value) throws FMLManipulationException {
        this.fmlBuffer[201].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'RMS_REF_STORE_ID' field in the FML buffer.
     *
     * @return Value of 'RMS_REF_STORE_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_RMS_REF_STORE_ID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[202].getValue(0));
    }

    /**
     * Sets the value of the 'RMS_REF_STORE_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @throws FMLManipulationException
     */
    public void set_RMS_REF_STORE_ID(String value) throws FMLManipulationException {
        this.fmlBuffer[202].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'RMS_REF_TYPE' field in the FML buffer.
     *
     * @return Value of 'RMS_REF_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_RMS_REF_TYPE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[203].getValue(0)));
    }

    /**
     * Sets the value of the 'RMS_REF_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_RMS_REF_TYPE(String value) throws FMLManipulationException {
        this.fmlBuffer[203].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'RMS_REF_OD' field in the FML buffer.
     *
     * @return Value of 'RMS_REF_OD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_RMS_REF_OD() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[204].getValue(0));
    }

    /**
     * Sets the value of the 'RMS_REF_OD' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_RMS_REF_OD(Integer value) throws FMLManipulationException {
        this.fmlBuffer[204].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'DLR_ACT_FEE' field in the FML buffer.
     *
     * @return Value of 'DLR_ACT_FEE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_DLR_ACT_FEE() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[205].getValue(0));
    }

    /**
     * Sets the value of the 'DLR_ACT_FEE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_DLR_ACT_FEE(Double value) throws FMLManipulationException {
        this.fmlBuffer[205].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PREP_AMOUNT' field in the FML buffer.
     *
     * @return Value of 'PREP_AMOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_PREP_AMOUNT() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[206].getValue(0));
    }

    /**
     * Sets the value of the 'PREP_AMOUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PREP_AMOUNT(Double value) throws FMLManipulationException {
        this.fmlBuffer[206].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'SUBSCRIBER_ID' field in the FML buffer.
     *
     * @return Value of 'SUBSCRIBER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_SUBSCRIBER_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[207].getValue(0));
    }

    /**
     * Sets the value of the 'SUBSCRIBER_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_SUBSCRIBER_ID(Integer value) throws FMLManipulationException {
        this.fmlBuffer[207].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'SUB_LANG' field in the FML buffer.
     *
     * @return Value of 'SUB_LANG' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUB_LANG() throws FMLManipulationException {
        return ((String) this.fmlBuffer[208].getValue(0));
    }

    /**
     * Sets the value of the 'SUB_LANG' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 3.
     * @throws FMLManipulationException
     */
    public void set_SUB_LANG(String value) throws FMLManipulationException {
        this.fmlBuffer[208].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'SMS_RCV_STYLE_CODE' field in the FML buffer.
     *
     * @return Value of 'SMS_RCV_STYLE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SMS_RCV_STYLE_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[209].getValue(0));
    }

    /**
     * Sets the value of the 'SMS_RCV_STYLE_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 3.
     * @throws FMLManipulationException
     */
    public void set_SMS_RCV_STYLE_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[209].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PCTNRECCONV_RUN_NO' field in the FML buffer.
     *
     * @return Value of 'PCTNRECCONV_RUN_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PCTNRECCONV_RUN_NO() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[210].getValue(0)));
    }

    /**
     * Sets the value of the 'PCTNRECCONV_RUN_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PCTNRECCONV_RUN_NO(Integer value) throws FMLManipulationException {
        this.fmlBuffer[210].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'PCTNRECALLOW_ADVERTISING_IND' field in the FML buffer.
     *
     * @return Value of 'PCTNRECALLOW_ADVERTISING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PCTNRECALLOW_ADVERTISING_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[211].getValue(0)));
    }

    /**
     * Sets the value of the 'PCTNRECALLOW_ADVERTISING_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PCTNRECALLOW_ADVERTISING_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[211].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'IVR_WRONG_ACCESS_NO' field in the FML buffer.
     *
     * @return Value of 'IVR_WRONG_ACCESS_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_IVR_WRONG_ACCESS_NO() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[212].getValue(0)));
    }

    /**
     * Sets the value of the 'IVR_WRONG_ACCESS_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_IVR_WRONG_ACCESS_NO(Integer value) throws FMLManipulationException {
        this.fmlBuffer[212].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'THRESHOLD_AMT' field in the FML buffer.
     *
     * @return Value of 'THRESHOLD_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_THRESHOLD_AMT() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[213].getValue(0));
    }

    /**
     * Sets the value of the 'THRESHOLD_AMT' field in the FML buffer.
     *
     * @param value Default value: 999999999.99.
     * @throws FMLManipulationException
     */
    public void set_THRESHOLD_AMT(Double value) throws FMLManipulationException {
        this.fmlBuffer[213].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PUBLISH_LEVEL' field in the FML buffer.
     *
     * @return Value of 'PUBLISH_LEVEL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PUBLISH_LEVEL() throws FMLManipulationException {
        return ((String) this.fmlBuffer[214].getValue(0));
    }

    /**
     * Sets the value of the 'PUBLISH_LEVEL' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 31.
     * @throws FMLManipulationException
     */
    public void set_PUBLISH_LEVEL(String value) throws FMLManipulationException {
        this.fmlBuffer[214].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'AUTO_RELEASE_IND' field in the FML buffer.
     *
     * @return Value of 'AUTO_RELEASE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_AUTO_RELEASE_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[215].getValue(0)));
    }

    /**
     * Sets the value of the 'AUTO_RELEASE_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_AUTO_RELEASE_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[215].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'CUST_WATCH_EFF_DATE' field in the FML buffer.
     *
     * @return Value of 'CUST_WATCH_EFF_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CUST_WATCH_EFF_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[216].getValue(0));
    }

    /**
     * Sets the value of the 'CUST_WATCH_EFF_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_CUST_WATCH_EFF_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[216].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CUST_WATCH_EXP_DATE' field in the FML buffer.
     *
     * @return Value of 'CUST_WATCH_EXP_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CUST_WATCH_EXP_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[217].getValue(0));
    }

    /**
     * Sets the value of the 'CUST_WATCH_EXP_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_CUST_WATCH_EXP_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[217].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'OPERATOR_CW_LMT' field in the FML buffer.
     *
     * @return Value of 'OPERATOR_CW_LMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_OPERATOR_CW_LMT() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[218].getValue(0));
    }

    /**
     * Sets the value of the 'OPERATOR_CW_LMT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_OPERATOR_CW_LMT(Double value) throws FMLManipulationException {
        this.fmlBuffer[218].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'SEND_SMS_FOR_MATCH' field in the FML buffer.
     *
     * @return Value of 'SEND_SMS_FOR_MATCH' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SEND_SMS_FOR_MATCH() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[219].getValue(0)));
    }

    /**
     * Sets the value of the 'SEND_SMS_FOR_MATCH' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_SEND_SMS_FOR_MATCH(String value) throws FMLManipulationException {
        this.fmlBuffer[219].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'CPS_STATUS' field in the FML buffer.
     *
     * @return Value of 'CPS_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CPS_STATUS() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[220].getValue(0)));
    }

    /**
     * Sets the value of the 'CPS_STATUS' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CPS_STATUS(String value) throws FMLManipulationException {
        this.fmlBuffer[220].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'CPS_TRANSACTION' field in the FML buffer.
     *
     * @return Value of 'CPS_TRANSACTION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CPS_TRANSACTION() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[221].getValue(0)));
    }

    /**
     * Sets the value of the 'CPS_TRANSACTION' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CPS_TRANSACTION(Integer value) throws FMLManipulationException {
        this.fmlBuffer[221].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'CPS_TYPE' field in the FML buffer.
     *
     * @return Value of 'CPS_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CPS_TYPE() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[222].getValue(0)));
    }

    /**
     * Sets the value of the 'CPS_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CPS_TYPE(Integer value) throws FMLManipulationException {
        this.fmlBuffer[222].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'ISP_PASS' field in the FML buffer.
     *
     * @return Value of 'ISP_PASS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ISP_PASS() throws FMLManipulationException {
        return ((String) this.fmlBuffer[223].getValue(0));
    }

    /**
     * Sets the value of the 'ISP_PASS' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 31.
     * @throws FMLManipulationException
     */
    public void set_ISP_PASS(String value) throws FMLManipulationException {
        this.fmlBuffer[223].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'ISP_TYPE' field in the FML buffer.
     *
     * @return Value of 'ISP_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ISP_TYPE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[224].getValue(0));
    }

    /**
     * Sets the value of the 'ISP_TYPE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 3.
     * @throws FMLManipulationException
     */
    public void set_ISP_TYPE(String value) throws FMLManipulationException {
        this.fmlBuffer[224].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'OPERATOR_TMP_DATE' field in the FML buffer.
     *
     * @return Value of 'OPERATOR_TMP_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_OPERATOR_TMP_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[225].getValue(0));
    }

    /**
     * Sets the value of the 'OPERATOR_TMP_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_OPERATOR_TMP_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[225].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'OPERATOR_TMP_LMT' field in the FML buffer.
     *
     * @return Value of 'OPERATOR_TMP_LMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_OPERATOR_TMP_LMT() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[226].getValue(0));
    }

    /**
     * Sets the value of the 'OPERATOR_TMP_LMT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_OPERATOR_TMP_LMT(Double value) throws FMLManipulationException {
        this.fmlBuffer[226].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'SUB_ORG_CD' field in the FML buffer.
     *
     * @return Value of 'SUB_ORG_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUB_ORG_CD() throws FMLManipulationException {
        return ((String) this.fmlBuffer[227].getValue(0));
    }

    /**
     * Sets the value of the 'SUB_ORG_CD' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 11.
     * @throws FMLManipulationException
     */
    public void set_SUB_ORG_CD(String value) throws FMLManipulationException {
        this.fmlBuffer[227].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'ORG_MEMBER_NO' field in the FML buffer.
     *
     * @return Value of 'ORG_MEMBER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ORG_MEMBER_NO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[228].getValue(0));
    }

    /**
     * Sets the value of the 'ORG_MEMBER_NO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @throws FMLManipulationException
     */
    public void set_ORG_MEMBER_NO(String value) throws FMLManipulationException {
        this.fmlBuffer[228].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'FULLTABLE' field in the FML buffer.
     *
     * @return Value of 'FULLTABLE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FULLTABLE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[229].getValue(0)));
    }

    /**
     * Sets the value of the 'FULLTABLE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_FULLTABLE(String value) throws FMLManipulationException {
        this.fmlBuffer[229].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'PAPER_WORK_STATUS' field in the FML buffer.
     *
     * @return Value of 'PAPER_WORK_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAPER_WORK_STATUS() throws FMLManipulationException {
        return ((String) this.fmlBuffer[230].getValue(0));
    }

    /**
     * Sets the value of the 'PAPER_WORK_STATUS' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 3.
     * @throws FMLManipulationException
     */
    public void set_PAPER_WORK_STATUS(String value) throws FMLManipulationException {
        this.fmlBuffer[230].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PAPER_WORK_REQUIRED' field in the FML buffer.
     *
     * @return Value of 'PAPER_WORK_REQUIRED' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAPER_WORK_REQUIRED() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[231].getValue(0)));
    }

    /**
     * Sets the value of the 'PAPER_WORK_REQUIRED' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PAPER_WORK_REQUIRED(String value) throws FMLManipulationException {
        this.fmlBuffer[231].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'PAPER_WORK_DATE' field in the FML buffer.
     *
     * @return Value of 'PAPER_WORK_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAPER_WORK_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[232].getValue(0));
    }

    /**
     * Sets the value of the 'PAPER_WORK_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_PAPER_WORK_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[232].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PAPER_WORK_REF_NO' field in the FML buffer.
     *
     * @return Value of 'PAPER_WORK_REF_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAPER_WORK_REF_NO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[233].getValue(0));
    }

    /**
     * Sets the value of the 'PAPER_WORK_REF_NO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 12.
     * @throws FMLManipulationException
     */
    public void set_PAPER_WORK_REF_NO(String value) throws FMLManipulationException {
        this.fmlBuffer[233].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PAPER_WORK_TRNS_NO' field in the FML buffer.
     *
     * @return Value of 'PAPER_WORK_TRNS_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAPER_WORK_TRNS_NO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[234].getValue(0));
    }

    /**
     * Sets the value of the 'PAPER_WORK_TRNS_NO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 26.
     * @throws FMLManipulationException
     */
    public void set_PAPER_WORK_TRNS_NO(String value) throws FMLManipulationException {
        this.fmlBuffer[234].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'DELIVERY_TYPE' field in the FML buffer.
     *
     * @return Value of 'DELIVERY_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DELIVERY_TYPE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[235].getValue(0)));
    }

    /**
     * Sets the value of the 'DELIVERY_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_DELIVERY_TYPE(String value) throws FMLManipulationException {
        this.fmlBuffer[235].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'ROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'ROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[236].getValue(0));
    }

    /**
     * Sets the value of the 'ROWCOUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_ROWCOUNT(Integer value) throws FMLManipulationException {
        this.fmlBuffer[236].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PAGRSOCBUFROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PAGRSOCBUFROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAGRSOCBUFROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[237].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PAGRSOCBUFROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_PAGRSOCBUFROWID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[237].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PAGRSOCBUFROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'PAGRSOCBUFROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PAGRSOCBUFROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[237].getCount());
    }

    /**
     * Retrieves the value of the 'SOC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SOC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[238].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SOC' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 10.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SOC(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[238].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SOC' field in the FML buffer.
     *
     * @return Number of values defined for 'SOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SOC_size() throws FMLManipulationException {
        return (this.fmlBuffer[238].getCount());
    }

    /**
     * Retrieves the value of the 'SOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SOC_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SOC_EFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[239].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SOC_EFFECTIVE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[239].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'SOC_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SOC_EFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[239].getCount());
    }

    /**
     * Retrieves the value of the 'COMMITMENT_END_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'COMMITMENT_END_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COMMITMENT_END_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[240].getValue(nIndex));
    }

    /**
     * Sets the value of the 'COMMITMENT_END_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_COMMITMENT_END_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[240].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'COMMITMENT_END_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'COMMITMENT_END_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COMMITMENT_END_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[240].getCount());
    }

    /**
     * Retrieves the value of the 'SERVICE_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SERVICE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SERVICE_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[241].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'SERVICE_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SERVICE_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[241].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'SERVICE_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'SERVICE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SERVICE_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[241].getCount());
    }

    /**
     * Retrieves the value of the 'PAGRSOCBUFEFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PAGRSOCBUFEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAGRSOCBUFEFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[242].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PAGRSOCBUFEFFECTIVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_PAGRSOCBUFEFFECTIVE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[242].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PAGRSOCBUFEFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'PAGRSOCBUFEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PAGRSOCBUFEFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[242].getCount());
    }

    /**
     * Retrieves the value of the 'EXPIRATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EXPIRATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[243].getValue(nIndex));
    }

    /**
     * Sets the value of the 'EXPIRATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_EXPIRATION_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[243].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'EXPIRATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_EXPIRATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[243].getCount());
    }

    /**
     * Retrieves the value of the 'SOC_LEVEL_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SOC_LEVEL_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SOC_LEVEL_CODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[244].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'SOC_LEVEL_CODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SOC_LEVEL_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[244].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'SOC_LEVEL_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'SOC_LEVEL_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SOC_LEVEL_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[244].getCount());
    }

    /**
     * Retrieves the value of the 'PAGRSOCBUFDEALER_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PAGRSOCBUFDEALER_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAGRSOCBUFDEALER_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[245].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PAGRSOCBUFDEALER_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_PAGRSOCBUFDEALER_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[245].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PAGRSOCBUFDEALER_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'PAGRSOCBUFDEALER_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PAGRSOCBUFDEALER_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[245].getCount());
    }

    /**
     * Retrieves the value of the 'PAGRSOCBUFSALES_AGENT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PAGRSOCBUFSALES_AGENT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAGRSOCBUFSALES_AGENT(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[246].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PAGRSOCBUFSALES_AGENT' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_PAGRSOCBUFSALES_AGENT(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[246].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PAGRSOCBUFSALES_AGENT' field in the FML buffer.
     *
     * @return Number of values defined for 'PAGRSOCBUFSALES_AGENT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PAGRSOCBUFSALES_AGENT_size() throws FMLManipulationException {
        return (this.fmlBuffer[246].getCount());
    }

    /**
     * Retrieves the value of the 'SRV_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SRV_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SRV_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[247].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'SRV_MODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SRV_MODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[247].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'SRV_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'SRV_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SRV_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[247].getCount());
    }

    /**
     * Retrieves the value of the 'SRV_SUB_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SRV_SUB_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SRV_SUB_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[248].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'SRV_SUB_MODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SRV_SUB_MODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[248].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'SRV_SUB_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'SRV_SUB_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SRV_SUB_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[248].getCount());
    }

    /**
     * Retrieves the value of the 'SOC_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SOC_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_SOC_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[249].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SOC_SEQ_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SOC_SEQ_NO(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[249].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SOC_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'SOC_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SOC_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[249].getCount());
    }

    /**
     * Retrieves the value of the 'SRV_TRX_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SRV_TRX_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_SRV_TRX_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[250].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SRV_TRX_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SRV_TRX_ID(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[250].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SRV_TRX_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'SRV_TRX_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SRV_TRX_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[250].getCount());
    }

    /**
     * Retrieves the value of the 'CAMPAIGN_SEQ' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'CAMPAIGN_SEQ' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CAMPAIGN_SEQ(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[251].getValue(nIndex));
    }

    /**
     * Sets the value of the 'CAMPAIGN_SEQ' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_CAMPAIGN_SEQ(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[251].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'CAMPAIGN_SEQ' field in the FML buffer.
     *
     * @return Number of values defined for 'CAMPAIGN_SEQ' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CAMPAIGN_SEQ_size() throws FMLManipulationException {
        return (this.fmlBuffer[251].getCount());
    }

    /**
     * Retrieves the value of the 'CAMPAIGN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'CAMPAIGN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CAMPAIGN(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[252].getValue(nIndex));
    }

    /**
     * Sets the value of the 'CAMPAIGN' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 10.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_CAMPAIGN(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[252].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'CAMPAIGN' field in the FML buffer.
     *
     * @return Number of values defined for 'CAMPAIGN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CAMPAIGN_size() throws FMLManipulationException {
        return (this.fmlBuffer[252].getCount());
    }

    /**
     * Retrieves the value of the 'PAGRSOCBUFCOMMIT_ORIG_NO_MONTH' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PAGRSOCBUFCOMMIT_ORIG_NO_MONTH' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PAGRSOCBUFCOMMIT_ORIG_NO_MONTH(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[253].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'PAGRSOCBUFCOMMIT_ORIG_NO_MONTH' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_PAGRSOCBUFCOMMIT_ORIG_NO_MONTH(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[253].setValue(nIndex, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves number of values defined for 'PAGRSOCBUFCOMMIT_ORIG_NO_MONTH' field in the FML buffer.
     *
     * @return Number of values defined for 'PAGRSOCBUFCOMMIT_ORIG_NO_MONTH' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PAGRSOCBUFCOMMIT_ORIG_NO_MONTH_size() throws FMLManipulationException {
        return (this.fmlBuffer[253].getCount());
    }

    /**
     * Retrieves the value of the 'PAGRSOCBUFPRODUCT_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PAGRSOCBUFPRODUCT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAGRSOCBUFPRODUCT_TYPE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[254].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PAGRSOCBUFPRODUCT_TYPE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_PAGRSOCBUFPRODUCT_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[254].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PAGRSOCBUFPRODUCT_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'PAGRSOCBUFPRODUCT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PAGRSOCBUFPRODUCT_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[254].getCount());
    }

    /**
     * Retrieves the value of the 'LOAN_VER_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'LOAN_VER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LOAN_VER_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[255].getValue(nIndex));
    }

    /**
     * Sets the value of the 'LOAN_VER_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_LOAN_VER_NO(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[255].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'LOAN_VER_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'LOAN_VER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LOAN_VER_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[255].getCount());
    }

    /**
     * Retrieves the value of the 'LOAN_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'LOAN_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LOAN_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[256].getValue(nIndex));
    }

    /**
     * Sets the value of the 'LOAN_SEQ_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_LOAN_SEQ_NO(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[256].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'LOAN_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'LOAN_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LOAN_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[256].getCount());
    }

    /**
     * Retrieves the value of the 'SOC_ACTV_FEE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SOC_ACTV_FEE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_SOC_ACTV_FEE(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[257].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SOC_ACTV_FEE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SOC_ACTV_FEE(int nIndex, Double value) throws FMLManipulationException {
        this.fmlBuffer[257].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SOC_ACTV_FEE' field in the FML buffer.
     *
     * @return Number of values defined for 'SOC_ACTV_FEE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SOC_ACTV_FEE_size() throws FMLManipulationException {
        return (this.fmlBuffer[257].getCount());
    }

    /**
     * Retrieves the value of the 'PROMOTIONAL_SOC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PROMOTIONAL_SOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PROMOTIONAL_SOC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[258].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PROMOTIONAL_SOC' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 10.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_PROMOTIONAL_SOC(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[258].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PROMOTIONAL_SOC' field in the FML buffer.
     *
     * @return Number of values defined for 'PROMOTIONAL_SOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PROMOTIONAL_SOC_size() throws FMLManipulationException {
        return (this.fmlBuffer[258].getCount());
    }

    /**
     * Retrieves the value of the 'REASON_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'REASON_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_REASON_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[259].getValue(nIndex));
    }

    /**
     * Sets the value of the 'REASON_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_REASON_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[259].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'REASON_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'REASON_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_REASON_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[259].getCount());
    }

    /**
     * Retrieves the value of the 'SOC_START_RC_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SOC_START_RC_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SOC_START_RC_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[260].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SOC_START_RC_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SOC_START_RC_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[260].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SOC_START_RC_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'SOC_START_RC_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SOC_START_RC_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[260].getCount());
    }

    /**
     * Retrieves the value of the 'RC_DATE_COPY_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'RC_DATE_COPY_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_RC_DATE_COPY_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[261].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'RC_DATE_COPY_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_RC_DATE_COPY_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[261].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'RC_DATE_COPY_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'RC_DATE_COPY_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_RC_DATE_COPY_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[261].getCount());
    }

    /**
     * Retrieves the value of the 'PAGRFRNDFMLROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'PAGRFRNDFMLROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PAGRFRNDFMLROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[262].getValue(0));
    }

    /**
     * Sets the value of the 'PAGRFRNDFMLROWCOUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PAGRFRNDFMLROWCOUNT(Integer value) throws FMLManipulationException {
        this.fmlBuffer[262].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'ACTIONIND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'ACTIONIND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACTIONIND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[263].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'ACTIONIND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_ACTIONIND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[263].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'ACTIONIND' field in the FML buffer.
     *
     * @return Number of values defined for 'ACTIONIND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACTIONIND_size() throws FMLManipulationException {
        return (this.fmlBuffer[263].getCount());
    }

    /**
     * Retrieves the value of the 'PCSFANDFRECROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'PCSFANDFRECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PCSFANDFRECROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[264].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PCSFANDFRECROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_PCSFANDFRECROWID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[264].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PCSFANDFRECROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'PCSFANDFRECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PCSFANDFRECROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[264].getCount());
    }

    /**
     * Retrieves the value of the 'PCSFANDFRECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'PCSFANDFRECEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PCSFANDFRECEFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[265].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PCSFANDFRECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_PCSFANDFRECEFFECTIVE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[265].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PCSFANDFRECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'PCSFANDFRECEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PCSFANDFRECEFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[265].getCount());
    }

    /**
     * Retrieves the value of the 'PCSFANDFRECEXPIRATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'PCSFANDFRECEXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PCSFANDFRECEXPIRATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[266].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PCSFANDFRECEXPIRATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_PCSFANDFRECEXPIRATION_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[266].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PCSFANDFRECEXPIRATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'PCSFANDFRECEXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PCSFANDFRECEXPIRATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[266].getCount());
    }

    /**
     * Retrieves the value of the 'PERSONAL_TEL' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'PERSONAL_TEL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PERSONAL_TEL(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[267].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PERSONAL_TEL' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_PERSONAL_TEL(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[267].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PERSONAL_TEL' field in the FML buffer.
     *
     * @return Number of values defined for 'PERSONAL_TEL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PERSONAL_TEL_size() throws FMLManipulationException {
        return (this.fmlBuffer[267].getCount());
    }

    /**
     * Retrieves the value of the 'PERSONAL_TEL_TO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'PERSONAL_TEL_TO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PERSONAL_TEL_TO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[268].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PERSONAL_TEL_TO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_PERSONAL_TEL_TO(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[268].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PERSONAL_TEL_TO' field in the FML buffer.
     *
     * @return Number of values defined for 'PERSONAL_TEL_TO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PERSONAL_TEL_TO_size() throws FMLManipulationException {
        return (this.fmlBuffer[268].getCount());
    }

    /**
     * Retrieves the value of the 'FF_SOC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'FF_SOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FF_SOC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[269].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FF_SOC' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 10.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_FF_SOC(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[269].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FF_SOC' field in the FML buffer.
     *
     * @return Number of values defined for 'FF_SOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FF_SOC_size() throws FMLManipulationException {
        return (this.fmlBuffer[269].getCount());
    }

    /**
     * Retrieves the value of the 'PLAN_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'PLAN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PLAN_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[270].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PLAN_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 10.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_PLAN_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[270].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PLAN_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'PLAN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PLAN_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[270].getCount());
    }

    /**
     * Retrieves the value of the 'DISCOUNT_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'DISCOUNT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DISCOUNT_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[271].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'DISCOUNT_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_DISCOUNT_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[271].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'DISCOUNT_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'DISCOUNT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DISCOUNT_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[271].getCount());
    }

    /**
     * Retrieves the value of the 'START_HOUR' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'START_HOUR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_START_HOUR(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[272].getValue(nIndex));
    }

    /**
     * Sets the value of the 'START_HOUR' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_START_HOUR(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[272].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'START_HOUR' field in the FML buffer.
     *
     * @return Number of values defined for 'START_HOUR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_START_HOUR_size() throws FMLManipulationException {
        return (this.fmlBuffer[272].getCount());
    }

    /**
     * Retrieves the value of the 'DURATION' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'DURATION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_DURATION(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[273].getValue(nIndex));
    }

    /**
     * Sets the value of the 'DURATION' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_DURATION(int nIndex, Double value) throws FMLManipulationException {
        this.fmlBuffer[273].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'DURATION' field in the FML buffer.
     *
     * @return Number of values defined for 'DURATION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DURATION_size() throws FMLManipulationException {
        return (this.fmlBuffer[273].getCount());
    }

    /**
     * Retrieves the value of the 'PAGRFTRDEPBUFROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'PAGRFTRDEPBUFROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PAGRFTRDEPBUFROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[274].getValue(0));
    }

    /**
     * Sets the value of the 'PAGRFTRDEPBUFROWCOUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PAGRFTRDEPBUFROWCOUNT(Integer value) throws FMLManipulationException {
        this.fmlBuffer[274].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'DEPOSIT_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 2).
     * @return Value of 'DEPOSIT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DEPOSIT_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[275].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'DEPOSIT_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 2).
     * @throws FMLManipulationException
     */
    public void set_DEPOSIT_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[275].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'DEPOSIT_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'DEPOSIT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DEPOSIT_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[275].getCount());
    }

    /**
     * Retrieves the value of the 'DEPOSIT_AMOUNT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 2).
     * @return Value of 'DEPOSIT_AMOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_DEPOSIT_AMOUNT(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[276].getValue(nIndex));
    }

    /**
     * Sets the value of the 'DEPOSIT_AMOUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 2).
     * @throws FMLManipulationException
     */
    public void set_DEPOSIT_AMOUNT(int nIndex, Double value) throws FMLManipulationException {
        this.fmlBuffer[276].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'DEPOSIT_AMOUNT' field in the FML buffer.
     *
     * @return Number of values defined for 'DEPOSIT_AMOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DEPOSIT_AMOUNT_size() throws FMLManipulationException {
        return (this.fmlBuffer[276].getCount());
    }

    /**
     * Retrieves the value of the 'ROW_COUNT' field in the FML buffer.
     *
     * @return Value of 'ROW_COUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ROW_COUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[277].getValue(0));
    }

    /**
     * Sets the value of the 'ROW_COUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_ROW_COUNT(Integer value) throws FMLManipulationException {
        this.fmlBuffer[277].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'ACT_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'ACT_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACT_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[278].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ACT_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_ACT_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[278].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ACT_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'ACT_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACT_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[278].getCount());
    }

    /**
     * Retrieves the value of the 'ACT_REASON' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'ACT_REASON' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACT_REASON(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[279].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ACT_REASON' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_ACT_REASON(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[279].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ACT_REASON' field in the FML buffer.
     *
     * @return Number of values defined for 'ACT_REASON' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACT_REASON_size() throws FMLManipulationException {
        return (this.fmlBuffer[279].getCount());
    }

    /**
     * Retrieves the value of the 'PEFCSMACTVBUFSUSP_RC_RATE_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'PEFCSMACTVBUFSUSP_RC_RATE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PEFCSMACTVBUFSUSP_RC_RATE_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[280].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'PEFCSMACTVBUFSUSP_RC_RATE_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_PEFCSMACTVBUFSUSP_RC_RATE_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[280].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'PEFCSMACTVBUFSUSP_RC_RATE_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'PEFCSMACTVBUFSUSP_RC_RATE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PEFCSMACTVBUFSUSP_RC_RATE_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[280].getCount());
    }

    /**
     * Retrieves the value of the 'MEMO_CTN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'MEMO_CTN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MEMO_CTN(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[281].getValue(nIndex));
    }

    /**
     * Sets the value of the 'MEMO_CTN' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_MEMO_CTN(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[281].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'MEMO_CTN' field in the FML buffer.
     *
     * @return Number of values defined for 'MEMO_CTN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MEMO_CTN_size() throws FMLManipulationException {
        return (this.fmlBuffer[281].getCount());
    }

    /**
     * Retrieves the value of the 'USER_TEXT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'USER_TEXT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_USER_TEXT(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[282].getValue(nIndex));
    }

    /**
     * Sets the value of the 'USER_TEXT' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 2001.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_USER_TEXT(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[282].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'USER_TEXT' field in the FML buffer.
     *
     * @return Number of values defined for 'USER_TEXT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_USER_TEXT_size() throws FMLManipulationException {
        return (this.fmlBuffer[282].getCount());
    }

    /**
     * Retrieves the value of the 'MEMO_SOURCE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'MEMO_SOURCE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MEMO_SOURCE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[283].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'MEMO_SOURCE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_MEMO_SOURCE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[283].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'MEMO_SOURCE' field in the FML buffer.
     *
     * @return Number of values defined for 'MEMO_SOURCE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MEMO_SOURCE_size() throws FMLManipulationException {
        return (this.fmlBuffer[283].getCount());
    }

    /**
     * Retrieves the value of the 'PARAM_COUNT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'PARAM_COUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PARAM_COUNT(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[284].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PARAM_COUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_PARAM_COUNT(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[284].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PARAM_COUNT' field in the FML buffer.
     *
     * @return Number of values defined for 'PARAM_COUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PARAM_COUNT_size() throws FMLManipulationException {
        return (this.fmlBuffer[284].getCount());
    }

    /**
     * Retrieves the value of the 'P1' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'P1' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P1(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[285].getValue(nIndex));
    }

    /**
     * Sets the value of the 'P1' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_P1(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[285].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'P1' field in the FML buffer.
     *
     * @return Number of values defined for 'P1' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_P1_size() throws FMLManipulationException {
        return (this.fmlBuffer[285].getCount());
    }

    /**
     * Retrieves the value of the 'P2' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'P2' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P2(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[286].getValue(nIndex));
    }

    /**
     * Sets the value of the 'P2' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_P2(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[286].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'P2' field in the FML buffer.
     *
     * @return Number of values defined for 'P2' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_P2_size() throws FMLManipulationException {
        return (this.fmlBuffer[286].getCount());
    }

    /**
     * Retrieves the value of the 'P3' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'P3' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P3(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[287].getValue(nIndex));
    }

    /**
     * Sets the value of the 'P3' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_P3(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[287].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'P3' field in the FML buffer.
     *
     * @return Number of values defined for 'P3' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_P3_size() throws FMLManipulationException {
        return (this.fmlBuffer[287].getCount());
    }

    /**
     * Retrieves the value of the 'P4' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'P4' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P4(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[288].getValue(nIndex));
    }

    /**
     * Sets the value of the 'P4' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_P4(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[288].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'P4' field in the FML buffer.
     *
     * @return Number of values defined for 'P4' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_P4_size() throws FMLManipulationException {
        return (this.fmlBuffer[288].getCount());
    }

    /**
     * Retrieves the value of the 'P5' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'P5' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P5(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[289].getValue(nIndex));
    }

    /**
     * Sets the value of the 'P5' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_P5(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[289].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'P5' field in the FML buffer.
     *
     * @return Number of values defined for 'P5' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_P5_size() throws FMLManipulationException {
        return (this.fmlBuffer[289].getCount());
    }

    /**
     * Retrieves the value of the 'P6' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'P6' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P6(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[290].getValue(nIndex));
    }

    /**
     * Sets the value of the 'P6' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_P6(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[290].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'P6' field in the FML buffer.
     *
     * @return Number of values defined for 'P6' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_P6_size() throws FMLManipulationException {
        return (this.fmlBuffer[290].getCount());
    }

    /**
     * Retrieves the value of the 'P7' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'P7' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P7(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[291].getValue(nIndex));
    }

    /**
     * Sets the value of the 'P7' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_P7(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[291].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'P7' field in the FML buffer.
     *
     * @return Number of values defined for 'P7' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_P7_size() throws FMLManipulationException {
        return (this.fmlBuffer[291].getCount());
    }

    /**
     * Retrieves the value of the 'P8' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'P8' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P8(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[292].getValue(nIndex));
    }

    /**
     * Sets the value of the 'P8' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_P8(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[292].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'P8' field in the FML buffer.
     *
     * @return Number of values defined for 'P8' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_P8_size() throws FMLManipulationException {
        return (this.fmlBuffer[292].getCount());
    }

    /**
     * Retrieves the value of the 'P9' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'P9' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P9(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[293].getValue(nIndex));
    }

    /**
     * Sets the value of the 'P9' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_P9(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[293].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'P9' field in the FML buffer.
     *
     * @return Number of values defined for 'P9' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_P9_size() throws FMLManipulationException {
        return (this.fmlBuffer[293].getCount());
    }

    /**
     * Retrieves the value of the 'P10' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'P10' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P10(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[294].getValue(nIndex));
    }

    /**
     * Sets the value of the 'P10' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_P10(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[294].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'P10' field in the FML buffer.
     *
     * @return Number of values defined for 'P10' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_P10_size() throws FMLManipulationException {
        return (this.fmlBuffer[294].getCount());
    }

    /**
     * Retrieves the value of the 'MEMO_AMT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'MEMO_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_MEMO_AMT(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[295].getValue(nIndex));
    }

    /**
     * Sets the value of the 'MEMO_AMT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_MEMO_AMT(int nIndex, Double value) throws FMLManipulationException {
        this.fmlBuffer[295].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'MEMO_AMT' field in the FML buffer.
     *
     * @return Number of values defined for 'MEMO_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MEMO_AMT_size() throws FMLManipulationException {
        return (this.fmlBuffer[295].getCount());
    }

    /**
     * Retrieves the value of the 'RMS_ACT_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'RMS_ACT_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_RMS_ACT_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[296].getValue(nIndex));
    }

    /**
     * Sets the value of the 'RMS_ACT_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_RMS_ACT_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[296].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'RMS_ACT_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'RMS_ACT_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_RMS_ACT_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[296].getCount());
    }

    /**
     * Retrieves the value of the 'CHARGE_AMT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'CHARGE_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_CHARGE_AMT(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[297].getValue(nIndex));
    }

    /**
     * Sets the value of the 'CHARGE_AMT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_CHARGE_AMT(int nIndex, Double value) throws FMLManipulationException {
        this.fmlBuffer[297].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'CHARGE_AMT' field in the FML buffer.
     *
     * @return Number of values defined for 'CHARGE_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CHARGE_AMT_size() throws FMLManipulationException {
        return (this.fmlBuffer[297].getCount());
    }

    /**
     * Retrieves the value of the 'CHARGE_AMT_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'CHARGE_AMT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CHARGE_AMT_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[298].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'CHARGE_AMT_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_CHARGE_AMT_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[298].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'CHARGE_AMT_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'CHARGE_AMT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CHARGE_AMT_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[298].getCount());
    }

    /**
     * Retrieves the value of the 'WAIVE_REASON' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'WAIVE_REASON' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_WAIVE_REASON(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[299].getValue(nIndex));
    }

    /**
     * Sets the value of the 'WAIVE_REASON' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_WAIVE_REASON(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[299].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'WAIVE_REASON' field in the FML buffer.
     *
     * @return Number of values defined for 'WAIVE_REASON' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_WAIVE_REASON_size() throws FMLManipulationException {
        return (this.fmlBuffer[299].getCount());
    }

    /**
     * Retrieves the value of the 'WAIVE_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'WAIVE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_WAIVE_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[300].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'WAIVE_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_WAIVE_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[300].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'WAIVE_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'WAIVE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_WAIVE_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[300].getCount());
    }

    /**
     * Retrieves the value of the 'PSRVTPINPBUFROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'PSRVTPINPBUFROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PSRVTPINPBUFROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[301].getValue(0));
    }

    /**
     * Sets the value of the 'PSRVTPINPBUFROWCOUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PSRVTPINPBUFROWCOUNT(Integer value) throws FMLManipulationException {
        this.fmlBuffer[301].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'TUXSRVTP' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'TUXSRVTP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_TUXSRVTP(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[302].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'TUXSRVTP' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_TUXSRVTP(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[302].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'TUXSRVTP' field in the FML buffer.
     *
     * @return Number of values defined for 'TUXSRVTP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_TUXSRVTP_size() throws FMLManipulationException {
        return (this.fmlBuffer[302].getCount());
    }

    /**
     * Retrieves the value of the 'PNAMEADRBUFROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'PNAMEADRBUFROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PNAMEADRBUFROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[303].getValue(0));
    }

    /**
     * Sets the value of the 'PNAMEADRBUFROWCOUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PNAMEADRBUFROWCOUNT(Integer value) throws FMLManipulationException {
        this.fmlBuffer[303].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'LINK_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LINK_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[304].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'LINK_MODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_LINK_MODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[304].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'LINK_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[304].getCount());
    }

    /**
     * Retrieves the value of the 'LINK_BAN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LINK_BAN(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[305].getValue(nIndex));
    }

    /**
     * Sets the value of the 'LINK_BAN' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_LINK_BAN(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[305].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'LINK_BAN' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_BAN_size() throws FMLManipulationException {
        return (this.fmlBuffer[305].getCount());
    }

    /**
     * Retrieves the value of the 'LINK_SUBSCRIBER' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_SUBSCRIBER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LINK_SUBSCRIBER(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[306].getValue(nIndex));
    }

    /**
     * Sets the value of the 'LINK_SUBSCRIBER' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_LINK_SUBSCRIBER(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[306].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'LINK_SUBSCRIBER' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_SUBSCRIBER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_SUBSCRIBER_size() throws FMLManipulationException {
        return (this.fmlBuffer[306].getCount());
    }

    /**
     * Retrieves the value of the 'LINK_ROW_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_ROW_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LINK_ROW_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[307].getValue(nIndex));
    }

    /**
     * Sets the value of the 'LINK_ROW_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_LINK_ROW_ID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[307].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'LINK_ROW_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_ROW_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_ROW_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[307].getCount());
    }

    /**
     * Retrieves the value of the 'LINK_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LINK_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[308].getValue(nIndex));
    }

    /**
     * Sets the value of the 'LINK_SEQ_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_LINK_SEQ_NO(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[308].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'LINK_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[308].getCount());
    }

    /**
     * Retrieves the value of the 'LNKRECCUSTOMER_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LNKRECCUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LNKRECCUSTOMER_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[309].getValue(nIndex));
    }

    /**
     * Sets the value of the 'LNKRECCUSTOMER_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_LNKRECCUSTOMER_ID(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[309].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'LNKRECCUSTOMER_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'LNKRECCUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LNKRECCUSTOMER_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[309].getCount());
    }

    /**
     * Retrieves the value of the 'LNKRECBAN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LNKRECBAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LNKRECBAN(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[310].getValue(nIndex));
    }

    /**
     * Sets the value of the 'LNKRECBAN' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_LNKRECBAN(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[310].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'LNKRECBAN' field in the FML buffer.
     *
     * @return Number of values defined for 'LNKRECBAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LNKRECBAN_size() throws FMLManipulationException {
        return (this.fmlBuffer[310].getCount());
    }

    /**
     * Retrieves the value of the 'LNKRECSUBSCRIBER_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LNKRECSUBSCRIBER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LNKRECSUBSCRIBER_NO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[311].getValue(nIndex));
    }

    /**
     * Sets the value of the 'LNKRECSUBSCRIBER_NO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_LNKRECSUBSCRIBER_NO(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[311].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'LNKRECSUBSCRIBER_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'LNKRECSUBSCRIBER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LNKRECSUBSCRIBER_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[311].getCount());
    }

    /**
     * Retrieves the value of the 'LINK_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LINK_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[312].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'LINK_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_LINK_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[312].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'LINK_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[312].getCount());
    }

    /**
     * Retrieves the value of the 'LNKRECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LNKRECEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LNKRECEFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[313].getValue(nIndex));
    }

    /**
     * Sets the value of the 'LNKRECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_LNKRECEFFECTIVE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[313].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'LNKRECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'LNKRECEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LNKRECEFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[313].getCount());
    }

    /**
     * Retrieves the value of the 'FOREIGN_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'FOREIGN_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_FOREIGN_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[314].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FOREIGN_SEQ_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_FOREIGN_SEQ_NO(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[314].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FOREIGN_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'FOREIGN_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FOREIGN_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[314].getCount());
    }

    /**
     * Retrieves the value of the 'BILLING_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'BILLING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BILLING_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[315].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'BILLING_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_BILLING_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[315].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'BILLING_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'BILLING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_BILLING_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[315].getCount());
    }

    /**
     * Retrieves the value of the 'MAILING_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'MAILING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MAILING_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[316].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'MAILING_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_MAILING_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[316].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'MAILING_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'MAILING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MAILING_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[316].getCount());
    }

    /**
     * Retrieves the value of the 'USER_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'USER_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_USER_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[317].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'USER_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_USER_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[317].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'USER_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'USER_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_USER_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[317].getCount());
    }

    /**
     * Retrieves the value of the 'LINK_BILLING_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_BILLING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LINK_BILLING_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[318].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'LINK_BILLING_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_LINK_BILLING_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[318].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'LINK_BILLING_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_BILLING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_BILLING_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[318].getCount());
    }

    /**
     * Retrieves the value of the 'LINK_MAILING_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_MAILING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LINK_MAILING_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[319].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'LINK_MAILING_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_LINK_MAILING_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[319].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'LINK_MAILING_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_MAILING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_MAILING_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[319].getCount());
    }

    /**
     * Retrieves the value of the 'LINK_USER_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_USER_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LINK_USER_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[320].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'LINK_USER_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_LINK_USER_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[320].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'LINK_USER_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_USER_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_USER_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[320].getCount());
    }

    /**
     * Retrieves the value of the 'NM_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NM_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NM_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[321].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'NM_MODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_NM_MODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[321].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'NM_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'NM_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NM_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[321].getCount());
    }

    /**
     * Retrieves the value of the 'NM_UP_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NM_UP_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NM_UP_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[322].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'NM_UP_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_NM_UP_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[322].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'NM_UP_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'NM_UP_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NM_UP_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[322].getCount());
    }

    /**
     * Retrieves the value of the 'NM_EXPIRE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NM_EXPIRE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NM_EXPIRE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[323].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NM_EXPIRE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_NM_EXPIRE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[323].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NM_EXPIRE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'NM_EXPIRE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NM_EXPIRE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[323].getCount());
    }

    /**
     * Retrieves the value of the 'NAMERECROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAMERECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NAMERECROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[324].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NAMERECROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_NAMERECROWID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[324].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NAMERECROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'NAMERECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAMERECROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[324].getCount());
    }

    /**
     * Retrieves the value of the 'NAME_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAME_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NAME_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[325].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NAME_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_NAME_ID(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[325].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NAME_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'NAME_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAME_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[325].getCount());
    }

    /**
     * Retrieves the value of the 'NAMERECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAMERECSYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NAMERECSYS_CREATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[326].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NAMERECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_NAMERECSYS_CREATION_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[326].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NAMERECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'NAMERECSYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAMERECSYS_CREATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[326].getCount());
    }

    /**
     * Retrieves the value of the 'NAMERECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAMERECSYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NAMERECSYS_UPDATE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[327].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NAMERECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_NAMERECSYS_UPDATE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[327].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NAMERECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'NAMERECSYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAMERECSYS_UPDATE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[327].getCount());
    }

    /**
     * Retrieves the value of the 'NAMERECOPERATOR_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAMERECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NAMERECOPERATOR_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[328].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NAMERECOPERATOR_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_NAMERECOPERATOR_ID(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[328].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NAMERECOPERATOR_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'NAMERECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAMERECOPERATOR_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[328].getCount());
    }

    /**
     * Retrieves the value of the 'NAMERECAPPLICATION_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAMERECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NAMERECAPPLICATION_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[329].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NAMERECAPPLICATION_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_NAMERECAPPLICATION_ID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[329].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NAMERECAPPLICATION_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'NAMERECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAMERECAPPLICATION_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[329].getCount());
    }

    /**
     * Retrieves the value of the 'NAMERECDL_SERVICE_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAMERECDL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NAMERECDL_SERVICE_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[330].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NAMERECDL_SERVICE_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_NAMERECDL_SERVICE_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[330].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NAMERECDL_SERVICE_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'NAMERECDL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAMERECDL_SERVICE_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[330].getCount());
    }

    /**
     * Retrieves the value of the 'NAMERECDL_UPDATE_STAMP' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAMERECDL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NAMERECDL_UPDATE_STAMP(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[331].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'NAMERECDL_UPDATE_STAMP' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_NAMERECDL_UPDATE_STAMP(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[331].setValue(nIndex, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves number of values defined for 'NAMERECDL_UPDATE_STAMP' field in the FML buffer.
     *
     * @return Number of values defined for 'NAMERECDL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAMERECDL_UPDATE_STAMP_size() throws FMLManipulationException {
        return (this.fmlBuffer[331].getCount());
    }

    /**
     * Retrieves the value of the 'CONTROL_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'CONTROL_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CONTROL_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[332].getValue(nIndex));
    }

    /**
     * Sets the value of the 'CONTROL_NAME' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 41.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_CONTROL_NAME(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[332].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'CONTROL_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'CONTROL_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CONTROL_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[332].getCount());
    }

    /**
     * Retrieves the value of the 'LAST_BUSINESS_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LAST_BUSINESS_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LAST_BUSINESS_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[333].getValue(nIndex));
    }

    /**
     * Sets the value of the 'LAST_BUSINESS_NAME' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_LAST_BUSINESS_NAME(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[333].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'LAST_BUSINESS_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'LAST_BUSINESS_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LAST_BUSINESS_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[333].getCount());
    }

    /**
     * Retrieves the value of the 'FIRST_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'FIRST_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FIRST_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[334].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FIRST_NAME' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 33.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_FIRST_NAME(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[334].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FIRST_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'FIRST_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FIRST_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[334].getCount());
    }

    /**
     * Retrieves the value of the 'ADDITIONAL_TITLE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDITIONAL_TITLE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADDITIONAL_TITLE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[335].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADDITIONAL_TITLE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADDITIONAL_TITLE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[335].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADDITIONAL_TITLE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDITIONAL_TITLE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDITIONAL_TITLE_size() throws FMLManipulationException {
        return (this.fmlBuffer[335].getCount());
    }

    /**
     * Retrieves the value of the 'NAME_FORMAT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAME_FORMAT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NAME_FORMAT(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[336].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'NAME_FORMAT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_NAME_FORMAT(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[336].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'NAME_FORMAT' field in the FML buffer.
     *
     * @return Number of values defined for 'NAME_FORMAT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAME_FORMAT_size() throws FMLManipulationException {
        return (this.fmlBuffer[336].getCount());
    }

    /**
     * Retrieves the value of the 'BIRTH_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'BIRTH_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BIRTH_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[337].getValue(nIndex));
    }

    /**
     * Sets the value of the 'BIRTH_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_BIRTH_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[337].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'BIRTH_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'BIRTH_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_BIRTH_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[337].getCount());
    }

    /**
     * Retrieves the value of the 'IDENTIFY' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'IDENTIFY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_IDENTIFY(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[338].getValue(nIndex));
    }

    /**
     * Sets the value of the 'IDENTIFY' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_IDENTIFY(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[338].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'IDENTIFY' field in the FML buffer.
     *
     * @return Number of values defined for 'IDENTIFY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_IDENTIFY_size() throws FMLManipulationException {
        return (this.fmlBuffer[338].getCount());
    }

    /**
     * Retrieves the value of the 'ID_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ID_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ID_TYPE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[339].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ID_TYPE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ID_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[339].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ID_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'ID_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ID_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[339].getCount());
    }

    /**
     * Retrieves the value of the 'COMP_REG_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'COMP_REG_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COMP_REG_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[340].getValue(nIndex));
    }

    /**
     * Sets the value of the 'COMP_REG_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_COMP_REG_ID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[340].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'COMP_REG_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'COMP_REG_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COMP_REG_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[340].getCount());
    }

    /**
     * Retrieves the value of the 'KOB' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'KOB' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_KOB(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[341].getValue(nIndex));
    }

    /**
     * Sets the value of the 'KOB' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_KOB(int nIndex, Double value) throws FMLManipulationException {
        this.fmlBuffer[341].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'KOB' field in the FML buffer.
     *
     * @return Number of values defined for 'KOB' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_KOB_size() throws FMLManipulationException {
        return (this.fmlBuffer[341].getCount());
    }

    /**
     * Retrieves the value of the 'MIDDLE_INITIAL' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'MIDDLE_INITIAL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MIDDLE_INITIAL(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[342].getValue(nIndex));
    }

    /**
     * Sets the value of the 'MIDDLE_INITIAL' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 33.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_MIDDLE_INITIAL(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[342].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'MIDDLE_INITIAL' field in the FML buffer.
     *
     * @return Number of values defined for 'MIDDLE_INITIAL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MIDDLE_INITIAL_size() throws FMLManipulationException {
        return (this.fmlBuffer[342].getCount());
    }

    /**
     * Retrieves the value of the 'TELEMARKET_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'TELEMARKET_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_TELEMARKET_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[343].getValue(nIndex));
    }

    /**
     * Sets the value of the 'TELEMARKET_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 11.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_TELEMARKET_ID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[343].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'TELEMARKET_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'TELEMARKET_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_TELEMARKET_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[343].getCount());
    }

    /**
     * Retrieves the value of the 'NAMERECCONV_RUN_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAMERECCONV_RUN_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NAMERECCONV_RUN_NO(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[344].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'NAMERECCONV_RUN_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_NAMERECCONV_RUN_NO(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[344].setValue(nIndex, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves number of values defined for 'NAMERECCONV_RUN_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'NAMERECCONV_RUN_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAMERECCONV_RUN_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[344].getCount());
    }

    /**
     * Retrieves the value of the 'NAME_TITLE_SALUTATION' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAME_TITLE_SALUTATION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NAME_TITLE_SALUTATION(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[345].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NAME_TITLE_SALUTATION' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_NAME_TITLE_SALUTATION(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[345].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NAME_TITLE_SALUTATION' field in the FML buffer.
     *
     * @return Number of values defined for 'NAME_TITLE_SALUTATION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAME_TITLE_SALUTATION_size() throws FMLManipulationException {
        return (this.fmlBuffer[345].getCount());
    }

    /**
     * Retrieves the value of the 'NATIONALITY_CD' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NATIONALITY_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NATIONALITY_CD(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[346].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NATIONALITY_CD' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_NATIONALITY_CD(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[346].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NATIONALITY_CD' field in the FML buffer.
     *
     * @return Number of values defined for 'NATIONALITY_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NATIONALITY_CD_size() throws FMLManipulationException {
        return (this.fmlBuffer[346].getCount());
    }

    /**
     * Retrieves the value of the 'GENDER' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'GENDER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_GENDER(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[347].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'GENDER' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_GENDER(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[347].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'GENDER' field in the FML buffer.
     *
     * @return Number of values defined for 'GENDER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_GENDER_size() throws FMLManipulationException {
        return (this.fmlBuffer[347].getCount());
    }

    /**
     * Retrieves the value of the 'MARITAL_STATUS' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'MARITAL_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MARITAL_STATUS(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[348].getValue(nIndex));
    }

    /**
     * Sets the value of the 'MARITAL_STATUS' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_MARITAL_STATUS(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[348].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'MARITAL_STATUS' field in the FML buffer.
     *
     * @return Number of values defined for 'MARITAL_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MARITAL_STATUS_size() throws FMLManipulationException {
        return (this.fmlBuffer[348].getCount());
    }

    /**
     * Retrieves the value of the 'ROLE_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ROLE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ROLE_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[349].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'ROLE_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ROLE_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[349].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'ROLE_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'ROLE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ROLE_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[349].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[350].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'ADR_MODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_MODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[350].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'ADR_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[350].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_UP_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_UP_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_UP_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[351].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'ADR_UP_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_UP_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[351].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'ADR_UP_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_UP_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_UP_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[351].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_EXPIRE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_EXPIRE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_EXPIRE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[352].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_EXPIRE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_EXPIRE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[352].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_EXPIRE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_EXPIRE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_EXPIRE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[352].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESSRECROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESSRECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADDRESSRECROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[353].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADDRESSRECROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADDRESSRECROWID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[353].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADDRESSRECROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESSRECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESSRECROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[353].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESS_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESS_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ADDRESS_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[354].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADDRESS_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADDRESS_ID(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[354].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADDRESS_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESS_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESS_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[354].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESSRECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESSRECSYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADDRESSRECSYS_CREATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[355].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADDRESSRECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADDRESSRECSYS_CREATION_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[355].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADDRESSRECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESSRECSYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESSRECSYS_CREATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[355].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESSRECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESSRECSYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADDRESSRECSYS_UPDATE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[356].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADDRESSRECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADDRESSRECSYS_UPDATE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[356].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADDRESSRECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESSRECSYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESSRECSYS_UPDATE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[356].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESSRECOPERATOR_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESSRECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ADDRESSRECOPERATOR_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[357].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADDRESSRECOPERATOR_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADDRESSRECOPERATOR_ID(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[357].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADDRESSRECOPERATOR_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESSRECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESSRECOPERATOR_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[357].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESSRECAPPLICATION_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESSRECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADDRESSRECAPPLICATION_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[358].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADDRESSRECAPPLICATION_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADDRESSRECAPPLICATION_ID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[358].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADDRESSRECAPPLICATION_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESSRECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESSRECAPPLICATION_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[358].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESSRECDL_SERVICE_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESSRECDL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADDRESSRECDL_SERVICE_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[359].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADDRESSRECDL_SERVICE_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADDRESSRECDL_SERVICE_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[359].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADDRESSRECDL_SERVICE_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESSRECDL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESSRECDL_SERVICE_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[359].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESSRECDL_UPDATE_STAMP' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESSRECDL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ADDRESSRECDL_UPDATE_STAMP(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[360].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'ADDRESSRECDL_UPDATE_STAMP' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADDRESSRECDL_UPDATE_STAMP(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[360].setValue(nIndex, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves number of values defined for 'ADDRESSRECDL_UPDATE_STAMP' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESSRECDL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESSRECDL_UPDATE_STAMP_size() throws FMLManipulationException {
        return (this.fmlBuffer[360].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[361].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'ADR_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[361].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'ADR_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[361].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_STATUS' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_STATUS(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[362].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'ADR_STATUS' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_STATUS(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[362].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'ADR_STATUS' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_STATUS_size() throws FMLManipulationException {
        return (this.fmlBuffer[362].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_STATUS_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_STATUS_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_STATUS_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[363].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_STATUS_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_STATUS_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[363].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_STATUS_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_STATUS_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_STATUS_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[363].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_SECONDARY_LN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_SECONDARY_LN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_SECONDARY_LN(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[364].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_SECONDARY_LN' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 101.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_SECONDARY_LN(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[364].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_SECONDARY_LN' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_SECONDARY_LN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_SECONDARY_LN_size() throws FMLManipulationException {
        return (this.fmlBuffer[364].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_PRIMARY_LN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_PRIMARY_LN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_PRIMARY_LN(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[365].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_PRIMARY_LN' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 101.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_PRIMARY_LN(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[365].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_PRIMARY_LN' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_PRIMARY_LN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_PRIMARY_LN_size() throws FMLManipulationException {
        return (this.fmlBuffer[365].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_CITY' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_CITY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_CITY(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[366].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_CITY' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 40.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_CITY(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[366].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_CITY' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_CITY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_CITY_size() throws FMLManipulationException {
        return (this.fmlBuffer[366].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_ZIP' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_ZIP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_ZIP(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[367].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_ZIP' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 10.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_ZIP(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[367].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_ZIP' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_ZIP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_ZIP_size() throws FMLManipulationException {
        return (this.fmlBuffer[367].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_HOUSE_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_HOUSE_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_HOUSE_NO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[368].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_HOUSE_NO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_HOUSE_NO(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[368].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_HOUSE_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_HOUSE_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_HOUSE_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[368].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_STREET_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_STREET_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_STREET_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[369].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_STREET_NAME' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_STREET_NAME(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[369].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_STREET_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_STREET_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_STREET_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[369].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_DIRECTION' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_DIRECTION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_DIRECTION(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[370].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_DIRECTION' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 3.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_DIRECTION(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[370].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_DIRECTION' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_DIRECTION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_DIRECTION_size() throws FMLManipulationException {
        return (this.fmlBuffer[370].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_POB' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_POB' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_POB(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[371].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_POB' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 11.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_POB(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[371].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_POB' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_POB' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_POB_size() throws FMLManipulationException {
        return (this.fmlBuffer[371].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_COUNTRY' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_COUNTRY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_COUNTRY(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[372].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_COUNTRY' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_COUNTRY(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[372].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_COUNTRY' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_COUNTRY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_COUNTRY_size() throws FMLManipulationException {
        return (this.fmlBuffer[372].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_HOUSE_LETTER' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_HOUSE_LETTER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_HOUSE_LETTER(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[373].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_HOUSE_LETTER' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 3.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_HOUSE_LETTER(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[373].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_HOUSE_LETTER' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_HOUSE_LETTER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_HOUSE_LETTER_size() throws FMLManipulationException {
        return (this.fmlBuffer[373].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_STORY' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_STORY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_STORY(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[374].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_STORY' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 3.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_STORY(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[374].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_STORY' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_STORY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_STORY_size() throws FMLManipulationException {
        return (this.fmlBuffer[374].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_DOOR_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_DOOR_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_DOOR_NO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[375].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_DOOR_NO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_DOOR_NO(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[375].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_DOOR_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_DOOR_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_DOOR_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[375].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_EMAIL' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_EMAIL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_EMAIL(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[376].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_EMAIL' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 151.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_EMAIL(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[376].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_EMAIL' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_EMAIL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_EMAIL_size() throws FMLManipulationException {
        return (this.fmlBuffer[376].getCount());
    }

    /**
     * Retrieves the value of the 'SINCE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'SINCE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SINCE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[377].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SINCE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_SINCE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[377].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SINCE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'SINCE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SINCE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[377].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_DISTRICT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_DISTRICT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_DISTRICT(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[378].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_DISTRICT' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 41.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_DISTRICT(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[378].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_DISTRICT' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_DISTRICT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_DISTRICT_size() throws FMLManipulationException {
        return (this.fmlBuffer[378].getCount());
    }

    /**
     * Retrieves the value of the 'CO_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'CO_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CO_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[379].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'CO_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_CO_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[379].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'CO_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'CO_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CO_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[379].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESSRECCONV_RUN_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESSRECCONV_RUN_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ADDRESSRECCONV_RUN_NO(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[380].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'ADDRESSRECCONV_RUN_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADDRESSRECCONV_RUN_NO(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[380].setValue(nIndex, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves number of values defined for 'ADDRESSRECCONV_RUN_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESSRECCONV_RUN_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESSRECCONV_RUN_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[380].getCount());
    }

    /**
     * Retrieves the value of the 'ACCOMMODATION_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ACCOMMODATION_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACCOMMODATION_TYPE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[381].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ACCOMMODATION_TYPE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ACCOMMODATION_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[381].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ACCOMMODATION_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'ACCOMMODATION_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACCOMMODATION_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[381].getCount());
    }

    /**
     * Retrieves the value of the 'COUNTY_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'COUNTY_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COUNTY_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[382].getValue(nIndex));
    }

    /**
     * Sets the value of the 'COUNTY_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 3.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_COUNTY_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[382].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'COUNTY_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'COUNTY_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COUNTY_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[382].getCount());
    }

    /**
     * Retrieves the value of the 'COMMUNITY_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'COMMUNITY_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COMMUNITY_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[383].getValue(nIndex));
    }

    /**
     * Sets the value of the 'COMMUNITY_NAME' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 31.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_COMMUNITY_NAME(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[383].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'COMMUNITY_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'COMMUNITY_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COMMUNITY_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[383].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_CO_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_CO_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_CO_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[384].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_CO_NAME' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_CO_NAME(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[384].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_CO_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_CO_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_CO_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[384].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_HOUSE_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_HOUSE_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_HOUSE_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[385].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_HOUSE_NAME' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_HOUSE_NAME(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[385].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_HOUSE_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_HOUSE_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_HOUSE_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[385].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P1' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P1' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P1(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[386].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_P1' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_P1(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[386].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_P1' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P1' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P1_size() throws FMLManipulationException {
        return (this.fmlBuffer[386].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P2' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P2' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P2(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[387].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_P2' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_P2(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[387].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_P2' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P2' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P2_size() throws FMLManipulationException {
        return (this.fmlBuffer[387].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P3' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P3' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P3(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[388].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_P3' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_P3(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[388].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_P3' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P3' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P3_size() throws FMLManipulationException {
        return (this.fmlBuffer[388].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P4' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P4' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P4(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[389].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_P4' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_P4(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[389].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_P4' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P4' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P4_size() throws FMLManipulationException {
        return (this.fmlBuffer[389].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P5' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P5' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P5(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[390].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_P5' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_P5(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[390].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_P5' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P5' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P5_size() throws FMLManipulationException {
        return (this.fmlBuffer[390].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P6' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P6' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P6(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[391].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_P6' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_P6(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[391].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_P6' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P6' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P6_size() throws FMLManipulationException {
        return (this.fmlBuffer[391].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P7' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P7' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P7(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[392].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_P7' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_P7(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[392].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_P7' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P7' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P7_size() throws FMLManipulationException {
        return (this.fmlBuffer[392].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P8' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P8' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P8(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[393].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_P8' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_P8(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[393].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_P8' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P8' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P8_size() throws FMLManipulationException {
        return (this.fmlBuffer[393].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P9' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P9' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P9(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[394].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_P9' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_P9(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[394].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_P9' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P9' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P9_size() throws FMLManipulationException {
        return (this.fmlBuffer[394].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P10' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P10' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P10(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[395].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_P10' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_P10(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[395].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_P10' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P10' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P10_size() throws FMLManipulationException {
        return (this.fmlBuffer[395].getCount());
    }

    /**
     * Retrieves the value of the 'PESNBUFROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'PESNBUFROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PESNBUFROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[396].getValue(0));
    }

    /**
     * Sets the value of the 'PESNBUFROWCOUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PESNBUFROWCOUNT(Integer value) throws FMLManipulationException {
        this.fmlBuffer[396].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'EQUIPMENT_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'EQUIPMENT_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EQUIPMENT_NO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[397].getValue(nIndex));
    }

    /**
     * Sets the value of the 'EQUIPMENT_NO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_EQUIPMENT_NO(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[397].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'EQUIPMENT_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'EQUIPMENT_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_EQUIPMENT_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[397].getCount());
    }

    /**
     * Retrieves the value of the 'PHD_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PHD_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PHD_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[398].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PHD_SEQ_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_PHD_SEQ_NO(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[398].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PHD_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'PHD_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PHD_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[398].getCount());
    }

    /**
     * Retrieves the value of the 'EQUIPMENT_LEVEL' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'EQUIPMENT_LEVEL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_EQUIPMENT_LEVEL(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[399].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'EQUIPMENT_LEVEL' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_EQUIPMENT_LEVEL(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[399].setValue(nIndex, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves number of values defined for 'EQUIPMENT_LEVEL' field in the FML buffer.
     *
     * @return Number of values defined for 'EQUIPMENT_LEVEL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_EQUIPMENT_LEVEL_size() throws FMLManipulationException {
        return (this.fmlBuffer[399].getCount());
    }

    /**
     * Retrieves the value of the 'IMSI' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'IMSI' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_IMSI(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[400].getValue(nIndex));
    }

    /**
     * Sets the value of the 'IMSI' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 16.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_IMSI(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[400].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'IMSI' field in the FML buffer.
     *
     * @return Number of values defined for 'IMSI' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_IMSI_size() throws FMLManipulationException {
        return (this.fmlBuffer[400].getCount());
    }

    /**
     * Retrieves the value of the 'PHYDEVARRAYEXPIRATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PHYDEVARRAYEXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PHYDEVARRAYEXPIRATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[401].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PHYDEVARRAYEXPIRATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_PHYDEVARRAYEXPIRATION_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[401].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PHYDEVARRAYEXPIRATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'PHYDEVARRAYEXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PHYDEVARRAYEXPIRATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[401].getCount());
    }

    /**
     * Retrieves the value of the 'PHYDEVARRAYEFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PHYDEVARRAYEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PHYDEVARRAYEFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[402].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PHYDEVARRAYEFFECTIVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_PHYDEVARRAYEFFECTIVE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[402].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PHYDEVARRAYEFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'PHYDEVARRAYEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PHYDEVARRAYEFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[402].getCount());
    }

    /**
     * Retrieves the value of the 'OWNERSHIP_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'OWNERSHIP_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_OWNERSHIP_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[403].getValue(nIndex));
    }

    /**
     * Sets the value of the 'OWNERSHIP_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 3.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_OWNERSHIP_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[403].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'OWNERSHIP_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'OWNERSHIP_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_OWNERSHIP_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[403].getCount());
    }

    /**
     * Retrieves the value of the 'SW_STATE_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SW_STATE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SW_STATE_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[404].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'SW_STATE_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SW_STATE_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[404].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'SW_STATE_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'SW_STATE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SW_STATE_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[404].getCount());
    }

    /**
     * Retrieves the value of the 'LAST_SW_ACTV_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'LAST_SW_ACTV_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LAST_SW_ACTV_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[405].getValue(nIndex));
    }

    /**
     * Sets the value of the 'LAST_SW_ACTV_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_LAST_SW_ACTV_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[405].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'LAST_SW_ACTV_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'LAST_SW_ACTV_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LAST_SW_ACTV_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[405].getCount());
    }

    /**
     * Retrieves the value of the 'NEXT_ACTV_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'NEXT_ACTV_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NEXT_ACTV_CODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[406].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'NEXT_ACTV_CODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_NEXT_ACTV_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[406].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'NEXT_ACTV_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'NEXT_ACTV_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NEXT_ACTV_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[406].getCount());
    }

    /**
     * Retrieves the value of the 'NEXT_ACTV_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'NEXT_ACTV_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NEXT_ACTV_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[407].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NEXT_ACTV_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_NEXT_ACTV_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[407].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NEXT_ACTV_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'NEXT_ACTV_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NEXT_ACTV_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[407].getCount());
    }

    /**
     * Retrieves the value of the 'NEXT_ACTV_ISSUE_DT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'NEXT_ACTV_ISSUE_DT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NEXT_ACTV_ISSUE_DT(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[408].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NEXT_ACTV_ISSUE_DT' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_NEXT_ACTV_ISSUE_DT(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[408].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NEXT_ACTV_ISSUE_DT' field in the FML buffer.
     *
     * @return Number of values defined for 'NEXT_ACTV_ISSUE_DT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NEXT_ACTV_ISSUE_DT_size() throws FMLManipulationException {
        return (this.fmlBuffer[408].getCount());
    }

    /**
     * Retrieves the value of the 'DEVICE_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'DEVICE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DEVICE_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[409].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'DEVICE_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_DEVICE_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[409].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'DEVICE_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'DEVICE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DEVICE_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[409].getCount());
    }

    /**
     * Retrieves the value of the 'ESN_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ESN_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ESN_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[410].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'ESN_MODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_ESN_MODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[410].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'ESN_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'ESN_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ESN_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[410].getCount());
    }

    /**
     * Retrieves the value of the 'ITEM_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ITEM_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ITEM_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[411].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ITEM_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 16.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_ITEM_ID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[411].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ITEM_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'ITEM_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ITEM_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[411].getCount());
    }

    /**
     * Retrieves the value of the 'POOL' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'POOL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_POOL(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[412].getValue(nIndex));
    }

    /**
     * Sets the value of the 'POOL' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 3.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_POOL(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[412].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'POOL' field in the FML buffer.
     *
     * @return Number of values defined for 'POOL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_POOL_size() throws FMLManipulationException {
        return (this.fmlBuffer[412].getCount());
    }

    /**
     * Retrieves the value of the 'LOCATION_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'LOCATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LOCATION_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[413].getValue(nIndex));
    }

    /**
     * Sets the value of the 'LOCATION_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_LOCATION_ID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[413].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'LOCATION_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'LOCATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LOCATION_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[413].getCount());
    }

    /**
     * Retrieves the value of the 'ACTIVITY_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ACTIVITY_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACTIVITY_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[414].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ACTIVITY_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_ACTIVITY_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[414].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ACTIVITY_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'ACTIVITY_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACTIVITY_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[414].getCount());
    }

    /**
     * Retrieves the value of the 'ACTIVITY_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ACTIVITY_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACTIVITY_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[415].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ACTIVITY_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_ACTIVITY_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[415].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ACTIVITY_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'ACTIVITY_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACTIVITY_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[415].getCount());
    }

    /**
     * Retrieves the value of the 'OPERATION_STATUS' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'OPERATION_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_OPERATION_STATUS(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[416].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'OPERATION_STATUS' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_OPERATION_STATUS(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[416].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'OPERATION_STATUS' field in the FML buffer.
     *
     * @return Number of values defined for 'OPERATION_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_OPERATION_STATUS_size() throws FMLManipulationException {
        return (this.fmlBuffer[416].getCount());
    }

    /**
     * Retrieves the value of the 'ITEM_OWNERSHIP' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ITEM_OWNERSHIP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ITEM_OWNERSHIP(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[417].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'ITEM_OWNERSHIP' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_ITEM_OWNERSHIP(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[417].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'ITEM_OWNERSHIP' field in the FML buffer.
     *
     * @return Number of values defined for 'ITEM_OWNERSHIP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ITEM_OWNERSHIP_size() throws FMLManipulationException {
        return (this.fmlBuffer[417].getCount());
    }

    /**
     * Retrieves the value of the 'ITEM_OWNERSHIP_DT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ITEM_OWNERSHIP_DT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ITEM_OWNERSHIP_DT(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[418].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ITEM_OWNERSHIP_DT' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_ITEM_OWNERSHIP_DT(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[418].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ITEM_OWNERSHIP_DT' field in the FML buffer.
     *
     * @return Number of values defined for 'ITEM_OWNERSHIP_DT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ITEM_OWNERSHIP_DT_size() throws FMLManipulationException {
        return (this.fmlBuffer[418].getCount());
    }

    /**
     * Retrieves the value of the 'CURR_POSSESSION' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'CURR_POSSESSION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CURR_POSSESSION(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[419].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'CURR_POSSESSION' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_CURR_POSSESSION(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[419].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'CURR_POSSESSION' field in the FML buffer.
     *
     * @return Number of values defined for 'CURR_POSSESSION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CURR_POSSESSION_size() throws FMLManipulationException {
        return (this.fmlBuffer[419].getCount());
    }

    /**
     * Retrieves the value of the 'CURR_POSSESSION_DT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'CURR_POSSESSION_DT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CURR_POSSESSION_DT(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[420].getValue(nIndex));
    }

    /**
     * Sets the value of the 'CURR_POSSESSION_DT' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_CURR_POSSESSION_DT(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[420].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'CURR_POSSESSION_DT' field in the FML buffer.
     *
     * @return Number of values defined for 'CURR_POSSESSION_DT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CURR_POSSESSION_DT_size() throws FMLManipulationException {
        return (this.fmlBuffer[420].getCount());
    }

    /**
     * Retrieves the value of the 'MISSING_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'MISSING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MISSING_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[421].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'MISSING_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_MISSING_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[421].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'MISSING_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'MISSING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MISSING_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[421].getCount());
    }

    /**
     * Retrieves the value of the 'IN_REPAIR_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'IN_REPAIR_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_IN_REPAIR_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[422].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'IN_REPAIR_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_IN_REPAIR_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[422].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'IN_REPAIR_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'IN_REPAIR_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_IN_REPAIR_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[422].getCount());
    }

    /**
     * Retrieves the value of the 'IN_TRANSIT_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'IN_TRANSIT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_IN_TRANSIT_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[423].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'IN_TRANSIT_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_IN_TRANSIT_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[423].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'IN_TRANSIT_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'IN_TRANSIT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_IN_TRANSIT_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[423].getCount());
    }

    /**
     * Retrieves the value of the 'COMITED_TO_POS_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'COMITED_TO_POS_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COMITED_TO_POS_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[424].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'COMITED_TO_POS_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_COMITED_TO_POS_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[424].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'COMITED_TO_POS_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'COMITED_TO_POS_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COMITED_TO_POS_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[424].getCount());
    }

    /**
     * Retrieves the value of the 'COMITED_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'COMITED_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COMITED_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[425].getValue(nIndex));
    }

    /**
     * Sets the value of the 'COMITED_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_COMITED_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[425].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'COMITED_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'COMITED_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COMITED_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[425].getCount());
    }

    /**
     * Retrieves the value of the 'ACTIVITY_REASON' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ACTIVITY_REASON' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACTIVITY_REASON(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[426].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ACTIVITY_REASON' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_ACTIVITY_REASON(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[426].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ACTIVITY_REASON' field in the FML buffer.
     *
     * @return Number of values defined for 'ACTIVITY_REASON' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACTIVITY_REASON_size() throws FMLManipulationException {
        return (this.fmlBuffer[426].getCount());
    }

    /**
     * Retrieves the value of the 'UPGRADE_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'UPGRADE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_UPGRADE_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[427].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'UPGRADE_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_UPGRADE_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[427].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'UPGRADE_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'UPGRADE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_UPGRADE_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[427].getCount());
    }

    /**
     * Retrieves the value of the 'EXPECTED_RTRN_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'EXPECTED_RTRN_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EXPECTED_RTRN_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[428].getValue(nIndex));
    }

    /**
     * Sets the value of the 'EXPECTED_RTRN_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_EXPECTED_RTRN_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[428].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'EXPECTED_RTRN_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'EXPECTED_RTRN_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_EXPECTED_RTRN_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[428].getCount());
    }

    /**
     * Retrieves the value of the 'POLICE_REPORT_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'POLICE_REPORT_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_POLICE_REPORT_NO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[429].getValue(nIndex));
    }

    /**
     * Sets the value of the 'POLICE_REPORT_NO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 16.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_POLICE_REPORT_NO(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[429].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'POLICE_REPORT_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'POLICE_REPORT_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_POLICE_REPORT_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[429].getCount());
    }

    /**
     * Retrieves the value of the 'POLICE_REPORT_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'POLICE_REPORT_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_POLICE_REPORT_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[430].getValue(nIndex));
    }

    /**
     * Sets the value of the 'POLICE_REPORT_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_POLICE_REPORT_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[430].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'POLICE_REPORT_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'POLICE_REPORT_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_POLICE_REPORT_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[430].getCount());
    }

    /**
     * Retrieves the value of the 'POLICE_STATION' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'POLICE_STATION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_POLICE_STATION(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[431].getValue(nIndex));
    }

    /**
     * Sets the value of the 'POLICE_STATION' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 31.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_POLICE_STATION(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[431].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'POLICE_STATION' field in the FML buffer.
     *
     * @return Number of values defined for 'POLICE_STATION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_POLICE_STATION_size() throws FMLManipulationException {
        return (this.fmlBuffer[431].getCount());
    }

    /**
     * Retrieves the value of the 'PUK' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PUK' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PUK(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[432].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PUK' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_PUK(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[432].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PUK' field in the FML buffer.
     *
     * @return Number of values defined for 'PUK' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PUK_size() throws FMLManipulationException {
        return (this.fmlBuffer[432].getCount());
    }

    /**
     * Retrieves the value of the 'PUK2' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PUK2' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PUK2(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[433].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PUK2' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_PUK2(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[433].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PUK2' field in the FML buffer.
     *
     * @return Number of values defined for 'PUK2' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PUK2_size() throws FMLManipulationException {
        return (this.fmlBuffer[433].getCount());
    }

    /**
     * Retrieves the value of the 'FIRST_USED_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'FIRST_USED_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FIRST_USED_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[434].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FIRST_USED_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_FIRST_USED_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[434].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FIRST_USED_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'FIRST_USED_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FIRST_USED_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[434].getCount());
    }

    /**
     * Retrieves the value of the 'SIM_STATUS' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SIM_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SIM_STATUS(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[435].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'SIM_STATUS' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SIM_STATUS(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[435].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'SIM_STATUS' field in the FML buffer.
     *
     * @return Number of values defined for 'SIM_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SIM_STATUS_size() throws FMLManipulationException {
        return (this.fmlBuffer[435].getCount());
    }

    /**
     * Retrieves the value of the 'SUSPEND_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SUSPEND_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUSPEND_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[436].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'SUSPEND_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SUSPEND_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[436].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'SUSPEND_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'SUSPEND_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SUSPEND_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[436].getCount());
    }

    /**
     * Retrieves the value of the 'SUSPEND_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SUSPEND_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUSPEND_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[437].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SUSPEND_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SUSPEND_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[437].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SUSPEND_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'SUSPEND_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SUSPEND_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[437].getCount());
    }

    /**
     * Retrieves the value of the 'SENT_TO_AUC_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SENT_TO_AUC_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SENT_TO_AUC_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[438].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'SENT_TO_AUC_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SENT_TO_AUC_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[438].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'SENT_TO_AUC_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'SENT_TO_AUC_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SENT_TO_AUC_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[438].getCount());
    }

    /**
     * Retrieves the value of the 'HLR_CD' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'HLR_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_HLR_CD(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[439].getValue(nIndex));
    }

    /**
     * Sets the value of the 'HLR_CD' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_HLR_CD(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[439].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'HLR_CD' field in the FML buffer.
     *
     * @return Number of values defined for 'HLR_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_HLR_CD_size() throws FMLManipulationException {
        return (this.fmlBuffer[439].getCount());
    }

    /**
     * Retrieves the value of the 'K4ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'K4ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_K4ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[440].getValue(nIndex));
    }

    /**
     * Sets the value of the 'K4ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 41.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_K4ID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[440].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'K4ID' field in the FML buffer.
     *
     * @return Number of values defined for 'K4ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_K4ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[440].getCount());
    }

    /**
     * Retrieves the value of the 'PHYDEVARRAYDEALER_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PHYDEVARRAYDEALER_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PHYDEVARRAYDEALER_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[441].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PHYDEVARRAYDEALER_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_PHYDEVARRAYDEALER_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[441].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PHYDEVARRAYDEALER_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'PHYDEVARRAYDEALER_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PHYDEVARRAYDEALER_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[441].getCount());
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'PSOCFTRBUFROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PSOCFTRBUFROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[442].getValue(0));
    }

    /**
     * Sets the value of the 'PSOCFTRBUFROWCOUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PSOCFTRBUFROWCOUNT(Integer value) throws FMLManipulationException {
        this.fmlBuffer[442].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSOCFTRBUFROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PSOCFTRBUFROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[443].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PSOCFTRBUFROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_PSOCFTRBUFROWID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[443].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PSOCFTRBUFROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'PSOCFTRBUFROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSOCFTRBUFROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[443].getCount());
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFSOC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSOCFTRBUFSOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PSOCFTRBUFSOC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[444].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PSOCFTRBUFSOC' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 10.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_PSOCFTRBUFSOC(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[444].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PSOCFTRBUFSOC' field in the FML buffer.
     *
     * @return Number of values defined for 'PSOCFTRBUFSOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSOCFTRBUFSOC_size() throws FMLManipulationException {
        return (this.fmlBuffer[444].getCount());
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFSOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSOCFTRBUFSOC_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PSOCFTRBUFSOC_EFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[445].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PSOCFTRBUFSOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_PSOCFTRBUFSOC_EFFECTIVE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[445].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PSOCFTRBUFSOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'PSOCFTRBUFSOC_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSOCFTRBUFSOC_EFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[445].getCount());
    }

    /**
     * Retrieves the value of the 'FEATURE_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FEATURE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FEATURE_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[446].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FEATURE_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FEATURE_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[446].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FEATURE_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FEATURE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FEATURE_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[446].getCount());
    }

    /**
     * Retrieves the value of the 'MPS_FTR_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'MPS_FTR_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MPS_FTR_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[447].getValue(nIndex));
    }

    /**
     * Sets the value of the 'MPS_FTR_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_MPS_FTR_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[447].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'MPS_FTR_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'MPS_FTR_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MPS_FTR_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[447].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_EFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[448].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FTR_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FTR_EFFECTIVE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[448].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FTR_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_EFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[448].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_EXPIRATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_EXPIRATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[449].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FTR_EXPIRATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FTR_EXPIRATION_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[449].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FTR_EXPIRATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_EXPIRATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[449].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_EFF_RSN_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_EFF_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_EFF_RSN_CODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[450].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'FTR_EFF_RSN_CODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FTR_EFF_RSN_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[450].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'FTR_EFF_RSN_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_EFF_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_EFF_RSN_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[450].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_EXP_RSN_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_EXP_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_EXP_RSN_CODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[451].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'FTR_EXP_RSN_CODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FTR_EXP_RSN_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[451].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'FTR_EXP_RSN_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_EXP_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_EXP_RSN_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[451].getCount());
    }

    /**
     * Retrieves the value of the 'SERVICE_FTR_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'SERVICE_FTR_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_SERVICE_FTR_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[452].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SERVICE_FTR_SEQ_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_SERVICE_FTR_SEQ_NO(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[452].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SERVICE_FTR_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'SERVICE_FTR_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SERVICE_FTR_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[452].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[453].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'FTR_MODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FTR_MODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[453].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'FTR_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[453].getCount());
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFSOC_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSOCFTRBUFSOC_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PSOCFTRBUFSOC_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[454].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PSOCFTRBUFSOC_SEQ_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_PSOCFTRBUFSOC_SEQ_NO(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[454].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PSOCFTRBUFSOC_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'PSOCFTRBUFSOC_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSOCFTRBUFSOC_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[454].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_SUB_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_SUB_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_SUB_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[455].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'FTR_SUB_MODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FTR_SUB_MODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[455].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'FTR_SUB_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_SUB_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_SUB_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[455].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_ADD_PARAM' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_ADD_PARAM' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_ADD_PARAM(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[456].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FTR_ADD_PARAM' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 301.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FTR_ADD_PARAM(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[456].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FTR_ADD_PARAM' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_ADD_PARAM' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_ADD_PARAM_size() throws FMLManipulationException {
        return (this.fmlBuffer[456].getCount());
    }

    /**
     * Retrieves the value of the 'FEATURE_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FEATURE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FEATURE_TYPE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[457].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FEATURE_TYPE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FEATURE_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[457].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FEATURE_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'FEATURE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FEATURE_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[457].getCount());
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFPRODUCT_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSOCFTRBUFPRODUCT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PSOCFTRBUFPRODUCT_TYPE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[458].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PSOCFTRBUFPRODUCT_TYPE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_PSOCFTRBUFPRODUCT_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[458].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PSOCFTRBUFPRODUCT_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'PSOCFTRBUFPRODUCT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSOCFTRBUFPRODUCT_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[458].getCount());
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFCAMPAIGN_SEQ' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSOCFTRBUFCAMPAIGN_SEQ' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PSOCFTRBUFCAMPAIGN_SEQ(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[459].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PSOCFTRBUFCAMPAIGN_SEQ' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_PSOCFTRBUFCAMPAIGN_SEQ(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[459].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PSOCFTRBUFCAMPAIGN_SEQ' field in the FML buffer.
     *
     * @return Number of values defined for 'PSOCFTRBUFCAMPAIGN_SEQ' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSOCFTRBUFCAMPAIGN_SEQ_size() throws FMLManipulationException {
        return (this.fmlBuffer[459].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_SPECIAL_TELNO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_SPECIAL_TELNO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_SPECIAL_TELNO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[460].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FTR_SPECIAL_TELNO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FTR_SPECIAL_TELNO(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[460].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FTR_SPECIAL_TELNO' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_SPECIAL_TELNO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_SPECIAL_TELNO_size() throws FMLManipulationException {
        return (this.fmlBuffer[460].getCount());
    }

    /**
     * Retrieves the value of the 'SWITCH_ACT_NEEDED' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'SWITCH_ACT_NEEDED' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SWITCH_ACT_NEEDED(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[461].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'SWITCH_ACT_NEEDED' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_SWITCH_ACT_NEEDED(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[461].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'SWITCH_ACT_NEEDED' field in the FML buffer.
     *
     * @return Number of values defined for 'SWITCH_ACT_NEEDED' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SWITCH_ACT_NEEDED_size() throws FMLManipulationException {
        return (this.fmlBuffer[461].getCount());
    }

    /**
     * Retrieves the value of the 'SWITCH_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'SWITCH_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SWITCH_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[462].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SWITCH_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_SWITCH_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[462].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SWITCH_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'SWITCH_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SWITCH_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[462].getCount());
    }

    /**
     * Retrieves the value of the 'MSISDN_CRITERIA' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'MSISDN_CRITERIA' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MSISDN_CRITERIA(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[463].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'MSISDN_CRITERIA' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_MSISDN_CRITERIA(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[463].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'MSISDN_CRITERIA' field in the FML buffer.
     *
     * @return Number of values defined for 'MSISDN_CRITERIA' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MSISDN_CRITERIA_size() throws FMLManipulationException {
        return (this.fmlBuffer[463].getCount());
    }

    /**
     * Retrieves the value of the 'TN_CLASS_CD' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'TN_CLASS_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_TN_CLASS_CD(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[464].getValue(nIndex));
    }

    /**
     * Sets the value of the 'TN_CLASS_CD' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_TN_CLASS_CD(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[464].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'TN_CLASS_CD' field in the FML buffer.
     *
     * @return Number of values defined for 'TN_CLASS_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_TN_CLASS_CD_size() throws FMLManipulationException {
        return (this.fmlBuffer[464].getCount());
    }

    /**
     * Retrieves the value of the 'ACTION_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'ACTION_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACTION_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[465].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'ACTION_MODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_ACTION_MODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[465].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'ACTION_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'ACTION_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACTION_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[465].getCount());
    }

    /**
     * Retrieves the value of the 'MANUAL_RC_RATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'MANUAL_RC_RATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_MANUAL_RC_RATE(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[466].getValue(nIndex));
    }

    /**
     * Sets the value of the 'MANUAL_RC_RATE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_MANUAL_RC_RATE(int nIndex, Double value) throws FMLManipulationException {
        this.fmlBuffer[466].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'MANUAL_RC_RATE' field in the FML buffer.
     *
     * @return Number of values defined for 'MANUAL_RC_RATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MANUAL_RC_RATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[466].getCount());
    }

    /**
     * Retrieves the value of the 'MANUAL_RC_EXP_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'MANUAL_RC_EXP_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MANUAL_RC_EXP_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[467].getValue(nIndex));
    }

    /**
     * Sets the value of the 'MANUAL_RC_EXP_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_MANUAL_RC_EXP_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[467].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'MANUAL_RC_EXP_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'MANUAL_RC_EXP_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MANUAL_RC_EXP_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[467].getCount());
    }

    /**
     * Retrieves the value of the 'PNPINFOBUFFROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'PNPINFOBUFFROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PNPINFOBUFFROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[468].getValue(0));
    }

    /**
     * Sets the value of the 'PNPINFOBUFFROWCOUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PNPINFOBUFFROWCOUNT(Integer value) throws FMLManipulationException {
        this.fmlBuffer[468].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPNUMINFORECROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[469].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NPNUMINFORECROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_NPNUMINFORECROWID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[469].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NPNUMINFORECROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[469].getCount());
    }

    /**
     * Retrieves the value of the 'PORT_NUMBER' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'PORT_NUMBER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PORT_NUMBER(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[470].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PORT_NUMBER' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_PORT_NUMBER(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[470].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PORT_NUMBER' field in the FML buffer.
     *
     * @return Number of values defined for 'PORT_NUMBER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PORT_NUMBER_size() throws FMLManipulationException {
        return (this.fmlBuffer[470].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPNUMINFORECEFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[471].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NPNUMINFORECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_NPNUMINFORECEFFECTIVE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[471].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NPNUMINFORECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECEFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[471].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECSYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPNUMINFORECSYS_CREATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[472].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NPNUMINFORECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_NPNUMINFORECSYS_CREATION_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[472].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NPNUMINFORECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECSYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECSYS_CREATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[472].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECSYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPNUMINFORECSYS_UPDATE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[473].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NPNUMINFORECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_NPNUMINFORECSYS_UPDATE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[473].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NPNUMINFORECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECSYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECSYS_UPDATE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[473].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECOPERATOR_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NPNUMINFORECOPERATOR_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[474].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NPNUMINFORECOPERATOR_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_NPNUMINFORECOPERATOR_ID(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[474].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NPNUMINFORECOPERATOR_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECOPERATOR_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[474].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECAPPLICATION_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPNUMINFORECAPPLICATION_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[475].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NPNUMINFORECAPPLICATION_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_NPNUMINFORECAPPLICATION_ID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[475].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NPNUMINFORECAPPLICATION_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECAPPLICATION_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[475].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECDL_SERVICE_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECDL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPNUMINFORECDL_SERVICE_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[476].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NPNUMINFORECDL_SERVICE_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_NPNUMINFORECDL_SERVICE_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[476].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NPNUMINFORECDL_SERVICE_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECDL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECDL_SERVICE_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[476].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECDL_UPDATE_STAMP' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECDL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NPNUMINFORECDL_UPDATE_STAMP(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[477].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'NPNUMINFORECDL_UPDATE_STAMP' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_NPNUMINFORECDL_UPDATE_STAMP(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[477].setValue(nIndex, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves number of values defined for 'NPNUMINFORECDL_UPDATE_STAMP' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECDL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECDL_UPDATE_STAMP_size() throws FMLManipulationException {
        return (this.fmlBuffer[477].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECEXPIRATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECEXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPNUMINFORECEXPIRATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[478].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NPNUMINFORECEXPIRATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_NPNUMINFORECEXPIRATION_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[478].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NPNUMINFORECEXPIRATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECEXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECEXPIRATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[478].getCount());
    }

    /**
     * Retrieves the value of the 'INT_ORDER_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'INT_ORDER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_INT_ORDER_ID(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[479].getValue(nIndex));
    }

    /**
     * Sets the value of the 'INT_ORDER_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_INT_ORDER_ID(int nIndex, Double value) throws FMLManipulationException {
        this.fmlBuffer[479].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'INT_ORDER_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'INT_ORDER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_INT_ORDER_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[479].getCount());
    }

    /**
     * Retrieves the value of the 'ORG_CUSTOMER_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'ORG_CUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ORG_CUSTOMER_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[480].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ORG_CUSTOMER_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_ORG_CUSTOMER_ID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[480].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ORG_CUSTOMER_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'ORG_CUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ORG_CUSTOMER_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[480].getCount());
    }

    /**
     * Retrieves the value of the 'PORT_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'PORT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PORT_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[481].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'PORT_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_PORT_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[481].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'PORT_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'PORT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PORT_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[481].getCount());
    }

    /**
     * Retrieves the value of the 'NUMBER_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NUMBER_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NUMBER_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[482].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'NUMBER_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_NUMBER_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[482].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'NUMBER_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'NUMBER_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NUMBER_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[482].getCount());
    }

    /**
     * Retrieves the value of the 'PORT_REQUEST_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'PORT_REQUEST_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PORT_REQUEST_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[483].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PORT_REQUEST_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_PORT_REQUEST_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[483].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PORT_REQUEST_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'PORT_REQUEST_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PORT_REQUEST_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[483].getCount());
    }

    /**
     * Retrieves the value of the 'ORG_OPERATOR' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'ORG_OPERATOR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ORG_OPERATOR(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[484].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ORG_OPERATOR' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_ORG_OPERATOR(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[484].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ORG_OPERATOR' field in the FML buffer.
     *
     * @return Number of values defined for 'ORG_OPERATOR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ORG_OPERATOR_size() throws FMLManipulationException {
        return (this.fmlBuffer[484].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECSUBSCRIBER_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECSUBSCRIBER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NPNUMINFORECSUBSCRIBER_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[485].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NPNUMINFORECSUBSCRIBER_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_NPNUMINFORECSUBSCRIBER_ID(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[485].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NPNUMINFORECSUBSCRIBER_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECSUBSCRIBER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECSUBSCRIBER_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[485].getCount());
    }

    /**
     * Retrieves the value of the 'LAST_INT_ORD_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'LAST_INT_ORD_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_LAST_INT_ORD_ID(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[486].getValue(nIndex));
    }

    /**
     * Sets the value of the 'LAST_INT_ORD_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_LAST_INT_ORD_ID(int nIndex, Double value) throws FMLManipulationException {
        this.fmlBuffer[486].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'LAST_INT_ORD_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'LAST_INT_ORD_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LAST_INT_ORD_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[486].getCount());
    }

    /**
     * Retrieves the value of the 'FUNCTION_PORT_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'FUNCTION_PORT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FUNCTION_PORT_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[487].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'FUNCTION_PORT_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_FUNCTION_PORT_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[487].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'FUNCTION_PORT_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'FUNCTION_PORT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FUNCTION_PORT_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[487].getCount());
    }

    /**
     * Retrieves the value of the 'PASSIVE_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'PASSIVE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PASSIVE_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[488].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'PASSIVE_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_PASSIVE_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[488].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'PASSIVE_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'PASSIVE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PASSIVE_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[488].getCount());
    }

    /**
     * Retrieves the value of the 'AUTO_CONFIRM' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'AUTO_CONFIRM' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_AUTO_CONFIRM(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[489].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'AUTO_CONFIRM' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_AUTO_CONFIRM(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[489].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'AUTO_CONFIRM' field in the FML buffer.
     *
     * @return Number of values defined for 'AUTO_CONFIRM' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_AUTO_CONFIRM_size() throws FMLManipulationException {
        return (this.fmlBuffer[489].getCount());
    }

    /**
     * Retrieves the value of the 'TEMPORARY_MSISDN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'TEMPORARY_MSISDN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_TEMPORARY_MSISDN(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[490].getValue(nIndex));
    }

    /**
     * Sets the value of the 'TEMPORARY_MSISDN' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_TEMPORARY_MSISDN(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[490].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'TEMPORARY_MSISDN' field in the FML buffer.
     *
     * @return Number of values defined for 'TEMPORARY_MSISDN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_TEMPORARY_MSISDN_size() throws FMLManipulationException {
        return (this.fmlBuffer[490].getCount());
    }

    /**
     * Retrieves the value of the 'HANDLE_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'HANDLE_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_HANDLE_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[491].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'HANDLE_MODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_HANDLE_MODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[491].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'HANDLE_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'HANDLE_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_HANDLE_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[491].getCount());
    }

    /**
     * Retrieves the value of the 'SEND_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'SEND_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SEND_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[492].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'SEND_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_SEND_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[492].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'SEND_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'SEND_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SEND_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[492].getCount());
    }

    /**
     * Retrieves the value of the 'ORDID_STR' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'ORDID_STR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ORDID_STR(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[493].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ORDID_STR' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_ORDID_STR(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[493].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ORDID_STR' field in the FML buffer.
     *
     * @return Number of values defined for 'ORDID_STR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ORDID_STR_size() throws FMLManipulationException {
        return (this.fmlBuffer[493].getCount());
    }

    /**
     * Retrieves the value of the 'LAST_ORDID_STR' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'LAST_ORDID_STR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LAST_ORDID_STR(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[494].getValue(nIndex));
    }

    /**
     * Sets the value of the 'LAST_ORDID_STR' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_LAST_ORDID_STR(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[494].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'LAST_ORDID_STR' field in the FML buffer.
     *
     * @return Number of values defined for 'LAST_ORDID_STR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LAST_ORDID_STR_size() throws FMLManipulationException {
        return (this.fmlBuffer[494].getCount());
    }

    /**
     * Retrieves the value of the 'ICC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'ICC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ICC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[495].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ICC' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_ICC(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[495].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ICC' field in the FML buffer.
     *
     * @return Number of values defined for 'ICC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ICC_size() throws FMLManipulationException {
        return (this.fmlBuffer[495].getCount());
    }

    /**
     * Retrieves the value of the 'CUSTOMER_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'CUSTOMER_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CUSTOMER_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[496].getValue(nIndex));
    }

    /**
     * Sets the value of the 'CUSTOMER_NAME' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 255.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_CUSTOMER_NAME(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[496].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'CUSTOMER_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'CUSTOMER_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CUSTOMER_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[496].getCount());
    }

    /**
     * Retrieves the value of the 'NPINFOBUFFCUSTOMER_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPINFOBUFFCUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPINFOBUFFCUSTOMER_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[497].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NPINFOBUFFCUSTOMER_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_NPINFOBUFFCUSTOMER_ID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[497].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NPINFOBUFFCUSTOMER_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'NPINFOBUFFCUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPINFOBUFFCUSTOMER_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[497].getCount());
    }

    /**
     * Retrieves the value of the 'SERVICE_PROVIDER' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'SERVICE_PROVIDER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SERVICE_PROVIDER(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[498].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SERVICE_PROVIDER' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @throws FMLManipulationException
     */
    public void set_SERVICE_PROVIDER(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[498].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SERVICE_PROVIDER' field in the FML buffer.
     *
     * @return Number of values defined for 'SERVICE_PROVIDER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SERVICE_PROVIDER_size() throws FMLManipulationException {
        return (this.fmlBuffer[498].getCount());
    }

    /**
     * Retrieves the value of the 'RSNCODE' field in the FML buffer.
     *
     * @return Value of 'RSNCODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_RSNCODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[499].getValue(0));
    }

    /**
     * Sets the value of the 'RSNCODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @throws FMLManipulationException
     */
    public void set_RSNCODE(String value) throws FMLManipulationException {
        this.fmlBuffer[499].setValue(0, value);
    }
}