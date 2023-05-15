/**
 * CsCnclCtnService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsCnclCtnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsCnclCtnOutput;

/**
 * @author  Ninja
 *
 * CsCnclCtnService Class.
 */
public class CsCnclCtnService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csCnclCtn00";

    /**
     * Creates a new instance of CsCnclCtnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsCnclCtnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsCnclCtnInput();
        ((CsCnclCtnInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsCnclCtnService() {
    }

    /**
     * Calls Tuxedo service 'CsCnclCtn'
     *
     * @return Output value object: CsCnclCtnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsCnclCtnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsCnclCtnOutput(super.execute());
        return ((CsCnclCtnOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsCnclCtnInput getInput() {
        return ((CsCnclCtnInput) this.input);
    }
}