/**
 * PnmImHistService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.PnmImHistInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.PnmImHistOutput;

/**
 * @author  Ninja
 *
 * PnmImHistService Class.
 */
public class PnmImHistService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "pnmImHist00";

    /**
     * Creates a new instance of PnmImHistService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public PnmImHistService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new PnmImHistInput();
        ((PnmImHistInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public PnmImHistService() {
    }

    /**
     * Calls Tuxedo service 'PnmImHist'
     *
     * @return Output value object: PnmImHistOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public PnmImHistOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new PnmImHistOutput(super.execute());
        return ((PnmImHistOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public PnmImHistInput getInput() {
        return ((PnmImHistInput) this.input);
    }
}