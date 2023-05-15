package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsPabxNoNlInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsPabxNoNlOutput;

import bea.jolt.pool.Result;

/**
 * CsLsPabxNoNlService Class.
 * @author  Ninja
 */
public class CsLsPabxNoNlService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csLsPabxNoNl00";

    /**
     * Creates a new instance of CsLsPabxNoNlService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsLsPabxNoNlService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsLsPabxNoNlService() {
    }

    /**
     * Calls Tuxedo service 'CsLsPabxNoNl'
     *
     * @return Output value object: CsLsPabxNoNlOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsLsPabxNoNlOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsLsPabxNoNlInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsLsPabxNoNlInput();
        }
        return (CsLsPabxNoNlInput) this.input;
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
    protected CsLsPabxNoNlOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsLsPabxNoNlOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsLsPabxNoNlOutput setOutput(final CsLsPabxNoNlOutput output) {
        this.output = output;
        return (CsLsPabxNoNlOutput) this.output;
    }
}
