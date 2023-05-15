/**
 * CvSvEsnService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvSvEsnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvSvEsnOutput;

/**
 * @author  Ninja
 *
 * CvSvEsnService Class.
 */
public class CvSvEsnService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "cvSvEsn00";

    /**
     * Creates a new instance of CvSvEsnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CvSvEsnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CvSvEsnInput();
        ((CvSvEsnInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CvSvEsnService() {
    }

    /**
     * Calls Tuxedo service 'CvSvEsn'
     *
     * @return Output value object: CvSvEsnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CvSvEsnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CvSvEsnOutput(super.execute());
        return ((CvSvEsnOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CvSvEsnInput getInput() {
        return ((CvSvEsnInput) this.input);
    }
}