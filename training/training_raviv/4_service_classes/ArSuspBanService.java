package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArSuspBanInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArSuspBanOutput;

/**
 * ArSuspBanService Class.
 * @author  Ninja
 */
public class ArSuspBanService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arSuspBan00";

    /**
     * Creates a new instance of ArSuspBanService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArSuspBanService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ArSuspBanInput();
        ((ArSuspBanInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ArSuspBanService() {
    }

    /**
     * Calls Tuxedo service 'ArSuspBan'
     *
     * @return Output value object: ArSuspBanOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArSuspBanOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ArSuspBanOutput(super.execute());
        return ((ArSuspBanOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArSuspBanInput getInput() {
        return ((ArSuspBanInput) this.input);
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
