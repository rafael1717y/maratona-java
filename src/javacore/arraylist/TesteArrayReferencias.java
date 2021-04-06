package javacore.arraylist;

import javacore.polimorfismo2.Cliente;
import javacore.polimorfismo2.Conta;
import javacore.polimorfismo2.ContaCorrente;
import javacore.polimorfismo2.ContaPoupanca;

public class TesteArrayReferencias {

    public static void main(String[] args) {

        //Criou uma variável que se chama contas que aponta para  um array
        Conta[] contas = new Conta[5];
        //Array do tipo object
        //Object[] contas = new Object[5];

        Cliente cliente = new Cliente();
        //contas[2] = cliente;

        //ContaCorrente[] contas = new ContaCorrente[5];
        ContaCorrente cc1 = new ContaCorrente(22, 11);

        //Guardando a referencia contas na primeira posicao do array
        contas[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22, 15);
        contas[1] = cc2;

        System.out.println(contas[1].getNumero());
        System.out.println(contas[0].getNumero());


        //transf uma referencia do tipo mais genérico para um tipo mais específico.
        ContaPoupanca ref = (ContaPoupanca) contas[1];
        System.out.println(ref.getNumero());


    }
}
