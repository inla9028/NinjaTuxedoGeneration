package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchInvNoInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchInvNoOutput;

/**
 * CsSrchInvNoService Class.
 * @author  Ninja
 */
public class CsSrchInvNoService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csSrchInvNo00";

    /**
     * Creates a new instance of CsSrchInvNoService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsSrchInvNoService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsSrchInvNoInput();
        ((CsSrchInvNoInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsSrchInvNoService() {
    }

    /**
     * Calls Tuxedo service 'CsSrchInvNo'
     *
     * @return Output value object: CsSrchInvNoOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsSrchInvNoOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsSrchInvNoOutput(super.execute());
        return ((CsSrchInvNoOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsSrchInvNoInput getInput() {
        return ((CsSrchInvNoInput) this.input);
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
