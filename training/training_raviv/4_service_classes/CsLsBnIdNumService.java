package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsBnIdNumInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsBnIdNumOutput;

/**
 * CsLsBnIdNumService Class.
 * @author  Ninja
 */
public class CsLsBnIdNumService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csLsBnIdNum00";

    /**
     * Creates a new instance of CsLsBnIdNumService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsLsBnIdNumService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsLsBnIdNumInput();
        ((CsLsBnIdNumInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsLsBnIdNumService() {
    }

    /**
     * Calls Tuxedo service 'CsLsBnIdNum'
     *
     * @return Output value object: CsLsBnIdNumOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsLsBnIdNumOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsLsBnIdNumOutput(super.execute());
        return ((CsLsBnIdNumOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsLsBnIdNumInput getInput() {
        return ((CsLsBnIdNumInput) this.input);
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
