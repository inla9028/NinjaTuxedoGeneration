package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArLsBanFtrInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArLsBanFtrOutput;

import bea.jolt.pool.Result;

/**
 * ArLsBanFtrService Class.
 * @author  Ninja
 */
public class ArLsBanFtrService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arLsBanFtr00";

    /**
     * Creates a new instance of ArLsBanFtrService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArLsBanFtrService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public ArLsBanFtrService() {
    }

    /**
     * Calls Tuxedo service 'ArLsBanFtr'
     *
     * @return Output value object: ArLsBanFtrOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArLsBanFtrOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArLsBanFtrInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new ArLsBanFtrInput();
        }
        return (ArLsBanFtrInput) this.input;
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
    protected ArLsBanFtrOutput toOutput(final Result result) throws FMLManipulationException {
        return new ArLsBanFtrOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private ArLsBanFtrOutput setOutput(final ArLsBanFtrOutput output) {
        this.output = output;
        return (ArLsBanFtrOutput) this.output;
    }
}
