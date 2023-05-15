package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvCommitInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvCommitOutput;

/**
 * CvCommitService Class.
 * @author  Ninja
 */
public class CvCommitService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "cvCommit00";

    /**
     * Creates a new instance of CvCommitService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CvCommitService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CvCommitInput();
        ((CvCommitInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CvCommitService() {
    }

    /**
     * Calls Tuxedo service 'CvCommit'
     *
     * @return Output value object: CvCommitOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CvCommitOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CvCommitOutput(super.execute());
        return ((CvCommitOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CvCommitInput getInput() {
        return ((CvCommitInput) this.input);
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
