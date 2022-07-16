import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        //variable = condicion ? si es verdadero: si es falso;
        String variable = 7 == 7? "Si es verdadero" : "Si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        estado = promedio >= 5.49 ? "Aprobado" : "Rechazado";
        System.out.println("estado = " + estado);

        estado = promedio <= 5.49 ? "Aprobado" : "Rechazado";
        System.out.println("estado = " + estado);

        if (promedio >= 5.49){
            estado = "Aprobado";
            System.out.println("estado con if = " + estado);
        }else {
            estado = "Rechazado";
            System.out.println("estado con if = " + estado);
        }

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la nota de matematicas entre 2.0 - 7.0: ");
        matematicas = scanner.nextDouble();
        System.out.print("Ingrese la nota de ciencias entre 2.0 - 7.0: ");
        ciencias = scanner.nextDouble();
        System.out.print("Ingrese la nota de historia entre 2.0 - 7.0: ");
        historia = scanner.nextDouble();
        promedio = (matematicas + ciencias + historia) / 3;
        estado = promedio >= 5.01 ? "Aprobado" : "Reprobado";
        System.out.println("El promedio general es: " + promedio + " " + estado);

    }
}
