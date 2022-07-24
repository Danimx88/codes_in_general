public class ejemploAutomovil {
    public static void main(String[] args) {

        Automovil nissan = new Automovil();

        nissan.fabricante = "Nissan";
        nissan.modelo = "2010";
        nissan.color = "Blanco";
        nissan.kilometraje = 1203335.23;

        Automovil volvo = new Automovil();

        volvo.fabricante = "Volvo";
        volvo.modelo = "2022";
        volvo.color = "Gris";
        volvo.kilometraje = 0.0;


/*
        System.out.println("auto.fabricante =  " + nissan.fabricante);
        System.out.println("auto.fabricante =  " + nissan.modelo);
        System.out.println("auto.fabricante =  " + nissan.color);
        System.out.println("auto.fabricante =  " + nissan.kilometraje);

        System.out.println("\nauto.fabricante =  " + volvo.fabricante);
        System.out.println("auto.fabricante =  " + volvo.modelo);
        System.out.println("auto.fabricante =  " + volvo.color);
        System.out.println("auto.fabricante =  " + volvo.kilometraje);
 */

        System.out.println(nissan.detalle());
        System.out.println(volvo.detalle());

    }
}
