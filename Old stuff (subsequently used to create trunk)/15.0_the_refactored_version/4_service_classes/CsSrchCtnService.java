/**
 * CsSrchCtnService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchCtnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchCtnOutput;

/**
 * @author  Ninja
 *
 * CsSrchCtnService Class.
 */
public class CsSrchCtnService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csSrchCtn00";

    /**
     * Creates a new instance of CsSrchCtnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsSrchCtnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsSrchCtnInput();
        ((CsSrchCtnInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsSrchCtnService() {
    }

    /**
     * Calls Tuxedo service 'CsSrchCtn'
     *
     * @return Output value object: CsSrchCtnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsSrchCtnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsSrchCtnOutput(super.execute());
        return ((CsSrchCtnOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsSrchCtnInput getInput() {
        return ((CsSrchCtnInput) this.input);
    }
}