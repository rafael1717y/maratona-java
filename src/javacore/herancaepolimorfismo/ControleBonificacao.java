package javacore.herancaepolimorfismo;

public class ControleBonificacao {

    private double soma;


    public void registra(Funcionario f) {
        //colocou um referência do tipo funcionário, mas como todos (editor, gerente...)
        // são funcionários pode ser usada a referência mais genérica.
        double boni = f.getBonificacao(); //não sabemos qual método será chamado. Se o obj é do tipo editor de vídeo chamará o método específico do ev.
        this.soma = this.soma + boni;
    }

    public double getSoma() {
        return soma;
    }



}
