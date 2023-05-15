package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsOrdDtlsInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsOrdDtlsOutput;

import bea.jolt.pool.Result;

/**
 * CsLsOrdDtlsService Class.
 * @author  Ninja
 */
public class CsLsOrdDtlsService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csLsOrdDtls00";

    /**
     * Creates a new instance of CsLsOrdDtlsService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsLsOrdDtlsService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsLsOrdDtlsService() {
    }

    /**
     * Calls Tuxedo service 'CsLsOrdDtls'
     *
     * @return Output value object: CsLsOrdDtlsOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsLsOrdDtlsOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsLsOrdDtlsInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsLsOrdDtlsInput();
        }
        return (CsLsOrdDtlsInput) this.input;
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
    protected CsLsOrdDtlsOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsLsOrdDtlsOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsLsOrdDtlsOutput setOutput(final CsLsOrdDtlsOutput output) {
        this.output = output;
        return (CsLsOrdDtlsOutput) this.output;
    }
}
