package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsOrdInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsOrdOutput;

import bea.jolt.pool.Result;

/**
 * CsLsOrdService Class.
 * @author  Ninja
 */
public class CsLsOrdService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csLsOrd00";

    /**
     * Creates a new instance of CsLsOrdService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsLsOrdService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsLsOrdService() {
    }

    /**
     * Calls Tuxedo service 'CsLsOrd'
     *
     * @return Output value object: CsLsOrdOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsLsOrdOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsLsOrdInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsLsOrdInput();
        }
        return (CsLsOrdInput) this.input;
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
    protected CsLsOrdOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsLsOrdOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsLsOrdOutput setOutput(final CsLsOrdOutput output) {
        this.output = output;
        return (CsLsOrdOutput) this.output;
    }
}
