public class SentenciaBucleEtiquetasBuscar {
    public static void main(String[] args) {

        String frase = "tres tristes tigres tragan trigo en un trigaltrigo"; //frase
        String palabra = "trigo"; //palabra a buscar

        int maxFrase = frase.length(); //variable recorre todoo valor de frase
        int maxPalabra = palabra.length(); //variable recorre todoo valor de palabra

        int cantidad = 0; //variable cantidad valor inicial 0
        char letra = 'g'; //variable caracter valor 'g'
        buscar:  //etiqueta
        for (int i = 0; i < maxFrase; i++) {  //iniciando el for para maxFrase = frase.lenght();
            int k = i; //se declar variable k con valor de i para no afectar en i en el funcionamiento, trabaja de manera independiente
            for (int j = 0; j < maxPalabra; j++) {   //iniciando el for para maxPalabra = palabra.lenght();
                if (frase.charAt(k++) != palabra.charAt(j)) { //charAt busca el valor de un texto, aqui esta comparando que frase de la palabra son iguales
                    continue buscar; //
                }
            }
            cantidad++; //recorre todoo y lo suma
        }
        System.out.println("Encontrada = " + cantidad + " veces la palabra '" + palabra + "' en la frase " + frase);
    }
}
