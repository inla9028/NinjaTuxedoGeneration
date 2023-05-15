package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArMoveBanLnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArMoveBanLnOutput;

import bea.jolt.pool.Result;

/**
 * ArMoveBanLnService Class.
 * @author  Ninja
 */
public class ArMoveBanLnService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arMoveBanLn00";

    /**
     * Creates a new instance of ArMoveBanLnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArMoveBanLnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public ArMoveBanLnService() {
    }

    /**
     * Calls Tuxedo service 'ArMoveBanLn'
     *
     * @return Output value object: ArMoveBanLnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArMoveBanLnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArMoveBanLnInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new ArMoveBanLnInput();
        }
        return (ArMoveBanLnInput) this.input;
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
    protected ArMoveBanLnOutput toOutput(final Result result) throws FMLManipulationException {
        return new ArMoveBanLnOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private ArMoveBanLnOutput setOutput(final ArMoveBanLnOutput output) {
        this.output = output;
        return (ArMoveBanLnOutput) this.output;
    }
}
