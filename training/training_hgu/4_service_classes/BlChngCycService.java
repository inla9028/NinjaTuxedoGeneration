package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlChngCycInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlChngCycOutput;

import bea.jolt.pool.Result;

/**
 * BlChngCycService Class.
 * @author  Ninja
 */
public class BlChngCycService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "blChngCyc00";

    /**
     * Creates a new instance of BlChngCycService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public BlChngCycService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public BlChngCycService() {
    }

    /**
     * Calls Tuxedo service 'BlChngCyc'
     *
     * @return Output value object: BlChngCycOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public BlChngCycOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public BlChngCycInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new BlChngCycInput();
        }
        return (BlChngCycInput) this.input;
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
    protected BlChngCycOutput toOutput(final Result result) throws FMLManipulationException {
        return new BlChngCycOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private BlChngCycOutput setOutput(final BlChngCycOutput output) {
        this.output = output;
        return (BlChngCycOutput) this.output;
    }
}
