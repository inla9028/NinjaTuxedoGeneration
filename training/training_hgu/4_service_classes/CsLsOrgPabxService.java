package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsOrgPabxInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsOrgPabxOutput;

import bea.jolt.pool.Result;

/**
 * CsLsOrgPabxService Class.
 * @author  Ninja
 */
public class CsLsOrgPabxService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csLsOrgPabx00";

    /**
     * Creates a new instance of CsLsOrgPabxService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsLsOrgPabxService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsLsOrgPabxService() {
    }

    /**
     * Calls Tuxedo service 'CsLsOrgPabx'
     *
     * @return Output value object: CsLsOrgPabxOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsLsOrgPabxOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsLsOrgPabxInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsLsOrgPabxInput();
        }
        return (CsLsOrgPabxInput) this.input;
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
    protected CsLsOrgPabxOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsLsOrgPabxOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsLsOrgPabxOutput setOutput(final CsLsOrgPabxOutput output) {
        this.output = output;
        return (CsLsOrgPabxOutput) this.output;
    }
}
