package javacore.arraylist;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String s = bis.readLine();
            list.add(0, s);
        }

        for (String s : list) {
            System.out.println(s);


        }
    }
}
