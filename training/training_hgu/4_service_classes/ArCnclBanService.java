package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArCnclBanInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArCnclBanOutput;

import bea.jolt.pool.Result;

/**
 * ArCnclBanService Class.
 * @author  Ninja
 */
public class ArCnclBanService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arCnclBan00";

    /**
     * Creates a new instance of ArCnclBanService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArCnclBanService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public ArCnclBanService() {
    }

    /**
     * Calls Tuxedo service 'ArCnclBan'
     *
     * @return Output value object: ArCnclBanOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArCnclBanOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArCnclBanInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new ArCnclBanInput();
        }
        return (ArCnclBanInput) this.input;
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
    protected ArCnclBanOutput toOutput(final Result result) throws FMLManipulationException {
        return new ArCnclBanOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private ArCnclBanOutput setOutput(final ArCnclBanOutput output) {
        this.output = output;
        return (ArCnclBanOutput) this.output;
    }
}
