/**
 * CsLsSubPdpService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsSubPdpInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsSubPdpOutput;

/**
 * @author  Ninja
 *
 * CsLsSubPdpService Class.
 */
public class CsLsSubPdpService extends TuxedoService {
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
}