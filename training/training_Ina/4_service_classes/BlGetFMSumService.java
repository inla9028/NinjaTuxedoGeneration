/**
 * BlGetFMSumService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlGetFMSumInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlGetFMSumOutput;

/**
 * @author  Ninja
 *
 * BlGetFMSumService Class.
 */
public class BlGetFMSumService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "blGetFMSum00";

    /**
     * Creates a new instance of BlGetFMSumService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public BlGetFMSumService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new BlGetFMSumInput();
        ((BlGetFMSumInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public BlGetFMSumService() {
    }

    /**
     * Calls Tuxedo service 'BlGetFMSum'
     *
     * @return Output value object: BlGetFMSumOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public BlGetFMSumOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new BlGetFMSumOutput(super.execute());
        return ((BlGetFMSumOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public BlGetFMSumInput getInput() {
        return ((BlGetFMSumInput) this.input);
    }
}