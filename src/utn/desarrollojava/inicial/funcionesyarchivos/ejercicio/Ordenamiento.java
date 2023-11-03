package utn.desarrollojava.inicial.funcionesyarchivos.ejercicio;

public class Ordenamiento {
    public static void main(String[] args) {
        if (args.length == 0) System.out.println("No vinieron argumentos");
        else {
            System.out.println("Vinieron argumentos");
            for(String el : args){
                System.out.println(el);
            }

            for (int i = 1; i < args.length - 1; i++) {
                for (int j = 1; j < args.length - i; j++) {
                    if (args[j].compareTo(args[j + 1]) > 0) {
                        // Intercambiar los elementos si están en el orden incorrecto
                        String temp = args[j];
                        args[j] = args[j + 1];
                        args[j + 1] = temp;
                    }
                }
            }

            System.out.println("Argumentos ordenados de manera ascendente (sin el primer elemento):");
            for (int i = 1; i < args.length; i++) {
                System.out.println(args[i]);
            }
        }
    }
}
