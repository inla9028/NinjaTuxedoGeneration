package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnGtLgclDtInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnGtLgclDtOutput;

import bea.jolt.pool.Result;

/**
 * GnGtLgclDtService Class.
 * @author  Ninja
 */
public class GnGtLgclDtService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "gnGtLgclDt00";

    /**
     * Creates a new instance of GnGtLgclDtService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnGtLgclDtService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public GnGtLgclDtService() {
    }

    /**
     * Calls Tuxedo service 'GnGtLgclDt'
     *
     * @return Output value object: GnGtLgclDtOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnGtLgclDtOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnGtLgclDtInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new GnGtLgclDtInput();
        }
        return (GnGtLgclDtInput) this.input;
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
    protected GnGtLgclDtOutput toOutput(final Result result) throws FMLManipulationException {
        return new GnGtLgclDtOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private GnGtLgclDtOutput setOutput(final GnGtLgclDtOutput output) {
        this.output = output;
        return (GnGtLgclDtOutput) this.output;
    }
}
