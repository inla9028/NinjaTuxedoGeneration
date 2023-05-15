package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsValFandFLstInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsValFandFLstOutput;

import bea.jolt.pool.Result;

/**
 * CsValFandFLstService Class.
 * @author  Ninja
 */
public class CsValFandFLstService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csValFandFLst00";

    /**
     * Creates a new instance of CsValFandFLstService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsValFandFLstService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsValFandFLstService() {
    }

    /**
     * Calls Tuxedo service 'CsValFandFLst'
     *
     * @return Output value object: CsValFandFLstOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsValFandFLstOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsValFandFLstInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsValFandFLstInput();
        }
        return (CsValFandFLstInput) this.input;
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
    protected CsValFandFLstOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsValFandFLstOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsValFandFLstOutput setOutput(final CsValFandFLstOutput output) {
        this.output = output;
        return (CsValFandFLstOutput) this.output;
    }
}
