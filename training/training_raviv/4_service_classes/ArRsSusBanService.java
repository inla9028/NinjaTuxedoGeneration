package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArRsSusBanInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArRsSusBanOutput;

/**
 * ArRsSusBanService Class.
 * @author  Ninja
 */
public class ArRsSusBanService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arRsSusBan00";

    /**
     * Creates a new instance of ArRsSusBanService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArRsSusBanService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ArRsSusBanInput();
        ((ArRsSusBanInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ArRsSusBanService() {
    }

    /**
     * Calls Tuxedo service 'ArRsSusBan'
     *
     * @return Output value object: ArRsSusBanOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArRsSusBanOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ArRsSusBanOutput(super.execute());
        return ((ArRsSusBanOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArRsSusBanInput getInput() {
        return ((ArRsSusBanInput) this.input);
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
