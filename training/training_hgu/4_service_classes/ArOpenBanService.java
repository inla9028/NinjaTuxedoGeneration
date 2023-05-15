package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArOpenBanInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArOpenBanOutput;

import bea.jolt.pool.Result;

/**
 * ArOpenBanService Class.
 * @author  Ninja
 */
public class ArOpenBanService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arOpenBan00";

    /**
     * Creates a new instance of ArOpenBanService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArOpenBanService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public ArOpenBanService() {
    }

    /**
     * Calls Tuxedo service 'ArOpenBan'
     *
     * @return Output value object: ArOpenBanOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArOpenBanOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArOpenBanInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new ArOpenBanInput();
        }
        return (ArOpenBanInput) this.input;
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
    protected ArOpenBanOutput toOutput(final Result result) throws FMLManipulationException {
        return new ArOpenBanOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private ArOpenBanOutput setOutput(final ArOpenBanOutput output) {
        this.output = output;
        return (ArOpenBanOutput) this.output;
    }
}
