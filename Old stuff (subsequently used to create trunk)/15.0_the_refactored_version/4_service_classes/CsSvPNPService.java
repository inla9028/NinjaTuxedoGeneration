/**
 * CsSvPNPService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSvPNPInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSvPNPOutput;

/**
 * @author  Ninja
 *
 * CsSvPNPService Class.
 */
public class CsSvPNPService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csSvPNP00";

    /**
     * Creates a new instance of CsSvPNPService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsSvPNPService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsSvPNPInput();
        ((CsSvPNPInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsSvPNPService() {
    }

    /**
     * Calls Tuxedo service 'CsSvPNP'
     *
     * @return Output value object: CsSvPNPOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsSvPNPOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsSvPNPOutput(super.execute());
        return ((CsSvPNPOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsSvPNPInput getInput() {
        return ((CsSvPNPInput) this.input);
    }
}