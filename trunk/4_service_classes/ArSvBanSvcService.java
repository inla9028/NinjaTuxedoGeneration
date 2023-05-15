/**
 * ArSvBanSvcService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArSvBanSvcInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArSvBanSvcOutput;

/**
 * @author  Ninja
 *
 * ArSvBanSvcService Class.
 */
public class ArSvBanSvcService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "arSvBanSvc00";

    /**
     * Creates a new instance of ArSvBanSvcService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArSvBanSvcService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ArSvBanSvcInput();
        ((ArSvBanSvcInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ArSvBanSvcService() {
    }

    /**
     * Calls Tuxedo service 'ArSvBanSvc'
     *
     * @return Output value object: ArSvBanSvcOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArSvBanSvcOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ArSvBanSvcOutput(super.execute());
        return ((ArSvBanSvcOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArSvBanSvcInput getInput() {
        return ((ArSvBanSvcInput) this.input);
    }
}