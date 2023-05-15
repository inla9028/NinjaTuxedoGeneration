package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnChgDiscInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnChgDiscOutput;

import bea.jolt.pool.Result;

/**
 * GnChgDiscService Class.
 * @author  Ninja
 */
public class GnChgDiscService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "gnChgDisc00";

    /**
     * Creates a new instance of GnChgDiscService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnChgDiscService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public GnChgDiscService() {
    }

    /**
     * Calls Tuxedo service 'GnChgDisc'
     *
     * @return Output value object: GnChgDiscOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnChgDiscOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnChgDiscInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new GnChgDiscInput();
        }
        return (GnChgDiscInput) this.input;
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
    protected GnChgDiscOutput toOutput(final Result result) throws FMLManipulationException {
        return new GnChgDiscOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private GnChgDiscOutput setOutput(final GnChgDiscOutput output) {
        this.output = output;
        return (GnChgDiscOutput) this.output;
    }
}
