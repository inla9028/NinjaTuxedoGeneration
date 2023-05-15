/**
 * ArUpCstBanService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArUpCstBanInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArUpCstBanOutput;

/**
 * @author  Ninja
 *
 * ArUpCstBanService Class.
 */
public class ArUpCstBanService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "arUpCstBan00";

    /**
     * Creates a new instance of ArUpCstBanService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArUpCstBanService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ArUpCstBanInput();
        ((ArUpCstBanInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ArUpCstBanService() {
    }

    /**
     * Calls Tuxedo service 'ArUpCstBan'
     *
     * @return Output value object: ArUpCstBanOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArUpCstBanOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ArUpCstBanOutput(super.execute());
        return ((ArUpCstBanOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArUpCstBanInput getInput() {
        return ((ArUpCstBanInput) this.input);
    }
}