/**
 * CsValFandFLstService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsValFandFLstInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsValFandFLstOutput;

/**
 * @author  Ninja
 *
 * CsValFandFLstService Class.
 */
public class CsValFandFLstService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csValFandFLst00";

    /**
     * Creates a new instance of CsValFandFLstService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsValFandFLstService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsValFandFLstInput();
        ((CsValFandFLstInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsValFandFLstService() {
    }

    /**
     * Calls Tuxedo service 'CsValFandFLst'
     *
     * @return Output value object: CsValFandFLstOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsValFandFLstOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsValFandFLstOutput(super.execute());
        return ((CsValFandFLstOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsValFandFLstInput getInput() {
        return ((CsValFandFLstInput) this.input);
    }
}