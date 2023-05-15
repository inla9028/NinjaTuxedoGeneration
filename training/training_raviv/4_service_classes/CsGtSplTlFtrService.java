package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtSplTlFtrInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtSplTlFtrOutput;

/**
 * CsGtSplTlFtrService Class.
 * @author  Ninja
 */
public class CsGtSplTlFtrService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csGtSplTlFtr00";

    /**
     * Creates a new instance of CsGtSplTlFtrService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsGtSplTlFtrService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsGtSplTlFtrInput();
        ((CsGtSplTlFtrInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsGtSplTlFtrService() {
    }

    /**
     * Calls Tuxedo service 'CsGtSplTlFtr'
     *
     * @return Output value object: CsGtSplTlFtrOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsGtSplTlFtrOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsGtSplTlFtrOutput(super.execute());
        return ((CsGtSplTlFtrOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsGtSplTlFtrInput getInput() {
        return ((CsGtSplTlFtrInput) this.input);
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
