package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.PnmImUpdInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.PnmImUpdOutput;

import bea.jolt.pool.Result;

/**
 * PnmImUpdService Class.
 * @author  Ninja
 */
public class PnmImUpdService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "pnmImUpd00";

    /**
     * Creates a new instance of PnmImUpdService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public PnmImUpdService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public PnmImUpdService() {
    }

    /**
     * Calls Tuxedo service 'PnmImUpd'
     *
     * @return Output value object: PnmImUpdOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public PnmImUpdOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public PnmImUpdInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new PnmImUpdInput();
        }
        return (PnmImUpdInput) this.input;
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
    protected PnmImUpdOutput toOutput(final Result result) throws FMLManipulationException {
        return new PnmImUpdOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private PnmImUpdOutput setOutput(final PnmImUpdOutput output) {
        this.output = output;
        return (PnmImUpdOutput) this.output;
    }
}
