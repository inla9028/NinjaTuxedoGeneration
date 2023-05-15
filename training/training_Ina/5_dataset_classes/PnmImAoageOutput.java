package no.netcom.ninja.core.system.tuxedo.service.parameters;

import bea.jolt.pool.Result;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;

/**
 * @author  Ninja - Generated by Ninja tools
 */
public class PnmImAoageOutput extends ServiceOutput {

    /**
     * Creates a new instance of PnmImAoageOutput.
     *
     * @throws FMLManipulationException
     */
    public PnmImAoageOutput(int nApplicationStatus) throws FMLManipulationException {
        createFmlBuffer();
        setApplicationCode(nApplicationStatus);
    }

    public PnmImAoageOutput() {
    }

    /**
     * Creates a new instance of PnmImAoageOutput.
     *
     * @param ds Output dataset from PnmImAoage service.
     * @throws FMLManipulationException
     */
    public PnmImAoageOutput(Result ds) throws FMLManipulationException {
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
        this.fmlBuffer[1] = new FmlField("PROWNUM", FmlField.TYPE_INTEGER, -1, null, 1, 1);
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
     * Retrieves the value of the 'PROWNUM' field in the FML buffer.
     *
     * @return Value of 'PROWNUM' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_PROWNUM() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[1].getValue(0));
    }
}