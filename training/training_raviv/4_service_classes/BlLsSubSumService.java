/**
 * BlLsSubSumService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlLsSubSumInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlLsSubSumOutput;

/**
 * @author  Ninja
 *
 * BlLsSubSumService Class.
 */
public class BlLsSubSumService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "blLsSubSum00";

    /**
     * Creates a new instance of BlLsSubSumService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public BlLsSubSumService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new BlLsSubSumInput();
        ((BlLsSubSumInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public BlLsSubSumService() {
    }

    /**
     * Calls Tuxedo service 'BlLsSubSum'
     *
     * @return Output value object: BlLsSubSumOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public BlLsSubSumOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new BlLsSubSumOutput(super.execute());
        return ((BlLsSubSumOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public BlLsSubSumInput getInput() {
        return ((BlLsSubSumInput) this.input);
    }
}