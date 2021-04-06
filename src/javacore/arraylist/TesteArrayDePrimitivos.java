package javacore.arraylist;

public class TesteArrayDePrimitivos {

    public static void main(String[] args) {

        //Array []
        int[] idades = new int[5]; //inicializa o array com 0.

        for (int i = 0; i < idades.length; i++) {
            idades[i] = i * i;
        }

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }



        /*
        idades[0] = 29;
        idades[1] = 30;
        idades[2] = 40;
        idades[4] = 44;

        int idade4 = idades[4];

        */
        //System.out.println(idade4);
        //System.out.println(idades.length); //atributo público do arrray



    }
}
