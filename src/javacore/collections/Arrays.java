package javacore.collections;

public class Arrays {

    public static void main(String[] args) {

        String[] list = new String[5];
        System.out.println(list[0]);
        System.out.println(list[1]);

        int listCount = list.length;
        System.out.println(listCount);

        list[1] = "Mmmmm";
        System.out.println(list[1]);

        for (int i = 0; i< list.length; i++) {
            System.out.println(list[i]);

        }

        String[] list2 = new String[10];
        System.out.println(list2[9]);

    }
}
