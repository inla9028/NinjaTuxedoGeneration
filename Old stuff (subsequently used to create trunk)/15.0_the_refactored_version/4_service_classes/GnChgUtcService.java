/**
 * GnChgUtcService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnChgUtcInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnChgUtcOutput;

/**
 * @author  Ninja
 *
 * GnChgUtcService Class.
 */
public class GnChgUtcService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "gnChgUtc00";

    /**
     * Creates a new instance of GnChgUtcService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnChgUtcService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new GnChgUtcInput();
        ((GnChgUtcInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public GnChgUtcService() {
    }

    /**
     * Calls Tuxedo service 'GnChgUtc'
     *
     * @return Output value object: GnChgUtcOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnChgUtcOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new GnChgUtcOutput(super.execute());
        return ((GnChgUtcOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnChgUtcInput getInput() {
        return ((GnChgUtcInput) this.input);
    }
}