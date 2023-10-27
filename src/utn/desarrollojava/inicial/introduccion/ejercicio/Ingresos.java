package utn.desarrollojava.inicial.introduccion.ejercicio;

public class Ingresos {
    public static void main(String[] args) {
        // Datos inventados para el ejercicio
        double ingresosMensuales = 500000.0;
        int numeroVehiculos = 4;
        int numeroInmuebles = 2;
        boolean tieneEmbarcacion = false;
        boolean tieneAeronave = true;
        boolean tieneActivosSocietarios = true;


        boolean esIngresosAltos = false;

        if (ingresosMensuales >= 489083.0) {
            esIngresosAltos = true;
        } else if (numeroVehiculos >= 3 && numeroVehiculos < 5) {
            esIngresosAltos = true;
        } else if (numeroInmuebles >= 3) {
            esIngresosAltos = true;
        } else if (tieneEmbarcacion || tieneAeronave || tieneActivosSocietarios) {
            esIngresosAltos = true;
        }

        if (esIngresosAltos) {
            System.out.println("La persona pertenece al segmento de ingresos altos.");
        } else {
            System.out.println("La persona no pertenece al segmento de ingresos altos.");
        }
    }
}

