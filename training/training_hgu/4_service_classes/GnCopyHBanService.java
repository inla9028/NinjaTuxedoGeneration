package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnCopyHBanInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnCopyHBanOutput;

import bea.jolt.pool.Result;

/**
 * GnCopyHBanService Class.
 * @author  Ninja
 */
public class GnCopyHBanService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "gnCopyHBan00";

    /**
     * Creates a new instance of GnCopyHBanService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnCopyHBanService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public GnCopyHBanService() {
    }

    /**
     * Calls Tuxedo service 'GnCopyHBan'
     *
     * @return Output value object: GnCopyHBanOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnCopyHBanOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnCopyHBanInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new GnCopyHBanInput();
        }
        return (GnCopyHBanInput) this.input;
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
    protected GnCopyHBanOutput toOutput(final Result result) throws FMLManipulationException {
        return new GnCopyHBanOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private GnCopyHBanOutput setOutput(final GnCopyHBanOutput output) {
        this.output = output;
        return (GnCopyHBanOutput) this.output;
    }
}
