package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchAdNmInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchAdNmOutput;

/**
 * CsSrchAdNmService Class.
 * @author  Ninja
 */
public class CsSrchAdNmService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csSrchAdNm00";

    /**
     * Creates a new instance of CsSrchAdNmService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsSrchAdNmService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsSrchAdNmInput();
        ((CsSrchAdNmInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsSrchAdNmService() {
    }

    /**
     * Calls Tuxedo service 'CsSrchAdNm'
     *
     * @return Output value object: CsSrchAdNmOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsSrchAdNmOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsSrchAdNmOutput(super.execute());
        return ((CsSrchAdNmOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsSrchAdNmInput getInput() {
        return ((CsSrchAdNmInput) this.input);
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
