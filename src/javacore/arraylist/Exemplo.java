package javacore.arraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class Exemplo {

    public static void main(String[] args) throws Exception {

        ArrayList<String> lista= new ArrayList<String>();
        lista.add("Juca Bala;11111-111");
        lista.add("Marcos Pa; 23232");
        lista.add("HHHHH");
        lista.add("HHHHssH");
        lista.add("HHHHssH");
        System.out.println(lista.size());

        for (int i=0; i <lista.size(); i++) {
            System.out.println(lista.get(i));
        }

    }
}
