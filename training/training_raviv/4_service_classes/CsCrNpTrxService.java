package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsCrNpTrxInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsCrNpTrxOutput;

/**
 * CsCrNpTrxService Class.
 * @author  Ninja
 */
public class CsCrNpTrxService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csCrNpTrx00";

    /**
     * Creates a new instance of CsCrNpTrxService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsCrNpTrxService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsCrNpTrxInput();
        ((CsCrNpTrxInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsCrNpTrxService() {
    }

    /**
     * Calls Tuxedo service 'CsCrNpTrx'
     *
     * @return Output value object: CsCrNpTrxOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsCrNpTrxOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsCrNpTrxOutput(super.execute());
        return ((CsCrNpTrxOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsCrNpTrxInput getInput() {
        return ((CsCrNpTrxInput) this.input);
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
