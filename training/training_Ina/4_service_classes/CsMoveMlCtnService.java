/**
 * CsMoveMlCtnService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsMoveMlCtnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsMoveMlCtnOutput;

/**
 * @author  Ninja
 *
 * CsMoveMlCtnService Class.
 */
public class CsMoveMlCtnService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csMoveMlCtn00";

    /**
     * Creates a new instance of CsMoveMlCtnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsMoveMlCtnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsMoveMlCtnInput();
        ((CsMoveMlCtnInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsMoveMlCtnService() {
    }

    /**
     * Calls Tuxedo service 'CsMoveMlCtn'
     *
     * @return Output value object: CsMoveMlCtnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsMoveMlCtnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsMoveMlCtnOutput(super.execute());
        return ((CsMoveMlCtnOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsMoveMlCtnInput getInput() {
        return ((CsMoveMlCtnInput) this.input);
    }
}