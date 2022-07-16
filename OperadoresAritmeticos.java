/*
*@author Daniel Romero/
*15 de julio del 2022
*
*/
import javax.swing.*;

public class OperadorAritmetico {
    public static void main(String[] args) {

        int i = 5, j = 4;

        int suma = i + j;

        System.out.println("La suma es: " + suma);
        System.out.println("i + j = " + i + j);
        System.out.println(i + j + " = i + j " );
        System.out.println("i + j = " + (i + j));

        int resta = i - j;
        System.out.println("resta = " + resta);
        //System.out.println("i - j = " + i - j);  No se puede ingresar sin parentesis otro signo que no sea +
        System.out.println("i - j = " + (i - j)); //Forma correcta

        int multi = i * j;
        System.out.println("Multiplicacion = " + multi);

        int div = i / j; //Para dividir solo se puede float o double
        float div2 = (float) i / j; // el (float) ayuda a cambiar de tipo entero a float
        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);

        int resto = i % j;
        System.out.println("El resto es = " + resto);

        resto = 8 % 5;
        System.out.println("Resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        if (numero % 2 == 0){
            System.out.println("Numero par = " + numero);
        }else {
            System.out.println("Numero impar = " + numero);
        }



    }
}
