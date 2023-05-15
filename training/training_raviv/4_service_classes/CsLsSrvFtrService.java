package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsSrvFtrInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsSrvFtrOutput;

/**
 * CsLsSrvFtrService Class.
 * @author  Ninja
 */
public class CsLsSrvFtrService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csLsSrvFtr00";

    /**
     * Creates a new instance of CsLsSrvFtrService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsLsSrvFtrService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsLsSrvFtrInput();
        ((CsLsSrvFtrInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsLsSrvFtrService() {
    }

    /**
     * Calls Tuxedo service 'CsLsSrvFtr'
     *
     * @return Output value object: CsLsSrvFtrOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsLsSrvFtrOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsLsSrvFtrOutput(super.execute());
        return ((CsLsSrvFtrOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsLsSrvFtrInput getInput() {
        return ((CsLsSrvFtrInput) this.input);
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
