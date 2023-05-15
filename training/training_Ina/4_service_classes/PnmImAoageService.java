/**
 * PnmImAoageService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.PnmImAoageInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.PnmImAoageOutput;

/**
 * @author  Ninja
 *
 * PnmImAoageService Class.
 */
public class PnmImAoageService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "pnmImAoage00";

    /**
     * Creates a new instance of PnmImAoageService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public PnmImAoageService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new PnmImAoageInput();
        ((PnmImAoageInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public PnmImAoageService() {
    }

    /**
     * Calls Tuxedo service 'PnmImAoage'
     *
     * @return Output value object: PnmImAoageOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public PnmImAoageOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new PnmImAoageOutput(super.execute());
        return ((PnmImAoageOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public PnmImAoageInput getInput() {
        return ((PnmImAoageInput) this.input);
    }
}