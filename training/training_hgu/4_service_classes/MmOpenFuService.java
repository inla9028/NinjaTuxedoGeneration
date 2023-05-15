package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.MmOpenFuInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.MmOpenFuOutput;

import bea.jolt.pool.Result;

/**
 * MmOpenFuService Class.
 * @author  Ninja
 */
public class MmOpenFuService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "mmOpenFu00";

    /**
     * Creates a new instance of MmOpenFuService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public MmOpenFuService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public MmOpenFuService() {
    }

    /**
     * Calls Tuxedo service 'MmOpenFu'
     *
     * @return Output value object: MmOpenFuOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public MmOpenFuOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public MmOpenFuInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new MmOpenFuInput();
        }
        return (MmOpenFuInput) this.input;
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
    protected MmOpenFuOutput toOutput(final Result result) throws FMLManipulationException {
        return new MmOpenFuOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private MmOpenFuOutput setOutput(final MmOpenFuOutput output) {
        this.output = output;
        return (MmOpenFuOutput) this.output;
    }
}
