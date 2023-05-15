package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsChgCtnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsChgCtnOutput;

import bea.jolt.pool.Result;

/**
 * CsChgCtnService Class.
 * @author  Ninja
 */
public class CsChgCtnService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csChgCtn00";

    /**
     * Creates a new instance of CsChgCtnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsChgCtnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsChgCtnService() {
    }

    /**
     * Calls Tuxedo service 'CsChgCtn'
     *
     * @return Output value object: CsChgCtnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsChgCtnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsChgCtnInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsChgCtnInput();
        }
        return (CsChgCtnInput) this.input;
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
    protected CsChgCtnOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsChgCtnOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsChgCtnOutput setOutput(final CsChgCtnOutput output) {
        this.output = output;
        return (CsChgCtnOutput) this.output;
    }
}
