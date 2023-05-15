/**
 * MmLsBanFuService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.MmLsBanFuInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.MmLsBanFuOutput;

/**
 * @author  Ninja
 *
 * MmLsBanFuService Class.
 */
public class MmLsBanFuService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "mmLsBanFu00";

    /**
     * Creates a new instance of MmLsBanFuService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public MmLsBanFuService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new MmLsBanFuInput();
        ((MmLsBanFuInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public MmLsBanFuService() {
    }

    /**
     * Calls Tuxedo service 'MmLsBanFu'
     *
     * @return Output value object: MmLsBanFuOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public MmLsBanFuOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new MmLsBanFuOutput(super.execute());
        return ((MmLsBanFuOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public MmLsBanFuInput getInput() {
        return ((MmLsBanFuInput) this.input);
    }
}