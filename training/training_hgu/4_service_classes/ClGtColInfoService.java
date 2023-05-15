package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ClGtColInfoInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ClGtColInfoOutput;

import bea.jolt.pool.Result;

/**
 * ClGtColInfoService Class.
 * @author  Ninja
 */
public class ClGtColInfoService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "clGtColInfo00";

    /**
     * Creates a new instance of ClGtColInfoService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ClGtColInfoService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public ClGtColInfoService() {
    }

    /**
     * Calls Tuxedo service 'ClGtColInfo'
     *
     * @return Output value object: ClGtColInfoOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ClGtColInfoOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ClGtColInfoInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new ClGtColInfoInput();
        }
        return (ClGtColInfoInput) this.input;
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
    protected ClGtColInfoOutput toOutput(final Result result) throws FMLManipulationException {
        return new ClGtColInfoOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private ClGtColInfoOutput setOutput(final ClGtColInfoOutput output) {
        this.output = output;
        return (ClGtColInfoOutput) this.output;
    }
}
