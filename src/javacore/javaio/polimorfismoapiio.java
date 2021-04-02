package javacore.javaio;



import java.io.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class polimorfismoapiio {

    public static void main(String[] args) throws IOException {

        //fazer o fechamento do arquivo dps
        //FileInputStream fin = new FileInputStream("/home/rafael/IdeaProjects/maratona-java/src/javacore/javaio/lorem.txt");
        //FileOutputStream fout = new FileOutputStream("saida5.txt");

        FileInputStream fin = new FileInputStream("/home/rafael/IdeaProjects/maratona-java/src/javacore/javaio/lorem.txt");
        OutputStream cout = System.out;
        transfer(fin, cout);

        //InputStream cin = System.in;
        //FileOutputStream fout = new FileOutputStream("saida6.txt");
        //transfer(cin, fout);

    }

    private static void transfer(InputStream in, OutputStream out) throws IOException {
        byte[] buffer = new byte[1024];
        int bytesLidos;
        while ((bytesLidos = in.read(buffer)) > -1) {
            out.write(buffer, 0, bytesLidos);
        }
    }
}
