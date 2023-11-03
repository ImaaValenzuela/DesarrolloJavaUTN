package utn.desarrollojava.inicial.poo.ejercicio;

import utn.desarrollojava.inicial.poo.ejercicio.dominio.carrito.Carrito;
import utn.desarrollojava.inicial.poo.ejercicio.dominio.carrito.Persona;
import utn.desarrollojava.inicial.poo.ejercicio.dominio.carrito.Producto;

import java.time.LocalDateTime;

public class CarritoCompra {
    public static void main(String[] args) {
        // Crear una persona
        LocalDateTime fechaNacimiento = LocalDateTime.of(2003, 12, 14, 0, 0);
        Persona persona = new Persona("Imanol", "Valenzuela", fechaNacimiento);

        // Crear productos
        Producto producto1 = new Producto("Producto1", "123", 100.0f);
        Producto producto2 = new Producto("Producto2", "456", 50.0f);
        Producto producto3 = new Producto("Producto3", "789", 75.0f);

        // Crear un carrito con la persona y los productos
        LocalDateTime fechaCompra = LocalDateTime.now(); // Usar la fecha actual como fecha de compra
        Carrito carrito = new Carrito(persona, producto1, producto2, producto3, fechaCompra);

        // Calcular el costo final del carrito
        float costoFinal = carrito.costoFinal();


        System.out.println("Carrito de " + persona.getNombre() + " " + persona.getApellido());
        System.out.println("Fecha de compra: " + fechaCompra);
        System.out.println("Costo final del carrito: $" + costoFinal);
    }
}

