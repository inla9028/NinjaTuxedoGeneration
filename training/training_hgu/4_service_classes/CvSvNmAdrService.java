package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvSvNmAdrInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvSvNmAdrOutput;

import bea.jolt.pool.Result;

/**
 * CvSvNmAdrService Class.
 * @author  Ninja
 */
public class CvSvNmAdrService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "cvSvNmAdr00";

    /**
     * Creates a new instance of CvSvNmAdrService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CvSvNmAdrService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CvSvNmAdrService() {
    }

    /**
     * Calls Tuxedo service 'CvSvNmAdr'
     *
     * @return Output value object: CvSvNmAdrOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CvSvNmAdrOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CvSvNmAdrInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CvSvNmAdrInput();
        }
        return (CvSvNmAdrInput) this.input;
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
    protected CvSvNmAdrOutput toOutput(final Result result) throws FMLManipulationException {
        return new CvSvNmAdrOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CvSvNmAdrOutput setOutput(final CvSvNmAdrOutput output) {
        this.output = output;
        return (CvSvNmAdrOutput) this.output;
    }
}
