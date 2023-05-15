package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.MmOpenFuInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.MmOpenFuOutput;

/**
 * MmOpenFuService Class.
 * @author  Ninja
 */
public class MmOpenFuService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "mmOpenFu00";

    /**
     * Creates a new instance of MmOpenFuService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public MmOpenFuService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new MmOpenFuInput();
        ((MmOpenFuInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public MmOpenFuService() {
    }

    /**
     * Calls Tuxedo service 'MmOpenFu'
     *
     * @return Output value object: MmOpenFuOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public MmOpenFuOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new MmOpenFuOutput(super.execute());
        return ((MmOpenFuOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public MmOpenFuInput getInput() {
        return ((MmOpenFuInput) this.input);
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
