/**
 * ClGtColHistService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ClGtColHistInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ClGtColHistOutput;

/**
 * @author  Ninja
 *
 * ClGtColHistService Class.
 */
public class ClGtColHistService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "clGtColHist00";

    /**
     * Creates a new instance of ClGtColHistService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ClGtColHistService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ClGtColHistInput();
        ((ClGtColHistInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ClGtColHistService() {
    }

    /**
     * Calls Tuxedo service 'ClGtColHist'
     *
     * @return Output value object: ClGtColHistOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ClGtColHistOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ClGtColHistOutput(super.execute());
        return ((ClGtColHistOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ClGtColHistInput getInput() {
        return ((ClGtColHistInput) this.input);
    }
}