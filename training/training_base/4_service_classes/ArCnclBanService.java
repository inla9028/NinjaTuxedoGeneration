/**
 * ArCnclBanService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArCnclBanInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArCnclBanOutput;

/**
 * @author  Ninja
 *
 * ArCnclBanService Class.
 */
public class ArCnclBanService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "arCnclBan00";

    /**
     * Creates a new instance of ArCnclBanService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArCnclBanService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ArCnclBanInput();
        ((ArCnclBanInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ArCnclBanService() {
    }

    /**
     * Calls Tuxedo service 'ArCnclBan'
     *
     * @return Output value object: ArCnclBanOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArCnclBanOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ArCnclBanOutput(super.execute());
        return ((ArCnclBanOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArCnclBanInput getInput() {
        return ((ArCnclBanInput) this.input);
    }
}