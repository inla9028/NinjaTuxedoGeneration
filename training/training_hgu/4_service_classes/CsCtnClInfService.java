package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsCtnClInfInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsCtnClInfOutput;

import bea.jolt.pool.Result;

/**
 * CsCtnClInfService Class.
 * @author  Ninja
 */
public class CsCtnClInfService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csCtnClInf00";

    /**
     * Creates a new instance of CsCtnClInfService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsCtnClInfService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsCtnClInfService() {
    }

    /**
     * Calls Tuxedo service 'CsCtnClInf'
     *
     * @return Output value object: CsCtnClInfOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsCtnClInfOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsCtnClInfInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsCtnClInfInput();
        }
        return (CsCtnClInfInput) this.input;
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
    protected CsCtnClInfOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsCtnClInfOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsCtnClInfOutput setOutput(final CsCtnClInfOutput output) {
        this.output = output;
        return (CsCtnClInfOutput) this.output;
    }
}
