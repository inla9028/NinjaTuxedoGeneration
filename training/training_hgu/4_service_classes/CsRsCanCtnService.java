package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsRsCanCtnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsRsCanCtnOutput;

import bea.jolt.pool.Result;

/**
 * CsRsCanCtnService Class.
 * @author  Ninja
 */
public class CsRsCanCtnService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csRsCanCtn00";

    /**
     * Creates a new instance of CsRsCanCtnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsRsCanCtnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsRsCanCtnService() {
    }

    /**
     * Calls Tuxedo service 'CsRsCanCtn'
     *
     * @return Output value object: CsRsCanCtnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsRsCanCtnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsRsCanCtnInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsRsCanCtnInput();
        }
        return (CsRsCanCtnInput) this.input;
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
    protected CsRsCanCtnOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsRsCanCtnOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsRsCanCtnOutput setOutput(final CsRsCanCtnOutput output) {
        this.output = output;
        return (CsRsCanCtnOutput) this.output;
    }
}
