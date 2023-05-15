package no.netcom.ninja.core.system.tuxedo.service;

import no.netcom.ninja.core.system.tuxedo.TuxedoExecutable;
import no.netcom.ninja.core.system.tuxedo.exception.EnvironmentException;
import no.netcom.ninja.core.system.tuxedo.exception.FMLManipulationException;
import no.netcom.ninja.core.system.tuxedo.exception.ServiceCallException;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ClManIntInput;
import no.netcom.ninja.core.system.tuxedo.service.parameters.ClManIntOutput;

/**
 * ClManIntService Class.
 * @author  Ninja
 */
public class ClManIntService extends TuxedoService implements TuxedoExecutable {
    // Name of Tuxedo service
    private static String NAME = "clManInt00";

    /**
     * Creates a new instance of ClManIntService.
     *
     * @throws EnvironmentException
     * @throws FMLManipulationException
     */
    public ClManIntService(Integer operatorId) throws EnvironmentException, FMLManipulationException {
        super(operatorId, NAME);
        this.input = new ClManIntInput();
        ((ClManIntInput) this.input).set_OPERATOR_ID(operatorId);
    }

    public ClManIntService() {
    }

    /**
     * Calls Tuxedo service 'ClManInt'
     *
     * @return Output value object: ClManIntOutput
     * @throws EnvironmentException
     * @throws FMLManipulationException
     * @throws ServiceCallException
     */
    public ClManIntOutput exec() throws EnvironmentException, FMLManipulationException, ServiceCallException {
        this.output = new ClManIntOutput(super.execute());
        return ((ClManIntOutput) this.output);
    }

    /**
     * Returns a input value object for service.
     *
     * @return Input value object for service.
     */
    public ClManIntInput getInput() {
        return ((ClManIntInput) this.input);
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
