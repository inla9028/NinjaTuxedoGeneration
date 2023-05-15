package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArCrOrdPymInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArCrOrdPymOutput;

/**
 * ArCrOrdPymService Class.
 * @author  Ninja
 */
public class ArCrOrdPymService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arCrOrdPym00";

    /**
     * Creates a new instance of ArCrOrdPymService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArCrOrdPymService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ArCrOrdPymInput();
        ((ArCrOrdPymInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ArCrOrdPymService() {
    }

    /**
     * Calls Tuxedo service 'ArCrOrdPym'
     *
     * @return Output value object: ArCrOrdPymOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArCrOrdPymOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ArCrOrdPymOutput(super.execute());
        return ((ArCrOrdPymOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArCrOrdPymInput getInput() {
        return ((ArCrOrdPymInput) this.input);
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
