package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlGtContoInfoInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlGtContoInfoOutput;

import bea.jolt.pool.Result;

/**
 * BlGtContoInfoService Class.
 * @author  Ninja
 */
public class BlGtContoInfoService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "blGtContoInfo00";

    /**
     * Creates a new instance of BlGtContoInfoService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public BlGtContoInfoService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public BlGtContoInfoService() {
    }

    /**
     * Calls Tuxedo service 'BlGtContoInfo'
     *
     * @return Output value object: BlGtContoInfoOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public BlGtContoInfoOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public BlGtContoInfoInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new BlGtContoInfoInput();
        }
        return (BlGtContoInfoInput) this.input;
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
    protected BlGtContoInfoOutput toOutput(final Result result) throws FMLManipulationException {
        return new BlGtContoInfoOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private BlGtContoInfoOutput setOutput(final BlGtContoInfoOutput output) {
        this.output = output;
        return (BlGtContoInfoOutput) this.output;
    }
}
