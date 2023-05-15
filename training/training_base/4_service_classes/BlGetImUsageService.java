/**
 * BlGetImUsageService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlGetImUsageInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlGetImUsageOutput;

/**
 * @author  Ninja
 *
 * BlGetImUsageService Class.
 */
public class BlGetImUsageService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "blGetImUsage00";

    /**
     * Creates a new instance of BlGetImUsageService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public BlGetImUsageService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new BlGetImUsageInput();
        ((BlGetImUsageInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public BlGetImUsageService() {
    }

    /**
     * Calls Tuxedo service 'BlGetImUsage'
     *
     * @return Output value object: BlGetImUsageOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public BlGetImUsageOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new BlGetImUsageOutput(super.execute());
        return ((BlGetImUsageOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public BlGetImUsageInput getInput() {
        return ((BlGetImUsageInput) this.input);
    }
}