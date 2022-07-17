import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {

        int  max = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese primer numero: ");
        int num1 = s.nextInt();

        System.out.print("Ingrese segundo numero: ");
        int num2 = s.nextInt();

        System.out.print("Ingrese tercer numero: ");
        int num3 = s.nextInt();

        System.out.print("Ingrese cuarto numero: ");
        int num4 = s.nextInt();

        max = (num1 > num2)? num1: num2; //si num1 es mayor a numero 2, retorna numero 1 sino : retorna numero 2
        max = (max > num3)? max: num3; //si max es mayor a numero 3, retorna max sino : retorna numero 3
        max = (max > num4)? max: num4;

        System.out.println("num1 =  " + num1);
        System.out.println("num1 =  " + num2);
        System.out.println("num1 =  " + num3);
        System.out.println("num1 =  " + num4);
        System.out.println("El numero mayor es: " + max);




    }
}
