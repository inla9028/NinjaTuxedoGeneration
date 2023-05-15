/**
 * PnmImLoadService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.PnmImLoadInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.PnmImLoadOutput;

/**
 * @author  Ninja
 *
 * PnmImLoadService Class.
 */
public class PnmImLoadService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "pnmImLoad00";

    /**
     * Creates a new instance of PnmImLoadService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public PnmImLoadService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new PnmImLoadInput();
        ((PnmImLoadInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public PnmImLoadService() {
    }

    /**
     * Calls Tuxedo service 'PnmImLoad'
     *
     * @return Output value object: PnmImLoadOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public PnmImLoadOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new PnmImLoadOutput(super.execute());
        return ((PnmImLoadOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public PnmImLoadInput getInput() {
        return ((PnmImLoadInput) this.input);
    }
}