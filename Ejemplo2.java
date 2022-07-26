public class Ejemplo2 {
    public static void main(String[] args) {
        int size = 17;

        int n = 1;
        while (n < size) {
            for (int i=0; i<(size/2)-(n/2); i++)
                System.out.print(" ");  // Dibujar espacios para centrar
            for (int i=0; i<n; i++)
                System.out.print("*");  /* Dibujar cuerpo */
            System.out.println();

            n += 2;
        }

        for (n=0; n<2; n++) {
            for (int i=0; i<(size/2)-1; i++)
                System.out.print(" ");
            System.out.println("| |");
        }
    }
}
