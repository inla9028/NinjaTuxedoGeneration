package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtOcAmtInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtOcAmtOutput;

import bea.jolt.pool.Result;

/**
 * CsGtOcAmtService Class.
 * @author  Ninja
 */
public class CsGtOcAmtService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csGtOcAmt00";

    /**
     * Creates a new instance of CsGtOcAmtService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsGtOcAmtService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsGtOcAmtService() {
    }

    /**
     * Calls Tuxedo service 'CsGtOcAmt'
     *
     * @return Output value object: CsGtOcAmtOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsGtOcAmtOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsGtOcAmtInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsGtOcAmtInput();
        }
        return (CsGtOcAmtInput) this.input;
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
    protected CsGtOcAmtOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsGtOcAmtOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsGtOcAmtOutput setOutput(final CsGtOcAmtOutput output) {
        this.output = output;
        return (CsGtOcAmtOutput) this.output;
    }
}
