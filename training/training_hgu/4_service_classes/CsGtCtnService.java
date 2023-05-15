package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtCtnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtCtnOutput;

import bea.jolt.pool.Result;

/**
 * CsGtCtnService Class.
 * @author  Ninja
 */
public class CsGtCtnService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csGtCtn00";

    /**
     * Creates a new instance of CsGtCtnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsGtCtnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsGtCtnService() {
    }

    /**
     * Calls Tuxedo service 'CsGtCtn'
     *
     * @return Output value object: CsGtCtnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsGtCtnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsGtCtnInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsGtCtnInput();
        }
        return (CsGtCtnInput) this.input;
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
    protected CsGtCtnOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsGtCtnOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsGtCtnOutput setOutput(final CsGtCtnOutput output) {
        this.output = output;
        return (CsGtCtnOutput) this.output;
    }
}
