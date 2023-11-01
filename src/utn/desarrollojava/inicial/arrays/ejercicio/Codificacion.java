package utn.desarrollojava.inicial.arrays.ejercicio;

public class Codificacion {
    public static void main(String[] args) {
        String palabra = "Hola que tal";
        int desplazamiento = 3; // Valor modificable

        String textoCodificado = "";
        String textoDecodificado = "";

        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);

            if (Character.isLetter(caracter)) {
                char base = Character.isLowerCase(caracter) ? 'a' : 'A';
                textoCodificado += (char) (base + (caracter - base + desplazamiento) % 26);
            } else {
                textoCodificado += caracter;
            }
        }

        for (int i = 0; i < textoCodificado.length(); i++) {
            char caracter = textoCodificado.charAt(i);

            if (Character.isLetter(caracter)) {
                char base = Character.isLowerCase(caracter) ? 'a' : 'A';
                textoDecodificado += (char) (base + (caracter - base + 26 - desplazamiento) % 26);
            } else {
                textoDecodificado += caracter;
            }
        }

        System.out.println("Texto original: " + palabra);
        System.out.println("Texto codificado: " + textoCodificado);
        System.out.println("Texto decodificado: " + textoDecodificado);
    }
}
