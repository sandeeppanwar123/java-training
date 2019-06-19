package org.enums;

public enum Plannet {

    MARS("x"),JUPITER("y"),SATURN("z");





     Plannet(String str)
    {

    }



    public static void main(String[] args) {

        String str = Plannet.MARS.toString();
        System.out.println(str
        );
    }

}



