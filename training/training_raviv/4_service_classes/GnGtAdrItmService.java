package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnGtAdrItmInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnGtAdrItmOutput;

/**
 * GnGtAdrItmService Class.
 * @author  Ninja
 */
public class GnGtAdrItmService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "gnGtAdrItm00";

    /**
     * Creates a new instance of GnGtAdrItmService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnGtAdrItmService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new GnGtAdrItmInput();
        ((GnGtAdrItmInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public GnGtAdrItmService() {
    }

    /**
     * Calls Tuxedo service 'GnGtAdrItm'
     *
     * @return Output value object: GnGtAdrItmOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnGtAdrItmOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new GnGtAdrItmOutput(super.execute());
        return ((GnGtAdrItmOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnGtAdrItmInput getInput() {
        return ((GnGtAdrItmInput) this.input);
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
