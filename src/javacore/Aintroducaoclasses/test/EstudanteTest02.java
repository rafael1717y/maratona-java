package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);

        Estudante estudante2 = new Estudante();
        estudante2.nome = "JJJJJ";
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
        System.out.println(estudante2.nome);

    }
}
