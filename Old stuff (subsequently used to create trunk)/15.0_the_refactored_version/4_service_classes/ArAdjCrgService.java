/**
 * ArAdjCrgService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArAdjCrgInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArAdjCrgOutput;

/**
 * @author  Ninja
 *
 * ArAdjCrgService Class.
 */
public class ArAdjCrgService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "arAdjCrg00";

    /**
     * Creates a new instance of ArAdjCrgService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArAdjCrgService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ArAdjCrgInput();
        ((ArAdjCrgInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ArAdjCrgService() {
    }

    /**
     * Calls Tuxedo service 'ArAdjCrg'
     *
     * @return Output value object: ArAdjCrgOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArAdjCrgOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ArAdjCrgOutput(super.execute());
        return ((ArAdjCrgOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArAdjCrgInput getInput() {
        return ((ArAdjCrgInput) this.input);
    }
}