package javacore.collections;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays5 {

           public static void main(String[] args) throws IOException
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int[] list = new int[10];

            //Fill the array
            for (int i = 0; i < list.length; i++)
            {
                String s = reader.readLine();
                list[i] = Integer.parseInt(s);
            }
            //Display the array
            for (int i = 0; i <list.length; i++) {
                System.out.println(list[i]);
            }

        }
    }

