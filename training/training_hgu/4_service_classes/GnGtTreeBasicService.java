package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnGtTreeBasicInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnGtTreeBasicOutput;

import bea.jolt.pool.Result;

/**
 * GnGtTreeBasicService Class.
 * @author  Ninja
 */
public class GnGtTreeBasicService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "gnGtTreeBasic00";

    /**
     * Creates a new instance of GnGtTreeBasicService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnGtTreeBasicService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public GnGtTreeBasicService() {
    }

    /**
     * Calls Tuxedo service 'GnGtTreeBasic'
     *
     * @return Output value object: GnGtTreeBasicOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnGtTreeBasicOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnGtTreeBasicInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new GnGtTreeBasicInput();
        }
        return (GnGtTreeBasicInput) this.input;
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
    protected GnGtTreeBasicOutput toOutput(final Result result) throws FMLManipulationException {
        return new GnGtTreeBasicOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private GnGtTreeBasicOutput setOutput(final GnGtTreeBasicOutput output) {
        this.output = output;
        return (GnGtTreeBasicOutput) this.output;
    }
}
