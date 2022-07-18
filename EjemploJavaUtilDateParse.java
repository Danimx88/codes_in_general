    import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDateParse {

    public static void main(String[] args) {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");


        try {
            Date fecha = format.parse("2022-07-18");
            JOptionPane.showMessageDialog(null, fecha);
            JOptionPane.showMessageDialog(null, format.format(fecha));
            System.out.println(fecha);
            System.out.println(format.format(fecha));

        }catch (ParseException e){
            e.printStackTrace();
        }

    }
}
