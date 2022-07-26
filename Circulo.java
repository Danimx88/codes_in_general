public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularAreaCirculo() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetroCirculo() {
        return 2 * Math.PI * radio;
    }
}
