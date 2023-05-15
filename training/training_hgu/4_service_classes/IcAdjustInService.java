package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.IcAdjustInInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.IcAdjustInOutput;

import bea.jolt.pool.Result;

/**
 * IcAdjustInService Class.
 * @author  Ninja
 */
public class IcAdjustInService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "icAdjustIn00";

    /**
     * Creates a new instance of IcAdjustInService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public IcAdjustInService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public IcAdjustInService() {
    }

    /**
     * Calls Tuxedo service 'IcAdjustIn'
     *
     * @return Output value object: IcAdjustInOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public IcAdjustInOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public IcAdjustInInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new IcAdjustInInput();
        }
        return (IcAdjustInInput) this.input;
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
    protected IcAdjustInOutput toOutput(final Result result) throws FMLManipulationException {
        return new IcAdjustInOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private IcAdjustInOutput setOutput(final IcAdjustInOutput output) {
        this.output = output;
        return (IcAdjustInOutput) this.output;
    }
}
