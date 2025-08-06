public class UsuarioRegistrado implements Usuario {
    private String nombreUsuario;
    private List<Canal> suscripciones;
    private List<Mensaje> mensajesEnviados;
    private Canal canalActual;

    public UsuarioRegistrado(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.suscripciones = new ArrayList<>();
        this.mensajesEnviados = new ArrayList<>();
        this.canalActual = null;
    }

    public void enviarMensaje(Transmision stream, String contenido) {
        if (stream != null && contenido != null && !contenido.isEmpty()) {
            
            Mensaje mensaje = new Mensaje(this, contenido);
            
            stream.enviarMensaje(mensaje);

            mensajesEnviados.add(mensaje);
        }
    }
    public void suscribirseACanal(Canal canal) {
        if (canal != null) {
            suscripciones.add(canal);
            canal.agregarSuscriptor(this);
        }
    }
    public void unirseATransmision(Transmision transmision) {
        if (transmision != null) {
            transmision.unirse(this);
        }
    }
    public crearCanal() {
        canalActual = new Canal(nombreUsuario);
    }
    public void iniciarTransmision(Transmision transmision) {
        if (canalActual != null) {
            canalActual.iniciarTransmision();
        }
    }
    public void finalizarTransmision() {
        if (canalActual != null) {
            canalActual.finalizarTransmision();
        }
    }
}