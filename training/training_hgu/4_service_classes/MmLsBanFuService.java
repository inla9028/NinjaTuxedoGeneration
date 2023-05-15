package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.MmLsBanFuInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.MmLsBanFuOutput;

import bea.jolt.pool.Result;

/**
 * MmLsBanFuService Class.
 * @author  Ninja
 */
public class MmLsBanFuService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "mmLsBanFu00";

    /**
     * Creates a new instance of MmLsBanFuService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public MmLsBanFuService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public MmLsBanFuService() {
    }

    /**
     * Calls Tuxedo service 'MmLsBanFu'
     *
     * @return Output value object: MmLsBanFuOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public MmLsBanFuOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public MmLsBanFuInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new MmLsBanFuInput();
        }
        return (MmLsBanFuInput) this.input;
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
    protected MmLsBanFuOutput toOutput(final Result result) throws FMLManipulationException {
        return new MmLsBanFuOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private MmLsBanFuOutput setOutput(final MmLsBanFuOutput output) {
        this.output = output;
        return (MmLsBanFuOutput) this.output;
    }
}
