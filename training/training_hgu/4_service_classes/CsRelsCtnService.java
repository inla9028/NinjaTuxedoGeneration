package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsRelsCtnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsRelsCtnOutput;

import bea.jolt.pool.Result;

/**
 * CsRelsCtnService Class.
 * @author  Ninja
 */
public class CsRelsCtnService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csRelsCtn00";

    /**
     * Creates a new instance of CsRelsCtnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsRelsCtnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsRelsCtnService() {
    }

    /**
     * Calls Tuxedo service 'CsRelsCtn'
     *
     * @return Output value object: CsRelsCtnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsRelsCtnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsRelsCtnInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsRelsCtnInput();
        }
        return (CsRelsCtnInput) this.input;
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
    protected CsRelsCtnOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsRelsCtnOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsRelsCtnOutput setOutput(final CsRelsCtnOutput output) {
        this.output = output;
        return (CsRelsCtnOutput) this.output;
    }
}
