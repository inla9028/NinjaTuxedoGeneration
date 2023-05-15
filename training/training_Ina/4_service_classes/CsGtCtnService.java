/**
 * CsGtCtnService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtCtnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtCtnOutput;

/**
 * @author  Ninja
 *
 * CsGtCtnService Class.
 */
public class CsGtCtnService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csGtCtn00";

    /**
     * Creates a new instance of CsGtCtnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsGtCtnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsGtCtnInput();
        ((CsGtCtnInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsGtCtnService() {
    }

    /**
     * Calls Tuxedo service 'CsGtCtn'
     *
     * @return Output value object: CsGtCtnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsGtCtnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsGtCtnOutput(super.execute());
        return ((CsGtCtnOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsGtCtnInput getInput() {
        return ((CsGtCtnInput) this.input);
    }
}