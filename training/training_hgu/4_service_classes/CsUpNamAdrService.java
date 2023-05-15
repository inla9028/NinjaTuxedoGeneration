package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsUpNamAdrInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsUpNamAdrOutput;

import bea.jolt.pool.Result;

/**
 * CsUpNamAdrService Class.
 * @author  Ninja
 */
public class CsUpNamAdrService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csUpNamAdr00";

    /**
     * Creates a new instance of CsUpNamAdrService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsUpNamAdrService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsUpNamAdrService() {
    }

    /**
     * Calls Tuxedo service 'CsUpNamAdr'
     *
     * @return Output value object: CsUpNamAdrOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsUpNamAdrOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsUpNamAdrInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsUpNamAdrInput();
        }
        return (CsUpNamAdrInput) this.input;
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
    protected CsUpNamAdrOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsUpNamAdrOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsUpNamAdrOutput setOutput(final CsUpNamAdrOutput output) {
        this.output = output;
        return (CsUpNamAdrOutput) this.output;
    }
}
