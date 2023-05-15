/**
 * CsLsSrvAgrService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsSrvAgrInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsSrvAgrOutput;

/**
 * @author  Ninja
 *
 * CsLsSrvAgrService Class.
 */
public class CsLsSrvAgrService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csLsSrvAgr00";

    /**
     * Creates a new instance of CsLsSrvAgrService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsLsSrvAgrService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsLsSrvAgrInput();
        ((CsLsSrvAgrInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsLsSrvAgrService() {
    }

    /**
     * Calls Tuxedo service 'CsLsSrvAgr'
     *
     * @return Output value object: CsLsSrvAgrOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsLsSrvAgrOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsLsSrvAgrOutput(super.execute());
        return ((CsLsSrvAgrOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsLsSrvAgrInput getInput() {
        return ((CsLsSrvAgrInput) this.input);
    }
}