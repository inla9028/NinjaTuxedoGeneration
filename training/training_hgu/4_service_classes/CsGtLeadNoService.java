package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtLeadNoInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtLeadNoOutput;

import bea.jolt.pool.Result;

/**
 * CsGtLeadNoService Class.
 * @author  Ninja
 */
public class CsGtLeadNoService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csGtLeadNo00";

    /**
     * Creates a new instance of CsGtLeadNoService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsGtLeadNoService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsGtLeadNoService() {
    }

    /**
     * Calls Tuxedo service 'CsGtLeadNo'
     *
     * @return Output value object: CsGtLeadNoOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsGtLeadNoOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsGtLeadNoInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsGtLeadNoInput();
        }
        return (CsGtLeadNoInput) this.input;
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
    protected CsGtLeadNoOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsGtLeadNoOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsGtLeadNoOutput setOutput(final CsGtLeadNoOutput output) {
        this.output = output;
        return (CsGtLeadNoOutput) this.output;
    }
}
