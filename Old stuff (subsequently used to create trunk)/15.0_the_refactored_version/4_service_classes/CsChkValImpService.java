/**
 * CsChkValImpService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsChkValImpInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsChkValImpOutput;

/**
 * @author  Ninja
 *
 * CsChkValImpService Class.
 */
public class CsChkValImpService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csChkValImp00";

    /**
     * Creates a new instance of CsChkValImpService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsChkValImpService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsChkValImpInput();
        ((CsChkValImpInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsChkValImpService() {
    }

    /**
     * Calls Tuxedo service 'CsChkValImp'
     *
     * @return Output value object: CsChkValImpOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsChkValImpOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsChkValImpOutput(super.execute());
        return ((CsChkValImpOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsChkValImpInput getInput() {
        return ((CsChkValImpInput) this.input);
    }
}