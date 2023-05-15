package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.PnmImHistInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.PnmImHistOutput;

import bea.jolt.pool.Result;

/**
 * PnmImHistService Class.
 * @author  Ninja
 */
public class PnmImHistService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "pnmImHist00";

    /**
     * Creates a new instance of PnmImHistService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public PnmImHistService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public PnmImHistService() {
    }

    /**
     * Calls Tuxedo service 'PnmImHist'
     *
     * @return Output value object: PnmImHistOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public PnmImHistOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public PnmImHistInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new PnmImHistInput();
        }
        return (PnmImHistInput) this.input;
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
    protected PnmImHistOutput toOutput(final Result result) throws FMLManipulationException {
        return new PnmImHistOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private PnmImHistOutput setOutput(final PnmImHistOutput output) {
        this.output = output;
        return (PnmImHistOutput) this.output;
    }
}
