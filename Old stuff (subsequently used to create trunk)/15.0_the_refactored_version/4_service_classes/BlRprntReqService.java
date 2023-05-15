/**
 * BlRprntReqService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlRprntReqInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlRprntReqOutput;

/**
 * @author  Ninja
 *
 * BlRprntReqService Class.
 */
public class BlRprntReqService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "blRprntReq00";

    /**
     * Creates a new instance of BlRprntReqService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public BlRprntReqService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new BlRprntReqInput();
        ((BlRprntReqInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public BlRprntReqService() {
    }

    /**
     * Calls Tuxedo service 'BlRprntReq'
     *
     * @return Output value object: BlRprntReqOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public BlRprntReqOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new BlRprntReqOutput(super.execute());
        return ((BlRprntReqOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public BlRprntReqInput getInput() {
        return ((BlRprntReqInput) this.input);
    }
}