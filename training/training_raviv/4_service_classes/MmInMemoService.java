package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.MmInMemoInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.MmInMemoOutput;

/**
 * MmInMemoService Class.
 * @author  Ninja
 */
public class MmInMemoService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "mmInMemo00";

    /**
     * Creates a new instance of MmInMemoService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public MmInMemoService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new MmInMemoInput();
        ((MmInMemoInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public MmInMemoService() {
    }

    /**
     * Calls Tuxedo service 'MmInMemo'
     *
     * @return Output value object: MmInMemoOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public MmInMemoOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new MmInMemoOutput(super.execute());
        return ((MmInMemoOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public MmInMemoInput getInput() {
        return ((MmInMemoInput) this.input);
    }

   /**
    * @return The tuxedo service name
    */
   public String getName() {
       return getServiceName();
   }

   /**
    * @return The tuxedo service name
    */
   public static String getServiceName() {
       return NAME;
   }
}
