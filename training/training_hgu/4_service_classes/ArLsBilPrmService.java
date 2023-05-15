package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArLsBilPrmInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArLsBilPrmOutput;

import bea.jolt.pool.Result;

/**
 * ArLsBilPrmService Class.
 * @author  Ninja
 */
public class ArLsBilPrmService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arLsBilPrm00";

    /**
     * Creates a new instance of ArLsBilPrmService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArLsBilPrmService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public ArLsBilPrmService() {
    }

    /**
     * Calls Tuxedo service 'ArLsBilPrm'
     *
     * @return Output value object: ArLsBilPrmOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArLsBilPrmOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArLsBilPrmInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new ArLsBilPrmInput();
        }
        return (ArLsBilPrmInput) this.input;
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
    protected ArLsBilPrmOutput toOutput(final Result result) throws FMLManipulationException {
        return new ArLsBilPrmOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private ArLsBilPrmOutput setOutput(final ArLsBilPrmOutput output) {
        this.output = output;
        return (ArLsBilPrmOutput) this.output;
    }
}
