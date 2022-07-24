public class Automovil {  //Clase

    String fabricante;  //Variable fabricante del tipo String
    String modelo;
    String color;
    double kilometraje;

    public String detalle(){
        StringBuilder sb = new StringBuilder(); //Concatenar
        sb.append("\nauto.fabricante = " + this.fabricante); //
        sb.append("\nauto.fabricante = " + this.modelo);
        sb.append("\nauto.fabricante = " + this.color);
        sb.append("\nauto.fabricante = " + this.kilometraje);
        return sb.toString(); //devolver un valor u objeto
    }

}
