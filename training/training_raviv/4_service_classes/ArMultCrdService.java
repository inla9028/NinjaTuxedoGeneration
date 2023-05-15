/**
 * ArMultCrdService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArMultCrdInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArMultCrdOutput;

/**
 * @author  Ninja
 *
 * ArMultCrdService Class.
 */
public class ArMultCrdService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "arMultCrd00";

    /**
     * Creates a new instance of ArMultCrdService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArMultCrdService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ArMultCrdInput();
        ((ArMultCrdInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ArMultCrdService() {
    }

    /**
     * Calls Tuxedo service 'ArMultCrd'
     *
     * @return Output value object: ArMultCrdOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArMultCrdOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ArMultCrdOutput(super.execute());
        return ((ArMultCrdOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArMultCrdInput getInput() {
        return ((ArMultCrdInput) this.input);
    }
}