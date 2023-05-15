package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArGtBanInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArGtBanOutput;

/**
 * ArGtBanService Class.
 * @author  Ninja
 */
public class ArGtBanService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arGtBan00";

    /**
     * Creates a new instance of ArGtBanService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArGtBanService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ArGtBanInput();
        ((ArGtBanInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ArGtBanService() {
    }

    /**
     * Calls Tuxedo service 'ArGtBan'
     *
     * @return Output value object: ArGtBanOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArGtBanOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ArGtBanOutput(super.execute());
        return ((ArGtBanOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArGtBanInput getInput() {
        return ((ArGtBanInput) this.input);
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
