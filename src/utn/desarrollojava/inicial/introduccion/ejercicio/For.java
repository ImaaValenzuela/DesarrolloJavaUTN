package utn.desarrollojava.inicial.introduccion.ejercicio;

public class For {
    public static void main(String[] args) {
        int numeroFin = 14;
        for(int numeroInicio = 5; numeroInicio <= numeroFin; numeroFin--){
            if(numeroFin % 2 == 0){
                System.out.println("Número par: " + numeroFin);
            }
        }
    }
}
