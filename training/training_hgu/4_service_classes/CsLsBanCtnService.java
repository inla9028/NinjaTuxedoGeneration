package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsBanCtnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsBanCtnOutput;

import bea.jolt.pool.Result;

/**
 * CsLsBanCtnService Class.
 * @author  Ninja
 */
public class CsLsBanCtnService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csLsBanCtn00";

    /**
     * Creates a new instance of CsLsBanCtnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsLsBanCtnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsLsBanCtnService() {
    }

    /**
     * Calls Tuxedo service 'CsLsBanCtn'
     *
     * @return Output value object: CsLsBanCtnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsLsBanCtnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsLsBanCtnInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsLsBanCtnInput();
        }
        return (CsLsBanCtnInput) this.input;
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
    protected CsLsBanCtnOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsLsBanCtnOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsLsBanCtnOutput setOutput(final CsLsBanCtnOutput output) {
        this.output = output;
        return (CsLsBanCtnOutput) this.output;
    }
}
