package utn.desarrollojava.inicial.introduccion.ejercicio;

public class While {
    public static void main (String[] args){
        int numeroInicio = 5;
        int numeroFin = 14;
        while (numeroInicio <= numeroFin){
            System.out.println("El número es: " + numeroInicio);
            numeroInicio++;
        }

        int numInicio = 5;
        int numFin = 14;

        while(numInicio <= numFin){
            if (numInicio % 2 == 0) {
                System.out.println("Número par: " + numInicio);
            }
            numInicio++;
        }

        int num1 = 5;
        int num2 = 14;
        int eleccion = 2;

        while(num1 <= num2){
            switch (eleccion){
                case 1 :
                    if (num1 % 2 == 0) {
                        System.out.println("Número par: " + num1);
                    }
                    num1++;
                    break;
                case 2:
                    if (num1 % 2 != 0) {
                        System.out.println("Número impar: " + num1);
                    }
                    num1++;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }
    }
}
