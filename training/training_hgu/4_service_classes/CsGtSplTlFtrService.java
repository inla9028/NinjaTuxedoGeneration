package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtSplTlFtrInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtSplTlFtrOutput;

import bea.jolt.pool.Result;

/**
 * CsGtSplTlFtrService Class.
 * @author  Ninja
 */
public class CsGtSplTlFtrService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csGtSplTlFtr00";

    /**
     * Creates a new instance of CsGtSplTlFtrService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsGtSplTlFtrService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsGtSplTlFtrService() {
    }

    /**
     * Calls Tuxedo service 'CsGtSplTlFtr'
     *
     * @return Output value object: CsGtSplTlFtrOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsGtSplTlFtrOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsGtSplTlFtrInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsGtSplTlFtrInput();
        }
        return (CsGtSplTlFtrInput) this.input;
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
    protected CsGtSplTlFtrOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsGtSplTlFtrOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsGtSplTlFtrOutput setOutput(final CsGtSplTlFtrOutput output) {
        this.output = output;
        return (CsGtSplTlFtrOutput) this.output;
    }
}
