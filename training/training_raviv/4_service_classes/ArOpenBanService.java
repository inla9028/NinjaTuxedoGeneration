package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArOpenBanInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArOpenBanOutput;

/**
 * ArOpenBanService Class.
 * @author  Ninja
 */
public class ArOpenBanService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arOpenBan00";

    /**
     * Creates a new instance of ArOpenBanService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArOpenBanService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ArOpenBanInput();
        ((ArOpenBanInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ArOpenBanService() {
    }

    /**
     * Calls Tuxedo service 'ArOpenBan'
     *
     * @return Output value object: ArOpenBanOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArOpenBanOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ArOpenBanOutput(super.execute());
        return ((ArOpenBanOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArOpenBanInput getInput() {
        return ((ArOpenBanInput) this.input);
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
