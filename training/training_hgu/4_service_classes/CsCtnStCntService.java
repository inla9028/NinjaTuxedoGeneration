package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsCtnStCntInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsCtnStCntOutput;

import bea.jolt.pool.Result;

/**
 * CsCtnStCntService Class.
 * @author  Ninja
 */
public class CsCtnStCntService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csCtnStCnt00";

    /**
     * Creates a new instance of CsCtnStCntService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsCtnStCntService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsCtnStCntService() {
    }

    /**
     * Calls Tuxedo service 'CsCtnStCnt'
     *
     * @return Output value object: CsCtnStCntOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsCtnStCntOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsCtnStCntInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsCtnStCntInput();
        }
        return (CsCtnStCntInput) this.input;
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
    protected CsCtnStCntOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsCtnStCntOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsCtnStCntOutput setOutput(final CsCtnStCntOutput output) {
        this.output = output;
        return (CsCtnStCntOutput) this.output;
    }
}
