package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtCtnInvInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtCtnInvOutput;

import bea.jolt.pool.Result;

/**
 * CsGtCtnInvService Class.
 * @author  Ninja
 */
public class CsGtCtnInvService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csGtCtnInv00";

    /**
     * Creates a new instance of CsGtCtnInvService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsGtCtnInvService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsGtCtnInvService() {
    }

    /**
     * Calls Tuxedo service 'CsGtCtnInv'
     *
     * @return Output value object: CsGtCtnInvOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsGtCtnInvOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsGtCtnInvInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsGtCtnInvInput();
        }
        return (CsGtCtnInvInput) this.input;
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
    protected CsGtCtnInvOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsGtCtnInvOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsGtCtnInvOutput setOutput(final CsGtCtnInvOutput output) {
        this.output = output;
        return (CsGtCtnInvOutput) this.output;
    }
}
