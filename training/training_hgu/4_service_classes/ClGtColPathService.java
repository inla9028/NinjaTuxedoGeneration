package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ClGtColPathInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ClGtColPathOutput;

import bea.jolt.pool.Result;

/**
 * ClGtColPathService Class.
 * @author  Ninja
 */
public class ClGtColPathService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "clGtColPath00";

    /**
     * Creates a new instance of ClGtColPathService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ClGtColPathService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public ClGtColPathService() {
    }

    /**
     * Calls Tuxedo service 'ClGtColPath'
     *
     * @return Output value object: ClGtColPathOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ClGtColPathOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ClGtColPathInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new ClGtColPathInput();
        }
        return (ClGtColPathInput) this.input;
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
    protected ClGtColPathOutput toOutput(final Result result) throws FMLManipulationException {
        return new ClGtColPathOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private ClGtColPathOutput setOutput(final ClGtColPathOutput output) {
        this.output = output;
        return (ClGtColPathOutput) this.output;
    }
}
