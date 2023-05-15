package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvSvCtnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvSvCtnOutput;

import bea.jolt.pool.Result;

/**
 * CvSvCtnService Class.
 * @author  Ninja
 */
public class CvSvCtnService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "cvSvCtn00";

    /**
     * Creates a new instance of CvSvCtnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CvSvCtnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CvSvCtnService() {
    }

    /**
     * Calls Tuxedo service 'CvSvCtn'
     *
     * @return Output value object: CvSvCtnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CvSvCtnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CvSvCtnInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CvSvCtnInput();
        }
        return (CvSvCtnInput) this.input;
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
    protected CvSvCtnOutput toOutput(final Result result) throws FMLManipulationException {
        return new CvSvCtnOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CvSvCtnOutput setOutput(final CvSvCtnOutput output) {
        this.output = output;
        return (CvSvCtnOutput) this.output;
    }
}
