package javacore.Aintroducaoclasses.test;
import javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {

    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome= "José";
        estudante.sexo = 'M';
        estudante.idade = 21;
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
        System.out.println(estudante);
    }
}
