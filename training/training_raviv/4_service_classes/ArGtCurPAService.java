package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArGtCurPAInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArGtCurPAOutput;

/**
 * ArGtCurPAService Class.
 * @author  Ninja
 */
public class ArGtCurPAService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arGtCurPA00";

    /**
     * Creates a new instance of ArGtCurPAService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArGtCurPAService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ArGtCurPAInput();
        ((ArGtCurPAInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ArGtCurPAService() {
    }

    /**
     * Calls Tuxedo service 'ArGtCurPA'
     *
     * @return Output value object: ArGtCurPAOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArGtCurPAOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ArGtCurPAOutput(super.execute());
        return ((ArGtCurPAOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArGtCurPAInput getInput() {
        return ((ArGtCurPAInput) this.input);
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
