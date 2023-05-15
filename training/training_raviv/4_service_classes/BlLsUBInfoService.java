package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlLsUBInfoInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlLsUBInfoOutput;

/**
 * BlLsUBInfoService Class.
 * @author  Ninja
 */
public class BlLsUBInfoService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "blLsUBInfo00";

    /**
     * Creates a new instance of BlLsUBInfoService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public BlLsUBInfoService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new BlLsUBInfoInput();
        ((BlLsUBInfoInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public BlLsUBInfoService() {
    }

    /**
     * Calls Tuxedo service 'BlLsUBInfo'
     *
     * @return Output value object: BlLsUBInfoOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public BlLsUBInfoOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new BlLsUBInfoOutput(super.execute());
        return ((BlLsUBInfoOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public BlLsUBInfoInput getInput() {
        return ((BlLsUBInfoInput) this.input);
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
