package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlGetImUsageInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlGetImUsageOutput;

import bea.jolt.pool.Result;

/**
 * BlGetImUsageService Class.
 * @author  Ninja
 */
public class BlGetImUsageService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "blGetImUsage00";

    /**
     * Creates a new instance of BlGetImUsageService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public BlGetImUsageService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public BlGetImUsageService() {
    }

    /**
     * Calls Tuxedo service 'BlGetImUsage'
     *
     * @return Output value object: BlGetImUsageOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public BlGetImUsageOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public BlGetImUsageInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new BlGetImUsageInput();
        }
        return (BlGetImUsageInput) this.input;
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
    protected BlGetImUsageOutput toOutput(final Result result) throws FMLManipulationException {
        return new BlGetImUsageOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private BlGetImUsageOutput setOutput(final BlGetImUsageOutput output) {
        this.output = output;
        return (BlGetImUsageOutput) this.output;
    }
}
