public class OperadoresIncrementales {
    public static void main(String[] args) {

        // Pre Incremento
        System.out.println("Pre Incremento");
        int i = 1;
        int j = ++i; //i = i + 1;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post Incremento
        System.out.println("Post Incremento");
        i = 2; //i = 2
        j = i++; //i = i + 1 => 3 y j = i original entonces j = 2;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Pre decremento
        System.out.println("Pre Decremento");
        i = 3; //i = 3
        j = --i; //i = i -1 = 2
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post decremento
        System.out.println("Post Decremento");
        i = 4; //i = 4
        j = i--; //j = 4, i = i -1 = 3
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("++j = " + (++j));
        System.out.println("j++ = " + (j++));
        System.out.println("Valor final de j = " + j);

        System.out.println("--j = " + (--j));
        System.out.println("j-- = " + (j--));
        System.out.println("Valor final de j = " + j);

    }
}
