package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsActvLoanInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsActvLoanOutput;

import bea.jolt.pool.Result;

/**
 * CsActvLoanService Class.
 * @author  Ninja
 */
public class CsActvLoanService extends TuxedoService implements TuxedoExecutable {
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
        getInput().set_OPERATOR_ID(operatorId);
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
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsActvLoanInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsActvLoanInput();
        }
        return (CsActvLoanInput) this.input;
    }

    /**
     * @return The tuxedo service name
     */
    public String getName() {
        return getServiceName();
    }

    /**
     * @return The tuxedo service name
     */
    public static String getServiceName() {
        return NAME;
    }

    /**
     * Returns an output value object for the provided <tt>Result</tt>.
     *
     * @return Output value object for this service.
     */
    @Override
    protected CsActvLoanOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsActvLoanOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsActvLoanOutput setOutput(final CsActvLoanOutput output) {
        this.output = output;
        return (CsActvLoanOutput) this.output;
    }
}
