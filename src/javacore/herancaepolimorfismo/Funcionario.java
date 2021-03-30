package javacore.herancaepolimorfismo;

//não se pode instanciar objetos de uma classe abstrata.

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    //método sem corpo, não há implementação aqui...só nos filhos.
    public abstract double getBonificacao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
