package utn.desarrollojava.inicial.funcionesyarchivos;

public class Funcion {
    public static void main(String[] args) {

        int []numeros = {1,5,7,2};

        int resultado = sumatoria(numeros);

        double promedio = (double) resultado / numeros.length;

        System.out.println("El promedio del arreglo es: " + promedio);


    }

    private static int sumatoria(int []numeros){
        int resultado = 0;

        for (int i : numeros) {
            resultado += i;
        }

        return resultado;
    }
}
