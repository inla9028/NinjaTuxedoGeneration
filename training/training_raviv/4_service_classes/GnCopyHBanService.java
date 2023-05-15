package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnCopyHBanInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnCopyHBanOutput;

/**
 * GnCopyHBanService Class.
 * @author  Ninja
 */
public class GnCopyHBanService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "gnCopyHBan00";

    /**
     * Creates a new instance of GnCopyHBanService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnCopyHBanService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new GnCopyHBanInput();
        ((GnCopyHBanInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public GnCopyHBanService() {
    }

    /**
     * Calls Tuxedo service 'GnCopyHBan'
     *
     * @return Output value object: GnCopyHBanOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnCopyHBanOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new GnCopyHBanOutput(super.execute());
        return ((GnCopyHBanOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnCopyHBanInput getInput() {
        return ((GnCopyHBanInput) this.input);
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
