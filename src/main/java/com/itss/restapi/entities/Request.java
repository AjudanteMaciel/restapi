package com.itss.restapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "requests")
public class Request {

  @Id
  @Column(name = "req_id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long reqId;

  @Column(name = "req_use_cpf")
  private String reqUseCpf;

  @Column(name = "req_pro_id")
  private long reqProId;

  @Column(name = "req_qtd", nullable = false)
  private int qtd;

  public long getReqId() {
    return reqId;
  }

  public void setReqId(long reqId) {
    this.reqId = reqId;
  }

  public String getReqUseCpf() {
    return reqUseCpf;
  }

  public void setReqUseCpf(String reqUseCpf) {
    this.reqUseCpf = reqUseCpf;
  }

  public long getReqProId() {
    return reqProId;
  }

  public void setReqProId(long reqProId) {
    this.reqProId = reqProId;
  }

  public int getQtd() {
    return qtd;
  }

  public void setQtd(int qtd) {
    this.qtd = qtd;
  }
}
