package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnLsLnkSubsInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnLsLnkSubsOutput;

/**
 * GnLsLnkSubsService Class.
 * @author  Ninja
 */
public class GnLsLnkSubsService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "gnLsLnkSubs00";

    /**
     * Creates a new instance of GnLsLnkSubsService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnLsLnkSubsService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new GnLsLnkSubsInput();
        ((GnLsLnkSubsInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public GnLsLnkSubsService() {
    }

    /**
     * Calls Tuxedo service 'GnLsLnkSubs'
     *
     * @return Output value object: GnLsLnkSubsOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnLsLnkSubsOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new GnLsLnkSubsOutput(super.execute());
        return ((GnLsLnkSubsOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnLsLnkSubsInput getInput() {
        return ((GnLsLnkSubsInput) this.input);
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
