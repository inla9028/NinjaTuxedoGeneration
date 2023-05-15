/**
 * ArSvPymArngService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArSvPymArngInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArSvPymArngOutput;

/**
 * @author  Ninja
 *
 * ArSvPymArngService Class.
 */
public class ArSvPymArngService extends TuxedoService {
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
        this.input = new ArSvPymArngInput();
        ((ArSvPymArngInput) this.input).set_OPERATOR_ID(operatorId);
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
        this.output = new ArSvPymArngOutput(super.execute());
        return ((ArSvPymArngOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArSvPymArngInput getInput() {
        return ((ArSvPymArngInput) this.input);
    }
}