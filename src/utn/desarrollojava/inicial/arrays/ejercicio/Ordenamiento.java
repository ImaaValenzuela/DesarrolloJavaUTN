package utn.desarrollojava.inicial.arrays.ejercicio;

public class Ordenamiento {
    public static void main(String[] args) {
        int numeros[] = new int[3];

        // Genera los números aleatorios y los agrega al arreglo
        for (int i = 0; i < numeros.length; i++) {
            int numero = (int)(Math.random() * 11);
            numeros[i] = numero;
            System.out.println("Número " + (i + 1) + ": " + numero);
        }

        // Ordena los números en orden ascendente utilizando el algoritmo de burbuja
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    // Intercambia los números si no están en orden ascendente
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("Números en orden ascendente:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1) + ": " + numeros[i]);
        }
    }
}
