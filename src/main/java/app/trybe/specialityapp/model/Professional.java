package app.trybe.specialityapp.model;

import javax.persistence.*;

/**
 * Classe Professional.
 */
@Entity
@Table(name = "tbl_professional", schema = "public")
public class Professional {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @Column(name = "nome")
  private String nome;

  @Column(name = "especialidade")
  private String speciality;

  Professional (Integer id, String nome, String speciality) {
    this.id = id;
    this.nome = nome;
    this.speciality = speciality;
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
