/**
 * CsRelsCtnService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsRelsCtnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsRelsCtnOutput;

/**
 * @author  Ninja
 *
 * CsRelsCtnService Class.
 */
public class CsRelsCtnService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csRelsCtn00";

    /**
     * Creates a new instance of CsRelsCtnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsRelsCtnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsRelsCtnInput();
        ((CsRelsCtnInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsRelsCtnService() {
    }

    /**
     * Calls Tuxedo service 'CsRelsCtn'
     *
     * @return Output value object: CsRelsCtnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsRelsCtnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsRelsCtnOutput(super.execute());
        return ((CsRelsCtnOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsRelsCtnInput getInput() {
        return ((CsRelsCtnInput) this.input);
    }
}