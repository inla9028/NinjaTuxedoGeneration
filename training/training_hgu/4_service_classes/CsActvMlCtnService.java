package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsActvMlCtnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsActvMlCtnOutput;

import bea.jolt.pool.Result;

/**
 * CsActvMlCtnService Class.
 * @author  Ninja
 */
public class CsActvMlCtnService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csActvMlCtn00";

    /**
     * Creates a new instance of CsActvMlCtnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsActvMlCtnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsActvMlCtnService() {
    }

    /**
     * Calls Tuxedo service 'CsActvMlCtn'
     *
     * @return Output value object: CsActvMlCtnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsActvMlCtnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsActvMlCtnInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsActvMlCtnInput();
        }
        return (CsActvMlCtnInput) this.input;
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
    protected CsActvMlCtnOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsActvMlCtnOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsActvMlCtnOutput setOutput(final CsActvMlCtnOutput output) {
        this.output = output;
        return (CsActvMlCtnOutput) this.output;
    }
}
