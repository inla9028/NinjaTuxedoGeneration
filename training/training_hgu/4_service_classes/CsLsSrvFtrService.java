package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsSrvFtrInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsSrvFtrOutput;

import bea.jolt.pool.Result;

/**
 * CsLsSrvFtrService Class.
 * @author  Ninja
 */
public class CsLsSrvFtrService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csLsSrvFtr00";

    /**
     * Creates a new instance of CsLsSrvFtrService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsLsSrvFtrService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsLsSrvFtrService() {
    }

    /**
     * Calls Tuxedo service 'CsLsSrvFtr'
     *
     * @return Output value object: CsLsSrvFtrOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsLsSrvFtrOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsLsSrvFtrInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsLsSrvFtrInput();
        }
        return (CsLsSrvFtrInput) this.input;
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
    protected CsLsSrvFtrOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsLsSrvFtrOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsLsSrvFtrOutput setOutput(final CsLsSrvFtrOutput output) {
        this.output = output;
        return (CsLsSrvFtrOutput) this.output;
    }
}
