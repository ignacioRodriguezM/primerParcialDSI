public abstract class Transmision {
    private String titulo;
    private List<Categoria> categorias;
    private LocalDateTime fechaInicio;
    private Time horaInicio;
    private List<Mensaje> chat;
    private Int maximosEspectadores;

    public Transmision(String titulo) {
        this.titulo = titulo;
        this.categorias = new ArrayList<>();
        this.fechaInicio = LocalDateTime.now();
        this.horaInicio = Time.valueOf(LocalTime.now());
        this.chat = new ArrayList<>();
        this.maximosEspectadores = 0;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }
    public LocalTime getHoraInicio() {
        return horaInicio.toLocalTime();
    }
    public List<Categoria> getCategorias() {
        return new ArrayList<>(categorias);
    }
    public Int getMaximosEspectadores() {
        return maximosEspectadores;
    }
    public String getTitulo() {
        return titulo;
    }
    public List<Mensaje> getChat() {
        return new ArrayList<>(chat);
    }
}