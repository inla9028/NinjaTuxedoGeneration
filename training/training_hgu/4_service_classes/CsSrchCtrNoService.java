package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchCtrNoInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchCtrNoOutput;

import bea.jolt.pool.Result;

/**
 * CsSrchCtrNoService Class.
 * @author  Ninja
 */
public class CsSrchCtrNoService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csSrchCtrNo00";

    /**
     * Creates a new instance of CsSrchCtrNoService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsSrchCtrNoService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsSrchCtrNoService() {
    }

    /**
     * Calls Tuxedo service 'CsSrchCtrNo'
     *
     * @return Output value object: CsSrchCtrNoOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsSrchCtrNoOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsSrchCtrNoInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsSrchCtrNoInput();
        }
        return (CsSrchCtrNoInput) this.input;
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
    protected CsSrchCtrNoOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsSrchCtrNoOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsSrchCtrNoOutput setOutput(final CsSrchCtrNoOutput output) {
        this.output = output;
        return (CsSrchCtrNoOutput) this.output;
    }
}
