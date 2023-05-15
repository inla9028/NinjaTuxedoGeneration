/**
 * CsCtnClInfService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsCtnClInfInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsCtnClInfOutput;

/**
 * @author  Ninja
 *
 * CsCtnClInfService Class.
 */
public class CsCtnClInfService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csCtnClInf00";

    /**
     * Creates a new instance of CsCtnClInfService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsCtnClInfService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsCtnClInfInput();
        ((CsCtnClInfInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsCtnClInfService() {
    }

    /**
     * Calls Tuxedo service 'CsCtnClInf'
     *
     * @return Output value object: CsCtnClInfOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsCtnClInfOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsCtnClInfOutput(super.execute());
        return ((CsCtnClInfOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsCtnClInfInput getInput() {
        return ((CsCtnClInfInput) this.input);
    }
}