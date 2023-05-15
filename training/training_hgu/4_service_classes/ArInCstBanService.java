package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArInCstBanInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArInCstBanOutput;

import bea.jolt.pool.Result;

/**
 * ArInCstBanService Class.
 * @author  Ninja
 */
public class ArInCstBanService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arInCstBan00";

    /**
     * Creates a new instance of ArInCstBanService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArInCstBanService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public ArInCstBanService() {
    }

    /**
     * Calls Tuxedo service 'ArInCstBan'
     *
     * @return Output value object: ArInCstBanOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArInCstBanOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArInCstBanInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new ArInCstBanInput();
        }
        return (ArInCstBanInput) this.input;
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
    protected ArInCstBanOutput toOutput(final Result result) throws FMLManipulationException {
        return new ArInCstBanOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private ArInCstBanOutput setOutput(final ArInCstBanOutput output) {
        this.output = output;
        return (ArInCstBanOutput) this.output;
    }
}
