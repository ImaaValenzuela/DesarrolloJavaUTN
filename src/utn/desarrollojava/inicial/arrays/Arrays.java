package utn.desarrollojava.inicial.arrays;

public class Arrays {
    public static void main(String[] args) {

        // Arrays

        int numeros[] = {1, 5, 7};      // Inicializacion con valores fijos

        int otrosNumeros[] = new int[2];    // Declaracion del arreglo sin inicializar

        otrosNumeros[0] = 10;

        otrosNumeros[1] = 2;

        
        // Mostrar cantidad de elementos de un array

        System.out.println("La cantidad de elementos que tiene mi array numeros es de: " + numeros.length);
        System.out.println("La cantidad de elementos que tiene mi array otrosNumeros es de: " + otrosNumeros.length);

        // Recorrer un array

        System.out.println("Los elementos de mi array numeros son:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ", ");
        }
        System.out.println();


        System.out.println("Los elementos de mi array otrosNumeros son:");
        int i = 0;

        while (i < otrosNumeros.length){
            System.out.print(otrosNumeros[i] + ", ");
            i++;
        }
        System.out.println();

        // Foreach

        char vocales[] = {'a', 'e', 'i', 'o', 'u'};

        System.out.println("Las vocales son:");

        for (char vocal: vocales) {
            System.out.println(vocal);
        }

    }
}
