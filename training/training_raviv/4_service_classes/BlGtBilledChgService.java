/**
 * BlGtBilledChgService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlGtBilledChgInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlGtBilledChgOutput;

/**
 * @author  Ninja
 *
 * BlGtBilledChgService Class.
 */
public class BlGtBilledChgService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "blGtBilledChg00";

    /**
     * Creates a new instance of BlGtBilledChgService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public BlGtBilledChgService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new BlGtBilledChgInput();
        ((BlGtBilledChgInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public BlGtBilledChgService() {
    }

    /**
     * Calls Tuxedo service 'BlGtBilledChg'
     *
     * @return Output value object: BlGtBilledChgOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public BlGtBilledChgOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new BlGtBilledChgOutput(super.execute());
        return ((BlGtBilledChgOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public BlGtBilledChgInput getInput() {
        return ((BlGtBilledChgInput) this.input);
    }
}