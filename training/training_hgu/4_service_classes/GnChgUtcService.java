package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnChgUtcInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnChgUtcOutput;

import bea.jolt.pool.Result;

/**
 * GnChgUtcService Class.
 * @author  Ninja
 */
public class GnChgUtcService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "gnChgUtc00";

    /**
     * Creates a new instance of GnChgUtcService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnChgUtcService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public GnChgUtcService() {
    }

    /**
     * Calls Tuxedo service 'GnChgUtc'
     *
     * @return Output value object: GnChgUtcOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnChgUtcOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnChgUtcInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new GnChgUtcInput();
        }
        return (GnChgUtcInput) this.input;
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
    protected GnChgUtcOutput toOutput(final Result result) throws FMLManipulationException {
        return new GnChgUtcOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private GnChgUtcOutput setOutput(final GnChgUtcOutput output) {
        this.output = output;
        return (GnChgUtcOutput) this.output;
    }
}
