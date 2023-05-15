package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSvCrdWchInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSvCrdWchOutput;

import bea.jolt.pool.Result;

/**
 * CsSvCrdWchService Class.
 * @author  Ninja
 */
public class CsSvCrdWchService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csSvCrdWch00";

    /**
     * Creates a new instance of CsSvCrdWchService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsSvCrdWchService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsSvCrdWchService() {
    }

    /**
     * Calls Tuxedo service 'CsSvCrdWch'
     *
     * @return Output value object: CsSvCrdWchOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsSvCrdWchOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsSvCrdWchInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsSvCrdWchInput();
        }
        return (CsSvCrdWchInput) this.input;
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
    protected CsSvCrdWchOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsSvCrdWchOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsSvCrdWchOutput setOutput(final CsSvCrdWchOutput output) {
        this.output = output;
        return (CsSvCrdWchOutput) this.output;
    }
}
