package utn.desarrollojava.inicial.funcionesyarchivos;

import java.util.Scanner;

public class Consola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese todos los numeros que desee separados por un espacio y cuando no quiera ingresar mas presione ENTER");

        String numeros = sc.nextLine();

        String [] arrayNumeros = numeros.split(" ");

        int resultado = 0;

        for (String numero : arrayNumeros){
            resultado += Integer.parseInt(numero);
        }

        System.out.println("La suma de los numeros que ingreso fue de: " + resultado);

    }
}
