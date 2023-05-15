package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlLsUBChgInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlLsUBChgOutput;

import bea.jolt.pool.Result;

/**
 * BlLsUBChgService Class.
 * @author  Ninja
 */
public class BlLsUBChgService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "blLsUBChg00";

    /**
     * Creates a new instance of BlLsUBChgService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public BlLsUBChgService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public BlLsUBChgService() {
    }

    /**
     * Calls Tuxedo service 'BlLsUBChg'
     *
     * @return Output value object: BlLsUBChgOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public BlLsUBChgOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public BlLsUBChgInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new BlLsUBChgInput();
        }
        return (BlLsUBChgInput) this.input;
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
    protected BlLsUBChgOutput toOutput(final Result result) throws FMLManipulationException {
        return new BlLsUBChgOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private BlLsUBChgOutput setOutput(final BlLsUBChgOutput output) {
        this.output = output;
        return (BlLsUBChgOutput) this.output;
    }
}
