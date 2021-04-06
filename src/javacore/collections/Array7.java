package javacore.collections;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
String array in reverse order

*/

public class Array7 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];


        //Fill the array
        for (int i = 0; i < 8; i++)
        {
            list[i] = reader.readLine();
        }

        for (int i = 9; i >=0; i--) {
            System.out.println(list[i]);
        }

    }
}