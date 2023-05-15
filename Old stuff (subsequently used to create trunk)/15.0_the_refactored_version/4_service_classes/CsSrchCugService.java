/**
 * CsSrchCugService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchCugInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchCugOutput;

/**
 * @author  Ninja
 *
 * CsSrchCugService Class.
 */
public class CsSrchCugService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csSrchCug00";

    /**
     * Creates a new instance of CsSrchCugService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsSrchCugService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsSrchCugInput();
        ((CsSrchCugInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsSrchCugService() {
    }

    /**
     * Calls Tuxedo service 'CsSrchCug'
     *
     * @return Output value object: CsSrchCugOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsSrchCugOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsSrchCugOutput(super.execute());
        return ((CsSrchCugOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsSrchCugInput getInput() {
        return ((CsSrchCugInput) this.input);
    }
}