package utn.desarrollojava.inicial.poo.interfaz;

import utn.desarrollojava.inicial.poo.dominio.personas.Persona;
import utn.desarrollojava.inicial.poo.dominio.personas.TipoDocumento;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Imanol", "Valenzuela", "11222333", TipoDocumento.DNI, 0);
        System.out.println(persona1.presentate());
    }
}
