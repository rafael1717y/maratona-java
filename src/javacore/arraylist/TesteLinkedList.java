package javacore.arraylist;
import javacore.polimorfismo2.Conta;
import javacore.polimorfismo2.ContaCorrente;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TesteLinkedList {

       public static void main(String[] args) {

            //Generics
            List<Conta> lista = new LinkedList<>();
            //LinkedList<String> nomes = new LinkedList<>();
            List<String> nomes = new Vector<>(); //thread safe

            Conta cc = new ContaCorrente(22, 11);
            lista.add(cc);

            Conta cc2 = new ContaCorrente(22, 11);
            lista.add(cc2);

            Conta cc3 = new ContaCorrente(22, 13);
            lista.add(cc3);

            Conta cc4 = new ContaCorrente(22, 15);
            lista.add(cc4);

            System.out.println(lista.size());
            Conta ref = lista.get(0);
            System.out.println(ref.getNumero());

            lista.remove(0);
            System.out.println("Tamanho: " + lista.size());

            for (int i=0; i< lista.size(); i++) {
                Object oRef = lista.get(i);
                System.out.println("saida 1" + oRef);
            }

            //enhanced for
            for(Conta conta : lista) {
                System.out.println(conta);
            }
        }
    }

