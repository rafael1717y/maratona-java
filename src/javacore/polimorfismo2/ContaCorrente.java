package javacore.polimorfismo2;

//new ContaCorrente()
public class ContaCorrente extends Conta {
    //herda atributos e métodos mas não herda os construtores.

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

}
