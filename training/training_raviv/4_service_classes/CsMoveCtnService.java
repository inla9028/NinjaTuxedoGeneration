package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsMoveCtnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsMoveCtnOutput;

/**
 * CsMoveCtnService Class.
 * @author  Ninja
 */
public class CsMoveCtnService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csMoveCtn00";

    /**
     * Creates a new instance of CsMoveCtnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsMoveCtnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsMoveCtnInput();
        ((CsMoveCtnInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsMoveCtnService() {
    }

    /**
     * Calls Tuxedo service 'CsMoveCtn'
     *
     * @return Output value object: CsMoveCtnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsMoveCtnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsMoveCtnOutput(super.execute());
        return ((CsMoveCtnOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsMoveCtnInput getInput() {
        return ((CsMoveCtnInput) this.input);
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
