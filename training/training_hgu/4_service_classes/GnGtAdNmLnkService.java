package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnGtAdNmLnkInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnGtAdNmLnkOutput;

import bea.jolt.pool.Result;

/**
 * GnGtAdNmLnkService Class.
 * @author  Ninja
 */
public class GnGtAdNmLnkService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "gnGtAdNmLnk00";

    /**
     * Creates a new instance of GnGtAdNmLnkService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnGtAdNmLnkService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public GnGtAdNmLnkService() {
    }

    /**
     * Calls Tuxedo service 'GnGtAdNmLnk'
     *
     * @return Output value object: GnGtAdNmLnkOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnGtAdNmLnkOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnGtAdNmLnkInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new GnGtAdNmLnkInput();
        }
        return (GnGtAdNmLnkInput) this.input;
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
    protected GnGtAdNmLnkOutput toOutput(final Result result) throws FMLManipulationException {
        return new GnGtAdNmLnkOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private GnGtAdNmLnkOutput setOutput(final GnGtAdNmLnkOutput output) {
        this.output = output;
        return (GnGtAdNmLnkOutput) this.output;
    }
}
