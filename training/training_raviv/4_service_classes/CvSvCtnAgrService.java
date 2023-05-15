package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvSvCtnAgrInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvSvCtnAgrOutput;

/**
 * CvSvCtnAgrService Class.
 * @author  Ninja
 */
public class CvSvCtnAgrService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "cvSvCtnAgr00";

    /**
     * Creates a new instance of CvSvCtnAgrService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CvSvCtnAgrService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CvSvCtnAgrInput();
        ((CvSvCtnAgrInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CvSvCtnAgrService() {
    }

    /**
     * Calls Tuxedo service 'CvSvCtnAgr'
     *
     * @return Output value object: CvSvCtnAgrOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CvSvCtnAgrOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CvSvCtnAgrOutput(super.execute());
        return ((CvSvCtnAgrOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CvSvCtnAgrInput getInput() {
        return ((CvSvCtnAgrInput) this.input);
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
