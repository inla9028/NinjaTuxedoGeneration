/*
 * CsChgCtnInput.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service.parameters;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;

/**
 * @author  Ninja
 *
 * CsChgCtnInput class.
 */
public class CsChgCtnInput extends ServiceInput {
    // Indicates whether the default values has been loaded from the DB or not
    private static Boolean defaultValuesPopulated = new Boolean(false);
    // Holds default values for fields in FML buffer
    private static String defaultValues[] = null;

    /**
     * Creates a new instance of CsChgCtnInput
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsChgCtnInput() throws EnvironmentException, FMLManipulationException {
        // Initialize FML buffer
        fmlBuffer = new FmlField[382];

        // Get default values from DB
        synchronized (this.defaultValuesPopulated) {
            if (this.defaultValuesPopulated.equals(Boolean.FALSE)) {
                defaultValues = getDefaultValues("csChgCtn", 382);
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
        this.fmlBuffer[16] = new FmlField("ROWCOUNT", FmlField.TYPE_INTEGER, -1, defaultValues[16], 16, 1);
        this.fmlBuffer[17] = new FmlField("ROWID", FmlField.TYPE_STRING, 19, defaultValues[17], 17, 50);
        this.fmlBuffer[18] = new FmlField("SOC", FmlField.TYPE_STRING, 10, defaultValues[18], 18, 50);
        this.fmlBuffer[19] = new FmlField("SOC_EFFECTIVE_DATE", FmlField.TYPE_STRING, 9, defaultValues[19], 19, 50);
        this.fmlBuffer[20] = new FmlField("COMMITMENT_END_DATE", FmlField.TYPE_STRING, 9, defaultValues[20], 20, 50);
        this.fmlBuffer[21] = new FmlField("SERVICE_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[21], 21, 50);
        this.fmlBuffer[22] = new FmlField("EFFECTIVE_DATE", FmlField.TYPE_STRING, 9, defaultValues[22], 22, 50);
        this.fmlBuffer[23] = new FmlField("EXPIRATION_DATE", FmlField.TYPE_STRING, 9, defaultValues[23], 23, 50);
        this.fmlBuffer[24] = new FmlField("SOC_LEVEL_CODE", FmlField.TYPE_BYTE, -1, defaultValues[24], 24, 50);
        this.fmlBuffer[25] = new FmlField("DEALER_CODE", FmlField.TYPE_STRING, 6, defaultValues[25], 25, 50);
        this.fmlBuffer[26] = new FmlField("SALES_AGENT", FmlField.TYPE_STRING, 6, defaultValues[26], 26, 50);
        this.fmlBuffer[27] = new FmlField("SRV_MODE", FmlField.TYPE_BYTE, -1, defaultValues[27], 27, 50);
        this.fmlBuffer[28] = new FmlField("SRV_SUB_MODE", FmlField.TYPE_BYTE, -1, defaultValues[28], 28, 50);
        this.fmlBuffer[29] = new FmlField("SOC_SEQ_NO", FmlField.TYPE_INTEGER, -1, defaultValues[29], 29, 50);
        this.fmlBuffer[30] = new FmlField("SRV_TRX_ID", FmlField.TYPE_INTEGER, -1, defaultValues[30], 30, 50);
        this.fmlBuffer[31] = new FmlField("CAMPAIGN_SEQ", FmlField.TYPE_INTEGER, -1, defaultValues[31], 31, 50);
        this.fmlBuffer[32] = new FmlField("CAMPAIGN", FmlField.TYPE_STRING, 10, defaultValues[32], 32, 50);
        this.fmlBuffer[33] = new FmlField("COMMIT_ORIG_NO_MONTH", FmlField.TYPE_SHORT, -1, defaultValues[33], 33, 50);
        this.fmlBuffer[34] = new FmlField("PRODUCT_TYPE", FmlField.TYPE_STRING, 4, defaultValues[34], 34, 50);
        this.fmlBuffer[35] = new FmlField("LOAN_VER_NO", FmlField.TYPE_INTEGER, -1, defaultValues[35], 35, 50);
        this.fmlBuffer[36] = new FmlField("LOAN_SEQ_NO", FmlField.TYPE_INTEGER, -1, defaultValues[36], 36, 50);
        this.fmlBuffer[37] = new FmlField("SOC_ACTV_FEE", FmlField.TYPE_DOUBLE, -1, defaultValues[37], 37, 50);
        this.fmlBuffer[38] = new FmlField("PROMOTIONAL_SOC", FmlField.TYPE_STRING, 10, defaultValues[38], 38, 50);
        this.fmlBuffer[39] = new FmlField("REASON_CODE", FmlField.TYPE_STRING, 5, defaultValues[39], 39, 50);
        this.fmlBuffer[40] = new FmlField("SOC_START_RC_DATE", FmlField.TYPE_STRING, 9, defaultValues[40], 40, 50);
        this.fmlBuffer[41] = new FmlField("RC_DATE_COPY_IND", FmlField.TYPE_BYTE, -1, defaultValues[41], 41, 50);
        this.fmlBuffer[42] = new FmlField("PAGRRECROWID", FmlField.TYPE_STRING, 19, defaultValues[42], 42, 1);
        this.fmlBuffer[43] = new FmlField("PAGRRECSOC", FmlField.TYPE_STRING, 10, defaultValues[43], 43, 1);
        this.fmlBuffer[44] = new FmlField("PAGRRECSOC_EFFECTIVE_DATE", FmlField.TYPE_STRING, 9, defaultValues[44], 44, 1);
        this.fmlBuffer[45] = new FmlField("PAGRRECCOMMITMENT_END_DATE", FmlField.TYPE_STRING, 9, defaultValues[45], 45, 1);
        this.fmlBuffer[46] = new FmlField("PAGRRECSERVICE_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[46], 46, 1);
        this.fmlBuffer[47] = new FmlField("PAGRRECEFFECTIVE_DATE", FmlField.TYPE_STRING, 9, defaultValues[47], 47, 1);
        this.fmlBuffer[48] = new FmlField("PAGRRECEXPIRATION_DATE", FmlField.TYPE_STRING, 9, defaultValues[48], 48, 1);
        this.fmlBuffer[49] = new FmlField("PAGRRECSOC_LEVEL_CODE", FmlField.TYPE_BYTE, -1, defaultValues[49], 49, 1);
        this.fmlBuffer[50] = new FmlField("PAGRRECDEALER_CODE", FmlField.TYPE_STRING, 6, defaultValues[50], 50, 1);
        this.fmlBuffer[51] = new FmlField("PAGRRECSALES_AGENT", FmlField.TYPE_STRING, 6, defaultValues[51], 51, 1);
        this.fmlBuffer[52] = new FmlField("PAGRRECSRV_MODE", FmlField.TYPE_BYTE, -1, defaultValues[52], 52, 1);
        this.fmlBuffer[53] = new FmlField("PAGRRECSRV_SUB_MODE", FmlField.TYPE_BYTE, -1, defaultValues[53], 53, 1);
        this.fmlBuffer[54] = new FmlField("PAGRRECSOC_SEQ_NO", FmlField.TYPE_INTEGER, -1, defaultValues[54], 54, 1);
        this.fmlBuffer[55] = new FmlField("PAGRRECSRV_TRX_ID", FmlField.TYPE_INTEGER, -1, defaultValues[55], 55, 1);
        this.fmlBuffer[56] = new FmlField("PAGRRECCAMPAIGN_SEQ", FmlField.TYPE_INTEGER, -1, defaultValues[56], 56, 1);
        this.fmlBuffer[57] = new FmlField("PAGRRECCAMPAIGN", FmlField.TYPE_STRING, 10, defaultValues[57], 57, 1);
        this.fmlBuffer[58] = new FmlField("PAGRRECCOMMIT_ORIG_NO_MONTH", FmlField.TYPE_SHORT, -1, defaultValues[58], 58, 1);
        this.fmlBuffer[59] = new FmlField("PAGRRECPRODUCT_TYPE", FmlField.TYPE_STRING, 4, defaultValues[59], 59, 1);
        this.fmlBuffer[60] = new FmlField("PAGRRECLOAN_VER_NO", FmlField.TYPE_INTEGER, -1, defaultValues[60], 60, 1);
        this.fmlBuffer[61] = new FmlField("PAGRRECLOAN_SEQ_NO", FmlField.TYPE_INTEGER, -1, defaultValues[61], 61, 1);
        this.fmlBuffer[62] = new FmlField("PAGRRECSOC_ACTV_FEE", FmlField.TYPE_DOUBLE, -1, defaultValues[62], 62, 1);
        this.fmlBuffer[63] = new FmlField("PAGRRECPROMOTIONAL_SOC", FmlField.TYPE_STRING, 10, defaultValues[63], 63, 1);
        this.fmlBuffer[64] = new FmlField("PAGRRECREASON_CODE", FmlField.TYPE_STRING, 5, defaultValues[64], 64, 1);
        this.fmlBuffer[65] = new FmlField("PAGRRECSOC_START_RC_DATE", FmlField.TYPE_STRING, 9, defaultValues[65], 65, 1);
        this.fmlBuffer[66] = new FmlField("PAGRRECRC_DATE_COPY_IND", FmlField.TYPE_BYTE, -1, defaultValues[66], 66, 1);
        this.fmlBuffer[67] = new FmlField("PSOCFTRBUFROWCOUNT", FmlField.TYPE_INTEGER, -1, defaultValues[67], 67, 1);
        this.fmlBuffer[68] = new FmlField("PSOCFTRBUFROWID", FmlField.TYPE_STRING, 19, defaultValues[68], 68, 200);
        this.fmlBuffer[69] = new FmlField("PSOCFTRBUFSOC", FmlField.TYPE_STRING, 10, defaultValues[69], 69, 200);
        this.fmlBuffer[70] = new FmlField("PSOCFTRBUFSOC_EFFECTIVE_DATE", FmlField.TYPE_STRING, 9, defaultValues[70], 70, 200);
        this.fmlBuffer[71] = new FmlField("FEATURE_CODE", FmlField.TYPE_STRING, 7, defaultValues[71], 71, 200);
        this.fmlBuffer[72] = new FmlField("MPS_FTR_CODE", FmlField.TYPE_STRING, 7, defaultValues[72], 72, 200);
        this.fmlBuffer[73] = new FmlField("FTR_EFFECTIVE_DATE", FmlField.TYPE_STRING, 9, defaultValues[73], 73, 200);
        this.fmlBuffer[74] = new FmlField("FTR_EXPIRATION_DATE", FmlField.TYPE_STRING, 9, defaultValues[74], 74, 200);
        this.fmlBuffer[75] = new FmlField("FTR_EFF_RSN_CODE", FmlField.TYPE_BYTE, -1, defaultValues[75], 75, 200);
        this.fmlBuffer[76] = new FmlField("FTR_EXP_RSN_CODE", FmlField.TYPE_BYTE, -1, defaultValues[76], 76, 200);
        this.fmlBuffer[77] = new FmlField("SERVICE_FTR_SEQ_NO", FmlField.TYPE_INTEGER, -1, defaultValues[77], 77, 200);
        this.fmlBuffer[78] = new FmlField("FTR_MODE", FmlField.TYPE_BYTE, -1, defaultValues[78], 78, 200);
        this.fmlBuffer[79] = new FmlField("PSOCFTRBUFSOC_SEQ_NO", FmlField.TYPE_INTEGER, -1, defaultValues[79], 79, 200);
        this.fmlBuffer[80] = new FmlField("FTR_SUB_MODE", FmlField.TYPE_BYTE, -1, defaultValues[80], 80, 200);
        this.fmlBuffer[81] = new FmlField("FTR_ADD_PARAM", FmlField.TYPE_STRING, 301, defaultValues[81], 81, 200);
        this.fmlBuffer[82] = new FmlField("FEATURE_TYPE", FmlField.TYPE_STRING, 4, defaultValues[82], 82, 200);
        this.fmlBuffer[83] = new FmlField("PSOCFTRBUFPRODUCT_TYPE", FmlField.TYPE_STRING, 4, defaultValues[83], 83, 200);
        this.fmlBuffer[84] = new FmlField("PSOCFTRBUFCAMPAIGN_SEQ", FmlField.TYPE_INTEGER, -1, defaultValues[84], 84, 200);
        this.fmlBuffer[85] = new FmlField("FTR_SPECIAL_TELNO", FmlField.TYPE_STRING, 21, defaultValues[85], 85, 200);
        this.fmlBuffer[86] = new FmlField("SWITCH_ACT_NEEDED", FmlField.TYPE_BYTE, -1, defaultValues[86], 86, 200);
        this.fmlBuffer[87] = new FmlField("SWITCH_CODE", FmlField.TYPE_STRING, 7, defaultValues[87], 87, 200);
        this.fmlBuffer[88] = new FmlField("MSISDN_CRITERIA", FmlField.TYPE_BYTE, -1, defaultValues[88], 88, 200);
        this.fmlBuffer[89] = new FmlField("TN_CLASS_CD", FmlField.TYPE_STRING, 4, defaultValues[89], 89, 200);
        this.fmlBuffer[90] = new FmlField("ACTION_MODE", FmlField.TYPE_BYTE, -1, defaultValues[90], 90, 200);
        this.fmlBuffer[91] = new FmlField("MANUAL_RC_RATE", FmlField.TYPE_DOUBLE, -1, defaultValues[91], 91, 200);
        this.fmlBuffer[92] = new FmlField("MANUAL_RC_EXP_DATE", FmlField.TYPE_STRING, 9, defaultValues[92], 92, 200);
        this.fmlBuffer[93] = new FmlField("PCSFRNDFMLROWCOUNT", FmlField.TYPE_INTEGER, -1, defaultValues[93], 93, 1);
        this.fmlBuffer[94] = new FmlField("ACTIONIND", FmlField.TYPE_BYTE, -1, defaultValues[94], 94, 10000);
        this.fmlBuffer[95] = new FmlField("PCSFANDFRECROWID", FmlField.TYPE_STRING, 19, defaultValues[95], 95, 10000);
        this.fmlBuffer[96] = new FmlField("PCSFANDFRECEFFECTIVE_DATE", FmlField.TYPE_STRING, 15, defaultValues[96], 96, 10000);
        this.fmlBuffer[97] = new FmlField("PCSFANDFRECEXPIRATION_DATE", FmlField.TYPE_STRING, 15, defaultValues[97], 97, 10000);
        this.fmlBuffer[98] = new FmlField("PERSONAL_TEL", FmlField.TYPE_STRING, 21, defaultValues[98], 98, 10000);
        this.fmlBuffer[99] = new FmlField("PERSONAL_TEL_TO", FmlField.TYPE_STRING, 21, defaultValues[99], 99, 10000);
        this.fmlBuffer[100] = new FmlField("FF_SOC", FmlField.TYPE_STRING, 10, defaultValues[100], 100, 10000);
        this.fmlBuffer[101] = new FmlField("PLAN_CODE", FmlField.TYPE_STRING, 10, defaultValues[101], 101, 10000);
        this.fmlBuffer[102] = new FmlField("DISCOUNT_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[102], 102, 10000);
        this.fmlBuffer[103] = new FmlField("START_HOUR", FmlField.TYPE_STRING, 7, defaultValues[103], 103, 10000);
        this.fmlBuffer[104] = new FmlField("DURATION", FmlField.TYPE_DOUBLE, -1, defaultValues[104], 104, 10000);
        this.fmlBuffer[105] = new FmlField("PESNBUFFERROWCOUNT", FmlField.TYPE_INTEGER, -1, defaultValues[105], 105, 1);
        this.fmlBuffer[106] = new FmlField("EQUIPMENT_NO", FmlField.TYPE_STRING, 21, defaultValues[106], 106, 50);
        this.fmlBuffer[107] = new FmlField("PHD_SEQ_NO", FmlField.TYPE_INTEGER, -1, defaultValues[107], 107, 50);
        this.fmlBuffer[108] = new FmlField("EQUIPMENT_LEVEL", FmlField.TYPE_SHORT, -1, defaultValues[108], 108, 50);
        this.fmlBuffer[109] = new FmlField("IMSI", FmlField.TYPE_STRING, 16, defaultValues[109], 109, 50);
        this.fmlBuffer[110] = new FmlField("PHYDEVARRAYEXPIRATION_DATE", FmlField.TYPE_STRING, 15, defaultValues[110], 110, 50);
        this.fmlBuffer[111] = new FmlField("PHYDEVARRAYEFFECTIVE_DATE", FmlField.TYPE_STRING, 15, defaultValues[111], 111, 50);
        this.fmlBuffer[112] = new FmlField("OWNERSHIP_CODE", FmlField.TYPE_STRING, 3, defaultValues[112], 112, 50);
        this.fmlBuffer[113] = new FmlField("SW_STATE_IND", FmlField.TYPE_BYTE, -1, defaultValues[113], 113, 50);
        this.fmlBuffer[114] = new FmlField("LAST_SW_ACTV_DATE", FmlField.TYPE_STRING, 9, defaultValues[114], 114, 50);
        this.fmlBuffer[115] = new FmlField("NEXT_ACTV_CODE", FmlField.TYPE_BYTE, -1, defaultValues[115], 115, 50);
        this.fmlBuffer[116] = new FmlField("NEXT_ACTV_DATE", FmlField.TYPE_STRING, 9, defaultValues[116], 116, 50);
        this.fmlBuffer[117] = new FmlField("NEXT_ACTV_ISSUE_DT", FmlField.TYPE_STRING, 9, defaultValues[117], 117, 50);
        this.fmlBuffer[118] = new FmlField("DEVICE_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[118], 118, 50);
        this.fmlBuffer[119] = new FmlField("ESN_MODE", FmlField.TYPE_BYTE, -1, defaultValues[119], 119, 50);
        this.fmlBuffer[120] = new FmlField("ITEM_ID", FmlField.TYPE_STRING, 16, defaultValues[120], 120, 50);
        this.fmlBuffer[121] = new FmlField("POOL", FmlField.TYPE_STRING, 3, defaultValues[121], 121, 50);
        this.fmlBuffer[122] = new FmlField("LOCATION_ID", FmlField.TYPE_STRING, 5, defaultValues[122], 122, 50);
        this.fmlBuffer[123] = new FmlField("ACTIVITY_CODE", FmlField.TYPE_STRING, 5, defaultValues[123], 123, 50);
        this.fmlBuffer[124] = new FmlField("ACTIVITY_DATE", FmlField.TYPE_STRING, 15, defaultValues[124], 124, 50);
        this.fmlBuffer[125] = new FmlField("OPERATION_STATUS", FmlField.TYPE_BYTE, -1, defaultValues[125], 125, 50);
        this.fmlBuffer[126] = new FmlField("ITEM_OWNERSHIP", FmlField.TYPE_BYTE, -1, defaultValues[126], 126, 50);
        this.fmlBuffer[127] = new FmlField("ITEM_OWNERSHIP_DT", FmlField.TYPE_STRING, 15, defaultValues[127], 127, 50);
        this.fmlBuffer[128] = new FmlField("CURR_POSSESSION", FmlField.TYPE_BYTE, -1, defaultValues[128], 128, 50);
        this.fmlBuffer[129] = new FmlField("CURR_POSSESSION_DT", FmlField.TYPE_STRING, 15, defaultValues[129], 129, 50);
        this.fmlBuffer[130] = new FmlField("MISSING_IND", FmlField.TYPE_BYTE, -1, defaultValues[130], 130, 50);
        this.fmlBuffer[131] = new FmlField("IN_REPAIR_IND", FmlField.TYPE_BYTE, -1, defaultValues[131], 131, 50);
        this.fmlBuffer[132] = new FmlField("IN_TRANSIT_IND", FmlField.TYPE_BYTE, -1, defaultValues[132], 132, 50);
        this.fmlBuffer[133] = new FmlField("COMITED_TO_POS_IND", FmlField.TYPE_BYTE, -1, defaultValues[133], 133, 50);
        this.fmlBuffer[134] = new FmlField("COMITED_DATE", FmlField.TYPE_STRING, 15, defaultValues[134], 134, 50);
        this.fmlBuffer[135] = new FmlField("ACTIVITY_REASON", FmlField.TYPE_STRING, 4, defaultValues[135], 135, 50);
        this.fmlBuffer[136] = new FmlField("UPGRADE_IND", FmlField.TYPE_BYTE, -1, defaultValues[136], 136, 50);
        this.fmlBuffer[137] = new FmlField("EXPECTED_RTRN_DATE", FmlField.TYPE_STRING, 15, defaultValues[137], 137, 50);
        this.fmlBuffer[138] = new FmlField("POLICE_REPORT_NO", FmlField.TYPE_STRING, 16, defaultValues[138], 138, 50);
        this.fmlBuffer[139] = new FmlField("POLICE_REPORT_DATE", FmlField.TYPE_STRING, 15, defaultValues[139], 139, 50);
        this.fmlBuffer[140] = new FmlField("POLICE_STATION", FmlField.TYPE_STRING, 31, defaultValues[140], 140, 50);
        this.fmlBuffer[141] = new FmlField("PUK", FmlField.TYPE_INTEGER, -1, defaultValues[141], 141, 50);
        this.fmlBuffer[142] = new FmlField("PUK2", FmlField.TYPE_INTEGER, -1, defaultValues[142], 142, 50);
        this.fmlBuffer[143] = new FmlField("FIRST_USED_DATE", FmlField.TYPE_STRING, 15, defaultValues[143], 143, 50);
        this.fmlBuffer[144] = new FmlField("SIM_STATUS", FmlField.TYPE_BYTE, -1, defaultValues[144], 144, 50);
        this.fmlBuffer[145] = new FmlField("SUSPEND_IND", FmlField.TYPE_BYTE, -1, defaultValues[145], 145, 50);
        this.fmlBuffer[146] = new FmlField("SUSPEND_DATE", FmlField.TYPE_STRING, 15, defaultValues[146], 146, 50);
        this.fmlBuffer[147] = new FmlField("SENT_TO_AUC_IND", FmlField.TYPE_BYTE, -1, defaultValues[147], 147, 50);
        this.fmlBuffer[148] = new FmlField("HLR_CD", FmlField.TYPE_STRING, 4, defaultValues[148], 148, 50);
        this.fmlBuffer[149] = new FmlField("K4ID", FmlField.TYPE_STRING, 41, defaultValues[149], 149, 50);
        this.fmlBuffer[150] = new FmlField("PHYDEVARRAYDEALER_CODE", FmlField.TYPE_STRING, 6, defaultValues[150], 150, 50);
        this.fmlBuffer[151] = new FmlField("ROW_COUNT", FmlField.TYPE_INTEGER, -1, defaultValues[151], 151, 1);
        this.fmlBuffer[152] = new FmlField("ACT_CODE", FmlField.TYPE_STRING, 4, defaultValues[152], 152, 25);
        this.fmlBuffer[153] = new FmlField("ACT_REASON", FmlField.TYPE_STRING, 5, defaultValues[153], 153, 25);
        this.fmlBuffer[154] = new FmlField("SUSP_RC_RATE_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[154], 154, 25);
        this.fmlBuffer[155] = new FmlField("MEMO_CTN", FmlField.TYPE_STRING, 21, defaultValues[155], 155, 25);
        this.fmlBuffer[156] = new FmlField("USER_TEXT", FmlField.TYPE_STRING, 2001, defaultValues[156], 156, 25);
        this.fmlBuffer[157] = new FmlField("MEMO_SOURCE", FmlField.TYPE_BYTE, -1, defaultValues[157], 157, 25);
        this.fmlBuffer[158] = new FmlField("PARAM_COUNT", FmlField.TYPE_INTEGER, -1, defaultValues[158], 158, 25);
        this.fmlBuffer[159] = new FmlField("P1", FmlField.TYPE_STRING, 21, defaultValues[159], 159, 25);
        this.fmlBuffer[160] = new FmlField("P2", FmlField.TYPE_STRING, 21, defaultValues[160], 160, 25);
        this.fmlBuffer[161] = new FmlField("P3", FmlField.TYPE_STRING, 21, defaultValues[161], 161, 25);
        this.fmlBuffer[162] = new FmlField("P4", FmlField.TYPE_STRING, 21, defaultValues[162], 162, 25);
        this.fmlBuffer[163] = new FmlField("P5", FmlField.TYPE_STRING, 21, defaultValues[163], 163, 25);
        this.fmlBuffer[164] = new FmlField("P6", FmlField.TYPE_STRING, 21, defaultValues[164], 164, 25);
        this.fmlBuffer[165] = new FmlField("P7", FmlField.TYPE_STRING, 21, defaultValues[165], 165, 25);
        this.fmlBuffer[166] = new FmlField("P8", FmlField.TYPE_STRING, 21, defaultValues[166], 166, 25);
        this.fmlBuffer[167] = new FmlField("P9", FmlField.TYPE_STRING, 21, defaultValues[167], 167, 25);
        this.fmlBuffer[168] = new FmlField("P10", FmlField.TYPE_STRING, 21, defaultValues[168], 168, 25);
        this.fmlBuffer[169] = new FmlField("MEMO_AMT", FmlField.TYPE_DOUBLE, -1, defaultValues[169], 169, 25);
        this.fmlBuffer[170] = new FmlField("RMS_ACT_CODE", FmlField.TYPE_STRING, 5, defaultValues[170], 170, 25);
        this.fmlBuffer[171] = new FmlField("CHARGE_AMT", FmlField.TYPE_DOUBLE, -1, defaultValues[171], 171, 25);
        this.fmlBuffer[172] = new FmlField("CHARGE_AMT_IND", FmlField.TYPE_BYTE, -1, defaultValues[172], 172, 25);
        this.fmlBuffer[173] = new FmlField("WAIVE_REASON", FmlField.TYPE_STRING, 7, defaultValues[173], 173, 25);
        this.fmlBuffer[174] = new FmlField("WAIVE_IND", FmlField.TYPE_BYTE, -1, defaultValues[174], 174, 25);
        this.fmlBuffer[175] = new FmlField("PNEWCTNROWID", FmlField.TYPE_STRING, 19, defaultValues[175], 175, 1);
        this.fmlBuffer[176] = new FmlField("SUBSCRIBER_NO", FmlField.TYPE_STRING, 21, defaultValues[176], 176, 1);
        this.fmlBuffer[177] = new FmlField("CUSTOMER_ID", FmlField.TYPE_INTEGER, -1, defaultValues[177], 177, 1);
        this.fmlBuffer[178] = new FmlField("SYS_CREATION_DATE", FmlField.TYPE_STRING, 15, defaultValues[178], 178, 1);
        this.fmlBuffer[179] = new FmlField("SYS_UPDATE_DATE", FmlField.TYPE_STRING, 15, defaultValues[179], 179, 1);
        this.fmlBuffer[180] = new FmlField("PNEWCTNOPERATOR_ID", FmlField.TYPE_INTEGER, -1, defaultValues[180], 180, 1);
        this.fmlBuffer[181] = new FmlField("PNEWCTNAPPLICATION_ID", FmlField.TYPE_STRING, 7, defaultValues[181], 181, 1);
        this.fmlBuffer[182] = new FmlField("DL_SERVICE_CODE", FmlField.TYPE_STRING, 6, defaultValues[182], 182, 1);
        this.fmlBuffer[183] = new FmlField("DL_UPDATE_STAMP", FmlField.TYPE_SHORT, -1, defaultValues[183], 183, 1);
        this.fmlBuffer[184] = new FmlField("PNEWCTNEFFECTIVE_DATE", FmlField.TYPE_STRING, 15, defaultValues[184], 184, 1);
        this.fmlBuffer[185] = new FmlField("INIT_ACTIVATION_DATE", FmlField.TYPE_STRING, 9, defaultValues[185], 185, 1);
        this.fmlBuffer[186] = new FmlField("SUB_STATUS", FmlField.TYPE_BYTE, -1, defaultValues[186], 186, 1);
        this.fmlBuffer[187] = new FmlField("SUB_STATUS_DATE", FmlField.TYPE_STRING, 9, defaultValues[187], 187, 1);
        this.fmlBuffer[188] = new FmlField("ORIGINAL_INIT_DATE", FmlField.TYPE_STRING, 15, defaultValues[188], 188, 1);
        this.fmlBuffer[189] = new FmlField("SUB_STATUS_LAST_ACT", FmlField.TYPE_STRING, 4, defaultValues[189], 189, 1);
        this.fmlBuffer[190] = new FmlField("SUB_STATUS_RSN_CODE", FmlField.TYPE_STRING, 5, defaultValues[190], 190, 1);
        this.fmlBuffer[191] = new FmlField("PNEWCTNPRODUCT_TYPE", FmlField.TYPE_STRING, 4, defaultValues[191], 191, 1);
        this.fmlBuffer[192] = new FmlField("CUSTOMER_BAN", FmlField.TYPE_INTEGER, -1, defaultValues[192], 192, 1);
        this.fmlBuffer[193] = new FmlField("CTN_SEQ_NO", FmlField.TYPE_INTEGER, -1, defaultValues[193], 193, 1);
        this.fmlBuffer[194] = new FmlField("REQ_ST_GRACE_PERIOD", FmlField.TYPE_STRING, 9, defaultValues[194], 194, 1);
        this.fmlBuffer[195] = new FmlField("REQ_END_GRACE_PERIOD", FmlField.TYPE_STRING, 9, defaultValues[195], 195, 1);
        this.fmlBuffer[196] = new FmlField("COMMIT_START_DATE", FmlField.TYPE_STRING, 9, defaultValues[196], 196, 1);
        this.fmlBuffer[197] = new FmlField("COMMIT_END_DATE", FmlField.TYPE_STRING, 9, defaultValues[197], 197, 1);
        this.fmlBuffer[198] = new FmlField("COMMIT_REASON_CODE", FmlField.TYPE_STRING, 4, defaultValues[198], 198, 1);
        this.fmlBuffer[199] = new FmlField("PNEWCTNCOMMIT_ORIG_NO_MONTH", FmlField.TYPE_SHORT, -1, defaultValues[199], 199, 1);
        this.fmlBuffer[200] = new FmlField("PNEWCTNSUSP_RC_RATE_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[200], 200, 1);
        this.fmlBuffer[201] = new FmlField("CONTRACT_NO", FmlField.TYPE_STRING, 11, defaultValues[201], 201, 1);
        this.fmlBuffer[202] = new FmlField("CNT_SEQ_NO", FmlField.TYPE_INTEGER, -1, defaultValues[202], 202, 1);
        this.fmlBuffer[203] = new FmlField("PNEWCTNDEALER_CODE", FmlField.TYPE_STRING, 6, defaultValues[203], 203, 1);
        this.fmlBuffer[204] = new FmlField("ORG_DEALER_CODE", FmlField.TYPE_STRING, 6, defaultValues[204], 204, 1);
        this.fmlBuffer[205] = new FmlField("PNEWCTNSALES_AGENT", FmlField.TYPE_STRING, 6, defaultValues[205], 205, 1);
        this.fmlBuffer[206] = new FmlField("ORG_SALES_AGENT", FmlField.TYPE_STRING, 6, defaultValues[206], 206, 1);
        this.fmlBuffer[207] = new FmlField("REQ_DEPOSIT_AMT", FmlField.TYPE_DOUBLE, -1, defaultValues[207], 207, 1);
        this.fmlBuffer[208] = new FmlField("LEADING_NUMBER", FmlField.TYPE_STRING, 21, defaultValues[208], 208, 1);
        this.fmlBuffer[209] = new FmlField("PABX_IND", FmlField.TYPE_BYTE, -1, defaultValues[209], 209, 1);
        this.fmlBuffer[210] = new FmlField("NEXT_CTN", FmlField.TYPE_STRING, 21, defaultValues[210], 210, 1);
        this.fmlBuffer[211] = new FmlField("NEXT_CTN_CHG_DATE", FmlField.TYPE_STRING, 9, defaultValues[211], 211, 1);
        this.fmlBuffer[212] = new FmlField("PRV_CTN", FmlField.TYPE_STRING, 21, defaultValues[212], 212, 1);
        this.fmlBuffer[213] = new FmlField("PRV_CTN_CHG_DATE", FmlField.TYPE_STRING, 9, defaultValues[213], 213, 1);
        this.fmlBuffer[214] = new FmlField("NEXT_BAN", FmlField.TYPE_INTEGER, -1, defaultValues[214], 214, 1);
        this.fmlBuffer[215] = new FmlField("NEXT_BAN_MOVE_DATE", FmlField.TYPE_STRING, 9, defaultValues[215], 215, 1);
        this.fmlBuffer[216] = new FmlField("PRV_BAN", FmlField.TYPE_INTEGER, -1, defaultValues[216], 216, 1);
        this.fmlBuffer[217] = new FmlField("PRV_BAN_MOVE_DATE", FmlField.TYPE_STRING, 9, defaultValues[217], 217, 1);
        this.fmlBuffer[218] = new FmlField("SUB_STS_ISSUE_DATE", FmlField.TYPE_STRING, 9, defaultValues[218], 218, 1);
        this.fmlBuffer[219] = new FmlField("ACTIVATE_WAIVE_RSN", FmlField.TYPE_STRING, 7, defaultValues[219], 219, 1);
        this.fmlBuffer[220] = new FmlField("EARLIEST_ACTV_DATE", FmlField.TYPE_STRING, 9, defaultValues[220], 220, 1);
        this.fmlBuffer[221] = new FmlField("SUB_ACTV_LOCATION", FmlField.TYPE_STRING, 5, defaultValues[221], 221, 1);
        this.fmlBuffer[222] = new FmlField("CUST_WATCH_LMT", FmlField.TYPE_DOUBLE, -1, defaultValues[222], 222, 1);
        this.fmlBuffer[223] = new FmlField("CUST_WATCH_DATE", FmlField.TYPE_STRING, 9, defaultValues[223], 223, 1);
        this.fmlBuffer[224] = new FmlField("BASIC_WATCH_LMT", FmlField.TYPE_DOUBLE, -1, defaultValues[224], 224, 1);
        this.fmlBuffer[225] = new FmlField("CREDIT_WATCH_PIN_CD", FmlField.TYPE_SHORT, -1, defaultValues[225], 225, 1);
        this.fmlBuffer[226] = new FmlField("SUB_MARKET_CODE", FmlField.TYPE_STRING, 4, defaultValues[226], 226, 1);
        this.fmlBuffer[227] = new FmlField("LIMIT_RESERVED_DAYS", FmlField.TYPE_SHORT, -1, defaultValues[227], 227, 1);
        this.fmlBuffer[228] = new FmlField("FF_EXPIRATION_DATE", FmlField.TYPE_STRING, 15, defaultValues[228], 228, 1);
        this.fmlBuffer[229] = new FmlField("FLEX_IND", FmlField.TYPE_BYTE, -1, defaultValues[229], 229, 1);
        this.fmlBuffer[230] = new FmlField("DUO_IND", FmlField.TYPE_BYTE, -1, defaultValues[230], 230, 1);
        this.fmlBuffer[231] = new FmlField("LISTED_IND", FmlField.TYPE_BYTE, -1, defaultValues[231], 231, 1);
        this.fmlBuffer[232] = new FmlField("SUB_DEPARTMENT_CD", FmlField.TYPE_STRING, 5, defaultValues[232], 232, 1);
        this.fmlBuffer[233] = new FmlField("LAST_SUBS_DISC_DT", FmlField.TYPE_STRING, 9, defaultValues[233], 233, 1);
        this.fmlBuffer[234] = new FmlField("LAST_SUBS_DISC_DT_UD", FmlField.TYPE_STRING, 9, defaultValues[234], 234, 1);
        this.fmlBuffer[235] = new FmlField("LAST_SUBSCR_DISC_SN", FmlField.TYPE_SHORT, -1, defaultValues[235], 235, 1);
        this.fmlBuffer[236] = new FmlField("LAST_SUBSCR_DISC_SN_UD", FmlField.TYPE_SHORT, -1, defaultValues[236], 236, 1);
        this.fmlBuffer[237] = new FmlField("PNI", FmlField.TYPE_STRING, 11, defaultValues[237], 237, 1);
        this.fmlBuffer[238] = new FmlField("RMS_REF_STORE_ID", FmlField.TYPE_STRING, 5, defaultValues[238], 238, 1);
        this.fmlBuffer[239] = new FmlField("RMS_REF_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[239], 239, 1);
        this.fmlBuffer[240] = new FmlField("RMS_REF_OD", FmlField.TYPE_INTEGER, -1, defaultValues[240], 240, 1);
        this.fmlBuffer[241] = new FmlField("DLR_ACT_FEE", FmlField.TYPE_DOUBLE, -1, defaultValues[241], 241, 1);
        this.fmlBuffer[242] = new FmlField("PREP_AMOUNT", FmlField.TYPE_DOUBLE, -1, defaultValues[242], 242, 1);
        this.fmlBuffer[243] = new FmlField("SUBSCRIBER_ID", FmlField.TYPE_INTEGER, -1, defaultValues[243], 243, 1);
        this.fmlBuffer[244] = new FmlField("SUB_LANG", FmlField.TYPE_STRING, 3, defaultValues[244], 244, 1);
        this.fmlBuffer[245] = new FmlField("SMS_RCV_STYLE_CODE", FmlField.TYPE_STRING, 3, defaultValues[245], 245, 1);
        this.fmlBuffer[246] = new FmlField("CONV_RUN_NO", FmlField.TYPE_SHORT, -1, defaultValues[246], 246, 1);
        this.fmlBuffer[247] = new FmlField("ALLOW_ADVERTISING_IND", FmlField.TYPE_BYTE, -1, defaultValues[247], 247, 1);
        this.fmlBuffer[248] = new FmlField("IVR_WRONG_ACCESS_NO", FmlField.TYPE_SHORT, -1, defaultValues[248], 248, 1);
        this.fmlBuffer[249] = new FmlField("THRESHOLD_AMT", FmlField.TYPE_DOUBLE, -1, defaultValues[249], 249, 1);
        this.fmlBuffer[250] = new FmlField("PUBLISH_LEVEL", FmlField.TYPE_STRING, 31, defaultValues[250], 250, 1);
        this.fmlBuffer[251] = new FmlField("AUTO_RELEASE_IND", FmlField.TYPE_BYTE, -1, defaultValues[251], 251, 1);
        this.fmlBuffer[252] = new FmlField("CUST_WATCH_EFF_DATE", FmlField.TYPE_STRING, 9, defaultValues[252], 252, 1);
        this.fmlBuffer[253] = new FmlField("CUST_WATCH_EXP_DATE", FmlField.TYPE_STRING, 9, defaultValues[253], 253, 1);
        this.fmlBuffer[254] = new FmlField("OPERATOR_CW_LMT", FmlField.TYPE_DOUBLE, -1, defaultValues[254], 254, 1);
        this.fmlBuffer[255] = new FmlField("SEND_SMS_FOR_MATCH", FmlField.TYPE_BYTE, -1, defaultValues[255], 255, 1);
        this.fmlBuffer[256] = new FmlField("CPS_STATUS", FmlField.TYPE_BYTE, -1, defaultValues[256], 256, 1);
        this.fmlBuffer[257] = new FmlField("CPS_TRANSACTION", FmlField.TYPE_SHORT, -1, defaultValues[257], 257, 1);
        this.fmlBuffer[258] = new FmlField("CPS_TYPE", FmlField.TYPE_SHORT, -1, defaultValues[258], 258, 1);
        this.fmlBuffer[259] = new FmlField("ISP_PASS", FmlField.TYPE_STRING, 31, defaultValues[259], 259, 1);
        this.fmlBuffer[260] = new FmlField("ISP_TYPE", FmlField.TYPE_STRING, 3, defaultValues[260], 260, 1);
        this.fmlBuffer[261] = new FmlField("OPERATOR_TMP_DATE", FmlField.TYPE_STRING, 9, defaultValues[261], 261, 1);
        this.fmlBuffer[262] = new FmlField("OPERATOR_TMP_LMT", FmlField.TYPE_DOUBLE, -1, defaultValues[262], 262, 1);
        this.fmlBuffer[263] = new FmlField("SUB_ORG_CD", FmlField.TYPE_STRING, 11, defaultValues[263], 263, 1);
        this.fmlBuffer[264] = new FmlField("ORG_MEMBER_NO", FmlField.TYPE_STRING, 21, defaultValues[264], 264, 1);
        this.fmlBuffer[265] = new FmlField("FULLTABLE", FmlField.TYPE_BYTE, -1, defaultValues[265], 265, 1);
        this.fmlBuffer[266] = new FmlField("PAPER_WORK_STATUS", FmlField.TYPE_STRING, 3, defaultValues[266], 266, 1);
        this.fmlBuffer[267] = new FmlField("PAPER_WORK_REQUIRED", FmlField.TYPE_BYTE, -1, defaultValues[267], 267, 1);
        this.fmlBuffer[268] = new FmlField("PAPER_WORK_DATE", FmlField.TYPE_STRING, 9, defaultValues[268], 268, 1);
        this.fmlBuffer[269] = new FmlField("PAPER_WORK_REF_NO", FmlField.TYPE_STRING, 12, defaultValues[269], 269, 1);
        this.fmlBuffer[270] = new FmlField("PAPER_WORK_TRNS_NO", FmlField.TYPE_STRING, 26, defaultValues[270], 270, 1);
        this.fmlBuffer[271] = new FmlField("DELIVERY_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[271], 271, 1);
        this.fmlBuffer[272] = new FmlField("PNAMEADRBUFROWCOUNT", FmlField.TYPE_INTEGER, -1, defaultValues[272], 272, 1);
        this.fmlBuffer[273] = new FmlField("LINK_MODE", FmlField.TYPE_BYTE, -1, defaultValues[273], 273, 20);
        this.fmlBuffer[274] = new FmlField("LINK_BAN", FmlField.TYPE_INTEGER, -1, defaultValues[274], 274, 20);
        this.fmlBuffer[275] = new FmlField("LINK_SUBSCRIBER", FmlField.TYPE_STRING, 21, defaultValues[275], 275, 20);
        this.fmlBuffer[276] = new FmlField("LINK_ROW_ID", FmlField.TYPE_STRING, 19, defaultValues[276], 276, 20);
        this.fmlBuffer[277] = new FmlField("LINK_SEQ_NO", FmlField.TYPE_INTEGER, -1, defaultValues[277], 277, 20);
        this.fmlBuffer[278] = new FmlField("LNKRECCUSTOMER_ID", FmlField.TYPE_INTEGER, -1, defaultValues[278], 278, 20);
        this.fmlBuffer[279] = new FmlField("BAN", FmlField.TYPE_INTEGER, -1, defaultValues[279], 279, 20);
        this.fmlBuffer[280] = new FmlField("LNKRECSUBSCRIBER_NO", FmlField.TYPE_STRING, 21, defaultValues[280], 280, 20);
        this.fmlBuffer[281] = new FmlField("LINK_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[281], 281, 20);
        this.fmlBuffer[282] = new FmlField("LNKRECEFFECTIVE_DATE", FmlField.TYPE_STRING, 9, defaultValues[282], 282, 20);
        this.fmlBuffer[283] = new FmlField("FOREIGN_SEQ_NO", FmlField.TYPE_INTEGER, -1, defaultValues[283], 283, 20);
        this.fmlBuffer[284] = new FmlField("BILLING_IND", FmlField.TYPE_BYTE, -1, defaultValues[284], 284, 20);
        this.fmlBuffer[285] = new FmlField("MAILING_IND", FmlField.TYPE_BYTE, -1, defaultValues[285], 285, 20);
        this.fmlBuffer[286] = new FmlField("USER_IND", FmlField.TYPE_BYTE, -1, defaultValues[286], 286, 20);
        this.fmlBuffer[287] = new FmlField("LINK_BILLING_IND", FmlField.TYPE_BYTE, -1, defaultValues[287], 287, 20);
        this.fmlBuffer[288] = new FmlField("LINK_MAILING_IND", FmlField.TYPE_BYTE, -1, defaultValues[288], 288, 20);
        this.fmlBuffer[289] = new FmlField("LINK_USER_IND", FmlField.TYPE_BYTE, -1, defaultValues[289], 289, 20);
        this.fmlBuffer[290] = new FmlField("NM_MODE", FmlField.TYPE_BYTE, -1, defaultValues[290], 290, 20);
        this.fmlBuffer[291] = new FmlField("NM_UP_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[291], 291, 20);
        this.fmlBuffer[292] = new FmlField("NM_EXPIRE_DATE", FmlField.TYPE_STRING, 9, defaultValues[292], 292, 20);
        this.fmlBuffer[293] = new FmlField("NAMERECROWID", FmlField.TYPE_STRING, 19, defaultValues[293], 293, 20);
        this.fmlBuffer[294] = new FmlField("NAME_ID", FmlField.TYPE_INTEGER, -1, defaultValues[294], 294, 20);
        this.fmlBuffer[295] = new FmlField("NAMERECSYS_CREATION_DATE", FmlField.TYPE_STRING, 15, defaultValues[295], 295, 20);
        this.fmlBuffer[296] = new FmlField("NAMERECSYS_UPDATE_DATE", FmlField.TYPE_STRING, 15, defaultValues[296], 296, 20);
        this.fmlBuffer[297] = new FmlField("NAMERECOPERATOR_ID", FmlField.TYPE_INTEGER, -1, defaultValues[297], 297, 20);
        this.fmlBuffer[298] = new FmlField("NAMERECAPPLICATION_ID", FmlField.TYPE_STRING, 7, defaultValues[298], 298, 20);
        this.fmlBuffer[299] = new FmlField("NAMERECDL_SERVICE_CODE", FmlField.TYPE_STRING, 6, defaultValues[299], 299, 20);
        this.fmlBuffer[300] = new FmlField("NAMERECDL_UPDATE_STAMP", FmlField.TYPE_SHORT, -1, defaultValues[300], 300, 20);
        this.fmlBuffer[301] = new FmlField("CONTROL_NAME", FmlField.TYPE_STRING, 41, defaultValues[301], 301, 20);
        this.fmlBuffer[302] = new FmlField("LAST_BUSINESS_NAME", FmlField.TYPE_STRING, 61, defaultValues[302], 302, 20);
        this.fmlBuffer[303] = new FmlField("FIRST_NAME", FmlField.TYPE_STRING, 33, defaultValues[303], 303, 20);
        this.fmlBuffer[304] = new FmlField("ADDITIONAL_TITLE", FmlField.TYPE_STRING, 61, defaultValues[304], 304, 20);
        this.fmlBuffer[305] = new FmlField("NAME_FORMAT", FmlField.TYPE_BYTE, -1, defaultValues[305], 305, 20);
        this.fmlBuffer[306] = new FmlField("BIRTH_DATE", FmlField.TYPE_STRING, 9, defaultValues[306], 306, 20);
        this.fmlBuffer[307] = new FmlField("IDENTIFY", FmlField.TYPE_STRING, 21, defaultValues[307], 307, 20);
        this.fmlBuffer[308] = new FmlField("ID_TYPE", FmlField.TYPE_STRING, 5, defaultValues[308], 308, 20);
        this.fmlBuffer[309] = new FmlField("COMP_REG_ID", FmlField.TYPE_STRING, 21, defaultValues[309], 309, 20);
        this.fmlBuffer[310] = new FmlField("KOB", FmlField.TYPE_DOUBLE, -1, defaultValues[310], 310, 20);
        this.fmlBuffer[311] = new FmlField("MIDDLE_INITIAL", FmlField.TYPE_STRING, 33, defaultValues[311], 311, 20);
        this.fmlBuffer[312] = new FmlField("TELEMARKET_ID", FmlField.TYPE_STRING, 11, defaultValues[312], 312, 20);
        this.fmlBuffer[313] = new FmlField("NAMERECCONV_RUN_NO", FmlField.TYPE_SHORT, -1, defaultValues[313], 313, 20);
        this.fmlBuffer[314] = new FmlField("NAME_TITLE_SALUTATION", FmlField.TYPE_STRING, 21, defaultValues[314], 314, 20);
        this.fmlBuffer[315] = new FmlField("NATIONALITY_CD", FmlField.TYPE_STRING, 4, defaultValues[315], 315, 20);
        this.fmlBuffer[316] = new FmlField("GENDER", FmlField.TYPE_BYTE, -1, defaultValues[316], 316, 20);
        this.fmlBuffer[317] = new FmlField("MARITAL_STATUS", FmlField.TYPE_STRING, 5, defaultValues[317], 317, 20);
        this.fmlBuffer[318] = new FmlField("ROLE_IND", FmlField.TYPE_BYTE, -1, defaultValues[318], 318, 20);
        this.fmlBuffer[319] = new FmlField("ADR_MODE", FmlField.TYPE_BYTE, -1, defaultValues[319], 319, 20);
        this.fmlBuffer[320] = new FmlField("ADR_UP_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[320], 320, 20);
        this.fmlBuffer[321] = new FmlField("ADR_EXPIRE_DATE", FmlField.TYPE_STRING, 9, defaultValues[321], 321, 20);
        this.fmlBuffer[322] = new FmlField("ADDRESSRECROWID", FmlField.TYPE_STRING, 19, defaultValues[322], 322, 20);
        this.fmlBuffer[323] = new FmlField("ADDRESS_ID", FmlField.TYPE_INTEGER, -1, defaultValues[323], 323, 20);
        this.fmlBuffer[324] = new FmlField("ADDRESSRECSYS_CREATION_DATE", FmlField.TYPE_STRING, 15, defaultValues[324], 324, 20);
        this.fmlBuffer[325] = new FmlField("ADDRESSRECSYS_UPDATE_DATE", FmlField.TYPE_STRING, 15, defaultValues[325], 325, 20);
        this.fmlBuffer[326] = new FmlField("ADDRESSRECOPERATOR_ID", FmlField.TYPE_INTEGER, -1, defaultValues[326], 326, 20);
        this.fmlBuffer[327] = new FmlField("ADDRESSRECAPPLICATION_ID", FmlField.TYPE_STRING, 7, defaultValues[327], 327, 20);
        this.fmlBuffer[328] = new FmlField("ADDRESSRECDL_SERVICE_CODE", FmlField.TYPE_STRING, 6, defaultValues[328], 328, 20);
        this.fmlBuffer[329] = new FmlField("ADDRESSRECDL_UPDATE_STAMP", FmlField.TYPE_SHORT, -1, defaultValues[329], 329, 20);
        this.fmlBuffer[330] = new FmlField("ADR_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[330], 330, 20);
        this.fmlBuffer[331] = new FmlField("ADR_STATUS", FmlField.TYPE_BYTE, -1, defaultValues[331], 331, 20);
        this.fmlBuffer[332] = new FmlField("ADR_STATUS_DATE", FmlField.TYPE_STRING, 9, defaultValues[332], 332, 20);
        this.fmlBuffer[333] = new FmlField("ADR_SECONDARY_LN", FmlField.TYPE_STRING, 101, defaultValues[333], 333, 20);
        this.fmlBuffer[334] = new FmlField("ADR_PRIMARY_LN", FmlField.TYPE_STRING, 101, defaultValues[334], 334, 20);
        this.fmlBuffer[335] = new FmlField("ADR_CITY", FmlField.TYPE_STRING, 40, defaultValues[335], 335, 20);
        this.fmlBuffer[336] = new FmlField("ADR_ZIP", FmlField.TYPE_STRING, 10, defaultValues[336], 336, 20);
        this.fmlBuffer[337] = new FmlField("ADR_HOUSE_NO", FmlField.TYPE_STRING, 21, defaultValues[337], 337, 20);
        this.fmlBuffer[338] = new FmlField("ADR_STREET_NAME", FmlField.TYPE_STRING, 61, defaultValues[338], 338, 20);
        this.fmlBuffer[339] = new FmlField("ADR_DIRECTION", FmlField.TYPE_STRING, 3, defaultValues[339], 339, 20);
        this.fmlBuffer[340] = new FmlField("ADR_POB", FmlField.TYPE_STRING, 11, defaultValues[340], 340, 20);
        this.fmlBuffer[341] = new FmlField("ADR_COUNTRY", FmlField.TYPE_STRING, 4, defaultValues[341], 341, 20);
        this.fmlBuffer[342] = new FmlField("ADR_HOUSE_LETTER", FmlField.TYPE_STRING, 3, defaultValues[342], 342, 20);
        this.fmlBuffer[343] = new FmlField("ADR_STORY", FmlField.TYPE_STRING, 3, defaultValues[343], 343, 20);
        this.fmlBuffer[344] = new FmlField("ADR_DOOR_NO", FmlField.TYPE_STRING, 5, defaultValues[344], 344, 20);
        this.fmlBuffer[345] = new FmlField("ADR_EMAIL", FmlField.TYPE_STRING, 151, defaultValues[345], 345, 20);
        this.fmlBuffer[346] = new FmlField("SINCE_DATE", FmlField.TYPE_STRING, 9, defaultValues[346], 346, 20);
        this.fmlBuffer[347] = new FmlField("ADR_DISTRICT", FmlField.TYPE_STRING, 41, defaultValues[347], 347, 20);
        this.fmlBuffer[348] = new FmlField("CO_IND", FmlField.TYPE_BYTE, -1, defaultValues[348], 348, 20);
        this.fmlBuffer[349] = new FmlField("ADDRESSRECCONV_RUN_NO", FmlField.TYPE_SHORT, -1, defaultValues[349], 349, 20);
        this.fmlBuffer[350] = new FmlField("ACCOMMODATION_TYPE", FmlField.TYPE_STRING, 5, defaultValues[350], 350, 20);
        this.fmlBuffer[351] = new FmlField("COUNTY_CODE", FmlField.TYPE_STRING, 3, defaultValues[351], 351, 20);
        this.fmlBuffer[352] = new FmlField("COMMUNITY_NAME", FmlField.TYPE_STRING, 31, defaultValues[352], 352, 20);
        this.fmlBuffer[353] = new FmlField("ADR_CO_NAME", FmlField.TYPE_STRING, 61, defaultValues[353], 353, 20);
        this.fmlBuffer[354] = new FmlField("ADR_HOUSE_NAME", FmlField.TYPE_STRING, 61, defaultValues[354], 354, 20);
        this.fmlBuffer[355] = new FmlField("ADR_P1", FmlField.TYPE_STRING, 61, defaultValues[355], 355, 20);
        this.fmlBuffer[356] = new FmlField("ADR_P2", FmlField.TYPE_STRING, 61, defaultValues[356], 356, 20);
        this.fmlBuffer[357] = new FmlField("ADR_P3", FmlField.TYPE_STRING, 61, defaultValues[357], 357, 20);
        this.fmlBuffer[358] = new FmlField("ADR_P4", FmlField.TYPE_STRING, 61, defaultValues[358], 358, 20);
        this.fmlBuffer[359] = new FmlField("ADR_P5", FmlField.TYPE_STRING, 61, defaultValues[359], 359, 20);
        this.fmlBuffer[360] = new FmlField("ADR_P6", FmlField.TYPE_STRING, 61, defaultValues[360], 360, 20);
        this.fmlBuffer[361] = new FmlField("ADR_P7", FmlField.TYPE_STRING, 61, defaultValues[361], 361, 20);
        this.fmlBuffer[362] = new FmlField("ADR_P8", FmlField.TYPE_STRING, 61, defaultValues[362], 362, 20);
        this.fmlBuffer[363] = new FmlField("ADR_P9", FmlField.TYPE_STRING, 61, defaultValues[363], 363, 20);
        this.fmlBuffer[364] = new FmlField("ADR_P10", FmlField.TYPE_STRING, 61, defaultValues[364], 364, 20);
        this.fmlBuffer[365] = new FmlField("PCHGCTNRECBAN", FmlField.TYPE_INTEGER, -1, defaultValues[365], 365, 1);
        this.fmlBuffer[366] = new FmlField("OLD_CTN", FmlField.TYPE_STRING, 21, defaultValues[366], 366, 1);
        this.fmlBuffer[367] = new FmlField("PCHGCTNRECCUSTOMER_ID", FmlField.TYPE_INTEGER, -1, defaultValues[367], 367, 1);
        this.fmlBuffer[368] = new FmlField("PCHGCTNRECACTIVITY_DATE", FmlField.TYPE_STRING, 9, defaultValues[368], 368, 1);
        this.fmlBuffer[369] = new FmlField("OTHER_NL", FmlField.TYPE_STRING, 4, defaultValues[369], 369, 1);
        this.fmlBuffer[370] = new FmlField("INT_ORDER_ID_OF_TEMP_MSISDN", FmlField.TYPE_DOUBLE, -1, defaultValues[370], 370, 1);
        this.fmlBuffer[371] = new FmlField("ACTIVITY_CTN_FEE", FmlField.TYPE_DOUBLE, -1, defaultValues[371], 371, 1);
        this.fmlBuffer[372] = new FmlField("NUMBER_LOCATION", FmlField.TYPE_STRING, 4, defaultValues[372], 372, 1);
        this.fmlBuffer[373] = new FmlField("DEPOSITTERMSIND", FmlField.TYPE_BYTE, -1, defaultValues[373], 373, 1);
        this.fmlBuffer[374] = new FmlField("WAIVING_IND", FmlField.TYPE_BYTE, -1, defaultValues[374], 374, 1);
        this.fmlBuffer[375] = new FmlField("WAIVING_REASON_CODE", FmlField.TYPE_STRING, 5, defaultValues[375], 375, 1);
        this.fmlBuffer[376] = new FmlField("PINSTLBUFROW_COUNT", FmlField.TYPE_INTEGER, -1, defaultValues[376], 376, 1);
        this.fmlBuffer[377] = new FmlField("INSTALLMENT_AMT", FmlField.TYPE_DOUBLE, -1, defaultValues[377], 377, 12);
        this.fmlBuffer[378] = new FmlField("INSTALLMENT_DATE", FmlField.TYPE_STRING, 9, defaultValues[378], 378, 12);
        this.fmlBuffer[379] = new FmlField("PFTRDEPBUFROWCOUNT", FmlField.TYPE_INTEGER, -1, defaultValues[379], 379, 1);
        this.fmlBuffer[380] = new FmlField("DEPOSIT_TYPE", FmlField.TYPE_BYTE, -1, defaultValues[380], 380, 2);
        this.fmlBuffer[381] = new FmlField("DEPOSIT_AMOUNT", FmlField.TYPE_DOUBLE, -1, defaultValues[381], 381, 2);
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
     * Retrieves the value of the 'ROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'ROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[16].getValue(0));
    }

    /**
     * Sets the value of the 'ROWCOUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_ROWCOUNT(Integer value) throws FMLManipulationException {
        this.fmlBuffer[16].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'ROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[17].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_ROWID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[17].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'ROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[17].getCount());
    }

    /**
     * Retrieves the value of the 'SOC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SOC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[18].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SOC' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 10.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SOC(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[18].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SOC' field in the FML buffer.
     *
     * @return Number of values defined for 'SOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SOC_size() throws FMLManipulationException {
        return (this.fmlBuffer[18].getCount());
    }

    /**
     * Retrieves the value of the 'SOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SOC_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SOC_EFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[19].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SOC_EFFECTIVE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[19].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'SOC_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SOC_EFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[19].getCount());
    }

    /**
     * Retrieves the value of the 'COMMITMENT_END_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'COMMITMENT_END_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COMMITMENT_END_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[20].getValue(nIndex));
    }

    /**
     * Sets the value of the 'COMMITMENT_END_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_COMMITMENT_END_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[20].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'COMMITMENT_END_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'COMMITMENT_END_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COMMITMENT_END_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[20].getCount());
    }

    /**
     * Retrieves the value of the 'SERVICE_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SERVICE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SERVICE_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[21].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'SERVICE_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SERVICE_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[21].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'SERVICE_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'SERVICE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SERVICE_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[21].getCount());
    }

    /**
     * Retrieves the value of the 'EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[22].getValue(nIndex));
    }

    /**
     * Sets the value of the 'EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_EFFECTIVE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[22].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'EFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_EFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[22].getCount());
    }

    /**
     * Retrieves the value of the 'EXPIRATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EXPIRATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[23].getValue(nIndex));
    }

    /**
     * Sets the value of the 'EXPIRATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_EXPIRATION_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[23].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'EXPIRATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_EXPIRATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[23].getCount());
    }

    /**
     * Retrieves the value of the 'SOC_LEVEL_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SOC_LEVEL_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SOC_LEVEL_CODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[24].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'SOC_LEVEL_CODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SOC_LEVEL_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[24].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'SOC_LEVEL_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'SOC_LEVEL_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SOC_LEVEL_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[24].getCount());
    }

    /**
     * Retrieves the value of the 'DEALER_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'DEALER_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DEALER_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[25].getValue(nIndex));
    }

    /**
     * Sets the value of the 'DEALER_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_DEALER_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[25].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'DEALER_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'DEALER_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DEALER_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[25].getCount());
    }

    /**
     * Retrieves the value of the 'SALES_AGENT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SALES_AGENT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SALES_AGENT(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[26].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SALES_AGENT' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SALES_AGENT(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[26].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SALES_AGENT' field in the FML buffer.
     *
     * @return Number of values defined for 'SALES_AGENT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SALES_AGENT_size() throws FMLManipulationException {
        return (this.fmlBuffer[26].getCount());
    }

    /**
     * Retrieves the value of the 'SRV_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SRV_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SRV_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[27].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'SRV_MODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SRV_MODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[27].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'SRV_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'SRV_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SRV_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[27].getCount());
    }

    /**
     * Retrieves the value of the 'SRV_SUB_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SRV_SUB_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SRV_SUB_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[28].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'SRV_SUB_MODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SRV_SUB_MODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[28].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'SRV_SUB_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'SRV_SUB_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SRV_SUB_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[28].getCount());
    }

    /**
     * Retrieves the value of the 'SOC_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SOC_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_SOC_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[29].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SOC_SEQ_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SOC_SEQ_NO(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[29].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SOC_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'SOC_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SOC_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[29].getCount());
    }

    /**
     * Retrieves the value of the 'SRV_TRX_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SRV_TRX_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_SRV_TRX_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[30].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SRV_TRX_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SRV_TRX_ID(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[30].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SRV_TRX_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'SRV_TRX_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SRV_TRX_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[30].getCount());
    }

    /**
     * Retrieves the value of the 'CAMPAIGN_SEQ' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'CAMPAIGN_SEQ' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CAMPAIGN_SEQ(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[31].getValue(nIndex));
    }

    /**
     * Sets the value of the 'CAMPAIGN_SEQ' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_CAMPAIGN_SEQ(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[31].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'CAMPAIGN_SEQ' field in the FML buffer.
     *
     * @return Number of values defined for 'CAMPAIGN_SEQ' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CAMPAIGN_SEQ_size() throws FMLManipulationException {
        return (this.fmlBuffer[31].getCount());
    }

    /**
     * Retrieves the value of the 'CAMPAIGN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'CAMPAIGN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CAMPAIGN(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[32].getValue(nIndex));
    }

    /**
     * Sets the value of the 'CAMPAIGN' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 10.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_CAMPAIGN(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[32].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'CAMPAIGN' field in the FML buffer.
     *
     * @return Number of values defined for 'CAMPAIGN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CAMPAIGN_size() throws FMLManipulationException {
        return (this.fmlBuffer[32].getCount());
    }

    /**
     * Retrieves the value of the 'COMMIT_ORIG_NO_MONTH' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'COMMIT_ORIG_NO_MONTH' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_COMMIT_ORIG_NO_MONTH(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[33].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'COMMIT_ORIG_NO_MONTH' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_COMMIT_ORIG_NO_MONTH(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[33].setValue(nIndex, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves number of values defined for 'COMMIT_ORIG_NO_MONTH' field in the FML buffer.
     *
     * @return Number of values defined for 'COMMIT_ORIG_NO_MONTH' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COMMIT_ORIG_NO_MONTH_size() throws FMLManipulationException {
        return (this.fmlBuffer[33].getCount());
    }

    /**
     * Retrieves the value of the 'PRODUCT_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PRODUCT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PRODUCT_TYPE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[34].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PRODUCT_TYPE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_PRODUCT_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[34].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PRODUCT_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'PRODUCT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PRODUCT_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[34].getCount());
    }

    /**
     * Retrieves the value of the 'LOAN_VER_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'LOAN_VER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LOAN_VER_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[35].getValue(nIndex));
    }

    /**
     * Sets the value of the 'LOAN_VER_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_LOAN_VER_NO(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[35].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'LOAN_VER_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'LOAN_VER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LOAN_VER_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[35].getCount());
    }

    /**
     * Retrieves the value of the 'LOAN_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'LOAN_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LOAN_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[36].getValue(nIndex));
    }

    /**
     * Sets the value of the 'LOAN_SEQ_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_LOAN_SEQ_NO(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[36].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'LOAN_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'LOAN_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LOAN_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[36].getCount());
    }

    /**
     * Retrieves the value of the 'SOC_ACTV_FEE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SOC_ACTV_FEE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_SOC_ACTV_FEE(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[37].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SOC_ACTV_FEE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SOC_ACTV_FEE(int nIndex, Double value) throws FMLManipulationException {
        this.fmlBuffer[37].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SOC_ACTV_FEE' field in the FML buffer.
     *
     * @return Number of values defined for 'SOC_ACTV_FEE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SOC_ACTV_FEE_size() throws FMLManipulationException {
        return (this.fmlBuffer[37].getCount());
    }

    /**
     * Retrieves the value of the 'PROMOTIONAL_SOC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PROMOTIONAL_SOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PROMOTIONAL_SOC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[38].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PROMOTIONAL_SOC' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 10.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_PROMOTIONAL_SOC(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[38].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PROMOTIONAL_SOC' field in the FML buffer.
     *
     * @return Number of values defined for 'PROMOTIONAL_SOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PROMOTIONAL_SOC_size() throws FMLManipulationException {
        return (this.fmlBuffer[38].getCount());
    }

    /**
     * Retrieves the value of the 'REASON_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'REASON_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_REASON_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[39].getValue(nIndex));
    }

    /**
     * Sets the value of the 'REASON_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_REASON_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[39].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'REASON_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'REASON_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_REASON_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[39].getCount());
    }

    /**
     * Retrieves the value of the 'SOC_START_RC_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SOC_START_RC_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SOC_START_RC_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[40].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SOC_START_RC_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SOC_START_RC_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[40].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SOC_START_RC_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'SOC_START_RC_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SOC_START_RC_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[40].getCount());
    }

    /**
     * Retrieves the value of the 'RC_DATE_COPY_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'RC_DATE_COPY_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_RC_DATE_COPY_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[41].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'RC_DATE_COPY_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_RC_DATE_COPY_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[41].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'RC_DATE_COPY_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'RC_DATE_COPY_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_RC_DATE_COPY_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[41].getCount());
    }

    /**
     * Retrieves the value of the 'PAGRRECROWID' field in the FML buffer.
     *
     * @return Value of 'PAGRRECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAGRRECROWID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[42].getValue(0));
    }

    /**
     * Sets the value of the 'PAGRRECROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @throws FMLManipulationException
     */
    public void set_PAGRRECROWID(String value) throws FMLManipulationException {
        this.fmlBuffer[42].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PAGRRECSOC' field in the FML buffer.
     *
     * @return Value of 'PAGRRECSOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAGRRECSOC() throws FMLManipulationException {
        return ((String) this.fmlBuffer[43].getValue(0));
    }

