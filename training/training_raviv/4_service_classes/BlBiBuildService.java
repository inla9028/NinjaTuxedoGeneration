package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlBiBuildInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlBiBuildOutput;

/**
 * BlBiBuildService Class.
 * @author  Ninja
 */
public class BlBiBuildService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "blBiBuild00";

    /**
     * Creates a new instance of BlBiBuildService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public BlBiBuildService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new BlBiBuildInput();
        ((BlBiBuildInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public BlBiBuildService() {
    }

    /**
     * Calls Tuxedo service 'BlBiBuild'
     *
     * @return Output value object: BlBiBuildOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public BlBiBuildOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new BlBiBuildOutput(super.execute());
        return ((BlBiBuildOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public BlBiBuildInput getInput() {
        return ((BlBiBuildInput) this.input);
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
