package app.trybe.specialityapp.service;

import app.trybe.specialityapp.commons.ApplicationError;
import app.trybe.specialityapp.model.Professional;
import app.trybe.specialityapp.repository.ProfessionalRepository;
import java.util.List;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextException;
import org.springframework.stereotype.Component;

import javax.validation.constraints.AssertTrue;
import javax.ws.rs.core.Response;

import static org.hibernate.validator.internal.util.Contracts.assertTrue;

/**
 * ProfessionalService.
 */
@Service
@Component
public class ProfessionalService {
  @Autowired
  private ProfessionalRepository repository;

  public List<Professional> pegaTudo() throws ApplicationError {
    if (repository.findAll().size() == 0) {
      throw new ApplicationError(404, "Nenhum registro foi encontrado!");
    }
    return repository.findAll();
  }

  public Professional adicionaRegistro (Professional professional) throws ApplicationError {
    if (professional.getId() != null) {
      throw new ApplicationError(400, "Não é permitido inserir novos registros com ID explícito.");
    }
    return repository.save(professional);
  }

}
