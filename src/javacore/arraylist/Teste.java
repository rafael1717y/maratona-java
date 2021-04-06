package javacore.arraylist;

import javacore.polimorfismo2.Conta;
import javacore.polimorfismo2.ContaCorrente;

public class Teste {
    public static void main(String[] args) {

        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc = new ContaCorrente(22, 11);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(22, 11);
        guardador.adiciona(cc);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = guardador.getReferencia(0);
        System.out.println(ref.getNumero());


    }

}
