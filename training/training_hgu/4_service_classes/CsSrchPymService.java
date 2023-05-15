package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchPymInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchPymOutput;

import bea.jolt.pool.Result;

/**
 * CsSrchPymService Class.
 * @author  Ninja
 */
public class CsSrchPymService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csSrchPym00";

    /**
     * Creates a new instance of CsSrchPymService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsSrchPymService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsSrchPymService() {
    }

    /**
     * Calls Tuxedo service 'CsSrchPym'
     *
     * @return Output value object: CsSrchPymOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsSrchPymOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsSrchPymInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsSrchPymInput();
        }
        return (CsSrchPymInput) this.input;
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
    protected CsSrchPymOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsSrchPymOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsSrchPymOutput setOutput(final CsSrchPymOutput output) {
        this.output = output;
        return (CsSrchPymOutput) this.output;
    }
}
