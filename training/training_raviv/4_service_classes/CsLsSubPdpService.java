package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsSubPdpInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsSubPdpOutput;

/**
 * CsLsSubPdpService Class.
 * @author  Ninja
 */
public class CsLsSubPdpService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csLsSubPdp00";

    /**
     * Creates a new instance of CsLsSubPdpService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsLsSubPdpService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsLsSubPdpInput();
        ((CsLsSubPdpInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsLsSubPdpService() {
    }

    /**
     * Calls Tuxedo service 'CsLsSubPdp'
     *
     * @return Output value object: CsLsSubPdpOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsLsSubPdpOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsLsSubPdpOutput(super.execute());
        return ((CsLsSubPdpOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsLsSubPdpInput getInput() {
        return ((CsLsSubPdpInput) this.input);
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
