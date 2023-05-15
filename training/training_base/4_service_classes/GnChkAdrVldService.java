/**
 * GnChkAdrVldService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnChkAdrVldInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnChkAdrVldOutput;

/**
 * @author  Ninja
 *
 * GnChkAdrVldService Class.
 */
public class GnChkAdrVldService extends TuxedoService {
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
        this.input = new GnChkAdrVldInput();
        ((GnChkAdrVldInput) this.input).set_OPERATOR_ID(operatorId);
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
        this.output = new GnChkAdrVldOutput(super.execute());
        return ((GnChkAdrVldOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnChkAdrVldInput getInput() {
        return ((GnChkAdrVldInput) this.input);
    }
}