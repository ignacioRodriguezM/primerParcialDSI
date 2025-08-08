package org.example;

public class UsuarioRegistrado {
  private String username;
  private Canal canal;

  public UsuarioRegistrado(String username) {
    this.username = username;
    this.canal = null;
  }

  public String getUsername() {
    return username;
  }

  public Canal getCanal() {
    return canal;
  }

  public void setCanal(Canal canal) {
    this.canal = canal;
  }
}
