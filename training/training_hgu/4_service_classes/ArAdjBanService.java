package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArAdjBanInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArAdjBanOutput;

import bea.jolt.pool.Result;

/**
 * ArAdjBanService Class.
 * @author  Ninja
 */
public class ArAdjBanService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arAdjBan00";

    /**
     * Creates a new instance of ArAdjBanService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArAdjBanService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public ArAdjBanService() {
    }

    /**
     * Calls Tuxedo service 'ArAdjBan'
     *
     * @return Output value object: ArAdjBanOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArAdjBanOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArAdjBanInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new ArAdjBanInput();
        }
        return (ArAdjBanInput) this.input;
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
    protected ArAdjBanOutput toOutput(final Result result) throws FMLManipulationException {
        return new ArAdjBanOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private ArAdjBanOutput setOutput(final ArAdjBanOutput output) {
        this.output = output;
        return (ArAdjBanOutput) this.output;
    }
}
