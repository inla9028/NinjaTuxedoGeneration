package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtAddIfInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtAddIfOutput;

import bea.jolt.pool.Result;

/**
 * CsGtAddIfService Class.
 * @author  Ninja
 */
public class CsGtAddIfService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csGtAddIf00";

    /**
     * Creates a new instance of CsGtAddIfService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsGtAddIfService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsGtAddIfService() {
    }

    /**
     * Calls Tuxedo service 'CsGtAddIf'
     *
     * @return Output value object: CsGtAddIfOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsGtAddIfOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsGtAddIfInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsGtAddIfInput();
        }
        return (CsGtAddIfInput) this.input;
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
    protected CsGtAddIfOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsGtAddIfOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsGtAddIfOutput setOutput(final CsGtAddIfOutput output) {
        this.output = output;
        return (CsGtAddIfOutput) this.output;
    }
}
