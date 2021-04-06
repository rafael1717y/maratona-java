package javacore.arraylist;

import javacore.polimorfismo2.Conta;

public class GuardadorDeContas {

    private Conta[] referencias;
    private int posicaolivre;

    public GuardadorDeContas() {
        this.referencias = new Conta[10];
        this.posicaolivre = 0;
    }

    public void adiciona(Conta ref) {
        this.referencias[this.posicaolivre] = ref;
        this.posicaolivre++;
    }

    public int getQuantidadeDeElementos() {
        return this.posicaolivre;
    }

    public Conta getReferencia(int pos) {
        return this.referencias[pos];
    }
}
