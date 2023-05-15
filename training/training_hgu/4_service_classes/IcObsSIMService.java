package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.IcObsSIMInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.IcObsSIMOutput;

import bea.jolt.pool.Result;

/**
 * IcObsSIMService Class.
 * @author  Ninja
 */
public class IcObsSIMService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "icObsSIM00";

    /**
     * Creates a new instance of IcObsSIMService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public IcObsSIMService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public IcObsSIMService() {
    }

    /**
     * Calls Tuxedo service 'IcObsSIM'
     *
     * @return Output value object: IcObsSIMOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public IcObsSIMOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public IcObsSIMInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new IcObsSIMInput();
        }
        return (IcObsSIMInput) this.input;
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
    protected IcObsSIMOutput toOutput(final Result result) throws FMLManipulationException {
        return new IcObsSIMOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private IcObsSIMOutput setOutput(final IcObsSIMOutput output) {
        this.output = output;
        return (IcObsSIMOutput) this.output;
    }
}
