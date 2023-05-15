/**
 * CsGetCtnNmService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGetCtnNmInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGetCtnNmOutput;

/**
 * @author  Ninja
 *
 * CsGetCtnNmService Class.
 */
public class CsGetCtnNmService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csGetCtnNm00";

    /**
     * Creates a new instance of CsGetCtnNmService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsGetCtnNmService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsGetCtnNmInput();
        ((CsGetCtnNmInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsGetCtnNmService() {
    }

    /**
     * Calls Tuxedo service 'CsGetCtnNm'
     *
     * @return Output value object: CsGetCtnNmOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsGetCtnNmOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsGetCtnNmOutput(super.execute());
        return ((CsGetCtnNmOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsGetCtnNmInput getInput() {
        return ((CsGetCtnNmInput) this.input);
    }
}