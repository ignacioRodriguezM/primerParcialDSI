public class Canal {
    private List<TransmisionFinalizada> transmisionesFinalizadas;
    private TransmisionEnVivo transmisionEnVivo;
    private List<Usuario> suscriptores;
    private Int apoyo;
    private Usuario propietario;

    public Canal(Usuario propietario) {
        this.propietario = propietario;
        this.transmisionesFinalizadas = new ArrayList<>();
        this.transmisionEnVivo = null;
        this.suscriptores = new ArrayList<>();
        this.apoyo = 0;
    }

    public void suscribir(Usuario usuario) {
        if (!suscriptores.contains(usuario)) {
            suscriptores.add(usuario);
        }
    }
    public void desuscribir(Usuario usuario) {
        suscriptores.remove(usuario);
    }
    public void darApoyo(Int valorSimbolico) {
            apoyo += valorSimbolico;
    }
    public void finalizarTransmision() {
        if (transmisionEnVivo != null) {
            TransmisionFinalizada transmisionFinalizada = transmisionEnVivo.finalizar();
            this.agregarTransmisionFinalizada(transmisionFinalizada);
            transmisionEnVivo = null;
        }
    }
    public void agregarTransmisionFinalizada(TransmisionFinalizada transmisionFinalizada) {
        if (transmisionFinalizada != null) {
            transmisionesFinalizadas.add(transmisionFinalizada);
        }
    }
    public void setTransmisionEnVivo(TransmisionEnVivo transmision) {
        if (transmisionEnVivo == null) {
            transmisionEnVivo = transmision;
        }
    }
    public Usuario getPropietario() {
        return propietario;
    }
}