package javacore.metodosestaticos;

public class Cat {
    String name;            // Instance (non-static) variable
    static int catCount;    //  Static variable

    Cat(String name) {
        this.name = name;
        Cat.catCount++;     // A variável estática deve ser acessada usando o nome da classe.
    }                       // Instance methods are called on a object. Métodos estáticos não tem acesso ao objeto.
                            // Instead of an object reference, null is passed to static methods.

public static void main(String[] args) {
    Cat cat1 = new Cat("Oscar");
    Cat cat2 = new Cat("Missy");
    System.out.println(cat1.name);
    System.out.println(cat2.name);

    System.out.println(Cat.catCount);
    Cat cat3 =  new Cat("OO");
    System.out.println(Cat.catCount);
    Cat cat4 = new Cat("xxxx");

    //How non-static methods work:
    //***************************

    //Cat cat = new Cat();
    //String name = cat.getName();
    //cat.setAge(17);
    //cat.setChildren(cat1, cat2, cat3);

    //Cat cat = new Cat();
    //String name = Cat.getName(cat);
    //Cat.setAge(cat, 17);

    //Cat cat1 = new Cat();
    //Cat cat2 = new Cat();
    //int catCount = Cat.getAllCatsCount();

    //Cat cat1 = new Cat();
    //Cat cat2 = new Cat();
    //int catCount = Cat.getAllCatsCount(null);


    }

}





