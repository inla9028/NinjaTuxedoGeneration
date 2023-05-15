/**
 * PnmImUpdService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.PnmImUpdInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.PnmImUpdOutput;

/**
 * @author  Ninja
 *
 * PnmImUpdService Class.
 */
public class PnmImUpdService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "pnmImUpd00";

    /**
     * Creates a new instance of PnmImUpdService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public PnmImUpdService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new PnmImUpdInput();
        ((PnmImUpdInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public PnmImUpdService() {
    }

    /**
     * Calls Tuxedo service 'PnmImUpd'
     *
     * @return Output value object: PnmImUpdOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public PnmImUpdOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new PnmImUpdOutput(super.execute());
        return ((PnmImUpdOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public PnmImUpdInput getInput() {
        return ((PnmImUpdInput) this.input);
    }
}