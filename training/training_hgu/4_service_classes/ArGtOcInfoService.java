package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArGtOcInfoInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArGtOcInfoOutput;

import bea.jolt.pool.Result;

/**
 * ArGtOcInfoService Class.
 * @author  Ninja
 */
public class ArGtOcInfoService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arGtOcInfo00";

    /**
     * Creates a new instance of ArGtOcInfoService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArGtOcInfoService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public ArGtOcInfoService() {
    }

    /**
     * Calls Tuxedo service 'ArGtOcInfo'
     *
     * @return Output value object: ArGtOcInfoOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArGtOcInfoOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArGtOcInfoInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new ArGtOcInfoInput();
        }
        return (ArGtOcInfoInput) this.input;
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
    protected ArGtOcInfoOutput toOutput(final Result result) throws FMLManipulationException {
        return new ArGtOcInfoOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private ArGtOcInfoOutput setOutput(final ArGtOcInfoOutput output) {
        this.output = output;
        return (ArGtOcInfoOutput) this.output;
    }
}
