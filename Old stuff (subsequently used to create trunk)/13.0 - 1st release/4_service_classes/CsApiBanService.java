/**
 * CsApiBanService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsApiBanInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsApiBanOutput;

/**
 * @author  Ninja
 *
 * CsApiBanService Class.
 */
public class CsApiBanService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csApiBan00";

    /**
     * Creates a new instance of CsApiBanService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsApiBanService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsApiBanInput();
        ((CsApiBanInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsApiBanService() {
    }

    /**
     * Calls Tuxedo service 'CsApiBan'
     *
     * @return Output value object: CsApiBanOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsApiBanOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsApiBanOutput(super.execute());
        return ((CsApiBanOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsApiBanInput getInput() {
        return ((CsApiBanInput) this.input);
    }
}