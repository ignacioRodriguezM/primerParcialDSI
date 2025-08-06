//1
#PersonaInternauta >> UsuarioRegistrado = new Usuario()
canal = new Canal()
UsuarioRegistrado.setCanal(canal)

//2
#PersonaAdministradora >> transmision = new Transmision(titulo, categoria)

canal.iniciarTransmision(transmision)
if(canal.getStreamEnCurso() == null) {
canal.setStreamEnCurso(transmision)
}

canal.finalizarTransmision(transmision)
canal.setStreamEnCurso(null)
canal.agregarTransmisionHistorica(transmision)

//3

//4
#UsuarioRegistrado >> canal.agregarSuscriptor(Usuario usuario)
    this.suscriptores.add(usuario);

#UsuarioRegistrado >> canal.darMuestraDeApoyo(Int valorSimbolico)
        this.apoyoDelPublico += valorSimbolico;

//5
#UsuarioRegistrado >> transmision.unirUsuario(Usuario usuario)
    transmision.viewers.add(usuario);
    transmision.checkearValorMaximoViewers();

//6
#ParticipanteStream >> transmision.enviarMensaje(Mensaje mensaje)
    transmision.mensajes.add(mensaje)

#ParticipanteStream >> transmision.verMensajes()
    return transmision.mensajes