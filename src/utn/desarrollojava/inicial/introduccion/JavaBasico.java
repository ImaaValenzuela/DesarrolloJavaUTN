package utn.desarrollojava.inicial.introduccion;

public class JavaBasico {

    public static void main (String[] args){

        // Salida por consola

        System.out.println("Hello UTN");


        // Variables

        int numero = 1, otroNumero = 10;


        // Operaciones arimeticas

        double resultado = numero + otroNumero;
        System.out.println(resultado);

        double otroResultado = otroNumero / (numero * 2);
        System.out.println(otroResultado);

        int edad = 20;

        boolean estudia = true;

        // Operadores y bloques condicionales

        boolean esMayorDeEdadOEstudia = edad >= 18 || estudia;
        System.out.println(esMayorDeEdadOEstudia);

        int nota1 = 8, nota2 = 5;

        if (nota1 >= 7 && nota2 >= 7) {
            System.out.println("Aprobado");
        } else System.out.println("Desaprobado");

        char letra = 'b';

        switch (letra){
            case 'a':
                System.out.println("La letra es a");
                break;
            default:
                System.out.println("La letra no es a");
        }

        // Ciclos

        int numeroVerificar = 1;

        while (numeroVerificar <= 3){
            System.out.println("Ejecutando...");
            numeroVerificar++;
        }

        for (int i = 0; i < 10; i++){
            System.out.println("Ejecutando for...");
        }

    }
}
