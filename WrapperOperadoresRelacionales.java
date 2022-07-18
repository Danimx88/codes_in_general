public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        Integer number1 = Integer.valueOf(1000);
        Integer number2 = number1;

        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);

        System.out.println("Son el mismo objeto? " + (number1 == number2));

        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        number2 = 1000;

        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);

        System.out.println("Son el mismo objeto? " + (number1 == number2)); //Compara por su objeto no por su valor, ve la instancia

        System.out.println("Tienen el mimsmo valor = " + (number1.equals(number2))); //con equals compara por el valor por ello true
        System.out.println("Tienen el mimsmo valor = " + (number1.intValue() == number2.intValue()));
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
            //hasta 127 java compara por valor
                Integer number3 = Integer.valueOf(127);
                Integer  number4 = 127;
        System.out.println("Son el mismo objeto? " + (number3 == number4));
        System.out.println("Tienen el mimsmo valor? = " + (number3.equals(number4)));
        System.out.println("Tienen el mimsmo valor? = " + (number3.intValue() == number4.intValue()));

        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");

        boolean condition = number1 > number2;
        System.out.println("number 1 is > to number2? = " + condition); //iguales en valor pero no en instancia
        number2 = 500;
        boolean condition0 = number1 > number2;
        System.out.println("number 1(1000) is > to number2(500)? = " + condition0);




    }
}
