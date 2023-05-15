package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsChkMultiInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsChkMultiOutput;

import bea.jolt.pool.Result;

/**
 * CsChkMultiService Class.
 * @author  Ninja
 */
public class CsChkMultiService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csChkMulti00";

    /**
     * Creates a new instance of CsChkMultiService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsChkMultiService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsChkMultiService() {
    }

    /**
     * Calls Tuxedo service 'CsChkMulti'
     *
     * @return Output value object: CsChkMultiOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsChkMultiOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsChkMultiInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsChkMultiInput();
        }
        return (CsChkMultiInput) this.input;
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
    protected CsChkMultiOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsChkMultiOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsChkMultiOutput setOutput(final CsChkMultiOutput output) {
        this.output = output;
        return (CsChkMultiOutput) this.output;
    }
}
