package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvRollbackInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvRollbackOutput;

import bea.jolt.pool.Result;

/**
 * CvRollbackService Class.
 * @author  Ninja
 */
public class CvRollbackService extends TuxedoService implements TuxedoExecutable {
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
        getInput().set_OPERATOR_ID(operatorId);
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
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CvRollbackInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CvRollbackInput();
        }
        return (CvRollbackInput) this.input;
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

    /**
     * Returns an output value object for the provided <tt>Result</tt>.
     *
     * @return Output value object for this service.
     */
    @Override
    protected CvRollbackOutput toOutput(final Result result) throws FMLManipulationException {
        return new CvRollbackOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CvRollbackOutput setOutput(final CvRollbackOutput output) {
        this.output = output;
        return (CvRollbackOutput) this.output;
    }
}
