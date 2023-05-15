package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnUpLnkEntInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnUpLnkEntOutput;

/**
 * GnUpLnkEntService Class.
 * @author  Ninja
 */
public class GnUpLnkEntService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "gnUpLnkEnt00";

    /**
     * Creates a new instance of GnUpLnkEntService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnUpLnkEntService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new GnUpLnkEntInput();
        ((GnUpLnkEntInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public GnUpLnkEntService() {
    }

    /**
     * Calls Tuxedo service 'GnUpLnkEnt'
     *
     * @return Output value object: GnUpLnkEntOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnUpLnkEntOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new GnUpLnkEntOutput(super.execute());
        return ((GnUpLnkEntOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnUpLnkEntInput getInput() {
        return ((GnUpLnkEntInput) this.input);
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
