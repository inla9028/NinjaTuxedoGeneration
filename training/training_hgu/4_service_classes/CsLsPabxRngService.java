package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsPabxRngInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsPabxRngOutput;

import bea.jolt.pool.Result;

/**
 * CsLsPabxRngService Class.
 * @author  Ninja
 */
public class CsLsPabxRngService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csLsPabxRng00";

    /**
     * Creates a new instance of CsLsPabxRngService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsLsPabxRngService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsLsPabxRngService() {
    }

    /**
     * Calls Tuxedo service 'CsLsPabxRng'
     *
     * @return Output value object: CsLsPabxRngOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsLsPabxRngOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsLsPabxRngInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsLsPabxRngInput();
        }
        return (CsLsPabxRngInput) this.input;
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
    protected CsLsPabxRngOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsLsPabxRngOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsLsPabxRngOutput setOutput(final CsLsPabxRngOutput output) {
        this.output = output;
        return (CsLsPabxRngOutput) this.output;
    }
}
