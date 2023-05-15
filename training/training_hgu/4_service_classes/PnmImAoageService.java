package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.PnmImAoageInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.PnmImAoageOutput;

import bea.jolt.pool.Result;

/**
 * PnmImAoageService Class.
 * @author  Ninja
 */
public class PnmImAoageService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "pnmImAoage00";

    /**
     * Creates a new instance of PnmImAoageService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public PnmImAoageService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public PnmImAoageService() {
    }

    /**
     * Calls Tuxedo service 'PnmImAoage'
     *
     * @return Output value object: PnmImAoageOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public PnmImAoageOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public PnmImAoageInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new PnmImAoageInput();
        }
        return (PnmImAoageInput) this.input;
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
    protected PnmImAoageOutput toOutput(final Result result) throws FMLManipulationException {
        return new PnmImAoageOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private PnmImAoageOutput setOutput(final PnmImAoageOutput output) {
        this.output = output;
        return (PnmImAoageOutput) this.output;
    }
}
