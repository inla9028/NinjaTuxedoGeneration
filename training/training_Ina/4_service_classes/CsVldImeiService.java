/**
 * CsVldImeiService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsVldImeiInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsVldImeiOutput;

/**
 * @author  Ninja
 *
 * CsVldImeiService Class.
 */
public class CsVldImeiService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "csVldImei00";

    /**
     * Creates a new instance of CsVldImeiService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsVldImeiService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsVldImeiInput();
        ((CsVldImeiInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsVldImeiService() {
    }

    /**
     * Calls Tuxedo service 'CsVldImei'
     *
     * @return Output value object: CsVldImeiOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsVldImeiOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsVldImeiOutput(super.execute());
        return ((CsVldImeiOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsVldImeiInput getInput() {
        return ((CsVldImeiInput) this.input);
    }
}