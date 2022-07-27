package uno;

import java.util.ArrayList;
import java.util.List;

public class Sublist {
        public static void main(String[] args) {


        List<String> colores = new ArrayList<>();
            colores.add("Rojo");
        colores.add("Verde");
        colores.add("Negro");
        colores.add("Azul");
        colores.add("Blanco");
        colores.add("Amarillo");
        colores.add("Cafe");
        colores.add("Gris");
        colores.add("Naranja");

        System.out.println(colores.subList(0,2));
                System.out.println(colores.subList(4,5));

                int size = colores.size();
                String n = colores.get(7);

                System.out.println("Cantidad de colores: " + size);
                System.out.println("Color en la posicion 8 = " + n);
        }
}
