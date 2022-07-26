public interface Vehiculo {
    void encenderPilotoCombustible();
    void encenderPilotoError();
    Operario obtenerOperario();
    void cambiarOperario(Operario nuevoOperario);
}
