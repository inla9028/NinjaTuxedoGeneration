package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSvPabxNlInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSvPabxNlOutput;

import bea.jolt.pool.Result;

/**
 * CsSvPabxNlService Class.
 * @author  Ninja
 */
public class CsSvPabxNlService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csSvPabxNl00";

    /**
     * Creates a new instance of CsSvPabxNlService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsSvPabxNlService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsSvPabxNlService() {
    }

    /**
     * Calls Tuxedo service 'CsSvPabxNl'
     *
     * @return Output value object: CsSvPabxNlOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsSvPabxNlOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsSvPabxNlInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsSvPabxNlInput();
        }
        return (CsSvPabxNlInput) this.input;
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
    protected CsSvPabxNlOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsSvPabxNlOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsSvPabxNlOutput setOutput(final CsSvPabxNlOutput output) {
        this.output = output;
        return (CsSvPabxNlOutput) this.output;
    }
}
