package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArLsBilPrmInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArLsBilPrmOutput;

/**
 * ArLsBilPrmService Class.
 * @author  Ninja
 */
public class ArLsBilPrmService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arLsBilPrm00";

    /**
     * Creates a new instance of ArLsBilPrmService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArLsBilPrmService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ArLsBilPrmInput();
        ((ArLsBilPrmInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ArLsBilPrmService() {
    }

    /**
     * Calls Tuxedo service 'ArLsBilPrm'
     *
     * @return Output value object: ArLsBilPrmOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArLsBilPrmOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ArLsBilPrmOutput(super.execute());
        return ((ArLsBilPrmOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArLsBilPrmInput getInput() {
        return ((ArLsBilPrmInput) this.input);
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
