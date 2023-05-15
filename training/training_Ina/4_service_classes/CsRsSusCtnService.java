/**
 * CsRsSusCtnService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsRsSusCtnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsRsSusCtnOutput;

/**
 * @author  Ninja
 *
 * CsRsSusCtnService Class.
 */
public class CsRsSusCtnService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csRsSusCtn00";

    /**
     * Creates a new instance of CsRsSusCtnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsRsSusCtnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsRsSusCtnInput();
        ((CsRsSusCtnInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsRsSusCtnService() {
    }

    /**
     * Calls Tuxedo service 'CsRsSusCtn'
     *
     * @return Output value object: CsRsSusCtnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsRsSusCtnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsRsSusCtnOutput(super.execute());
        return ((CsRsSusCtnOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsRsSusCtnInput getInput() {
        return ((CsRsSusCtnInput) this.input);
    }
}