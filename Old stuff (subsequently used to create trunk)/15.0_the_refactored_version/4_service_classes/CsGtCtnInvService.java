/**
 * CsGtCtnInvService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtCtnInvInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtCtnInvOutput;

/**
 * @author  Ninja
 *
 * CsGtCtnInvService Class.
 */
public class CsGtCtnInvService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csGtCtnInv00";

    /**
     * Creates a new instance of CsGtCtnInvService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsGtCtnInvService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsGtCtnInvInput();
        ((CsGtCtnInvInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsGtCtnInvService() {
    }

    /**
     * Calls Tuxedo service 'CsGtCtnInv'
     *
     * @return Output value object: CsGtCtnInvOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsGtCtnInvOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsGtCtnInvOutput(super.execute());
        return ((CsGtCtnInvOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsGtCtnInvInput getInput() {
        return ((CsGtCtnInvInput) this.input);
    }
}