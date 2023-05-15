package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ClUHldAutoInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ClUHldAutoOutput;

import bea.jolt.pool.Result;

/**
 * ClUHldAutoService Class.
 * @author  Ninja
 */
public class ClUHldAutoService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "clUHldAuto00";

    /**
     * Creates a new instance of ClUHldAutoService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ClUHldAutoService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public ClUHldAutoService() {
    }

    /**
     * Calls Tuxedo service 'ClUHldAuto'
     *
     * @return Output value object: ClUHldAutoOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ClUHldAutoOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ClUHldAutoInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new ClUHldAutoInput();
        }
        return (ClUHldAutoInput) this.input;
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
    protected ClUHldAutoOutput toOutput(final Result result) throws FMLManipulationException {
        return new ClUHldAutoOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private ClUHldAutoOutput setOutput(final ClUHldAutoOutput output) {
        this.output = output;
        return (ClUHldAutoOutput) this.output;
    }
}
