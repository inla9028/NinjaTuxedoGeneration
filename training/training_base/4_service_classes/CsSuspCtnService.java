/**
 * CsSuspCtnService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSuspCtnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSuspCtnOutput;

/**
 * @author  Ninja
 *
 * CsSuspCtnService Class.
 */
public class CsSuspCtnService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csSuspCtn00";

    /**
     * Creates a new instance of CsSuspCtnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsSuspCtnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsSuspCtnInput();
        ((CsSuspCtnInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsSuspCtnService() {
    }

    /**
     * Calls Tuxedo service 'CsSuspCtn'
     *
     * @return Output value object: CsSuspCtnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsSuspCtnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsSuspCtnOutput(super.execute());
        return ((CsSuspCtnOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsSuspCtnInput getInput() {
        return ((CsSuspCtnInput) this.input);
    }
}