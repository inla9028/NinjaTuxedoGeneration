package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArSvBanSvcInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArSvBanSvcOutput;

/**
 * ArSvBanSvcService Class.
 * @author  Ninja
 */
public class ArSvBanSvcService extends TuxedoService implements TuxedoExecutable {
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
}
