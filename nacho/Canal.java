public class Canal {
    private List<Usuario> suscriptores;
    private boolean estaEnVivo;
    private List<Transmision> transmisionesPasadas;
    private Usuario dueñoDelCanal;
    private Transmision transmisionActual;

    public Canal(Usuario dueñoDelCanal) {
    this.dueñoDelCanal = dueñoDelCanal;
    this.suscriptores = new ArrayList<>();
    this.transmisionesPasadas = new ArrayList<>();
    this.estaEnVivo = false;   
    this.transmisionActual = null;
}
    public void agregarSuscriptor(Usuario usuario) {
        if (usuario != null && !suscriptores.contains(usuario)) {
            suscriptores.add(usuario);
        }
    }

    public void iniciarTransmision(Transmision transmision) {
        if (!estaEnVivo) {
            transmisionActual = transmision;
            estaEnVivo = true;
        }
    }

    public void finalizarTransmision() {
        if (estaEnVivo && transmisionActual != null) {
            transmisionesPasadas.add(transmisionActual);
            transmisionActual = null;
            estaEnVivo = false;
        }        
}
}