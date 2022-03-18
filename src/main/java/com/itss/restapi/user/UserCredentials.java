package com.itss.restapi.user;

public class UserCredentials {

  private String cpf;
  private String password;

  //#region

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
  //#endregion
}
