package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtOcAmtInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtOcAmtOutput;

/**
 * CsGtOcAmtService Class.
 * @author  Ninja
 */
public class CsGtOcAmtService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csGtOcAmt00";

    /**
     * Creates a new instance of CsGtOcAmtService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsGtOcAmtService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsGtOcAmtInput();
        ((CsGtOcAmtInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsGtOcAmtService() {
    }

    /**
     * Calls Tuxedo service 'CsGtOcAmt'
     *
     * @return Output value object: CsGtOcAmtOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsGtOcAmtOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsGtOcAmtOutput(super.execute());
        return ((CsGtOcAmtOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsGtOcAmtInput getInput() {
        return ((CsGtOcAmtInput) this.input);
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
