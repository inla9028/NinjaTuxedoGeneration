package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArCrCrgInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArCrCrgOutput;

import bea.jolt.pool.Result;

/**
 * ArCrCrgService Class.
 * @author  Ninja
 */
public class ArCrCrgService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arCrCrg00";

    /**
     * Creates a new instance of ArCrCrgService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArCrCrgService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public ArCrCrgService() {
    }

    /**
     * Calls Tuxedo service 'ArCrCrg'
     *
     * @return Output value object: ArCrCrgOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArCrCrgOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArCrCrgInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new ArCrCrgInput();
        }
        return (ArCrCrgInput) this.input;
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
    protected ArCrCrgOutput toOutput(final Result result) throws FMLManipulationException {
        return new ArCrCrgOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private ArCrCrgOutput setOutput(final ArCrCrgOutput output) {
        this.output = output;
        return (ArCrCrgOutput) this.output;
    }
}
