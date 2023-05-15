package no.netcom.ninja.core.system.tuxedo.service.parameters;

import bea.jolt.pool.Result;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;

/**
 * @author  Ninja - Generated by Ninja tools
 */
public class PnmImLoadOutput extends ServiceOutput {

    /**
     * Creates a new instance of PnmImLoadOutput.
     *
     * @throws FMLManipulationException
     */
    public PnmImLoadOutput(int nApplicationStatus) throws FMLManipulationException {
        createFmlBuffer();
        setApplicationCode(nApplicationStatus);
    }

    public PnmImLoadOutput() {
    }

    /**
     * Creates a new instance of PnmImLoadOutput.
     *
     * @param ds Output dataset from PnmImLoad service.
     * @throws FMLManipulationException
     */
    public PnmImLoadOutput(Result ds) throws FMLManipulationException {
        createFmlBuffer();
        populateFmlBuffer(ds);
    }

    /**
     * Populates the FML buffer.
     *
     * @throws FMLManipulationException
     */
    private void createFmlBuffer() throws FMLManipulationException {
        this.fmlBuffer = new FmlField[5];
        this.fmlBuffer[0] = new FmlField("GENERATION", FmlField.TYPE_INTEGER, -1, null, 0, 1);
        this.fmlBuffer[1] = new FmlField("FROM_CTN", FmlField.TYPE_STRING, 21, null, 1, 1);
        this.fmlBuffer[2] = new FmlField("TO_CTN", FmlField.TYPE_STRING, 21, null, 2, 1);
        this.fmlBuffer[3] = new FmlField("LOADED_CTNS", FmlField.TYPE_INTEGER, -1, null, 3, 1);
        this.fmlBuffer[4] = new FmlField("NON_LOADED_CTNS", FmlField.TYPE_INTEGER, -1, null, 4, 1);
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
     * Retrieves the value of the 'FROM_CTN' field in the FML buffer.
     *
     * @return Value of 'FROM_CTN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_FROM_CTN() throws FMLManipulationException {
        return ((String) this.fmlBuffer[1].getValue(0));
    }

    /**
     * Retrieves the value of the 'TO_CTN' field in the FML buffer.
     *
     * @return Value of 'TO_CTN' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_TO_CTN() throws FMLManipulationException {
        return ((String) this.fmlBuffer[2].getValue(0));
    }

    /**
     * Retrieves the value of the 'LOADED_CTNS' field in the FML buffer.
     *
     * @return Value of 'LOADED_CTNS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_LOADED_CTNS() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[3].getValue(0));
    }

    /**
     * Retrieves the value of the 'NON_LOADED_CTNS' field in the FML buffer.
     *
     * @return Value of 'NON_LOADED_CTNS' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_NON_LOADED_CTNS() throws FMLManipulationException {
        return ((Integer) this.fmlBuffer[4].getValue(0));
    }
}