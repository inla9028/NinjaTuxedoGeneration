/**
 * CvSvCtnService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvSvCtnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvSvCtnOutput;

/**
 * @author  Ninja
 *
 * CvSvCtnService Class.
 */
public class CvSvCtnService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "cvSvCtn00";

    /**
     * Creates a new instance of CvSvCtnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CvSvCtnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CvSvCtnInput();
        ((CvSvCtnInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CvSvCtnService() {
    }

    /**
     * Calls Tuxedo service 'CvSvCtn'
     *
     * @return Output value object: CvSvCtnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CvSvCtnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CvSvCtnOutput(super.execute());
        return ((CvSvCtnOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CvSvCtnInput getInput() {
        return ((CvSvCtnInput) this.input);
    }
}