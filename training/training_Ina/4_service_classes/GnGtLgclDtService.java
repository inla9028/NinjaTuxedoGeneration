/**
 * GnGtLgclDtService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnGtLgclDtInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnGtLgclDtOutput;

/**
 * @author  Ninja
 *
 * GnGtLgclDtService Class.
 */
public class GnGtLgclDtService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "gnGtLgclDt00";

    /**
     * Creates a new instance of GnGtLgclDtService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnGtLgclDtService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new GnGtLgclDtInput();
        ((GnGtLgclDtInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public GnGtLgclDtService() {
    }

    /**
     * Calls Tuxedo service 'GnGtLgclDt'
     *
     * @return Output value object: GnGtLgclDtOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnGtLgclDtOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new GnGtLgclDtOutput(super.execute());
        return ((GnGtLgclDtOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnGtLgclDtInput getInput() {
        return ((GnGtLgclDtInput) this.input);
    }
}