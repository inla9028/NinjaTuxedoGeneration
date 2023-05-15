package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlGtBillDetInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlGtBillDetOutput;

import bea.jolt.pool.Result;

/**
 * BlGtBillDetService Class.
 * @author  Ninja
 */
public class BlGtBillDetService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "blGtBillDet00";

    /**
     * Creates a new instance of BlGtBillDetService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public BlGtBillDetService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public BlGtBillDetService() {
    }

    /**
     * Calls Tuxedo service 'BlGtBillDet'
     *
     * @return Output value object: BlGtBillDetOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public BlGtBillDetOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public BlGtBillDetInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new BlGtBillDetInput();
        }
        return (BlGtBillDetInput) this.input;
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
    protected BlGtBillDetOutput toOutput(final Result result) throws FMLManipulationException {
        return new BlGtBillDetOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private BlGtBillDetOutput setOutput(final BlGtBillDetOutput output) {
        this.output = output;
        return (BlGtBillDetOutput) this.output;
    }
}
