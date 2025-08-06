public class Mensaje {
    private Usuario autor;
    private String contenido;
    private LocalDateTime fechaHoraEnvio;

    public Mensaje(Usuario autor, String contenido) {
        this.autor = autor;
        this.contenido = contenido;
        this.fechaHoraEnvio = LocalDateTime.now();
    }
}