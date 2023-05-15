package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchSplTelInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchSplTelOutput;

/**
 * CsSrchSplTelService Class.
 * @author  Ninja
 */
public class CsSrchSplTelService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csSrchSplTel00";

    /**
     * Creates a new instance of CsSrchSplTelService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsSrchSplTelService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsSrchSplTelInput();
        ((CsSrchSplTelInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsSrchSplTelService() {
    }

    /**
     * Calls Tuxedo service 'CsSrchSplTel'
     *
     * @return Output value object: CsSrchSplTelOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsSrchSplTelOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsSrchSplTelOutput(super.execute());
        return ((CsSrchSplTelOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsSrchSplTelInput getInput() {
        return ((CsSrchSplTelInput) this.input);
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
