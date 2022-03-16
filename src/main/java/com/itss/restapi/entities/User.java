package com.itss.restapi.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "users")
public class User {

  @Id
  @Column(name = "use_cpf", columnDefinition = "character varying(14) not null")
  private String useCpf;

  @Column(
    name = "use_senha",
    nullable = false
  )
  private String useSenha;

  @Column(
    name = "use_email",
    columnDefinition = "character varying(100) not null",
    unique = true
  )
  private String useEmail;

  @Column(name = "use_plano", columnDefinition = "character varying(100)")
  private String usePlano;

  @Column(name = "use_rotina", columnDefinition = "character varying(100)")
  private String useRotina;

  @ManyToMany
  @JoinTable(
    // #region
    name = "requests",
    uniqueConstraints = @UniqueConstraint(
      columnNames = { "req_pro_id", "req_use_cpf" }
    ),
    joinColumns = @JoinColumn(name = "req_use_cpf"),
    inverseJoinColumns = @JoinColumn(name = "req_pro_id")
    // #endregion
  )
  private List<Product> products;

  // #region GETTERS/SETTERS
  public String getUseCpf() {
    return useCpf;
  }

  public void setUseCpf(String useCpf) {
    this.useCpf = useCpf;
  }

  public String getUseSenha() {
    return useSenha;
  }

  public void setUseSenha(String useSenha) {
    this.useSenha = useSenha;
  }

  public String getUseEmail() {
    return useEmail;
  }

  public void setUseEmail(String useEmail) {
    this.useEmail = useEmail;
  }

  public String getUsePlano() {
    return usePlano;
  }

  public void setUsePlano(String usePlano) {
    this.usePlano = usePlano;
  }

  public String getUseRotina() {
    return useRotina;
  }

  public void setUseRotina(String useRotina) {
    this.useRotina = useRotina;
  }
  // #endregion

}
