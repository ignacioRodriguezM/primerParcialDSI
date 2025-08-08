package org.example;

public class MuestraDeApoyo {
  private Integer valor;

  public MuestraDeApoyo(Integer valor) {
    if(valor == null || valor <= 0 || valor > 10) {
      throw new IllegalArgumentException("valor invalido");
    }
    this.valor = valor;
  }

  public Integer getValor() {
    return valor;
  }
}
