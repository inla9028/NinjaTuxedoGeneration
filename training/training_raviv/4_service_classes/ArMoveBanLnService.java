/**
 * ArMoveBanLnService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArMoveBanLnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArMoveBanLnOutput;

/**
 * @author  Ninja
 *
 * ArMoveBanLnService Class.
 */
public class ArMoveBanLnService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "arMoveBanLn00";

    /**
     * Creates a new instance of ArMoveBanLnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArMoveBanLnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ArMoveBanLnInput();
        ((ArMoveBanLnInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ArMoveBanLnService() {
    }

    /**
     * Calls Tuxedo service 'ArMoveBanLn'
     *
     * @return Output value object: ArMoveBanLnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArMoveBanLnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ArMoveBanLnOutput(super.execute());
        return ((ArMoveBanLnOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArMoveBanLnInput getInput() {
        return ((ArMoveBanLnInput) this.input);
    }
}