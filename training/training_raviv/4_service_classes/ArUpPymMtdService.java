package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArUpPymMtdInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArUpPymMtdOutput;

/**
 * ArUpPymMtdService Class.
 * @author  Ninja
 */
public class ArUpPymMtdService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arUpPymMtd00";

    /**
     * Creates a new instance of ArUpPymMtdService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArUpPymMtdService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ArUpPymMtdInput();
        ((ArUpPymMtdInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ArUpPymMtdService() {
    }

    /**
     * Calls Tuxedo service 'ArUpPymMtd'
     *
     * @return Output value object: ArUpPymMtdOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArUpPymMtdOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ArUpPymMtdOutput(super.execute());
        return ((ArUpPymMtdOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArUpPymMtdInput getInput() {
        return ((ArUpPymMtdInput) this.input);
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
