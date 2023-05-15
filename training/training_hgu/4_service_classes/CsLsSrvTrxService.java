package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsSrvTrxInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsSrvTrxOutput;

import bea.jolt.pool.Result;

/**
 * CsLsSrvTrxService Class.
 * @author  Ninja
 */
public class CsLsSrvTrxService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csLsSrvTrx00";

    /**
     * Creates a new instance of CsLsSrvTrxService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsLsSrvTrxService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsLsSrvTrxService() {
    }

    /**
     * Calls Tuxedo service 'CsLsSrvTrx'
     *
     * @return Output value object: CsLsSrvTrxOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsLsSrvTrxOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsLsSrvTrxInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsLsSrvTrxInput();
        }
        return (CsLsSrvTrxInput) this.input;
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
    protected CsLsSrvTrxOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsLsSrvTrxOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsLsSrvTrxOutput setOutput(final CsLsSrvTrxOutput output) {
        this.output = output;
        return (CsLsSrvTrxOutput) this.output;
    }
}
