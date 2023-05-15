package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsOrdLinesInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsOrdLinesOutput;

/**
 * CsLsOrdLinesService Class.
 * @author  Ninja
 */
public class CsLsOrdLinesService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csLsOrdLines00";

    /**
     * Creates a new instance of CsLsOrdLinesService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsLsOrdLinesService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsLsOrdLinesInput();
        ((CsLsOrdLinesInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsLsOrdLinesService() {
    }

    /**
     * Calls Tuxedo service 'CsLsOrdLines'
     *
     * @return Output value object: CsLsOrdLinesOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsLsOrdLinesOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsLsOrdLinesOutput(super.execute());
        return ((CsLsOrdLinesOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsLsOrdLinesInput getInput() {
        return ((CsLsOrdLinesInput) this.input);
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
