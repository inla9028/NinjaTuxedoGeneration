/**
 * ArCrMPymService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArCrMPymInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArCrMPymOutput;

/**
 * @author  Ninja
 *
 * ArCrMPymService Class.
 */
public class ArCrMPymService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "arCrMPym00";

    /**
     * Creates a new instance of ArCrMPymService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArCrMPymService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ArCrMPymInput();
        ((ArCrMPymInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ArCrMPymService() {
    }

    /**
     * Calls Tuxedo service 'ArCrMPym'
     *
     * @return Output value object: ArCrMPymOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArCrMPymOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ArCrMPymOutput(super.execute());
        return ((ArCrMPymOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArCrMPymInput getInput() {
        return ((ArCrMPymInput) this.input);
    }
}