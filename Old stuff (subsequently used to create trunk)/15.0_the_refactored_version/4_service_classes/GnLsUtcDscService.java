/**
 * GnLsUtcDscService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnLsUtcDscInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnLsUtcDscOutput;

/**
 * @author  Ninja
 *
 * GnLsUtcDscService Class.
 */
public class GnLsUtcDscService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "gnLsUtcDsc00";

    /**
     * Creates a new instance of GnLsUtcDscService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnLsUtcDscService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new GnLsUtcDscInput();
        ((GnLsUtcDscInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public GnLsUtcDscService() {
    }

    /**
     * Calls Tuxedo service 'GnLsUtcDsc'
     *
     * @return Output value object: GnLsUtcDscOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnLsUtcDscOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new GnLsUtcDscOutput(super.execute());
        return ((GnLsUtcDscOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnLsUtcDscInput getInput() {
        return ((GnLsUtcDscInput) this.input);
    }
}