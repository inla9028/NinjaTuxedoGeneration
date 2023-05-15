package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchImsiInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchImsiOutput;

import bea.jolt.pool.Result;

/**
 * CsSrchImsiService Class.
 * @author  Ninja
 */
public class CsSrchImsiService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csSrchImsi00";

    /**
     * Creates a new instance of CsSrchImsiService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsSrchImsiService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        getInput().set_OPERATOR_ID(operatorId);
    }

    public CsSrchImsiService() {
    }

    /**
     * Calls Tuxedo service 'CsSrchImsi'
     *
     * @return Output value object: CsSrchImsiOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsSrchImsiOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        return setOutput(toOutput(super.execute()));
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsSrchImsiInput getInput() throws FMLManipulationException{
        if (this.input == null) {
            this.input = new CsSrchImsiInput();
        }
        return (CsSrchImsiInput) this.input;
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
    protected CsSrchImsiOutput toOutput(final Result result) throws FMLManipulationException {
        return new CsSrchImsiOutput(result);
    }

    /**
     * Sets the output value.
     *
     * @return Output value object reference.
     */
    private CsSrchImsiOutput setOutput(final CsSrchImsiOutput output) {
        this.output = output;
        return (CsSrchImsiOutput) this.output;
    }
}
