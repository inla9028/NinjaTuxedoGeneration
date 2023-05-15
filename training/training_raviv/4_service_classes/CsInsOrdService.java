package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsInsOrdInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsInsOrdOutput;

/**
 * CsInsOrdService Class.
 * @author  Ninja
 */
public class CsInsOrdService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csInsOrd00";

    /**
     * Creates a new instance of CsInsOrdService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsInsOrdService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsInsOrdInput();
        ((CsInsOrdInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsInsOrdService() {
    }

    /**
     * Calls Tuxedo service 'CsInsOrd'
     *
     * @return Output value object: CsInsOrdOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsInsOrdOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsInsOrdOutput(super.execute());
        return ((CsInsOrdOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsInsOrdInput getInput() {
        return ((CsInsOrdInput) this.input);
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
