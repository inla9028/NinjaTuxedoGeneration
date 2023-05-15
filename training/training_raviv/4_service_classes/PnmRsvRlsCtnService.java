package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.PnmRsvRlsCtnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.PnmRsvRlsCtnOutput;

/**
 * PnmRsvRlsCtnService Class.
 * @author  Ninja
 */
public class PnmRsvRlsCtnService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "pnmRsvRlsCtn00";

    /**
     * Creates a new instance of PnmRsvRlsCtnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public PnmRsvRlsCtnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new PnmRsvRlsCtnInput();
        ((PnmRsvRlsCtnInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public PnmRsvRlsCtnService() {
    }

    /**
     * Calls Tuxedo service 'PnmRsvRlsCtn'
     *
     * @return Output value object: PnmRsvRlsCtnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public PnmRsvRlsCtnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new PnmRsvRlsCtnOutput(super.execute());
        return ((PnmRsvRlsCtnOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public PnmRsvRlsCtnInput getInput() {
        return ((PnmRsvRlsCtnInput) this.input);
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
