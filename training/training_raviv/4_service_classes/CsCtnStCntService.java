package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsCtnStCntInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsCtnStCntOutput;

/**
 * CsCtnStCntService Class.
 * @author  Ninja
 */
public class CsCtnStCntService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csCtnStCnt00";

    /**
     * Creates a new instance of CsCtnStCntService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsCtnStCntService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsCtnStCntInput();
        ((CsCtnStCntInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsCtnStCntService() {
    }

    /**
     * Calls Tuxedo service 'CsCtnStCnt'
     *
     * @return Output value object: CsCtnStCntOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsCtnStCntOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsCtnStCntOutput(super.execute());
        return ((CsCtnStCntOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsCtnStCntInput getInput() {
        return ((CsCtnStCntInput) this.input);
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
