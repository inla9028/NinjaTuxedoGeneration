package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvSideEffectInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvSideEffectOutput;

/**
 * CvSideEffectService Class.
 * @author  Ninja
 */
public class CvSideEffectService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "cvSideEffect00";

    /**
     * Creates a new instance of CvSideEffectService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CvSideEffectService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CvSideEffectInput();
        ((CvSideEffectInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CvSideEffectService() {
    }

    /**
     * Calls Tuxedo service 'CvSideEffect'
     *
     * @return Output value object: CvSideEffectOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CvSideEffectOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CvSideEffectOutput(super.execute());
        return ((CvSideEffectOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CvSideEffectInput getInput() {
        return ((CvSideEffectInput) this.input);
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
