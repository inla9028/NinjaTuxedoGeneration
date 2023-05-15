package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsVldImeiInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsVldImeiOutput;

import bea.jolt.pool.Result;

/**
 * CsVldImeiService Class.
 * @author  Ninja
 */
public class CsVldImeiService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csVldImei00";

    /**
     * Creates a new instance of CsVldImeiService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsVldImeiService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsVldImeiService() {
    }

    /**
     * Calls Tuxedo service 'CsVldImei'
     *
     * @return Output value object: CsVldImeiOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsVldImeiOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsVldImeiInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsVldImeiInput();
        }
        return (CsVldImeiInput) this.input;
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
    protected CsVldImeiOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsVldImeiOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsVldImeiOutput setOutput(final CsVldImeiOutput output) {
        this.output = output;
        return (CsVldImeiOutput) this.output;
    }
}
