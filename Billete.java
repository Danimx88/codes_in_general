public class Billete {
    private int valor;
    private String nombre;

    public Billete(int valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Billete{" +
                "valor=" + valor +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
