package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnGtAdrItmInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnGtAdrItmOutput;

import bea.jolt.pool.Result;

/**
 * GnGtAdrItmService Class.
 * @author  Ninja
 */
public class GnGtAdrItmService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "gnGtAdrItm00";

    /**
     * Creates a new instance of GnGtAdrItmService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnGtAdrItmService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public GnGtAdrItmService() {
    }

    /**
     * Calls Tuxedo service 'GnGtAdrItm'
     *
     * @return Output value object: GnGtAdrItmOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnGtAdrItmOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnGtAdrItmInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new GnGtAdrItmInput();
        }
        return (GnGtAdrItmInput) this.input;
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
    protected GnGtAdrItmOutput toOutput(final Result result) throws FMLManipulationException {
        return new GnGtAdrItmOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private GnGtAdrItmOutput setOutput(final GnGtAdrItmOutput output) {
        this.output = output;
        return (GnGtAdrItmOutput) this.output;
    }
}
