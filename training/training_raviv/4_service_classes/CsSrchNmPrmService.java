package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchNmPrmInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSrchNmPrmOutput;

/**
 * CsSrchNmPrmService Class.
 * @author  Ninja
 */
public class CsSrchNmPrmService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csSrchNmPrm00";

    /**
     * Creates a new instance of CsSrchNmPrmService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsSrchNmPrmService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsSrchNmPrmInput();
        ((CsSrchNmPrmInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsSrchNmPrmService() {
    }

    /**
     * Calls Tuxedo service 'CsSrchNmPrm'
     *
     * @return Output value object: CsSrchNmPrmOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsSrchNmPrmOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsSrchNmPrmOutput(super.execute());
        return ((CsSrchNmPrmOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsSrchNmPrmInput getInput() {
        return ((CsSrchNmPrmInput) this.input);
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
