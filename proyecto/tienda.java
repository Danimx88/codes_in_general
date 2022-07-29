public class Tienda {

    //.................................................

    public static double calcularPrecioFinalBaldosas(Rect baldosa, Rect habitacion, double precioUnidad) {

        double areaBaldosa = baldosa.getAlto() * baldosa.getAncho();

        double areaHabitacion = habitacion.getAlto() * habitacion.getAncho();

        double numeroDeBaldosas = Math.ceil(areaHabitacion / areaBaldosa);

        return numeroDeBaldosas * precioUnidad;

    }
}
