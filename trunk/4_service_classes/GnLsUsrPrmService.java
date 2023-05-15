/**
 * GnLsUsrPrmService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnLsUsrPrmInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.GnLsUsrPrmOutput;

/**
 * @author  Ninja
 *
 * GnLsUsrPrmService Class.
 */
public class GnLsUsrPrmService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "gnLsUsrPrm00";

    /**
     * Creates a new instance of GnLsUsrPrmService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public GnLsUsrPrmService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new GnLsUsrPrmInput();
        ((GnLsUsrPrmInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public GnLsUsrPrmService() {
    }

    /**
     * Calls Tuxedo service 'GnLsUsrPrm'
     *
     * @return Output value object: GnLsUsrPrmOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public GnLsUsrPrmOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new GnLsUsrPrmOutput(super.execute());
        return ((GnLsUsrPrmOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public GnLsUsrPrmInput getInput() {
        return ((GnLsUsrPrmInput) this.input);
    }
}