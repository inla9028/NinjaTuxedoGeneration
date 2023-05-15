package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.MmMemoLsInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.MmMemoLsOutput;

import bea.jolt.pool.Result;

/**
 * MmMemoLsService Class.
 * @author  Ninja
 */
public class MmMemoLsService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "mmMemoLs00";

    /**
     * Creates a new instance of MmMemoLsService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public MmMemoLsService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public MmMemoLsService() {
    }

    /**
     * Calls Tuxedo service 'MmMemoLs'
     *
     * @return Output value object: MmMemoLsOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public MmMemoLsOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public MmMemoLsInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new MmMemoLsInput();
        }
        return (MmMemoLsInput) this.input;
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
    protected MmMemoLsOutput toOutput(final Result result) throws FMLManipulationException {
        return new MmMemoLsOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private MmMemoLsOutput setOutput(final MmMemoLsOutput output) {
        this.output = output;
        return (MmMemoLsOutput) this.output;
    }
}
