package app.trybe.specialityapp.service;

import app.trybe.specialityapp.model.Professional;
import app.trybe.specialityapp.repository.ProfessionalRepository;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ProfessionalService {
  @Autowired
  private ProfessionalRepository repository;

  public List<Professional> getAllProfessionals() {
    return repository.findAll();
  }
}
