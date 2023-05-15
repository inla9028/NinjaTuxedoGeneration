package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGetCtnNmInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGetCtnNmOutput;

/**
 * CsGetCtnNmService Class.
 * @author  Ninja
 */
public class CsGetCtnNmService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csGetCtnNm00";

    /**
     * Creates a new instance of CsGetCtnNmService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsGetCtnNmService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsGetCtnNmInput();
        ((CsGetCtnNmInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsGetCtnNmService() {
    }

    /**
     * Calls Tuxedo service 'CsGetCtnNm'
     *
     * @return Output value object: CsGetCtnNmOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsGetCtnNmOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsGetCtnNmOutput(super.execute());
        return ((CsGetCtnNmOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsGetCtnNmInput getInput() {
        return ((CsGetCtnNmInput) this.input);
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
