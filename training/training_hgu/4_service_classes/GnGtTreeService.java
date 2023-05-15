package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnGtTreeInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnGtTreeOutput;

import bea.jolt.pool.Result;

/**
 * GnGtTreeService Class.
 * @author  Ninja
 */
public class GnGtTreeService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "gnGtTree00";

    /**
     * Creates a new instance of GnGtTreeService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnGtTreeService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public GnGtTreeService() {
    }

    /**
     * Calls Tuxedo service 'GnGtTree'
     *
     * @return Output value object: GnGtTreeOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnGtTreeOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnGtTreeInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new GnGtTreeInput();
        }
        return (GnGtTreeInput) this.input;
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
    protected GnGtTreeOutput toOutput(final Result result) throws FMLManipulationException {
        return new GnGtTreeOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private GnGtTreeOutput setOutput(final GnGtTreeOutput output) {
        this.output = output;
        return (GnGtTreeOutput) this.output;
    }
}
