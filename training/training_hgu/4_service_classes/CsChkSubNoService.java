package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsChkSubNoInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsChkSubNoOutput;

import bea.jolt.pool.Result;

/**
 * CsChkSubNoService Class.
 * @author  Ninja
 */
public class CsChkSubNoService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csChkSubNo00";

    /**
     * Creates a new instance of CsChkSubNoService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsChkSubNoService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsChkSubNoService() {
    }

    /**
     * Calls Tuxedo service 'CsChkSubNo'
     *
     * @return Output value object: CsChkSubNoOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsChkSubNoOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsChkSubNoInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsChkSubNoInput();
        }
        return (CsChkSubNoInput) this.input;
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
    protected CsChkSubNoOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsChkSubNoOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsChkSubNoOutput setOutput(final CsChkSubNoOutput output) {
        this.output = output;
        return (CsChkSubNoOutput) this.output;
    }
}
