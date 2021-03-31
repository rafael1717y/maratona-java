package javacore.javaio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Aplicacao {

    public static void main(String[] args) throws IOException {

        try (InputStream is = new FileInputStream("/home/rafael/IdeaProjects/maratona-java/src/javacore/javaio/lorem.txt")) {

            byte[] buffer = new byte[1024];

            //Realizar a leitura em loop.
            String s = "";
            int bytesLidos; // retorna -1 qdo não consegue mais ler do arquivo (espec. do método)
            while ((bytesLidos = is.read(buffer)) > -1) {
                s += new String(buffer, 0, bytesLidos);
            }
            System.out.println(s);
            System.out.println(s.length());


            //int bytesLidos  = is.read(buffer);  //vai colocar no read só o que ele consegue no buffer
            //o buffer é maior que o conteúdo do arquivo ('arquivo teste para leitura'). String construída baseada no buffer inteiro.
            //String s = new String(buffer, 0, bytesLidos); //retirando o lixo
            //System.out.println(s);

            //System.out.println(s.length());
        }
    }
}

