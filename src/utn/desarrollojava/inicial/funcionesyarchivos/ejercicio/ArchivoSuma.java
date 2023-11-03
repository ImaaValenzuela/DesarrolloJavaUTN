package utn.desarrollojava.inicial.funcionesyarchivos.ejercicio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ArchivoSuma {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String ruta = "C:\\Users\\Imanol\\IdeaProjects\\JavaUTN\\src\\utn\\desarrollojava\\inicial\\funcionesyarchivos\\ejercicio\\numeros.txt";

        // Muestro los números del archivo
        leerArchivo(ruta);

        System.out.println("¿Qué operación desea realizar?\n1. Suma\n2. Multiplicación");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            int resultado = sumarNumerosArchivo(ruta);
            System.out.println("La suma de los números en el archivo es: " + resultado);
        } else if (opcion == 2) {
            int resultado = multiplicarNumerosArchivo(ruta);
            System.out.println("El producto de los números en el archivo es: " + resultado);
        } else {
            System.out.println("Opción no encontrada");
        }

        sc.close();
    }

    private static void leerArchivo(String ruta) throws IOException {
        for (String unaLinea : Files.readAllLines(Paths.get(ruta))) {
            System.out.println(unaLinea);
        }
    }

    private static int sumarNumerosArchivo(String ruta) throws IOException {
        int suma = 0;
        for (String unaLinea : Files.readAllLines(Paths.get(ruta))) {
            int numero = Integer.parseInt(unaLinea);
            suma += numero;
        }
        return suma;
    }

    private static int multiplicarNumerosArchivo(String ruta) throws IOException {
        int producto = 1;
        for (String unaLinea : Files.readAllLines(Paths.get(ruta))) {
            int numero = Integer.parseInt(unaLinea);
            producto *= numero;
        }
        return producto;
    }
}
