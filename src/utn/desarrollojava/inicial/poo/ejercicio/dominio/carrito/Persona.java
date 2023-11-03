package utn.desarrollojava.inicial.poo.ejercicio.dominio.carrito;

import java.time.LocalDateTime;
import java.time.Period;

public class Persona {
    private String nombre;
    private String apellido;
    private LocalDateTime fechaDeNacimiento;

    public Persona(String nombre, String apellido, LocalDateTime fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int edad(){
        LocalDateTime ahora = LocalDateTime.now();
        Period periodo = Period.between(fechaDeNacimiento.toLocalDate(), ahora.toLocalDate());
        return periodo.getYears();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDateTime getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDateTime fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
}
