package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchAddInfoInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchAddInfoOutput;

import bea.jolt.pool.Result;

/**
 * CsSrchAddInfoService Class.
 * @author  Ninja
 */
public class CsSrchAddInfoService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csSrchAddInfo00";

    /**
     * Creates a new instance of CsSrchAddInfoService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsSrchAddInfoService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsSrchAddInfoService() {
    }

    /**
     * Calls Tuxedo service 'CsSrchAddInfo'
     *
     * @return Output value object: CsSrchAddInfoOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsSrchAddInfoOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsSrchAddInfoInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsSrchAddInfoInput();
        }
        return (CsSrchAddInfoInput) this.input;
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
    protected CsSrchAddInfoOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsSrchAddInfoOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsSrchAddInfoOutput setOutput(final CsSrchAddInfoOutput output) {
        this.output = output;
        return (CsSrchAddInfoOutput) this.output;
    }
}
