package javacore.classesestaticas;

public class StaticsClassExample {

    private static int catCount = 0;

    public static void main(String[] args) throws Exception
    {
        Cat bella = new Cat("Bella");
        Cat tiger = new Cat("Tiger");

        System.out.println("Cat count " + catCount);
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
            StaticsClassExample.catCount++;
        }

    }
}
