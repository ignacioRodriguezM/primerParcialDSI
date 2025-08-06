#Usuario >> new Usuario()

#Usuario >> crearCanal()
    new Canal()

#Canal >> iniciarTransmision(transmision)
if(canal.getStreamEnCurso() == null) {
canal.setStreamEnCurso(transmision)
}

#Canal >> finalizarTransmision(transmision)
canal.setStreamEnCurso(null)
canal.agregarTransmisionHistorica(transmision)


#Canal >> agregarSuscriptor(Usuario usuario)
    this.suscriptores.add(usuario);

#Canal >> darMuestraDeApoyo(Int valorSimbolico)
        this.apoyoDelPublico += valorSimbolico;


#Transmision >> unirUsuario(Usuario usuario)
    transmision.viewers.add(usuario);
    transmision.checkearValorMaximoViewers();


#Transmision >> enviarMensaje(Mensaje mensaje)
    transmision.mensajes.add(mensaje)

#Transmision >> verMensajes()
    return transmision.mensajes