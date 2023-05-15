package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtMsisdnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtMsisdnOutput;

import bea.jolt.pool.Result;

/**
 * CsGtMsisdnService Class.
 * @author  Ninja
 */
public class CsGtMsisdnService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csGtMsisdn00";

    /**
     * Creates a new instance of CsGtMsisdnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsGtMsisdnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsGtMsisdnService() {
    }

    /**
     * Calls Tuxedo service 'CsGtMsisdn'
     *
     * @return Output value object: CsGtMsisdnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsGtMsisdnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsGtMsisdnInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsGtMsisdnInput();
        }
        return (CsGtMsisdnInput) this.input;
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
    protected CsGtMsisdnOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsGtMsisdnOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsGtMsisdnOutput setOutput(final CsGtMsisdnOutput output) {
        this.output = output;
        return (CsGtMsisdnOutput) this.output;
    }
}
