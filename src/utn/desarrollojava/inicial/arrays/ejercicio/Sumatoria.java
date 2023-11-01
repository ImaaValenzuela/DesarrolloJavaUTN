package utn.desarrollojava.inicial.arrays.ejercicio;

public class Sumatoria {
    public static void main(String[] args) {
        int numeros[] = {10, 7, 8, 15, 11, 1, 3};
        int numeroX = 10;
        int suma = 0;

        System.out.println("Mi vector contiene los números:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        for (int numero : numeros) {
            if (numero > numeroX) {
                suma += numero;
            }
        }

        System.out.println("\nLa suma de los números mayores a " + numeroX + " es: " + suma);
    }
}
