package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnChkAdrVldInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnChkAdrVldOutput;

import bea.jolt.pool.Result;

/**
 * GnChkAdrVldService Class.
 * @author  Ninja
 */
public class GnChkAdrVldService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "gnChkAdrVld00";

    /**
     * Creates a new instance of GnChkAdrVldService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnChkAdrVldService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public GnChkAdrVldService() {
    }

    /**
     * Calls Tuxedo service 'GnChkAdrVld'
     *
     * @return Output value object: GnChkAdrVldOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnChkAdrVldOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnChkAdrVldInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new GnChkAdrVldInput();
        }
        return (GnChkAdrVldInput) this.input;
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
    protected GnChkAdrVldOutput toOutput(final Result result) throws FMLManipulationException {
        return new GnChkAdrVldOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private GnChkAdrVldOutput setOutput(final GnChkAdrVldOutput output) {
        this.output = output;
        return (GnChkAdrVldOutput) this.output;
    }
}
