package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchNmPrmInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchNmPrmOutput;

import bea.jolt.pool.Result;

/**
 * CsSrchNmPrmService Class.
 * @author  Ninja
 */
public class CsSrchNmPrmService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csSrchNmPrm00";

    /**
     * Creates a new instance of CsSrchNmPrmService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsSrchNmPrmService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsSrchNmPrmService() {
    }

    /**
     * Calls Tuxedo service 'CsSrchNmPrm'
     *
     * @return Output value object: CsSrchNmPrmOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsSrchNmPrmOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsSrchNmPrmInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsSrchNmPrmInput();
        }
        return (CsSrchNmPrmInput) this.input;
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
    protected CsSrchNmPrmOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsSrchNmPrmOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsSrchNmPrmOutput setOutput(final CsSrchNmPrmOutput output) {
        this.output = output;
        return (CsSrchNmPrmOutput) this.output;
    }
}
