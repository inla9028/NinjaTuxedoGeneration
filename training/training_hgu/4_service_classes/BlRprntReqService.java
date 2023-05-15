package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlRprntReqInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlRprntReqOutput;

import bea.jolt.pool.Result;

/**
 * BlRprntReqService Class.
 * @author  Ninja
 */
public class BlRprntReqService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "blRprntReq00";

    /**
     * Creates a new instance of BlRprntReqService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public BlRprntReqService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public BlRprntReqService() {
    }

    /**
     * Calls Tuxedo service 'BlRprntReq'
     *
     * @return Output value object: BlRprntReqOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public BlRprntReqOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public BlRprntReqInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new BlRprntReqInput();
        }
        return (BlRprntReqInput) this.input;
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
    protected BlRprntReqOutput toOutput(final Result result) throws FMLManipulationException {
        return new BlRprntReqOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private BlRprntReqOutput setOutput(final BlRprntReqOutput output) {
        this.output = output;
        return (BlRprntReqOutput) this.output;
    }
}
