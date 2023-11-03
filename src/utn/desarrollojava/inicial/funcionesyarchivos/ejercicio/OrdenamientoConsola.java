package utn.desarrollojava.inicial.funcionesyarchivos.ejercicio;

import java.util.Scanner;

public class OrdenamientoConsola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese numeros (Ingrese 'fin' para finalizar la entrada):");

        int tamanioMax = 10;
        String [] argumentos = new String[tamanioMax];
        int contador = 0;

        while(true){
            if(contador == tamanioMax){
                System.out.println("Se alcanzo el tamaño maximo de numeros");
                break;
            }

            String entrada = sc.next();

            if(entrada.equals("fin")){
                break;
            }

            argumentos[contador] = entrada;
            contador++;
        }

        if (contador == 0) {
            System.out.println("No se ingresaron argumentos");
        } else{
            System.out.println("Argumentos ingresados");
            for(int i = 0; i < contador; i++){
                System.out.println(argumentos[i]);
            }

            for (int i = 0; i < contador - 1; i++) {
                for (int j = 0; j < contador - i - 1; j++) {
                    // Convierte las cadenas en enteros antes de comparar
                    int num1 = Integer.parseInt(argumentos[j]);
                    int num2 = Integer.parseInt(argumentos[j + 1]);
                    if (num1 > num2) {
                        // Intercambia los elementos si están en el orden incorrecto
                        String temp = argumentos[j];
                        argumentos[j] = argumentos[j + 1];
                        argumentos[j + 1] = temp;
                    }
                }
            }

            System.out.println("Argumentos ordenados de manera ascendente:");
            for (int i = 0; i < contador; i++) {
                System.out.println(argumentos[i]);
            }
        }
        sc.close();
    }
}
