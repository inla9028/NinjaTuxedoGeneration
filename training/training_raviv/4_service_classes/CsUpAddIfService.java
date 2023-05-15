package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsUpAddIfInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsUpAddIfOutput;

/**
 * CsUpAddIfService Class.
 * @author  Ninja
 */
public class CsUpAddIfService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csUpAddIf00";

    /**
     * Creates a new instance of CsUpAddIfService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsUpAddIfService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsUpAddIfInput();
        ((CsUpAddIfInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsUpAddIfService() {
    }

    /**
     * Calls Tuxedo service 'CsUpAddIf'
     *
     * @return Output value object: CsUpAddIfOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsUpAddIfOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsUpAddIfOutput(super.execute());
        return ((CsUpAddIfOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsUpAddIfInput getInput() {
        return ((CsUpAddIfInput) this.input);
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
