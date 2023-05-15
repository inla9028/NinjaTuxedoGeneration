package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchPymInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchPymOutput;

/**
 * CsSrchPymService Class.
 * @author  Ninja
 */
public class CsSrchPymService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csSrchPym00";

    /**
     * Creates a new instance of CsSrchPymService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsSrchPymService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsSrchPymInput();
        ((CsSrchPymInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsSrchPymService() {
    }

    /**
     * Calls Tuxedo service 'CsSrchPym'
     *
     * @return Output value object: CsSrchPymOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsSrchPymOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsSrchPymOutput(super.execute());
        return ((CsSrchPymOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsSrchPymInput getInput() {
        return ((CsSrchPymInput) this.input);
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
