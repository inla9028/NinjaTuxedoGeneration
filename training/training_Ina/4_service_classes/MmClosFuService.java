/**
 * MmClosFuService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.MmClosFuInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.MmClosFuOutput;

/**
 * @author  Ninja
 *
 * MmClosFuService Class.
 */
public class MmClosFuService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "mmClosFu00";

    /**
     * Creates a new instance of MmClosFuService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public MmClosFuService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new MmClosFuInput();
        ((MmClosFuInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public MmClosFuService() {
    }

    /**
     * Calls Tuxedo service 'MmClosFu'
     *
     * @return Output value object: MmClosFuOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public MmClosFuOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new MmClosFuOutput(super.execute());
        return ((MmClosFuOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public MmClosFuInput getInput() {
        return ((MmClosFuInput) this.input);
    }
}