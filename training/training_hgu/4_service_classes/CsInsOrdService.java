package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsInsOrdInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsInsOrdOutput;

import bea.jolt.pool.Result;

/**
 * CsInsOrdService Class.
 * @author  Ninja
 */
public class CsInsOrdService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csInsOrd00";

    /**
     * Creates a new instance of CsInsOrdService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsInsOrdService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsInsOrdService() {
    }

    /**
     * Calls Tuxedo service 'CsInsOrd'
     *
     * @return Output value object: CsInsOrdOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsInsOrdOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsInsOrdInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsInsOrdInput();
        }
        return (CsInsOrdInput) this.input;
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
    protected CsInsOrdOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsInsOrdOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsInsOrdOutput setOutput(final CsInsOrdOutput output) {
        this.output = output;
        return (CsInsOrdOutput) this.output;
    }
}
