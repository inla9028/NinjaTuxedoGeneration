package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsCnclCtnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsCnclCtnOutput;

import bea.jolt.pool.Result;

/**
 * CsCnclCtnService Class.
 * @author  Ninja
 */
public class CsCnclCtnService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csCnclCtn00";

    /**
     * Creates a new instance of CsCnclCtnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsCnclCtnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsCnclCtnService() {
    }

    /**
     * Calls Tuxedo service 'CsCnclCtn'
     *
     * @return Output value object: CsCnclCtnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsCnclCtnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsCnclCtnInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsCnclCtnInput();
        }
        return (CsCnclCtnInput) this.input;
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
    protected CsCnclCtnOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsCnclCtnOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsCnclCtnOutput setOutput(final CsCnclCtnOutput output) {
        this.output = output;
        return (CsCnclCtnOutput) this.output;
    }
}
