package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtWrkDateInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtWrkDateOutput;

/**
 * CsGtWrkDateService Class.
 * @author  Ninja
 */
public class CsGtWrkDateService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csGtWrkDate00";

    /**
     * Creates a new instance of CsGtWrkDateService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsGtWrkDateService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsGtWrkDateInput();
        ((CsGtWrkDateInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsGtWrkDateService() {
    }

    /**
     * Calls Tuxedo service 'CsGtWrkDate'
     *
     * @return Output value object: CsGtWrkDateOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsGtWrkDateOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsGtWrkDateOutput(super.execute());
        return ((CsGtWrkDateOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsGtWrkDateInput getInput() {
        return ((CsGtWrkDateInput) this.input);
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
