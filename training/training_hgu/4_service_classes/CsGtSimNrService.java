package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtSimNrInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtSimNrOutput;

import bea.jolt.pool.Result;

/**
 * CsGtSimNrService Class.
 * @author  Ninja
 */
public class CsGtSimNrService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csGtSimNr00";

    /**
     * Creates a new instance of CsGtSimNrService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsGtSimNrService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsGtSimNrService() {
    }

    /**
     * Calls Tuxedo service 'CsGtSimNr'
     *
     * @return Output value object: CsGtSimNrOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsGtSimNrOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsGtSimNrInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsGtSimNrInput();
        }
        return (CsGtSimNrInput) this.input;
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
    protected CsGtSimNrOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsGtSimNrOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsGtSimNrOutput setOutput(final CsGtSimNrOutput output) {
        this.output = output;
        return (CsGtSimNrOutput) this.output;
    }
}
