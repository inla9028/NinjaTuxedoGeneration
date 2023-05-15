package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvStartInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvStartOutput;

import bea.jolt.pool.Result;

/**
 * CvStartService Class.
 * @author  Ninja
 */
public class CvStartService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "cvStart00";

    /**
     * Creates a new instance of CvStartService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CvStartService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CvStartService() {
    }

    /**
     * Calls Tuxedo service 'CvStart'
     *
     * @return Output value object: CvStartOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CvStartOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CvStartInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CvStartInput();
        }
        return (CvStartInput) this.input;
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
    protected CvStartOutput toOutput(final Result result) throws FMLManipulationException {
        return new CvStartOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CvStartOutput setOutput(final CvStartOutput output) {
        this.output = output;
        return (CvStartOutput) this.output;
    }
}
