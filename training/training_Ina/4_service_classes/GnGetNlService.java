/**
 * GnGetNlService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnGetNlInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnGetNlOutput;

/**
 * @author  Ninja
 *
 * GnGetNlService Class.
 */
public class GnGetNlService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "gnGetNl00";

    /**
     * Creates a new instance of GnGetNlService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnGetNlService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new GnGetNlInput();
        ((GnGetNlInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public GnGetNlService() {
    }

    /**
     * Calls Tuxedo service 'GnGetNl'
     *
     * @return Output value object: GnGetNlOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnGetNlOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new GnGetNlOutput(super.execute());
        return ((GnGetNlOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnGetNlInput getInput() {
        return ((GnGetNlInput) this.input);
    }
}