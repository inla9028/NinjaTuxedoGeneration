package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlGtBiPdfDataInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlGtBiPdfDataOutput;

/**
 * BlGtBiPdfDataService Class.
 * @author  Ninja
 */
public class BlGtBiPdfDataService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "blGtBiPdfData00";

    /**
     * Creates a new instance of BlGtBiPdfDataService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public BlGtBiPdfDataService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new BlGtBiPdfDataInput();
        ((BlGtBiPdfDataInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public BlGtBiPdfDataService() {
    }

    /**
     * Calls Tuxedo service 'BlGtBiPdfData'
     *
     * @return Output value object: BlGtBiPdfDataOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public BlGtBiPdfDataOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new BlGtBiPdfDataOutput(super.execute());
        return ((BlGtBiPdfDataOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public BlGtBiPdfDataInput getInput() {
        return ((BlGtBiPdfDataInput) this.input);
    }

   /**
    * @return The tuxedo service name
    */
   public String getName() {
       return getServiceName();
   }

   /**
    * @return The tuxedo service name
    */
   public static String getServiceName() {
       return NAME;
   }
}
