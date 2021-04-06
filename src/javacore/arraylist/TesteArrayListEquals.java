package javacore.arraylist;
import javacore.polimorfismo2.Conta;
import javacore.polimorfismo2.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {

    public static void main(String[] args) {

        //Conta cc1 = new ContaCorrente(22, 11);
        //Conta cc2 = new ContaCorrente(22, 11);

        //boolean igual = cc1.ehIgual(cc2);
        //System.out.println(igual);




        //Generics. Uma classe genérica mas parametrizada na criação.
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(22, 22);
        boolean existe = lista.contains(cc3);

        System.out.println("Já existe? " + existe);

        // == compara as referências e se eles apontam para objetos diferentes dará falso.
        for (Conta conta : lista) {
            System.out.println(conta);
        }





    }
}
