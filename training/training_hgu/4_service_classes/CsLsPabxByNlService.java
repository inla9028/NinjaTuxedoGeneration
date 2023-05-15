package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsPabxByNlInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsPabxByNlOutput;

import bea.jolt.pool.Result;

/**
 * CsLsPabxByNlService Class.
 * @author  Ninja
 */
public class CsLsPabxByNlService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csLsPabxByNl00";

    /**
     * Creates a new instance of CsLsPabxByNlService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsLsPabxByNlService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsLsPabxByNlService() {
    }

    /**
     * Calls Tuxedo service 'CsLsPabxByNl'
     *
     * @return Output value object: CsLsPabxByNlOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsLsPabxByNlOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsLsPabxByNlInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsLsPabxByNlInput();
        }
        return (CsLsPabxByNlInput) this.input;
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
    protected CsLsPabxByNlOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsLsPabxByNlOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsLsPabxByNlOutput setOutput(final CsLsPabxByNlOutput output) {
        this.output = output;
        return (CsLsPabxByNlOutput) this.output;
    }
}
