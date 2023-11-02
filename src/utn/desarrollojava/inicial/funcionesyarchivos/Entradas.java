package utn.desarrollojava.inicial.funcionesyarchivos;

public class Entradas {
    public static void main(String[] args) {
        if (args.length == 0) System.out.println("No vinieron argumentos");
        else {
            System.out.println("Vinieron argumentos");
            System.out.println("Hola " + args[0]);

            int resultado = 0;
            for(int i = 1; i < args.length; i++){
                resultado += Integer.parseInt(args[i]); // Recibe string y lo convierte en int
            }

            System.out.println("El resultado es: " + resultado);
        }
    }
}
