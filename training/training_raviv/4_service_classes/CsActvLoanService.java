/**
 * CsActvLoanService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsActvLoanInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsActvLoanOutput;

/**
 * @author  Ninja
 *
 * CsActvLoanService Class.
 */
public class CsActvLoanService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csActvLoan00";

    /**
     * Creates a new instance of CsActvLoanService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsActvLoanService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsActvLoanInput();
        ((CsActvLoanInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsActvLoanService() {
    }

    /**
     * Calls Tuxedo service 'CsActvLoan'
     *
     * @return Output value object: CsActvLoanOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsActvLoanOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsActvLoanOutput(super.execute());
        return ((CsActvLoanOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsActvLoanInput getInput() {
        return ((CsActvLoanInput) this.input);
    }
}