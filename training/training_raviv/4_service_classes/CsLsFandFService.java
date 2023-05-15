package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsFandFInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsFandFOutput;

/**
 * CsLsFandFService Class.
 * @author  Ninja
 */
public class CsLsFandFService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csLsFandF00";

    /**
     * Creates a new instance of CsLsFandFService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsLsFandFService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsLsFandFInput();
        ((CsLsFandFInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsLsFandFService() {
    }

    /**
     * Calls Tuxedo service 'CsLsFandF'
     *
     * @return Output value object: CsLsFandFOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsLsFandFOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsLsFandFOutput(super.execute());
        return ((CsLsFandFOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsLsFandFInput getInput() {
        return ((CsLsFandFInput) this.input);
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
