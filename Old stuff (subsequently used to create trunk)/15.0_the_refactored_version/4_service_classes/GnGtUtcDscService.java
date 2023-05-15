/**
 * GnGtUtcDscService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnGtUtcDscInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnGtUtcDscOutput;

/**
 * @author  Ninja
 *
 * GnGtUtcDscService Class.
 */
public class GnGtUtcDscService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "gnGtUtcDsc00";

    /**
     * Creates a new instance of GnGtUtcDscService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnGtUtcDscService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new GnGtUtcDscInput();
        ((GnGtUtcDscInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public GnGtUtcDscService() {
    }

    /**
     * Calls Tuxedo service 'GnGtUtcDsc'
     *
     * @return Output value object: GnGtUtcDscOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnGtUtcDscOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new GnGtUtcDscOutput(super.execute());
        return ((GnGtUtcDscOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnGtUtcDscInput getInput() {
        return ((GnGtUtcDscInput) this.input);
    }
}