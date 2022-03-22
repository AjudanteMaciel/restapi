package com.itss.restapi.dto;

import java.math.BigDecimal;
import java.util.Date;

public class RequestDTO {

  private Long reqId;
  private String proName;
  private Date reqDate;
  private String reqStatus;
  private int reqQtd;
  private String proLab;
  private BigDecimal proPrice;

  public RequestDTO(
    Long reqId,
    String proName,
    Date reqDate,
    String reqStatus,
    int reqQtd,
    String proLab,
    BigDecimal proPrice
  ) {
    this.reqId = reqId;
    this.proName = proName;
    this.reqDate = reqDate;
    this.reqStatus = reqStatus;
    this.reqQtd = reqQtd;
    this.proLab = proLab;
    this.proPrice = proPrice;
  }

  //#region

  public Long getReqId() {
    return reqId;
  }

  public void setReqId(Long reqId) {
    this.reqId = reqId;
  }

  public String getProName() {
    return proName;
  }

  public void setProName(String proName) {
    this.proName = proName;
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

  public int getReqQtd() {
    return reqQtd;
  }

  public void setReqQtd(int reqQtd) {
    this.reqQtd = reqQtd;
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
  //#endregion
}
