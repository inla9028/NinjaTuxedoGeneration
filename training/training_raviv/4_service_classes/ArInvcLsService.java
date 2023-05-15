package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArInvcLsInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArInvcLsOutput;

/**
 * ArInvcLsService Class.
 * @author  Ninja
 */
public class ArInvcLsService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arInvcLs00";

    /**
     * Creates a new instance of ArInvcLsService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArInvcLsService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ArInvcLsInput();
        ((ArInvcLsInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ArInvcLsService() {
    }

    /**
     * Calls Tuxedo service 'ArInvcLs'
     *
     * @return Output value object: ArInvcLsOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArInvcLsOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ArInvcLsOutput(super.execute());
        return ((ArInvcLsOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArInvcLsInput getInput() {
        return ((ArInvcLsInput) this.input);
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
