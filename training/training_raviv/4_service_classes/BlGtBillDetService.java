/**
 * BlGtBillDetService.java
 *
 */
package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlGtBillDetInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlGtBillDetOutput;

/**
 * @author  Ninja
 *
 * BlGtBillDetService Class.
 */
public class BlGtBillDetService extends TuxedoService {
    // Name of Tuxedo service
    private static String NAME = "blGtBillDet00";

    /**
     * Creates a new instance of BlGtBillDetService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public BlGtBillDetService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new BlGtBillDetInput();
        ((BlGtBillDetInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public BlGtBillDetService() {
    }

    /**
     * Calls Tuxedo service 'BlGtBillDet'
     *
     * @return Output value object: BlGtBillDetOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public BlGtBillDetOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new BlGtBillDetOutput(super.execute());
        return ((BlGtBillDetOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public BlGtBillDetInput getInput() {
        return ((BlGtBillDetInput) this.input);
    }
}