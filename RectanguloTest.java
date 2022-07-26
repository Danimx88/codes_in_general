public class RectanguloTest {

    public void testArea(Rectangulo rectangulo) {
        rectangulo.setAlto(5);
        rectangulo.setAncho(4);
        assert rectangulo.calcularArea() == 20;
    }
}
