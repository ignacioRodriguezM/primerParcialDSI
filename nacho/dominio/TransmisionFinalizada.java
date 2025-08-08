public class TransmisionFinalizada extends Transmision {
    private LocalDateTime horaFin;

    public TransmisionFinalizada(TransmisionEnVivo transmisionEnVivo) {
        this.titulo = transmisionEnVivo.getTitulo();
        this.categorias = transmisionEnVivo.getCategorias();
        this.fechaInicio = transmisionEnVivo.getFechaInicio();
        this.horaInicio = transmisionEnVivo.getHoraInicio();
        this.horaFin = LocalTime.now();
        this.chat = transmisionEnVivo.verMensajesChat();
        this.maximosEspectadores = transmisionEnVivo.getMaximosEspectadores();
    }  
    public LocalTime getHoraFin() {
        return horaFin;
    }
}