package no.netcom.ninja.core.system.tuxedo.service.parameters;

import bea.jolt.pool.Result;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;

/**
 * @author  Ninja - Generated by Ninja tools
 */
public class GnGtUtcDscOutput extends ServiceOutput {

    /**
     * Creates a new instance of GnGtUtcDscOutput.
     *
     * @throws FMLManipulationException
     */
    public GnGtUtcDscOutput(int nApplicationStatus) throws FMLManipulationException {
        createFmlBuffer();
        setApplicationCode(nApplicationStatus);
    }

    public GnGtUtcDscOutput() {
    }

    /**
     * Creates a new instance of GnGtUtcDscOutput.
     *
     * @param ds Output dataset from GnGtUtcDsc service.
     * @throws FMLManipulationException
     */
    public GnGtUtcDscOutput(Result ds) throws FMLManipulationException {
        createFmlBuffer();
        populateFmlBuffer(ds);
    }

    /**
     * Populates the FML buffer.
     *
     * @throws FMLManipulationException
     */
    private void createFmlBuffer() throws FMLManipulationException {
        this.fmlBuffer = new FmlField[53];
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
        this.fmlBuffer[17] = new FmlField("BHD_SEQ_NO", FmlField.TYPE_INTEGER, -1, null, 17, 1);
        this.fmlBuffer[18] = new FmlField("TREE_ROOT_BAN", FmlField.TYPE_INTEGER, -1, null, 18, 1);
        this.fmlBuffer[19] = new FmlField("UTC_PLAN_CODE", FmlField.TYPE_STRING, 10, null, 19, 1);
        this.fmlBuffer[20] = new FmlField("EFFECTIVE_DATE", FmlField.TYPE_STRING, 9, null, 20, 1);
        this.fmlBuffer[21] = new FmlField("TREE_LEVEL", FmlField.TYPE_SHORT, -1, null, 21, 1);
        this.fmlBuffer[22] = new FmlField("BAN", FmlField.TYPE_INTEGER, -1, null, 22, 1);
        this.fmlBuffer[23] = new FmlField("CTN", FmlField.TYPE_STRING, 21, null, 23, 1);
        this.fmlBuffer[24] = new FmlField("EXPIRATION_DATE", FmlField.TYPE_STRING, 9, null, 24, 1);
        this.fmlBuffer[25] = new FmlField("UTC_PLAN_DESC", FmlField.TYPE_STRING, 31, null, 25, 1);
        this.fmlBuffer[26] = new FmlField("BANDISCROWID", FmlField.TYPE_STRING, 19, null, 26, 1);
        this.fmlBuffer[27] = new FmlField("DISCOUNT_GROUP_CODE", FmlField.TYPE_STRING, 7, null, 27, 1);
        this.fmlBuffer[28] = new FmlField("DISC_GROUP_DESC", FmlField.TYPE_STRING, 41, null, 28, 1);
        this.fmlBuffer[29] = new FmlField("BANDISCTREE_LEVEL", FmlField.TYPE_SHORT, -1, null, 29, 1);
        this.fmlBuffer[30] = new FmlField("BANDISCEFFECTIVE_DATE", FmlField.TYPE_STRING, 9, null, 30, 1);
        this.fmlBuffer[31] = new FmlField("BANDISCEXPIRATION_DATE", FmlField.TYPE_STRING, 9, null, 31, 1);
        this.fmlBuffer[32] = new FmlField("POTENTIAL_SUBS_NO", FmlField.TYPE_INTEGER, -1, null, 32, 1);
        this.fmlBuffer[33] = new FmlField("LAST_POTENT_DATE", FmlField.TYPE_STRING, 9, null, 33, 1);
        this.fmlBuffer[34] = new FmlField("TREEDISCROWID", FmlField.TYPE_STRING, 19, null, 34, 1);
        this.fmlBuffer[35] = new FmlField("TREEDISCDISCOUNT_GROUP_CODE", FmlField.TYPE_STRING, 7, null, 35, 1);
        this.fmlBuffer[36] = new FmlField("TREEDISCDISC_GROUP_DESC", FmlField.TYPE_STRING, 41, null, 36, 1);
        this.fmlBuffer[37] = new FmlField("TREEDISCTREE_LEVEL", FmlField.TYPE_SHORT, -1, null, 37, 1);
        this.fmlBuffer[38] = new FmlField("TREEDISCEFFECTIVE_DATE", FmlField.TYPE_STRING, 9, null, 38, 1);
        this.fmlBuffer[39] = new FmlField("TREEDISCEXPIRATION_DATE", FmlField.TYPE_STRING, 9, null, 39, 1);
        this.fmlBuffer[40] = new FmlField("TREEDISCPOTENTIAL_SUBS_NO", FmlField.TYPE_INTEGER, -1, null, 40, 1);
        this.fmlBuffer[41] = new FmlField("TREEDISCLAST_POTENT_DATE", FmlField.TYPE_STRING, 9, null, 41, 1);
        this.fmlBuffer[42] = new FmlField("CTNCOUNT", FmlField.TYPE_INTEGER, -1, null, 42, 1);
        this.fmlBuffer[43] = new FmlField("PGNCTNUTCARRAYROWID", FmlField.TYPE_STRING, 19, null, 43, 100);
        this.fmlBuffer[44] = new FmlField("PGNCTNUTCARRAYBHD_SEQ_NO", FmlField.TYPE_INTEGER, -1, null, 44, 100);
        this.fmlBuffer[45] = new FmlField("PGNCTNUTCARRAYTREE_ROOT_BAN", FmlField.TYPE_INTEGER, -1, null, 45, 100);
        this.fmlBuffer[46] = new FmlField("PGNCTNUTCARRAYUTC_PLAN_CODE", FmlField.TYPE_STRING, 10, null, 46, 100);
        this.fmlBuffer[47] = new FmlField("PGNCTNUTCARRAYEFFECTIVE_DATE", FmlField.TYPE_STRING, 9, null, 47, 100);
        this.fmlBuffer[48] = new FmlField("PGNCTNUTCARRAYTREE_LEVEL", FmlField.TYPE_SHORT, -1, null, 48, 100);
        this.fmlBuffer[49] = new FmlField("PGNCTNUTCARRAYBAN", FmlField.TYPE_INTEGER, -1, null, 49, 100);
        this.fmlBuffer[50] = new FmlField("PGNCTNUTCARRAYCTN", FmlField.TYPE_STRING, 21, null, 50, 100);
        this.fmlBuffer[51] = new FmlField("PGNCTNUTCARRAYEXPIRATION_DATE", FmlField.TYPE_STRING, 9, null, 51, 100);
        this.fmlBuffer[52] = new FmlField("PGNCTNUTCARRAYUTC_PLAN_DESC", FmlField.TYPE_STRING, 31, null, 52, 100);
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
     * Retrieves the value of the 'BHD_SEQ_NO' field in the FML buffer.
     *
     * @return Value of 'BHD_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BHD_SEQ_NO() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[17].getValue(0));
    }

