/**
 * CsLsCtnEsnService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsCtnEsnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsCtnEsnOutput;

/**
 * @author  Ninja
 *
 * CsLsCtnEsnService Class.
 */
public class CsLsCtnEsnService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csLsCtnEsn00";

    /**
     * Creates a new instance of CsLsCtnEsnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsLsCtnEsnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsLsCtnEsnInput();
        ((CsLsCtnEsnInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsLsCtnEsnService() {
    }

    /**
     * Calls Tuxedo service 'CsLsCtnEsn'
     *
     * @return Output value object: CsLsCtnEsnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsLsCtnEsnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsLsCtnEsnOutput(super.execute());
        return ((CsLsCtnEsnOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsLsCtnEsnInput getInput() {
        return ((CsLsCtnEsnInput) this.input);
    }
}