package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsDlrPabxNlInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsDlrPabxNlOutput;

import bea.jolt.pool.Result;

/**
 * CsLsDlrPabxNlService Class.
 * @author  Ninja
 */
public class CsLsDlrPabxNlService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csLsDlrPabxNl00";

    /**
     * Creates a new instance of CsLsDlrPabxNlService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsLsDlrPabxNlService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsLsDlrPabxNlService() {
    }

    /**
     * Calls Tuxedo service 'CsLsDlrPabxNl'
     *
     * @return Output value object: CsLsDlrPabxNlOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsLsDlrPabxNlOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsLsDlrPabxNlInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsLsDlrPabxNlInput();
        }
        return (CsLsDlrPabxNlInput) this.input;
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
    protected CsLsDlrPabxNlOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsLsDlrPabxNlOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsLsDlrPabxNlOutput setOutput(final CsLsDlrPabxNlOutput output) {
        this.output = output;
        return (CsLsDlrPabxNlOutput) this.output;
    }
}
