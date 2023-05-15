/**
 * CsGtOcSocAmtService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtOcSocAmtInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtOcSocAmtOutput;

/**
 * @author  Ninja
 *
 * CsGtOcSocAmtService Class.
 */
public class CsGtOcSocAmtService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csGtOcSocAmt00";

    /**
     * Creates a new instance of CsGtOcSocAmtService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsGtOcSocAmtService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsGtOcSocAmtInput();
        ((CsGtOcSocAmtInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsGtOcSocAmtService() {
    }

    /**
     * Calls Tuxedo service 'CsGtOcSocAmt'
     *
     * @return Output value object: CsGtOcSocAmtOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsGtOcSocAmtOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsGtOcSocAmtOutput(super.execute());
        return ((CsGtOcSocAmtOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsGtOcSocAmtInput getInput() {
        return ((CsGtOcSocAmtInput) this.input);
    }
}