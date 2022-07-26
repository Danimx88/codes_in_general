public class Rectangulo{

    private double x;
    private double y;

    private double ancho;
    private double alto;

    public Rectangulo() {

    }

    public Rectangulo(double x, double y, double ancho, double alto) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double calcularArea() {
        return alto * ancho;
    }

    public double calcularPerimetro() {
        return 2 * alto + 2 * ancho;
    }
}
