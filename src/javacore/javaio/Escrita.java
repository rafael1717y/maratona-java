package javacore.javaio;

import java.io.*;

public class Escrita {

    public static void main(String[] args) throws IOException {
        String s = "texto para ser gravado no arquivo";
        /*
        try (OutputStream os = new FileOutputStream("saida.txt")) {

            String s = "texto para ser gravado no arquivo";

            byte[] buffer = s.getBytes();
            os.write(buffer);
        */

        // Método 2
        //try (BufferedWriter writer = new BufferedWriter(new FileWriter("saida2.txt"))) {
        //    writer.write(s);

        //Método 3

        try(PrintWriter pw = new PrintWriter("saida3.txt")) {
            pw.println(s);

        }
    }
}
