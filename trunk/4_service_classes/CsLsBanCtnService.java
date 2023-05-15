/**
 * CsLsBanCtnService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsBanCtnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsBanCtnOutput;

/**
 * @author  Ninja
 *
 * CsLsBanCtnService Class.
 */
public class CsLsBanCtnService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csLsBanCtn00";

    /**
     * Creates a new instance of CsLsBanCtnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsLsBanCtnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsLsBanCtnInput();
        ((CsLsBanCtnInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsLsBanCtnService() {
    }

    /**
     * Calls Tuxedo service 'CsLsBanCtn'
     *
     * @return Output value object: CsLsBanCtnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsLsBanCtnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsLsBanCtnOutput(super.execute());
        return ((CsLsBanCtnOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsLsBanCtnInput getInput() {
        return ((CsLsBanCtnInput) this.input);
    }
}