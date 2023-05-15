package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsChkValImpInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsChkValImpOutput;

import bea.jolt.pool.Result;

/**
 * CsChkValImpService Class.
 * @author  Ninja
 */
public class CsChkValImpService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csChkValImp00";

    /**
     * Creates a new instance of CsChkValImpService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsChkValImpService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsChkValImpService() {
    }

    /**
     * Calls Tuxedo service 'CsChkValImp'
     *
     * @return Output value object: CsChkValImpOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsChkValImpOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsChkValImpInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsChkValImpInput();
        }
        return (CsChkValImpInput) this.input;
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
    protected CsChkValImpOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsChkValImpOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsChkValImpOutput setOutput(final CsChkValImpOutput output) {
        this.output = output;
        return (CsChkValImpOutput) this.output;
    }
}
