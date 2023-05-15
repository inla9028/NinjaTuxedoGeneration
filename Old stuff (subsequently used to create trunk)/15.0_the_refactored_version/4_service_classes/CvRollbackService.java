/**
 * CvRollbackService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvRollbackInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvRollbackOutput;

/**
 * @author  Ninja
 *
 * CvRollbackService Class.
 */
public class CvRollbackService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "cvRollback00";

    /**
     * Creates a new instance of CvRollbackService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CvRollbackService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CvRollbackInput();
        ((CvRollbackInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CvRollbackService() {
    }

    /**
     * Calls Tuxedo service 'CvRollback'
     *
     * @return Output value object: CvRollbackOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CvRollbackOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CvRollbackOutput(super.execute());
        return ((CvRollbackOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CvRollbackInput getInput() {
        return ((CvRollbackInput) this.input);
    }
}