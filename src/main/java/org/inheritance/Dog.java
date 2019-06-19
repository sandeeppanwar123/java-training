package org.inheritance;

public class Dog extends Animal {

    private String dogName = "Jobmi";

    static
    {
        System.out.println("static block Dog.");
    }
    public Dog() {
        System.out.println("Dog Constructor called");
    }


    public void makeShound()
    {
        System.out.println("A Dog making sound. ");
    }

    public void eat()
    {

            System.out.println("Dog eating ");

    }
    public class Lebra{

        Lebra()
        {
            System.out.println("inner class Lebra started.");
        }

        public void LebraBark()
        {

            System.out.println(dogName + " :Lebra barking");
        }


    }
}
