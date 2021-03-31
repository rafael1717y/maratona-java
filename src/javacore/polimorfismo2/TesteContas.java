package javacore.polimorfismo2;

public class TesteContas {

    public static void main(String[] args) {

        //new Conta();
        ContaCorrente cc = new ContaCorrente(111, 123);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200.0);

        cc.transfere(10, cp);

        System.out.println("Saldo da Conta corrente " + cc.getSaldo());
        System.out.println("Saldo da Conta poupança " + cp.getSaldo());
    }
}
