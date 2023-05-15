package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArCloseBanInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArCloseBanOutput;

import bea.jolt.pool.Result;

/**
 * ArCloseBanService Class.
 * @author  Ninja
 */
public class ArCloseBanService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arCloseBan00";

    /**
     * Creates a new instance of ArCloseBanService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArCloseBanService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public ArCloseBanService() {
    }

    /**
     * Calls Tuxedo service 'ArCloseBan'
     *
     * @return Output value object: ArCloseBanOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArCloseBanOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArCloseBanInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new ArCloseBanInput();
        }
        return (ArCloseBanInput) this.input;
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
    protected ArCloseBanOutput toOutput(final Result result) throws FMLManipulationException {
        return new ArCloseBanOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private ArCloseBanOutput setOutput(final ArCloseBanOutput output) {
        this.output = output;
        return (ArCloseBanOutput) this.output;
    }
}
