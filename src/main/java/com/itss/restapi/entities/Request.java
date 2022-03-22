package com.itss.restapi.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
  private int reqQtd;

  @Column(name = "req_date")
  @Temporal(TemporalType.DATE)
  @JsonFormat(pattern = "dd-mm-yyyy HH:mm:ss")
  private Date reqDate;

  @Column(
    name = "req_status",
    columnDefinition = "character varying(20) not null"
  )
  private String reqStatus;

  //#region
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

  public int getReqQtd() {
    return reqQtd;
  }

  public void setReqQtd(int reqQtd) {
    this.reqQtd = reqQtd;
  }

  public Date getReqDate() {
    return reqDate;
  }

  public void setReqDate(Date reqDate) {
    this.reqDate = reqDate;
  }

  public String getReqStatus() {
    return reqStatus;
  }

  public void setReqStatus(String reqStatus) {
    this.reqStatus = reqStatus;
  }
  //#endregion
}
