package no.netcom.ninja.core.system.tuxedo.service.parameters;

import bea.jolt.pool.Result;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;

/**
 * @author  Ninja - Generated by Ninja tools
 */
public class BlGtNxUbCycOutput extends ServiceOutput {

    /**
     * Creates a new instance of BlGtNxUbCycOutput.
     *
     * @throws FMLManipulationException
     */
    public BlGtNxUbCycOutput(int nApplicationStatus) throws FMLManipulationException {
        createFmlBuffer();
        setApplicationCode(nApplicationStatus);
    }

    public BlGtNxUbCycOutput() {
    }

    /**
     * Creates a new instance of BlGtNxUbCycOutput.
     *
     * @param ds Output dataset from BlGtNxUbCyc service.
     * @throws FMLManipulationException
     */
    public BlGtNxUbCycOutput(Result ds) throws FMLManipulationException {
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
        this.fmlBuffer[1] = new FmlField("CYCLE_CODE", FmlField.TYPE_SHORT, -1, null, 1, 1);
        this.fmlBuffer[2] = new FmlField("CYCLE_RUN_YEAR", FmlField.TYPE_SHORT, -1, null, 2, 1);
        this.fmlBuffer[3] = new FmlField("CYCLE_RUN_MONTH", FmlField.TYPE_SHORT, -1, null, 3, 1);
        this.fmlBuffer[4] = new FmlField("CYCLE_START_DATE", FmlField.TYPE_STRING, 9, null, 4, 1);
        this.fmlBuffer[5] = new FmlField("CYCLE_CLOSE_DATE", FmlField.TYPE_STRING, 9, null, 5, 1);
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
     * Retrieves the value of the 'CYCLE_CODE' field in the FML buffer.
     *
     * @return Value of 'CYCLE_CODE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CYCLE_CODE() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[1].getValue(0)));
    }

    /**
     * Retrieves the value of the 'CYCLE_RUN_YEAR' field in the FML buffer.
     *
     * @return Value of 'CYCLE_RUN_YEAR' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CYCLE_RUN_YEAR() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[2].getValue(0)));
    }

    /**
     * Retrieves the value of the 'CYCLE_RUN_MONTH' field in the FML buffer.
     *
     * @return Value of 'CYCLE_RUN_MONTH' field in FML buffer.
     * @throws FMLManipulationException
     */
    public Integer get_CYCLE_RUN_MONTH() throws FMLManipulationException {
        return (TypeConverter.shortToInteger((Short) this.fmlBuffer[3].getValue(0)));
    }

    /**
     * Retrieves the value of the 'CYCLE_START_DATE' field in the FML buffer.
     *
     * @return Value of 'CYCLE_START_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CYCLE_START_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[4].getValue(0));
    }

    /**
     * Retrieves the value of the 'CYCLE_CLOSE_DATE' field in the FML buffer.
     *
     * @return Value of 'CYCLE_CLOSE_DATE' field in FML buffer.
     * @throws FMLManipulationException
     */
    public String get_CYCLE_CLOSE_DATE() throws FMLManipulationException {
        return ((String) this.fmlBuffer[5].getValue(0));
    }
}