package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnLsLnkBansInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnLsLnkBansOutput;

import bea.jolt.pool.Result;

/**
 * GnLsLnkBansService Class.
 * @author  Ninja
 */
public class GnLsLnkBansService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "gnLsLnkBans00";

    /**
     * Creates a new instance of GnLsLnkBansService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnLsLnkBansService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public GnLsLnkBansService() {
    }

    /**
     * Calls Tuxedo service 'GnLsLnkBans'
     *
     * @return Output value object: GnLsLnkBansOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnLsLnkBansOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnLsLnkBansInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new GnLsLnkBansInput();
        }
        return (GnLsLnkBansInput) this.input;
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
    protected GnLsLnkBansOutput toOutput(final Result result) throws FMLManipulationException {
        return new GnLsLnkBansOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private GnLsLnkBansOutput setOutput(final GnLsLnkBansOutput output) {
        this.output = output;
        return (GnLsLnkBansOutput) this.output;
    }
}
