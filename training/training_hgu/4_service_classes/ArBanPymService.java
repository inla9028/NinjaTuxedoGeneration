package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArBanPymInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArBanPymOutput;

import bea.jolt.pool.Result;

/**
 * ArBanPymService Class.
 * @author  Ninja
 */
public class ArBanPymService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arBanPym00";

    /**
     * Creates a new instance of ArBanPymService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArBanPymService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public ArBanPymService() {
    }

    /**
     * Calls Tuxedo service 'ArBanPym'
     *
     * @return Output value object: ArBanPymOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArBanPymOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArBanPymInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new ArBanPymInput();
        }
        return (ArBanPymInput) this.input;
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
    protected ArBanPymOutput toOutput(final Result result) throws FMLManipulationException {
        return new ArBanPymOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private ArBanPymOutput setOutput(final ArBanPymOutput output) {
        this.output = output;
        return (ArBanPymOutput) this.output;
    }
}
