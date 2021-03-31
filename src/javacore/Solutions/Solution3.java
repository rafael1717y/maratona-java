package javacore.Solutions;

public class Solution3 {

    public static void main(String[] args) {
        for (int i = 0; i < 101; i++)
        {
            int resto = (i % 2);
            if (resto == 0) {
                System.out.println(i);
            }
        }
    }
}

