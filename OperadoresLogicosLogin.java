import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String username = "Daniel";
        String password = "12345";
        String username0 = "Omar";
        String password0 = "13579";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el username: ");
        String u = scanner.next();

        System.out.print("Ingrese el password: ");
        String p = scanner.next();

        boolean esAutenticado = false;

        if ((username.equals(u) && password.equals(p)) ||  //se equal ya que son cadenas y no tipo primitivo, por lo cual no se puede usar el ==
                (username0.equals(u) && password0.equals(p))){ 
            esAutenticado = true;
        }else {
            System.out.println("Username o password es incorrecto!!");
        }

        if(esAutenticado){
            System.out.println("Bienvenido ".concat(u).concat("!"));
        }else {
            System.out.println("Lo siento, requiere autenticacion");
        }
    }
}
