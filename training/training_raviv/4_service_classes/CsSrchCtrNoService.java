package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchCtrNoInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchCtrNoOutput;

/**
 * CsSrchCtrNoService Class.
 * @author  Ninja
 */
public class CsSrchCtrNoService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csSrchCtrNo00";

    /**
     * Creates a new instance of CsSrchCtrNoService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsSrchCtrNoService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsSrchCtrNoInput();
        ((CsSrchCtrNoInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsSrchCtrNoService() {
    }

    /**
     * Calls Tuxedo service 'CsSrchCtrNo'
     *
     * @return Output value object: CsSrchCtrNoOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsSrchCtrNoOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsSrchCtrNoOutput(super.execute());
        return ((CsSrchCtrNoOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsSrchCtrNoInput getInput() {
        return ((CsSrchCtrNoInput) this.input);
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
