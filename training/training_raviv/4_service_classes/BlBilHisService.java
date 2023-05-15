package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlBilHisInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.BlBilHisOutput;

/**
 * BlBilHisService Class.
 * @author  Ninja
 */
public class BlBilHisService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "blBilHis00";

    /**
     * Creates a new instance of BlBilHisService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public BlBilHisService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new BlBilHisInput();
        ((BlBilHisInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public BlBilHisService() {
    }

    /**
     * Calls Tuxedo service 'BlBilHis'
     *
     * @return Output value object: BlBilHisOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public BlBilHisOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new BlBilHisOutput(super.execute());
        return ((BlBilHisOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public BlBilHisInput getInput() {
        return ((BlBilHisInput) this.input);
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
