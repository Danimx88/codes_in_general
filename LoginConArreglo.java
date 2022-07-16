import java.util.Scanner;

public class LoginConArreglo {
    public static void main(String[] args) {

        String[] usernames = new String[3];  //Se podrian usar tambien {"Daniel", "Admin", "Jose"}
        String[] passwords = new String[3];  //Se podrian usar tambien {"12345", "1234", "12389"}
        usernames[0] = "Daniel";
        passwords[0] = "12345";

        usernames[1] = "Admin";
        passwords[1] = "1234";

        usernames[2] = "Jose";
        passwords[2] = "12389";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el username: ");
        String u = scanner.next();

        System.out.print("Ingrese el password: ");
        String p = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++){

            if (usernames[i].equals(u) && passwords[i].equals(p)){  //se equal ya que son cadenas y no tipo primitivo, por lo cual no se puede usar el ==
                esAutenticado = true;
                break;
            }
        }



        if(esAutenticado){
            System.out.println("Bienvenido ".concat(u).concat("!"));
        }else {
            System.out.println("Username o password es incorrecto!!");
            System.out.println("Lo siento, requiere autenticacion");
        }

    }
}
