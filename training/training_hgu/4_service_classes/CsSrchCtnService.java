package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchCtnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchCtnOutput;

import bea.jolt.pool.Result;

/**
 * CsSrchCtnService Class.
 * @author  Ninja
 */
public class CsSrchCtnService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csSrchCtn00";

    /**
     * Creates a new instance of CsSrchCtnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsSrchCtnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsSrchCtnService() {
    }

    /**
     * Calls Tuxedo service 'CsSrchCtn'
     *
     * @return Output value object: CsSrchCtnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsSrchCtnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsSrchCtnInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsSrchCtnInput();
        }
        return (CsSrchCtnInput) this.input;
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
    protected CsSrchCtnOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsSrchCtnOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsSrchCtnOutput setOutput(final CsSrchCtnOutput output) {
        this.output = output;
        return (CsSrchCtnOutput) this.output;
    }
}
