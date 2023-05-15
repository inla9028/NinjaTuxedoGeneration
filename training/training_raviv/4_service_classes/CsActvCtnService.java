package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsActvCtnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsActvCtnOutput;

/**
 * CsActvCtnService Class.
 * @author  Ninja
 */
public class CsActvCtnService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csActvCtn00";

    /**
     * Creates a new instance of CsActvCtnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsActvCtnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsActvCtnInput();
        ((CsActvCtnInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsActvCtnService() {
    }

    /**
     * Calls Tuxedo service 'CsActvCtn'
     *
     * @return Output value object: CsActvCtnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsActvCtnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsActvCtnOutput(super.execute());
        return ((CsActvCtnOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsActvCtnInput getInput() {
        return ((CsActvCtnInput) this.input);
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
