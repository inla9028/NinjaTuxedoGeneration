/**
 * GnGtAdrItmService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnGtAdrItmInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnGtAdrItmOutput;

/**
 * @author  Ninja
 *
 * GnGtAdrItmService Class.
 */
public class GnGtAdrItmService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "gnGtAdrItm00";

    /**
     * Creates a new instance of GnGtAdrItmService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnGtAdrItmService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new GnGtAdrItmInput();
        ((GnGtAdrItmInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public GnGtAdrItmService() {
    }

    /**
     * Calls Tuxedo service 'GnGtAdrItm'
     *
     * @return Output value object: GnGtAdrItmOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnGtAdrItmOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new GnGtAdrItmOutput(super.execute());
        return ((GnGtAdrItmOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnGtAdrItmInput getInput() {
        return ((GnGtAdrItmInput) this.input);
    }
}