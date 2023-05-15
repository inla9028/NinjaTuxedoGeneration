package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnGetTreeInfoInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnGetTreeInfoOutput;

/**
 * GnGetTreeInfoService Class.
 * @author  Ninja
 */
public class GnGetTreeInfoService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "gnGetTreeInfo00";

    /**
     * Creates a new instance of GnGetTreeInfoService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnGetTreeInfoService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new GnGetTreeInfoInput();
        ((GnGetTreeInfoInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public GnGetTreeInfoService() {
    }

    /**
     * Calls Tuxedo service 'GnGetTreeInfo'
     *
     * @return Output value object: GnGetTreeInfoOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnGetTreeInfoOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new GnGetTreeInfoOutput(super.execute());
        return ((GnGetTreeInfoOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnGetTreeInfoInput getInput() {
        return ((GnGetTreeInfoInput) this.input);
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
