package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArLsDefFtrInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArLsDefFtrOutput;

/**
 * ArLsDefFtrService Class.
 * @author  Ninja
 */
public class ArLsDefFtrService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arLsDefFtr00";

    /**
     * Creates a new instance of ArLsDefFtrService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArLsDefFtrService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ArLsDefFtrInput();
        ((ArLsDefFtrInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ArLsDefFtrService() {
    }

    /**
     * Calls Tuxedo service 'ArLsDefFtr'
     *
     * @return Output value object: ArLsDefFtrOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArLsDefFtrOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ArLsDefFtrOutput(super.execute());
        return ((ArLsDefFtrOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArLsDefFtrInput getInput() {
        return ((ArLsDefFtrInput) this.input);
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
