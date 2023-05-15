package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsFandFInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsFandFOutput;

import bea.jolt.pool.Result;

/**
 * CsLsFandFService Class.
 * @author  Ninja
 */
public class CsLsFandFService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csLsFandF00";

    /**
     * Creates a new instance of CsLsFandFService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsLsFandFService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsLsFandFService() {
    }

    /**
     * Calls Tuxedo service 'CsLsFandF'
     *
     * @return Output value object: CsLsFandFOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsLsFandFOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsLsFandFInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsLsFandFInput();
        }
        return (CsLsFandFInput) this.input;
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
    protected CsLsFandFOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsLsFandFOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsLsFandFOutput setOutput(final CsLsFandFOutput output) {
        this.output = output;
        return (CsLsFandFOutput) this.output;
    }
}
