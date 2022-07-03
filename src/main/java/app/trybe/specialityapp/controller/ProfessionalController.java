package app.trybe.specialityapp.controller;

import app.trybe.specialityapp.model.Professional;
import app.trybe.specialityapp.repository.ProfessionalRepository;
import app.trybe.specialityapp.service.ProfessionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe ProfessionalController.
 */
@RestController
@RequestMapping("/api/professional")
public class ProfessionalController {
  @Autowired
  private ProfessionalService service;

  @GetMapping("/all")
  public ResponseEntity<List<Professional>> getAllProfessionals() {
    List<Professional> p = service.getAllProfessionals();
    return ResponseEntity.ok().body(p);
  }
}
