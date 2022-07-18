import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        Date fecha = new Date();

        System.out.println("Fecha = " + fecha);
        JOptionPane.showMessageDialog(null, "Fecha " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("EEEE dd 'de' MMMM, yyyy");
        String fechaStr = df.format(fecha);

        System.out.println("fecha str= " + fechaStr);
        JOptionPane.showMessageDialog(null, "Fecha " + fechaStr);


    }
}
