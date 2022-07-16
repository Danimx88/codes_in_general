public class OperadoresAsignacion {
    public static void main(String[] args) {
        int i = 5;
        int j = i + 4;
        System.out.println("Valor inicial de i = " + i);
        System.out.println("Valor de j = " + j);

        i += 2; // i = i + 2;
        System.out.println("Nuevo valor de i = " + i);

        i+= 5; // i = i + 5;
        System.out.println("Nuevo valor de i + 5 = " + i);

        j -=4; // j = j - 4;
        System.out.println("Nuevo valor j - 4 = " + j);

        j *=3; // j = j * 3;
        System.out.println("Nuevo valor j - 4 = " + j);

        String sqlString = "Select * from clientes as c";
        sqlString += " where c.nombre='Andres'";
        sqlString += " and c.activo=1' ";
        System.out.println("sqlString = " + sqlString);

    }

}
