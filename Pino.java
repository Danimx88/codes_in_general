public class Pino {
    public static void main(String[] args) {
       int size = 12;

       int n = 1;
       while (n < size) {
           for (int i = 0; i<(size/2)-(n/2); i++)
               System.out.print(" ");
               for (int i = 0; i < n; i++)
                   System.out.print("*");
           System.out.println();
                   n += 2;
               }
       for (n=0; n<2; n++){
           for (int i = 0; i <(size/2)-1; i++)
               System.out.print(" ");
           System.out.println("| |");
       }
    }
}
