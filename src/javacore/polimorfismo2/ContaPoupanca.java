package javacore.polimorfismo2;

public class ContaPoupanca extends Conta {

    //Reaproveitando o construtor explicitavamente.
    public ContaPoupanca(int agencia, int numero){
        super(agencia, numero);
    }

}
