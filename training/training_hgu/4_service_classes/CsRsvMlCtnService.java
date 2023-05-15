package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsRsvMlCtnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsRsvMlCtnOutput;

import bea.jolt.pool.Result;

/**
 * CsRsvMlCtnService Class.
 * @author  Ninja
 */
public class CsRsvMlCtnService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csRsvMlCtn00";

    /**
     * Creates a new instance of CsRsvMlCtnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsRsvMlCtnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsRsvMlCtnService() {
    }

    /**
     * Calls Tuxedo service 'CsRsvMlCtn'
     *
     * @return Output value object: CsRsvMlCtnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsRsvMlCtnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsRsvMlCtnInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsRsvMlCtnInput();
        }
        return (CsRsvMlCtnInput) this.input;
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
    protected CsRsvMlCtnOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsRsvMlCtnOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsRsvMlCtnOutput setOutput(final CsRsvMlCtnOutput output) {
        this.output = output;
        return (CsRsvMlCtnOutput) this.output;
    }
}
