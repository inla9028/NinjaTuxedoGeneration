/**
 * CsSrchOdBanService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchOdBanInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchOdBanOutput;

/**
 * @author  Ninja
 *
 * CsSrchOdBanService Class.
 */
public class CsSrchOdBanService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csSrchOdBan00";

    /**
     * Creates a new instance of CsSrchOdBanService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsSrchOdBanService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsSrchOdBanInput();
        ((CsSrchOdBanInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsSrchOdBanService() {
    }

    /**
     * Calls Tuxedo service 'CsSrchOdBan'
     *
     * @return Output value object: CsSrchOdBanOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsSrchOdBanOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsSrchOdBanOutput(super.execute());
        return ((CsSrchOdBanOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsSrchOdBanInput getInput() {
        return ((CsSrchOdBanInput) this.input);
    }
}