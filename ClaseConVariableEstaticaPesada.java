import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ClaseConVariableEstaticaPesada {
    public static final ArrayList<Integer> NUMEROS_ALEATORIOS = obtenerNumerosAleatorios(2_000_000);

    private static ArrayList<Integer> obtenerNumerosAleatorios(int cantidad) {
        ArrayList<Integer> aleatorios = new ArrayList<>();
        for (int i = 0; i < cantidad ; i ++) {
            int aleatorio = ThreadLocalRandom.current().nextInt();
            aleatorios.add(aleatorio);
        }
        return aleatorios;
    }
    public static int multiplica(int numero1, int numero2) {
        return numero1 * numero2;
    }
}
