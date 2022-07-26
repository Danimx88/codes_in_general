public class Cliente {
    private String nombre;
    private String apellidos;
    private Direccion direccion;

    public Cliente(String nombre, String apellidos, Direccion direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Direccion getDireccion() {
        return direccion;
    }


    public static Cliente obtenerClienteX() {
        Ciudad ciudad = new Ciudad("Quito", "Ecuador", "Pichincha");
        Direccion direccion = new Direccion("Bélgica", 8, ciudad, 170506);
        return new Cliente("Antonio", "García Fernández", direccion);
    }
}
