public class Moneda {
    private int valor;
    private String nombre;

    public Moneda(int valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Moneda{" +
                "valor=" + valor +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
