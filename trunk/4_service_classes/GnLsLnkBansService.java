/**
 * GnLsLnkBansService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnLsLnkBansInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnLsLnkBansOutput;

/**
 * @author  Ninja
 *
 * GnLsLnkBansService Class.
 */
public class GnLsLnkBansService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "gnLsLnkBans00";

    /**
     * Creates a new instance of GnLsLnkBansService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnLsLnkBansService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new GnLsLnkBansInput();
        ((GnLsLnkBansInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public GnLsLnkBansService() {
    }

    /**
     * Calls Tuxedo service 'GnLsLnkBans'
     *
     * @return Output value object: GnLsLnkBansOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnLsLnkBansOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new GnLsLnkBansOutput(super.execute());
        return ((GnLsLnkBansOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnLsLnkBansInput getInput() {
        return ((GnLsLnkBansInput) this.input);
    }
}