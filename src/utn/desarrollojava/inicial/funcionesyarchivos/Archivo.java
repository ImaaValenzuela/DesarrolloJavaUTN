package utn.desarrollojava.inicial.funcionesyarchivos;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Archivo {
    public static void main(String[] args) throws IOException {
        String ruta = "C:\\Users\\Imanol\\IdeaProjects\\JavaUTN\\src\\utn\\desarrollojava\\inicial\\funcionesyarchivos\\ejemplo.txt";

        ejemploLecturaArchivo(ruta);
        ejemploEscrituraArchivo(ruta);
        ejemploEscrituraArchivoExt(ruta);
        mostrarUltimaModificacionArchivo(ruta);
    }

    private static void ejemploLecturaArchivo(String ruta) throws IOException {
        for(String unaLinea : Files.readAllLines(Paths.get(ruta))){
            System.out.println(unaLinea);
        };
    }

    private static void ejemploEscrituraArchivo(String ruta) throws IOException{
        String palabraAEscribir = System.lineSeparator() + "Brian"; // AGREGA UN ENTER AL ARCHIVO
        Files.writeString(Paths.get(ruta), palabraAEscribir, StandardOpenOption.APPEND); // AGREGA EL CONTENDIO SIN PISARLO
    }

    private static void ejemploEscrituraArchivoExt(String ruta) throws IOException{
        String frase = System.lineSeparator() + "Un texto largo en mi archivo de texto";
        Files.write(Paths.get(ruta), frase.getBytes(), StandardOpenOption.APPEND);
    }

    private  static void mostrarUltimaModificacionArchivo(String ruta) throws IOException{
        System.out.println(Files.getLastModifiedTime(Paths.get(ruta)));
    }
}