    /**
     * Sets the value of the 'PAGRRECSOC' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 10.
     * @throws FMLManipulationException
     */
    public void set_PAGRRECSOC(String value) throws FMLManipulationException {
        this.fmlBuffer[43].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PAGRRECSOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Value of 'PAGRRECSOC_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAGRRECSOC_EFFECTIVE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[44].getValue(0));
    }

    /**
     * Sets the value of the 'PAGRRECSOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_PAGRRECSOC_EFFECTIVE_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[44].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PAGRRECCOMMITMENT_END_DATE' field in the FML buffer.
     *
     * @return Value of 'PAGRRECCOMMITMENT_END_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAGRRECCOMMITMENT_END_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[45].getValue(0));
    }

    /**
     * Sets the value of the 'PAGRRECCOMMITMENT_END_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_PAGRRECCOMMITMENT_END_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[45].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PAGRRECSERVICE_TYPE' field in the FML buffer.
     *
     * @return Value of 'PAGRRECSERVICE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAGRRECSERVICE_TYPE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[46].getValue(0)));
    }

    /**
     * Sets the value of the 'PAGRRECSERVICE_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PAGRRECSERVICE_TYPE(String value) throws FMLManipulationException {
        this.fmlBuffer[46].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'PAGRRECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Value of 'PAGRRECEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAGRRECEFFECTIVE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[47].getValue(0));
    }

    /**
     * Sets the value of the 'PAGRRECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_PAGRRECEFFECTIVE_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[47].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PAGRRECEXPIRATION_DATE' field in the FML buffer.
     *
     * @return Value of 'PAGRRECEXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAGRRECEXPIRATION_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[48].getValue(0));
    }

    /**
     * Sets the value of the 'PAGRRECEXPIRATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_PAGRRECEXPIRATION_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[48].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PAGRRECSOC_LEVEL_CODE' field in the FML buffer.
     *
     * @return Value of 'PAGRRECSOC_LEVEL_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAGRRECSOC_LEVEL_CODE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[49].getValue(0)));
    }

    /**
     * Sets the value of the 'PAGRRECSOC_LEVEL_CODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PAGRRECSOC_LEVEL_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[49].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'PAGRRECDEALER_CODE' field in the FML buffer.
     *
     * @return Value of 'PAGRRECDEALER_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAGRRECDEALER_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[50].getValue(0));
    }

    /**
     * Sets the value of the 'PAGRRECDEALER_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @throws FMLManipulationException
     */
    public void set_PAGRRECDEALER_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[50].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PAGRRECSALES_AGENT' field in the FML buffer.
     *
     * @return Value of 'PAGRRECSALES_AGENT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAGRRECSALES_AGENT() throws FMLManipulationException {
        return ((String) this.fmlBuffer[51].getValue(0));
    }

    /**
     * Sets the value of the 'PAGRRECSALES_AGENT' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @throws FMLManipulationException
     */
    public void set_PAGRRECSALES_AGENT(String value) throws FMLManipulationException {
        this.fmlBuffer[51].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PAGRRECSRV_MODE' field in the FML buffer.
     *
     * @return Value of 'PAGRRECSRV_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAGRRECSRV_MODE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[52].getValue(0)));
    }

    /**
     * Sets the value of the 'PAGRRECSRV_MODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PAGRRECSRV_MODE(String value) throws FMLManipulationException {
        this.fmlBuffer[52].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'PAGRRECSRV_SUB_MODE' field in the FML buffer.
     *
     * @return Value of 'PAGRRECSRV_SUB_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAGRRECSRV_SUB_MODE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[53].getValue(0)));
    }

    /**
     * Sets the value of the 'PAGRRECSRV_SUB_MODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PAGRRECSRV_SUB_MODE(String value) throws FMLManipulationException {
        this.fmlBuffer[53].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'PAGRRECSOC_SEQ_NO' field in the FML buffer.
     *
     * @return Value of 'PAGRRECSOC_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PAGRRECSOC_SEQ_NO() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[54].getValue(0));
    }

    /**
     * Sets the value of the 'PAGRRECSOC_SEQ_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PAGRRECSOC_SEQ_NO(Integer value) throws FMLManipulationException {
        this.fmlBuffer[54].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PAGRRECSRV_TRX_ID' field in the FML buffer.
     *
     * @return Value of 'PAGRRECSRV_TRX_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PAGRRECSRV_TRX_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[55].getValue(0));
    }

    /**
     * Sets the value of the 'PAGRRECSRV_TRX_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PAGRRECSRV_TRX_ID(Integer value) throws FMLManipulationException {
        this.fmlBuffer[55].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PAGRRECCAMPAIGN_SEQ' field in the FML buffer.
     *
     * @return Value of 'PAGRRECCAMPAIGN_SEQ' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PAGRRECCAMPAIGN_SEQ() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[56].getValue(0));
    }

    /**
     * Sets the value of the 'PAGRRECCAMPAIGN_SEQ' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PAGRRECCAMPAIGN_SEQ(Integer value) throws FMLManipulationException {
        this.fmlBuffer[56].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PAGRRECCAMPAIGN' field in the FML buffer.
     *
     * @return Value of 'PAGRRECCAMPAIGN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAGRRECCAMPAIGN() throws FMLManipulationException {
        return ((String) this.fmlBuffer[57].getValue(0));
    }

    /**
     * Sets the value of the 'PAGRRECCAMPAIGN' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 10.
     * @throws FMLManipulationException
     */
    public void set_PAGRRECCAMPAIGN(String value) throws FMLManipulationException {
        this.fmlBuffer[57].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PAGRRECCOMMIT_ORIG_NO_MONTH' field in the FML buffer.
     *
     * @return Value of 'PAGRRECCOMMIT_ORIG_NO_MONTH' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PAGRRECCOMMIT_ORIG_NO_MONTH() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[58].getValue(0)));
    }

    /**
     * Sets the value of the 'PAGRRECCOMMIT_ORIG_NO_MONTH' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PAGRRECCOMMIT_ORIG_NO_MONTH(Integer value) throws FMLManipulationException {
        this.fmlBuffer[58].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'PAGRRECPRODUCT_TYPE' field in the FML buffer.
     *
     * @return Value of 'PAGRRECPRODUCT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAGRRECPRODUCT_TYPE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[59].getValue(0));
    }

    /**
     * Sets the value of the 'PAGRRECPRODUCT_TYPE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @throws FMLManipulationException
     */
    public void set_PAGRRECPRODUCT_TYPE(String value) throws FMLManipulationException {
        this.fmlBuffer[59].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PAGRRECLOAN_VER_NO' field in the FML buffer.
     *
     * @return Value of 'PAGRRECLOAN_VER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PAGRRECLOAN_VER_NO() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[60].getValue(0));
    }

    /**
     * Sets the value of the 'PAGRRECLOAN_VER_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PAGRRECLOAN_VER_NO(Integer value) throws FMLManipulationException {
        this.fmlBuffer[60].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PAGRRECLOAN_SEQ_NO' field in the FML buffer.
     *
     * @return Value of 'PAGRRECLOAN_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PAGRRECLOAN_SEQ_NO() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[61].getValue(0));
    }

    /**
     * Sets the value of the 'PAGRRECLOAN_SEQ_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PAGRRECLOAN_SEQ_NO(Integer value) throws FMLManipulationException {
        this.fmlBuffer[61].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PAGRRECSOC_ACTV_FEE' field in the FML buffer.
     *
     * @return Value of 'PAGRRECSOC_ACTV_FEE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_PAGRRECSOC_ACTV_FEE() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[62].getValue(0));
    }

    /**
     * Sets the value of the 'PAGRRECSOC_ACTV_FEE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PAGRRECSOC_ACTV_FEE(Double value) throws FMLManipulationException {
        this.fmlBuffer[62].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PAGRRECPROMOTIONAL_SOC' field in the FML buffer.
     *
     * @return Value of 'PAGRRECPROMOTIONAL_SOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAGRRECPROMOTIONAL_SOC() throws FMLManipulationException {
        return ((String) this.fmlBuffer[63].getValue(0));
    }

    /**
     * Sets the value of the 'PAGRRECPROMOTIONAL_SOC' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 10.
     * @throws FMLManipulationException
     */
    public void set_PAGRRECPROMOTIONAL_SOC(String value) throws FMLManipulationException {
        this.fmlBuffer[63].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PAGRRECREASON_CODE' field in the FML buffer.
     *
     * @return Value of 'PAGRRECREASON_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAGRRECREASON_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[64].getValue(0));
    }

    /**
     * Sets the value of the 'PAGRRECREASON_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @throws FMLManipulationException
     */
    public void set_PAGRRECREASON_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[64].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PAGRRECSOC_START_RC_DATE' field in the FML buffer.
     *
     * @return Value of 'PAGRRECSOC_START_RC_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAGRRECSOC_START_RC_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[65].getValue(0));
    }

    /**
     * Sets the value of the 'PAGRRECSOC_START_RC_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_PAGRRECSOC_START_RC_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[65].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PAGRRECRC_DATE_COPY_IND' field in the FML buffer.
     *
     * @return Value of 'PAGRRECRC_DATE_COPY_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAGRRECRC_DATE_COPY_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[66].getValue(0)));
    }

    /**
     * Sets the value of the 'PAGRRECRC_DATE_COPY_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PAGRRECRC_DATE_COPY_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[66].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'PSOCFTRBUFROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PSOCFTRBUFROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[67].getValue(0));
    }

    /**
     * Sets the value of the 'PSOCFTRBUFROWCOUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PSOCFTRBUFROWCOUNT(Integer value) throws FMLManipulationException {
        this.fmlBuffer[67].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSOCFTRBUFROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PSOCFTRBUFROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[68].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PSOCFTRBUFROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_PSOCFTRBUFROWID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[68].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PSOCFTRBUFROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'PSOCFTRBUFROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSOCFTRBUFROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[68].getCount());
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFSOC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSOCFTRBUFSOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PSOCFTRBUFSOC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[69].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PSOCFTRBUFSOC' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 10.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_PSOCFTRBUFSOC(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[69].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PSOCFTRBUFSOC' field in the FML buffer.
     *
     * @return Number of values defined for 'PSOCFTRBUFSOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSOCFTRBUFSOC_size() throws FMLManipulationException {
        return (this.fmlBuffer[69].getCount());
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFSOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSOCFTRBUFSOC_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PSOCFTRBUFSOC_EFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[70].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PSOCFTRBUFSOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_PSOCFTRBUFSOC_EFFECTIVE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[70].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PSOCFTRBUFSOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'PSOCFTRBUFSOC_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSOCFTRBUFSOC_EFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[70].getCount());
    }

    /**
     * Retrieves the value of the 'FEATURE_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FEATURE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FEATURE_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[71].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FEATURE_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FEATURE_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[71].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FEATURE_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FEATURE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FEATURE_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[71].getCount());
    }

    /**
     * Retrieves the value of the 'MPS_FTR_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'MPS_FTR_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MPS_FTR_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[72].getValue(nIndex));
    }

    /**
     * Sets the value of the 'MPS_FTR_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_MPS_FTR_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[72].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'MPS_FTR_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'MPS_FTR_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MPS_FTR_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[72].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_EFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[73].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FTR_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FTR_EFFECTIVE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[73].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FTR_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_EFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[73].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_EXPIRATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_EXPIRATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[74].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FTR_EXPIRATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FTR_EXPIRATION_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[74].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FTR_EXPIRATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_EXPIRATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[74].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_EFF_RSN_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_EFF_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_EFF_RSN_CODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[75].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'FTR_EFF_RSN_CODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FTR_EFF_RSN_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[75].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'FTR_EFF_RSN_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_EFF_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_EFF_RSN_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[75].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_EXP_RSN_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_EXP_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_EXP_RSN_CODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[76].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'FTR_EXP_RSN_CODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FTR_EXP_RSN_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[76].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'FTR_EXP_RSN_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_EXP_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_EXP_RSN_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[76].getCount());
    }

    /**
     * Retrieves the value of the 'SERVICE_FTR_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'SERVICE_FTR_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_SERVICE_FTR_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[77].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SERVICE_FTR_SEQ_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_SERVICE_FTR_SEQ_NO(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[77].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SERVICE_FTR_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'SERVICE_FTR_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SERVICE_FTR_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[77].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[78].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'FTR_MODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FTR_MODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[78].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'FTR_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[78].getCount());
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFSOC_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSOCFTRBUFSOC_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PSOCFTRBUFSOC_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[79].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PSOCFTRBUFSOC_SEQ_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_PSOCFTRBUFSOC_SEQ_NO(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[79].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PSOCFTRBUFSOC_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'PSOCFTRBUFSOC_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSOCFTRBUFSOC_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[79].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_SUB_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_SUB_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_SUB_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[80].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'FTR_SUB_MODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FTR_SUB_MODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[80].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'FTR_SUB_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_SUB_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_SUB_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[80].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_ADD_PARAM' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_ADD_PARAM' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_ADD_PARAM(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[81].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FTR_ADD_PARAM' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 301.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FTR_ADD_PARAM(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[81].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FTR_ADD_PARAM' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_ADD_PARAM' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_ADD_PARAM_size() throws FMLManipulationException {
        return (this.fmlBuffer[81].getCount());
    }

    /**
     * Retrieves the value of the 'FEATURE_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FEATURE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FEATURE_TYPE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[82].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FEATURE_TYPE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FEATURE_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[82].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FEATURE_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'FEATURE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FEATURE_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[82].getCount());
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFPRODUCT_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSOCFTRBUFPRODUCT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PSOCFTRBUFPRODUCT_TYPE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[83].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PSOCFTRBUFPRODUCT_TYPE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_PSOCFTRBUFPRODUCT_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[83].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PSOCFTRBUFPRODUCT_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'PSOCFTRBUFPRODUCT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSOCFTRBUFPRODUCT_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[83].getCount());
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFCAMPAIGN_SEQ' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSOCFTRBUFCAMPAIGN_SEQ' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PSOCFTRBUFCAMPAIGN_SEQ(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[84].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PSOCFTRBUFCAMPAIGN_SEQ' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_PSOCFTRBUFCAMPAIGN_SEQ(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[84].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PSOCFTRBUFCAMPAIGN_SEQ' field in the FML buffer.
     *
     * @return Number of values defined for 'PSOCFTRBUFCAMPAIGN_SEQ' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSOCFTRBUFCAMPAIGN_SEQ_size() throws FMLManipulationException {
        return (this.fmlBuffer[84].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_SPECIAL_TELNO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_SPECIAL_TELNO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_SPECIAL_TELNO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[85].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FTR_SPECIAL_TELNO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_FTR_SPECIAL_TELNO(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[85].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FTR_SPECIAL_TELNO' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_SPECIAL_TELNO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_SPECIAL_TELNO_size() throws FMLManipulationException {
        return (this.fmlBuffer[85].getCount());
    }

    /**
     * Retrieves the value of the 'SWITCH_ACT_NEEDED' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'SWITCH_ACT_NEEDED' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SWITCH_ACT_NEEDED(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[86].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'SWITCH_ACT_NEEDED' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_SWITCH_ACT_NEEDED(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[86].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'SWITCH_ACT_NEEDED' field in the FML buffer.
     *
     * @return Number of values defined for 'SWITCH_ACT_NEEDED' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SWITCH_ACT_NEEDED_size() throws FMLManipulationException {
        return (this.fmlBuffer[86].getCount());
    }

    /**
     * Retrieves the value of the 'SWITCH_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'SWITCH_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SWITCH_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[87].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SWITCH_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_SWITCH_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[87].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SWITCH_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'SWITCH_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SWITCH_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[87].getCount());
    }

    /**
     * Retrieves the value of the 'MSISDN_CRITERIA' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'MSISDN_CRITERIA' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MSISDN_CRITERIA(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[88].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'MSISDN_CRITERIA' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_MSISDN_CRITERIA(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[88].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'MSISDN_CRITERIA' field in the FML buffer.
     *
     * @return Number of values defined for 'MSISDN_CRITERIA' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MSISDN_CRITERIA_size() throws FMLManipulationException {
        return (this.fmlBuffer[88].getCount());
    }

    /**
     * Retrieves the value of the 'TN_CLASS_CD' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'TN_CLASS_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_TN_CLASS_CD(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[89].getValue(nIndex));
    }

    /**
     * Sets the value of the 'TN_CLASS_CD' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_TN_CLASS_CD(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[89].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'TN_CLASS_CD' field in the FML buffer.
     *
     * @return Number of values defined for 'TN_CLASS_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_TN_CLASS_CD_size() throws FMLManipulationException {
        return (this.fmlBuffer[89].getCount());
    }

    /**
     * Retrieves the value of the 'ACTION_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'ACTION_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACTION_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[90].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'ACTION_MODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_ACTION_MODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[90].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'ACTION_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'ACTION_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACTION_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[90].getCount());
    }

    /**
     * Retrieves the value of the 'MANUAL_RC_RATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'MANUAL_RC_RATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_MANUAL_RC_RATE(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[91].getValue(nIndex));
    }

    /**
     * Sets the value of the 'MANUAL_RC_RATE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_MANUAL_RC_RATE(int nIndex, Double value) throws FMLManipulationException {
        this.fmlBuffer[91].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'MANUAL_RC_RATE' field in the FML buffer.
     *
     * @return Number of values defined for 'MANUAL_RC_RATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MANUAL_RC_RATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[91].getCount());
    }

    /**
     * Retrieves the value of the 'MANUAL_RC_EXP_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'MANUAL_RC_EXP_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MANUAL_RC_EXP_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[92].getValue(nIndex));
    }

    /**
     * Sets the value of the 'MANUAL_RC_EXP_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @throws FMLManipulationException
     */
    public void set_MANUAL_RC_EXP_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[92].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'MANUAL_RC_EXP_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'MANUAL_RC_EXP_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MANUAL_RC_EXP_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[92].getCount());
    }

    /**
     * Retrieves the value of the 'PCSFRNDFMLROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'PCSFRNDFMLROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PCSFRNDFMLROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[93].getValue(0));
    }

    /**
     * Sets the value of the 'PCSFRNDFMLROWCOUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PCSFRNDFMLROWCOUNT(Integer value) throws FMLManipulationException {
        this.fmlBuffer[93].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'ACTIONIND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'ACTIONIND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACTIONIND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[94].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'ACTIONIND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_ACTIONIND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[94].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'ACTIONIND' field in the FML buffer.
     *
     * @return Number of values defined for 'ACTIONIND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACTIONIND_size() throws FMLManipulationException {
        return (this.fmlBuffer[94].getCount());
    }

    /**
     * Retrieves the value of the 'PCSFANDFRECROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'PCSFANDFRECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PCSFANDFRECROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[95].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PCSFANDFRECROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_PCSFANDFRECROWID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[95].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PCSFANDFRECROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'PCSFANDFRECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PCSFANDFRECROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[95].getCount());
    }

    /**
     * Retrieves the value of the 'PCSFANDFRECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'PCSFANDFRECEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PCSFANDFRECEFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[96].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PCSFANDFRECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_PCSFANDFRECEFFECTIVE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[96].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PCSFANDFRECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'PCSFANDFRECEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PCSFANDFRECEFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[96].getCount());
    }

    /**
     * Retrieves the value of the 'PCSFANDFRECEXPIRATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'PCSFANDFRECEXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PCSFANDFRECEXPIRATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[97].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PCSFANDFRECEXPIRATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_PCSFANDFRECEXPIRATION_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[97].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PCSFANDFRECEXPIRATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'PCSFANDFRECEXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PCSFANDFRECEXPIRATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[97].getCount());
    }

    /**
     * Retrieves the value of the 'PERSONAL_TEL' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'PERSONAL_TEL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PERSONAL_TEL(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[98].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PERSONAL_TEL' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_PERSONAL_TEL(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[98].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PERSONAL_TEL' field in the FML buffer.
     *
     * @return Number of values defined for 'PERSONAL_TEL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PERSONAL_TEL_size() throws FMLManipulationException {
        return (this.fmlBuffer[98].getCount());
    }

    /**
     * Retrieves the value of the 'PERSONAL_TEL_TO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'PERSONAL_TEL_TO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PERSONAL_TEL_TO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[99].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PERSONAL_TEL_TO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_PERSONAL_TEL_TO(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[99].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PERSONAL_TEL_TO' field in the FML buffer.
     *
     * @return Number of values defined for 'PERSONAL_TEL_TO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PERSONAL_TEL_TO_size() throws FMLManipulationException {
        return (this.fmlBuffer[99].getCount());
    }

    /**
     * Retrieves the value of the 'FF_SOC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'FF_SOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FF_SOC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[100].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FF_SOC' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 10.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_FF_SOC(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[100].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FF_SOC' field in the FML buffer.
     *
     * @return Number of values defined for 'FF_SOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FF_SOC_size() throws FMLManipulationException {
        return (this.fmlBuffer[100].getCount());
    }

    /**
     * Retrieves the value of the 'PLAN_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'PLAN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PLAN_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[101].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PLAN_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 10.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_PLAN_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[101].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PLAN_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'PLAN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PLAN_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[101].getCount());
    }

    /**
     * Retrieves the value of the 'DISCOUNT_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'DISCOUNT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DISCOUNT_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[102].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'DISCOUNT_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_DISCOUNT_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[102].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'DISCOUNT_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'DISCOUNT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DISCOUNT_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[102].getCount());
    }

    /**
     * Retrieves the value of the 'START_HOUR' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'START_HOUR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_START_HOUR(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[103].getValue(nIndex));
    }

    /**
     * Sets the value of the 'START_HOUR' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_START_HOUR(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[103].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'START_HOUR' field in the FML buffer.
     *
     * @return Number of values defined for 'START_HOUR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_START_HOUR_size() throws FMLManipulationException {
        return (this.fmlBuffer[103].getCount());
    }

    /**
     * Retrieves the value of the 'DURATION' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @return Value of 'DURATION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_DURATION(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[104].getValue(nIndex));
    }

    /**
     * Sets the value of the 'DURATION' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 10000).
     * @throws FMLManipulationException
     */
    public void set_DURATION(int nIndex, Double value) throws FMLManipulationException {
        this.fmlBuffer[104].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'DURATION' field in the FML buffer.
     *
     * @return Number of values defined for 'DURATION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DURATION_size() throws FMLManipulationException {
        return (this.fmlBuffer[104].getCount());
    }

    /**
     * Retrieves the value of the 'PESNBUFFERROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'PESNBUFFERROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PESNBUFFERROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[105].getValue(0));
    }

    /**
     * Sets the value of the 'PESNBUFFERROWCOUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PESNBUFFERROWCOUNT(Integer value) throws FMLManipulationException {
        this.fmlBuffer[105].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'EQUIPMENT_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'EQUIPMENT_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EQUIPMENT_NO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[106].getValue(nIndex));
    }

    /**
     * Sets the value of the 'EQUIPMENT_NO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_EQUIPMENT_NO(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[106].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'EQUIPMENT_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'EQUIPMENT_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_EQUIPMENT_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[106].getCount());
    }

    /**
     * Retrieves the value of the 'PHD_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PHD_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PHD_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[107].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PHD_SEQ_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_PHD_SEQ_NO(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[107].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PHD_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'PHD_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PHD_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[107].getCount());
    }

    /**
     * Retrieves the value of the 'EQUIPMENT_LEVEL' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'EQUIPMENT_LEVEL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_EQUIPMENT_LEVEL(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[108].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'EQUIPMENT_LEVEL' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_EQUIPMENT_LEVEL(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[108].setValue(nIndex, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves number of values defined for 'EQUIPMENT_LEVEL' field in the FML buffer.
     *
     * @return Number of values defined for 'EQUIPMENT_LEVEL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_EQUIPMENT_LEVEL_size() throws FMLManipulationException {
        return (this.fmlBuffer[108].getCount());
    }

    /**
     * Retrieves the value of the 'IMSI' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'IMSI' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_IMSI(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[109].getValue(nIndex));
    }

    /**
     * Sets the value of the 'IMSI' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 16.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_IMSI(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[109].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'IMSI' field in the FML buffer.
     *
     * @return Number of values defined for 'IMSI' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_IMSI_size() throws FMLManipulationException {
        return (this.fmlBuffer[109].getCount());
    }

    /**
     * Retrieves the value of the 'PHYDEVARRAYEXPIRATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PHYDEVARRAYEXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PHYDEVARRAYEXPIRATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[110].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PHYDEVARRAYEXPIRATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_PHYDEVARRAYEXPIRATION_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[110].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PHYDEVARRAYEXPIRATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'PHYDEVARRAYEXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PHYDEVARRAYEXPIRATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[110].getCount());
    }

    /**
     * Retrieves the value of the 'PHYDEVARRAYEFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PHYDEVARRAYEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PHYDEVARRAYEFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[111].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PHYDEVARRAYEFFECTIVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_PHYDEVARRAYEFFECTIVE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[111].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PHYDEVARRAYEFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'PHYDEVARRAYEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PHYDEVARRAYEFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[111].getCount());
    }

    /**
     * Retrieves the value of the 'OWNERSHIP_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'OWNERSHIP_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_OWNERSHIP_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[112].getValue(nIndex));
    }

    /**
     * Sets the value of the 'OWNERSHIP_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 3.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_OWNERSHIP_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[112].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'OWNERSHIP_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'OWNERSHIP_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_OWNERSHIP_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[112].getCount());
    }

    /**
     * Retrieves the value of the 'SW_STATE_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SW_STATE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SW_STATE_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[113].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'SW_STATE_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SW_STATE_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[113].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'SW_STATE_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'SW_STATE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SW_STATE_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[113].getCount());
    }

    /**
     * Retrieves the value of the 'LAST_SW_ACTV_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'LAST_SW_ACTV_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LAST_SW_ACTV_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[114].getValue(nIndex));
    }

    /**
     * Sets the value of the 'LAST_SW_ACTV_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_LAST_SW_ACTV_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[114].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'LAST_SW_ACTV_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'LAST_SW_ACTV_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LAST_SW_ACTV_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[114].getCount());
    }

    /**
     * Retrieves the value of the 'NEXT_ACTV_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'NEXT_ACTV_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NEXT_ACTV_CODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[115].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'NEXT_ACTV_CODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_NEXT_ACTV_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[115].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'NEXT_ACTV_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'NEXT_ACTV_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NEXT_ACTV_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[115].getCount());
    }

    /**
     * Retrieves the value of the 'NEXT_ACTV_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'NEXT_ACTV_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NEXT_ACTV_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[116].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NEXT_ACTV_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_NEXT_ACTV_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[116].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NEXT_ACTV_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'NEXT_ACTV_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NEXT_ACTV_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[116].getCount());
    }

    /**
     * Retrieves the value of the 'NEXT_ACTV_ISSUE_DT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'NEXT_ACTV_ISSUE_DT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NEXT_ACTV_ISSUE_DT(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[117].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NEXT_ACTV_ISSUE_DT' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_NEXT_ACTV_ISSUE_DT(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[117].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NEXT_ACTV_ISSUE_DT' field in the FML buffer.
     *
     * @return Number of values defined for 'NEXT_ACTV_ISSUE_DT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NEXT_ACTV_ISSUE_DT_size() throws FMLManipulationException {
        return (this.fmlBuffer[117].getCount());
    }

    /**
     * Retrieves the value of the 'DEVICE_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'DEVICE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DEVICE_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[118].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'DEVICE_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_DEVICE_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[118].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'DEVICE_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'DEVICE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DEVICE_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[118].getCount());
    }

    /**
     * Retrieves the value of the 'ESN_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ESN_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ESN_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[119].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'ESN_MODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_ESN_MODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[119].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'ESN_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'ESN_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ESN_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[119].getCount());
    }

    /**
     * Retrieves the value of the 'ITEM_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ITEM_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ITEM_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[120].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ITEM_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 16.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_ITEM_ID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[120].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ITEM_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'ITEM_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ITEM_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[120].getCount());
    }

    /**
     * Retrieves the value of the 'POOL' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'POOL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_POOL(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[121].getValue(nIndex));
    }

    /**
     * Sets the value of the 'POOL' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 3.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_POOL(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[121].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'POOL' field in the FML buffer.
     *
     * @return Number of values defined for 'POOL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_POOL_size() throws FMLManipulationException {
        return (this.fmlBuffer[121].getCount());
    }

    /**
     * Retrieves the value of the 'LOCATION_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'LOCATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LOCATION_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[122].getValue(nIndex));
    }

    /**
     * Sets the value of the 'LOCATION_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_LOCATION_ID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[122].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'LOCATION_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'LOCATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LOCATION_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[122].getCount());
    }

    /**
     * Retrieves the value of the 'ACTIVITY_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ACTIVITY_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACTIVITY_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[123].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ACTIVITY_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_ACTIVITY_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[123].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ACTIVITY_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'ACTIVITY_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACTIVITY_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[123].getCount());
    }

    /**
     * Retrieves the value of the 'ACTIVITY_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ACTIVITY_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACTIVITY_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[124].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ACTIVITY_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_ACTIVITY_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[124].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ACTIVITY_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'ACTIVITY_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACTIVITY_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[124].getCount());
    }

    /**
     * Retrieves the value of the 'OPERATION_STATUS' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'OPERATION_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_OPERATION_STATUS(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[125].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'OPERATION_STATUS' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_OPERATION_STATUS(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[125].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'OPERATION_STATUS' field in the FML buffer.
     *
     * @return Number of values defined for 'OPERATION_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_OPERATION_STATUS_size() throws FMLManipulationException {
        return (this.fmlBuffer[125].getCount());
    }

    /**
     * Retrieves the value of the 'ITEM_OWNERSHIP' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ITEM_OWNERSHIP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ITEM_OWNERSHIP(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[126].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'ITEM_OWNERSHIP' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_ITEM_OWNERSHIP(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[126].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'ITEM_OWNERSHIP' field in the FML buffer.
     *
     * @return Number of values defined for 'ITEM_OWNERSHIP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ITEM_OWNERSHIP_size() throws FMLManipulationException {
        return (this.fmlBuffer[126].getCount());
    }

    /**
     * Retrieves the value of the 'ITEM_OWNERSHIP_DT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ITEM_OWNERSHIP_DT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ITEM_OWNERSHIP_DT(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[127].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ITEM_OWNERSHIP_DT' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_ITEM_OWNERSHIP_DT(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[127].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ITEM_OWNERSHIP_DT' field in the FML buffer.
     *
     * @return Number of values defined for 'ITEM_OWNERSHIP_DT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ITEM_OWNERSHIP_DT_size() throws FMLManipulationException {
        return (this.fmlBuffer[127].getCount());
    }

    /**
     * Retrieves the value of the 'CURR_POSSESSION' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'CURR_POSSESSION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CURR_POSSESSION(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[128].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'CURR_POSSESSION' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_CURR_POSSESSION(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[128].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'CURR_POSSESSION' field in the FML buffer.
     *
     * @return Number of values defined for 'CURR_POSSESSION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CURR_POSSESSION_size() throws FMLManipulationException {
        return (this.fmlBuffer[128].getCount());
    }

    /**
     * Retrieves the value of the 'CURR_POSSESSION_DT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'CURR_POSSESSION_DT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CURR_POSSESSION_DT(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[129].getValue(nIndex));
    }

    /**
     * Sets the value of the 'CURR_POSSESSION_DT' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_CURR_POSSESSION_DT(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[129].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'CURR_POSSESSION_DT' field in the FML buffer.
     *
     * @return Number of values defined for 'CURR_POSSESSION_DT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CURR_POSSESSION_DT_size() throws FMLManipulationException {
        return (this.fmlBuffer[129].getCount());
    }

    /**
     * Retrieves the value of the 'MISSING_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'MISSING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MISSING_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[130].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'MISSING_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_MISSING_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[130].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'MISSING_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'MISSING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MISSING_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[130].getCount());
    }

    /**
     * Retrieves the value of the 'IN_REPAIR_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'IN_REPAIR_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_IN_REPAIR_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[131].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'IN_REPAIR_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_IN_REPAIR_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[131].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'IN_REPAIR_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'IN_REPAIR_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_IN_REPAIR_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[131].getCount());
    }

    /**
     * Retrieves the value of the 'IN_TRANSIT_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'IN_TRANSIT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_IN_TRANSIT_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[132].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'IN_TRANSIT_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_IN_TRANSIT_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[132].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'IN_TRANSIT_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'IN_TRANSIT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_IN_TRANSIT_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[132].getCount());
    }

    /**
     * Retrieves the value of the 'COMITED_TO_POS_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'COMITED_TO_POS_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COMITED_TO_POS_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[133].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'COMITED_TO_POS_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_COMITED_TO_POS_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[133].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'COMITED_TO_POS_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'COMITED_TO_POS_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COMITED_TO_POS_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[133].getCount());
    }

    /**
     * Retrieves the value of the 'COMITED_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'COMITED_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COMITED_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[134].getValue(nIndex));
    }

    /**
     * Sets the value of the 'COMITED_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_COMITED_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[134].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'COMITED_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'COMITED_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COMITED_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[134].getCount());
    }

    /**
     * Retrieves the value of the 'ACTIVITY_REASON' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ACTIVITY_REASON' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACTIVITY_REASON(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[135].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ACTIVITY_REASON' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_ACTIVITY_REASON(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[135].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ACTIVITY_REASON' field in the FML buffer.
     *
     * @return Number of values defined for 'ACTIVITY_REASON' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACTIVITY_REASON_size() throws FMLManipulationException {
        return (this.fmlBuffer[135].getCount());
    }

    /**
     * Retrieves the value of the 'UPGRADE_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'UPGRADE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_UPGRADE_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[136].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'UPGRADE_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_UPGRADE_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[136].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'UPGRADE_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'UPGRADE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_UPGRADE_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[136].getCount());
    }

    /**
     * Retrieves the value of the 'EXPECTED_RTRN_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'EXPECTED_RTRN_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EXPECTED_RTRN_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[137].getValue(nIndex));
    }

    /**
     * Sets the value of the 'EXPECTED_RTRN_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_EXPECTED_RTRN_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[137].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'EXPECTED_RTRN_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'EXPECTED_RTRN_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_EXPECTED_RTRN_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[137].getCount());
    }

    /**
     * Retrieves the value of the 'POLICE_REPORT_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'POLICE_REPORT_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_POLICE_REPORT_NO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[138].getValue(nIndex));
    }

    /**
     * Sets the value of the 'POLICE_REPORT_NO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 16.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_POLICE_REPORT_NO(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[138].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'POLICE_REPORT_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'POLICE_REPORT_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_POLICE_REPORT_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[138].getCount());
    }

    /**
     * Retrieves the value of the 'POLICE_REPORT_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'POLICE_REPORT_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_POLICE_REPORT_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[139].getValue(nIndex));
    }

    /**
     * Sets the value of the 'POLICE_REPORT_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_POLICE_REPORT_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[139].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'POLICE_REPORT_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'POLICE_REPORT_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_POLICE_REPORT_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[139].getCount());
    }

    /**
     * Retrieves the value of the 'POLICE_STATION' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'POLICE_STATION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_POLICE_STATION(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[140].getValue(nIndex));
    }

    /**
     * Sets the value of the 'POLICE_STATION' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 31.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_POLICE_STATION(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[140].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'POLICE_STATION' field in the FML buffer.
     *
     * @return Number of values defined for 'POLICE_STATION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_POLICE_STATION_size() throws FMLManipulationException {
        return (this.fmlBuffer[140].getCount());
    }

    /**
     * Retrieves the value of the 'PUK' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PUK' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PUK(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[141].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PUK' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_PUK(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[141].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PUK' field in the FML buffer.
     *
     * @return Number of values defined for 'PUK' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PUK_size() throws FMLManipulationException {
        return (this.fmlBuffer[141].getCount());
    }

    /**
     * Retrieves the value of the 'PUK2' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PUK2' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PUK2(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[142].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PUK2' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_PUK2(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[142].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PUK2' field in the FML buffer.
     *
     * @return Number of values defined for 'PUK2' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PUK2_size() throws FMLManipulationException {
        return (this.fmlBuffer[142].getCount());
    }

    /**
     * Retrieves the value of the 'FIRST_USED_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'FIRST_USED_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FIRST_USED_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[143].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FIRST_USED_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_FIRST_USED_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[143].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FIRST_USED_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'FIRST_USED_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FIRST_USED_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[143].getCount());
    }

    /**
     * Retrieves the value of the 'SIM_STATUS' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SIM_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SIM_STATUS(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[144].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'SIM_STATUS' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SIM_STATUS(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[144].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'SIM_STATUS' field in the FML buffer.
     *
     * @return Number of values defined for 'SIM_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SIM_STATUS_size() throws FMLManipulationException {
        return (this.fmlBuffer[144].getCount());
    }

    /**
     * Retrieves the value of the 'SUSPEND_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SUSPEND_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUSPEND_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[145].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'SUSPEND_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SUSPEND_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[145].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'SUSPEND_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'SUSPEND_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SUSPEND_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[145].getCount());
    }

    /**
     * Retrieves the value of the 'SUSPEND_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SUSPEND_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUSPEND_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[146].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SUSPEND_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SUSPEND_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[146].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SUSPEND_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'SUSPEND_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SUSPEND_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[146].getCount());
    }

    /**
     * Retrieves the value of the 'SENT_TO_AUC_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SENT_TO_AUC_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SENT_TO_AUC_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[147].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'SENT_TO_AUC_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_SENT_TO_AUC_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[147].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'SENT_TO_AUC_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'SENT_TO_AUC_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SENT_TO_AUC_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[147].getCount());
    }

    /**
     * Retrieves the value of the 'HLR_CD' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'HLR_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_HLR_CD(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[148].getValue(nIndex));
    }

    /**
     * Sets the value of the 'HLR_CD' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_HLR_CD(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[148].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'HLR_CD' field in the FML buffer.
     *
     * @return Number of values defined for 'HLR_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_HLR_CD_size() throws FMLManipulationException {
        return (this.fmlBuffer[148].getCount());
    }

    /**
     * Retrieves the value of the 'K4ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'K4ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_K4ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[149].getValue(nIndex));
    }

    /**
     * Sets the value of the 'K4ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 41.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_K4ID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[149].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'K4ID' field in the FML buffer.
     *
     * @return Number of values defined for 'K4ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_K4ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[149].getCount());
    }

    /**
     * Retrieves the value of the 'PHYDEVARRAYDEALER_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PHYDEVARRAYDEALER_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PHYDEVARRAYDEALER_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[150].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PHYDEVARRAYDEALER_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @throws FMLManipulationException
     */
    public void set_PHYDEVARRAYDEALER_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[150].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PHYDEVARRAYDEALER_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'PHYDEVARRAYDEALER_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PHYDEVARRAYDEALER_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[150].getCount());
    }

    /**
     * Retrieves the value of the 'ROW_COUNT' field in the FML buffer.
     *
     * @return Value of 'ROW_COUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ROW_COUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[151].getValue(0));
    }

    /**
     * Sets the value of the 'ROW_COUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_ROW_COUNT(Integer value) throws FMLManipulationException {
        this.fmlBuffer[151].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'ACT_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'ACT_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACT_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[152].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ACT_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_ACT_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[152].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ACT_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'ACT_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACT_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[152].getCount());
    }

    /**
     * Retrieves the value of the 'ACT_REASON' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'ACT_REASON' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACT_REASON(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[153].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ACT_REASON' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_ACT_REASON(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[153].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ACT_REASON' field in the FML buffer.
     *
     * @return Number of values defined for 'ACT_REASON' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACT_REASON_size() throws FMLManipulationException {
        return (this.fmlBuffer[153].getCount());
    }

    /**
     * Retrieves the value of the 'SUSP_RC_RATE_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'SUSP_RC_RATE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUSP_RC_RATE_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[154].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'SUSP_RC_RATE_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_SUSP_RC_RATE_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[154].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'SUSP_RC_RATE_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'SUSP_RC_RATE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SUSP_RC_RATE_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[154].getCount());
    }

    /**
     * Retrieves the value of the 'MEMO_CTN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'MEMO_CTN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MEMO_CTN(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[155].getValue(nIndex));
    }

    /**
     * Sets the value of the 'MEMO_CTN' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_MEMO_CTN(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[155].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'MEMO_CTN' field in the FML buffer.
     *
     * @return Number of values defined for 'MEMO_CTN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MEMO_CTN_size() throws FMLManipulationException {
        return (this.fmlBuffer[155].getCount());
    }

    /**
     * Retrieves the value of the 'USER_TEXT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'USER_TEXT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_USER_TEXT(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[156].getValue(nIndex));
    }

    /**
     * Sets the value of the 'USER_TEXT' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 2001.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_USER_TEXT(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[156].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'USER_TEXT' field in the FML buffer.
     *
     * @return Number of values defined for 'USER_TEXT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_USER_TEXT_size() throws FMLManipulationException {
        return (this.fmlBuffer[156].getCount());
    }

    /**
     * Retrieves the value of the 'MEMO_SOURCE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'MEMO_SOURCE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MEMO_SOURCE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[157].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'MEMO_SOURCE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_MEMO_SOURCE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[157].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'MEMO_SOURCE' field in the FML buffer.
     *
     * @return Number of values defined for 'MEMO_SOURCE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MEMO_SOURCE_size() throws FMLManipulationException {
        return (this.fmlBuffer[157].getCount());
    }

    /**
     * Retrieves the value of the 'PARAM_COUNT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'PARAM_COUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PARAM_COUNT(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[158].getValue(nIndex));
    }

    /**
     * Sets the value of the 'PARAM_COUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_PARAM_COUNT(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[158].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'PARAM_COUNT' field in the FML buffer.
     *
     * @return Number of values defined for 'PARAM_COUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PARAM_COUNT_size() throws FMLManipulationException {
        return (this.fmlBuffer[158].getCount());
    }

    /**
     * Retrieves the value of the 'P1' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'P1' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P1(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[159].getValue(nIndex));
    }

    /**
     * Sets the value of the 'P1' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_P1(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[159].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'P1' field in the FML buffer.
     *
     * @return Number of values defined for 'P1' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_P1_size() throws FMLManipulationException {
        return (this.fmlBuffer[159].getCount());
    }

    /**
     * Retrieves the value of the 'P2' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'P2' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P2(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[160].getValue(nIndex));
    }

    /**
     * Sets the value of the 'P2' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_P2(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[160].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'P2' field in the FML buffer.
     *
     * @return Number of values defined for 'P2' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_P2_size() throws FMLManipulationException {
        return (this.fmlBuffer[160].getCount());
    }

    /**
     * Retrieves the value of the 'P3' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'P3' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P3(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[161].getValue(nIndex));
    }

    /**
     * Sets the value of the 'P3' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_P3(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[161].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'P3' field in the FML buffer.
     *
     * @return Number of values defined for 'P3' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_P3_size() throws FMLManipulationException {
        return (this.fmlBuffer[161].getCount());
    }

    /**
     * Retrieves the value of the 'P4' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'P4' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P4(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[162].getValue(nIndex));
    }

    /**
     * Sets the value of the 'P4' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_P4(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[162].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'P4' field in the FML buffer.
     *
     * @return Number of values defined for 'P4' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_P4_size() throws FMLManipulationException {
        return (this.fmlBuffer[162].getCount());
    }

    /**
     * Retrieves the value of the 'P5' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'P5' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P5(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[163].getValue(nIndex));
    }

    /**
     * Sets the value of the 'P5' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_P5(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[163].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'P5' field in the FML buffer.
     *
     * @return Number of values defined for 'P5' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_P5_size() throws FMLManipulationException {
        return (this.fmlBuffer[163].getCount());
    }

    /**
     * Retrieves the value of the 'P6' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'P6' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P6(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[164].getValue(nIndex));
    }

    /**
     * Sets the value of the 'P6' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_P6(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[164].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'P6' field in the FML buffer.
     *
     * @return Number of values defined for 'P6' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_P6_size() throws FMLManipulationException {
        return (this.fmlBuffer[164].getCount());
    }

    /**
     * Retrieves the value of the 'P7' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'P7' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P7(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[165].getValue(nIndex));
    }

    /**
     * Sets the value of the 'P7' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_P7(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[165].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'P7' field in the FML buffer.
     *
     * @return Number of values defined for 'P7' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_P7_size() throws FMLManipulationException {
        return (this.fmlBuffer[165].getCount());
    }

    /**
     * Retrieves the value of the 'P8' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'P8' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P8(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[166].getValue(nIndex));
    }

    /**
     * Sets the value of the 'P8' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_P8(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[166].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'P8' field in the FML buffer.
     *
     * @return Number of values defined for 'P8' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_P8_size() throws FMLManipulationException {
        return (this.fmlBuffer[166].getCount());
    }

    /**
     * Retrieves the value of the 'P9' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'P9' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P9(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[167].getValue(nIndex));
    }

    /**
     * Sets the value of the 'P9' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_P9(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[167].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'P9' field in the FML buffer.
     *
     * @return Number of values defined for 'P9' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_P9_size() throws FMLManipulationException {
        return (this.fmlBuffer[167].getCount());
    }

    /**
     * Retrieves the value of the 'P10' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'P10' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_P10(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[168].getValue(nIndex));
    }

    /**
     * Sets the value of the 'P10' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_P10(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[168].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'P10' field in the FML buffer.
     *
     * @return Number of values defined for 'P10' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_P10_size() throws FMLManipulationException {
        return (this.fmlBuffer[168].getCount());
    }

    /**
     * Retrieves the value of the 'MEMO_AMT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'MEMO_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_MEMO_AMT(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[169].getValue(nIndex));
    }

    /**
     * Sets the value of the 'MEMO_AMT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_MEMO_AMT(int nIndex, Double value) throws FMLManipulationException {
        this.fmlBuffer[169].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'MEMO_AMT' field in the FML buffer.
     *
     * @return Number of values defined for 'MEMO_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MEMO_AMT_size() throws FMLManipulationException {
        return (this.fmlBuffer[169].getCount());
    }

    /**
     * Retrieves the value of the 'RMS_ACT_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'RMS_ACT_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_RMS_ACT_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[170].getValue(nIndex));
    }

    /**
     * Sets the value of the 'RMS_ACT_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_RMS_ACT_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[170].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'RMS_ACT_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'RMS_ACT_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_RMS_ACT_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[170].getCount());
    }

    /**
     * Retrieves the value of the 'CHARGE_AMT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'CHARGE_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_CHARGE_AMT(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[171].getValue(nIndex));
    }

    /**
     * Sets the value of the 'CHARGE_AMT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_CHARGE_AMT(int nIndex, Double value) throws FMLManipulationException {
        this.fmlBuffer[171].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'CHARGE_AMT' field in the FML buffer.
     *
     * @return Number of values defined for 'CHARGE_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CHARGE_AMT_size() throws FMLManipulationException {
        return (this.fmlBuffer[171].getCount());
    }

    /**
     * Retrieves the value of the 'CHARGE_AMT_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'CHARGE_AMT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CHARGE_AMT_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[172].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'CHARGE_AMT_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_CHARGE_AMT_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[172].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'CHARGE_AMT_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'CHARGE_AMT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CHARGE_AMT_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[172].getCount());
    }

    /**
     * Retrieves the value of the 'WAIVE_REASON' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'WAIVE_REASON' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_WAIVE_REASON(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[173].getValue(nIndex));
    }

    /**
     * Sets the value of the 'WAIVE_REASON' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_WAIVE_REASON(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[173].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'WAIVE_REASON' field in the FML buffer.
     *
     * @return Number of values defined for 'WAIVE_REASON' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_WAIVE_REASON_size() throws FMLManipulationException {
        return (this.fmlBuffer[173].getCount());
    }

    /**
     * Retrieves the value of the 'WAIVE_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @return Value of 'WAIVE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_WAIVE_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[174].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'WAIVE_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 25).
     * @throws FMLManipulationException
     */
    public void set_WAIVE_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[174].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'WAIVE_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'WAIVE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_WAIVE_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[174].getCount());
    }

    /**
     * Retrieves the value of the 'PNEWCTNROWID' field in the FML buffer.
     *
     * @return Value of 'PNEWCTNROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PNEWCTNROWID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[175].getValue(0));
    }

    /**
     * Sets the value of the 'PNEWCTNROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @throws FMLManipulationException
     */
    public void set_PNEWCTNROWID(String value) throws FMLManipulationException {
        this.fmlBuffer[175].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'SUBSCRIBER_NO' field in the FML buffer.
     *
     * @return Value of 'SUBSCRIBER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUBSCRIBER_NO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[176].getValue(0));
    }

    /**
     * Sets the value of the 'SUBSCRIBER_NO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @throws FMLManipulationException
     */
    public void set_SUBSCRIBER_NO(String value) throws FMLManipulationException {
        this.fmlBuffer[176].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CUSTOMER_ID' field in the FML buffer.
     *
     * @return Value of 'CUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CUSTOMER_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[177].getValue(0));
    }

    /**
     * Sets the value of the 'CUSTOMER_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CUSTOMER_ID(Integer value) throws FMLManipulationException {
        this.fmlBuffer[177].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'SYS_CREATION_DATE' field in the FML buffer.
     *
     * @return Value of 'SYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SYS_CREATION_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[178].getValue(0));
    }

    /**
     * Sets the value of the 'SYS_CREATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @throws FMLManipulationException
     */
    public void set_SYS_CREATION_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[178].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'SYS_UPDATE_DATE' field in the FML buffer.
     *
     * @return Value of 'SYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SYS_UPDATE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[179].getValue(0));
    }

    /**
     * Sets the value of the 'SYS_UPDATE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @throws FMLManipulationException
     */
    public void set_SYS_UPDATE_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[179].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PNEWCTNOPERATOR_ID' field in the FML buffer.
     *
     * @return Value of 'PNEWCTNOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PNEWCTNOPERATOR_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[180].getValue(0));
    }

    /**
     * Sets the value of the 'PNEWCTNOPERATOR_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PNEWCTNOPERATOR_ID(Integer value) throws FMLManipulationException {
        this.fmlBuffer[180].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PNEWCTNAPPLICATION_ID' field in the FML buffer.
     *
     * @return Value of 'PNEWCTNAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PNEWCTNAPPLICATION_ID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[181].getValue(0));
    }

    /**
     * Sets the value of the 'PNEWCTNAPPLICATION_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @throws FMLManipulationException
     */
    public void set_PNEWCTNAPPLICATION_ID(String value) throws FMLManipulationException {
        this.fmlBuffer[181].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'DL_SERVICE_CODE' field in the FML buffer.
     *
     * @return Value of 'DL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DL_SERVICE_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[182].getValue(0));
    }

    /**
     * Sets the value of the 'DL_SERVICE_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @throws FMLManipulationException
     */
    public void set_DL_SERVICE_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[182].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'DL_UPDATE_STAMP' field in the FML buffer.
     *
     * @return Value of 'DL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_DL_UPDATE_STAMP() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[183].getValue(0)));
    }

    /**
     * Sets the value of the 'DL_UPDATE_STAMP' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_DL_UPDATE_STAMP(Integer value) throws FMLManipulationException {
        this.fmlBuffer[183].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'PNEWCTNEFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Value of 'PNEWCTNEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PNEWCTNEFFECTIVE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[184].getValue(0));
    }

    /**
     * Sets the value of the 'PNEWCTNEFFECTIVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @throws FMLManipulationException
     */
    public void set_PNEWCTNEFFECTIVE_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[184].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'INIT_ACTIVATION_DATE' field in the FML buffer.
     *
     * @return Value of 'INIT_ACTIVATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_INIT_ACTIVATION_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[185].getValue(0));
    }

    /**
     * Sets the value of the 'INIT_ACTIVATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_INIT_ACTIVATION_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[185].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'SUB_STATUS' field in the FML buffer.
     *
     * @return Value of 'SUB_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUB_STATUS() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[186].getValue(0)));
    }

    /**
     * Sets the value of the 'SUB_STATUS' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_SUB_STATUS(String value) throws FMLManipulationException {
        this.fmlBuffer[186].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'SUB_STATUS_DATE' field in the FML buffer.
     *
     * @return Value of 'SUB_STATUS_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUB_STATUS_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[187].getValue(0));
    }

    /**
     * Sets the value of the 'SUB_STATUS_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_SUB_STATUS_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[187].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'ORIGINAL_INIT_DATE' field in the FML buffer.
     *
     * @return Value of 'ORIGINAL_INIT_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ORIGINAL_INIT_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[188].getValue(0));
    }

    /**
     * Sets the value of the 'ORIGINAL_INIT_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @throws FMLManipulationException
     */
    public void set_ORIGINAL_INIT_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[188].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'SUB_STATUS_LAST_ACT' field in the FML buffer.
     *
     * @return Value of 'SUB_STATUS_LAST_ACT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUB_STATUS_LAST_ACT() throws FMLManipulationException {
        return ((String) this.fmlBuffer[189].getValue(0));
    }

    /**
     * Sets the value of the 'SUB_STATUS_LAST_ACT' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @throws FMLManipulationException
     */
    public void set_SUB_STATUS_LAST_ACT(String value) throws FMLManipulationException {
        this.fmlBuffer[189].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'SUB_STATUS_RSN_CODE' field in the FML buffer.
     *
     * @return Value of 'SUB_STATUS_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUB_STATUS_RSN_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[190].getValue(0));
    }

    /**
     * Sets the value of the 'SUB_STATUS_RSN_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @throws FMLManipulationException
     */
    public void set_SUB_STATUS_RSN_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[190].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PNEWCTNPRODUCT_TYPE' field in the FML buffer.
     *
     * @return Value of 'PNEWCTNPRODUCT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PNEWCTNPRODUCT_TYPE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[191].getValue(0));
    }

    /**
     * Sets the value of the 'PNEWCTNPRODUCT_TYPE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @throws FMLManipulationException
     */
    public void set_PNEWCTNPRODUCT_TYPE(String value) throws FMLManipulationException {
        this.fmlBuffer[191].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CUSTOMER_BAN' field in the FML buffer.
     *
     * @return Value of 'CUSTOMER_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CUSTOMER_BAN() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[192].getValue(0));
    }

    /**
     * Sets the value of the 'CUSTOMER_BAN' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CUSTOMER_BAN(Integer value) throws FMLManipulationException {
        this.fmlBuffer[192].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CTN_SEQ_NO' field in the FML buffer.
     *
     * @return Value of 'CTN_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CTN_SEQ_NO() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[193].getValue(0));
    }

    /**
     * Sets the value of the 'CTN_SEQ_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CTN_SEQ_NO(Integer value) throws FMLManipulationException {
        this.fmlBuffer[193].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'REQ_ST_GRACE_PERIOD' field in the FML buffer.
     *
     * @return Value of 'REQ_ST_GRACE_PERIOD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_REQ_ST_GRACE_PERIOD() throws FMLManipulationException {
        return ((String) this.fmlBuffer[194].getValue(0));
    }

    /**
     * Sets the value of the 'REQ_ST_GRACE_PERIOD' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_REQ_ST_GRACE_PERIOD(String value) throws FMLManipulationException {
        this.fmlBuffer[194].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'REQ_END_GRACE_PERIOD' field in the FML buffer.
     *
     * @return Value of 'REQ_END_GRACE_PERIOD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_REQ_END_GRACE_PERIOD() throws FMLManipulationException {
        return ((String) this.fmlBuffer[195].getValue(0));
    }

    /**
     * Sets the value of the 'REQ_END_GRACE_PERIOD' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_REQ_END_GRACE_PERIOD(String value) throws FMLManipulationException {
        this.fmlBuffer[195].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'COMMIT_START_DATE' field in the FML buffer.
     *
     * @return Value of 'COMMIT_START_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COMMIT_START_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[196].getValue(0));
    }

    /**
     * Sets the value of the 'COMMIT_START_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_COMMIT_START_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[196].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'COMMIT_END_DATE' field in the FML buffer.
     *
     * @return Value of 'COMMIT_END_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COMMIT_END_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[197].getValue(0));
    }

    /**
     * Sets the value of the 'COMMIT_END_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_COMMIT_END_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[197].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'COMMIT_REASON_CODE' field in the FML buffer.
     *
     * @return Value of 'COMMIT_REASON_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COMMIT_REASON_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[198].getValue(0));
    }

    /**
     * Sets the value of the 'COMMIT_REASON_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @throws FMLManipulationException
     */
    public void set_COMMIT_REASON_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[198].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PNEWCTNCOMMIT_ORIG_NO_MONTH' field in the FML buffer.
     *
     * @return Value of 'PNEWCTNCOMMIT_ORIG_NO_MONTH' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PNEWCTNCOMMIT_ORIG_NO_MONTH() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[199].getValue(0)));
    }

    /**
     * Sets the value of the 'PNEWCTNCOMMIT_ORIG_NO_MONTH' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PNEWCTNCOMMIT_ORIG_NO_MONTH(Integer value) throws FMLManipulationException {
        this.fmlBuffer[199].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'PNEWCTNSUSP_RC_RATE_TYPE' field in the FML buffer.
     *
     * @return Value of 'PNEWCTNSUSP_RC_RATE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PNEWCTNSUSP_RC_RATE_TYPE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[200].getValue(0)));
    }

    /**
     * Sets the value of the 'PNEWCTNSUSP_RC_RATE_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PNEWCTNSUSP_RC_RATE_TYPE(String value) throws FMLManipulationException {
        this.fmlBuffer[200].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'CONTRACT_NO' field in the FML buffer.
     *
     * @return Value of 'CONTRACT_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CONTRACT_NO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[201].getValue(0));
    }

    /**
     * Sets the value of the 'CONTRACT_NO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 11.
     * @throws FMLManipulationException
     */
    public void set_CONTRACT_NO(String value) throws FMLManipulationException {
        this.fmlBuffer[201].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CNT_SEQ_NO' field in the FML buffer.
     *
     * @return Value of 'CNT_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CNT_SEQ_NO() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[202].getValue(0));
    }

    /**
     * Sets the value of the 'CNT_SEQ_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CNT_SEQ_NO(Integer value) throws FMLManipulationException {
        this.fmlBuffer[202].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PNEWCTNDEALER_CODE' field in the FML buffer.
     *
     * @return Value of 'PNEWCTNDEALER_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PNEWCTNDEALER_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[203].getValue(0));
    }

    /**
     * Sets the value of the 'PNEWCTNDEALER_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @throws FMLManipulationException
     */
    public void set_PNEWCTNDEALER_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[203].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'ORG_DEALER_CODE' field in the FML buffer.
     *
     * @return Value of 'ORG_DEALER_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ORG_DEALER_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[204].getValue(0));
    }

    /**
     * Sets the value of the 'ORG_DEALER_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @throws FMLManipulationException
     */
    public void set_ORG_DEALER_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[204].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PNEWCTNSALES_AGENT' field in the FML buffer.
     *
     * @return Value of 'PNEWCTNSALES_AGENT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PNEWCTNSALES_AGENT() throws FMLManipulationException {
        return ((String) this.fmlBuffer[205].getValue(0));
    }

    /**
     * Sets the value of the 'PNEWCTNSALES_AGENT' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @throws FMLManipulationException
     */
    public void set_PNEWCTNSALES_AGENT(String value) throws FMLManipulationException {
        this.fmlBuffer[205].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'ORG_SALES_AGENT' field in the FML buffer.
     *
     * @return Value of 'ORG_SALES_AGENT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ORG_SALES_AGENT() throws FMLManipulationException {
        return ((String) this.fmlBuffer[206].getValue(0));
    }

    /**
     * Sets the value of the 'ORG_SALES_AGENT' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @throws FMLManipulationException
     */
    public void set_ORG_SALES_AGENT(String value) throws FMLManipulationException {
        this.fmlBuffer[206].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'REQ_DEPOSIT_AMT' field in the FML buffer.
     *
     * @return Value of 'REQ_DEPOSIT_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_REQ_DEPOSIT_AMT() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[207].getValue(0));
    }

    /**
     * Sets the value of the 'REQ_DEPOSIT_AMT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_REQ_DEPOSIT_AMT(Double value) throws FMLManipulationException {
        this.fmlBuffer[207].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'LEADING_NUMBER' field in the FML buffer.
     *
     * @return Value of 'LEADING_NUMBER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LEADING_NUMBER() throws FMLManipulationException {
        return ((String) this.fmlBuffer[208].getValue(0));
    }

    /**
     * Sets the value of the 'LEADING_NUMBER' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @throws FMLManipulationException
     */
    public void set_LEADING_NUMBER(String value) throws FMLManipulationException {
        this.fmlBuffer[208].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PABX_IND' field in the FML buffer.
     *
     * @return Value of 'PABX_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PABX_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[209].getValue(0)));
    }

    /**
     * Sets the value of the 'PABX_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PABX_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[209].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'NEXT_CTN' field in the FML buffer.
     *
     * @return Value of 'NEXT_CTN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NEXT_CTN() throws FMLManipulationException {
        return ((String) this.fmlBuffer[210].getValue(0));
    }

    /**
     * Sets the value of the 'NEXT_CTN' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @throws FMLManipulationException
     */
    public void set_NEXT_CTN(String value) throws FMLManipulationException {
        this.fmlBuffer[210].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'NEXT_CTN_CHG_DATE' field in the FML buffer.
     *
     * @return Value of 'NEXT_CTN_CHG_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NEXT_CTN_CHG_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[211].getValue(0));
    }

    /**
     * Sets the value of the 'NEXT_CTN_CHG_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_NEXT_CTN_CHG_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[211].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PRV_CTN' field in the FML buffer.
     *
     * @return Value of 'PRV_CTN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PRV_CTN() throws FMLManipulationException {
        return ((String) this.fmlBuffer[212].getValue(0));
    }

    /**
     * Sets the value of the 'PRV_CTN' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @throws FMLManipulationException
     */
    public void set_PRV_CTN(String value) throws FMLManipulationException {
        this.fmlBuffer[212].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PRV_CTN_CHG_DATE' field in the FML buffer.
     *
     * @return Value of 'PRV_CTN_CHG_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PRV_CTN_CHG_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[213].getValue(0));
    }

    /**
     * Sets the value of the 'PRV_CTN_CHG_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_PRV_CTN_CHG_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[213].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'NEXT_BAN' field in the FML buffer.
     *
     * @return Value of 'NEXT_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NEXT_BAN() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[214].getValue(0));
    }

    /**
     * Sets the value of the 'NEXT_BAN' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_NEXT_BAN(Integer value) throws FMLManipulationException {
        this.fmlBuffer[214].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'NEXT_BAN_MOVE_DATE' field in the FML buffer.
     *
     * @return Value of 'NEXT_BAN_MOVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NEXT_BAN_MOVE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[215].getValue(0));
    }

    /**
     * Sets the value of the 'NEXT_BAN_MOVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_NEXT_BAN_MOVE_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[215].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PRV_BAN' field in the FML buffer.
     *
     * @return Value of 'PRV_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PRV_BAN() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[216].getValue(0));
    }

    /**
     * Sets the value of the 'PRV_BAN' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PRV_BAN(Integer value) throws FMLManipulationException {
        this.fmlBuffer[216].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PRV_BAN_MOVE_DATE' field in the FML buffer.
     *
     * @return Value of 'PRV_BAN_MOVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PRV_BAN_MOVE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[217].getValue(0));
    }

    /**
     * Sets the value of the 'PRV_BAN_MOVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_PRV_BAN_MOVE_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[217].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'SUB_STS_ISSUE_DATE' field in the FML buffer.
     *
     * @return Value of 'SUB_STS_ISSUE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUB_STS_ISSUE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[218].getValue(0));
    }

    /**
     * Sets the value of the 'SUB_STS_ISSUE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_SUB_STS_ISSUE_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[218].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'ACTIVATE_WAIVE_RSN' field in the FML buffer.
     *
     * @return Value of 'ACTIVATE_WAIVE_RSN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACTIVATE_WAIVE_RSN() throws FMLManipulationException {
        return ((String) this.fmlBuffer[219].getValue(0));
    }

    /**
     * Sets the value of the 'ACTIVATE_WAIVE_RSN' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @throws FMLManipulationException
     */
    public void set_ACTIVATE_WAIVE_RSN(String value) throws FMLManipulationException {
        this.fmlBuffer[219].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'EARLIEST_ACTV_DATE' field in the FML buffer.
     *
     * @return Value of 'EARLIEST_ACTV_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EARLIEST_ACTV_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[220].getValue(0));
    }

    /**
     * Sets the value of the 'EARLIEST_ACTV_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_EARLIEST_ACTV_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[220].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'SUB_ACTV_LOCATION' field in the FML buffer.
     *
     * @return Value of 'SUB_ACTV_LOCATION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUB_ACTV_LOCATION() throws FMLManipulationException {
        return ((String) this.fmlBuffer[221].getValue(0));
    }

    /**
     * Sets the value of the 'SUB_ACTV_LOCATION' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @throws FMLManipulationException
     */
    public void set_SUB_ACTV_LOCATION(String value) throws FMLManipulationException {
        this.fmlBuffer[221].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CUST_WATCH_LMT' field in the FML buffer.
     *
     * @return Value of 'CUST_WATCH_LMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_CUST_WATCH_LMT() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[222].getValue(0));
    }

    /**
     * Sets the value of the 'CUST_WATCH_LMT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CUST_WATCH_LMT(Double value) throws FMLManipulationException {
        this.fmlBuffer[222].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CUST_WATCH_DATE' field in the FML buffer.
     *
     * @return Value of 'CUST_WATCH_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CUST_WATCH_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[223].getValue(0));
    }

    /**
     * Sets the value of the 'CUST_WATCH_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_CUST_WATCH_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[223].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'BASIC_WATCH_LMT' field in the FML buffer.
     *
     * @return Value of 'BASIC_WATCH_LMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_BASIC_WATCH_LMT() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[224].getValue(0));
    }

    /**
     * Sets the value of the 'BASIC_WATCH_LMT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_BASIC_WATCH_LMT(Double value) throws FMLManipulationException {
        this.fmlBuffer[224].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CREDIT_WATCH_PIN_CD' field in the FML buffer.
     *
     * @return Value of 'CREDIT_WATCH_PIN_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CREDIT_WATCH_PIN_CD() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[225].getValue(0)));
    }

    /**
     * Sets the value of the 'CREDIT_WATCH_PIN_CD' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CREDIT_WATCH_PIN_CD(Integer value) throws FMLManipulationException {
        this.fmlBuffer[225].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'SUB_MARKET_CODE' field in the FML buffer.
     *
     * @return Value of 'SUB_MARKET_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUB_MARKET_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[226].getValue(0));
    }

    /**
     * Sets the value of the 'SUB_MARKET_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @throws FMLManipulationException
     */
    public void set_SUB_MARKET_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[226].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'LIMIT_RESERVED_DAYS' field in the FML buffer.
     *
     * @return Value of 'LIMIT_RESERVED_DAYS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LIMIT_RESERVED_DAYS() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[227].getValue(0)));
    }

    /**
     * Sets the value of the 'LIMIT_RESERVED_DAYS' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_LIMIT_RESERVED_DAYS(Integer value) throws FMLManipulationException {
        this.fmlBuffer[227].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'FF_EXPIRATION_DATE' field in the FML buffer.
     *
     * @return Value of 'FF_EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FF_EXPIRATION_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[228].getValue(0));
    }

    /**
     * Sets the value of the 'FF_EXPIRATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @throws FMLManipulationException
     */
    public void set_FF_EXPIRATION_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[228].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'FLEX_IND' field in the FML buffer.
     *
     * @return Value of 'FLEX_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FLEX_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[229].getValue(0)));
    }

    /**
     * Sets the value of the 'FLEX_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_FLEX_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[229].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'DUO_IND' field in the FML buffer.
     *
     * @return Value of 'DUO_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DUO_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[230].getValue(0)));
    }

    /**
     * Sets the value of the 'DUO_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_DUO_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[230].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'LISTED_IND' field in the FML buffer.
     *
     * @return Value of 'LISTED_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LISTED_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[231].getValue(0)));
    }

    /**
     * Sets the value of the 'LISTED_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_LISTED_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[231].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'SUB_DEPARTMENT_CD' field in the FML buffer.
     *
     * @return Value of 'SUB_DEPARTMENT_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUB_DEPARTMENT_CD() throws FMLManipulationException {
        return ((String) this.fmlBuffer[232].getValue(0));
    }

    /**
     * Sets the value of the 'SUB_DEPARTMENT_CD' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @throws FMLManipulationException
     */
    public void set_SUB_DEPARTMENT_CD(String value) throws FMLManipulationException {
        this.fmlBuffer[232].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'LAST_SUBS_DISC_DT' field in the FML buffer.
     *
     * @return Value of 'LAST_SUBS_DISC_DT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LAST_SUBS_DISC_DT() throws FMLManipulationException {
        return ((String) this.fmlBuffer[233].getValue(0));
    }

    /**
     * Sets the value of the 'LAST_SUBS_DISC_DT' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_LAST_SUBS_DISC_DT(String value) throws FMLManipulationException {
        this.fmlBuffer[233].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'LAST_SUBS_DISC_DT_UD' field in the FML buffer.
     *
     * @return Value of 'LAST_SUBS_DISC_DT_UD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LAST_SUBS_DISC_DT_UD() throws FMLManipulationException {
        return ((String) this.fmlBuffer[234].getValue(0));
    }

    /**
     * Sets the value of the 'LAST_SUBS_DISC_DT_UD' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_LAST_SUBS_DISC_DT_UD(String value) throws FMLManipulationException {
        this.fmlBuffer[234].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'LAST_SUBSCR_DISC_SN' field in the FML buffer.
     *
     * @return Value of 'LAST_SUBSCR_DISC_SN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LAST_SUBSCR_DISC_SN() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[235].getValue(0)));
    }

    /**
     * Sets the value of the 'LAST_SUBSCR_DISC_SN' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_LAST_SUBSCR_DISC_SN(Integer value) throws FMLManipulationException {
        this.fmlBuffer[235].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'LAST_SUBSCR_DISC_SN_UD' field in the FML buffer.
     *
     * @return Value of 'LAST_SUBSCR_DISC_SN_UD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LAST_SUBSCR_DISC_SN_UD() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[236].getValue(0)));
    }

    /**
     * Sets the value of the 'LAST_SUBSCR_DISC_SN_UD' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_LAST_SUBSCR_DISC_SN_UD(Integer value) throws FMLManipulationException {
        this.fmlBuffer[236].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'PNI' field in the FML buffer.
     *
     * @return Value of 'PNI' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PNI() throws FMLManipulationException {
        return ((String) this.fmlBuffer[237].getValue(0));
    }

    /**
     * Sets the value of the 'PNI' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 11.
     * @throws FMLManipulationException
     */
    public void set_PNI(String value) throws FMLManipulationException {
        this.fmlBuffer[237].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'RMS_REF_STORE_ID' field in the FML buffer.
     *
     * @return Value of 'RMS_REF_STORE_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_RMS_REF_STORE_ID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[238].getValue(0));
    }

    /**
     * Sets the value of the 'RMS_REF_STORE_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @throws FMLManipulationException
     */
    public void set_RMS_REF_STORE_ID(String value) throws FMLManipulationException {
        this.fmlBuffer[238].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'RMS_REF_TYPE' field in the FML buffer.
     *
     * @return Value of 'RMS_REF_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_RMS_REF_TYPE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[239].getValue(0)));
    }

    /**
     * Sets the value of the 'RMS_REF_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_RMS_REF_TYPE(String value) throws FMLManipulationException {
        this.fmlBuffer[239].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'RMS_REF_OD' field in the FML buffer.
     *
     * @return Value of 'RMS_REF_OD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_RMS_REF_OD() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[240].getValue(0));
    }

    /**
     * Sets the value of the 'RMS_REF_OD' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_RMS_REF_OD(Integer value) throws FMLManipulationException {
        this.fmlBuffer[240].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'DLR_ACT_FEE' field in the FML buffer.
     *
     * @return Value of 'DLR_ACT_FEE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_DLR_ACT_FEE() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[241].getValue(0));
    }

    /**
     * Sets the value of the 'DLR_ACT_FEE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_DLR_ACT_FEE(Double value) throws FMLManipulationException {
        this.fmlBuffer[241].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PREP_AMOUNT' field in the FML buffer.
     *
     * @return Value of 'PREP_AMOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_PREP_AMOUNT() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[242].getValue(0));
    }

    /**
     * Sets the value of the 'PREP_AMOUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PREP_AMOUNT(Double value) throws FMLManipulationException {
        this.fmlBuffer[242].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'SUBSCRIBER_ID' field in the FML buffer.
     *
     * @return Value of 'SUBSCRIBER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_SUBSCRIBER_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[243].getValue(0));
    }

    /**
     * Sets the value of the 'SUBSCRIBER_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_SUBSCRIBER_ID(Integer value) throws FMLManipulationException {
        this.fmlBuffer[243].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'SUB_LANG' field in the FML buffer.
     *
     * @return Value of 'SUB_LANG' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUB_LANG() throws FMLManipulationException {
        return ((String) this.fmlBuffer[244].getValue(0));
    }

    /**
     * Sets the value of the 'SUB_LANG' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 3.
     * @throws FMLManipulationException
     */
    public void set_SUB_LANG(String value) throws FMLManipulationException {
        this.fmlBuffer[244].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'SMS_RCV_STYLE_CODE' field in the FML buffer.
     *
     * @return Value of 'SMS_RCV_STYLE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SMS_RCV_STYLE_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[245].getValue(0));
    }

    /**
     * Sets the value of the 'SMS_RCV_STYLE_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 3.
     * @throws FMLManipulationException
     */
    public void set_SMS_RCV_STYLE_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[245].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CONV_RUN_NO' field in the FML buffer.
     *
     * @return Value of 'CONV_RUN_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CONV_RUN_NO() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[246].getValue(0)));
    }

    /**
     * Sets the value of the 'CONV_RUN_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CONV_RUN_NO(Integer value) throws FMLManipulationException {
        this.fmlBuffer[246].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'ALLOW_ADVERTISING_IND' field in the FML buffer.
     *
     * @return Value of 'ALLOW_ADVERTISING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ALLOW_ADVERTISING_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[247].getValue(0)));
    }

    /**
     * Sets the value of the 'ALLOW_ADVERTISING_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_ALLOW_ADVERTISING_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[247].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'IVR_WRONG_ACCESS_NO' field in the FML buffer.
     *
     * @return Value of 'IVR_WRONG_ACCESS_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_IVR_WRONG_ACCESS_NO() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[248].getValue(0)));
    }

    /**
     * Sets the value of the 'IVR_WRONG_ACCESS_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_IVR_WRONG_ACCESS_NO(Integer value) throws FMLManipulationException {
        this.fmlBuffer[248].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'THRESHOLD_AMT' field in the FML buffer.
     *
     * @return Value of 'THRESHOLD_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_THRESHOLD_AMT() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[249].getValue(0));
    }

    /**
     * Sets the value of the 'THRESHOLD_AMT' field in the FML buffer.
     *
     * @param value Default value: 999999999.99.
     * @throws FMLManipulationException
     */
    public void set_THRESHOLD_AMT(Double value) throws FMLManipulationException {
        this.fmlBuffer[249].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PUBLISH_LEVEL' field in the FML buffer.
     *
     * @return Value of 'PUBLISH_LEVEL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PUBLISH_LEVEL() throws FMLManipulationException {
        return ((String) this.fmlBuffer[250].getValue(0));
    }

    /**
     * Sets the value of the 'PUBLISH_LEVEL' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 31.
     * @throws FMLManipulationException
     */
    public void set_PUBLISH_LEVEL(String value) throws FMLManipulationException {
        this.fmlBuffer[250].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'AUTO_RELEASE_IND' field in the FML buffer.
     *
     * @return Value of 'AUTO_RELEASE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_AUTO_RELEASE_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[251].getValue(0)));
    }

    /**
     * Sets the value of the 'AUTO_RELEASE_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_AUTO_RELEASE_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[251].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'CUST_WATCH_EFF_DATE' field in the FML buffer.
     *
     * @return Value of 'CUST_WATCH_EFF_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CUST_WATCH_EFF_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[252].getValue(0));
    }

    /**
     * Sets the value of the 'CUST_WATCH_EFF_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_CUST_WATCH_EFF_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[252].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'CUST_WATCH_EXP_DATE' field in the FML buffer.
     *
     * @return Value of 'CUST_WATCH_EXP_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CUST_WATCH_EXP_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[253].getValue(0));
    }

    /**
     * Sets the value of the 'CUST_WATCH_EXP_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_CUST_WATCH_EXP_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[253].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'OPERATOR_CW_LMT' field in the FML buffer.
     *
     * @return Value of 'OPERATOR_CW_LMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_OPERATOR_CW_LMT() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[254].getValue(0));
    }

    /**
     * Sets the value of the 'OPERATOR_CW_LMT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_OPERATOR_CW_LMT(Double value) throws FMLManipulationException {
        this.fmlBuffer[254].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'SEND_SMS_FOR_MATCH' field in the FML buffer.
     *
     * @return Value of 'SEND_SMS_FOR_MATCH' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SEND_SMS_FOR_MATCH() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[255].getValue(0)));
    }

    /**
     * Sets the value of the 'SEND_SMS_FOR_MATCH' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_SEND_SMS_FOR_MATCH(String value) throws FMLManipulationException {
        this.fmlBuffer[255].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'CPS_STATUS' field in the FML buffer.
     *
     * @return Value of 'CPS_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CPS_STATUS() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[256].getValue(0)));
    }

    /**
     * Sets the value of the 'CPS_STATUS' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CPS_STATUS(String value) throws FMLManipulationException {
        this.fmlBuffer[256].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'CPS_TRANSACTION' field in the FML buffer.
     *
     * @return Value of 'CPS_TRANSACTION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CPS_TRANSACTION() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[257].getValue(0)));
    }

    /**
     * Sets the value of the 'CPS_TRANSACTION' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CPS_TRANSACTION(Integer value) throws FMLManipulationException {
        this.fmlBuffer[257].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'CPS_TYPE' field in the FML buffer.
     *
     * @return Value of 'CPS_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CPS_TYPE() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[258].getValue(0)));
    }

    /**
     * Sets the value of the 'CPS_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_CPS_TYPE(Integer value) throws FMLManipulationException {
        this.fmlBuffer[258].setValue(0, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves the value of the 'ISP_PASS' field in the FML buffer.
     *
     * @return Value of 'ISP_PASS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ISP_PASS() throws FMLManipulationException {
        return ((String) this.fmlBuffer[259].getValue(0));
    }

    /**
     * Sets the value of the 'ISP_PASS' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 31.
     * @throws FMLManipulationException
     */
    public void set_ISP_PASS(String value) throws FMLManipulationException {
        this.fmlBuffer[259].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'ISP_TYPE' field in the FML buffer.
     *
     * @return Value of 'ISP_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ISP_TYPE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[260].getValue(0));
    }

    /**
     * Sets the value of the 'ISP_TYPE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 3.
     * @throws FMLManipulationException
     */
    public void set_ISP_TYPE(String value) throws FMLManipulationException {
        this.fmlBuffer[260].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'OPERATOR_TMP_DATE' field in the FML buffer.
     *
     * @return Value of 'OPERATOR_TMP_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_OPERATOR_TMP_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[261].getValue(0));
    }

    /**
     * Sets the value of the 'OPERATOR_TMP_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_OPERATOR_TMP_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[261].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'OPERATOR_TMP_LMT' field in the FML buffer.
     *
     * @return Value of 'OPERATOR_TMP_LMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_OPERATOR_TMP_LMT() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[262].getValue(0));
    }

    /**
     * Sets the value of the 'OPERATOR_TMP_LMT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_OPERATOR_TMP_LMT(Double value) throws FMLManipulationException {
        this.fmlBuffer[262].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'SUB_ORG_CD' field in the FML buffer.
     *
     * @return Value of 'SUB_ORG_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUB_ORG_CD() throws FMLManipulationException {
        return ((String) this.fmlBuffer[263].getValue(0));
    }

    /**
     * Sets the value of the 'SUB_ORG_CD' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 11.
     * @throws FMLManipulationException
     */
    public void set_SUB_ORG_CD(String value) throws FMLManipulationException {
        this.fmlBuffer[263].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'ORG_MEMBER_NO' field in the FML buffer.
     *
     * @return Value of 'ORG_MEMBER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ORG_MEMBER_NO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[264].getValue(0));
    }

    /**
     * Sets the value of the 'ORG_MEMBER_NO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @throws FMLManipulationException
     */
    public void set_ORG_MEMBER_NO(String value) throws FMLManipulationException {
        this.fmlBuffer[264].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'FULLTABLE' field in the FML buffer.
     *
     * @return Value of 'FULLTABLE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FULLTABLE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[265].getValue(0)));
    }

    /**
     * Sets the value of the 'FULLTABLE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_FULLTABLE(String value) throws FMLManipulationException {
        this.fmlBuffer[265].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'PAPER_WORK_STATUS' field in the FML buffer.
     *
     * @return Value of 'PAPER_WORK_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAPER_WORK_STATUS() throws FMLManipulationException {
        return ((String) this.fmlBuffer[266].getValue(0));
    }

    /**
     * Sets the value of the 'PAPER_WORK_STATUS' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 3.
     * @throws FMLManipulationException
     */
    public void set_PAPER_WORK_STATUS(String value) throws FMLManipulationException {
        this.fmlBuffer[266].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PAPER_WORK_REQUIRED' field in the FML buffer.
     *
     * @return Value of 'PAPER_WORK_REQUIRED' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAPER_WORK_REQUIRED() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[267].getValue(0)));
    }

    /**
     * Sets the value of the 'PAPER_WORK_REQUIRED' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PAPER_WORK_REQUIRED(String value) throws FMLManipulationException {
        this.fmlBuffer[267].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'PAPER_WORK_DATE' field in the FML buffer.
     *
     * @return Value of 'PAPER_WORK_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAPER_WORK_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[268].getValue(0));
    }

    /**
     * Sets the value of the 'PAPER_WORK_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_PAPER_WORK_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[268].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PAPER_WORK_REF_NO' field in the FML buffer.
     *
     * @return Value of 'PAPER_WORK_REF_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAPER_WORK_REF_NO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[269].getValue(0));
    }

    /**
     * Sets the value of the 'PAPER_WORK_REF_NO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 12.
     * @throws FMLManipulationException
     */
    public void set_PAPER_WORK_REF_NO(String value) throws FMLManipulationException {
        this.fmlBuffer[269].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PAPER_WORK_TRNS_NO' field in the FML buffer.
     *
     * @return Value of 'PAPER_WORK_TRNS_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PAPER_WORK_TRNS_NO() throws FMLManipulationException {
        return ((String) this.fmlBuffer[270].getValue(0));
    }

    /**
     * Sets the value of the 'PAPER_WORK_TRNS_NO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 26.
     * @throws FMLManipulationException
     */
    public void set_PAPER_WORK_TRNS_NO(String value) throws FMLManipulationException {
        this.fmlBuffer[270].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'DELIVERY_TYPE' field in the FML buffer.
     *
     * @return Value of 'DELIVERY_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DELIVERY_TYPE() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[271].getValue(0)));
    }

    /**
     * Sets the value of the 'DELIVERY_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_DELIVERY_TYPE(String value) throws FMLManipulationException {
        this.fmlBuffer[271].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'PNAMEADRBUFROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'PNAMEADRBUFROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PNAMEADRBUFROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[272].getValue(0));
    }

    /**
     * Sets the value of the 'PNAMEADRBUFROWCOUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PNAMEADRBUFROWCOUNT(Integer value) throws FMLManipulationException {
        this.fmlBuffer[272].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'LINK_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LINK_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[273].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'LINK_MODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_LINK_MODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[273].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'LINK_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[273].getCount());
    }

    /**
     * Retrieves the value of the 'LINK_BAN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LINK_BAN(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[274].getValue(nIndex));
    }

    /**
     * Sets the value of the 'LINK_BAN' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_LINK_BAN(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[274].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'LINK_BAN' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_BAN_size() throws FMLManipulationException {
        return (this.fmlBuffer[274].getCount());
    }

    /**
     * Retrieves the value of the 'LINK_SUBSCRIBER' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_SUBSCRIBER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LINK_SUBSCRIBER(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[275].getValue(nIndex));
    }

    /**
     * Sets the value of the 'LINK_SUBSCRIBER' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_LINK_SUBSCRIBER(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[275].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'LINK_SUBSCRIBER' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_SUBSCRIBER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_SUBSCRIBER_size() throws FMLManipulationException {
        return (this.fmlBuffer[275].getCount());
    }

    /**
     * Retrieves the value of the 'LINK_ROW_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_ROW_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LINK_ROW_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[276].getValue(nIndex));
    }

    /**
     * Sets the value of the 'LINK_ROW_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_LINK_ROW_ID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[276].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'LINK_ROW_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_ROW_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_ROW_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[276].getCount());
    }

    /**
     * Retrieves the value of the 'LINK_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LINK_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[277].getValue(nIndex));
    }

    /**
     * Sets the value of the 'LINK_SEQ_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_LINK_SEQ_NO(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[277].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'LINK_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[277].getCount());
    }

    /**
     * Retrieves the value of the 'LNKRECCUSTOMER_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LNKRECCUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LNKRECCUSTOMER_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[278].getValue(nIndex));
    }

    /**
     * Sets the value of the 'LNKRECCUSTOMER_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_LNKRECCUSTOMER_ID(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[278].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'LNKRECCUSTOMER_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'LNKRECCUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LNKRECCUSTOMER_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[278].getCount());
    }

    /**
     * Retrieves the value of the 'BAN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BAN(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[279].getValue(nIndex));
    }

    /**
     * Sets the value of the 'BAN' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_BAN(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[279].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'BAN' field in the FML buffer.
     *
     * @return Number of values defined for 'BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_BAN_size() throws FMLManipulationException {
        return (this.fmlBuffer[279].getCount());
    }

    /**
     * Retrieves the value of the 'LNKRECSUBSCRIBER_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LNKRECSUBSCRIBER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LNKRECSUBSCRIBER_NO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[280].getValue(nIndex));
    }

    /**
     * Sets the value of the 'LNKRECSUBSCRIBER_NO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_LNKRECSUBSCRIBER_NO(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[280].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'LNKRECSUBSCRIBER_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'LNKRECSUBSCRIBER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LNKRECSUBSCRIBER_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[280].getCount());
    }

    /**
     * Retrieves the value of the 'LINK_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LINK_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[281].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'LINK_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_LINK_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[281].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'LINK_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[281].getCount());
    }

    /**
     * Retrieves the value of the 'LNKRECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LNKRECEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LNKRECEFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[282].getValue(nIndex));
    }

    /**
     * Sets the value of the 'LNKRECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_LNKRECEFFECTIVE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[282].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'LNKRECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'LNKRECEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LNKRECEFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[282].getCount());
    }

    /**
     * Retrieves the value of the 'FOREIGN_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'FOREIGN_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_FOREIGN_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[283].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FOREIGN_SEQ_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_FOREIGN_SEQ_NO(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[283].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FOREIGN_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'FOREIGN_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FOREIGN_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[283].getCount());
    }

    /**
     * Retrieves the value of the 'BILLING_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'BILLING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BILLING_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[284].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'BILLING_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_BILLING_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[284].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'BILLING_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'BILLING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_BILLING_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[284].getCount());
    }

    /**
     * Retrieves the value of the 'MAILING_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'MAILING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MAILING_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[285].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'MAILING_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_MAILING_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[285].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'MAILING_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'MAILING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MAILING_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[285].getCount());
    }

    /**
     * Retrieves the value of the 'USER_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'USER_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_USER_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[286].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'USER_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_USER_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[286].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'USER_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'USER_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_USER_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[286].getCount());
    }

    /**
     * Retrieves the value of the 'LINK_BILLING_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_BILLING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LINK_BILLING_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[287].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'LINK_BILLING_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_LINK_BILLING_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[287].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'LINK_BILLING_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_BILLING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_BILLING_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[287].getCount());
    }

    /**
     * Retrieves the value of the 'LINK_MAILING_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_MAILING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LINK_MAILING_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[288].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'LINK_MAILING_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_LINK_MAILING_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[288].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'LINK_MAILING_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_MAILING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_MAILING_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[288].getCount());
    }

    /**
     * Retrieves the value of the 'LINK_USER_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_USER_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LINK_USER_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[289].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'LINK_USER_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_LINK_USER_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[289].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'LINK_USER_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_USER_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_USER_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[289].getCount());
    }

    /**
     * Retrieves the value of the 'NM_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NM_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NM_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[290].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'NM_MODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_NM_MODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[290].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'NM_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'NM_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NM_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[290].getCount());
    }

    /**
     * Retrieves the value of the 'NM_UP_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NM_UP_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NM_UP_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[291].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'NM_UP_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_NM_UP_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[291].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'NM_UP_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'NM_UP_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NM_UP_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[291].getCount());
    }

    /**
     * Retrieves the value of the 'NM_EXPIRE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NM_EXPIRE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NM_EXPIRE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[292].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NM_EXPIRE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_NM_EXPIRE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[292].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NM_EXPIRE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'NM_EXPIRE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NM_EXPIRE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[292].getCount());
    }

    /**
     * Retrieves the value of the 'NAMERECROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAMERECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NAMERECROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[293].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NAMERECROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_NAMERECROWID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[293].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NAMERECROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'NAMERECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAMERECROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[293].getCount());
    }

    /**
     * Retrieves the value of the 'NAME_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAME_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NAME_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[294].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NAME_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_NAME_ID(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[294].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NAME_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'NAME_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAME_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[294].getCount());
    }

    /**
     * Retrieves the value of the 'NAMERECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAMERECSYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NAMERECSYS_CREATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[295].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NAMERECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_NAMERECSYS_CREATION_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[295].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NAMERECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'NAMERECSYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAMERECSYS_CREATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[295].getCount());
    }

    /**
     * Retrieves the value of the 'NAMERECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAMERECSYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NAMERECSYS_UPDATE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[296].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NAMERECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_NAMERECSYS_UPDATE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[296].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NAMERECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'NAMERECSYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAMERECSYS_UPDATE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[296].getCount());
    }

    /**
     * Retrieves the value of the 'NAMERECOPERATOR_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAMERECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NAMERECOPERATOR_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[297].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NAMERECOPERATOR_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_NAMERECOPERATOR_ID(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[297].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NAMERECOPERATOR_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'NAMERECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAMERECOPERATOR_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[297].getCount());
    }

    /**
     * Retrieves the value of the 'NAMERECAPPLICATION_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAMERECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NAMERECAPPLICATION_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[298].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NAMERECAPPLICATION_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_NAMERECAPPLICATION_ID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[298].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NAMERECAPPLICATION_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'NAMERECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAMERECAPPLICATION_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[298].getCount());
    }

    /**
     * Retrieves the value of the 'NAMERECDL_SERVICE_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAMERECDL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NAMERECDL_SERVICE_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[299].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NAMERECDL_SERVICE_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_NAMERECDL_SERVICE_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[299].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NAMERECDL_SERVICE_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'NAMERECDL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAMERECDL_SERVICE_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[299].getCount());
    }

    /**
     * Retrieves the value of the 'NAMERECDL_UPDATE_STAMP' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAMERECDL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NAMERECDL_UPDATE_STAMP(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[300].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'NAMERECDL_UPDATE_STAMP' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_NAMERECDL_UPDATE_STAMP(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[300].setValue(nIndex, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves number of values defined for 'NAMERECDL_UPDATE_STAMP' field in the FML buffer.
     *
     * @return Number of values defined for 'NAMERECDL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAMERECDL_UPDATE_STAMP_size() throws FMLManipulationException {
        return (this.fmlBuffer[300].getCount());
    }

    /**
     * Retrieves the value of the 'CONTROL_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'CONTROL_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CONTROL_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[301].getValue(nIndex));
    }

    /**
     * Sets the value of the 'CONTROL_NAME' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 41.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_CONTROL_NAME(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[301].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'CONTROL_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'CONTROL_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CONTROL_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[301].getCount());
    }

    /**
     * Retrieves the value of the 'LAST_BUSINESS_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LAST_BUSINESS_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LAST_BUSINESS_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[302].getValue(nIndex));
    }

    /**
     * Sets the value of the 'LAST_BUSINESS_NAME' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_LAST_BUSINESS_NAME(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[302].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'LAST_BUSINESS_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'LAST_BUSINESS_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LAST_BUSINESS_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[302].getCount());
    }

    /**
     * Retrieves the value of the 'FIRST_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'FIRST_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FIRST_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[303].getValue(nIndex));
    }

    /**
     * Sets the value of the 'FIRST_NAME' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 33.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_FIRST_NAME(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[303].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'FIRST_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'FIRST_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FIRST_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[303].getCount());
    }

    /**
     * Retrieves the value of the 'ADDITIONAL_TITLE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDITIONAL_TITLE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADDITIONAL_TITLE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[304].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADDITIONAL_TITLE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADDITIONAL_TITLE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[304].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADDITIONAL_TITLE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDITIONAL_TITLE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDITIONAL_TITLE_size() throws FMLManipulationException {
        return (this.fmlBuffer[304].getCount());
    }

    /**
     * Retrieves the value of the 'NAME_FORMAT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAME_FORMAT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NAME_FORMAT(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[305].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'NAME_FORMAT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_NAME_FORMAT(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[305].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'NAME_FORMAT' field in the FML buffer.
     *
     * @return Number of values defined for 'NAME_FORMAT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAME_FORMAT_size() throws FMLManipulationException {
        return (this.fmlBuffer[305].getCount());
    }

    /**
     * Retrieves the value of the 'BIRTH_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'BIRTH_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BIRTH_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[306].getValue(nIndex));
    }

    /**
     * Sets the value of the 'BIRTH_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_BIRTH_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[306].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'BIRTH_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'BIRTH_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_BIRTH_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[306].getCount());
    }

    /**
     * Retrieves the value of the 'IDENTIFY' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'IDENTIFY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_IDENTIFY(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[307].getValue(nIndex));
    }

    /**
     * Sets the value of the 'IDENTIFY' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_IDENTIFY(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[307].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'IDENTIFY' field in the FML buffer.
     *
     * @return Number of values defined for 'IDENTIFY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_IDENTIFY_size() throws FMLManipulationException {
        return (this.fmlBuffer[307].getCount());
    }

    /**
     * Retrieves the value of the 'ID_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ID_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ID_TYPE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[308].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ID_TYPE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ID_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[308].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ID_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'ID_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ID_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[308].getCount());
    }

    /**
     * Retrieves the value of the 'COMP_REG_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'COMP_REG_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COMP_REG_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[309].getValue(nIndex));
    }

    /**
     * Sets the value of the 'COMP_REG_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_COMP_REG_ID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[309].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'COMP_REG_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'COMP_REG_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COMP_REG_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[309].getCount());
    }

    /**
     * Retrieves the value of the 'KOB' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'KOB' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_KOB(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[310].getValue(nIndex));
    }

    /**
     * Sets the value of the 'KOB' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_KOB(int nIndex, Double value) throws FMLManipulationException {
        this.fmlBuffer[310].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'KOB' field in the FML buffer.
     *
     * @return Number of values defined for 'KOB' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_KOB_size() throws FMLManipulationException {
        return (this.fmlBuffer[310].getCount());
    }

    /**
     * Retrieves the value of the 'MIDDLE_INITIAL' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'MIDDLE_INITIAL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MIDDLE_INITIAL(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[311].getValue(nIndex));
    }

    /**
     * Sets the value of the 'MIDDLE_INITIAL' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 33.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_MIDDLE_INITIAL(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[311].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'MIDDLE_INITIAL' field in the FML buffer.
     *
     * @return Number of values defined for 'MIDDLE_INITIAL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MIDDLE_INITIAL_size() throws FMLManipulationException {
        return (this.fmlBuffer[311].getCount());
    }

    /**
     * Retrieves the value of the 'TELEMARKET_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'TELEMARKET_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_TELEMARKET_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[312].getValue(nIndex));
    }

    /**
     * Sets the value of the 'TELEMARKET_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 11.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_TELEMARKET_ID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[312].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'TELEMARKET_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'TELEMARKET_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_TELEMARKET_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[312].getCount());
    }

    /**
     * Retrieves the value of the 'NAMERECCONV_RUN_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAMERECCONV_RUN_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NAMERECCONV_RUN_NO(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[313].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'NAMERECCONV_RUN_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_NAMERECCONV_RUN_NO(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[313].setValue(nIndex, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves number of values defined for 'NAMERECCONV_RUN_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'NAMERECCONV_RUN_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAMERECCONV_RUN_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[313].getCount());
    }

    /**
     * Retrieves the value of the 'NAME_TITLE_SALUTATION' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAME_TITLE_SALUTATION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NAME_TITLE_SALUTATION(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[314].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NAME_TITLE_SALUTATION' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_NAME_TITLE_SALUTATION(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[314].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NAME_TITLE_SALUTATION' field in the FML buffer.
     *
     * @return Number of values defined for 'NAME_TITLE_SALUTATION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAME_TITLE_SALUTATION_size() throws FMLManipulationException {
        return (this.fmlBuffer[314].getCount());
    }

    /**
     * Retrieves the value of the 'NATIONALITY_CD' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NATIONALITY_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NATIONALITY_CD(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[315].getValue(nIndex));
    }

    /**
     * Sets the value of the 'NATIONALITY_CD' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_NATIONALITY_CD(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[315].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'NATIONALITY_CD' field in the FML buffer.
     *
     * @return Number of values defined for 'NATIONALITY_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NATIONALITY_CD_size() throws FMLManipulationException {
        return (this.fmlBuffer[315].getCount());
    }

    /**
     * Retrieves the value of the 'GENDER' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'GENDER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_GENDER(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[316].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'GENDER' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_GENDER(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[316].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'GENDER' field in the FML buffer.
     *
     * @return Number of values defined for 'GENDER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_GENDER_size() throws FMLManipulationException {
        return (this.fmlBuffer[316].getCount());
    }

    /**
     * Retrieves the value of the 'MARITAL_STATUS' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'MARITAL_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MARITAL_STATUS(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[317].getValue(nIndex));
    }

    /**
     * Sets the value of the 'MARITAL_STATUS' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_MARITAL_STATUS(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[317].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'MARITAL_STATUS' field in the FML buffer.
     *
     * @return Number of values defined for 'MARITAL_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MARITAL_STATUS_size() throws FMLManipulationException {
        return (this.fmlBuffer[317].getCount());
    }

    /**
     * Retrieves the value of the 'ROLE_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ROLE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ROLE_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[318].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'ROLE_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ROLE_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[318].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'ROLE_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'ROLE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ROLE_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[318].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[319].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'ADR_MODE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_MODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[319].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'ADR_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[319].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_UP_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_UP_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_UP_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[320].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'ADR_UP_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_UP_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[320].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'ADR_UP_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_UP_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_UP_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[320].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_EXPIRE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_EXPIRE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_EXPIRE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[321].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_EXPIRE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_EXPIRE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[321].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_EXPIRE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_EXPIRE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_EXPIRE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[321].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESSRECROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESSRECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADDRESSRECROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[322].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADDRESSRECROWID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 19.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADDRESSRECROWID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[322].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADDRESSRECROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESSRECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESSRECROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[322].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESS_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESS_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ADDRESS_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[323].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADDRESS_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADDRESS_ID(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[323].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADDRESS_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESS_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESS_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[323].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESSRECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESSRECSYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADDRESSRECSYS_CREATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[324].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADDRESSRECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADDRESSRECSYS_CREATION_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[324].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADDRESSRECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESSRECSYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESSRECSYS_CREATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[324].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESSRECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESSRECSYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADDRESSRECSYS_UPDATE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[325].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADDRESSRECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 15.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADDRESSRECSYS_UPDATE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[325].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADDRESSRECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESSRECSYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESSRECSYS_UPDATE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[325].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESSRECOPERATOR_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESSRECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ADDRESSRECOPERATOR_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[326].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADDRESSRECOPERATOR_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADDRESSRECOPERATOR_ID(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[326].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADDRESSRECOPERATOR_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESSRECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESSRECOPERATOR_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[326].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESSRECAPPLICATION_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESSRECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADDRESSRECAPPLICATION_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[327].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADDRESSRECAPPLICATION_ID' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 7.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADDRESSRECAPPLICATION_ID(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[327].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADDRESSRECAPPLICATION_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESSRECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESSRECAPPLICATION_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[327].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESSRECDL_SERVICE_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESSRECDL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADDRESSRECDL_SERVICE_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[328].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADDRESSRECDL_SERVICE_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 6.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADDRESSRECDL_SERVICE_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[328].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADDRESSRECDL_SERVICE_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESSRECDL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESSRECDL_SERVICE_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[328].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESSRECDL_UPDATE_STAMP' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESSRECDL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ADDRESSRECDL_UPDATE_STAMP(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[329].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'ADDRESSRECDL_UPDATE_STAMP' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADDRESSRECDL_UPDATE_STAMP(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[329].setValue(nIndex, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves number of values defined for 'ADDRESSRECDL_UPDATE_STAMP' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESSRECDL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESSRECDL_UPDATE_STAMP_size() throws FMLManipulationException {
        return (this.fmlBuffer[329].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[330].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'ADR_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[330].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'ADR_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[330].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_STATUS' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_STATUS(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[331].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'ADR_STATUS' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_STATUS(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[331].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'ADR_STATUS' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_STATUS_size() throws FMLManipulationException {
        return (this.fmlBuffer[331].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_STATUS_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_STATUS_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_STATUS_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[332].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_STATUS_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_STATUS_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[332].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_STATUS_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_STATUS_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_STATUS_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[332].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_SECONDARY_LN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_SECONDARY_LN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_SECONDARY_LN(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[333].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_SECONDARY_LN' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 101.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_SECONDARY_LN(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[333].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_SECONDARY_LN' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_SECONDARY_LN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_SECONDARY_LN_size() throws FMLManipulationException {
        return (this.fmlBuffer[333].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_PRIMARY_LN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_PRIMARY_LN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_PRIMARY_LN(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[334].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_PRIMARY_LN' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 101.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_PRIMARY_LN(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[334].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_PRIMARY_LN' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_PRIMARY_LN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_PRIMARY_LN_size() throws FMLManipulationException {
        return (this.fmlBuffer[334].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_CITY' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_CITY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_CITY(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[335].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_CITY' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 40.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_CITY(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[335].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_CITY' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_CITY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_CITY_size() throws FMLManipulationException {
        return (this.fmlBuffer[335].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_ZIP' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_ZIP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_ZIP(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[336].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_ZIP' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 10.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_ZIP(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[336].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_ZIP' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_ZIP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_ZIP_size() throws FMLManipulationException {
        return (this.fmlBuffer[336].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_HOUSE_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_HOUSE_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_HOUSE_NO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[337].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_HOUSE_NO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_HOUSE_NO(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[337].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_HOUSE_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_HOUSE_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_HOUSE_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[337].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_STREET_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_STREET_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_STREET_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[338].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_STREET_NAME' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_STREET_NAME(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[338].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_STREET_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_STREET_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_STREET_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[338].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_DIRECTION' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_DIRECTION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_DIRECTION(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[339].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_DIRECTION' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 3.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_DIRECTION(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[339].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_DIRECTION' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_DIRECTION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_DIRECTION_size() throws FMLManipulationException {
        return (this.fmlBuffer[339].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_POB' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_POB' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_POB(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[340].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_POB' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 11.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_POB(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[340].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_POB' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_POB' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_POB_size() throws FMLManipulationException {
        return (this.fmlBuffer[340].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_COUNTRY' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_COUNTRY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_COUNTRY(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[341].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_COUNTRY' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_COUNTRY(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[341].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_COUNTRY' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_COUNTRY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_COUNTRY_size() throws FMLManipulationException {
        return (this.fmlBuffer[341].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_HOUSE_LETTER' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_HOUSE_LETTER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_HOUSE_LETTER(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[342].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_HOUSE_LETTER' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 3.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_HOUSE_LETTER(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[342].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_HOUSE_LETTER' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_HOUSE_LETTER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_HOUSE_LETTER_size() throws FMLManipulationException {
        return (this.fmlBuffer[342].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_STORY' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_STORY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_STORY(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[343].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_STORY' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 3.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_STORY(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[343].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_STORY' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_STORY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_STORY_size() throws FMLManipulationException {
        return (this.fmlBuffer[343].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_DOOR_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_DOOR_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_DOOR_NO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[344].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_DOOR_NO' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_DOOR_NO(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[344].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_DOOR_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_DOOR_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_DOOR_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[344].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_EMAIL' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_EMAIL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_EMAIL(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[345].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_EMAIL' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 151.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_EMAIL(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[345].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_EMAIL' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_EMAIL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_EMAIL_size() throws FMLManipulationException {
        return (this.fmlBuffer[345].getCount());
    }

    /**
     * Retrieves the value of the 'SINCE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'SINCE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SINCE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[346].getValue(nIndex));
    }

    /**
     * Sets the value of the 'SINCE_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_SINCE_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[346].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'SINCE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'SINCE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SINCE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[346].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_DISTRICT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_DISTRICT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_DISTRICT(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[347].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_DISTRICT' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 41.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_DISTRICT(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[347].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_DISTRICT' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_DISTRICT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_DISTRICT_size() throws FMLManipulationException {
        return (this.fmlBuffer[347].getCount());
    }

    /**
     * Retrieves the value of the 'CO_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'CO_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CO_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[348].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'CO_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_CO_IND(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[348].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'CO_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'CO_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CO_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[348].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESSRECCONV_RUN_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESSRECCONV_RUN_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ADDRESSRECCONV_RUN_NO(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[349].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'ADDRESSRECCONV_RUN_NO' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADDRESSRECCONV_RUN_NO(int nIndex, Integer value) throws FMLManipulationException {
        this.fmlBuffer[349].setValue(nIndex, TypeConverter.integerToShort(value));
    }

    /**
     * Retrieves number of values defined for 'ADDRESSRECCONV_RUN_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESSRECCONV_RUN_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESSRECCONV_RUN_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[349].getCount());
    }

    /**
     * Retrieves the value of the 'ACCOMMODATION_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ACCOMMODATION_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACCOMMODATION_TYPE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[350].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ACCOMMODATION_TYPE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ACCOMMODATION_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[350].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ACCOMMODATION_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'ACCOMMODATION_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACCOMMODATION_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[350].getCount());
    }

    /**
     * Retrieves the value of the 'COUNTY_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'COUNTY_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COUNTY_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[351].getValue(nIndex));
    }

    /**
     * Sets the value of the 'COUNTY_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 3.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_COUNTY_CODE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[351].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'COUNTY_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'COUNTY_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COUNTY_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[351].getCount());
    }

    /**
     * Retrieves the value of the 'COMMUNITY_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'COMMUNITY_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COMMUNITY_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[352].getValue(nIndex));
    }

    /**
     * Sets the value of the 'COMMUNITY_NAME' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 31.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_COMMUNITY_NAME(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[352].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'COMMUNITY_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'COMMUNITY_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COMMUNITY_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[352].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_CO_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_CO_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_CO_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[353].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_CO_NAME' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_CO_NAME(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[353].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_CO_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_CO_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_CO_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[353].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_HOUSE_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_HOUSE_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_HOUSE_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[354].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_HOUSE_NAME' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_HOUSE_NAME(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[354].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_HOUSE_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_HOUSE_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_HOUSE_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[354].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P1' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P1' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P1(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[355].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_P1' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_P1(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[355].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_P1' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P1' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P1_size() throws FMLManipulationException {
        return (this.fmlBuffer[355].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P2' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P2' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P2(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[356].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_P2' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_P2(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[356].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_P2' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P2' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P2_size() throws FMLManipulationException {
        return (this.fmlBuffer[356].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P3' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P3' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P3(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[357].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_P3' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_P3(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[357].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_P3' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P3' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P3_size() throws FMLManipulationException {
        return (this.fmlBuffer[357].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P4' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P4' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P4(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[358].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_P4' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_P4(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[358].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_P4' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P4' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P4_size() throws FMLManipulationException {
        return (this.fmlBuffer[358].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P5' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P5' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P5(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[359].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_P5' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_P5(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[359].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_P5' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P5' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P5_size() throws FMLManipulationException {
        return (this.fmlBuffer[359].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P6' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P6' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P6(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[360].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_P6' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_P6(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[360].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_P6' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P6' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P6_size() throws FMLManipulationException {
        return (this.fmlBuffer[360].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P7' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P7' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P7(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[361].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_P7' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_P7(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[361].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_P7' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P7' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P7_size() throws FMLManipulationException {
        return (this.fmlBuffer[361].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P8' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P8' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P8(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[362].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_P8' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_P8(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[362].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_P8' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P8' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P8_size() throws FMLManipulationException {
        return (this.fmlBuffer[362].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P9' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P9' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P9(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[363].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_P9' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_P9(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[363].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_P9' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P9' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P9_size() throws FMLManipulationException {
        return (this.fmlBuffer[363].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P10' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P10' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P10(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[364].getValue(nIndex));
    }

    /**
     * Sets the value of the 'ADR_P10' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 61.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @throws FMLManipulationException
     */
    public void set_ADR_P10(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[364].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'ADR_P10' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P10' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P10_size() throws FMLManipulationException {
        return (this.fmlBuffer[364].getCount());
    }

    /**
     * Retrieves the value of the 'PCHGCTNRECBAN' field in the FML buffer.
     *
     * @return Value of 'PCHGCTNRECBAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PCHGCTNRECBAN() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[365].getValue(0));
    }

    /**
     * Sets the value of the 'PCHGCTNRECBAN' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PCHGCTNRECBAN(Integer value) throws FMLManipulationException {
        this.fmlBuffer[365].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'OLD_CTN' field in the FML buffer.
     *
     * @return Value of 'OLD_CTN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_OLD_CTN() throws FMLManipulationException {
        return ((String) this.fmlBuffer[366].getValue(0));
    }

    /**
     * Sets the value of the 'OLD_CTN' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 21.
     * @throws FMLManipulationException
     */
    public void set_OLD_CTN(String value) throws FMLManipulationException {
        this.fmlBuffer[366].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PCHGCTNRECCUSTOMER_ID' field in the FML buffer.
     *
     * @return Value of 'PCHGCTNRECCUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PCHGCTNRECCUSTOMER_ID() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[367].getValue(0));
    }

    /**
     * Sets the value of the 'PCHGCTNRECCUSTOMER_ID' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PCHGCTNRECCUSTOMER_ID(Integer value) throws FMLManipulationException {
        this.fmlBuffer[367].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PCHGCTNRECACTIVITY_DATE' field in the FML buffer.
     *
     * @return Value of 'PCHGCTNRECACTIVITY_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PCHGCTNRECACTIVITY_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[368].getValue(0));
    }

    /**
     * Sets the value of the 'PCHGCTNRECACTIVITY_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @throws FMLManipulationException
     */
    public void set_PCHGCTNRECACTIVITY_DATE(String value) throws FMLManipulationException {
        this.fmlBuffer[368].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'OTHER_NL' field in the FML buffer.
     *
     * @return Value of 'OTHER_NL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_OTHER_NL() throws FMLManipulationException {
        return ((String) this.fmlBuffer[369].getValue(0));
    }

    /**
     * Sets the value of the 'OTHER_NL' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @throws FMLManipulationException
     */
    public void set_OTHER_NL(String value) throws FMLManipulationException {
        this.fmlBuffer[369].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'INT_ORDER_ID_OF_TEMP_MSISDN' field in the FML buffer.
     *
     * @return Value of 'INT_ORDER_ID_OF_TEMP_MSISDN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_INT_ORDER_ID_OF_TEMP_MSISDN() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[370].getValue(0));
    }

    /**
     * Sets the value of the 'INT_ORDER_ID_OF_TEMP_MSISDN' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_INT_ORDER_ID_OF_TEMP_MSISDN(Double value) throws FMLManipulationException {
        this.fmlBuffer[370].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'ACTIVITY_CTN_FEE' field in the FML buffer.
     *
     * @return Value of 'ACTIVITY_CTN_FEE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_ACTIVITY_CTN_FEE() throws FMLManipulationException {
        return ((Double) this.fmlBuffer[371].getValue(0));
    }

    /**
     * Sets the value of the 'ACTIVITY_CTN_FEE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_ACTIVITY_CTN_FEE(Double value) throws FMLManipulationException {
        this.fmlBuffer[371].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'NUMBER_LOCATION' field in the FML buffer.
     *
     * @return Value of 'NUMBER_LOCATION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NUMBER_LOCATION() throws FMLManipulationException {
        return ((String) this.fmlBuffer[372].getValue(0));
    }

    /**
     * Sets the value of the 'NUMBER_LOCATION' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 4.
     * @throws FMLManipulationException
     */
    public void set_NUMBER_LOCATION(String value) throws FMLManipulationException {
        this.fmlBuffer[372].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'DEPOSITTERMSIND' field in the FML buffer.
     *
     * @return Value of 'DEPOSITTERMSIND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DEPOSITTERMSIND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[373].getValue(0)));
    }

    /**
     * Sets the value of the 'DEPOSITTERMSIND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_DEPOSITTERMSIND(String value) throws FMLManipulationException {
        this.fmlBuffer[373].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'WAIVING_IND' field in the FML buffer.
     *
     * @return Value of 'WAIVING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_WAIVING_IND() throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[374].getValue(0)));
    }

    /**
     * Sets the value of the 'WAIVING_IND' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_WAIVING_IND(String value) throws FMLManipulationException {
        this.fmlBuffer[374].setValue(0, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves the value of the 'WAIVING_REASON_CODE' field in the FML buffer.
     *
     * @return Value of 'WAIVING_REASON_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_WAIVING_REASON_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[375].getValue(0));
    }

    /**
     * Sets the value of the 'WAIVING_REASON_CODE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 5.
     * @throws FMLManipulationException
     */
    public void set_WAIVING_REASON_CODE(String value) throws FMLManipulationException {
        this.fmlBuffer[375].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'PINSTLBUFROW_COUNT' field in the FML buffer.
     *
     * @return Value of 'PINSTLBUFROW_COUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PINSTLBUFROW_COUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[376].getValue(0));
    }

    /**
     * Sets the value of the 'PINSTLBUFROW_COUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PINSTLBUFROW_COUNT(Integer value) throws FMLManipulationException {
        this.fmlBuffer[376].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'INSTALLMENT_AMT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 12).
     * @return Value of 'INSTALLMENT_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_INSTALLMENT_AMT(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[377].getValue(nIndex));
    }

    /**
     * Sets the value of the 'INSTALLMENT_AMT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 12).
     * @throws FMLManipulationException
     */
    public void set_INSTALLMENT_AMT(int nIndex, Double value) throws FMLManipulationException {
        this.fmlBuffer[377].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'INSTALLMENT_AMT' field in the FML buffer.
     *
     * @return Number of values defined for 'INSTALLMENT_AMT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_INSTALLMENT_AMT_size() throws FMLManipulationException {
        return (this.fmlBuffer[377].getCount());
    }

    /**
     * Retrieves the value of the 'INSTALLMENT_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 12).
     * @return Value of 'INSTALLMENT_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_INSTALLMENT_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[378].getValue(nIndex));
    }

    /**
     * Sets the value of the 'INSTALLMENT_DATE' field in the FML buffer.
     *
     * @param value Default value: null, Maximum length: 9.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 12).
     * @throws FMLManipulationException
     */
    public void set_INSTALLMENT_DATE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[378].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'INSTALLMENT_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'INSTALLMENT_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_INSTALLMENT_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[378].getCount());
    }

    /**
     * Retrieves the value of the 'PFTRDEPBUFROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'PFTRDEPBUFROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PFTRDEPBUFROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[379].getValue(0));
    }

    /**
     * Sets the value of the 'PFTRDEPBUFROWCOUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @throws FMLManipulationException
     */
    public void set_PFTRDEPBUFROWCOUNT(Integer value) throws FMLManipulationException {
        this.fmlBuffer[379].setValue(0, value);
    }

    /**
     * Retrieves the value of the 'DEPOSIT_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 2).
     * @return Value of 'DEPOSIT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DEPOSIT_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[380].getValue(nIndex)));
    }

    /**
     * Sets the value of the 'DEPOSIT_TYPE' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 2).
     * @throws FMLManipulationException
     */
    public void set_DEPOSIT_TYPE(int nIndex, String value) throws FMLManipulationException {
        this.fmlBuffer[380].setValue(nIndex, TypeConverter.stringToByte(value));
    }

    /**
     * Retrieves number of values defined for 'DEPOSIT_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'DEPOSIT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DEPOSIT_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[380].getCount());
    }

    /**
     * Retrieves the value of the 'DEPOSIT_AMOUNT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 2).
     * @return Value of 'DEPOSIT_AMOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_DEPOSIT_AMOUNT(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[381].getValue(nIndex));
    }

    /**
     * Sets the value of the 'DEPOSIT_AMOUNT' field in the FML buffer.
     *
     * @param value Default value: null.
     * @param nIndex Sequence of value to be returned (valid values: 0 to 2).
     * @throws FMLManipulationException
     */
    public void set_DEPOSIT_AMOUNT(int nIndex, Double value) throws FMLManipulationException {
        this.fmlBuffer[381].setValue(nIndex, value);
    }

    /**
     * Retrieves number of values defined for 'DEPOSIT_AMOUNT' field in the FML buffer.
     *
     * @return Number of values defined for 'DEPOSIT_AMOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DEPOSIT_AMOUNT_size() throws FMLManipulationException {
        return (this.fmlBuffer[381].getCount());
    }
}