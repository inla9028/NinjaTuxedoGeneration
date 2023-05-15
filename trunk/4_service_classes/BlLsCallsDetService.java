/**
 * BlLsCallsDetService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlLsCallsDetInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlLsCallsDetOutput;

/**
 * @author  Ninja
 *
 * BlLsCallsDetService Class.
 */
public class BlLsCallsDetService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "blLsCallsDet00";

    /**
     * Creates a new instance of BlLsCallsDetService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public BlLsCallsDetService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new BlLsCallsDetInput();
        ((BlLsCallsDetInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public BlLsCallsDetService() {
    }

    /**
     * Calls Tuxedo service 'BlLsCallsDet'
     *
     * @return Output value object: BlLsCallsDetOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public BlLsCallsDetOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new BlLsCallsDetOutput(super.execute());
        return ((BlLsCallsDetOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public BlLsCallsDetInput getInput() {
        return ((BlLsCallsDetInput) this.input);
    }
}