/**
 * ArSvDiscService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArSvDiscInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArSvDiscOutput;

/**
 * @author  Ninja
 *
 * ArSvDiscService Class.
 */
public class ArSvDiscService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "arSvDisc00";

    /**
     * Creates a new instance of ArSvDiscService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArSvDiscService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ArSvDiscInput();
        ((ArSvDiscInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ArSvDiscService() {
    }

    /**
     * Calls Tuxedo service 'ArSvDisc'
     *
     * @return Output value object: ArSvDiscOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArSvDiscOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ArSvDiscOutput(super.execute());
        return ((ArSvDiscOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArSvDiscInput getInput() {
        return ((ArSvDiscInput) this.input);
    }
}