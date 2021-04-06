package javacore.arraylist;
import javacore.polimorfismo2.Conta;
import javacore.polimorfismo2.ContaCorrente;

import java.util.ArrayList;

public class Teste2 {

    public static void main(String[] args) {

        ArrayList lista = new ArrayList();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 11);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(22, 13);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(22, 15);
        lista.add(cc4);

        System.out.println(lista.size());
        Conta ref = (Conta) lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);
        System.out.println("Tamanho: " + lista.size());

        for (int i=0; i< lista.size(); i++) {
            Object oRef = lista.get(i);
            System.out.println("saida 1" + oRef);
        }

        //enhanced for
        for(Object oRef : lista) {
            System.out.println(oRef);
        }




    }
}
