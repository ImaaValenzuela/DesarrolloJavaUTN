package utn.desarrollojava.inicial.arrays;

public class Strings {
    public static void main(String[] args) {

        // String

        String saludo = "Hola";
        String nombre = "Imanol";
        String saludoDirigido = saludo + " " + nombre;
        System.out.println(saludoDirigido);

        // Metodos de strings

        String animal1 = "Perro";
        String animal2 = "Gato";
        String animal3 = "Perro";

        System.out.println("El animal 1 es igual al animal 2?\n" + animal1.equals(animal2));        // Comparar
        System.out.println("El animal 1 es igual al animal 3?\n" + animal1.equalsIgnoreCase(animal3));      // Comparar ignorando el case
        System.out.println("Perro contiene " + animal1.length() + " caracteres");       // Saber cantidad de caracteres
        System.out.println(animal2.toUpperCase() + " en mayuscula");        // Pasar texto a mayuscula
        System.out.println(animal1.toLowerCase() + " en minuscula");        // Pasar texto a minuscula
        System.out.println("Perro contiene la palabra rro? " + animal3.contains("rr") );       // Saber si contiene una palabra
        System.out.println("Perro empieza con P? " + animal1.startsWith("P"));     // Empieza con..
        System.out.println("Gato termina con u? " + animal2.endsWith("u"));       // Termina con ..
        System.out.println(animal2.replace("to", "tito"));       // Remplazar palabras

    }
}
