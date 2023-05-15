package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsExpNpTrxInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsExpNpTrxOutput;

/**
 * CsExpNpTrxService Class.
 * @author  Ninja
 */
public class CsExpNpTrxService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csExpNpTrx00";

    /**
     * Creates a new instance of CsExpNpTrxService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsExpNpTrxService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsExpNpTrxInput();
        ((CsExpNpTrxInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsExpNpTrxService() {
    }

    /**
     * Calls Tuxedo service 'CsExpNpTrx'
     *
     * @return Output value object: CsExpNpTrxOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsExpNpTrxOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsExpNpTrxOutput(super.execute());
        return ((CsExpNpTrxOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsExpNpTrxInput getInput() {
        return ((CsExpNpTrxInput) this.input);
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
