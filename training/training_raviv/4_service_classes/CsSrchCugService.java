package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchCugInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchCugOutput;

/**
 * CsSrchCugService Class.
 * @author  Ninja
 */
public class CsSrchCugService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csSrchCug00";

    /**
     * Creates a new instance of CsSrchCugService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsSrchCugService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsSrchCugInput();
        ((CsSrchCugInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsSrchCugService() {
    }

    /**
     * Calls Tuxedo service 'CsSrchCug'
     *
     * @return Output value object: CsSrchCugOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsSrchCugOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsSrchCugOutput(super.execute());
        return ((CsSrchCugOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsSrchCugInput getInput() {
        return ((CsSrchCugInput) this.input);
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
