package javacore.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxArray {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // Create and populate the array
        int[] list = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < list.length; i++)
        {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }
        return list;
    }

    public static int max(int[] list) {
        // Find the maximum
        int max = list[0];
        for (int i = 0; i< list.length; i++) {
            if (list[i] > max)
                max = list[i];
        }
        return max;
    }
}

