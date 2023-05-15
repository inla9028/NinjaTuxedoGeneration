/**
 * ArCrCrgService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArCrCrgInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArCrCrgOutput;

/**
 * @author  Ninja
 *
 * ArCrCrgService Class.
 */
public class ArCrCrgService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "arCrCrg00";

    /**
     * Creates a new instance of ArCrCrgService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArCrCrgService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ArCrCrgInput();
        ((ArCrCrgInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ArCrCrgService() {
    }

    /**
     * Calls Tuxedo service 'ArCrCrg'
     *
     * @return Output value object: ArCrCrgOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArCrCrgOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ArCrCrgOutput(super.execute());
        return ((ArCrCrgOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArCrCrgInput getInput() {
        return ((ArCrCrgInput) this.input);
    }
}