package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvSvEsnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvSvEsnOutput;

import bea.jolt.pool.Result;

/**
 * CvSvEsnService Class.
 * @author  Ninja
 */
public class CvSvEsnService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "cvSvEsn00";

    /**
     * Creates a new instance of CvSvEsnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CvSvEsnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CvSvEsnService() {
    }

    /**
     * Calls Tuxedo service 'CvSvEsn'
     *
     * @return Output value object: CvSvEsnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CvSvEsnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CvSvEsnInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CvSvEsnInput();
        }
        return (CvSvEsnInput) this.input;
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
    protected CvSvEsnOutput toOutput(final Result result) throws FMLManipulationException {
        return new CvSvEsnOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CvSvEsnOutput setOutput(final CvSvEsnOutput output) {
        this.output = output;
        return (CvSvEsnOutput) this.output;
    }
}
