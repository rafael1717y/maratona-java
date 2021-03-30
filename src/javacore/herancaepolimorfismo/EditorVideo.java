package javacore.herancaepolimorfismo;

public class EditorVideo extends Funcionario {

    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação do editor de vídeo");
        return 200;
    }
}
