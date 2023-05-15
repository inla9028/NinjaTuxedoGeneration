package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnLsUsrPrmInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnLsUsrPrmOutput;

import bea.jolt.pool.Result;

/**
 * GnLsUsrPrmService Class.
 * @author  Ninja
 */
public class GnLsUsrPrmService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "gnLsUsrPrm00";

    /**
     * Creates a new instance of GnLsUsrPrmService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnLsUsrPrmService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public GnLsUsrPrmService() {
    }

    /**
     * Calls Tuxedo service 'GnLsUsrPrm'
     *
     * @return Output value object: GnLsUsrPrmOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnLsUsrPrmOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnLsUsrPrmInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new GnLsUsrPrmInput();
        }
        return (GnLsUsrPrmInput) this.input;
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
    protected GnLsUsrPrmOutput toOutput(final Result result) throws FMLManipulationException {
        return new GnLsUsrPrmOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private GnLsUsrPrmOutput setOutput(final GnLsUsrPrmOutput output) {
        this.output = output;
        return (GnLsUsrPrmOutput) this.output;
    }
}
