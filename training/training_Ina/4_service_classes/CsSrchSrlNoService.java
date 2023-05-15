/**
 * CsSrchSrlNoService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchSrlNoInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchSrlNoOutput;

/**
 * @author  Ninja
 *
 * CsSrchSrlNoService Class.
 */
public class CsSrchSrlNoService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csSrchSrlNo00";

    /**
     * Creates a new instance of CsSrchSrlNoService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsSrchSrlNoService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsSrchSrlNoInput();
        ((CsSrchSrlNoInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsSrchSrlNoService() {
    }

    /**
     * Calls Tuxedo service 'CsSrchSrlNo'
     *
     * @return Output value object: CsSrchSrlNoOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsSrchSrlNoOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsSrchSrlNoOutput(super.execute());
        return ((CsSrchSrlNoOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsSrchSrlNoInput getInput() {
        return ((CsSrchSrlNoInput) this.input);
    }
}