package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArLsDiscInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArLsDiscOutput;

/**
 * ArLsDiscService Class.
 * @author  Ninja
 */
public class ArLsDiscService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arLsDisc00";

    /**
     * Creates a new instance of ArLsDiscService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArLsDiscService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ArLsDiscInput();
        ((ArLsDiscInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ArLsDiscService() {
    }

    /**
     * Calls Tuxedo service 'ArLsDisc'
     *
     * @return Output value object: ArLsDiscOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArLsDiscOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ArLsDiscOutput(super.execute());
        return ((ArLsDiscOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArLsDiscInput getInput() {
        return ((ArLsDiscInput) this.input);
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
