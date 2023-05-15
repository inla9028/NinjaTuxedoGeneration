package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlLsUBChgInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlLsUBChgOutput;

/**
 * BlLsUBChgService Class.
 * @author  Ninja
 */
public class BlLsUBChgService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "blLsUBChg00";

    /**
     * Creates a new instance of BlLsUBChgService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public BlLsUBChgService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new BlLsUBChgInput();
        ((BlLsUBChgInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public BlLsUBChgService() {
    }

    /**
     * Calls Tuxedo service 'BlLsUBChg'
     *
     * @return Output value object: BlLsUBChgOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public BlLsUBChgOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new BlLsUBChgOutput(super.execute());
        return ((BlLsUBChgOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public BlLsUBChgInput getInput() {
        return ((BlLsUBChgInput) this.input);
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
