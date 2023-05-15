package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlLsSocLoanInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlLsSocLoanOutput;

/**
 * BlLsSocLoanService Class.
 * @author  Ninja
 */
public class BlLsSocLoanService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "blLsSocLoan00";

    /**
     * Creates a new instance of BlLsSocLoanService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public BlLsSocLoanService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new BlLsSocLoanInput();
        ((BlLsSocLoanInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public BlLsSocLoanService() {
    }

    /**
     * Calls Tuxedo service 'BlLsSocLoan'
     *
     * @return Output value object: BlLsSocLoanOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public BlLsSocLoanOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new BlLsSocLoanOutput(super.execute());
        return ((BlLsSocLoanOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public BlLsSocLoanInput getInput() {
        return ((BlLsSocLoanInput) this.input);
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
