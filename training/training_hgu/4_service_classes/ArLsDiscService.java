package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArLsDiscInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArLsDiscOutput;

import bea.jolt.pool.Result;

/**
 * ArLsDiscService Class.
 * @author  Ninja
 */
public class ArLsDiscService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arLsDisc00";

    /**
     * Creates a new instance of ArLsDiscService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArLsDiscService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public ArLsDiscService() {
    }

    /**
     * Calls Tuxedo service 'ArLsDisc'
     *
     * @return Output value object: ArLsDiscOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArLsDiscOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArLsDiscInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new ArLsDiscInput();
        }
        return (ArLsDiscInput) this.input;
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
    protected ArLsDiscOutput toOutput(final Result result) throws FMLManipulationException {
        return new ArLsDiscOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private ArLsDiscOutput setOutput(final ArLsDiscOutput output) {
        this.output = output;
        return (ArLsDiscOutput) this.output;
    }
}
