package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSvOrgPabxInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSvOrgPabxOutput;

import bea.jolt.pool.Result;

/**
 * CsSvOrgPabxService Class.
 * @author  Ninja
 */
public class CsSvOrgPabxService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csSvOrgPabx00";

    /**
     * Creates a new instance of CsSvOrgPabxService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsSvOrgPabxService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsSvOrgPabxService() {
    }

    /**
     * Calls Tuxedo service 'CsSvOrgPabx'
     *
     * @return Output value object: CsSvOrgPabxOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsSvOrgPabxOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsSvOrgPabxInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsSvOrgPabxInput();
        }
        return (CsSvOrgPabxInput) this.input;
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
    protected CsSvOrgPabxOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsSvOrgPabxOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsSvOrgPabxOutput setOutput(final CsSvOrgPabxOutput output) {
        this.output = output;
        return (CsSvOrgPabxOutput) this.output;
    }
}
