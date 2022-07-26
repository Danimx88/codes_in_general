public class Rectangulo {

    private double x;
    private double y;

    private double ancho;
    private double alto;

    public Rectangulo(double x, double y, double ancho, double alto) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
    }

    public double calcularAreaRectangulo() {

        return alto * ancho;
    }

    public double calcularPerimetroRectángulo() {
        return 2 * alto + 2 * ancho;
    }
}
