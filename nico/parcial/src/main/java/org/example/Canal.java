package org.example;

import org.example.exceptions.TransmisionActivaException;
import org.example.exceptions.TransmisionInactivaException;

import java.util.ArrayList;
import java.util.List;

public class Canal {
  private List<TransmisionHistorica> transmisionesPasadas;
  private TransmisionEnVivo transmisionActual;
  private List<UsuarioRegistrado> suscriptores;
  private List<MuestraDeApoyo> muestrasDeApoyo;

  public Canal() {
    this.transmisionesPasadas = new ArrayList<>();
    this.suscriptores = new ArrayList<>();
    this.muestrasDeApoyo = new ArrayList<>();

    this.transmisionActual = null;
  }

  public void iniciarTransmision(TransmisionEnVivo transmision) {
    if (transmisionActual != null) {
      throw new TransmisionActivaException(
          "Este canal ya tiene una transmisión activa: " + transmisionActual.getTitulo()
      );
    }
    // transmision.iniciar();
    this.transmisionActual = transmision;
  }

  public void finalizarTransmision() {
    if (transmisionActual == null) {
      throw new TransmisionInactivaException("No hay ninguna transmisión activa para finalizar.");
    }
    TransmisionHistorica transmisionFinalizada = transmisionActual.finalizar();

    this.transmisionesPasadas.add(transmisionFinalizada);
    transmisionActual = null;
  }

  public void suscribir(UsuarioRegistrado usuario) {
    this.suscriptores.add(usuario);
  }

  public void addMuestraDeApoyo(MuestraDeApoyo muestraDeApoyo) {
    this.muestrasDeApoyo.add(muestraDeApoyo);
  }

}
