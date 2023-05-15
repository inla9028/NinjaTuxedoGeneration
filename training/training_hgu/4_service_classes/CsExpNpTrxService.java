package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsExpNpTrxInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsExpNpTrxOutput;

import bea.jolt.pool.Result;

/**
 * CsExpNpTrxService Class.
 * @author  Ninja
 */
public class CsExpNpTrxService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csExpNpTrx00";

    /**
     * Creates a new instance of CsExpNpTrxService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsExpNpTrxService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsExpNpTrxService() {
    }

    /**
     * Calls Tuxedo service 'CsExpNpTrx'
     *
     * @return Output value object: CsExpNpTrxOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsExpNpTrxOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsExpNpTrxInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsExpNpTrxInput();
        }
        return (CsExpNpTrxInput) this.input;
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
    protected CsExpNpTrxOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsExpNpTrxOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsExpNpTrxOutput setOutput(final CsExpNpTrxOutput output) {
        this.output = output;
        return (CsExpNpTrxOutput) this.output;
    }
}
