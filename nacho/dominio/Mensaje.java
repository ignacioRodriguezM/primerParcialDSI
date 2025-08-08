public class Mensaje {
    private Usuario sender;
    private String contenido;
    private LocalDateTime fechaEnvio;

    public Mensaje(Usuario sender, String contenido) {
        this.sender = sender;
        this.contenido = contenido;
        this.fechaEnvio = LocalDateTime.now();
    }
    public Usuario getSender() {
        return sender;
    }
    public String getContenido() {
        return contenido;
    }
    public LocalDateTime getFechaEnvio() {
        return fechaEnvio;
    }
}