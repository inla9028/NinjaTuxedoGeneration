/**
 * MmGtMemoService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.MmGtMemoInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.MmGtMemoOutput;

/**
 * @author  Ninja
 *
 * MmGtMemoService Class.
 */
public class MmGtMemoService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "mmGtMemo00";

    /**
     * Creates a new instance of MmGtMemoService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public MmGtMemoService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new MmGtMemoInput();
        ((MmGtMemoInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public MmGtMemoService() {
    }

    /**
     * Calls Tuxedo service 'MmGtMemo'
     *
     * @return Output value object: MmGtMemoOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public MmGtMemoOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new MmGtMemoOutput(super.execute());
        return ((MmGtMemoOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public MmGtMemoInput getInput() {
        return ((MmGtMemoInput) this.input);
    }
}