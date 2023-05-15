package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnNodeActInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnNodeActOutput;

import bea.jolt.pool.Result;

/**
 * GnNodeActService Class.
 * @author  Ninja
 */
public class GnNodeActService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "gnNodeAct00";

    /**
     * Creates a new instance of GnNodeActService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnNodeActService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public GnNodeActService() {
    }

    /**
     * Calls Tuxedo service 'GnNodeAct'
     *
     * @return Output value object: GnNodeActOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnNodeActOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnNodeActInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new GnNodeActInput();
        }
        return (GnNodeActInput) this.input;
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
    protected GnNodeActOutput toOutput(final Result result) throws FMLManipulationException {
        return new GnNodeActOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private GnNodeActOutput setOutput(final GnNodeActOutput output) {
        this.output = output;
        return (GnNodeActOutput) this.output;
    }
}
