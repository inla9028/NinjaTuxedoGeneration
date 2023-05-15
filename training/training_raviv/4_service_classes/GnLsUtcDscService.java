package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnLsUtcDscInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnLsUtcDscOutput;

/**
 * GnLsUtcDscService Class.
 * @author  Ninja
 */
public class GnLsUtcDscService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "gnLsUtcDsc00";

    /**
     * Creates a new instance of GnLsUtcDscService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnLsUtcDscService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new GnLsUtcDscInput();
        ((GnLsUtcDscInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public GnLsUtcDscService() {
    }

    /**
     * Calls Tuxedo service 'GnLsUtcDsc'
     *
     * @return Output value object: GnLsUtcDscOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnLsUtcDscOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new GnLsUtcDscOutput(super.execute());
        return ((GnLsUtcDscOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnLsUtcDscInput getInput() {
        return ((GnLsUtcDscInput) this.input);
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
