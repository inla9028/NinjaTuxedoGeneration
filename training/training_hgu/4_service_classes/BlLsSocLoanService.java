package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlLsSocLoanInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlLsSocLoanOutput;

import bea.jolt.pool.Result;

/**
 * BlLsSocLoanService Class.
 * @author  Ninja
 */
public class BlLsSocLoanService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "blLsSocLoan00";

    /**
     * Creates a new instance of BlLsSocLoanService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public BlLsSocLoanService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public BlLsSocLoanService() {
    }

    /**
     * Calls Tuxedo service 'BlLsSocLoan'
     *
     * @return Output value object: BlLsSocLoanOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public BlLsSocLoanOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public BlLsSocLoanInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new BlLsSocLoanInput();
        }
        return (BlLsSocLoanInput) this.input;
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
    protected BlLsSocLoanOutput toOutput(final Result result) throws FMLManipulationException {
        return new BlLsSocLoanOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private BlLsSocLoanOutput setOutput(final BlLsSocLoanOutput output) {
        this.output = output;
        return (BlLsSocLoanOutput) this.output;
    }
}
