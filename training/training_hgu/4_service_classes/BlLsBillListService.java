package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlLsBillListInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlLsBillListOutput;

import bea.jolt.pool.Result;

/**
 * BlLsBillListService Class.
 * @author  Ninja
 */
public class BlLsBillListService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "blLsBillList00";

    /**
     * Creates a new instance of BlLsBillListService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public BlLsBillListService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public BlLsBillListService() {
    }

    /**
     * Calls Tuxedo service 'BlLsBillList'
     *
     * @return Output value object: BlLsBillListOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public BlLsBillListOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public BlLsBillListInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new BlLsBillListInput();
        }
        return (BlLsBillListInput) this.input;
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
    protected BlLsBillListOutput toOutput(final Result result) throws FMLManipulationException {
        return new BlLsBillListOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private BlLsBillListOutput setOutput(final BlLsBillListOutput output) {
        this.output = output;
        return (BlLsBillListOutput) this.output;
    }
}
