public class SentenciaWhile {
    public static void main(String[] args) {

        Integer i = Integer.valueOf(0);
        while (i <= 5){
            System.out.println("i = " + i);
            i++;
        }

        i = 0;
        boolean prueba = true;

        while (prueba){

            if (i == 7){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        prueba = false;
        while (prueba){
            System.out.println("nunca se ejecuta");
        }
        do {
            System.out.println("Se ejecuta al menos una vez");
        }while (prueba);

        ///////////////////////////////////////////////////////////////////////777

        prueba = true;
        i = 0;

        do {
            if (i == 10){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }while (prueba);


    }
}
