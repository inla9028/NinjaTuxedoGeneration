/**
 * CsLsDvcTrxService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsDvcTrxInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsDvcTrxOutput;

/**
 * @author  Ninja
 *
 * CsLsDvcTrxService Class.
 */
public class CsLsDvcTrxService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csLsDvcTrx00";

    /**
     * Creates a new instance of CsLsDvcTrxService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsLsDvcTrxService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsLsDvcTrxInput();
        ((CsLsDvcTrxInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsLsDvcTrxService() {
    }

    /**
     * Calls Tuxedo service 'CsLsDvcTrx'
     *
     * @return Output value object: CsLsDvcTrxOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsLsDvcTrxOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsLsDvcTrxOutput(super.execute());
        return ((CsLsDvcTrxOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsLsDvcTrxInput getInput() {
        return ((CsLsDvcTrxInput) this.input);
    }
}