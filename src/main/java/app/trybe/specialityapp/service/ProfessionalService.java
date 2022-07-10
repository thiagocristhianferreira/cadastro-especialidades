package app.trybe.specialityapp.service;

import app.trybe.specialityapp.commons.ApplicationError;
import app.trybe.specialityapp.model.Professional;
import app.trybe.specialityapp.repository.ProfessionalRepository;
import java.util.List;
import javax.ws.rs.core.Response;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * ProfessionalService.
 */
@Service
@Component
public class ProfessionalService {
  @Autowired
  private ProfessionalRepository repository;

  /**
   * Pega todos os registros e verifica vazio.
   */
  public List<Professional> pegaTudo() throws ApplicationError {
    if (repository.findAll().size() == 0) {
      throw new ApplicationError("Nenhum registro foi encontrado!", Response.Status.NOT_FOUND);
    }
    return repository.findAll();
  }

  /**
   * Adiciona registro e verifica ID.
   */
  public Professional adicionaRegistro(Professional professional) throws ApplicationError {
    if (professional.getId() != null) {
      throw new ApplicationError(
          "Não é permitido inserir novos registros com ID explícito.",
          Response.Status.BAD_REQUEST);
    }
    return repository.save(professional);
  }

  /**
   * Edita registro.
   */
  public Professional editaRegistro(Integer id, Professional professional) throws ApplicationError {
    if (repository.findById(id).isEmpty()) {
      throw new ApplicationError(
          "Não é possível editar, o ID informado não existe",
          Response.Status.NOT_FOUND);
    }
    return repository.save(professional);
  }

  /**
   * Deleta registro.
   */
  public void deletaRegistro(Integer id, Professional professional) throws ApplicationError {
    if (repository.findById(id).isEmpty()) {
      throw new ApplicationError(
          "Não é possível deletar, o ID informado não existe",
          Response.Status.NOT_FOUND);
    }
    repository.delete(repository.findById(id).get());
  }

}
