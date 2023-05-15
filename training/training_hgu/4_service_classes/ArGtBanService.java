package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArGtBanInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArGtBanOutput;

import bea.jolt.pool.Result;

/**
 * ArGtBanService Class.
 * @author  Ninja
 */
public class ArGtBanService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arGtBan00";

    /**
     * Creates a new instance of ArGtBanService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArGtBanService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public ArGtBanService() {
    }

    /**
     * Calls Tuxedo service 'ArGtBan'
     *
     * @return Output value object: ArGtBanOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArGtBanOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArGtBanInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new ArGtBanInput();
        }
        return (ArGtBanInput) this.input;
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
    protected ArGtBanOutput toOutput(final Result result) throws FMLManipulationException {
        return new ArGtBanOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private ArGtBanOutput setOutput(final ArGtBanOutput output) {
        this.output = output;
        return (ArGtBanOutput) this.output;
    }
}
