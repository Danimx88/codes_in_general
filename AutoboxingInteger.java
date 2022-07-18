public class AutoboxingInteger {
    public static void main(String[] args) {

        Integer[] enteros = {Integer.valueOf(1), 2, 3, 4, 5, //se muestra el primer valor de manera explicita
                6, 7, 8, 9, 10, 11, 12, 13, 14, 15}; //de manera implicita java realiza para todos los demas
        int suma = 0;

        //Explicita
        for (Integer i: enteros){

                if (i.intValue() % 2 == 0){
                    suma = suma + i.intValue();
                }
        }
        System.out.println("suma = " + suma);
        suma = 0;
        //Implicita
        for (Integer i: enteros){
            if (i % 2 == 0){
                suma += i;
            }
        }
        System.out.println("suma = " + suma);
    }
}
