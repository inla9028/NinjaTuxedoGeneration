package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArUpCstBanInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArUpCstBanOutput;

import bea.jolt.pool.Result;

/**
 * ArUpCstBanService Class.
 * @author  Ninja
 */
public class ArUpCstBanService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arUpCstBan00";

    /**
     * Creates a new instance of ArUpCstBanService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArUpCstBanService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public ArUpCstBanService() {
    }

    /**
     * Calls Tuxedo service 'ArUpCstBan'
     *
     * @return Output value object: ArUpCstBanOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArUpCstBanOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArUpCstBanInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new ArUpCstBanInput();
        }
        return (ArUpCstBanInput) this.input;
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
    protected ArUpCstBanOutput toOutput(final Result result) throws FMLManipulationException {
        return new ArUpCstBanOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private ArUpCstBanOutput setOutput(final ArUpCstBanOutput output) {
        this.output = output;
        return (ArUpCstBanOutput) this.output;
    }
}
