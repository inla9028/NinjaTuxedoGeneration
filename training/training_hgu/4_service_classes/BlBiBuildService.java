package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlBiBuildInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlBiBuildOutput;

import bea.jolt.pool.Result;

/**
 * BlBiBuildService Class.
 * @author  Ninja
 */
public class BlBiBuildService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "blBiBuild00";

    /**
     * Creates a new instance of BlBiBuildService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public BlBiBuildService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public BlBiBuildService() {
    }

    /**
     * Calls Tuxedo service 'BlBiBuild'
     *
     * @return Output value object: BlBiBuildOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public BlBiBuildOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public BlBiBuildInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new BlBiBuildInput();
        }
        return (BlBiBuildInput) this.input;
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
    protected BlBiBuildOutput toOutput(final Result result) throws FMLManipulationException {
        return new BlBiBuildOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private BlBiBuildOutput setOutput(final BlBiBuildOutput output) {
        this.output = output;
        return (BlBiBuildOutput) this.output;
    }
}
