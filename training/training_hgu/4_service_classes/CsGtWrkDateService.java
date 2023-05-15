package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtWrkDateInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtWrkDateOutput;

import bea.jolt.pool.Result;

/**
 * CsGtWrkDateService Class.
 * @author  Ninja
 */
public class CsGtWrkDateService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csGtWrkDate00";

    /**
     * Creates a new instance of CsGtWrkDateService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsGtWrkDateService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsGtWrkDateService() {
    }

    /**
     * Calls Tuxedo service 'CsGtWrkDate'
     *
     * @return Output value object: CsGtWrkDateOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsGtWrkDateOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsGtWrkDateInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsGtWrkDateInput();
        }
        return (CsGtWrkDateInput) this.input;
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
    protected CsGtWrkDateOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsGtWrkDateOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsGtWrkDateOutput setOutput(final CsGtWrkDateOutput output) {
        this.output = output;
        return (CsGtWrkDateOutput) this.output;
    }
}
