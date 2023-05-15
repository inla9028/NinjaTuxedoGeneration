package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlGtBiPdfDataInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlGtBiPdfDataOutput;

import bea.jolt.pool.Result;

/**
 * BlGtBiPdfDataService Class.
 * @author  Ninja
 */
public class BlGtBiPdfDataService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "blGtBiPdfData00";

    /**
     * Creates a new instance of BlGtBiPdfDataService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public BlGtBiPdfDataService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public BlGtBiPdfDataService() {
    }

    /**
     * Calls Tuxedo service 'BlGtBiPdfData'
     *
     * @return Output value object: BlGtBiPdfDataOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public BlGtBiPdfDataOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public BlGtBiPdfDataInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new BlGtBiPdfDataInput();
        }
        return (BlGtBiPdfDataInput) this.input;
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
    protected BlGtBiPdfDataOutput toOutput(final Result result) throws FMLManipulationException {
        return new BlGtBiPdfDataOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private BlGtBiPdfDataOutput setOutput(final BlGtBiPdfDataOutput output) {
        this.output = output;
        return (BlGtBiPdfDataOutput) this.output;
    }
}
