package org.example;

import java.time.LocalDateTime;

public class TransmisionHistorica extends Transmision {
  private LocalDateTime tiempoFin;

  public TransmisionHistorica(TransmisionEnVivo transmisionEnVivo) {
    this.setTitulo(transmisionEnVivo.getTitulo());
    this.setMaximoParticipantes(transmisionEnVivo.getMaximoParticipantes());
    this.setTiempoInicio(transmisionEnVivo.getTiempoInicio());

    this.setTiempoFin(LocalDateTime.now());
  }

  public LocalDateTime getTiempoFin() {
    return tiempoFin;
  }

  public void setTiempoFin(LocalDateTime tiempoFin) {
    this.tiempoFin = tiempoFin;
  }
}
