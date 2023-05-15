package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSvOrgDataInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSvOrgDataOutput;

import bea.jolt.pool.Result;

/**
 * CsSvOrgDataService Class.
 * @author  Ninja
 */
public class CsSvOrgDataService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csSvOrgData00";

    /**
     * Creates a new instance of CsSvOrgDataService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsSvOrgDataService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsSvOrgDataService() {
    }

    /**
     * Calls Tuxedo service 'CsSvOrgData'
     *
     * @return Output value object: CsSvOrgDataOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsSvOrgDataOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsSvOrgDataInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsSvOrgDataInput();
        }
        return (CsSvOrgDataInput) this.input;
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
    protected CsSvOrgDataOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsSvOrgDataOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsSvOrgDataOutput setOutput(final CsSvOrgDataOutput output) {
        this.output = output;
        return (CsSvOrgDataOutput) this.output;
    }
}
