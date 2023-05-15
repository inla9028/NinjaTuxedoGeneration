package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsOrdDtlsInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsOrdDtlsOutput;

/**
 * CsLsOrdDtlsService Class.
 * @author  Ninja
 */
public class CsLsOrdDtlsService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csLsOrdDtls00";

    /**
     * Creates a new instance of CsLsOrdDtlsService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsLsOrdDtlsService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsLsOrdDtlsInput();
        ((CsLsOrdDtlsInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsLsOrdDtlsService() {
    }

    /**
     * Calls Tuxedo service 'CsLsOrdDtls'
     *
     * @return Output value object: CsLsOrdDtlsOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsLsOrdDtlsOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsLsOrdDtlsOutput(super.execute());
        return ((CsLsOrdDtlsOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsLsOrdDtlsInput getInput() {
        return ((CsLsOrdDtlsInput) this.input);
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
