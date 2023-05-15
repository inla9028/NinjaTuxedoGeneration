package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArAdjBanInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArAdjBanOutput;

/**
 * ArAdjBanService Class.
 * @author  Ninja
 */
public class ArAdjBanService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arAdjBan00";

    /**
     * Creates a new instance of ArAdjBanService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArAdjBanService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ArAdjBanInput();
        ((ArAdjBanInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ArAdjBanService() {
    }

    /**
     * Calls Tuxedo service 'ArAdjBan'
     *
     * @return Output value object: ArAdjBanOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArAdjBanOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ArAdjBanOutput(super.execute());
        return ((ArAdjBanOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArAdjBanInput getInput() {
        return ((ArAdjBanInput) this.input);
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
