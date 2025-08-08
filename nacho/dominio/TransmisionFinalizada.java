public class TransmisionFinalizada extends Transmision {
    private LocalTime horaFin;

    public TransmisionFinalizada(TransmisionEnVivo transmisionEnVivo) {
        super(transmisionEnVivo.getTitulo());
        this.setCategorias(transmisionEnVivo.getCategorias());
        this.setFechaInicio(transmisionEnVivo.getFechaInicio());
        this.setHoraInicio(transmisionEnVivo.getHoraInicio());
        this.setHoraFin(LocalTime.now());
        this.setChat(transmisionEnVivo.verMensajesChat());
        this.setMaximosEspectadores(transmisionEnVivo.getMaximosEspectadores());
    }  
    public LocalTime getHoraFin() {
        return horaFin;
    }
}