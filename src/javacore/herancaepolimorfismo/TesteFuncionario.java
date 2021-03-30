package javacore.herancaepolimorfismo;

public class TesteFuncionario {

    public static void main(String[] args) {


        Cliente cliente = new Cliente();

        Gerente nico = new Gerente();
        nico.setNome("Nico St");
        nico.setCpf("20200332");
        nico.setSalario(2600.00);

        //nico.salario = 300.00;

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());


    }
}
