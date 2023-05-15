package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSvCrdWchInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.CsSvCrdWchOutput;

/**
 * CsSvCrdWchService Class.
 * @author  Ninja
 */
public class CsSvCrdWchService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "csSvCrdWch00";

    /**
     * Creates a new instance of CsSvCrdWchService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public CsSvCrdWchService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new CsSvCrdWchInput();
        ((CsSvCrdWchInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public CsSvCrdWchService() {
    }

    /**
     * Calls Tuxedo service 'CsSvCrdWch'
     *
     * @return Output value object: CsSvCrdWchOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public CsSvCrdWchOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new CsSvCrdWchOutput(super.execute());
        return ((CsSvCrdWchOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public CsSvCrdWchInput getInput() {
        return ((CsSvCrdWchInput) this.input);
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
