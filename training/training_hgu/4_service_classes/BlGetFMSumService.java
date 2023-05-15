package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlGetFMSumInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlGetFMSumOutput;

import bea.jolt.pool.Result;

/**
 * BlGetFMSumService Class.
 * @author  Ninja
 */
public class BlGetFMSumService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "blGetFMSum00";

    /**
     * Creates a new instance of BlGetFMSumService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public BlGetFMSumService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public BlGetFMSumService() {
    }

    /**
     * Calls Tuxedo service 'BlGetFMSum'
     *
     * @return Output value object: BlGetFMSumOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public BlGetFMSumOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public BlGetFMSumInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new BlGetFMSumInput();
        }
        return (BlGetFMSumInput) this.input;
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
    protected BlGetFMSumOutput toOutput(final Result result) throws FMLManipulationException {
        return new BlGetFMSumOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private BlGetFMSumOutput setOutput(final BlGetFMSumOutput output) {
        this.output = output;
        return (BlGetFMSumOutput) this.output;
    }
}
