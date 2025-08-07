//primer requerimiento
#Usuario >> new Usuario()

#Usuario >> new Canal(Usuario usuarioDueñoDelCanal)
//chequear el primer requerimiento

//segundo requerimiento
#Canal >> iniciarTransmision(transmision)
if(streamEnCurso == null) { //no puede haber + de 1 por canal
streamEnCurso = transmision;
}

#Canal >> finalizarTransmision()
if(streamEnCurso != null) {
transmisionesPasadas.agregarTransmisionHistorica(streamEnCurso);
streamEnCurso = null;
}

//tercer requerimiento
#TransmisionesPasadas >> listarTransmisionesHistoricas()
    return this.transmisionesPasadas;
//falta transmisiones en curso y listar canales (posible repo)
#RepositorioCanales >> listarCanales()
    return this.canales;
#RepositorioCanales >> listarTransmisionesEnCurso()
    return canales.stream()
        .filter(canal -> canal.streamEnCurso != null)
        .map(canal -> canal.streamEnCurso)
        .collect(Collectors.toList());

//cuarto requerimiento
#Suscriptores >> agregarSuscriptor(Usuario usuario)
    this.suscriptores.add(usuario);

#Canal >> darMuestraDeApoyoAnonima(Int valorSimbolico)
        this.apoyoDelPublico += valorSimbolico;

//quinto requerimiento
#Audiencia >> unirUsuario(Usuario usuario)
    audiencia.viewers.add(usuario);
    audiencia.checkearValorMaximoViewers();

//sexto requerimiento
#Chat >> enviarMensaje(Mensaje mensaje)
        chat.mensajes.add(mensaje)

#Chat >> verMensajes()
    return chat.mensajes