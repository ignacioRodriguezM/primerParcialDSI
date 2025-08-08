package org.example;

import java.time.LocalDateTime;

public class Mensaje {
  private UsuarioRegistrado usuario;
  private String texto;
  private LocalDateTime timestamp;

  public Mensaje(UsuarioRegistrado usuario, String texto) {
    this.usuario = usuario;
    this.texto = texto;
    this.timestamp = LocalDateTime.now();
  }

  public UsuarioRegistrado getUsuario() {
    return usuario;
  }

  public String getTexto() {
    return texto;
  }

  public LocalDateTime getTimestamp() {
    return timestamp;
  }
}
