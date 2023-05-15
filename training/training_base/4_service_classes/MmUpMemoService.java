/**
 * MmUpMemoService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.MmUpMemoInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.MmUpMemoOutput;

/**
 * @author  Ninja
 *
 * MmUpMemoService Class.
 */
public class MmUpMemoService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "mmUpMemo00";

    /**
     * Creates a new instance of MmUpMemoService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public MmUpMemoService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new MmUpMemoInput();
        ((MmUpMemoInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public MmUpMemoService() {
    }

    /**
     * Calls Tuxedo service 'MmUpMemo'
     *
     * @return Output value object: MmUpMemoOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public MmUpMemoOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new MmUpMemoOutput(super.execute());
        return ((MmUpMemoOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public MmUpMemoInput getInput() {
        return ((MmUpMemoInput) this.input);
    }
}