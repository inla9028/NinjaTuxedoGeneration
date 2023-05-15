/**
 * CsSrchAddInfoService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchAddInfoInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchAddInfoOutput;

/**
 * @author  Ninja
 *
 * CsSrchAddInfoService Class.
 */
public class CsSrchAddInfoService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csSrchAddInfo00";

    /**
     * Creates a new instance of CsSrchAddInfoService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsSrchAddInfoService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsSrchAddInfoInput();
        ((CsSrchAddInfoInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsSrchAddInfoService() {
    }

    /**
     * Calls Tuxedo service 'CsSrchAddInfo'
     *
     * @return Output value object: CsSrchAddInfoOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsSrchAddInfoOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsSrchAddInfoOutput(super.execute());
        return ((CsSrchAddInfoOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsSrchAddInfoInput getInput() {
        return ((CsSrchAddInfoInput) this.input);
    }
}