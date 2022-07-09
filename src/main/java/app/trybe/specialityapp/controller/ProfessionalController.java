package app.trybe.specialityapp.controller;

import app.trybe.specialityapp.model.Professional;
import app.trybe.specialityapp.repository.ProfessionalRepository;
import app.trybe.specialityapp.service.ProfessionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
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

  @GET
  @Path("/all")
  @Consumes("application/json")
  @Produces("application/json")
  public Response findAll() {
    if (service.getAllProfessionals().isEmpty()) {
      return Response
          .status(Response.Status.NOT_FOUND)
          .build();
    }
    return Response.status(Response.Status.OK)
        .entity(service.getAllProfessionals()).build();
  }
}
