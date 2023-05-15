/**
 * ArLsDiscService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArLsDiscInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArLsDiscOutput;

/**
 * @author  Ninja
 *
 * ArLsDiscService Class.
 */
public class ArLsDiscService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "arLsDisc00";

    /**
     * Creates a new instance of ArLsDiscService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArLsDiscService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ArLsDiscInput();
        ((ArLsDiscInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ArLsDiscService() {
    }

    /**
     * Calls Tuxedo service 'ArLsDisc'
     *
     * @return Output value object: ArLsDiscOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArLsDiscOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ArLsDiscOutput(super.execute());
        return ((ArLsDiscOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArLsDiscInput getInput() {
        return ((ArLsDiscInput) this.input);
    }
}