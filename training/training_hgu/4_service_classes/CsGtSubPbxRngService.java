package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtSubPbxRngInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtSubPbxRngOutput;

import bea.jolt.pool.Result;

/**
 * CsGtSubPbxRngService Class.
 * @author  Ninja
 */
public class CsGtSubPbxRngService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csGtSubPbxRng00";

    /**
     * Creates a new instance of CsGtSubPbxRngService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsGtSubPbxRngService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsGtSubPbxRngService() {
    }

    /**
     * Calls Tuxedo service 'CsGtSubPbxRng'
     *
     * @return Output value object: CsGtSubPbxRngOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsGtSubPbxRngOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsGtSubPbxRngInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsGtSubPbxRngInput();
        }
        return (CsGtSubPbxRngInput) this.input;
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
    protected CsGtSubPbxRngOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsGtSubPbxRngOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsGtSubPbxRngOutput setOutput(final CsGtSubPbxRngOutput output) {
        this.output = output;
        return (CsGtSubPbxRngOutput) this.output;
    }
}
