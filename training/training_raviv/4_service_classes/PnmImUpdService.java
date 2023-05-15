package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.PnmImUpdInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.PnmImUpdOutput;

/**
 * PnmImUpdService Class.
 * @author  Ninja
 */
public class PnmImUpdService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "pnmImUpd00";

    /**
     * Creates a new instance of PnmImUpdService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public PnmImUpdService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new PnmImUpdInput();
        ((PnmImUpdInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public PnmImUpdService() {
    }

    /**
     * Calls Tuxedo service 'PnmImUpd'
     *
     * @return Output value object: PnmImUpdOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public PnmImUpdOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new PnmImUpdOutput(super.execute());
        return ((PnmImUpdOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public PnmImUpdInput getInput() {
        return ((PnmImUpdInput) this.input);
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
