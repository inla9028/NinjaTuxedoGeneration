package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlLsCallsDetInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlLsCallsDetOutput;

import bea.jolt.pool.Result;

/**
 * BlLsCallsDetService Class.
 * @author  Ninja
 */
public class BlLsCallsDetService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "blLsCallsDet00";

    /**
     * Creates a new instance of BlLsCallsDetService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public BlLsCallsDetService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public BlLsCallsDetService() {
    }

    /**
     * Calls Tuxedo service 'BlLsCallsDet'
     *
     * @return Output value object: BlLsCallsDetOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public BlLsCallsDetOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public BlLsCallsDetInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new BlLsCallsDetInput();
        }
        return (BlLsCallsDetInput) this.input;
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
    protected BlLsCallsDetOutput toOutput(final Result result) throws FMLManipulationException {
        return new BlLsCallsDetOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private BlLsCallsDetOutput setOutput(final BlLsCallsDetOutput output) {
        this.output = output;
        return (BlLsCallsDetOutput) this.output;
    }
}
