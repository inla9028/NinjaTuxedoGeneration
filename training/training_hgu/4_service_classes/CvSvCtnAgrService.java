package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvSvCtnAgrInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvSvCtnAgrOutput;

import bea.jolt.pool.Result;

/**
 * CvSvCtnAgrService Class.
 * @author  Ninja
 */
public class CvSvCtnAgrService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "cvSvCtnAgr00";

    /**
     * Creates a new instance of CvSvCtnAgrService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CvSvCtnAgrService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CvSvCtnAgrService() {
    }

    /**
     * Calls Tuxedo service 'CvSvCtnAgr'
     *
     * @return Output value object: CvSvCtnAgrOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CvSvCtnAgrOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CvSvCtnAgrInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CvSvCtnAgrInput();
        }
        return (CvSvCtnAgrInput) this.input;
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
    protected CvSvCtnAgrOutput toOutput(final Result result) throws FMLManipulationException {
        return new CvSvCtnAgrOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CvSvCtnAgrOutput setOutput(final CvSvCtnAgrOutput output) {
        this.output = output;
        return (CvSvCtnAgrOutput) this.output;
    }
}
