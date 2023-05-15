package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsMoveMlCtnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsMoveMlCtnOutput;

import bea.jolt.pool.Result;

/**
 * CsMoveMlCtnService Class.
 * @author  Ninja
 */
public class CsMoveMlCtnService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csMoveMlCtn00";

    /**
     * Creates a new instance of CsMoveMlCtnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsMoveMlCtnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsMoveMlCtnService() {
    }

    /**
     * Calls Tuxedo service 'CsMoveMlCtn'
     *
     * @return Output value object: CsMoveMlCtnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsMoveMlCtnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsMoveMlCtnInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsMoveMlCtnInput();
        }
        return (CsMoveMlCtnInput) this.input;
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
    protected CsMoveMlCtnOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsMoveMlCtnOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsMoveMlCtnOutput setOutput(final CsMoveMlCtnOutput output) {
        this.output = output;
        return (CsMoveMlCtnOutput) this.output;
    }
}
