/**
 * CsCallFrwdService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsCallFrwdInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsCallFrwdOutput;

/**
 * @author  Ninja
 *
 * CsCallFrwdService Class.
 */
public class CsCallFrwdService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csCallFrwd00";

    /**
     * Creates a new instance of CsCallFrwdService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsCallFrwdService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsCallFrwdInput();
        ((CsCallFrwdInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsCallFrwdService() {
    }

    /**
     * Calls Tuxedo service 'CsCallFrwd'
     *
     * @return Output value object: CsCallFrwdOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsCallFrwdOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsCallFrwdOutput(super.execute());
        return ((CsCallFrwdOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsCallFrwdInput getInput() {
        return ((CsCallFrwdInput) this.input);
    }
}