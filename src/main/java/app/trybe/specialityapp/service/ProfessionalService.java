package app.trybe.specialityapp.service;

import app.trybe.specialityapp.model.Professional;
import app.trybe.specialityapp.repository.ProfessionalRepository;
import java.util.List;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
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

  public List<Professional> getAllProfessionals() {
    return repository.findAll();
  }

}
