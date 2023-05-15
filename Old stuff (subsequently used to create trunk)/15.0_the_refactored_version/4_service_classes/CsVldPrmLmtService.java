/**
 * CsVldPrmLmtService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsVldPrmLmtInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsVldPrmLmtOutput;

/**
 * @author  Ninja
 *
 * CsVldPrmLmtService Class.
 */
public class CsVldPrmLmtService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csVldPrmLmt00";

    /**
     * Creates a new instance of CsVldPrmLmtService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsVldPrmLmtService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsVldPrmLmtInput();
        ((CsVldPrmLmtInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsVldPrmLmtService() {
    }

    /**
     * Calls Tuxedo service 'CsVldPrmLmt'
     *
     * @return Output value object: CsVldPrmLmtOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsVldPrmLmtOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsVldPrmLmtOutput(super.execute());
        return ((CsVldPrmLmtOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsVldPrmLmtInput getInput() {
        return ((CsVldPrmLmtInput) this.input);
    }
}