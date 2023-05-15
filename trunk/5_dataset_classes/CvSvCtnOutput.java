package no.netcom.ninja.core.system.tuxedo.service.parameters;

import bea.jolt.pool.Result;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.util.TypeConverter;

/**
 * @author  Ninja - Generated by Ninja tools
 */
public class CvSvCtnOutput extends ServiceOutput {

    /**
     * Creates a new instance of CvSvCtnOutput.
     *
     * @throws FMLManipulationException
     */
    public CvSvCtnOutput(int nApplicationStatus) throws FMLManipulationException {
        createFmlBuffer();
        setApplicationCode(nApplicationStatus);
    }

    public CvSvCtnOutput() {
    }

    /**
     * Creates a new instance of CvSvCtnOutput.
     *
     * @param ds Output dataset from CvSvCtn service.
     * @throws FMLManipulationException
     */
    public CvSvCtnOutput(Result ds) throws FMLManipulationException {
        createFmlBuffer();
        populateFmlBuffer(ds);
    }

    /**
     * Populates the FML buffer.
     *
     * @throws FMLManipulationException
     */
    private void createFmlBuffer() throws FMLManipulationException {
        this.fmlBuffer = new FmlField[1];
        this.fmlBuffer[0] = new FmlField("GENERATION", FmlField.TYPE_INTEGER, -1, null, 0, 1);
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

    public void populateCvFolder(CsApiBanOutput csApiBanOutput) throws FMLManipulationException {
        super.populateCvFolder(csApiBanOutput);

        // General mapping (ie copy between same-named fields) from CsApiBan output to this buffer.
        ServiceParameter.copyFmlBuffer(csApiBanOutput, this);
    }
}