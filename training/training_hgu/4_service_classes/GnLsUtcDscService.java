package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnLsUtcDscInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnLsUtcDscOutput;

import bea.jolt.pool.Result;

/**
 * GnLsUtcDscService Class.
 * @author  Ninja
 */
public class GnLsUtcDscService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "gnLsUtcDsc00";

    /**
     * Creates a new instance of GnLsUtcDscService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnLsUtcDscService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public GnLsUtcDscService() {
    }

    /**
     * Calls Tuxedo service 'GnLsUtcDsc'
     *
     * @return Output value object: GnLsUtcDscOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnLsUtcDscOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnLsUtcDscInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new GnLsUtcDscInput();
        }
        return (GnLsUtcDscInput) this.input;
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
    protected GnLsUtcDscOutput toOutput(final Result result) throws FMLManipulationException {
        return new GnLsUtcDscOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private GnLsUtcDscOutput setOutput(final GnLsUtcDscOutput output) {
        this.output = output;
        return (GnLsUtcDscOutput) this.output;
    }
}
