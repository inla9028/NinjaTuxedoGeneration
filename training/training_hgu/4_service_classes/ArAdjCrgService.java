package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArAdjCrgInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArAdjCrgOutput;

import bea.jolt.pool.Result;

/**
 * ArAdjCrgService Class.
 * @author  Ninja
 */
public class ArAdjCrgService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arAdjCrg00";

    /**
     * Creates a new instance of ArAdjCrgService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArAdjCrgService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public ArAdjCrgService() {
    }

    /**
     * Calls Tuxedo service 'ArAdjCrg'
     *
     * @return Output value object: ArAdjCrgOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArAdjCrgOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArAdjCrgInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new ArAdjCrgInput();
        }
        return (ArAdjCrgInput) this.input;
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
    protected ArAdjCrgOutput toOutput(final Result result) throws FMLManipulationException {
        return new ArAdjCrgOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private ArAdjCrgOutput setOutput(final ArAdjCrgOutput output) {
        this.output = output;
        return (ArAdjCrgOutput) this.output;
    }
}
