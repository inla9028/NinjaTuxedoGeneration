package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsSrvAgrInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsSrvAgrOutput;

import bea.jolt.pool.Result;

/**
 * CsLsSrvAgrService Class.
 * @author  Ninja
 */
public class CsLsSrvAgrService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csLsSrvAgr00";

    /**
     * Creates a new instance of CsLsSrvAgrService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsLsSrvAgrService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsLsSrvAgrService() {
    }

    /**
     * Calls Tuxedo service 'CsLsSrvAgr'
     *
     * @return Output value object: CsLsSrvAgrOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsLsSrvAgrOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsLsSrvAgrInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsLsSrvAgrInput();
        }
        return (CsLsSrvAgrInput) this.input;
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
    protected CsLsSrvAgrOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsLsSrvAgrOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsLsSrvAgrOutput setOutput(final CsLsSrvAgrOutput output) {
        this.output = output;
        return (CsLsSrvAgrOutput) this.output;
    }
}
