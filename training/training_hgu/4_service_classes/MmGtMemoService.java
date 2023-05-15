package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.MmGtMemoInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.MmGtMemoOutput;

import bea.jolt.pool.Result;

/**
 * MmGtMemoService Class.
 * @author  Ninja
 */
public class MmGtMemoService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "mmGtMemo00";

    /**
     * Creates a new instance of MmGtMemoService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public MmGtMemoService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public MmGtMemoService() {
    }

    /**
     * Calls Tuxedo service 'MmGtMemo'
     *
     * @return Output value object: MmGtMemoOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public MmGtMemoOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public MmGtMemoInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new MmGtMemoInput();
        }
        return (MmGtMemoInput) this.input;
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
    protected MmGtMemoOutput toOutput(final Result result) throws FMLManipulationException {
        return new MmGtMemoOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private MmGtMemoOutput setOutput(final MmGtMemoOutput output) {
        this.output = output;
        return (MmGtMemoOutput) this.output;
    }
}
