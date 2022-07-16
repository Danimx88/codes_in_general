/*
*Operadores Logicos
*
*Date 16 Jul 22
*
* @author Daniel R
*
*/
public class OperadoresLogicos {
    public static void main(String[] args) {
        int i = 3;
        int x = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        // and es igual a &&
        boolean b1 = i == j && k > l; // 3 es igual a 7 y 127e-7f es mayor a 2.1413e3, si una no se cumple será false
        System.out.println("b1 = " + b1);

        // or es igual a ||
        boolean b2 = i == j || k < l; // si al menos una se cumple con el or sera true
        System.out.println("b2 = " + b2);

        boolean b3 = i == j || k > l || m == false;
        System.out.println("b3 = " + b3);

        boolean b4 = i == j && (k > l || m == false);
        System.out.println("b4 = " + b4);

        boolean b5 = i == j || (k < l && m == false); //Prioridad por el ()
        System.out.println("b5 = " + b5);

        boolean b6 = true || true && false; //Prioridad por el ()
        System.out.println("b6 = " + b6);

        boolean b7 = (true || true) && false; //Prioridad por el ()
        System.out.println("b7 = " + b7);

        boolean b8 = ((true || true) && false) || false; //Prioridad por el ()
        System.out.println("b8 = " + b8);

        boolean b9 = true || (false && false) || false; //Prioridad por el () true
        System.out.println("b9 = " + b9);

        boolean b10 = ((true || false) && false) || false; //Prioridad por el ()
        System.out.println("b10 = " + b10);

    }
}
