public final class Empleado {
    private final int id;
    private final String nombre;
    private final String apellidos;
    private final Direccion direccion;

    public Empleado(int id, String nombre, String apellidos, Direccion direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = new Direccion(direccion.getCalle(), direccion.getNumero(), direccion.getCiudad(), direccion.getCodigoPostal());
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Direccion getDireccion() {
        return new Direccion(direccion.getCalle(), direccion.getNumero(), direccion.getCiudad(), direccion.getCodigoPostal());
    }

    public Empleado cambiarNombre(String nuevoNombre) {

        return new Empleado(id, nuevoNombre, apellidos, direccion);
    }

}
