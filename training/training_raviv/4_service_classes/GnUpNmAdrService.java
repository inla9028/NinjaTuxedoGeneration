package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnUpNmAdrInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnUpNmAdrOutput;

/**
 * GnUpNmAdrService Class.
 * @author  Ninja
 */
public class GnUpNmAdrService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "gnUpNmAdr00";

    /**
     * Creates a new instance of GnUpNmAdrService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnUpNmAdrService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new GnUpNmAdrInput();
        ((GnUpNmAdrInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public GnUpNmAdrService() {
    }

    /**
     * Calls Tuxedo service 'GnUpNmAdr'
     *
     * @return Output value object: GnUpNmAdrOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnUpNmAdrOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new GnUpNmAdrOutput(super.execute());
        return ((GnUpNmAdrOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnUpNmAdrInput getInput() {
        return ((GnUpNmAdrInput) this.input);
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
