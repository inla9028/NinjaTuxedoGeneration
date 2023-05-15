package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsCallFrwdInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsCallFrwdOutput;

import bea.jolt.pool.Result;

/**
 * CsCallFrwdService Class.
 * @author  Ninja
 */
public class CsCallFrwdService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csCallFrwd00";

    /**
     * Creates a new instance of CsCallFrwdService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsCallFrwdService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsCallFrwdService() {
    }

    /**
     * Calls Tuxedo service 'CsCallFrwd'
     *
     * @return Output value object: CsCallFrwdOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsCallFrwdOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsCallFrwdInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsCallFrwdInput();
        }
        return (CsCallFrwdInput) this.input;
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
    protected CsCallFrwdOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsCallFrwdOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsCallFrwdOutput setOutput(final CsCallFrwdOutput output) {
        this.output = output;
        return (CsCallFrwdOutput) this.output;
    }
}
