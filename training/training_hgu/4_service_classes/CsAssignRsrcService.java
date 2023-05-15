package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsAssignRsrcInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsAssignRsrcOutput;

import bea.jolt.pool.Result;

/**
 * CsAssignRsrcService Class.
 * @author  Ninja
 */
public class CsAssignRsrcService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csAssignRsrc00";

    /**
     * Creates a new instance of CsAssignRsrcService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsAssignRsrcService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsAssignRsrcService() {
    }

    /**
     * Calls Tuxedo service 'CsAssignRsrc'
     *
     * @return Output value object: CsAssignRsrcOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsAssignRsrcOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsAssignRsrcInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsAssignRsrcInput();
        }
        return (CsAssignRsrcInput) this.input;
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
    protected CsAssignRsrcOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsAssignRsrcOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsAssignRsrcOutput setOutput(final CsAssignRsrcOutput output) {
        this.output = output;
        return (CsAssignRsrcOutput) this.output;
    }
}
