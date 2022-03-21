package com.itss.restapi.entities;

import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "products")
public class Product {

  @Id
  @Column(name = "pro_id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long proId;

  @Column(
    name = "pro_name",
    columnDefinition = "character varying(100) not null"
  )
  private String proName;

  @Column(
    name = "pro_lab",
    columnDefinition = "character varying(100) not null"
  )
  private String proLab;

  @Column(name = "pro_desc", nullable = false)
  private String proDesc;

  @Column(name = "pro_price", columnDefinition = "numeric(10,2) not null")
  private BigDecimal proPrice;

  @ManyToMany
  @JoinTable(
    //#region
    name = "requests",
    uniqueConstraints = @UniqueConstraint(
      columnNames = { "req_pro_id", "req_use_cpf" }
    ),
    joinColumns = @JoinColumn(name = "req_pro_id"),
    inverseJoinColumns = @JoinColumn(name = "req_use_cpf")
    //#endregion
  )
  private List<User> users;

  // #region GETETRS/SETTERS
  public String getProDesc() {
    return proDesc;
  }

  public void setProDesc(String proDesc) {
    this.proDesc = proDesc;
  }

  public Long getProId() {
    return proId;
  }

  public void setProId(Long proId) {
    this.proId = proId;
  }

  public String getProName() {
    return proName;
  }

  public void setProName(String proName) {
    this.proName = proName;
  }

  public String getProLab() {
    return proLab;
  }

  public void setProLab(String proLab) {
    this.proLab = proLab;
  }

  public BigDecimal getProPrice() {
    return proPrice;
  }

  public void setProPrice(BigDecimal proPrice) {
    this.proPrice = proPrice;
  }
  // #endregion

}
