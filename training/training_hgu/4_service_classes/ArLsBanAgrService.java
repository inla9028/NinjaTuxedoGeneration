package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArLsBanAgrInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArLsBanAgrOutput;

import bea.jolt.pool.Result;

/**
 * ArLsBanAgrService Class.
 * @author  Ninja
 */
public class ArLsBanAgrService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arLsBanAgr00";

    /**
     * Creates a new instance of ArLsBanAgrService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArLsBanAgrService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public ArLsBanAgrService() {
    }

    /**
     * Calls Tuxedo service 'ArLsBanAgr'
     *
     * @return Output value object: ArLsBanAgrOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArLsBanAgrOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArLsBanAgrInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new ArLsBanAgrInput();
        }
        return (ArLsBanAgrInput) this.input;
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
    protected ArLsBanAgrOutput toOutput(final Result result) throws FMLManipulationException {
        return new ArLsBanAgrOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private ArLsBanAgrOutput setOutput(final ArLsBanAgrOutput output) {
        this.output = output;
        return (ArLsBanAgrOutput) this.output;
    }
}
