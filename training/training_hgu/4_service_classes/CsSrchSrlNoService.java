package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchSrlNoInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchSrlNoOutput;

import bea.jolt.pool.Result;

/**
 * CsSrchSrlNoService Class.
 * @author  Ninja
 */
public class CsSrchSrlNoService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csSrchSrlNo00";

    /**
     * Creates a new instance of CsSrchSrlNoService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsSrchSrlNoService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsSrchSrlNoService() {
    }

    /**
     * Calls Tuxedo service 'CsSrchSrlNo'
     *
     * @return Output value object: CsSrchSrlNoOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsSrchSrlNoOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsSrchSrlNoInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsSrchSrlNoInput();
        }
        return (CsSrchSrlNoInput) this.input;
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
    protected CsSrchSrlNoOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsSrchSrlNoOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsSrchSrlNoOutput setOutput(final CsSrchSrlNoOutput output) {
        this.output = output;
        return (CsSrchSrlNoOutput) this.output;
    }
}
