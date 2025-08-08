package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/*
  Se podria analizar reificar el chat si tiene comportamiento añadido
 */
public class TransmisionEnVivo extends Transmision {
  private List<Categoria> categorias;
  private List<Mensaje> chat;
  private List<UsuarioRegistrado> participantes;


  public TransmisionEnVivo(String titulo) {
    this.setTitulo(titulo);
    this.setMaximoParticipantes(0);
    this.setTiempoInicio(LocalDateTime.now());

    this.categorias = new ArrayList<>();
    this.participantes = new ArrayList<>();
    this.chat = new ArrayList<>();
  }

  public TransmisionHistorica finalizar() {
    return new TransmisionHistorica(this);
  }

  public void unirA(UsuarioRegistrado participante) {
    this.participantes.add(participante);

    int cantidad = this.participantes.size();
    if(cantidad > this.getMaximoParticipantes()) {
      this.setMaximoParticipantes(cantidad);
    }
  }

  public void removerA(UsuarioRegistrado participante) {
    this.participantes.remove(participante);
  }

  public void addMensaje(Mensaje mensaje) {
    chat.add(mensaje);
  }

  public List<Mensaje> getMensajes() {
    return chat;
  }

  public void addCategoria(Categoria categorias) {
    this.categorias.add(categorias);
  }

}
