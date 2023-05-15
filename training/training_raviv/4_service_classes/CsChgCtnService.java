package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsChgCtnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsChgCtnOutput;

/**
 * CsChgCtnService Class.
 * @author  Ninja
 */
public class CsChgCtnService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csChgCtn00";

    /**
     * Creates a new instance of CsChgCtnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsChgCtnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsChgCtnInput();
        ((CsChgCtnInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsChgCtnService() {
    }

    /**
     * Calls Tuxedo service 'CsChgCtn'
     *
     * @return Output value object: CsChgCtnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsChgCtnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsChgCtnOutput(super.execute());
        return ((CsChgCtnOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsChgCtnInput getInput() {
        return ((CsChgCtnInput) this.input);
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
