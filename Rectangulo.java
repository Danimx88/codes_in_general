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

    public double calcularArea(){
        return alto * ancho;
    }

    public void dibujar(){

    }
}
