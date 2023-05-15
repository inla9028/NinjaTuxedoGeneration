package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsActvCtnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsActvCtnOutput;

import bea.jolt.pool.Result;

/**
 * CsActvCtnService Class.
 * @author  Ninja
 */
public class CsActvCtnService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csActvCtn00";

    /**
     * Creates a new instance of CsActvCtnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsActvCtnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsActvCtnService() {
    }

    /**
     * Calls Tuxedo service 'CsActvCtn'
     *
     * @return Output value object: CsActvCtnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsActvCtnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsActvCtnInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsActvCtnInput();
        }
        return (CsActvCtnInput) this.input;
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
    protected CsActvCtnOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsActvCtnOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsActvCtnOutput setOutput(final CsActvCtnOutput output) {
        this.output = output;
        return (CsActvCtnOutput) this.output;
    }
}
