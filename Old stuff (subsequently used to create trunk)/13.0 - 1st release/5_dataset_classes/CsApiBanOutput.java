/*
 * CsApiBanOutput.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service.parameters;

import bea.jolt.pool.Result;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;

/**
 * @author  Ninja
 *
 * CsApiBanOutput class.
 */
public class CsApiBanOutput extends ServiceOutput {

    /**
     * Creates a new instance of CsApiBanOutput.
     *
     * @throws FMLManipulationException
     */
    public CsApiBanOutput(int nApplicationStatus) throws FMLManipulationException {
        createFmlBuffer();
        setApplicationCode(nApplicationStatus);
    }

    public CsApiBanOutput() {
    }

    /**
     * Creates a new instance of CsApiBanOutput.
     *
     * @param ds Output dataset from CsApiBan service.
     * @throws FMLManipulationException
     */
    public CsApiBanOutput(Result ds) throws FMLManipulationException {
        createFmlBuffer();
        populateFmlBuffer(ds);
    }

    /**
     * Populates the FML buffer.
     *
     * @throws FMLManipulationException
     */
    private void createFmlBuffer() throws FMLManipulationException {
        this.fmlBuffer = new FmlField[218];
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
        this.fmlBuffer[16] = new FmlField("PNAMEADRBUFROWCOUNT", FmlField.TYPE_INTEGER, -1, null, 16, 1);
        this.fmlBuffer[17] = new FmlField("LINK_MODE", FmlField.TYPE_BYTE, -1, null, 17, 20);
        this.fmlBuffer[18] = new FmlField("LINK_BAN", FmlField.TYPE_INTEGER, -1, null, 18, 20);
        this.fmlBuffer[19] = new FmlField("LINK_SUBSCRIBER", FmlField.TYPE_STRING, 21, null, 19, 20);
        this.fmlBuffer[20] = new FmlField("LINK_ROW_ID", FmlField.TYPE_STRING, 19, null, 20, 20);
        this.fmlBuffer[21] = new FmlField("LINK_SEQ_NO", FmlField.TYPE_INTEGER, -1, null, 21, 20);
        this.fmlBuffer[22] = new FmlField("LNKRECCUSTOMER_ID", FmlField.TYPE_INTEGER, -1, null, 22, 20);
        this.fmlBuffer[23] = new FmlField("LNKRECBAN", FmlField.TYPE_INTEGER, -1, null, 23, 20);
        this.fmlBuffer[24] = new FmlField("LNKRECSUBSCRIBER_NO", FmlField.TYPE_STRING, 21, null, 24, 20);
        this.fmlBuffer[25] = new FmlField("LINK_TYPE", FmlField.TYPE_BYTE, -1, null, 25, 20);
        this.fmlBuffer[26] = new FmlField("LNKRECEFFECTIVE_DATE", FmlField.TYPE_STRING, 9, null, 26, 20);
        this.fmlBuffer[27] = new FmlField("FOREIGN_SEQ_NO", FmlField.TYPE_INTEGER, -1, null, 27, 20);
        this.fmlBuffer[28] = new FmlField("BILLING_IND", FmlField.TYPE_BYTE, -1, null, 28, 20);
        this.fmlBuffer[29] = new FmlField("MAILING_IND", FmlField.TYPE_BYTE, -1, null, 29, 20);
        this.fmlBuffer[30] = new FmlField("USER_IND", FmlField.TYPE_BYTE, -1, null, 30, 20);
        this.fmlBuffer[31] = new FmlField("LINK_BILLING_IND", FmlField.TYPE_BYTE, -1, null, 31, 20);
        this.fmlBuffer[32] = new FmlField("LINK_MAILING_IND", FmlField.TYPE_BYTE, -1, null, 32, 20);
        this.fmlBuffer[33] = new FmlField("LINK_USER_IND", FmlField.TYPE_BYTE, -1, null, 33, 20);
        this.fmlBuffer[34] = new FmlField("NM_MODE", FmlField.TYPE_BYTE, -1, null, 34, 20);
        this.fmlBuffer[35] = new FmlField("NM_UP_TYPE", FmlField.TYPE_BYTE, -1, null, 35, 20);
        this.fmlBuffer[36] = new FmlField("NM_EXPIRE_DATE", FmlField.TYPE_STRING, 9, null, 36, 20);
        this.fmlBuffer[37] = new FmlField("NAMERECROWID", FmlField.TYPE_STRING, 19, null, 37, 20);
        this.fmlBuffer[38] = new FmlField("NAME_ID", FmlField.TYPE_INTEGER, -1, null, 38, 20);
        this.fmlBuffer[39] = new FmlField("NAMERECSYS_CREATION_DATE", FmlField.TYPE_STRING, 15, null, 39, 20);
        this.fmlBuffer[40] = new FmlField("NAMERECSYS_UPDATE_DATE", FmlField.TYPE_STRING, 15, null, 40, 20);
        this.fmlBuffer[41] = new FmlField("NAMERECOPERATOR_ID", FmlField.TYPE_INTEGER, -1, null, 41, 20);
        this.fmlBuffer[42] = new FmlField("NAMERECAPPLICATION_ID", FmlField.TYPE_STRING, 7, null, 42, 20);
        this.fmlBuffer[43] = new FmlField("NAMERECDL_SERVICE_CODE", FmlField.TYPE_STRING, 6, null, 43, 20);
        this.fmlBuffer[44] = new FmlField("NAMERECDL_UPDATE_STAMP", FmlField.TYPE_SHORT, -1, null, 44, 20);
        this.fmlBuffer[45] = new FmlField("CONTROL_NAME", FmlField.TYPE_STRING, 41, null, 45, 20);
        this.fmlBuffer[46] = new FmlField("LAST_BUSINESS_NAME", FmlField.TYPE_STRING, 61, null, 46, 20);
        this.fmlBuffer[47] = new FmlField("FIRST_NAME", FmlField.TYPE_STRING, 33, null, 47, 20);
        this.fmlBuffer[48] = new FmlField("ADDITIONAL_TITLE", FmlField.TYPE_STRING, 61, null, 48, 20);
        this.fmlBuffer[49] = new FmlField("NAME_FORMAT", FmlField.TYPE_BYTE, -1, null, 49, 20);
        this.fmlBuffer[50] = new FmlField("BIRTH_DATE", FmlField.TYPE_STRING, 9, null, 50, 20);
        this.fmlBuffer[51] = new FmlField("IDENTIFY", FmlField.TYPE_STRING, 21, null, 51, 20);
        this.fmlBuffer[52] = new FmlField("ID_TYPE", FmlField.TYPE_STRING, 5, null, 52, 20);
        this.fmlBuffer[53] = new FmlField("COMP_REG_ID", FmlField.TYPE_STRING, 21, null, 53, 20);
        this.fmlBuffer[54] = new FmlField("KOB", FmlField.TYPE_DOUBLE, -1, null, 54, 20);
        this.fmlBuffer[55] = new FmlField("MIDDLE_INITIAL", FmlField.TYPE_STRING, 33, null, 55, 20);
        this.fmlBuffer[56] = new FmlField("TELEMARKET_ID", FmlField.TYPE_STRING, 11, null, 56, 20);
        this.fmlBuffer[57] = new FmlField("NAMERECCONV_RUN_NO", FmlField.TYPE_SHORT, -1, null, 57, 20);
        this.fmlBuffer[58] = new FmlField("NAME_TITLE_SALUTATION", FmlField.TYPE_STRING, 21, null, 58, 20);
        this.fmlBuffer[59] = new FmlField("NATIONALITY_CD", FmlField.TYPE_STRING, 4, null, 59, 20);
        this.fmlBuffer[60] = new FmlField("GENDER", FmlField.TYPE_BYTE, -1, null, 60, 20);
        this.fmlBuffer[61] = new FmlField("MARITAL_STATUS", FmlField.TYPE_STRING, 5, null, 61, 20);
        this.fmlBuffer[62] = new FmlField("ROLE_IND", FmlField.TYPE_BYTE, -1, null, 62, 20);
        this.fmlBuffer[63] = new FmlField("ADR_MODE", FmlField.TYPE_BYTE, -1, null, 63, 20);
        this.fmlBuffer[64] = new FmlField("ADR_UP_TYPE", FmlField.TYPE_BYTE, -1, null, 64, 20);
        this.fmlBuffer[65] = new FmlField("ADR_EXPIRE_DATE", FmlField.TYPE_STRING, 9, null, 65, 20);
        this.fmlBuffer[66] = new FmlField("ADDRESSRECROWID", FmlField.TYPE_STRING, 19, null, 66, 20);
        this.fmlBuffer[67] = new FmlField("ADDRESS_ID", FmlField.TYPE_INTEGER, -1, null, 67, 20);
        this.fmlBuffer[68] = new FmlField("ADDRESSRECSYS_CREATION_DATE", FmlField.TYPE_STRING, 15, null, 68, 20);
        this.fmlBuffer[69] = new FmlField("ADDRESSRECSYS_UPDATE_DATE", FmlField.TYPE_STRING, 15, null, 69, 20);
        this.fmlBuffer[70] = new FmlField("ADDRESSRECOPERATOR_ID", FmlField.TYPE_INTEGER, -1, null, 70, 20);
        this.fmlBuffer[71] = new FmlField("ADDRESSRECAPPLICATION_ID", FmlField.TYPE_STRING, 7, null, 71, 20);
        this.fmlBuffer[72] = new FmlField("ADDRESSRECDL_SERVICE_CODE", FmlField.TYPE_STRING, 6, null, 72, 20);
        this.fmlBuffer[73] = new FmlField("ADDRESSRECDL_UPDATE_STAMP", FmlField.TYPE_SHORT, -1, null, 73, 20);
        this.fmlBuffer[74] = new FmlField("ADR_TYPE", FmlField.TYPE_BYTE, -1, null, 74, 20);
        this.fmlBuffer[75] = new FmlField("ADR_STATUS", FmlField.TYPE_BYTE, -1, null, 75, 20);
        this.fmlBuffer[76] = new FmlField("ADR_STATUS_DATE", FmlField.TYPE_STRING, 9, null, 76, 20);
        this.fmlBuffer[77] = new FmlField("ADR_SECONDARY_LN", FmlField.TYPE_STRING, 101, null, 77, 20);
        this.fmlBuffer[78] = new FmlField("ADR_PRIMARY_LN", FmlField.TYPE_STRING, 101, null, 78, 20);
        this.fmlBuffer[79] = new FmlField("ADR_CITY", FmlField.TYPE_STRING, 40, null, 79, 20);
        this.fmlBuffer[80] = new FmlField("ADR_ZIP", FmlField.TYPE_STRING, 10, null, 80, 20);
        this.fmlBuffer[81] = new FmlField("ADR_HOUSE_NO", FmlField.TYPE_STRING, 21, null, 81, 20);
        this.fmlBuffer[82] = new FmlField("ADR_STREET_NAME", FmlField.TYPE_STRING, 61, null, 82, 20);
        this.fmlBuffer[83] = new FmlField("ADR_DIRECTION", FmlField.TYPE_STRING, 3, null, 83, 20);
        this.fmlBuffer[84] = new FmlField("ADR_POB", FmlField.TYPE_STRING, 11, null, 84, 20);
        this.fmlBuffer[85] = new FmlField("ADR_COUNTRY", FmlField.TYPE_STRING, 4, null, 85, 20);
        this.fmlBuffer[86] = new FmlField("ADR_HOUSE_LETTER", FmlField.TYPE_STRING, 3, null, 86, 20);
        this.fmlBuffer[87] = new FmlField("ADR_STORY", FmlField.TYPE_STRING, 3, null, 87, 20);
        this.fmlBuffer[88] = new FmlField("ADR_DOOR_NO", FmlField.TYPE_STRING, 5, null, 88, 20);
        this.fmlBuffer[89] = new FmlField("ADR_EMAIL", FmlField.TYPE_STRING, 151, null, 89, 20);
        this.fmlBuffer[90] = new FmlField("SINCE_DATE", FmlField.TYPE_STRING, 9, null, 90, 20);
        this.fmlBuffer[91] = new FmlField("ADR_DISTRICT", FmlField.TYPE_STRING, 41, null, 91, 20);
        this.fmlBuffer[92] = new FmlField("CO_IND", FmlField.TYPE_BYTE, -1, null, 92, 20);
        this.fmlBuffer[93] = new FmlField("ADDRESSRECCONV_RUN_NO", FmlField.TYPE_SHORT, -1, null, 93, 20);
        this.fmlBuffer[94] = new FmlField("ACCOMMODATION_TYPE", FmlField.TYPE_STRING, 5, null, 94, 20);
        this.fmlBuffer[95] = new FmlField("COUNTY_CODE", FmlField.TYPE_STRING, 3, null, 95, 20);
        this.fmlBuffer[96] = new FmlField("COMMUNITY_NAME", FmlField.TYPE_STRING, 31, null, 96, 20);
        this.fmlBuffer[97] = new FmlField("ADR_CO_NAME", FmlField.TYPE_STRING, 61, null, 97, 20);
        this.fmlBuffer[98] = new FmlField("ADR_HOUSE_NAME", FmlField.TYPE_STRING, 61, null, 98, 20);
        this.fmlBuffer[99] = new FmlField("ADR_P1", FmlField.TYPE_STRING, 61, null, 99, 20);
        this.fmlBuffer[100] = new FmlField("ADR_P2", FmlField.TYPE_STRING, 61, null, 100, 20);
        this.fmlBuffer[101] = new FmlField("ADR_P3", FmlField.TYPE_STRING, 61, null, 101, 20);
        this.fmlBuffer[102] = new FmlField("ADR_P4", FmlField.TYPE_STRING, 61, null, 102, 20);
        this.fmlBuffer[103] = new FmlField("ADR_P5", FmlField.TYPE_STRING, 61, null, 103, 20);
        this.fmlBuffer[104] = new FmlField("ADR_P6", FmlField.TYPE_STRING, 61, null, 104, 20);
        this.fmlBuffer[105] = new FmlField("ADR_P7", FmlField.TYPE_STRING, 61, null, 105, 20);
        this.fmlBuffer[106] = new FmlField("ADR_P8", FmlField.TYPE_STRING, 61, null, 106, 20);
        this.fmlBuffer[107] = new FmlField("ADR_P9", FmlField.TYPE_STRING, 61, null, 107, 20);
        this.fmlBuffer[108] = new FmlField("ADR_P10", FmlField.TYPE_STRING, 61, null, 108, 20);
        this.fmlBuffer[109] = new FmlField("PESNBUFROWCOUNT", FmlField.TYPE_INTEGER, -1, null, 109, 1);
        this.fmlBuffer[110] = new FmlField("EQUIPMENT_NO", FmlField.TYPE_STRING, 21, null, 110, 50);
        this.fmlBuffer[111] = new FmlField("PHD_SEQ_NO", FmlField.TYPE_INTEGER, -1, null, 111, 50);
        this.fmlBuffer[112] = new FmlField("EQUIPMENT_LEVEL", FmlField.TYPE_SHORT, -1, null, 112, 50);
        this.fmlBuffer[113] = new FmlField("IMSI", FmlField.TYPE_STRING, 16, null, 113, 50);
        this.fmlBuffer[114] = new FmlField("PHYDEVARRAYEXPIRATION_DATE", FmlField.TYPE_STRING, 15, null, 114, 50);
        this.fmlBuffer[115] = new FmlField("PHYDEVARRAYEFFECTIVE_DATE", FmlField.TYPE_STRING, 15, null, 115, 50);
        this.fmlBuffer[116] = new FmlField("OWNERSHIP_CODE", FmlField.TYPE_STRING, 3, null, 116, 50);
        this.fmlBuffer[117] = new FmlField("SW_STATE_IND", FmlField.TYPE_BYTE, -1, null, 117, 50);
        this.fmlBuffer[118] = new FmlField("LAST_SW_ACTV_DATE", FmlField.TYPE_STRING, 9, null, 118, 50);
        this.fmlBuffer[119] = new FmlField("NEXT_ACTV_CODE", FmlField.TYPE_BYTE, -1, null, 119, 50);
        this.fmlBuffer[120] = new FmlField("NEXT_ACTV_DATE", FmlField.TYPE_STRING, 9, null, 120, 50);
        this.fmlBuffer[121] = new FmlField("NEXT_ACTV_ISSUE_DT", FmlField.TYPE_STRING, 9, null, 121, 50);
        this.fmlBuffer[122] = new FmlField("DEVICE_TYPE", FmlField.TYPE_BYTE, -1, null, 122, 50);
        this.fmlBuffer[123] = new FmlField("ESN_MODE", FmlField.TYPE_BYTE, -1, null, 123, 50);
        this.fmlBuffer[124] = new FmlField("ITEM_ID", FmlField.TYPE_STRING, 16, null, 124, 50);
        this.fmlBuffer[125] = new FmlField("POOL", FmlField.TYPE_STRING, 3, null, 125, 50);
        this.fmlBuffer[126] = new FmlField("LOCATION_ID", FmlField.TYPE_STRING, 5, null, 126, 50);
        this.fmlBuffer[127] = new FmlField("ACTIVITY_CODE", FmlField.TYPE_STRING, 5, null, 127, 50);
        this.fmlBuffer[128] = new FmlField("ACTIVITY_DATE", FmlField.TYPE_STRING, 15, null, 128, 50);
        this.fmlBuffer[129] = new FmlField("OPERATION_STATUS", FmlField.TYPE_BYTE, -1, null, 129, 50);
        this.fmlBuffer[130] = new FmlField("ITEM_OWNERSHIP", FmlField.TYPE_BYTE, -1, null, 130, 50);
        this.fmlBuffer[131] = new FmlField("ITEM_OWNERSHIP_DT", FmlField.TYPE_STRING, 15, null, 131, 50);
        this.fmlBuffer[132] = new FmlField("CURR_POSSESSION", FmlField.TYPE_BYTE, -1, null, 132, 50);
        this.fmlBuffer[133] = new FmlField("CURR_POSSESSION_DT", FmlField.TYPE_STRING, 15, null, 133, 50);
        this.fmlBuffer[134] = new FmlField("MISSING_IND", FmlField.TYPE_BYTE, -1, null, 134, 50);
        this.fmlBuffer[135] = new FmlField("IN_REPAIR_IND", FmlField.TYPE_BYTE, -1, null, 135, 50);
        this.fmlBuffer[136] = new FmlField("IN_TRANSIT_IND", FmlField.TYPE_BYTE, -1, null, 136, 50);
        this.fmlBuffer[137] = new FmlField("COMITED_TO_POS_IND", FmlField.TYPE_BYTE, -1, null, 137, 50);
        this.fmlBuffer[138] = new FmlField("COMITED_DATE", FmlField.TYPE_STRING, 15, null, 138, 50);
        this.fmlBuffer[139] = new FmlField("ACTIVITY_REASON", FmlField.TYPE_STRING, 4, null, 139, 50);
        this.fmlBuffer[140] = new FmlField("UPGRADE_IND", FmlField.TYPE_BYTE, -1, null, 140, 50);
        this.fmlBuffer[141] = new FmlField("EXPECTED_RTRN_DATE", FmlField.TYPE_STRING, 15, null, 141, 50);
        this.fmlBuffer[142] = new FmlField("POLICE_REPORT_NO", FmlField.TYPE_STRING, 16, null, 142, 50);
        this.fmlBuffer[143] = new FmlField("POLICE_REPORT_DATE", FmlField.TYPE_STRING, 15, null, 143, 50);
        this.fmlBuffer[144] = new FmlField("POLICE_STATION", FmlField.TYPE_STRING, 31, null, 144, 50);
        this.fmlBuffer[145] = new FmlField("PUK", FmlField.TYPE_INTEGER, -1, null, 145, 50);
        this.fmlBuffer[146] = new FmlField("PUK2", FmlField.TYPE_INTEGER, -1, null, 146, 50);
        this.fmlBuffer[147] = new FmlField("FIRST_USED_DATE", FmlField.TYPE_STRING, 15, null, 147, 50);
        this.fmlBuffer[148] = new FmlField("SIM_STATUS", FmlField.TYPE_BYTE, -1, null, 148, 50);
        this.fmlBuffer[149] = new FmlField("SUSPEND_IND", FmlField.TYPE_BYTE, -1, null, 149, 50);
        this.fmlBuffer[150] = new FmlField("SUSPEND_DATE", FmlField.TYPE_STRING, 15, null, 150, 50);
        this.fmlBuffer[151] = new FmlField("SENT_TO_AUC_IND", FmlField.TYPE_BYTE, -1, null, 151, 50);
        this.fmlBuffer[152] = new FmlField("HLR_CD", FmlField.TYPE_STRING, 4, null, 152, 50);
        this.fmlBuffer[153] = new FmlField("K4ID", FmlField.TYPE_STRING, 41, null, 153, 50);
        this.fmlBuffer[154] = new FmlField("PHYDEVARRAYDEALER_CODE", FmlField.TYPE_STRING, 6, null, 154, 50);
        this.fmlBuffer[155] = new FmlField("PSOCFTRBUFROWCOUNT", FmlField.TYPE_INTEGER, -1, null, 155, 1);
        this.fmlBuffer[156] = new FmlField("PSOCFTRBUFROWID", FmlField.TYPE_STRING, 19, null, 156, 200);
        this.fmlBuffer[157] = new FmlField("PSOCFTRBUFSOC", FmlField.TYPE_STRING, 10, null, 157, 200);
        this.fmlBuffer[158] = new FmlField("PSOCFTRBUFSOC_EFFECTIVE_DATE", FmlField.TYPE_STRING, 9, null, 158, 200);
        this.fmlBuffer[159] = new FmlField("FEATURE_CODE", FmlField.TYPE_STRING, 7, null, 159, 200);
        this.fmlBuffer[160] = new FmlField("MPS_FTR_CODE", FmlField.TYPE_STRING, 7, null, 160, 200);
        this.fmlBuffer[161] = new FmlField("FTR_EFFECTIVE_DATE", FmlField.TYPE_STRING, 9, null, 161, 200);
        this.fmlBuffer[162] = new FmlField("FTR_EXPIRATION_DATE", FmlField.TYPE_STRING, 9, null, 162, 200);
        this.fmlBuffer[163] = new FmlField("FTR_EFF_RSN_CODE", FmlField.TYPE_BYTE, -1, null, 163, 200);
        this.fmlBuffer[164] = new FmlField("FTR_EXP_RSN_CODE", FmlField.TYPE_BYTE, -1, null, 164, 200);
        this.fmlBuffer[165] = new FmlField("SERVICE_FTR_SEQ_NO", FmlField.TYPE_INTEGER, -1, null, 165, 200);
        this.fmlBuffer[166] = new FmlField("FTR_MODE", FmlField.TYPE_BYTE, -1, null, 166, 200);
        this.fmlBuffer[167] = new FmlField("PSOCFTRBUFSOC_SEQ_NO", FmlField.TYPE_INTEGER, -1, null, 167, 200);
        this.fmlBuffer[168] = new FmlField("FTR_SUB_MODE", FmlField.TYPE_BYTE, -1, null, 168, 200);
        this.fmlBuffer[169] = new FmlField("FTR_ADD_PARAM", FmlField.TYPE_STRING, 301, null, 169, 200);
        this.fmlBuffer[170] = new FmlField("FEATURE_TYPE", FmlField.TYPE_STRING, 4, null, 170, 200);
        this.fmlBuffer[171] = new FmlField("PSOCFTRBUFPRODUCT_TYPE", FmlField.TYPE_STRING, 4, null, 171, 200);
        this.fmlBuffer[172] = new FmlField("PSOCFTRBUFCAMPAIGN_SEQ", FmlField.TYPE_INTEGER, -1, null, 172, 200);
        this.fmlBuffer[173] = new FmlField("FTR_SPECIAL_TELNO", FmlField.TYPE_STRING, 21, null, 173, 200);
        this.fmlBuffer[174] = new FmlField("SWITCH_ACT_NEEDED", FmlField.TYPE_BYTE, -1, null, 174, 200);
        this.fmlBuffer[175] = new FmlField("SWITCH_CODE", FmlField.TYPE_STRING, 7, null, 175, 200);
        this.fmlBuffer[176] = new FmlField("MSISDN_CRITERIA", FmlField.TYPE_BYTE, -1, null, 176, 200);
        this.fmlBuffer[177] = new FmlField("TN_CLASS_CD", FmlField.TYPE_STRING, 4, null, 177, 200);
        this.fmlBuffer[178] = new FmlField("ACTION_MODE", FmlField.TYPE_BYTE, -1, null, 178, 200);
        this.fmlBuffer[179] = new FmlField("MANUAL_RC_RATE", FmlField.TYPE_DOUBLE, -1, null, 179, 200);
        this.fmlBuffer[180] = new FmlField("MANUAL_RC_EXP_DATE", FmlField.TYPE_STRING, 9, null, 180, 200);
        this.fmlBuffer[181] = new FmlField("ROWCOUNT", FmlField.TYPE_INTEGER, -1, null, 181, 1);
        this.fmlBuffer[182] = new FmlField("MSISDN", FmlField.TYPE_STRING, 21, null, 182, 100);
        this.fmlBuffer[183] = new FmlField("NL", FmlField.TYPE_STRING, 4, null, 183, 100);
        this.fmlBuffer[184] = new FmlField("CODE", FmlField.TYPE_INTEGER, -1, null, 184, 100);
        this.fmlBuffer[185] = new FmlField("SUBSCRIBER_NO", FmlField.TYPE_STRING, 21, null, 185, 100);
        this.fmlBuffer[186] = new FmlField("GSMBUFFEATURE_CODE", FmlField.TYPE_STRING, 7, null, 186, 100);
        this.fmlBuffer[187] = new FmlField("PNPINFOBUFFROWCOUNT", FmlField.TYPE_INTEGER, -1, null, 187, 1);
        this.fmlBuffer[188] = new FmlField("NPNUMINFORECROWID", FmlField.TYPE_STRING, 19, null, 188, 500);
        this.fmlBuffer[189] = new FmlField("PORT_NUMBER", FmlField.TYPE_STRING, 21, null, 189, 500);
        this.fmlBuffer[190] = new FmlField("NPNUMINFORECEFFECTIVE_DATE", FmlField.TYPE_STRING, 15, null, 190, 500);
        this.fmlBuffer[191] = new FmlField("NPNUMINFORECSYS_CREATION_DATE", FmlField.TYPE_STRING, 15, null, 191, 500);
        this.fmlBuffer[192] = new FmlField("NPNUMINFORECSYS_UPDATE_DATE", FmlField.TYPE_STRING, 15, null, 192, 500);
        this.fmlBuffer[193] = new FmlField("NPNUMINFORECOPERATOR_ID", FmlField.TYPE_INTEGER, -1, null, 193, 500);
        this.fmlBuffer[194] = new FmlField("NPNUMINFORECAPPLICATION_ID", FmlField.TYPE_STRING, 7, null, 194, 500);
        this.fmlBuffer[195] = new FmlField("NPNUMINFORECDL_SERVICE_CODE", FmlField.TYPE_STRING, 6, null, 195, 500);
        this.fmlBuffer[196] = new FmlField("NPNUMINFORECDL_UPDATE_STAMP", FmlField.TYPE_SHORT, -1, null, 196, 500);
        this.fmlBuffer[197] = new FmlField("NPNUMINFORECEXPIRATION_DATE", FmlField.TYPE_STRING, 15, null, 197, 500);
        this.fmlBuffer[198] = new FmlField("INT_ORDER_ID", FmlField.TYPE_DOUBLE, -1, null, 198, 500);
        this.fmlBuffer[199] = new FmlField("ORG_CUSTOMER_ID", FmlField.TYPE_STRING, 61, null, 199, 500);
        this.fmlBuffer[200] = new FmlField("PORT_IND", FmlField.TYPE_BYTE, -1, null, 200, 500);
        this.fmlBuffer[201] = new FmlField("NUMBER_TYPE", FmlField.TYPE_BYTE, -1, null, 201, 500);
        this.fmlBuffer[202] = new FmlField("PORT_REQUEST_DATE", FmlField.TYPE_STRING, 15, null, 202, 500);
        this.fmlBuffer[203] = new FmlField("ORG_OPERATOR", FmlField.TYPE_STRING, 6, null, 203, 500);
        this.fmlBuffer[204] = new FmlField("NPNUMINFORECSUBSCRIBER_ID", FmlField.TYPE_INTEGER, -1, null, 204, 500);
        this.fmlBuffer[205] = new FmlField("LAST_INT_ORD_ID", FmlField.TYPE_DOUBLE, -1, null, 205, 500);
        this.fmlBuffer[206] = new FmlField("FUNCTION_PORT_IND", FmlField.TYPE_BYTE, -1, null, 206, 500);
        this.fmlBuffer[207] = new FmlField("PASSIVE_IND", FmlField.TYPE_BYTE, -1, null, 207, 500);
        this.fmlBuffer[208] = new FmlField("AUTO_CONFIRM", FmlField.TYPE_BYTE, -1, null, 208, 500);
        this.fmlBuffer[209] = new FmlField("TEMPORARY_MSISDN", FmlField.TYPE_STRING, 21, null, 209, 500);
        this.fmlBuffer[210] = new FmlField("HANDLE_MODE", FmlField.TYPE_BYTE, -1, null, 210, 500);
        this.fmlBuffer[211] = new FmlField("SEND_IND", FmlField.TYPE_BYTE, -1, null, 211, 500);
        this.fmlBuffer[212] = new FmlField("ORDID_STR", FmlField.TYPE_STRING, 21, null, 212, 500);
        this.fmlBuffer[213] = new FmlField("LAST_ORDID_STR", FmlField.TYPE_STRING, 21, null, 213, 500);
        this.fmlBuffer[214] = new FmlField("ICC", FmlField.TYPE_STRING, 61, null, 214, 500);
        this.fmlBuffer[215] = new FmlField("CUSTOMER_NAME", FmlField.TYPE_STRING, 255, null, 215, 500);
        this.fmlBuffer[216] = new FmlField("NPINFOBUFFCUSTOMER_ID", FmlField.TYPE_STRING, 61, null, 216, 500);
        this.fmlBuffer[217] = new FmlField("SERVICE_PROVIDER", FmlField.TYPE_STRING, 6, null, 217, 500);
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
     * Retrieves the value of the 'PNAMEADRBUFROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'PNAMEADRBUFROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PNAMEADRBUFROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[16].getValue(0));
    }

    /**
     * Retrieves the value of the 'LINK_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LINK_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[17].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'LINK_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[17].getCount());
    }

    /**
     * Retrieves the value of the 'LINK_BAN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LINK_BAN(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[18].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'LINK_BAN' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_BAN_size() throws FMLManipulationException {
        return (this.fmlBuffer[18].getCount());
    }

    /**
     * Retrieves the value of the 'LINK_SUBSCRIBER' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_SUBSCRIBER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LINK_SUBSCRIBER(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[19].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'LINK_SUBSCRIBER' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_SUBSCRIBER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_SUBSCRIBER_size() throws FMLManipulationException {
        return (this.fmlBuffer[19].getCount());
    }

    /**
     * Retrieves the value of the 'LINK_ROW_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_ROW_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LINK_ROW_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[20].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'LINK_ROW_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_ROW_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_ROW_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[20].getCount());
    }

    /**
     * Retrieves the value of the 'LINK_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LINK_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[21].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'LINK_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[21].getCount());
    }

    /**
     * Retrieves the value of the 'LNKRECCUSTOMER_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LNKRECCUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LNKRECCUSTOMER_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[22].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'LNKRECCUSTOMER_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'LNKRECCUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LNKRECCUSTOMER_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[22].getCount());
    }

    /**
     * Retrieves the value of the 'LNKRECBAN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LNKRECBAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LNKRECBAN(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[23].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'LNKRECBAN' field in the FML buffer.
     *
     * @return Number of values defined for 'LNKRECBAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LNKRECBAN_size() throws FMLManipulationException {
        return (this.fmlBuffer[23].getCount());
    }

    /**
     * Retrieves the value of the 'LNKRECSUBSCRIBER_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LNKRECSUBSCRIBER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LNKRECSUBSCRIBER_NO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[24].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'LNKRECSUBSCRIBER_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'LNKRECSUBSCRIBER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LNKRECSUBSCRIBER_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[24].getCount());
    }

    /**
     * Retrieves the value of the 'LINK_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LINK_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[25].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'LINK_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[25].getCount());
    }

    /**
     * Retrieves the value of the 'LNKRECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LNKRECEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LNKRECEFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[26].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'LNKRECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'LNKRECEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LNKRECEFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[26].getCount());
    }

    /**
     * Retrieves the value of the 'FOREIGN_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'FOREIGN_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_FOREIGN_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[27].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'FOREIGN_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'FOREIGN_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FOREIGN_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[27].getCount());
    }

    /**
     * Retrieves the value of the 'BILLING_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'BILLING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BILLING_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[28].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'BILLING_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'BILLING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_BILLING_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[28].getCount());
    }

    /**
     * Retrieves the value of the 'MAILING_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'MAILING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MAILING_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[29].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'MAILING_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'MAILING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MAILING_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[29].getCount());
    }

    /**
     * Retrieves the value of the 'USER_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'USER_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_USER_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[30].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'USER_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'USER_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_USER_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[30].getCount());
    }

    /**
     * Retrieves the value of the 'LINK_BILLING_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_BILLING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LINK_BILLING_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[31].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'LINK_BILLING_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_BILLING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_BILLING_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[31].getCount());
    }

    /**
     * Retrieves the value of the 'LINK_MAILING_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_MAILING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LINK_MAILING_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[32].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'LINK_MAILING_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_MAILING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_MAILING_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[32].getCount());
    }

    /**
     * Retrieves the value of the 'LINK_USER_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LINK_USER_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LINK_USER_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[33].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'LINK_USER_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'LINK_USER_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LINK_USER_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[33].getCount());
    }

    /**
     * Retrieves the value of the 'NM_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NM_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NM_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[34].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'NM_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'NM_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NM_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[34].getCount());
    }

    /**
     * Retrieves the value of the 'NM_UP_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NM_UP_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NM_UP_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[35].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'NM_UP_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'NM_UP_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NM_UP_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[35].getCount());
    }

    /**
     * Retrieves the value of the 'NM_EXPIRE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NM_EXPIRE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NM_EXPIRE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[36].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NM_EXPIRE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'NM_EXPIRE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NM_EXPIRE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[36].getCount());
    }

    /**
     * Retrieves the value of the 'NAMERECROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAMERECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NAMERECROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[37].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NAMERECROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'NAMERECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAMERECROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[37].getCount());
    }

    /**
     * Retrieves the value of the 'NAME_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAME_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NAME_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[38].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NAME_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'NAME_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAME_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[38].getCount());
    }

    /**
     * Retrieves the value of the 'NAMERECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAMERECSYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NAMERECSYS_CREATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[39].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NAMERECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'NAMERECSYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAMERECSYS_CREATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[39].getCount());
    }

    /**
     * Retrieves the value of the 'NAMERECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAMERECSYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NAMERECSYS_UPDATE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[40].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NAMERECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'NAMERECSYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAMERECSYS_UPDATE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[40].getCount());
    }

    /**
     * Retrieves the value of the 'NAMERECOPERATOR_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAMERECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NAMERECOPERATOR_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[41].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NAMERECOPERATOR_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'NAMERECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAMERECOPERATOR_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[41].getCount());
    }

    /**
     * Retrieves the value of the 'NAMERECAPPLICATION_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAMERECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NAMERECAPPLICATION_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[42].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NAMERECAPPLICATION_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'NAMERECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAMERECAPPLICATION_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[42].getCount());
    }

    /**
     * Retrieves the value of the 'NAMERECDL_SERVICE_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAMERECDL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NAMERECDL_SERVICE_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[43].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NAMERECDL_SERVICE_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'NAMERECDL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAMERECDL_SERVICE_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[43].getCount());
    }

    /**
     * Retrieves the value of the 'NAMERECDL_UPDATE_STAMP' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAMERECDL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NAMERECDL_UPDATE_STAMP(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[44].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'NAMERECDL_UPDATE_STAMP' field in the FML buffer.
     *
     * @return Number of values defined for 'NAMERECDL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAMERECDL_UPDATE_STAMP_size() throws FMLManipulationException {
        return (this.fmlBuffer[44].getCount());
    }

    /**
     * Retrieves the value of the 'CONTROL_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'CONTROL_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CONTROL_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[45].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'CONTROL_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'CONTROL_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CONTROL_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[45].getCount());
    }

    /**
     * Retrieves the value of the 'LAST_BUSINESS_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'LAST_BUSINESS_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LAST_BUSINESS_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[46].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'LAST_BUSINESS_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'LAST_BUSINESS_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LAST_BUSINESS_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[46].getCount());
    }

    /**
     * Retrieves the value of the 'FIRST_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'FIRST_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FIRST_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[47].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'FIRST_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'FIRST_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FIRST_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[47].getCount());
    }

    /**
     * Retrieves the value of the 'ADDITIONAL_TITLE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDITIONAL_TITLE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADDITIONAL_TITLE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[48].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADDITIONAL_TITLE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDITIONAL_TITLE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDITIONAL_TITLE_size() throws FMLManipulationException {
        return (this.fmlBuffer[48].getCount());
    }

    /**
     * Retrieves the value of the 'NAME_FORMAT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAME_FORMAT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NAME_FORMAT(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[49].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'NAME_FORMAT' field in the FML buffer.
     *
     * @return Number of values defined for 'NAME_FORMAT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAME_FORMAT_size() throws FMLManipulationException {
        return (this.fmlBuffer[49].getCount());
    }

    /**
     * Retrieves the value of the 'BIRTH_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'BIRTH_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BIRTH_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[50].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'BIRTH_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'BIRTH_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_BIRTH_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[50].getCount());
    }

    /**
     * Retrieves the value of the 'IDENTIFY' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'IDENTIFY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_IDENTIFY(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[51].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'IDENTIFY' field in the FML buffer.
     *
     * @return Number of values defined for 'IDENTIFY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_IDENTIFY_size() throws FMLManipulationException {
        return (this.fmlBuffer[51].getCount());
    }

    /**
     * Retrieves the value of the 'ID_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ID_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ID_TYPE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[52].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ID_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'ID_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ID_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[52].getCount());
    }

    /**
     * Retrieves the value of the 'COMP_REG_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'COMP_REG_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COMP_REG_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[53].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'COMP_REG_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'COMP_REG_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COMP_REG_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[53].getCount());
    }

    /**
     * Retrieves the value of the 'KOB' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'KOB' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_KOB(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[54].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'KOB' field in the FML buffer.
     *
     * @return Number of values defined for 'KOB' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_KOB_size() throws FMLManipulationException {
        return (this.fmlBuffer[54].getCount());
    }

    /**
     * Retrieves the value of the 'MIDDLE_INITIAL' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'MIDDLE_INITIAL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MIDDLE_INITIAL(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[55].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'MIDDLE_INITIAL' field in the FML buffer.
     *
     * @return Number of values defined for 'MIDDLE_INITIAL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MIDDLE_INITIAL_size() throws FMLManipulationException {
        return (this.fmlBuffer[55].getCount());
    }

    /**
     * Retrieves the value of the 'TELEMARKET_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'TELEMARKET_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_TELEMARKET_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[56].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'TELEMARKET_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'TELEMARKET_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_TELEMARKET_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[56].getCount());
    }

    /**
     * Retrieves the value of the 'NAMERECCONV_RUN_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAMERECCONV_RUN_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NAMERECCONV_RUN_NO(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[57].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'NAMERECCONV_RUN_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'NAMERECCONV_RUN_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAMERECCONV_RUN_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[57].getCount());
    }

    /**
     * Retrieves the value of the 'NAME_TITLE_SALUTATION' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NAME_TITLE_SALUTATION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NAME_TITLE_SALUTATION(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[58].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NAME_TITLE_SALUTATION' field in the FML buffer.
     *
     * @return Number of values defined for 'NAME_TITLE_SALUTATION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NAME_TITLE_SALUTATION_size() throws FMLManipulationException {
        return (this.fmlBuffer[58].getCount());
    }

    /**
     * Retrieves the value of the 'NATIONALITY_CD' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'NATIONALITY_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NATIONALITY_CD(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[59].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NATIONALITY_CD' field in the FML buffer.
     *
     * @return Number of values defined for 'NATIONALITY_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NATIONALITY_CD_size() throws FMLManipulationException {
        return (this.fmlBuffer[59].getCount());
    }

    /**
     * Retrieves the value of the 'GENDER' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'GENDER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_GENDER(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[60].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'GENDER' field in the FML buffer.
     *
     * @return Number of values defined for 'GENDER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_GENDER_size() throws FMLManipulationException {
        return (this.fmlBuffer[60].getCount());
    }

    /**
     * Retrieves the value of the 'MARITAL_STATUS' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'MARITAL_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MARITAL_STATUS(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[61].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'MARITAL_STATUS' field in the FML buffer.
     *
     * @return Number of values defined for 'MARITAL_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MARITAL_STATUS_size() throws FMLManipulationException {
        return (this.fmlBuffer[61].getCount());
    }

    /**
     * Retrieves the value of the 'ROLE_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ROLE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ROLE_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[62].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'ROLE_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'ROLE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ROLE_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[62].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[63].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'ADR_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[63].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_UP_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_UP_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_UP_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[64].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'ADR_UP_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_UP_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_UP_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[64].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_EXPIRE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_EXPIRE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_EXPIRE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[65].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_EXPIRE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_EXPIRE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_EXPIRE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[65].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESSRECROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESSRECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADDRESSRECROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[66].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADDRESSRECROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESSRECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESSRECROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[66].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESS_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESS_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ADDRESS_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[67].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADDRESS_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESS_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESS_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[67].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESSRECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESSRECSYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADDRESSRECSYS_CREATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[68].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADDRESSRECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESSRECSYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESSRECSYS_CREATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[68].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESSRECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESSRECSYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADDRESSRECSYS_UPDATE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[69].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADDRESSRECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESSRECSYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESSRECSYS_UPDATE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[69].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESSRECOPERATOR_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESSRECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ADDRESSRECOPERATOR_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[70].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADDRESSRECOPERATOR_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESSRECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESSRECOPERATOR_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[70].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESSRECAPPLICATION_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESSRECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADDRESSRECAPPLICATION_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[71].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADDRESSRECAPPLICATION_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESSRECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESSRECAPPLICATION_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[71].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESSRECDL_SERVICE_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESSRECDL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADDRESSRECDL_SERVICE_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[72].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADDRESSRECDL_SERVICE_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESSRECDL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESSRECDL_SERVICE_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[72].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESSRECDL_UPDATE_STAMP' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESSRECDL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ADDRESSRECDL_UPDATE_STAMP(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[73].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'ADDRESSRECDL_UPDATE_STAMP' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESSRECDL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESSRECDL_UPDATE_STAMP_size() throws FMLManipulationException {
        return (this.fmlBuffer[73].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[74].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'ADR_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[74].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_STATUS' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_STATUS(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[75].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'ADR_STATUS' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_STATUS_size() throws FMLManipulationException {
        return (this.fmlBuffer[75].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_STATUS_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_STATUS_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_STATUS_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[76].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_STATUS_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_STATUS_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_STATUS_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[76].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_SECONDARY_LN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_SECONDARY_LN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_SECONDARY_LN(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[77].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_SECONDARY_LN' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_SECONDARY_LN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_SECONDARY_LN_size() throws FMLManipulationException {
        return (this.fmlBuffer[77].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_PRIMARY_LN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_PRIMARY_LN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_PRIMARY_LN(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[78].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_PRIMARY_LN' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_PRIMARY_LN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_PRIMARY_LN_size() throws FMLManipulationException {
        return (this.fmlBuffer[78].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_CITY' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_CITY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_CITY(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[79].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_CITY' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_CITY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_CITY_size() throws FMLManipulationException {
        return (this.fmlBuffer[79].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_ZIP' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_ZIP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_ZIP(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[80].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_ZIP' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_ZIP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_ZIP_size() throws FMLManipulationException {
        return (this.fmlBuffer[80].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_HOUSE_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_HOUSE_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_HOUSE_NO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[81].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_HOUSE_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_HOUSE_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_HOUSE_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[81].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_STREET_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_STREET_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_STREET_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[82].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_STREET_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_STREET_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_STREET_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[82].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_DIRECTION' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_DIRECTION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_DIRECTION(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[83].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_DIRECTION' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_DIRECTION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_DIRECTION_size() throws FMLManipulationException {
        return (this.fmlBuffer[83].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_POB' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_POB' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_POB(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[84].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_POB' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_POB' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_POB_size() throws FMLManipulationException {
        return (this.fmlBuffer[84].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_COUNTRY' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_COUNTRY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_COUNTRY(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[85].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_COUNTRY' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_COUNTRY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_COUNTRY_size() throws FMLManipulationException {
        return (this.fmlBuffer[85].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_HOUSE_LETTER' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_HOUSE_LETTER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_HOUSE_LETTER(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[86].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_HOUSE_LETTER' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_HOUSE_LETTER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_HOUSE_LETTER_size() throws FMLManipulationException {
        return (this.fmlBuffer[86].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_STORY' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_STORY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_STORY(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[87].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_STORY' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_STORY' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_STORY_size() throws FMLManipulationException {
        return (this.fmlBuffer[87].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_DOOR_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_DOOR_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_DOOR_NO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[88].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_DOOR_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_DOOR_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_DOOR_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[88].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_EMAIL' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_EMAIL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_EMAIL(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[89].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_EMAIL' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_EMAIL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_EMAIL_size() throws FMLManipulationException {
        return (this.fmlBuffer[89].getCount());
    }

    /**
     * Retrieves the value of the 'SINCE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'SINCE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SINCE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[90].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'SINCE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'SINCE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SINCE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[90].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_DISTRICT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_DISTRICT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_DISTRICT(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[91].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_DISTRICT' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_DISTRICT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_DISTRICT_size() throws FMLManipulationException {
        return (this.fmlBuffer[91].getCount());
    }

    /**
     * Retrieves the value of the 'CO_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'CO_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CO_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[92].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'CO_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'CO_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CO_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[92].getCount());
    }

    /**
     * Retrieves the value of the 'ADDRESSRECCONV_RUN_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADDRESSRECCONV_RUN_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ADDRESSRECCONV_RUN_NO(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[93].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'ADDRESSRECCONV_RUN_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'ADDRESSRECCONV_RUN_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADDRESSRECCONV_RUN_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[93].getCount());
    }

    /**
     * Retrieves the value of the 'ACCOMMODATION_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ACCOMMODATION_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACCOMMODATION_TYPE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[94].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ACCOMMODATION_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'ACCOMMODATION_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACCOMMODATION_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[94].getCount());
    }

    /**
     * Retrieves the value of the 'COUNTY_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'COUNTY_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COUNTY_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[95].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'COUNTY_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'COUNTY_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COUNTY_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[95].getCount());
    }

    /**
     * Retrieves the value of the 'COMMUNITY_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'COMMUNITY_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COMMUNITY_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[96].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'COMMUNITY_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'COMMUNITY_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COMMUNITY_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[96].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_CO_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_CO_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_CO_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[97].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_CO_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_CO_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_CO_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[97].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_HOUSE_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_HOUSE_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_HOUSE_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[98].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_HOUSE_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_HOUSE_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_HOUSE_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[98].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P1' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P1' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P1(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[99].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_P1' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P1' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P1_size() throws FMLManipulationException {
        return (this.fmlBuffer[99].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P2' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P2' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P2(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[100].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_P2' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P2' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P2_size() throws FMLManipulationException {
        return (this.fmlBuffer[100].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P3' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P3' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P3(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[101].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_P3' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P3' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P3_size() throws FMLManipulationException {
        return (this.fmlBuffer[101].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P4' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P4' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P4(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[102].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_P4' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P4' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P4_size() throws FMLManipulationException {
        return (this.fmlBuffer[102].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P5' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P5' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P5(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[103].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_P5' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P5' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P5_size() throws FMLManipulationException {
        return (this.fmlBuffer[103].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P6' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P6' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P6(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[104].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_P6' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P6' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P6_size() throws FMLManipulationException {
        return (this.fmlBuffer[104].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P7' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P7' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P7(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[105].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_P7' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P7' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P7_size() throws FMLManipulationException {
        return (this.fmlBuffer[105].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P8' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P8' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P8(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[106].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_P8' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P8' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P8_size() throws FMLManipulationException {
        return (this.fmlBuffer[106].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P9' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P9' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P9(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[107].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_P9' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P9' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P9_size() throws FMLManipulationException {
        return (this.fmlBuffer[107].getCount());
    }

    /**
     * Retrieves the value of the 'ADR_P10' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 20).
     * @return Value of 'ADR_P10' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ADR_P10(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[108].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ADR_P10' field in the FML buffer.
     *
     * @return Number of values defined for 'ADR_P10' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ADR_P10_size() throws FMLManipulationException {
        return (this.fmlBuffer[108].getCount());
    }

    /**
     * Retrieves the value of the 'PESNBUFROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'PESNBUFROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PESNBUFROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[109].getValue(0));
    }

    /**
     * Retrieves the value of the 'EQUIPMENT_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'EQUIPMENT_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EQUIPMENT_NO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[110].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'EQUIPMENT_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'EQUIPMENT_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_EQUIPMENT_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[110].getCount());
    }

    /**
     * Retrieves the value of the 'PHD_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PHD_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PHD_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[111].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'PHD_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'PHD_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PHD_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[111].getCount());
    }

    /**
     * Retrieves the value of the 'EQUIPMENT_LEVEL' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'EQUIPMENT_LEVEL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_EQUIPMENT_LEVEL(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[112].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'EQUIPMENT_LEVEL' field in the FML buffer.
     *
     * @return Number of values defined for 'EQUIPMENT_LEVEL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_EQUIPMENT_LEVEL_size() throws FMLManipulationException {
        return (this.fmlBuffer[112].getCount());
    }

    /**
     * Retrieves the value of the 'IMSI' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'IMSI' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_IMSI(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[113].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'IMSI' field in the FML buffer.
     *
     * @return Number of values defined for 'IMSI' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_IMSI_size() throws FMLManipulationException {
        return (this.fmlBuffer[113].getCount());
    }

    /**
     * Retrieves the value of the 'PHYDEVARRAYEXPIRATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PHYDEVARRAYEXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PHYDEVARRAYEXPIRATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[114].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'PHYDEVARRAYEXPIRATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'PHYDEVARRAYEXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PHYDEVARRAYEXPIRATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[114].getCount());
    }

    /**
     * Retrieves the value of the 'PHYDEVARRAYEFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PHYDEVARRAYEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PHYDEVARRAYEFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[115].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'PHYDEVARRAYEFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'PHYDEVARRAYEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PHYDEVARRAYEFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[115].getCount());
    }

    /**
     * Retrieves the value of the 'OWNERSHIP_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'OWNERSHIP_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_OWNERSHIP_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[116].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'OWNERSHIP_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'OWNERSHIP_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_OWNERSHIP_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[116].getCount());
    }

    /**
     * Retrieves the value of the 'SW_STATE_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SW_STATE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SW_STATE_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[117].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'SW_STATE_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'SW_STATE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SW_STATE_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[117].getCount());
    }

    /**
     * Retrieves the value of the 'LAST_SW_ACTV_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'LAST_SW_ACTV_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LAST_SW_ACTV_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[118].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'LAST_SW_ACTV_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'LAST_SW_ACTV_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LAST_SW_ACTV_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[118].getCount());
    }

    /**
     * Retrieves the value of the 'NEXT_ACTV_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'NEXT_ACTV_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NEXT_ACTV_CODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[119].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'NEXT_ACTV_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'NEXT_ACTV_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NEXT_ACTV_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[119].getCount());
    }

    /**
     * Retrieves the value of the 'NEXT_ACTV_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'NEXT_ACTV_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NEXT_ACTV_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[120].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NEXT_ACTV_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'NEXT_ACTV_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NEXT_ACTV_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[120].getCount());
    }

    /**
     * Retrieves the value of the 'NEXT_ACTV_ISSUE_DT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'NEXT_ACTV_ISSUE_DT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NEXT_ACTV_ISSUE_DT(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[121].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NEXT_ACTV_ISSUE_DT' field in the FML buffer.
     *
     * @return Number of values defined for 'NEXT_ACTV_ISSUE_DT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NEXT_ACTV_ISSUE_DT_size() throws FMLManipulationException {
        return (this.fmlBuffer[121].getCount());
    }

    /**
     * Retrieves the value of the 'DEVICE_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'DEVICE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DEVICE_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[122].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'DEVICE_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'DEVICE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_DEVICE_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[122].getCount());
    }

    /**
     * Retrieves the value of the 'ESN_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ESN_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ESN_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[123].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'ESN_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'ESN_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ESN_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[123].getCount());
    }

    /**
     * Retrieves the value of the 'ITEM_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ITEM_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ITEM_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[124].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ITEM_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'ITEM_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ITEM_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[124].getCount());
    }

    /**
     * Retrieves the value of the 'POOL' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'POOL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_POOL(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[125].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'POOL' field in the FML buffer.
     *
     * @return Number of values defined for 'POOL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_POOL_size() throws FMLManipulationException {
        return (this.fmlBuffer[125].getCount());
    }

    /**
     * Retrieves the value of the 'LOCATION_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'LOCATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LOCATION_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[126].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'LOCATION_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'LOCATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LOCATION_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[126].getCount());
    }

    /**
     * Retrieves the value of the 'ACTIVITY_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ACTIVITY_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACTIVITY_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[127].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ACTIVITY_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'ACTIVITY_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACTIVITY_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[127].getCount());
    }

    /**
     * Retrieves the value of the 'ACTIVITY_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ACTIVITY_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACTIVITY_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[128].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ACTIVITY_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'ACTIVITY_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACTIVITY_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[128].getCount());
    }

    /**
     * Retrieves the value of the 'OPERATION_STATUS' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'OPERATION_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_OPERATION_STATUS(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[129].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'OPERATION_STATUS' field in the FML buffer.
     *
     * @return Number of values defined for 'OPERATION_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_OPERATION_STATUS_size() throws FMLManipulationException {
        return (this.fmlBuffer[129].getCount());
    }

    /**
     * Retrieves the value of the 'ITEM_OWNERSHIP' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ITEM_OWNERSHIP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ITEM_OWNERSHIP(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[130].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'ITEM_OWNERSHIP' field in the FML buffer.
     *
     * @return Number of values defined for 'ITEM_OWNERSHIP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ITEM_OWNERSHIP_size() throws FMLManipulationException {
        return (this.fmlBuffer[130].getCount());
    }

    /**
     * Retrieves the value of the 'ITEM_OWNERSHIP_DT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ITEM_OWNERSHIP_DT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ITEM_OWNERSHIP_DT(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[131].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ITEM_OWNERSHIP_DT' field in the FML buffer.
     *
     * @return Number of values defined for 'ITEM_OWNERSHIP_DT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ITEM_OWNERSHIP_DT_size() throws FMLManipulationException {
        return (this.fmlBuffer[131].getCount());
    }

    /**
     * Retrieves the value of the 'CURR_POSSESSION' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'CURR_POSSESSION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CURR_POSSESSION(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[132].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'CURR_POSSESSION' field in the FML buffer.
     *
     * @return Number of values defined for 'CURR_POSSESSION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CURR_POSSESSION_size() throws FMLManipulationException {
        return (this.fmlBuffer[132].getCount());
    }

    /**
     * Retrieves the value of the 'CURR_POSSESSION_DT' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'CURR_POSSESSION_DT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CURR_POSSESSION_DT(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[133].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'CURR_POSSESSION_DT' field in the FML buffer.
     *
     * @return Number of values defined for 'CURR_POSSESSION_DT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CURR_POSSESSION_DT_size() throws FMLManipulationException {
        return (this.fmlBuffer[133].getCount());
    }

    /**
     * Retrieves the value of the 'MISSING_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'MISSING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MISSING_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[134].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'MISSING_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'MISSING_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MISSING_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[134].getCount());
    }

    /**
     * Retrieves the value of the 'IN_REPAIR_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'IN_REPAIR_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_IN_REPAIR_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[135].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'IN_REPAIR_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'IN_REPAIR_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_IN_REPAIR_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[135].getCount());
    }

    /**
     * Retrieves the value of the 'IN_TRANSIT_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'IN_TRANSIT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_IN_TRANSIT_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[136].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'IN_TRANSIT_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'IN_TRANSIT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_IN_TRANSIT_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[136].getCount());
    }

    /**
     * Retrieves the value of the 'COMITED_TO_POS_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'COMITED_TO_POS_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COMITED_TO_POS_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[137].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'COMITED_TO_POS_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'COMITED_TO_POS_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COMITED_TO_POS_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[137].getCount());
    }

    /**
     * Retrieves the value of the 'COMITED_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'COMITED_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_COMITED_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[138].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'COMITED_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'COMITED_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_COMITED_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[138].getCount());
    }

    /**
     * Retrieves the value of the 'ACTIVITY_REASON' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'ACTIVITY_REASON' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACTIVITY_REASON(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[139].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ACTIVITY_REASON' field in the FML buffer.
     *
     * @return Number of values defined for 'ACTIVITY_REASON' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACTIVITY_REASON_size() throws FMLManipulationException {
        return (this.fmlBuffer[139].getCount());
    }

    /**
     * Retrieves the value of the 'UPGRADE_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'UPGRADE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_UPGRADE_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[140].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'UPGRADE_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'UPGRADE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_UPGRADE_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[140].getCount());
    }

    /**
     * Retrieves the value of the 'EXPECTED_RTRN_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'EXPECTED_RTRN_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EXPECTED_RTRN_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[141].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'EXPECTED_RTRN_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'EXPECTED_RTRN_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_EXPECTED_RTRN_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[141].getCount());
    }

    /**
     * Retrieves the value of the 'POLICE_REPORT_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'POLICE_REPORT_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_POLICE_REPORT_NO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[142].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'POLICE_REPORT_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'POLICE_REPORT_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_POLICE_REPORT_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[142].getCount());
    }

    /**
     * Retrieves the value of the 'POLICE_REPORT_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'POLICE_REPORT_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_POLICE_REPORT_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[143].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'POLICE_REPORT_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'POLICE_REPORT_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_POLICE_REPORT_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[143].getCount());
    }

    /**
     * Retrieves the value of the 'POLICE_STATION' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'POLICE_STATION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_POLICE_STATION(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[144].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'POLICE_STATION' field in the FML buffer.
     *
     * @return Number of values defined for 'POLICE_STATION' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_POLICE_STATION_size() throws FMLManipulationException {
        return (this.fmlBuffer[144].getCount());
    }

    /**
     * Retrieves the value of the 'PUK' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PUK' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PUK(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[145].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'PUK' field in the FML buffer.
     *
     * @return Number of values defined for 'PUK' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PUK_size() throws FMLManipulationException {
        return (this.fmlBuffer[145].getCount());
    }

    /**
     * Retrieves the value of the 'PUK2' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PUK2' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PUK2(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[146].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'PUK2' field in the FML buffer.
     *
     * @return Number of values defined for 'PUK2' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PUK2_size() throws FMLManipulationException {
        return (this.fmlBuffer[146].getCount());
    }

    /**
     * Retrieves the value of the 'FIRST_USED_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'FIRST_USED_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FIRST_USED_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[147].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'FIRST_USED_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'FIRST_USED_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FIRST_USED_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[147].getCount());
    }

    /**
     * Retrieves the value of the 'SIM_STATUS' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SIM_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SIM_STATUS(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[148].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'SIM_STATUS' field in the FML buffer.
     *
     * @return Number of values defined for 'SIM_STATUS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SIM_STATUS_size() throws FMLManipulationException {
        return (this.fmlBuffer[148].getCount());
    }

    /**
     * Retrieves the value of the 'SUSPEND_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SUSPEND_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUSPEND_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[149].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'SUSPEND_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'SUSPEND_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SUSPEND_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[149].getCount());
    }

    /**
     * Retrieves the value of the 'SUSPEND_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SUSPEND_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUSPEND_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[150].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'SUSPEND_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'SUSPEND_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SUSPEND_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[150].getCount());
    }

    /**
     * Retrieves the value of the 'SENT_TO_AUC_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'SENT_TO_AUC_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SENT_TO_AUC_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[151].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'SENT_TO_AUC_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'SENT_TO_AUC_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SENT_TO_AUC_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[151].getCount());
    }

    /**
     * Retrieves the value of the 'HLR_CD' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'HLR_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_HLR_CD(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[152].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'HLR_CD' field in the FML buffer.
     *
     * @return Number of values defined for 'HLR_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_HLR_CD_size() throws FMLManipulationException {
        return (this.fmlBuffer[152].getCount());
    }

    /**
     * Retrieves the value of the 'K4ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'K4ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_K4ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[153].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'K4ID' field in the FML buffer.
     *
     * @return Number of values defined for 'K4ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_K4ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[153].getCount());
    }

    /**
     * Retrieves the value of the 'PHYDEVARRAYDEALER_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 50).
     * @return Value of 'PHYDEVARRAYDEALER_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PHYDEVARRAYDEALER_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[154].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'PHYDEVARRAYDEALER_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'PHYDEVARRAYDEALER_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PHYDEVARRAYDEALER_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[154].getCount());
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'PSOCFTRBUFROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PSOCFTRBUFROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[155].getValue(0));
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSOCFTRBUFROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PSOCFTRBUFROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[156].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'PSOCFTRBUFROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'PSOCFTRBUFROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSOCFTRBUFROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[156].getCount());
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFSOC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSOCFTRBUFSOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PSOCFTRBUFSOC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[157].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'PSOCFTRBUFSOC' field in the FML buffer.
     *
     * @return Number of values defined for 'PSOCFTRBUFSOC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSOCFTRBUFSOC_size() throws FMLManipulationException {
        return (this.fmlBuffer[157].getCount());
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFSOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSOCFTRBUFSOC_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PSOCFTRBUFSOC_EFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[158].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'PSOCFTRBUFSOC_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'PSOCFTRBUFSOC_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSOCFTRBUFSOC_EFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[158].getCount());
    }

    /**
     * Retrieves the value of the 'FEATURE_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FEATURE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FEATURE_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[159].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'FEATURE_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FEATURE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FEATURE_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[159].getCount());
    }

    /**
     * Retrieves the value of the 'MPS_FTR_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'MPS_FTR_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MPS_FTR_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[160].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'MPS_FTR_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'MPS_FTR_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MPS_FTR_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[160].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_EFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[161].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'FTR_EFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_EFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[161].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_EXPIRATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_EXPIRATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[162].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'FTR_EXPIRATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_EXPIRATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[162].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_EFF_RSN_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_EFF_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_EFF_RSN_CODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[163].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'FTR_EFF_RSN_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_EFF_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_EFF_RSN_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[163].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_EXP_RSN_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_EXP_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_EXP_RSN_CODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[164].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'FTR_EXP_RSN_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_EXP_RSN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_EXP_RSN_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[164].getCount());
    }

    /**
     * Retrieves the value of the 'SERVICE_FTR_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'SERVICE_FTR_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_SERVICE_FTR_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[165].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'SERVICE_FTR_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'SERVICE_FTR_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SERVICE_FTR_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[165].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[166].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'FTR_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[166].getCount());
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFSOC_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSOCFTRBUFSOC_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PSOCFTRBUFSOC_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[167].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'PSOCFTRBUFSOC_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'PSOCFTRBUFSOC_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSOCFTRBUFSOC_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[167].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_SUB_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_SUB_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_SUB_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[168].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'FTR_SUB_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_SUB_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_SUB_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[168].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_ADD_PARAM' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_ADD_PARAM' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_ADD_PARAM(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[169].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'FTR_ADD_PARAM' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_ADD_PARAM' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_ADD_PARAM_size() throws FMLManipulationException {
        return (this.fmlBuffer[169].getCount());
    }

    /**
     * Retrieves the value of the 'FEATURE_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FEATURE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FEATURE_TYPE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[170].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'FEATURE_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'FEATURE_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FEATURE_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[170].getCount());
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFPRODUCT_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSOCFTRBUFPRODUCT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PSOCFTRBUFPRODUCT_TYPE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[171].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'PSOCFTRBUFPRODUCT_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'PSOCFTRBUFPRODUCT_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSOCFTRBUFPRODUCT_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[171].getCount());
    }

    /**
     * Retrieves the value of the 'PSOCFTRBUFCAMPAIGN_SEQ' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'PSOCFTRBUFCAMPAIGN_SEQ' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PSOCFTRBUFCAMPAIGN_SEQ(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[172].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'PSOCFTRBUFCAMPAIGN_SEQ' field in the FML buffer.
     *
     * @return Number of values defined for 'PSOCFTRBUFCAMPAIGN_SEQ' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PSOCFTRBUFCAMPAIGN_SEQ_size() throws FMLManipulationException {
        return (this.fmlBuffer[172].getCount());
    }

    /**
     * Retrieves the value of the 'FTR_SPECIAL_TELNO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'FTR_SPECIAL_TELNO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FTR_SPECIAL_TELNO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[173].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'FTR_SPECIAL_TELNO' field in the FML buffer.
     *
     * @return Number of values defined for 'FTR_SPECIAL_TELNO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FTR_SPECIAL_TELNO_size() throws FMLManipulationException {
        return (this.fmlBuffer[173].getCount());
    }

    /**
     * Retrieves the value of the 'SWITCH_ACT_NEEDED' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'SWITCH_ACT_NEEDED' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SWITCH_ACT_NEEDED(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[174].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'SWITCH_ACT_NEEDED' field in the FML buffer.
     *
     * @return Number of values defined for 'SWITCH_ACT_NEEDED' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SWITCH_ACT_NEEDED_size() throws FMLManipulationException {
        return (this.fmlBuffer[174].getCount());
    }

    /**
     * Retrieves the value of the 'SWITCH_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'SWITCH_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SWITCH_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[175].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'SWITCH_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'SWITCH_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SWITCH_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[175].getCount());
    }

    /**
     * Retrieves the value of the 'MSISDN_CRITERIA' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'MSISDN_CRITERIA' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MSISDN_CRITERIA(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[176].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'MSISDN_CRITERIA' field in the FML buffer.
     *
     * @return Number of values defined for 'MSISDN_CRITERIA' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MSISDN_CRITERIA_size() throws FMLManipulationException {
        return (this.fmlBuffer[176].getCount());
    }

    /**
     * Retrieves the value of the 'TN_CLASS_CD' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'TN_CLASS_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_TN_CLASS_CD(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[177].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'TN_CLASS_CD' field in the FML buffer.
     *
     * @return Number of values defined for 'TN_CLASS_CD' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_TN_CLASS_CD_size() throws FMLManipulationException {
        return (this.fmlBuffer[177].getCount());
    }

    /**
     * Retrieves the value of the 'ACTION_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'ACTION_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ACTION_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[178].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'ACTION_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'ACTION_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ACTION_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[178].getCount());
    }

    /**
     * Retrieves the value of the 'MANUAL_RC_RATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'MANUAL_RC_RATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_MANUAL_RC_RATE(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[179].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'MANUAL_RC_RATE' field in the FML buffer.
     *
     * @return Number of values defined for 'MANUAL_RC_RATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MANUAL_RC_RATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[179].getCount());
    }

    /**
     * Retrieves the value of the 'MANUAL_RC_EXP_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 200).
     * @return Value of 'MANUAL_RC_EXP_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MANUAL_RC_EXP_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[180].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'MANUAL_RC_EXP_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'MANUAL_RC_EXP_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MANUAL_RC_EXP_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[180].getCount());
    }

    /**
     * Retrieves the value of the 'ROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'ROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_ROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[181].getValue(0));
    }

    /**
     * Retrieves the value of the 'MSISDN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'MSISDN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_MSISDN(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[182].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'MSISDN' field in the FML buffer.
     *
     * @return Number of values defined for 'MSISDN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_MSISDN_size() throws FMLManipulationException {
        return (this.fmlBuffer[182].getCount());
    }

    /**
     * Retrieves the value of the 'NL' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'NL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NL(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[183].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NL' field in the FML buffer.
     *
     * @return Number of values defined for 'NL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NL_size() throws FMLManipulationException {
        return (this.fmlBuffer[183].getCount());
    }

    /**
     * Retrieves the value of the 'CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CODE(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[184].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[184].getCount());
    }

    /**
     * Retrieves the value of the 'SUBSCRIBER_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'SUBSCRIBER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SUBSCRIBER_NO(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[185].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'SUBSCRIBER_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'SUBSCRIBER_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SUBSCRIBER_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[185].getCount());
    }

    /**
     * Retrieves the value of the 'GSMBUFFEATURE_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'GSMBUFFEATURE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_GSMBUFFEATURE_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[186].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'GSMBUFFEATURE_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'GSMBUFFEATURE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_GSMBUFFEATURE_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[186].getCount());
    }

    /**
     * Retrieves the value of the 'PNPINFOBUFFROWCOUNT' field in the FML buffer.
     *
     * @return Value of 'PNPINFOBUFFROWCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PNPINFOBUFFROWCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[187].getValue(0));
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPNUMINFORECROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[188].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NPNUMINFORECROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[188].getCount());
    }

    /**
     * Retrieves the value of the 'PORT_NUMBER' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'PORT_NUMBER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PORT_NUMBER(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[189].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'PORT_NUMBER' field in the FML buffer.
     *
     * @return Number of values defined for 'PORT_NUMBER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PORT_NUMBER_size() throws FMLManipulationException {
        return (this.fmlBuffer[189].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPNUMINFORECEFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[190].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NPNUMINFORECEFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECEFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[190].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECSYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPNUMINFORECSYS_CREATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[191].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NPNUMINFORECSYS_CREATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECSYS_CREATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECSYS_CREATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[191].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECSYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPNUMINFORECSYS_UPDATE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[192].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NPNUMINFORECSYS_UPDATE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECSYS_UPDATE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECSYS_UPDATE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[192].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECOPERATOR_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NPNUMINFORECOPERATOR_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[193].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NPNUMINFORECOPERATOR_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECOPERATOR_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECOPERATOR_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[193].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECAPPLICATION_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPNUMINFORECAPPLICATION_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[194].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NPNUMINFORECAPPLICATION_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECAPPLICATION_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECAPPLICATION_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[194].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECDL_SERVICE_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECDL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPNUMINFORECDL_SERVICE_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[195].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NPNUMINFORECDL_SERVICE_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECDL_SERVICE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECDL_SERVICE_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[195].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECDL_UPDATE_STAMP' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECDL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NPNUMINFORECDL_UPDATE_STAMP(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[196].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'NPNUMINFORECDL_UPDATE_STAMP' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECDL_UPDATE_STAMP' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECDL_UPDATE_STAMP_size() throws FMLManipulationException {
        return (this.fmlBuffer[196].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECEXPIRATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECEXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPNUMINFORECEXPIRATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[197].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NPNUMINFORECEXPIRATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECEXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECEXPIRATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[197].getCount());
    }

    /**
     * Retrieves the value of the 'INT_ORDER_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'INT_ORDER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_INT_ORDER_ID(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[198].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'INT_ORDER_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'INT_ORDER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_INT_ORDER_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[198].getCount());
    }

    /**
     * Retrieves the value of the 'ORG_CUSTOMER_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'ORG_CUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ORG_CUSTOMER_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[199].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ORG_CUSTOMER_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'ORG_CUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ORG_CUSTOMER_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[199].getCount());
    }

    /**
     * Retrieves the value of the 'PORT_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'PORT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PORT_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[200].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'PORT_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'PORT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PORT_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[200].getCount());
    }

    /**
     * Retrieves the value of the 'NUMBER_TYPE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NUMBER_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NUMBER_TYPE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[201].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'NUMBER_TYPE' field in the FML buffer.
     *
     * @return Number of values defined for 'NUMBER_TYPE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NUMBER_TYPE_size() throws FMLManipulationException {
        return (this.fmlBuffer[201].getCount());
    }

    /**
     * Retrieves the value of the 'PORT_REQUEST_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'PORT_REQUEST_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PORT_REQUEST_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[202].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'PORT_REQUEST_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'PORT_REQUEST_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PORT_REQUEST_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[202].getCount());
    }

    /**
     * Retrieves the value of the 'ORG_OPERATOR' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'ORG_OPERATOR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ORG_OPERATOR(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[203].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ORG_OPERATOR' field in the FML buffer.
     *
     * @return Number of values defined for 'ORG_OPERATOR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ORG_OPERATOR_size() throws FMLManipulationException {
        return (this.fmlBuffer[203].getCount());
    }

    /**
     * Retrieves the value of the 'NPNUMINFORECSUBSCRIBER_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPNUMINFORECSUBSCRIBER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NPNUMINFORECSUBSCRIBER_ID(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[204].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NPNUMINFORECSUBSCRIBER_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'NPNUMINFORECSUBSCRIBER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPNUMINFORECSUBSCRIBER_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[204].getCount());
    }

    /**
     * Retrieves the value of the 'LAST_INT_ORD_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'LAST_INT_ORD_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Double get_LAST_INT_ORD_ID(int nIndex) throws FMLManipulationException {
        return ((Double) this.fmlBuffer[205].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'LAST_INT_ORD_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'LAST_INT_ORD_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LAST_INT_ORD_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[205].getCount());
    }

    /**
     * Retrieves the value of the 'FUNCTION_PORT_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'FUNCTION_PORT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FUNCTION_PORT_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[206].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'FUNCTION_PORT_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'FUNCTION_PORT_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_FUNCTION_PORT_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[206].getCount());
    }

    /**
     * Retrieves the value of the 'PASSIVE_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'PASSIVE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PASSIVE_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[207].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'PASSIVE_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'PASSIVE_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PASSIVE_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[207].getCount());
    }

    /**
     * Retrieves the value of the 'AUTO_CONFIRM' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'AUTO_CONFIRM' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_AUTO_CONFIRM(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[208].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'AUTO_CONFIRM' field in the FML buffer.
     *
     * @return Number of values defined for 'AUTO_CONFIRM' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_AUTO_CONFIRM_size() throws FMLManipulationException {
        return (this.fmlBuffer[208].getCount());
    }

    /**
     * Retrieves the value of the 'TEMPORARY_MSISDN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'TEMPORARY_MSISDN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_TEMPORARY_MSISDN(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[209].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'TEMPORARY_MSISDN' field in the FML buffer.
     *
     * @return Number of values defined for 'TEMPORARY_MSISDN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_TEMPORARY_MSISDN_size() throws FMLManipulationException {
        return (this.fmlBuffer[209].getCount());
    }

    /**
     * Retrieves the value of the 'HANDLE_MODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'HANDLE_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_HANDLE_MODE(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[210].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'HANDLE_MODE' field in the FML buffer.
     *
     * @return Number of values defined for 'HANDLE_MODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_HANDLE_MODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[210].getCount());
    }

    /**
     * Retrieves the value of the 'SEND_IND' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'SEND_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SEND_IND(int nIndex) throws FMLManipulationException {
        return (TypeConverter.byteToString((Byte) this.fmlBuffer[211].getValue(nIndex)));
    }
    /**
     * Retrieves number of values defined for 'SEND_IND' field in the FML buffer.
     *
     * @return Number of values defined for 'SEND_IND' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SEND_IND_size() throws FMLManipulationException {
        return (this.fmlBuffer[211].getCount());
    }

    /**
     * Retrieves the value of the 'ORDID_STR' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'ORDID_STR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ORDID_STR(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[212].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ORDID_STR' field in the FML buffer.
     *
     * @return Number of values defined for 'ORDID_STR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ORDID_STR_size() throws FMLManipulationException {
        return (this.fmlBuffer[212].getCount());
    }

    /**
     * Retrieves the value of the 'LAST_ORDID_STR' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'LAST_ORDID_STR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LAST_ORDID_STR(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[213].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'LAST_ORDID_STR' field in the FML buffer.
     *
     * @return Number of values defined for 'LAST_ORDID_STR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_LAST_ORDID_STR_size() throws FMLManipulationException {
        return (this.fmlBuffer[213].getCount());
    }

    /**
     * Retrieves the value of the 'ICC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'ICC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ICC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[214].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'ICC' field in the FML buffer.
     *
     * @return Number of values defined for 'ICC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_ICC_size() throws FMLManipulationException {
        return (this.fmlBuffer[214].getCount());
    }

    /**
     * Retrieves the value of the 'CUSTOMER_NAME' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'CUSTOMER_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CUSTOMER_NAME(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[215].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'CUSTOMER_NAME' field in the FML buffer.
     *
     * @return Number of values defined for 'CUSTOMER_NAME' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_CUSTOMER_NAME_size() throws FMLManipulationException {
        return (this.fmlBuffer[215].getCount());
    }

    /**
     * Retrieves the value of the 'NPINFOBUFFCUSTOMER_ID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'NPINFOBUFFCUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_NPINFOBUFFCUSTOMER_ID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[216].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'NPINFOBUFFCUSTOMER_ID' field in the FML buffer.
     *
     * @return Number of values defined for 'NPINFOBUFFCUSTOMER_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_NPINFOBUFFCUSTOMER_ID_size() throws FMLManipulationException {
        return (this.fmlBuffer[216].getCount());
    }

    /**
     * Retrieves the value of the 'SERVICE_PROVIDER' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 500).
     * @return Value of 'SERVICE_PROVIDER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SERVICE_PROVIDER(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[217].getValue(nIndex));
    }
    /**
     * Retrieves number of values defined for 'SERVICE_PROVIDER' field in the FML buffer.
     *
     * @return Number of values defined for 'SERVICE_PROVIDER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_SERVICE_PROVIDER_size() throws FMLManipulationException {
        return (this.fmlBuffer[217].getCount());
    }
}