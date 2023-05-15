package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSvPNPInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSvPNPOutput;

import bea.jolt.pool.Result;

/**
 * CsSvPNPService Class.
 * @author  Ninja
 */
public class CsSvPNPService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csSvPNP00";

    /**
     * Creates a new instance of CsSvPNPService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsSvPNPService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsSvPNPService() {
    }

    /**
     * Calls Tuxedo service 'CsSvPNP'
     *
     * @return Output value object: CsSvPNPOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsSvPNPOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsSvPNPInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsSvPNPInput();
        }
        return (CsSvPNPInput) this.input;
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
    protected CsSvPNPOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsSvPNPOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsSvPNPOutput setOutput(final CsSvPNPOutput output) {
        this.output = output;
        return (CsSvPNPOutput) this.output;
    }
}
