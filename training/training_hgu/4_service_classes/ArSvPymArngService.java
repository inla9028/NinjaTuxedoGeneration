package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArSvPymArngInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArSvPymArngOutput;

import bea.jolt.pool.Result;

/**
 * ArSvPymArngService Class.
 * @author  Ninja
 */
public class ArSvPymArngService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arSvPymArng00";

    /**
     * Creates a new instance of ArSvPymArngService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArSvPymArngService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public ArSvPymArngService() {
    }

    /**
     * Calls Tuxedo service 'ArSvPymArng'
     *
     * @return Output value object: ArSvPymArngOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArSvPymArngOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArSvPymArngInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new ArSvPymArngInput();
        }
        return (ArSvPymArngInput) this.input;
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
    protected ArSvPymArngOutput toOutput(final Result result) throws FMLManipulationException {
        return new ArSvPymArngOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private ArSvPymArngOutput setOutput(final ArSvPymArngOutput output) {
        this.output = output;
        return (ArSvPymArngOutput) this.output;
    }
}
