package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsOrgDepInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsOrgDepOutput;

import bea.jolt.pool.Result;

/**
 * CsLsOrgDepService Class.
 * @author  Ninja
 */
public class CsLsOrgDepService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csLsOrgDep00";

    /**
     * Creates a new instance of CsLsOrgDepService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsLsOrgDepService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsLsOrgDepService() {
    }

    /**
     * Calls Tuxedo service 'CsLsOrgDep'
     *
     * @return Output value object: CsLsOrgDepOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsLsOrgDepOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsLsOrgDepInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsLsOrgDepInput();
        }
        return (CsLsOrgDepInput) this.input;
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
    protected CsLsOrgDepOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsLsOrgDepOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsLsOrgDepOutput setOutput(final CsLsOrgDepOutput output) {
        this.output = output;
        return (CsLsOrgDepOutput) this.output;
    }
}
