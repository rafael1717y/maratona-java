package javacore.javaio;

import java.io.*;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        //Fluxo de entrada com arquivo
        FileInputStream fis = new FileInputStream("/home/rafael/IdeaProjects/maratona-java/src/javacore/javaio/lorem.txt"); //criando o fluxo com binários
        InputStreamReader isr = new InputStreamReader(fis); //transf bites e bytes em caractere
        BufferedReader br = new BufferedReader(isr); //guardar os carecteres de uma linha em um buffer
        String linha = br.readLine();

        System.out.println(linha);
        br.close();
    }
}
