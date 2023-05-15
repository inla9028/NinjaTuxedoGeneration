package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArSvDiscInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArSvDiscOutput;

import bea.jolt.pool.Result;

/**
 * ArSvDiscService Class.
 * @author  Ninja
 */
public class ArSvDiscService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arSvDisc00";

    /**
     * Creates a new instance of ArSvDiscService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArSvDiscService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public ArSvDiscService() {
    }

    /**
     * Calls Tuxedo service 'ArSvDisc'
     *
     * @return Output value object: ArSvDiscOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArSvDiscOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArSvDiscInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new ArSvDiscInput();
        }
        return (ArSvDiscInput) this.input;
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
    protected ArSvDiscOutput toOutput(final Result result) throws FMLManipulationException {
        return new ArSvDiscOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private ArSvDiscOutput setOutput(final ArSvDiscOutput output) {
        this.output = output;
        return (ArSvDiscOutput) this.output;
    }
}
