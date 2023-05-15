package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchAgrNoInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchAgrNoOutput;

/**
 * CsSrchAgrNoService Class.
 * @author  Ninja
 */
public class CsSrchAgrNoService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csSrchAgrNo00";

    /**
     * Creates a new instance of CsSrchAgrNoService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsSrchAgrNoService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsSrchAgrNoInput();
        ((CsSrchAgrNoInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsSrchAgrNoService() {
    }

    /**
     * Calls Tuxedo service 'CsSrchAgrNo'
     *
     * @return Output value object: CsSrchAgrNoOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsSrchAgrNoOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsSrchAgrNoOutput(super.execute());
        return ((CsSrchAgrNoOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsSrchAgrNoInput getInput() {
        return ((CsSrchAgrNoInput) this.input);
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
