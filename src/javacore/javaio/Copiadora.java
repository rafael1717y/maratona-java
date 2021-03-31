package javacore.javaio;

import java.io.*;

public class Copiadora {

    public static void main(String[] args) throws IOException {

        //Cópia fiel - nível de bytes
        String inputFile = "/home/rafael/IdeaProjects/maratona-java/src/javacore/javaio/lorem.txt";
        String outputFile = "saida4.txt";

        try (InputStream in = new FileInputStream(inputFile);
             OutputStream out = new FileOutputStream(outputFile)) {

            byte[] buffer = new byte[1024];

            int bytesLidos;
            while ((bytesLidos = in.read(buffer)) > -1) {
                out.write(buffer, 0, bytesLidos); //só escrevo na saída da posição 0 até a qtd de bytes lidos.
            }
        }
    }
}

