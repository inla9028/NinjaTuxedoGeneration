package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsRsCanCtnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsRsCanCtnOutput;

/**
 * CsRsCanCtnService Class.
 * @author  Ninja
 */
public class CsRsCanCtnService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csRsCanCtn00";

    /**
     * Creates a new instance of CsRsCanCtnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsRsCanCtnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsRsCanCtnInput();
        ((CsRsCanCtnInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsRsCanCtnService() {
    }

    /**
     * Calls Tuxedo service 'CsRsCanCtn'
     *
     * @return Output value object: CsRsCanCtnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsRsCanCtnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsRsCanCtnOutput(super.execute());
        return ((CsRsCanCtnOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsRsCanCtnInput getInput() {
        return ((CsRsCanCtnInput) this.input);
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
