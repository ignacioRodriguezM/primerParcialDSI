package org.example;

import java.time.LocalDateTime;

public abstract class Transmision {
  private String titulo;
  private Integer maximoParticipantes;
  private LocalDateTime tiempoInicio;

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public LocalDateTime getTiempoInicio() {
    return tiempoInicio;
  }

  public void setTiempoInicio(LocalDateTime tiempoInicio) {
    this.tiempoInicio = tiempoInicio;
  }

  public Integer getMaximoParticipantes() {
    return maximoParticipantes;
  }

  public void setMaximoParticipantes(Integer maximoParticipantes) {
    this.maximoParticipantes = maximoParticipantes;
  }

}
