package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArHndlSocCrgInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArHndlSocCrgOutput;

import bea.jolt.pool.Result;

/**
 * ArHndlSocCrgService Class.
 * @author  Ninja
 */
public class ArHndlSocCrgService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arHndlSocCrg00";

    /**
     * Creates a new instance of ArHndlSocCrgService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArHndlSocCrgService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public ArHndlSocCrgService() {
    }

    /**
     * Calls Tuxedo service 'ArHndlSocCrg'
     *
     * @return Output value object: ArHndlSocCrgOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArHndlSocCrgOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArHndlSocCrgInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new ArHndlSocCrgInput();
        }
        return (ArHndlSocCrgInput) this.input;
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
    protected ArHndlSocCrgOutput toOutput(final Result result) throws FMLManipulationException {
        return new ArHndlSocCrgOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private ArHndlSocCrgOutput setOutput(final ArHndlSocCrgOutput output) {
        this.output = output;
        return (ArHndlSocCrgOutput) this.output;
    }
}