    /**
     * Retrieves the value of the 'TREE_ROOT_BAN' field in the FML buffer.
     *
     * @return Value of 'TREE_ROOT_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_TREE_ROOT_BAN() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[18].getValue(0));
    }

    /**
     * Retrieves the value of the 'UTC_PLAN_CODE' field in the FML buffer.
     *
     * @return Value of 'UTC_PLAN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_UTC_PLAN_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[19].getValue(0));
    }

    /**
     * Retrieves the value of the 'EFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Value of 'EFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EFFECTIVE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[20].getValue(0));
    }

    /**
     * Retrieves the value of the 'TREE_LEVEL' field in the FML buffer.
     *
     * @return Value of 'TREE_LEVEL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_TREE_LEVEL() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[21].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BAN' field in the FML buffer.
     *
     * @return Value of 'BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BAN() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[22].getValue(0));
    }

    /**
     * Retrieves the value of the 'CTN' field in the FML buffer.
     *
     * @return Value of 'CTN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CTN() throws FMLManipulationException {
        return ((String) this.fmlBuffer[23].getValue(0));
    }

    /**
     * Retrieves the value of the 'EXPIRATION_DATE' field in the FML buffer.
     *
     * @return Value of 'EXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_EXPIRATION_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[24].getValue(0));
    }

    /**
     * Retrieves the value of the 'UTC_PLAN_DESC' field in the FML buffer.
     *
     * @return Value of 'UTC_PLAN_DESC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_UTC_PLAN_DESC() throws FMLManipulationException {
        return ((String) this.fmlBuffer[25].getValue(0));
    }

    /**
     * Retrieves the value of the 'BANDISCROWID' field in the FML buffer.
     *
     * @return Value of 'BANDISCROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BANDISCROWID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[26].getValue(0));
    }

    /**
     * Retrieves the value of the 'DISCOUNT_GROUP_CODE' field in the FML buffer.
     *
     * @return Value of 'DISCOUNT_GROUP_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DISCOUNT_GROUP_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[27].getValue(0));
    }

    /**
     * Retrieves the value of the 'DISC_GROUP_DESC' field in the FML buffer.
     *
     * @return Value of 'DISC_GROUP_DESC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_DISC_GROUP_DESC() throws FMLManipulationException {
        return ((String) this.fmlBuffer[28].getValue(0));
    }

    /**
     * Retrieves the value of the 'BANDISCTREE_LEVEL' field in the FML buffer.
     *
     * @return Value of 'BANDISCTREE_LEVEL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_BANDISCTREE_LEVEL() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[29].getValue(0)));
    }

    /**
     * Retrieves the value of the 'BANDISCEFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Value of 'BANDISCEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BANDISCEFFECTIVE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[30].getValue(0));
    }

    /**
     * Retrieves the value of the 'BANDISCEXPIRATION_DATE' field in the FML buffer.
     *
     * @return Value of 'BANDISCEXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_BANDISCEXPIRATION_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[31].getValue(0));
    }

    /**
     * Retrieves the value of the 'POTENTIAL_SUBS_NO' field in the FML buffer.
     *
     * @return Value of 'POTENTIAL_SUBS_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_POTENTIAL_SUBS_NO() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[32].getValue(0));
    }

    /**
     * Retrieves the value of the 'LAST_POTENT_DATE' field in the FML buffer.
     *
     * @return Value of 'LAST_POTENT_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LAST_POTENT_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[33].getValue(0));
    }

    /**
     * Retrieves the value of the 'TREEDISCROWID' field in the FML buffer.
     *
     * @return Value of 'TREEDISCROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_TREEDISCROWID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[34].getValue(0));
    }

    /**
     * Retrieves the value of the 'TREEDISCDISCOUNT_GROUP_CODE' field in the FML buffer.
     *
     * @return Value of 'TREEDISCDISCOUNT_GROUP_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_TREEDISCDISCOUNT_GROUP_CODE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[35].getValue(0));
    }

    /**
     * Retrieves the value of the 'TREEDISCDISC_GROUP_DESC' field in the FML buffer.
     *
     * @return Value of 'TREEDISCDISC_GROUP_DESC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_TREEDISCDISC_GROUP_DESC() throws FMLManipulationException {
        return ((String) this.fmlBuffer[36].getValue(0));
    }

    /**
     * Retrieves the value of the 'TREEDISCTREE_LEVEL' field in the FML buffer.
     *
     * @return Value of 'TREEDISCTREE_LEVEL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_TREEDISCTREE_LEVEL() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[37].getValue(0)));
    }

    /**
     * Retrieves the value of the 'TREEDISCEFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Value of 'TREEDISCEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_TREEDISCEFFECTIVE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[38].getValue(0));
    }

    /**
     * Retrieves the value of the 'TREEDISCEXPIRATION_DATE' field in the FML buffer.
     *
     * @return Value of 'TREEDISCEXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_TREEDISCEXPIRATION_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[39].getValue(0));
    }

    /**
     * Retrieves the value of the 'TREEDISCPOTENTIAL_SUBS_NO' field in the FML buffer.
     *
     * @return Value of 'TREEDISCPOTENTIAL_SUBS_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_TREEDISCPOTENTIAL_SUBS_NO() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[40].getValue(0));
    }

    /**
     * Retrieves the value of the 'TREEDISCLAST_POTENT_DATE' field in the FML buffer.
     *
     * @return Value of 'TREEDISCLAST_POTENT_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_TREEDISCLAST_POTENT_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[41].getValue(0));
    }

    /**
     * Retrieves the value of the 'CTNCOUNT' field in the FML buffer.
     *
     * @return Value of 'CTNCOUNT' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CTNCOUNT() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[42].getValue(0));
    }

    /**
     * Retrieves the value of the 'PGNCTNUTCARRAYROWID' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'PGNCTNUTCARRAYROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PGNCTNUTCARRAYROWID(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[43].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'PGNCTNUTCARRAYROWID' field in the FML buffer.
     *
     * @return Number of values defined for 'PGNCTNUTCARRAYROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PGNCTNUTCARRAYROWID_size() throws FMLManipulationException {
        return (this.fmlBuffer[43].getCount());
    }

    /**
     * Retrieves the value of the 'PGNCTNUTCARRAYBHD_SEQ_NO' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'PGNCTNUTCARRAYBHD_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PGNCTNUTCARRAYBHD_SEQ_NO(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[44].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'PGNCTNUTCARRAYBHD_SEQ_NO' field in the FML buffer.
     *
     * @return Number of values defined for 'PGNCTNUTCARRAYBHD_SEQ_NO' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PGNCTNUTCARRAYBHD_SEQ_NO_size() throws FMLManipulationException {
        return (this.fmlBuffer[44].getCount());
    }

    /**
     * Retrieves the value of the 'PGNCTNUTCARRAYTREE_ROOT_BAN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'PGNCTNUTCARRAYTREE_ROOT_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PGNCTNUTCARRAYTREE_ROOT_BAN(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[45].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'PGNCTNUTCARRAYTREE_ROOT_BAN' field in the FML buffer.
     *
     * @return Number of values defined for 'PGNCTNUTCARRAYTREE_ROOT_BAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PGNCTNUTCARRAYTREE_ROOT_BAN_size() throws FMLManipulationException {
        return (this.fmlBuffer[45].getCount());
    }

    /**
     * Retrieves the value of the 'PGNCTNUTCARRAYUTC_PLAN_CODE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'PGNCTNUTCARRAYUTC_PLAN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PGNCTNUTCARRAYUTC_PLAN_CODE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[46].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'PGNCTNUTCARRAYUTC_PLAN_CODE' field in the FML buffer.
     *
     * @return Number of values defined for 'PGNCTNUTCARRAYUTC_PLAN_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PGNCTNUTCARRAYUTC_PLAN_CODE_size() throws FMLManipulationException {
        return (this.fmlBuffer[46].getCount());
    }

    /**
     * Retrieves the value of the 'PGNCTNUTCARRAYEFFECTIVE_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'PGNCTNUTCARRAYEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PGNCTNUTCARRAYEFFECTIVE_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[47].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'PGNCTNUTCARRAYEFFECTIVE_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'PGNCTNUTCARRAYEFFECTIVE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PGNCTNUTCARRAYEFFECTIVE_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[47].getCount());
    }

    /**
     * Retrieves the value of the 'PGNCTNUTCARRAYTREE_LEVEL' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'PGNCTNUTCARRAYTREE_LEVEL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PGNCTNUTCARRAYTREE_LEVEL(int nIndex) throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[48].getValue(nIndex)));
    }

    /**
     * Retrieves number of values defined for 'PGNCTNUTCARRAYTREE_LEVEL' field in the FML buffer.
     *
     * @return Number of values defined for 'PGNCTNUTCARRAYTREE_LEVEL' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PGNCTNUTCARRAYTREE_LEVEL_size() throws FMLManipulationException {
        return (this.fmlBuffer[48].getCount());
    }

    /**
     * Retrieves the value of the 'PGNCTNUTCARRAYBAN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'PGNCTNUTCARRAYBAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PGNCTNUTCARRAYBAN(int nIndex) throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[49].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'PGNCTNUTCARRAYBAN' field in the FML buffer.
     *
     * @return Number of values defined for 'PGNCTNUTCARRAYBAN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PGNCTNUTCARRAYBAN_size() throws FMLManipulationException {
        return (this.fmlBuffer[49].getCount());
    }

    /**
     * Retrieves the value of the 'PGNCTNUTCARRAYCTN' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'PGNCTNUTCARRAYCTN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PGNCTNUTCARRAYCTN(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[50].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'PGNCTNUTCARRAYCTN' field in the FML buffer.
     *
     * @return Number of values defined for 'PGNCTNUTCARRAYCTN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PGNCTNUTCARRAYCTN_size() throws FMLManipulationException {
        return (this.fmlBuffer[50].getCount());
    }

    /**
     * Retrieves the value of the 'PGNCTNUTCARRAYEXPIRATION_DATE' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'PGNCTNUTCARRAYEXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PGNCTNUTCARRAYEXPIRATION_DATE(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[51].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'PGNCTNUTCARRAYEXPIRATION_DATE' field in the FML buffer.
     *
     * @return Number of values defined for 'PGNCTNUTCARRAYEXPIRATION_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PGNCTNUTCARRAYEXPIRATION_DATE_size() throws FMLManipulationException {
        return (this.fmlBuffer[51].getCount());
    }

    /**
     * Retrieves the value of the 'PGNCTNUTCARRAYUTC_PLAN_DESC' field in the FML buffer.
     *
     * @param nIndex Sequence of value to be returned (valid values: 0 to 100).
     * @return Value of 'PGNCTNUTCARRAYUTC_PLAN_DESC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PGNCTNUTCARRAYUTC_PLAN_DESC(int nIndex) throws FMLManipulationException {
        return ((String) this.fmlBuffer[52].getValue(nIndex));
    }

    /**
     * Retrieves number of values defined for 'PGNCTNUTCARRAYUTC_PLAN_DESC' field in the FML buffer.
     *
     * @return Number of values defined for 'PGNCTNUTCARRAYUTC_PLAN_DESC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public int get_PGNCTNUTCARRAYUTC_PLAN_DESC_size() throws FMLManipulationException {
        return (this.fmlBuffer[52].getCount());
    }
}