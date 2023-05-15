package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsApiBanInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsApiBanOutput;

import bea.jolt.pool.Result;

/**
 * CsApiBanService Class.
 * @author  Ninja
 */
public class CsApiBanService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csApiBan00";

    /**
     * Creates a new instance of CsApiBanService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsApiBanService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsApiBanService() {
    }

    /**
     * Calls Tuxedo service 'CsApiBan'
     *
     * @return Output value object: CsApiBanOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsApiBanOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsApiBanInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsApiBanInput();
        }
        return (CsApiBanInput) this.input;
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
    protected CsApiBanOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsApiBanOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsApiBanOutput setOutput(final CsApiBanOutput output) {
        this.output = output;
        return (CsApiBanOutput) this.output;
    }
}
