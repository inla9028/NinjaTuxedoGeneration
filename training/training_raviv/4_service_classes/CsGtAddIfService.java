package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtAddIfInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtAddIfOutput;

/**
 * CsGtAddIfService Class.
 * @author  Ninja
 */
public class CsGtAddIfService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csGtAddIf00";

    /**
     * Creates a new instance of CsGtAddIfService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsGtAddIfService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsGtAddIfInput();
        ((CsGtAddIfInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsGtAddIfService() {
    }

    /**
     * Calls Tuxedo service 'CsGtAddIf'
     *
     * @return Output value object: CsGtAddIfOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsGtAddIfOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsGtAddIfOutput(super.execute());
        return ((CsGtAddIfOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsGtAddIfInput getInput() {
        return ((CsGtAddIfInput) this.input);
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
