package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArUpPymMtdInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArUpPymMtdOutput;

import bea.jolt.pool.Result;

/**
 * ArUpPymMtdService Class.
 * @author  Ninja
 */
public class ArUpPymMtdService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arUpPymMtd00";

    /**
     * Creates a new instance of ArUpPymMtdService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArUpPymMtdService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public ArUpPymMtdService() {
    }

    /**
     * Calls Tuxedo service 'ArUpPymMtd'
     *
     * @return Output value object: ArUpPymMtdOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArUpPymMtdOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArUpPymMtdInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new ArUpPymMtdInput();
        }
        return (ArUpPymMtdInput) this.input;
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
    protected ArUpPymMtdOutput toOutput(final Result result) throws FMLManipulationException {
        return new ArUpPymMtdOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private ArUpPymMtdOutput setOutput(final ArUpPymMtdOutput output) {
        this.output = output;
        return (ArUpPymMtdOutput) this.output;
    }
}
