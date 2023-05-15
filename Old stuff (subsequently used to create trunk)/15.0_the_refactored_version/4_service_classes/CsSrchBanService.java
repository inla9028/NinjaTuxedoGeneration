/**
 * CsSrchBanService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchBanInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchBanOutput;

/**
 * @author  Ninja
 *
 * CsSrchBanService Class.
 */
public class CsSrchBanService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csSrchBan00";

    /**
     * Creates a new instance of CsSrchBanService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsSrchBanService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsSrchBanInput();
        ((CsSrchBanInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsSrchBanService() {
    }

    /**
     * Calls Tuxedo service 'CsSrchBan'
     *
     * @return Output value object: CsSrchBanOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsSrchBanOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsSrchBanOutput(super.execute());
        return ((CsSrchBanOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsSrchBanInput getInput() {
        return ((CsSrchBanInput) this.input);
    }
}