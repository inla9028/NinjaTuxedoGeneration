package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsNpTrxInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsNpTrxOutput;

import bea.jolt.pool.Result;

/**
 * CsLsNpTrxService Class.
 * @author  Ninja
 */
public class CsLsNpTrxService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csLsNpTrx00";

    /**
     * Creates a new instance of CsLsNpTrxService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsLsNpTrxService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsLsNpTrxService() {
    }

    /**
     * Calls Tuxedo service 'CsLsNpTrx'
     *
     * @return Output value object: CsLsNpTrxOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsLsNpTrxOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsLsNpTrxInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsLsNpTrxInput();
        }
        return (CsLsNpTrxInput) this.input;
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
    protected CsLsNpTrxOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsLsNpTrxOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsLsNpTrxOutput setOutput(final CsLsNpTrxOutput output) {
        this.output = output;
        return (CsLsNpTrxOutput) this.output;
    }
}
