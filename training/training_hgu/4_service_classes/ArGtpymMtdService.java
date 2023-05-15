package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArGtpymMtdInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArGtpymMtdOutput;

import bea.jolt.pool.Result;

/**
 * ArGtpymMtdService Class.
 * @author  Ninja
 */
public class ArGtpymMtdService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arGtpymMtd00";

    /**
     * Creates a new instance of ArGtpymMtdService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArGtpymMtdService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public ArGtpymMtdService() {
    }

    /**
     * Calls Tuxedo service 'ArGtpymMtd'
     *
     * @return Output value object: ArGtpymMtdOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArGtpymMtdOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArGtpymMtdInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new ArGtpymMtdInput();
        }
        return (ArGtpymMtdInput) this.input;
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
    protected ArGtpymMtdOutput toOutput(final Result result) throws FMLManipulationException {
        return new ArGtpymMtdOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private ArGtpymMtdOutput setOutput(final ArGtpymMtdOutput output) {
        this.output = output;
        return (ArGtpymMtdOutput) this.output;
    }
}
