/**
 * CvStartService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvStartInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvStartOutput;

/**
 * @author  Ninja
 *
 * CvStartService Class.
 */
public class CvStartService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "cvStart00";

    /**
     * Creates a new instance of CvStartService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CvStartService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CvStartInput();
        ((CvStartInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CvStartService() {
    }

    /**
     * Calls Tuxedo service 'CvStart'
     *
     * @return Output value object: CvStartOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CvStartOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CvStartOutput(super.execute());
        return ((CvStartOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CvStartInput getInput() {
        return ((CvStartInput) this.input);
    }
}