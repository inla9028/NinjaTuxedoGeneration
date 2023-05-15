package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArLsOrdPymInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArLsOrdPymOutput;

import bea.jolt.pool.Result;

/**
 * ArLsOrdPymService Class.
 * @author  Ninja
 */
public class ArLsOrdPymService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arLsOrdPym00";

    /**
     * Creates a new instance of ArLsOrdPymService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArLsOrdPymService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public ArLsOrdPymService() {
    }

    /**
     * Calls Tuxedo service 'ArLsOrdPym'
     *
     * @return Output value object: ArLsOrdPymOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArLsOrdPymOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArLsOrdPymInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new ArLsOrdPymInput();
        }
        return (ArLsOrdPymInput) this.input;
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
    protected ArLsOrdPymOutput toOutput(final Result result) throws FMLManipulationException {
        return new ArLsOrdPymOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private ArLsOrdPymOutput setOutput(final ArLsOrdPymOutput output) {
        this.output = output;
        return (ArLsOrdPymOutput) this.output;
    }
}
