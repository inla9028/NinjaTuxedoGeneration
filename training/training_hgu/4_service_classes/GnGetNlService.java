package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnGetNlInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnGetNlOutput;

import bea.jolt.pool.Result;

/**
 * GnGetNlService Class.
 * @author  Ninja
 */
public class GnGetNlService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "gnGetNl00";

    /**
     * Creates a new instance of GnGetNlService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnGetNlService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public GnGetNlService() {
    }

    /**
     * Calls Tuxedo service 'GnGetNl'
     *
     * @return Output value object: GnGetNlOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnGetNlOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnGetNlInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new GnGetNlInput();
        }
        return (GnGetNlInput) this.input;
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
    protected GnGetNlOutput toOutput(final Result result) throws FMLManipulationException {
        return new GnGetNlOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private GnGetNlOutput setOutput(final GnGetNlOutput output) {
        this.output = output;
        return (GnGetNlOutput) this.output;
    }
}
