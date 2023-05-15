package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsOrgDataInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsOrgDataOutput;

import bea.jolt.pool.Result;

/**
 * CsLsOrgDataService Class.
 * @author  Ninja
 */
public class CsLsOrgDataService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csLsOrgData00";

    /**
     * Creates a new instance of CsLsOrgDataService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsLsOrgDataService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsLsOrgDataService() {
    }

    /**
     * Calls Tuxedo service 'CsLsOrgData'
     *
     * @return Output value object: CsLsOrgDataOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsLsOrgDataOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsLsOrgDataInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsLsOrgDataInput();
        }
        return (CsLsOrgDataInput) this.input;
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
    protected CsLsOrgDataOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsLsOrgDataOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsLsOrgDataOutput setOutput(final CsLsOrgDataOutput output) {
        this.output = output;
        return (CsLsOrgDataOutput) this.output;
    }
}
