/**
 * GnGtTreeBasicService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnGtTreeBasicInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnGtTreeBasicOutput;

/**
 * @author  Ninja
 *
 * GnGtTreeBasicService Class.
 */
public class GnGtTreeBasicService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "gnGtTreeBasic00";

    /**
     * Creates a new instance of GnGtTreeBasicService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnGtTreeBasicService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new GnGtTreeBasicInput();
        ((GnGtTreeBasicInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public GnGtTreeBasicService() {
    }

    /**
     * Calls Tuxedo service 'GnGtTreeBasic'
     *
     * @return Output value object: GnGtTreeBasicOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnGtTreeBasicOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new GnGtTreeBasicOutput(super.execute());
        return ((GnGtTreeBasicOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnGtTreeBasicInput getInput() {
        return ((GnGtTreeBasicInput) this.input);
    }
}