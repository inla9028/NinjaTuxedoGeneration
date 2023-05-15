package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArGtCstBanInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArGtCstBanOutput;

/**
 * ArGtCstBanService Class.
 * @author  Ninja
 */
public class ArGtCstBanService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arGtCstBan00";

    /**
     * Creates a new instance of ArGtCstBanService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArGtCstBanService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ArGtCstBanInput();
        ((ArGtCstBanInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ArGtCstBanService() {
    }

    /**
     * Calls Tuxedo service 'ArGtCstBan'
     *
     * @return Output value object: ArGtCstBanOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArGtCstBanOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ArGtCstBanOutput(super.execute());
        return ((ArGtCstBanOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArGtCstBanInput getInput() {
        return ((ArGtCstBanInput) this.input);
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
