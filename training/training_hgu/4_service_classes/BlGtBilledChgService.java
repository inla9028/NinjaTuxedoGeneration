package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlGtBilledChgInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlGtBilledChgOutput;

import bea.jolt.pool.Result;

/**
 * BlGtBilledChgService Class.
 * @author  Ninja
 */
public class BlGtBilledChgService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "blGtBilledChg00";

    /**
     * Creates a new instance of BlGtBilledChgService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public BlGtBilledChgService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public BlGtBilledChgService() {
    }

    /**
     * Calls Tuxedo service 'BlGtBilledChg'
     *
     * @return Output value object: BlGtBilledChgOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public BlGtBilledChgOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public BlGtBilledChgInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new BlGtBilledChgInput();
        }
        return (BlGtBilledChgInput) this.input;
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
    protected BlGtBilledChgOutput toOutput(final Result result) throws FMLManipulationException {
        return new BlGtBilledChgOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private BlGtBilledChgOutput setOutput(final BlGtBilledChgOutput output) {
        this.output = output;
        return (BlGtBilledChgOutput) this.output;
    }
}
