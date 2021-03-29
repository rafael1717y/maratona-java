package javacore.herancaepolimorfismo;

public class EditorVideo extends Funcionario{

    @Override
    public double getBonificacao() {
        System.out.println("chamando a bonificação do editor de vídeo");
        return super.getBonificacao() + 100;
    }
}
