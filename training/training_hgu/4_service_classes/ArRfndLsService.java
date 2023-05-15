package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArRfndLsInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArRfndLsOutput;

import bea.jolt.pool.Result;

/**
 * ArRfndLsService Class.
 * @author  Ninja
 */
public class ArRfndLsService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arRfndLs00";

    /**
     * Creates a new instance of ArRfndLsService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArRfndLsService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public ArRfndLsService() {
    }

    /**
     * Calls Tuxedo service 'ArRfndLs'
     *
     * @return Output value object: ArRfndLsOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArRfndLsOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArRfndLsInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new ArRfndLsInput();
        }
        return (ArRfndLsInput) this.input;
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
    protected ArRfndLsOutput toOutput(final Result result) throws FMLManipulationException {
        return new ArRfndLsOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private ArRfndLsOutput setOutput(final ArRfndLsOutput output) {
        this.output = output;
        return (ArRfndLsOutput) this.output;
    }
}
