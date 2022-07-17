import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        String[] nombres = {"Daniel", "Alberto", "Omar", "Claudia", "claudia", "Julio", "omar"};
        int count = nombres.length;
        for (int i = 0; i < count; i++){
            if (nombres[i].toLowerCase().contains("Omar") || //Quita Omar con miniscula y mayusculas
                nombres[i].toLowerCase().contains("claudia")){ ////Quita claudia con miniscula y mayusculas
                continue;
            }
            System.out.println(i + "._ " + nombres[i]);
        }

        //Buscar nombre

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre: ");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < count; i++){
            if(nombres[i].equalsIgnoreCase(buscar)){ //IgnoreCase ignora si sin mayusculas o minusculas
                encontrado = true;
                break;
            }
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null,buscar + " fue encontrado!");
        }else {
            JOptionPane.showMessageDialog(null, buscar + " no existe en el sistema!");
        }
    }
}
