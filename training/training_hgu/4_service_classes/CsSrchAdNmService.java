package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchAdNmInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchAdNmOutput;

import bea.jolt.pool.Result;

/**
 * CsSrchAdNmService Class.
 * @author  Ninja
 */
public class CsSrchAdNmService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csSrchAdNm00";

    /**
     * Creates a new instance of CsSrchAdNmService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsSrchAdNmService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsSrchAdNmService() {
    }

    /**
     * Calls Tuxedo service 'CsSrchAdNm'
     *
     * @return Output value object: CsSrchAdNmOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsSrchAdNmOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsSrchAdNmInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsSrchAdNmInput();
        }
        return (CsSrchAdNmInput) this.input;
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
    protected CsSrchAdNmOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsSrchAdNmOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsSrchAdNmOutput setOutput(final CsSrchAdNmOutput output) {
        this.output = output;
        return (CsSrchAdNmOutput) this.output;
    }
}
