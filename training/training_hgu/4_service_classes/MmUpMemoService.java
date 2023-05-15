package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.MmUpMemoInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.MmUpMemoOutput;

import bea.jolt.pool.Result;

/**
 * MmUpMemoService Class.
 * @author  Ninja
 */
public class MmUpMemoService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "mmUpMemo00";

    /**
     * Creates a new instance of MmUpMemoService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public MmUpMemoService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public MmUpMemoService() {
    }

    /**
     * Calls Tuxedo service 'MmUpMemo'
     *
     * @return Output value object: MmUpMemoOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public MmUpMemoOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public MmUpMemoInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new MmUpMemoInput();
        }
        return (MmUpMemoInput) this.input;
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
    protected MmUpMemoOutput toOutput(final Result result) throws FMLManipulationException {
        return new MmUpMemoOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private MmUpMemoOutput setOutput(final MmUpMemoOutput output) {
        this.output = output;
        return (MmUpMemoOutput) this.output;
    }
}
