package javacore.Bintroducaometodos.teste;

import javacore.Bintroducaometodos.dominio.Calculadora;

import java.sql.SQLOutput;

public class CalculadoraTest03 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20, 0);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros02(20,2));
        System.out.println("---------------------------");
        //System.out.println(calculadora.imprimeDivisaoDeDoisNumeros(86,0)); não compila
        calculadora.imprimeDivisaoDeDoisNumeros(86, 0);
    }
}
