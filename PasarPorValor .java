public class PasarPorValor {
    public static void main(String[] args) {

        Integer i = Integer.valueOf(10);

        System.out.println("Iniciamos el metodo main con i = " + i);
        test(i);
        System.out.println("Finalizamos el metodo main con el valor de i (se mantiene igual)= " + i);
    }

    public static void test(int i){
        System.out.println("Iniciamos el metodo test con i = " + i);
        i = 35; //ya no es el mismo objeto que el original
        System.out.println("Finaliza el metodo test con i = " + i);
    }
}
