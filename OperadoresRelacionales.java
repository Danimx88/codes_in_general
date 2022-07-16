public class OperadoresRelacionales {
    public static void main(String[] args) {
        int i = 3;
        int x = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        boolean b1 = i == j;
        System.out.println("b1 = " + b1);

        boolean b2 = i == x;
        System.out.println("b2 = " + b2);

        boolean b3 = !b1; // "!" invierte el valor
        System.out.println("b3 = " + b3);

        boolean b4 = i != j; //Si i es distinto a j
        System.out.println("b4 = " + b4);

        boolean b5 = m == true;
        System.out.println("b5 = " + b5);

        boolean b6 = m != true; //Si m es distinto a true
        System.out.println("b6 = " + b6);

        boolean b7 = i > j;
        System.out.println("b7 = " + b7);

        boolean b8 = i < j;
        System.out.println("b8 = " + b8);

        boolean b9 = j >= k;
        System.out.println("b9 = " + b9);

        boolean b10 = j <= k;
        System.out.println("b10 = " + b10);

    }
}
