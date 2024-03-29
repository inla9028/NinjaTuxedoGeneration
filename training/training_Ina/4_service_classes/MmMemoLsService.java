/**
 * MmMemoLsService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.MmMemoLsInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.MmMemoLsOutput;

/**
 * @author  Ninja
 *
 * MmMemoLsService Class.
 */
public class MmMemoLsService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "mmMemoLs00";

    /**
     * Creates a new instance of MmMemoLsService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public MmMemoLsService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new MmMemoLsInput();
        ((MmMemoLsInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public MmMemoLsService() {
    }

    /**
     * Calls Tuxedo service 'MmMemoLs'
     *
     * @return Output value object: MmMemoLsOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public MmMemoLsOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new MmMemoLsOutput(super.execute());
        return ((MmMemoLsOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public MmMemoLsInput getInput() {
        return ((MmMemoLsInput) this.input);
    }
}