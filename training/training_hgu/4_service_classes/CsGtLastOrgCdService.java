package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtLastOrgCdInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtLastOrgCdOutput;

import bea.jolt.pool.Result;

/**
 * CsGtLastOrgCdService Class.
 * @author  Ninja
 */
public class CsGtLastOrgCdService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csGtLastOrgCd00";

    /**
     * Creates a new instance of CsGtLastOrgCdService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsGtLastOrgCdService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsGtLastOrgCdService() {
    }

    /**
     * Calls Tuxedo service 'CsGtLastOrgCd'
     *
     * @return Output value object: CsGtLastOrgCdOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsGtLastOrgCdOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsGtLastOrgCdInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsGtLastOrgCdInput();
        }
        return (CsGtLastOrgCdInput) this.input;
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
    protected CsGtLastOrgCdOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsGtLastOrgCdOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsGtLastOrgCdOutput setOutput(final CsGtLastOrgCdOutput output) {
        this.output = output;
        return (CsGtLastOrgCdOutput) this.output;
    }
}
