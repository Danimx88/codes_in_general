public class Bloaters {

    public void enviarCarta(Empleado empleado) {

        imprimirDireccion(empleado.getNombre(), empleado.getApellidos(), empleado.getDireccion().getCalle(),empleado.getDireccion().getNumero(), empleado.getDireccion().getCiudad(), empleado.getDireccion().getCodigoPostal());
    }

    public void imprimirDireccion(String nombre, String apellidos, String calle, int numero, String ciudad, int codigoPostal) {

        imprimir(nombre);
        imprimir(apellidos);
        imprimir(calle);
        imprimir(String.valueOf(numero));
        imprimir(ciudad);
        imprimir(String.valueOf(codigoPostal));

    }

    public void imprimir(String campo) {

    }
}
