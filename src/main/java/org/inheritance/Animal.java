package org.inheritance;

public class Animal {

    static
    {
        System.out.println("static block Animal.");
    }
    public Animal()
    {
        System.out.println("Animal constructor called. ");
    }

    public void makeShound()
    {
        System.out.println("An Animal making sound. ");
    }

}
