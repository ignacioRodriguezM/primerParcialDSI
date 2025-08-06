public class Internauta implements Usuario {

    public Internauta() {}

    public void registrarse(String nombreUsuario) {
        UsuarioRegistrado nuevoUsuario = new UsuarioRegistrado(nombreUsuario);
    }
}