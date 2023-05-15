package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsUpSubRankInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsUpSubRankOutput;

import bea.jolt.pool.Result;

/**
 * CsUpSubRankService Class.
 * @author  Ninja
 */
public class CsUpSubRankService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csUpSubRank00";

    /**
     * Creates a new instance of CsUpSubRankService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsUpSubRankService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsUpSubRankService() {
    }

    /**
     * Calls Tuxedo service 'CsUpSubRank'
     *
     * @return Output value object: CsUpSubRankOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsUpSubRankOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsUpSubRankInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsUpSubRankInput();
        }
        return (CsUpSubRankInput) this.input;
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
    protected CsUpSubRankOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsUpSubRankOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsUpSubRankOutput setOutput(final CsUpSubRankOutput output) {
        this.output = output;
        return (CsUpSubRankOutput) this.output;
    }
}
