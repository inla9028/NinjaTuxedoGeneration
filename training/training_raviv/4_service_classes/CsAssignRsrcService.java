package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsAssignRsrcInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsAssignRsrcOutput;

/**
 * CsAssignRsrcService Class.
 * @author  Ninja
 */
public class CsAssignRsrcService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csAssignRsrc00";

    /**
     * Creates a new instance of CsAssignRsrcService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsAssignRsrcService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsAssignRsrcInput();
        ((CsAssignRsrcInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsAssignRsrcService() {
    }

    /**
     * Calls Tuxedo service 'CsAssignRsrc'
     *
     * @return Output value object: CsAssignRsrcOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsAssignRsrcOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsAssignRsrcOutput(super.execute());
        return ((CsAssignRsrcOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsAssignRsrcInput getInput() {
        return ((CsAssignRsrcInput) this.input);
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
