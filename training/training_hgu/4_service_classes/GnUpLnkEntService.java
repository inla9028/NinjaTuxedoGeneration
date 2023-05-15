package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnUpLnkEntInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnUpLnkEntOutput;

import bea.jolt.pool.Result;

/**
 * GnUpLnkEntService Class.
 * @author  Ninja
 */
public class GnUpLnkEntService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "gnUpLnkEnt00";

    /**
     * Creates a new instance of GnUpLnkEntService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnUpLnkEntService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public GnUpLnkEntService() {
    }

    /**
     * Calls Tuxedo service 'GnUpLnkEnt'
     *
     * @return Output value object: GnUpLnkEntOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnUpLnkEntOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnUpLnkEntInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new GnUpLnkEntInput();
        }
        return (GnUpLnkEntInput) this.input;
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
    protected GnUpLnkEntOutput toOutput(final Result result) throws FMLManipulationException {
        return new GnUpLnkEntOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private GnUpLnkEntOutput setOutput(final GnUpLnkEntOutput output) {
        this.output = output;
        return (GnUpLnkEntOutput) this.output;
    }
}
