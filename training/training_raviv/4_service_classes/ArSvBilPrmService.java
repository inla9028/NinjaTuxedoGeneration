package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArSvBilPrmInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArSvBilPrmOutput;

/**
 * ArSvBilPrmService Class.
 * @author  Ninja
 */
public class ArSvBilPrmService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arSvBilPrm00";

    /**
     * Creates a new instance of ArSvBilPrmService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArSvBilPrmService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ArSvBilPrmInput();
        ((ArSvBilPrmInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ArSvBilPrmService() {
    }

    /**
     * Calls Tuxedo service 'ArSvBilPrm'
     *
     * @return Output value object: ArSvBilPrmOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArSvBilPrmOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ArSvBilPrmOutput(super.execute());
        return ((ArSvBilPrmOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArSvBilPrmInput getInput() {
        return ((ArSvBilPrmInput) this.input);
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
