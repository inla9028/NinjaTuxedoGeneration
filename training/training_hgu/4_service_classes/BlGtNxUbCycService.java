package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlGtNxUbCycInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlGtNxUbCycOutput;

import bea.jolt.pool.Result;

/**
 * BlGtNxUbCycService Class.
 * @author  Ninja
 */
public class BlGtNxUbCycService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "blGtNxUbCyc00";

    /**
     * Creates a new instance of BlGtNxUbCycService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public BlGtNxUbCycService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public BlGtNxUbCycService() {
    }

    /**
     * Calls Tuxedo service 'BlGtNxUbCyc'
     *
     * @return Output value object: BlGtNxUbCycOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public BlGtNxUbCycOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public BlGtNxUbCycInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new BlGtNxUbCycInput();
        }
        return (BlGtNxUbCycInput) this.input;
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
    protected BlGtNxUbCycOutput toOutput(final Result result) throws FMLManipulationException {
        return new BlGtNxUbCycOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private BlGtNxUbCycOutput setOutput(final BlGtNxUbCycOutput output) {
        this.output = output;
        return (BlGtNxUbCycOutput) this.output;
    }
}
