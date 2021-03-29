package javacore.herancaepolimorfismo;

//Gerente herda da classe funcionário.

public class Gerente extends Funcionario {

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }

    }

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao de gerente");
        //super indica que o atributo é da classe mãe. this olha só na classe atual.
        //reescrita do método da classe mãe getBonificacao()
        //chama a implementacao padrão da bonificação reaproveitando a implementação padrão.
        return super.getBonificacao() + super.getSalario();
    }
}
