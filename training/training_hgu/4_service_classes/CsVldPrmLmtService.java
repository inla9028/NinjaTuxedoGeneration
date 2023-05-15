package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsVldPrmLmtInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsVldPrmLmtOutput;

import bea.jolt.pool.Result;

/**
 * CsVldPrmLmtService Class.
 * @author  Ninja
 */
public class CsVldPrmLmtService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csVldPrmLmt00";

    /**
     * Creates a new instance of CsVldPrmLmtService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsVldPrmLmtService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsVldPrmLmtService() {
    }

    /**
     * Calls Tuxedo service 'CsVldPrmLmt'
     *
     * @return Output value object: CsVldPrmLmtOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsVldPrmLmtOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsVldPrmLmtInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsVldPrmLmtInput();
        }
        return (CsVldPrmLmtInput) this.input;
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
    protected CsVldPrmLmtOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsVldPrmLmtOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsVldPrmLmtOutput setOutput(final CsVldPrmLmtOutput output) {
        this.output = output;
        return (CsVldPrmLmtOutput) this.output;
    }
}
