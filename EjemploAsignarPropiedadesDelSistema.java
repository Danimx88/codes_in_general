import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDelSistema {
    public static void main(String[] args) {

        try {
            FileInputStream acrhivo = new FileInputStream("src/config.properties");

            Properties p = new Properties(System.getProperties());
            p.load(acrhivo);
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");

            System.setProperties(p);

            //System.getProperties().list(System.out);
            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(...) = " + ps.getProperty("Mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("otro"));
            System.out.println(System.getProperty("config.autor.email"));

            ps.list(System.out);
        }catch (Exception e){
            System.out.println("No esiste el archivo = " + e);
        }
    }
}
