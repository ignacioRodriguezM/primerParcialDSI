--1
#UsuarioInternauta >> registrarme(String nombreUsuario) {
UsuarioRegistrado usuario = new UsuarioRegistrado(nombreUsuario);
}
#UsuarioRegistrado >> crearCanal(String nombreCanal) {
if(canal == null) { //si no tiene un canal ya creado
canal = new Canal(nombreCanal);
}
}

--2
#UsuarioRegistrado >> iniciarTransmision(Transmision transmision) {
if (canal != null) {
    canal.manejarInicio(transmision,categorias);   
}
}
#Canal >> manejarInicio(Transmision transmision) {
    this.setStreamEnCurso(transmision);
    this.setEstaEnVivo(true);
}
#Canal >> setStreamEnCurso(Transmision transmision) {
    this.streamEnCurso = transmision;
}
#Canal >> setEstaEnVivo(Boolean estado) {
    this.estaEnVivo = estado;
}
#UsuarioRegistrado >> finalizarTransmision() {
if (canal != null) {
    canal.manejarFinTransmision();
}
}
#Canal >> manejarFinTransmision() {
    if (this.getStreamEnCurso() != null) {
        this.streamEnCurso.manejarFin();
        this.setStreamEnCurso(null);
        this.setEstaEnVivo(false);
    }
}

--3
#UsuarioInternauta >> listarCanales() {
    repositorioCanales.listarCanales();
}
#UsuarioInternauta >> listarTransmisionesEnCurso() {
    repositorioTransmisiones.listarTransmisionesEnCurso();
}
#UsuarioInternauta >> listarTransmisionesHistoricas(Canal canal) {
    canal.listarTransmisionesHistoricas();
}

#RepositorioCanales >> listarCanales() {
    return canales.stream()
        .map(Canal::getNombre)
        .collect(Collectors.toList());
}
#RepositorioTransmisiones >> listarTransmisionesEnCurso() {
    return canales.stream()
        .flatMap(canal -> canal.getTransmisionEnCurso().stream())
        .collect(Collectors.toList());
}
#Canal >> listarTransmisionesHistoricas() {
    return this.transmisionesHistoricas.stream()
        .collect(Collectors.toList());
}

--4
#UsuarioRegistrado >> suscribirseACanal(Canal canal) {
if (canal != null) {
    suscripciones.add(canal);
    canal.manejarSuscriptor(this);
}
}
#UsuarioRegistrado >> darMuestraDeApoyo(Canal canal, Int valorSimbolico) {
if (canal != null && valorSimbolico > 0) {
    canal.manejarMuestraDeApoyo(valorSimbolico);
}
}
#Canal >> manejarSuscriptor(UsuarioRegistrado usuario) {
    this.suscriptores.add(usuario);
}
#Canal >> manejarMuestraDeApoyo(Int valorSimbolico) {
    this.apoyosRecibidos += valorSimbolico;
}

--5
#UsuarioRegistrado >> unirseATransmision(Transmision transmision) {
if (transmision != null) {
    transmision.manejarViewer(this);
}
}
#Transmision >> manejarViewer(UsuarioRegistrado usuario) {
    this.viewers.add(usuario);
    this.cantidadViewers++;
    this.checkearValorMaximosViewers();
}

--6
#UsuarioRegistrado >> enviarMensaje(Transmision transmision, Mensaje mensaje) {
    if (transmision != null && mensaje != null) {
        transmision.manejarMensaje(mensaje);
        mensajesEnviados.add(mensaje);
    }
}
#Transmision >> manejarMensaje(UsuarioRegistrado usuario, Mensaje mensaje) {
    if (usuario != null && mensaje != null) {
        this.mensajes.add(mensaje);
    }
}
#UsuarioRegistrado >> verMensajesDelChat(Transmision transmision) {
    if (transmision != null) {
        return transmision.getMensajes();
    }
}