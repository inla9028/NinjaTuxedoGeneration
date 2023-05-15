package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsDvcTrxInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsDvcTrxOutput;

import bea.jolt.pool.Result;

/**
 * CsLsDvcTrxService Class.
 * @author  Ninja
 */
public class CsLsDvcTrxService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csLsDvcTrx00";

    /**
     * Creates a new instance of CsLsDvcTrxService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsLsDvcTrxService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsLsDvcTrxService() {
    }

    /**
     * Calls Tuxedo service 'CsLsDvcTrx'
     *
     * @return Output value object: CsLsDvcTrxOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsLsDvcTrxOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsLsDvcTrxInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsLsDvcTrxInput();
        }
        return (CsLsDvcTrxInput) this.input;
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
    protected CsLsDvcTrxOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsLsDvcTrxOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsLsDvcTrxOutput setOutput(final CsLsDvcTrxOutput output) {
        this.output = output;
        return (CsLsDvcTrxOutput) this.output;
    }
}
