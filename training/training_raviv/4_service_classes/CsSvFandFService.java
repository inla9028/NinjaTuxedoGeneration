package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSvFandFInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSvFandFOutput;

/**
 * CsSvFandFService Class.
 * @author  Ninja
 */
public class CsSvFandFService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csSvFandF00";

    /**
     * Creates a new instance of CsSvFandFService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsSvFandFService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsSvFandFInput();
        ((CsSvFandFInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsSvFandFService() {
    }

    /**
     * Calls Tuxedo service 'CsSvFandF'
     *
     * @return Output value object: CsSvFandFOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsSvFandFOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsSvFandFOutput(super.execute());
        return ((CsSvFandFOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsSvFandFInput getInput() {
        return ((CsSvFandFInput) this.input);
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
