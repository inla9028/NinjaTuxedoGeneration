package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnUpNmAdrInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnUpNmAdrOutput;

import bea.jolt.pool.Result;

/**
 * GnUpNmAdrService Class.
 * @author  Ninja
 */
public class GnUpNmAdrService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "gnUpNmAdr00";

    /**
     * Creates a new instance of GnUpNmAdrService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnUpNmAdrService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public GnUpNmAdrService() {
    }

    /**
     * Calls Tuxedo service 'GnUpNmAdr'
     *
     * @return Output value object: GnUpNmAdrOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnUpNmAdrOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnUpNmAdrInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new GnUpNmAdrInput();
        }
        return (GnUpNmAdrInput) this.input;
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
    protected GnUpNmAdrOutput toOutput(final Result result) throws FMLManipulationException {
        return new GnUpNmAdrOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private GnUpNmAdrOutput setOutput(final GnUpNmAdrOutput output) {
        this.output = output;
        return (GnUpNmAdrOutput) this.output;
    }
}
