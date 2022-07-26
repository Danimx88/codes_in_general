import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nombre;
    private String email;
    private String contraseña;
    private List<Elemento> listaDeDeseos;

    public Usuario(String nombre, String email, String contraseña) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.listaDeDeseos = new ArrayList<>();
    }

    public void añadirElementoAListaDeDeseos(Elemento elemento) {
        listaDeDeseos.add(elemento);
    }

    public void cambiarContraseña(String nuevaContraseña) {
        this.contraseña = nuevaContraseña;
    }

    public boolean esContraseñaValida(String contraseña) {
        return false;
    }

    public String generarContraseñaAleatoria() {
        return "";
    }

    public void cambiarEmail(String nuevoEmail) {
        this.email = nuevoEmail;
    }

    public boolean esEmailValido(String email) {
        return false;
    }
}
