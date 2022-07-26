public class Material {

    private Double precioMetroCuadrado;
    private Double precioLineal;

    public Material(Double precioMetroCuadrado) {
        this.precioMetroCuadrado = precioMetroCuadrado;
    }

    public Double obtenerPrecioMetroCuadrado() {
        return precioMetroCuadrado;
    }
    public Double obtenerPrecioLineal() {
        return precioLineal;
    }
}
