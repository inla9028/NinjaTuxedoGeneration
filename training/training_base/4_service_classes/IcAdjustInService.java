/**
 * IcAdjustInService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.IcAdjustInInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.IcAdjustInOutput;

/**
 * @author  Ninja
 *
 * IcAdjustInService Class.
 */
public class IcAdjustInService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "icAdjustIn00";

    /**
     * Creates a new instance of IcAdjustInService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public IcAdjustInService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new IcAdjustInInput();
        ((IcAdjustInInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public IcAdjustInService() {
    }

    /**
     * Calls Tuxedo service 'IcAdjustIn'
     *
     * @return Output value object: IcAdjustInOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public IcAdjustInOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new IcAdjustInOutput(super.execute());
        return ((IcAdjustInOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public IcAdjustInInput getInput() {
        return ((IcAdjustInInput) this.input);
    }
}