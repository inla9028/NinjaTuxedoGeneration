/**
 * CsCrCtnService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsCrCtnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsCrCtnOutput;

/**
 * @author  Ninja
 *
 * CsCrCtnService Class.
 */
public class CsCrCtnService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csCrCtn00";

    /**
     * Creates a new instance of CsCrCtnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsCrCtnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsCrCtnInput();
        ((CsCrCtnInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsCrCtnService() {
    }

    /**
     * Calls Tuxedo service 'CsCrCtn'
     *
     * @return Output value object: CsCrCtnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsCrCtnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsCrCtnOutput(super.execute());
        return ((CsCrCtnOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsCrCtnInput getInput() {
        return ((CsCrCtnInput) this.input);
    }
}