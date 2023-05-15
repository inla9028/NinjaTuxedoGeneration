package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArLsDefAgrInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArLsDefAgrOutput;

/**
 * ArLsDefAgrService Class.
 * @author  Ninja
 */
public class ArLsDefAgrService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arLsDefAgr00";

    /**
     * Creates a new instance of ArLsDefAgrService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArLsDefAgrService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ArLsDefAgrInput();
        ((ArLsDefAgrInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ArLsDefAgrService() {
    }

    /**
     * Calls Tuxedo service 'ArLsDefAgr'
     *
     * @return Output value object: ArLsDefAgrOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArLsDefAgrOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ArLsDefAgrOutput(super.execute());
        return ((ArLsDefAgrOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArLsDefAgrInput getInput() {
        return ((ArLsDefAgrInput) this.input);
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
