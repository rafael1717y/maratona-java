package javacore.Bintroducaometodos.teste;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {

    public static void main(String[] args) {

        //Passagem de variáveis do tipo primitivo sempre uma cópia é enviada.
        //Se tivesse passando a referência mudaria. A variável original não será alterada.

        Calculadora calculadora = new Calculadora();

        int num1 = 1;
        int num2 = 2;

        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro do CalculadoraTest04");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }

}
