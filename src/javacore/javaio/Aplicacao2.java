package javacore.javaio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Aplicacao2 {

    public static void main(String[] args) throws IOException {

        /*
        try (BufferedReader reader = new BufferedReader(new FileReader("/home/rafael/IdeaProjects/maratona-java/src/javacore/javaio/lorem.txt"))) {

            String s = "";
            String line;
            while ((line = reader.readLine()) != null) {
                s += line + "\n";
            }
            System.out.println(s);
        }
        */
                 //ou
        try (Scanner scanner = new Scanner(new FileReader("/home/rafael/IdeaProjects/maratona-java/src/javacore/javaio/lorem.txt"))) {
            String s = "";
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                s += line + "\n";
            }
            System.out.println(s);
        }
    }
}
