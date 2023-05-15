package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArInvcLsInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArInvcLsOutput;

import bea.jolt.pool.Result;

/**
 * ArInvcLsService Class.
 * @author  Ninja
 */
public class ArInvcLsService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arInvcLs00";

    /**
     * Creates a new instance of ArInvcLsService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArInvcLsService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public ArInvcLsService() {
    }

    /**
     * Calls Tuxedo service 'ArInvcLs'
     *
     * @return Output value object: ArInvcLsOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArInvcLsOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArInvcLsInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new ArInvcLsInput();
        }
        return (ArInvcLsInput) this.input;
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
    protected ArInvcLsOutput toOutput(final Result result) throws FMLManipulationException {
        return new ArInvcLsOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private ArInvcLsOutput setOutput(final ArInvcLsOutput output) {
        this.output = output;
        return (ArInvcLsOutput) this.output;
    }
}
