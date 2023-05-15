package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ClGtColHistInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ClGtColHistOutput;

import bea.jolt.pool.Result;

/**
 * ClGtColHistService Class.
 * @author  Ninja
 */
public class ClGtColHistService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "clGtColHist00";

    /**
     * Creates a new instance of ClGtColHistService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ClGtColHistService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public ClGtColHistService() {
    }

    /**
     * Calls Tuxedo service 'ClGtColHist'
     *
     * @return Output value object: ClGtColHistOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ClGtColHistOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ClGtColHistInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new ClGtColHistInput();
        }
        return (ClGtColHistInput) this.input;
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
    protected ClGtColHistOutput toOutput(final Result result) throws FMLManipulationException {
        return new ClGtColHistOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private ClGtColHistOutput setOutput(final ClGtColHistOutput output) {
        this.output = output;
        return (ClGtColHistOutput) this.output;
    }
}
