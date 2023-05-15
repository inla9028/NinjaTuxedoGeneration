/**
 * ArGtpymMtdService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArGtpymMtdInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArGtpymMtdOutput;

/**
 * @author  Ninja
 *
 * ArGtpymMtdService Class.
 */
public class ArGtpymMtdService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "arGtpymMtd00";

    /**
     * Creates a new instance of ArGtpymMtdService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArGtpymMtdService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ArGtpymMtdInput();
        ((ArGtpymMtdInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ArGtpymMtdService() {
    }

    /**
     * Calls Tuxedo service 'ArGtpymMtd'
     *
     * @return Output value object: ArGtpymMtdOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArGtpymMtdOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ArGtpymMtdOutput(super.execute());
        return ((ArGtpymMtdOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArGtpymMtdInput getInput() {
        return ((ArGtpymMtdInput) this.input);
    }
}