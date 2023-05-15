/**
 * CsGtMsisdnService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtMsisdnInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsGtMsisdnOutput;

/**
 * @author  Ninja
 *
 * CsGtMsisdnService Class.
 */
public class CsGtMsisdnService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csGtMsisdn00";

    /**
     * Creates a new instance of CsGtMsisdnService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsGtMsisdnService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsGtMsisdnInput();
        ((CsGtMsisdnInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsGtMsisdnService() {
    }

    /**
     * Calls Tuxedo service 'CsGtMsisdn'
     *
     * @return Output value object: CsGtMsisdnOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsGtMsisdnOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsGtMsisdnOutput(super.execute());
        return ((CsGtMsisdnOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsGtMsisdnInput getInput() {
        return ((CsGtMsisdnInput) this.input);
    }
}