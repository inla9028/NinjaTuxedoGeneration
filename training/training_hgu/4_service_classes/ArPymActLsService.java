package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArPymActLsInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArPymActLsOutput;

import bea.jolt.pool.Result;

/**
 * ArPymActLsService Class.
 * @author  Ninja
 */
public class ArPymActLsService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arPymActLs00";

    /**
     * Creates a new instance of ArPymActLsService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArPymActLsService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public ArPymActLsService() {
    }

    /**
     * Calls Tuxedo service 'ArPymActLs'
     *
     * @return Output value object: ArPymActLsOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArPymActLsOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArPymActLsInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new ArPymActLsInput();
        }
        return (ArPymActLsInput) this.input;
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
    protected ArPymActLsOutput toOutput(final Result result) throws FMLManipulationException {
        return new ArPymActLsOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private ArPymActLsOutput setOutput(final ArPymActLsOutput output) {
        this.output = output;
        return (ArPymActLsOutput) this.output;
    }
}
