package utn.desarrollojava.inicial.poo.ejercicio.dominio.carrito;

import java.time.LocalDateTime;

public class Carrito {
    private Persona persona;
    private Producto producto1;
    private Producto producto2;
    private Producto producto3;
    private LocalDateTime fechaCompra;

    public Carrito(Persona persona, Producto producto1, Producto producto2, Producto producto3, LocalDateTime fechaCompra) {
        this.persona = persona;
        this.producto1 = producto1;
        this.producto2 = producto2;
        this.producto3 = producto3;
        this.fechaCompra = fechaCompra;
    }

    public float costoFinal() {
        float costoTotal = 0.0f;

        // Sumar el precio de cada producto al costo total
        costoTotal += producto1.getPrecio();
        costoTotal += producto2.getPrecio();
        costoTotal += producto3.getPrecio();

        return costoTotal;
    }
}
