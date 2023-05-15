package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArMultCrdInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArMultCrdOutput;

import bea.jolt.pool.Result;

/**
 * ArMultCrdService Class.
 * @author  Ninja
 */
public class ArMultCrdService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arMultCrd00";

    /**
     * Creates a new instance of ArMultCrdService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArMultCrdService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public ArMultCrdService() {
    }

    /**
     * Calls Tuxedo service 'ArMultCrd'
     *
     * @return Output value object: ArMultCrdOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArMultCrdOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArMultCrdInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new ArMultCrdInput();
        }
        return (ArMultCrdInput) this.input;
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
    protected ArMultCrdOutput toOutput(final Result result) throws FMLManipulationException {
        return new ArMultCrdOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private ArMultCrdOutput setOutput(final ArMultCrdOutput output) {
        this.output = output;
        return (ArMultCrdOutput) this.output;
    }
}
