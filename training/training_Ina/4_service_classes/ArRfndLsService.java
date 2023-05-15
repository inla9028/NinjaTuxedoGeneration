/**
 * ArRfndLsService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArRfndLsInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArRfndLsOutput;

/**
 * @author  Ninja
 *
 * ArRfndLsService Class.
 */
public class ArRfndLsService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "arRfndLs00";

    /**
     * Creates a new instance of ArRfndLsService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArRfndLsService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ArRfndLsInput();
        ((ArRfndLsInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ArRfndLsService() {
    }

    /**
     * Calls Tuxedo service 'ArRfndLs'
     *
     * @return Output value object: ArRfndLsOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArRfndLsOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ArRfndLsOutput(super.execute());
        return ((ArRfndLsOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArRfndLsInput getInput() {
        return ((ArRfndLsInput) this.input);
    }
}