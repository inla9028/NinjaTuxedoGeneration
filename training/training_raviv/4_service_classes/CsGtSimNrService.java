package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtSimNrInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtSimNrOutput;

/**
 * CsGtSimNrService Class.
 * @author  Ninja
 */
public class CsGtSimNrService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csGtSimNr00";

    /**
     * Creates a new instance of CsGtSimNrService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsGtSimNrService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsGtSimNrInput();
        ((CsGtSimNrInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsGtSimNrService() {
    }

    /**
     * Calls Tuxedo service 'CsGtSimNr'
     *
     * @return Output value object: CsGtSimNrOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsGtSimNrOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsGtSimNrOutput(super.execute());
        return ((CsGtSimNrOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsGtSimNrInput getInput() {
        return ((CsGtSimNrInput) this.input);
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
