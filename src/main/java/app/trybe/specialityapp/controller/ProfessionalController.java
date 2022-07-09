package app.trybe.specialityapp.controller;

import app.trybe.specialityapp.commons.ApplicationError;
import app.trybe.specialityapp.model.Professional;
import app.trybe.specialityapp.service.ProfessionalService;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Classe ProfessionalController.
 */
@Controller
@Component
@Path("/professional")
public class ProfessionalController {
  @Autowired
  private ProfessionalService service;

  /**
   * Pega todos os registros.
   */
  @GET
  @Path("/all")
  @Consumes("application/json")
  @Produces("application/json")
  public Response pegaTodosRegistros() {
    try {
      return Response
          .status(Response.Status.OK)
          .entity(service.pegaTudo())
          .build();
    } catch (ApplicationError e) {
      return Response
          .status(e.getStatus())
          .entity(e.getMessage())
          .build();
    }
  }

  /**
   * Cadastra registros.
   */
  @POST
  @Path("/add")
  @Consumes("application/json")
  @Produces("application/json")
  public Response cadastra(@Valid @RequestBody Professional professional) {
    try {
      service.adicionaRegistro(professional);
      return Response
          .status(Response.Status.CREATED)
          .entity("Inserido")
          .build();
    } catch (ApplicationError e) {
      return Response
          .status(e.getStatus())
          .entity(e.getMessage())
          .build();
    }
  }

}
