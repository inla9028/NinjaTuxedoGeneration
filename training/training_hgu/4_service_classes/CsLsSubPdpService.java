package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsSubPdpInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsSubPdpOutput;

import bea.jolt.pool.Result;

/**
 * CsLsSubPdpService Class.
 * @author  Ninja
 */
public class CsLsSubPdpService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csLsSubPdp00";

    /**
     * Creates a new instance of CsLsSubPdpService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsLsSubPdpService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsLsSubPdpService() {
    }

    /**
     * Calls Tuxedo service 'CsLsSubPdp'
     *
     * @return Output value object: CsLsSubPdpOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsLsSubPdpOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsLsSubPdpInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsLsSubPdpInput();
        }
        return (CsLsSubPdpInput) this.input;
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
    protected CsLsSubPdpOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsLsSubPdpOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsLsSubPdpOutput setOutput(final CsLsSubPdpOutput output) {
        this.output = output;
        return (CsLsSubPdpOutput) this.output;
    }
}
