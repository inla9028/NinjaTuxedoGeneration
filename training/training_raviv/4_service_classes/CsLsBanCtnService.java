package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsBanCtnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsBanCtnOutput;

/**
 * CsLsBanCtnService Class.
 * @author  Ninja
 */
public class CsLsBanCtnService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csLsBanCtn00";

    /**
     * Creates a new instance of CsLsBanCtnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsLsBanCtnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsLsBanCtnInput();
        ((CsLsBanCtnInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsLsBanCtnService() {
    }

    /**
     * Calls Tuxedo service 'CsLsBanCtn'
     *
     * @return Output value object: CsLsBanCtnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsLsBanCtnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsLsBanCtnOutput(super.execute());
        return ((CsLsBanCtnOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsLsBanCtnInput getInput() {
        return ((CsLsBanCtnInput) this.input);
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
