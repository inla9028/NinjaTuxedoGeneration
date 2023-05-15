/**
 * CvSvCtnAgrInputService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvSvCtnAgrInputInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvSvCtnAgrInputOutput;

/**
 * @author  Ninja
 *
 * CvSvCtnAgrInputService Class.
 */
public class CvSvCtnAgrInputService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "cvSvCtnAgrInput00";

    /**
     * Creates a new instance of CvSvCtnAgrInputService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CvSvCtnAgrInputService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CvSvCtnAgrInputInput();
        ((CvSvCtnAgrInputInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CvSvCtnAgrInputService() {
    }

    /**
     * Calls Tuxedo service 'CvSvCtnAgrInput'
     *
     * @return Output value object: CvSvCtnAgrInputOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CvSvCtnAgrInputOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CvSvCtnAgrInputOutput(super.execute());
        return ((CvSvCtnAgrInputOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CvSvCtnAgrInputInput getInput() {
        return ((CvSvCtnAgrInputInput) this.input);
    }
}