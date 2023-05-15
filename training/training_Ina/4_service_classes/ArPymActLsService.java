/**
 * ArPymActLsService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArPymActLsInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArPymActLsOutput;

/**
 * @author  Ninja
 *
 * ArPymActLsService Class.
 */
public class ArPymActLsService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "arPymActLs00";

    /**
     * Creates a new instance of ArPymActLsService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArPymActLsService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ArPymActLsInput();
        ((ArPymActLsInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ArPymActLsService() {
    }

    /**
     * Calls Tuxedo service 'ArPymActLs'
     *
     * @return Output value object: ArPymActLsOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArPymActLsOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ArPymActLsOutput(super.execute());
        return ((ArPymActLsOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArPymActLsInput getInput() {
        return ((ArPymActLsInput) this.input);
    }
}