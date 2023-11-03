package utn.desarrollojava.inicial.poo.ejercicio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String ruta = "C:\\Users\\Imanol\\IdeaProjects\\JavaUTN\\src\\utn\\desarrollojava\\inicial\\poo\\ejercicio\\carrito.txt";

        // Muestro los elementos del carrito
        leerArchivo(ruta);

        System.out.println("¿Qué operación desea realizar?\n1. Calcular precio");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            double precioTotal = calcularPrecioCarrito(ruta);
            System.out.println("El precio total del carrito es: " + precioTotal);
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

    private static double calcularPrecioCarrito(String ruta) throws IOException {
        double precioTotal = 0;
        for (String unaLinea : Files.readAllLines(Paths.get(ruta))) {
            String[] parts = unaLinea.split(",");
            if (parts.length == 3) {
                int cantidad = Integer.parseInt(parts[0]);
                double precioUnitario = Double.parseDouble(parts[1]);
                String producto = parts[2];
                double precioItem = cantidad * precioUnitario;
                precioTotal += precioItem;
            }
        }
        return precioTotal;
    }
}
