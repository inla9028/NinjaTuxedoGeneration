package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsChkSubStsInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsChkSubStsOutput;

import bea.jolt.pool.Result;

/**
 * CsChkSubStsService Class.
 * @author  Ninja
 */
public class CsChkSubStsService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csChkSubSts00";

    /**
     * Creates a new instance of CsChkSubStsService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsChkSubStsService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsChkSubStsService() {
    }

    /**
     * Calls Tuxedo service 'CsChkSubSts'
     *
     * @return Output value object: CsChkSubStsOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsChkSubStsOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsChkSubStsInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsChkSubStsInput();
        }
        return (CsChkSubStsInput) this.input;
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
    protected CsChkSubStsOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsChkSubStsOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsChkSubStsOutput setOutput(final CsChkSubStsOutput output) {
        this.output = output;
        return (CsChkSubStsOutput) this.output;
    }
}
