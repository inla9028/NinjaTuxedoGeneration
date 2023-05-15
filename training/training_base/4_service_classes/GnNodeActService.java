/**
 * GnNodeActService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnNodeActInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnNodeActOutput;

/**
 * @author  Ninja
 *
 * GnNodeActService Class.
 */
public class GnNodeActService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "gnNodeAct00";

    /**
     * Creates a new instance of GnNodeActService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnNodeActService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new GnNodeActInput();
        ((GnNodeActInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public GnNodeActService() {
    }

    /**
     * Calls Tuxedo service 'GnNodeAct'
     *
     * @return Output value object: GnNodeActOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnNodeActOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new GnNodeActOutput(super.execute());
        return ((GnNodeActOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnNodeActInput getInput() {
        return ((GnNodeActInput) this.input);
    }
}