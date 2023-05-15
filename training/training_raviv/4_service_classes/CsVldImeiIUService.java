package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsVldImeiIUInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsVldImeiIUOutput;

/**
 * CsVldImeiIUService Class.
 * @author  Ninja
 */
public class CsVldImeiIUService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csVldImeiIU00";

    /**
     * Creates a new instance of CsVldImeiIUService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsVldImeiIUService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsVldImeiIUInput();
        ((CsVldImeiIUInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsVldImeiIUService() {
    }

    /**
     * Calls Tuxedo service 'CsVldImeiIU'
     *
     * @return Output value object: CsVldImeiIUOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsVldImeiIUOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsVldImeiIUOutput(super.execute());
        return ((CsVldImeiIUOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsVldImeiIUInput getInput() {
        return ((CsVldImeiIUInput) this.input);
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
