package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {

    public static void main(String[] args) {

        Carro c = new Carro();
        Carro c2 = new Carro();

        c.modelo = "Sport";
        c.ano = 2010;
        c.nome = "Celta";

        c2.ano = 2020;
        c2.nome = "Fusca";
        c2.modelo = "Sport";

        System.out.println("Carro 1");
        System.out.println(c.nome);
        System.out.println(c.ano);
        System.out.println(c.modelo);

        System.out.println("Carro 2");
        System.out.println(c2.nome);
        System.out.println(c2.ano);
        System.out.println(c2.modelo);


    }
}
