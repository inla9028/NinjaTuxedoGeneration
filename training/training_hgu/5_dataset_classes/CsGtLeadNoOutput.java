package no.netcom.ninja.core.system.tuxedo.service.parameters;

import bea.jolt.pool.Result;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;

/**
 * @author  Ninja - Generated by Ninja tools
 */
public class CsGtLeadNoOutput extends ServiceOutput {

    /**
     * Creates a new instance of CsGtLeadNoOutput.
     *
     * @throws FMLManipulationException
     */
    public CsGtLeadNoOutput(int nApplicationStatus) throws FMLManipulationException {
        createFmlBuffer();
        setApplicationCode(nApplicationStatus);
    }

    public CsGtLeadNoOutput() {
    }

    /**
     * Creates a new instance of CsGtLeadNoOutput.
     *
     * @param ds Output dataset from CsGtLeadNo service.
     * @throws FMLManipulationException
     */
    public CsGtLeadNoOutput(Result ds) throws FMLManipulationException {
        createFmlBuffer();
        populateFmlBuffer(ds);
    }

    /**
     * Populates the FML buffer.
     *
     * @throws FMLManipulationException
     */
    private void createFmlBuffer() throws FMLManipulationException {
        this.fmlBuffer = new FmlField[6];
        this.fmlBuffer[0] = new FmlField("GENERATION", FmlField.TYPE_INTEGER, -1, null, 0, 1);
        this.fmlBuffer[1] = new FmlField("ROWID", FmlField.TYPE_STRING, 19, null, 1, 1);
        this.fmlBuffer[2] = new FmlField("PABX_ID", FmlField.TYPE_STRING, 13, null, 2, 1);
        this.fmlBuffer[3] = new FmlField("PABX_DESC", FmlField.TYPE_STRING, 21, null, 3, 1);
        this.fmlBuffer[4] = new FmlField("LEADING_NUMBER", FmlField.TYPE_STRING, 21, null, 4, 1);
        this.fmlBuffer[5] = new FmlField("SIP_MAIN", FmlField.TYPE_STRING, 21, null, 5, 1);
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
     * Retrieves the value of the 'ROWID' field in the FML buffer.
     *
     * @return Value of 'ROWID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_ROWID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[1].getValue(0));
    }

    /**
     * Retrieves the value of the 'PABX_ID' field in the FML buffer.
     *
     * @return Value of 'PABX_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PABX_ID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[2].getValue(0));
    }

    /**
     * Retrieves the value of the 'PABX_DESC' field in the FML buffer.
     *
     * @return Value of 'PABX_DESC' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PABX_DESC() throws FMLManipulationException {
        return ((String) this.fmlBuffer[3].getValue(0));
    }

    /**
     * Retrieves the value of the 'LEADING_NUMBER' field in the FML buffer.
     *
     * @return Value of 'LEADING_NUMBER' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_LEADING_NUMBER() throws FMLManipulationException {
        return ((String) this.fmlBuffer[4].getValue(0));
    }

    /**
     * Retrieves the value of the 'SIP_MAIN' field in the FML buffer.
     *
     * @return Value of 'SIP_MAIN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_SIP_MAIN() throws FMLManipulationException {
        return ((String) this.fmlBuffer[5].getValue(0));
    }
}