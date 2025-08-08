public class TransmisionEnVivo extends Transmision {
    private List<Usuario> espectadores;

    public TransmisionEnVivo(String titulo) {
        this.titulo = titulo;
        this.categorias = new ArrayList<>();
        this.fechaInicio = LocalDateTime.now();
        this.horaInicio = LocalTime.now();
        this.maximosEspectadores = 0;
        this.chat = new ArrayList<>();
        this.espectadores = new ArrayList<>();
    }
    public TransmisionFinalizada finalizar() {
        TransmisionFinalizada transmisionFinalizada = new TransmisionFinalizada(this);
        return transmisionFinalizada;
    }
    public void unirUsuario(Usuario usuario) {
        if (usuario != null && !espectadores.contains(usuario)) {
            espectadores.add(usuario);
            this.chequearMaximosEspectadores();
        }
    }
    public void chequearMaximosEspectadores() {
        if (espectadores.size() > maximosEspectadores) {
            maximosEspectadores = espectadores.size();
        }
    }
    public void enviarMensaje(Mensaje mensaje) {
        chat.add(mensaje);
    }
   // Getters
    public List<Usuario> getEspectadoresActuales() {
        return new ArrayList<>(espectadores);
    }
    //Setters
    public void setCategorias(List<Categoria> categorias) {
        if (categorias != null) {
            this.categorias = categorias;
        }
    }
}