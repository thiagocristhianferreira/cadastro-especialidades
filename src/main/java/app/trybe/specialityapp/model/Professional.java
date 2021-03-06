package app.trybe.specialityapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe Professional.
 */
@Entity
@Table(name = "tbl_professional")
public class Professional {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @Column(name = "nome")
  private String nome;

  @Column(name = "especialidade")
  private String speciality;

  Professional(Integer id, String nome, String speciality) {
    this.nome = nome;
    this.speciality = speciality;
    this.id = id;
  }

  Professional() {
  }

  public Integer getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSpeciality() {
    return speciality;
  }

  public void setSpeciality(String speciality) {
    this.speciality = speciality;
  }
}
