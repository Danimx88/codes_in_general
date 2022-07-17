public class SentenciaForEach {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        for (int num: numeros){
            System.out.println("num = " + num);
        }
        
        String [] nombres = {"Andres", "Omar", "Luis", "Julio", "Maria", "Sofia", "Mateo", "Alejandro", "Alberto", "Jose"};

        for (String nombre : nombres){
            System.out.println("nombre = " + nombre);
        }

    }
}
