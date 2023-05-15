package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvSvBanInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CvSvBanOutput;

/**
 * CvSvBanService Class.
 * @author  Ninja
 */
public class CvSvBanService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "cvSvBan00";

    /**
     * Creates a new instance of CvSvBanService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CvSvBanService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CvSvBanInput();
        ((CvSvBanInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CvSvBanService() {
    }

    /**
     * Calls Tuxedo service 'CvSvBan'
     *
     * @return Output value object: CvSvBanOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CvSvBanOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CvSvBanOutput(super.execute());
        return ((CvSvBanOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CvSvBanInput getInput() {
        return ((CvSvBanInput) this.input);
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
