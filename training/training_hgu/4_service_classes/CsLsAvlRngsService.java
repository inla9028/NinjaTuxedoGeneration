package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsAvlRngsInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsAvlRngsOutput;

import bea.jolt.pool.Result;

/**
 * CsLsAvlRngsService Class.
 * @author  Ninja
 */
public class CsLsAvlRngsService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csLsAvlRngs00";

    /**
     * Creates a new instance of CsLsAvlRngsService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsLsAvlRngsService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsLsAvlRngsService() {
    }

    /**
     * Calls Tuxedo service 'CsLsAvlRngs'
     *
     * @return Output value object: CsLsAvlRngsOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsLsAvlRngsOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsLsAvlRngsInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsLsAvlRngsInput();
        }
        return (CsLsAvlRngsInput) this.input;
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
    protected CsLsAvlRngsOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsLsAvlRngsOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsLsAvlRngsOutput setOutput(final CsLsAvlRngsOutput output) {
        this.output = output;
        return (CsLsAvlRngsOutput) this.output;
    }
}
