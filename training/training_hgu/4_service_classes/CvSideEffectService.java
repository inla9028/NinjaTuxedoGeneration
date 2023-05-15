package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvSideEffectInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvSideEffectOutput;

import bea.jolt.pool.Result;

/**
 * CvSideEffectService Class.
 * @author  Ninja
 */
public class CvSideEffectService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "cvSideEffect00";

    /**
     * Creates a new instance of CvSideEffectService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CvSideEffectService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CvSideEffectService() {
    }

    /**
     * Calls Tuxedo service 'CvSideEffect'
     *
     * @return Output value object: CvSideEffectOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CvSideEffectOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CvSideEffectInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CvSideEffectInput();
        }
        return (CvSideEffectInput) this.input;
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
    protected CvSideEffectOutput toOutput(final Result result) throws FMLManipulationException {
        return new CvSideEffectOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CvSideEffectOutput setOutput(final CvSideEffectOutput output) {
        this.output = output;
        return (CvSideEffectOutput) this.output;
    }
}
