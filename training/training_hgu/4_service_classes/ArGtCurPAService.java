package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArGtCurPAInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArGtCurPAOutput;

import bea.jolt.pool.Result;

/**
 * ArGtCurPAService Class.
 * @author  Ninja
 */
public class ArGtCurPAService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arGtCurPA00";

    /**
     * Creates a new instance of ArGtCurPAService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArGtCurPAService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public ArGtCurPAService() {
    }

    /**
     * Calls Tuxedo service 'ArGtCurPA'
     *
     * @return Output value object: ArGtCurPAOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArGtCurPAOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArGtCurPAInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new ArGtCurPAInput();
        }
        return (ArGtCurPAInput) this.input;
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
    protected ArGtCurPAOutput toOutput(final Result result) throws FMLManipulationException {
        return new ArGtCurPAOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private ArGtCurPAOutput setOutput(final ArGtCurPAOutput output) {
        this.output = output;
        return (ArGtCurPAOutput) this.output;
    }
}
