package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlLsBillListInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlLsBillListOutput;

/**
 * BlLsBillListService Class.
 * @author  Ninja
 */
public class BlLsBillListService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "blLsBillList00";

    /**
     * Creates a new instance of BlLsBillListService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public BlLsBillListService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new BlLsBillListInput();
        ((BlLsBillListInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public BlLsBillListService() {
    }

    /**
     * Calls Tuxedo service 'BlLsBillList'
     *
     * @return Output value object: BlLsBillListOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public BlLsBillListOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new BlLsBillListOutput(super.execute());
        return ((BlLsBillListOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public BlLsBillListInput getInput() {
        return ((BlLsBillListInput) this.input);
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
