package utn.desarrollojava.inicial.arrays.ejercicio;

public class Letra {
    public static void main(String[] args) {

        String palabra= "Onomatopeya";
        char letra = 'o';
        int contador = 0;

        for (int i = 0; i < palabra.length(); i++) {
            if (Character.toLowerCase(palabra.charAt(i)) == Character.toLowerCase(letra)) {
                contador++;
            }
        }

        System.out.println("La palabra " + palabra + " contiene " + contador + " veces la letra " + letra);
    }
}
