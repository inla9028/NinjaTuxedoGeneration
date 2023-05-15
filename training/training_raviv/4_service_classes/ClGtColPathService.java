/**
 * ClGtColPathService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ClGtColPathInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ClGtColPathOutput;

/**
 * @author  Ninja
 *
 * ClGtColPathService Class.
 */
public class ClGtColPathService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "clGtColPath00";

    /**
     * Creates a new instance of ClGtColPathService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ClGtColPathService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ClGtColPathInput();
        ((ClGtColPathInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ClGtColPathService() {
    }

    /**
     * Calls Tuxedo service 'ClGtColPath'
     *
     * @return Output value object: ClGtColPathOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ClGtColPathOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ClGtColPathOutput(super.execute());
        return ((ClGtColPathOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ClGtColPathInput getInput() {
        return ((ClGtColPathInput) this.input);
    }
}