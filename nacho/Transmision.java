public Transmision {
    private String titulo;
    private Categoria categoria;
    private List<Usuario> espectadoresHistoricos;
    private Canal canal;
    private boolean enVivo;
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;
    private Integer maximosViewers;
    private List<Usuario> espectadoresActuales;
    private List<Mensaje> chat;

    public Transmision (String titulo, Categoria categoria, Canal canal) {
    this.titulo = titulo;
    this.categoria = categoria;
    this.canal = canal;
    this.enVivo = true;
    this.fechaHoraInicio = LocalDateTime.now();
    this.fechaHoraFin = null;
    this.maximosViewers = 0;
    this.espectadoresActuales = new ArrayList<>();
    this.chat = new ArrayList<>();
    this.espectadoresHistoricos = new ArrayList<>();
}
}
