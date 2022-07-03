package app.trybe.specialityapp.config;

import app.trybe.specialityapp.controller.ProfessionalController;
import org.glassfish.jersey.server.ResourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import javax.ws.rs.ApplicationPath;

/**
 * Configuração.
 */
@Configuration
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {
  /**
   * Construtor para o JerseyConfig.
   */
  public JerseyConfig() {
    register(ProfessionalController.class);
  }
}
