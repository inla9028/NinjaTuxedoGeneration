package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtSubRankInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtSubRankOutput;

import bea.jolt.pool.Result;

/**
 * CsGtSubRankService Class.
 * @author  Ninja
 */
public class CsGtSubRankService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csGtSubRank00";

    /**
     * Creates a new instance of CsGtSubRankService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsGtSubRankService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsGtSubRankService() {
    }

    /**
     * Calls Tuxedo service 'CsGtSubRank'
     *
     * @return Output value object: CsGtSubRankOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsGtSubRankOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsGtSubRankInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsGtSubRankInput();
        }
        return (CsGtSubRankInput) this.input;
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
    protected CsGtSubRankOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsGtSubRankOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsGtSubRankOutput setOutput(final CsGtSubRankOutput output) {
        this.output = output;
        return (CsGtSubRankOutput) this.output;
    }
}
