package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsCrCtnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsCrCtnOutput;

import bea.jolt.pool.Result;

/**
 * CsCrCtnService Class.
 * @author  Ninja
 */
public class CsCrCtnService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csCrCtn00";

    /**
     * Creates a new instance of CsCrCtnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsCrCtnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsCrCtnService() {
    }

    /**
     * Calls Tuxedo service 'CsCrCtn'
     *
     * @return Output value object: CsCrCtnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsCrCtnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsCrCtnInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsCrCtnInput();
        }
        return (CsCrCtnInput) this.input;
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
    protected CsCrCtnOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsCrCtnOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsCrCtnOutput setOutput(final CsCrCtnOutput output) {
        this.output = output;
        return (CsCrCtnOutput) this.output;
    }
}
