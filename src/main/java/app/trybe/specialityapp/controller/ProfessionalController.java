package app.trybe.specialityapp.controller;

import app.trybe.specialityapp.model.Professional;
import app.trybe.specialityapp.service.ProfessionalService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;

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
   * findAll.
   */
  @GET
  @Path("/all")
  @Consumes("application/json")
  @Produces("application/json")
  public Response findAll() {
    try {
      // service.getAllProfessionals().get(0);
      return Response
          .status(Response.Status.OK)
          .entity(service.getAllProfessionals())
          .build();
    } catch (IndexOutOfBoundsException e) {
      return Response
          .status(Response.Status.NOT_FOUND)
          .entity("Nenhum registro foi encontrado!")
          .build();
    }
  }
}
