public class Ciudad {
    private String nombre;
    private String pais;
    private String region;

    public Ciudad(String nombre, String pais, String region) {
        this.nombre = nombre;
        this.pais = pais;
        this.region = region;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public String getRegion() {
        return region;
    }
}
