package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsPabxNlInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsPabxNlOutput;

import bea.jolt.pool.Result;

/**
 * CsLsPabxNlService Class.
 * @author  Ninja
 */
public class CsLsPabxNlService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csLsPabxNl00";

    /**
     * Creates a new instance of CsLsPabxNlService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsLsPabxNlService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsLsPabxNlService() {
    }

    /**
     * Calls Tuxedo service 'CsLsPabxNl'
     *
     * @return Output value object: CsLsPabxNlOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsLsPabxNlOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsLsPabxNlInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsLsPabxNlInput();
        }
        return (CsLsPabxNlInput) this.input;
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
    protected CsLsPabxNlOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsLsPabxNlOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsLsPabxNlOutput setOutput(final CsLsPabxNlOutput output) {
        this.output = output;
        return (CsLsPabxNlOutput) this.output;
    }
}
