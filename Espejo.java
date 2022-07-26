public class Espejo {

    private static final double PRECIO_M2_MATERIAL_ESPEJO = 721;
    private TipoDeEspejo tipo;
    private Rectangulo rectangulo;
    private Circulo circulo;

    private Material materialMarco;

    private Espejo(TipoDeEspejo tipo, Rectangulo rectangulo, Circulo circulo, Material materialMarco) {
        this.tipo = tipo;
        this.rectangulo = rectangulo;
        this.circulo = circulo;
        this.materialMarco = materialMarco;
    }

    public static Espejo crearEspejoRedondo(Circulo circulo, Material materialMarco) {
        return new Espejo(TipoDeEspejo.REDONDO, null, circulo, materialMarco);
    }

    public static Espejo crearEspejoRectangular(Rectangulo rectangulo, Material materialMarco) {
        return new Espejo(TipoDeEspejo.RECTANGULAR, rectangulo, null, materialMarco);
    }

    public double calcularPrecioEspejo() {
        return calcularPrecioMarco() + calcularPrecioInterior();

    }

    private double calcularPrecioMarco() {

        double perimetro = 0.0;
        switch (tipo) {
            case REDONDO:
                perimetro = circulo.calcularPerimetroCirculo();
                break;
            case RECTANGULAR:
                perimetro = rectangulo.calcularPerimetroRectángulo();
                break;
        }

        return perimetro * materialMarco.obtenerPrecioLineal();
    }

    private double calcularPrecioInterior() {
        double area = 0.0;

        switch (tipo) {
            case REDONDO:
                area = circulo.calcularAreaCirculo();
                break;
            case RECTANGULAR:
                area = rectangulo.calcularAreaRectangulo();
                break;
        }

        return area * PRECIO_M2_MATERIAL_ESPEJO;
    }


}
