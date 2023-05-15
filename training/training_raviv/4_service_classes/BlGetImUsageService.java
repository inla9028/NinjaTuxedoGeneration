package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlGetImUsageInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlGetImUsageOutput;

/**
 * BlGetImUsageService Class.
 * @author  Ninja
 */
public class BlGetImUsageService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "blGetImUsage00";

    /**
     * Creates a new instance of BlGetImUsageService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public BlGetImUsageService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new BlGetImUsageInput();
        ((BlGetImUsageInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public BlGetImUsageService() {
    }

    /**
     * Calls Tuxedo service 'BlGetImUsage'
     *
     * @return Output value object: BlGetImUsageOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public BlGetImUsageOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new BlGetImUsageOutput(super.execute());
        return ((BlGetImUsageOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public BlGetImUsageInput getInput() {
        return ((BlGetImUsageInput) this.input);
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
