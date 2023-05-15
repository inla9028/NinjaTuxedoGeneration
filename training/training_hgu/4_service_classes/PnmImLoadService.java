package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.PnmImLoadInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.PnmImLoadOutput;

import bea.jolt.pool.Result;

/**
 * PnmImLoadService Class.
 * @author  Ninja
 */
public class PnmImLoadService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "pnmImLoad00";

    /**
     * Creates a new instance of PnmImLoadService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public PnmImLoadService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public PnmImLoadService() {
    }

    /**
     * Calls Tuxedo service 'PnmImLoad'
     *
     * @return Output value object: PnmImLoadOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public PnmImLoadOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public PnmImLoadInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new PnmImLoadInput();
        }
        return (PnmImLoadInput) this.input;
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
    protected PnmImLoadOutput toOutput(final Result result) throws FMLManipulationException {
        return new PnmImLoadOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private PnmImLoadOutput setOutput(final PnmImLoadOutput output) {
        this.output = output;
        return (PnmImLoadOutput) this.output;
    }
}
