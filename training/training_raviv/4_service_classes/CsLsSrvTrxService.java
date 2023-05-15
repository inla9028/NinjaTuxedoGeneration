/**
 * CsLsSrvTrxService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsSrvTrxInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsLsSrvTrxOutput;

/**
 * @author  Ninja
 *
 * CsLsSrvTrxService Class.
 */
public class CsLsSrvTrxService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csLsSrvTrx00";

    /**
     * Creates a new instance of CsLsSrvTrxService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsLsSrvTrxService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsLsSrvTrxInput();
        ((CsLsSrvTrxInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsLsSrvTrxService() {
    }

    /**
     * Calls Tuxedo service 'CsLsSrvTrx'
     *
     * @return Output value object: CsLsSrvTrxOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsLsSrvTrxOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsLsSrvTrxOutput(super.execute());
        return ((CsLsSrvTrxOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsLsSrvTrxInput getInput() {
        return ((CsLsSrvTrxInput) this.input);
    }
}