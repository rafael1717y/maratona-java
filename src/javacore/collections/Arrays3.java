package javacore.collections;

//Fill a 10-element array with numbers from 10 to 1:
public class Arrays3 {
            public static void main(String[] args)
        {
            int[] numbers = new int[10];

            for (int i = 0; i < numbers.length; i++)
            {
                numbers[i] = 10 - i;
            }
            System.out.println(numbers[0]);
        }
    }
