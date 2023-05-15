package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlGtCycPrdInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlGtCycPrdOutput;

import bea.jolt.pool.Result;

/**
 * BlGtCycPrdService Class.
 * @author  Ninja
 */
public class BlGtCycPrdService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "blGtCycPrd00";

    /**
     * Creates a new instance of BlGtCycPrdService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public BlGtCycPrdService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public BlGtCycPrdService() {
    }

    /**
     * Calls Tuxedo service 'BlGtCycPrd'
     *
     * @return Output value object: BlGtCycPrdOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public BlGtCycPrdOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public BlGtCycPrdInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new BlGtCycPrdInput();
        }
        return (BlGtCycPrdInput) this.input;
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
    protected BlGtCycPrdOutput toOutput(final Result result) throws FMLManipulationException {
        return new BlGtCycPrdOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private BlGtCycPrdOutput setOutput(final BlGtCycPrdOutput output) {
        this.output = output;
        return (BlGtCycPrdOutput) this.output;
    }
}
