package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsVldImeiIUInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsVldImeiIUOutput;

import bea.jolt.pool.Result;

/**
 * CsVldImeiIUService Class.
 * @author  Ninja
 */
public class CsVldImeiIUService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csVldImeiIU00";

    /**
     * Creates a new instance of CsVldImeiIUService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsVldImeiIUService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsVldImeiIUService() {
    }

    /**
     * Calls Tuxedo service 'CsVldImeiIU'
     *
     * @return Output value object: CsVldImeiIUOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsVldImeiIUOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsVldImeiIUInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsVldImeiIUInput();
        }
        return (CsVldImeiIUInput) this.input;
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
    protected CsVldImeiIUOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsVldImeiIUOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsVldImeiIUOutput setOutput(final CsVldImeiIUOutput output) {
        this.output = output;
        return (CsVldImeiIUOutput) this.output;
    }
}
