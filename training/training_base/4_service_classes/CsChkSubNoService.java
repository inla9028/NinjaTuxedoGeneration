/**
 * CsChkSubNoService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsChkSubNoInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsChkSubNoOutput;

/**
 * @author  Ninja
 *
 * CsChkSubNoService Class.
 */
public class CsChkSubNoService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csChkSubNo00";

    /**
     * Creates a new instance of CsChkSubNoService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsChkSubNoService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsChkSubNoInput();
        ((CsChkSubNoInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsChkSubNoService() {
    }

    /**
     * Calls Tuxedo service 'CsChkSubNo'
     *
     * @return Output value object: CsChkSubNoOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsChkSubNoOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsChkSubNoOutput(super.execute());
        return ((CsChkSubNoOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsChkSubNoInput getInput() {
        return ((CsChkSubNoInput) this.input);
    }
}