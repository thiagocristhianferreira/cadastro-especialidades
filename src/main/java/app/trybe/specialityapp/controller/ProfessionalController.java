package app.trybe.specialityapp.controller;

import app.trybe.specialityapp.commons.ApplicationError;
import app.trybe.specialityapp.model.Professional;
import app.trybe.specialityapp.service.ProfessionalService;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
          .entity(new ApplicationError(e.getMessage(), e.getStatus()))
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
  public Response cadastra(@RequestBody Professional professional) {
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

  /**
   * Edita registro.
   */
  @PUT
  @Path("/edit/{id}")
  @Consumes("application/json")
  @Produces("application/json")
  public Response edita(@PathParam("id") Integer id, Professional professional) {
    try {
      service.editaRegistro(id, professional);
      return Response
          .status(Response.Status.OK)
          .entity("ID [" + id + "] atualizado")
          .build();
    } catch (ApplicationError e) {
      return Response
          .status(e.getStatus())
          .entity(e.getMessage())
          .build();
    }
  }

  /**
   * Deleta registro.
   */
  @DELETE
  @Path("/delete/{id}")
  @Consumes("application/json")
  @Produces("application/json")
  public Response deleta(@PathParam("id") Integer id, Professional professional) {
    try {
      service.deletaRegistro(id, professional);
      return Response
          .status(Response.Status.OK)
          .entity("ID [" + id + "] removido")
          .build();
    } catch (ApplicationError e) {
      return Response
          .status(e.getStatus())
          .entity(e.getMessage())
          .build();
    }
  }

}
