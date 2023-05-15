package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnGtUtcDscInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnGtUtcDscOutput;

import bea.jolt.pool.Result;

/**
 * GnGtUtcDscService Class.
 * @author  Ninja
 */
public class GnGtUtcDscService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "gnGtUtcDsc00";

    /**
     * Creates a new instance of GnGtUtcDscService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnGtUtcDscService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public GnGtUtcDscService() {
    }

    /**
     * Calls Tuxedo service 'GnGtUtcDsc'
     *
     * @return Output value object: GnGtUtcDscOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnGtUtcDscOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnGtUtcDscInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new GnGtUtcDscInput();
        }
        return (GnGtUtcDscInput) this.input;
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
    protected GnGtUtcDscOutput toOutput(final Result result) throws FMLManipulationException {
        return new GnGtUtcDscOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private GnGtUtcDscOutput setOutput(final GnGtUtcDscOutput output) {
        this.output = output;
        return (GnGtUtcDscOutput) this.output;
    }
}
