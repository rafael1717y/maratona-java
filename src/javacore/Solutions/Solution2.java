package javacore.Solutions;

import java.io.*;
public class Solution2 {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        for (int i = 0; i < 10; i++)
        {
            System.out.println(name + " loves me.");
        }
   }
}

