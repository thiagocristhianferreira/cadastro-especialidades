package app.trybe.specialityapp.config;

import app.trybe.specialityapp.SpecialityAppApplication;
import org.glassfish.jersey.internal.inject.AbstractBinder;
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
  private Logger logger = LoggerFactory.getLogger(JerseyConfig.class);
  /**
   * Construtor para o JerseyConfig.
   */
  public JerseyConfig() {
    packages(SpecialityAppApplication.class.getPackageName());
    register(new AbstractBinder() {
      @Override
      protected void configure() {
        logger.info("Configurando binder");
      }}
    );
  }
}
