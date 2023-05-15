/**
 * GnLsFtrTrxService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnLsFtrTrxInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnLsFtrTrxOutput;

/**
 * @author  Ninja
 *
 * GnLsFtrTrxService Class.
 */
public class GnLsFtrTrxService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "gnLsFtrTrx00";

    /**
     * Creates a new instance of GnLsFtrTrxService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnLsFtrTrxService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new GnLsFtrTrxInput();
        ((GnLsFtrTrxInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public GnLsFtrTrxService() {
    }

    /**
     * Calls Tuxedo service 'GnLsFtrTrx'
     *
     * @return Output value object: GnLsFtrTrxOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnLsFtrTrxOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new GnLsFtrTrxOutput(super.execute());
        return ((GnLsFtrTrxOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnLsFtrTrxInput getInput() {
        return ((GnLsFtrTrxInput) this.input);
    }
}