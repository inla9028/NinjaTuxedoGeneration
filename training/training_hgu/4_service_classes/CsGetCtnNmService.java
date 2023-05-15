package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGetCtnNmInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGetCtnNmOutput;

import bea.jolt.pool.Result;

/**
 * CsGetCtnNmService Class.
 * @author  Ninja
 */
public class CsGetCtnNmService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csGetCtnNm00";

    /**
     * Creates a new instance of CsGetCtnNmService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsGetCtnNmService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsGetCtnNmService() {
    }

    /**
     * Calls Tuxedo service 'CsGetCtnNm'
     *
     * @return Output value object: CsGetCtnNmOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsGetCtnNmOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsGetCtnNmInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsGetCtnNmInput();
        }
        return (CsGetCtnNmInput) this.input;
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
    protected CsGetCtnNmOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsGetCtnNmOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsGetCtnNmOutput setOutput(final CsGetCtnNmOutput output) {
        this.output = output;
        return (CsGetCtnNmOutput) this.output;
    }
}
