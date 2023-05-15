package no.netcom.ninja.core.system.tuxedo.service.parameters;

import bea.jolt.pool.Result;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;

/**
 * @author  Ninja - Generated by Ninja tools
 */
public class CsGtLastPbxIdOutput extends ServiceOutput {

    /**
     * Creates a new instance of CsGtLastPbxIdOutput.
     *
     * @throws FMLManipulationException
     */
    public CsGtLastPbxIdOutput(int nApplicationStatus) throws FMLManipulationException {
        createFmlBuffer();
        setApplicationCode(nApplicationStatus);
    }

    public CsGtLastPbxIdOutput() {
    }

    /**
     * Creates a new instance of CsGtLastPbxIdOutput.
     *
     * @param ds Output dataset from CsGtLastPbxId service.
     * @throws FMLManipulationException
     */
    public CsGtLastPbxIdOutput(Result ds) throws FMLManipulationException {
        createFmlBuffer();
        populateFmlBuffer(ds);
    }

    /**
     * Populates the FML buffer.
     *
     * @throws FMLManipulationException
     */
    private void createFmlBuffer() throws FMLManipulationException {
        this.fmlBuffer = new FmlField[2];
        this.fmlBuffer[0] = new FmlField("GENERATION", FmlField.TYPE_INTEGER, -1, null, 0, 1);
        this.fmlBuffer[1] = new FmlField("PABX_ID", FmlField.TYPE_STRING, 13, null, 1, 1);
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
     * Retrieves the value of the 'PABX_ID' field in the FML buffer.
     *
     * @return Value of 'PABX_ID' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_PABX_ID() throws FMLManipulationException {
        return ((String) this.fmlBuffer[1].getValue(0));
    }
}