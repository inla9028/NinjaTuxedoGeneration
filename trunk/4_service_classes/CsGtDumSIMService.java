/**
 * CsGtDumSIMService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtDumSIMInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtDumSIMOutput;

/**
 * @author  Ninja
 *
 * CsGtDumSIMService Class.
 */
public class CsGtDumSIMService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csGtDumSIM00";

    /**
     * Creates a new instance of CsGtDumSIMService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsGtDumSIMService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsGtDumSIMInput();
        ((CsGtDumSIMInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsGtDumSIMService() {
    }

    /**
     * Calls Tuxedo service 'CsGtDumSIM'
     *
     * @return Output value object: CsGtDumSIMOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsGtDumSIMOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsGtDumSIMOutput(super.execute());
        return ((CsGtDumSIMOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsGtDumSIMInput getInput() {
        return ((CsGtDumSIMInput) this.input);
    }
}