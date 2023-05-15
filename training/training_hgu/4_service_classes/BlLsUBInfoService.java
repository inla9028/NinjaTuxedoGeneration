package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlLsUBInfoInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlLsUBInfoOutput;

import bea.jolt.pool.Result;

/**
 * BlLsUBInfoService Class.
 * @author  Ninja
 */
public class BlLsUBInfoService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "blLsUBInfo00";

    /**
     * Creates a new instance of BlLsUBInfoService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public BlLsUBInfoService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public BlLsUBInfoService() {
    }

    /**
     * Calls Tuxedo service 'BlLsUBInfo'
     *
     * @return Output value object: BlLsUBInfoOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public BlLsUBInfoOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public BlLsUBInfoInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new BlLsUBInfoInput();
        }
        return (BlLsUBInfoInput) this.input;
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
    protected BlLsUBInfoOutput toOutput(final Result result) throws FMLManipulationException {
        return new BlLsUBInfoOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private BlLsUBInfoOutput setOutput(final BlLsUBInfoOutput output) {
        this.output = output;
        return (BlLsUBInfoOutput) this.output;
    }
}
