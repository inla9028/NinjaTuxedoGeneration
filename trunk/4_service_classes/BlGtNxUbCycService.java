/**
 * BlGtNxUbCycService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlGtNxUbCycInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlGtNxUbCycOutput;

/**
 * @author  Ninja
 *
 * BlGtNxUbCycService Class.
 */
public class BlGtNxUbCycService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "blGtNxUbCyc00";

    /**
     * Creates a new instance of BlGtNxUbCycService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public BlGtNxUbCycService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new BlGtNxUbCycInput();
        ((BlGtNxUbCycInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public BlGtNxUbCycService() {
    }

    /**
     * Calls Tuxedo service 'BlGtNxUbCyc'
     *
     * @return Output value object: BlGtNxUbCycOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public BlGtNxUbCycOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new BlGtNxUbCycOutput(super.execute());
        return ((BlGtNxUbCycOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public BlGtNxUbCycInput getInput() {
        return ((BlGtNxUbCycInput) this.input);
    }
}