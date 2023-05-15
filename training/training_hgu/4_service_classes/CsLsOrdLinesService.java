package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsOrdLinesInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsOrdLinesOutput;

import bea.jolt.pool.Result;

/**
 * CsLsOrdLinesService Class.
 * @author  Ninja
 */
public class CsLsOrdLinesService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csLsOrdLines00";

    /**
     * Creates a new instance of CsLsOrdLinesService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsLsOrdLinesService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsLsOrdLinesService() {
    }

    /**
     * Calls Tuxedo service 'CsLsOrdLines'
     *
     * @return Output value object: CsLsOrdLinesOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsLsOrdLinesOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsLsOrdLinesInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsLsOrdLinesInput();
        }
        return (CsLsOrdLinesInput) this.input;
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
    protected CsLsOrdLinesOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsLsOrdLinesOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsLsOrdLinesOutput setOutput(final CsLsOrdLinesOutput output) {
        this.output = output;
        return (CsLsOrdLinesOutput) this.output;
    }
}
