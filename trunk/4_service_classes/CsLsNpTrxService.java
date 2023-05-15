/**
 * CsLsNpTrxService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsNpTrxInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsNpTrxOutput;

/**
 * @author  Ninja
 *
 * CsLsNpTrxService Class.
 */
public class CsLsNpTrxService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csLsNpTrx00";

    /**
     * Creates a new instance of CsLsNpTrxService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsLsNpTrxService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsLsNpTrxInput();
        ((CsLsNpTrxInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsLsNpTrxService() {
    }

    /**
     * Calls Tuxedo service 'CsLsNpTrx'
     *
     * @return Output value object: CsLsNpTrxOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsLsNpTrxOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsLsNpTrxOutput(super.execute());
        return ((CsLsNpTrxOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsLsNpTrxInput getInput() {
        return ((CsLsNpTrxInput) this.input);
    }
}