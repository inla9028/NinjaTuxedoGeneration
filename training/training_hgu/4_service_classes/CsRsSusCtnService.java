package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsRsSusCtnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsRsSusCtnOutput;

import bea.jolt.pool.Result;

/**
 * CsRsSusCtnService Class.
 * @author  Ninja
 */
public class CsRsSusCtnService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csRsSusCtn00";

    /**
     * Creates a new instance of CsRsSusCtnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsRsSusCtnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsRsSusCtnService() {
    }

    /**
     * Calls Tuxedo service 'CsRsSusCtn'
     *
     * @return Output value object: CsRsSusCtnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsRsSusCtnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsRsSusCtnInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsRsSusCtnInput();
        }
        return (CsRsSusCtnInput) this.input;
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
    protected CsRsSusCtnOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsRsSusCtnOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsRsSusCtnOutput setOutput(final CsRsSusCtnOutput output) {
        this.output = output;
        return (CsRsSusCtnOutput) this.output;
    }
}
