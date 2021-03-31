package javacore.Solutions;


import java.io.*;

public class Solution1 {
    public static void main(String[] args) throws Exception {
        //write your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sn1 = reader.readLine();
        int nn1 = Integer.parseInt(sn1);

        String sn2 = reader.readLine();
        int nn2 = Integer.parseInt(sn2);

        String sn3 = reader.readLine();
        int nn3 = Integer.parseInt(sn3);

        if ((nn1 == nn2) && (nn2 == nn3)) {
            System.out.println(nn1);
            System.out.println(nn2);
            System.out.println(nn3);
        } else if (nn1 == nn2){
            System.out.println(nn1);
            System.out.println(nn2);
        } else if (nn1 == nn3) {
            System.out.println(nn1);
            System.out.println(nn3);
        } else if (nn2 == nn3) {
            System.out.println(nn2);
            System.out.println(nn3);
        } else {
            return ;
        }
    }
}

