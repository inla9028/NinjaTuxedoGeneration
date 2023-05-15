/**
 * CvSvNmAdrService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvSvNmAdrInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvSvNmAdrOutput;

/**
 * @author  Ninja
 *
 * CvSvNmAdrService Class.
 */
public class CvSvNmAdrService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "cvSvNmAdr00";

    /**
     * Creates a new instance of CvSvNmAdrService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CvSvNmAdrService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CvSvNmAdrInput();
        ((CvSvNmAdrInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CvSvNmAdrService() {
    }

    /**
     * Calls Tuxedo service 'CvSvNmAdr'
     *
     * @return Output value object: CvSvNmAdrOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CvSvNmAdrOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CvSvNmAdrOutput(super.execute());
        return ((CvSvNmAdrOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CvSvNmAdrInput getInput() {
        return ((CvSvNmAdrInput) this.input);
    }
}