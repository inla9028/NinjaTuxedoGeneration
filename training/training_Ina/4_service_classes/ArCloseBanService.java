/**
 * ArCloseBanService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArCloseBanInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArCloseBanOutput;

/**
 * @author  Ninja
 *
 * ArCloseBanService Class.
 */
public class ArCloseBanService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "arCloseBan00";

    /**
     * Creates a new instance of ArCloseBanService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArCloseBanService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ArCloseBanInput();
        ((ArCloseBanInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ArCloseBanService() {
    }

    /**
     * Calls Tuxedo service 'ArCloseBan'
     *
     * @return Output value object: ArCloseBanOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArCloseBanOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ArCloseBanOutput(super.execute());
        return ((ArCloseBanOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArCloseBanInput getInput() {
        return ((ArCloseBanInput) this.input);
    }
}