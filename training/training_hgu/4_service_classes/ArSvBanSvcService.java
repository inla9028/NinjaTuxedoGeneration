package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArSvBanSvcInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArSvBanSvcOutput;

import bea.jolt.pool.Result;

/**
 * ArSvBanSvcService Class.
 * @author  Ninja
 */
public class ArSvBanSvcService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "arSvBanSvc00";

    /**
     * Creates a new instance of ArSvBanSvcService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArSvBanSvcService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public ArSvBanSvcService() {
    }

    /**
     * Calls Tuxedo service 'ArSvBanSvc'
     *
     * @return Output value object: ArSvBanSvcOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArSvBanSvcOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArSvBanSvcInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new ArSvBanSvcInput();
        }
        return (ArSvBanSvcInput) this.input;
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
    protected ArSvBanSvcOutput toOutput(final Result result) throws FMLManipulationException {
        return new ArSvBanSvcOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private ArSvBanSvcOutput setOutput(final ArSvBanSvcOutput output) {
        this.output = output;
        return (ArSvBanSvcOutput) this.output;
    }
}
