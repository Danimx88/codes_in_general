public class Empleado {
    private int id;
    private String nombre;
    private Direccion direccion;

    public Empleado(int id, String nombre, Direccion direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    
    public Direccion getDireccion() {
        return direccion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
