/**
 * ArLsBanFtrService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArLsBanFtrInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ArLsBanFtrOutput;

/**
 * @author  Ninja
 *
 * ArLsBanFtrService Class.
 */
public class ArLsBanFtrService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "arLsBanFtr00";

    /**
     * Creates a new instance of ArLsBanFtrService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ArLsBanFtrService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ArLsBanFtrInput();
        ((ArLsBanFtrInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ArLsBanFtrService() {
    }

    /**
     * Calls Tuxedo service 'ArLsBanFtr'
     *
     * @return Output value object: ArLsBanFtrOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ArLsBanFtrOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ArLsBanFtrOutput(super.execute());
        return ((ArLsBanFtrOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ArLsBanFtrInput getInput() {
        return ((ArLsBanFtrInput) this.input);
    }
}