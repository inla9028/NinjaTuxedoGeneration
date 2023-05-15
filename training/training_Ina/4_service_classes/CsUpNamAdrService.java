/**
 * CsUpNamAdrService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsUpNamAdrInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsUpNamAdrOutput;

/**
 * @author  Ninja
 *
 * CsUpNamAdrService Class.
 */
public class CsUpNamAdrService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csUpNamAdr00";

    /**
     * Creates a new instance of CsUpNamAdrService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsUpNamAdrService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsUpNamAdrInput();
        ((CsUpNamAdrInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsUpNamAdrService() {
    }

    /**
     * Calls Tuxedo service 'CsUpNamAdr'
     *
     * @return Output value object: CsUpNamAdrOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsUpNamAdrOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsUpNamAdrOutput(super.execute());
        return ((CsUpNamAdrOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsUpNamAdrInput getInput() {
        return ((CsUpNamAdrInput) this.input);
    }
}