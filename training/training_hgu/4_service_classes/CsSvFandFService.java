package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSvFandFInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSvFandFOutput;

import bea.jolt.pool.Result;

/**
 * CsSvFandFService Class.
 * @author  Ninja
 */
public class CsSvFandFService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csSvFandF00";

    /**
     * Creates a new instance of CsSvFandFService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsSvFandFService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsSvFandFService() {
    }

    /**
     * Calls Tuxedo service 'CsSvFandF'
     *
     * @return Output value object: CsSvFandFOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsSvFandFOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsSvFandFInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsSvFandFInput();
        }
        return (CsSvFandFInput) this.input;
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
    protected CsSvFandFOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsSvFandFOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsSvFandFOutput setOutput(final CsSvFandFOutput output) {
        this.output = output;
        return (CsSvFandFOutput) this.output;
    }
}
