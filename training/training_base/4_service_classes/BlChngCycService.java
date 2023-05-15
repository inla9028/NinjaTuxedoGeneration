/**
 * BlChngCycService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlChngCycInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlChngCycOutput;

/**
 * @author  Ninja
 *
 * BlChngCycService Class.
 */
public class BlChngCycService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "blChngCyc00";

    /**
     * Creates a new instance of BlChngCycService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public BlChngCycService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new BlChngCycInput();
        ((BlChngCycInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public BlChngCycService() {
    }

    /**
     * Calls Tuxedo service 'BlChngCyc'
     *
     * @return Output value object: BlChngCycOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public BlChngCycOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new BlChngCycOutput(super.execute());
        return ((BlChngCycOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public BlChngCycInput getInput() {
        return ((BlChngCycInput) this.input);
    }
}