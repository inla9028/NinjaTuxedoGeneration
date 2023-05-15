package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSuspCtnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSuspCtnOutput;

import bea.jolt.pool.Result;

/**
 * CsSuspCtnService Class.
 * @author  Ninja
 */
public class CsSuspCtnService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csSuspCtn00";

    /**
     * Creates a new instance of CsSuspCtnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsSuspCtnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsSuspCtnService() {
    }

    /**
     * Calls Tuxedo service 'CsSuspCtn'
     *
     * @return Output value object: CsSuspCtnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsSuspCtnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsSuspCtnInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsSuspCtnInput();
        }
        return (CsSuspCtnInput) this.input;
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
    protected CsSuspCtnOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsSuspCtnOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsSuspCtnOutput setOutput(final CsSuspCtnOutput output) {
        this.output = output;
        return (CsSuspCtnOutput) this.output;
    }
}
