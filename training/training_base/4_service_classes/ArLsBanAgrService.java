/**
 * ArLsBanAgrService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArLsBanAgrInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArLsBanAgrOutput;

/**
 * @author  Ninja
 *
 * ArLsBanAgrService Class.
 */
public class ArLsBanAgrService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "arLsBanAgr00";

    /**
     * Creates a new instance of ArLsBanAgrService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArLsBanAgrService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ArLsBanAgrInput();
        ((ArLsBanAgrInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ArLsBanAgrService() {
    }

    /**
     * Calls Tuxedo service 'ArLsBanAgr'
     *
     * @return Output value object: ArLsBanAgrOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArLsBanAgrOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ArLsBanAgrOutput(super.execute());
        return ((ArLsBanAgrOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArLsBanAgrInput getInput() {
        return ((ArLsBanAgrInput) this.input);
    }
}