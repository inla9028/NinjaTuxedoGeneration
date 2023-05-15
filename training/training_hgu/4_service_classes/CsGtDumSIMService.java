package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtDumSIMInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtDumSIMOutput;

import bea.jolt.pool.Result;

/**
 * CsGtDumSIMService Class.
 * @author  Ninja
 */
public class CsGtDumSIMService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csGtDumSIM00";

    /**
     * Creates a new instance of CsGtDumSIMService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsGtDumSIMService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsGtDumSIMService() {
    }

    /**
     * Calls Tuxedo service 'CsGtDumSIM'
     *
     * @return Output value object: CsGtDumSIMOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsGtDumSIMOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsGtDumSIMInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsGtDumSIMInput();
        }
        return (CsGtDumSIMInput) this.input;
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
    protected CsGtDumSIMOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsGtDumSIMOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsGtDumSIMOutput setOutput(final CsGtDumSIMOutput output) {
        this.output = output;
        return (CsGtDumSIMOutput) this.output;
    }
}
