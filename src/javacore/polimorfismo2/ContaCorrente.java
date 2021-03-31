package javacore.polimorfismo2;

//new ContaCorrente()
public class ContaCorrente extends Conta {
    //herda atributos e métodos mas não herda os construtores.

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo = super.saldo  + valor;
    }

    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }
}
