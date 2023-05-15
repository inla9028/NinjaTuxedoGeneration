package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsVldPrmLmtInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsVldPrmLmtOutput;

/**
 * CsVldPrmLmtService Class.
 * @author  Ninja
 */
public class CsVldPrmLmtService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csVldPrmLmt00";

    /**
     * Creates a new instance of CsVldPrmLmtService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsVldPrmLmtService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsVldPrmLmtInput();
        ((CsVldPrmLmtInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsVldPrmLmtService() {
    }

    /**
     * Calls Tuxedo service 'CsVldPrmLmt'
     *
     * @return Output value object: CsVldPrmLmtOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsVldPrmLmtOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsVldPrmLmtOutput(super.execute());
        return ((CsVldPrmLmtOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsVldPrmLmtInput getInput() {
        return ((CsVldPrmLmtInput) this.input);
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
