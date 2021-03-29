package javacore.herancaepolimorfismo;

public class TesteReferencias {

    public static void main(String[] args) {

        //Variável do tipo mais genérico (Funcionario)
        Gerente g1 = new Gerente();
        g1.setNome("Marc");
        g1.setSalario(5000.0);

        Funcionario f = new Funcionario();
        f.setSalario(2000.0);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.00);


        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(f);
        controle.registra(ev);
        System.out.println(controle.getSoma());

        //g1.autentica(); nao funciona pq g1 é do tipo Funcionario agora. Referencia é do tipo func só pode chamar métodos desse tipo.
        //Mesmo objeto mas com duas formas de acessá-lo.
    }
}
